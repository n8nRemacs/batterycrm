"""
Proxy Manager - Manages client proxy nodes and request distribution.

Distributes web scraping requests across connected client devices
that have consented to share their internet connection.
"""

import asyncio
import logging
import uuid
from datetime import datetime, timedelta
from typing import Dict, Optional, List
from collections import defaultdict

from app.models import (
    ProxyNode, ProxyNodeType, ProxyNodeStatus,
    ProxyRequest, ProxyFetchRequest, ProxyFetchResponse, ProxyStats,
    TunnelCommand
)
from app.input.websocket_manager import manager as ws_manager

logger = logging.getLogger("ProxyManager")


class ProxyManager:
    """
    Manages proxy nodes (phones) and distributes fetch requests.

    Features:
    - Load balancing across available nodes
    - Respects wifi_only and rate limits
    - Tracks usage for bonus calculation
    - Fallback to operator phones if no client nodes
    """

    def __init__(self):
        # Node registry: node_id -> ProxyNode
        self.nodes: Dict[str, ProxyNode] = {}

        # Pending requests queue
        self.pending_requests: Dict[str, ProxyRequest] = {}

        # Completed requests (for result retrieval)
        self.completed_requests: Dict[str, ProxyRequest] = {}

        # Rate limiting: node_id -> list of request timestamps
        self.request_history: Dict[str, List[datetime]] = defaultdict(list)

        # Request futures for async waiting
        self._request_futures: Dict[str, asyncio.Future] = {}

        # Bonus rate per request (in currency units)
        self.bonus_per_request = 0.10  # e.g., 10 kopeks per request

    def register_node(
        self,
        server_id: str,
        node_type: ProxyNodeType,
        tenant_id: str,
        client_id: Optional[str] = None,
        wifi_only: bool = True,
        max_requests_per_hour: int = 5
    ) -> ProxyNode:
        """Register a new proxy node"""
        node_id = f"{node_type.value}_{server_id}"

        node = ProxyNode(
            node_id=node_id,
            node_type=node_type,
            tenant_id=tenant_id,
            server_id=server_id,
            connected=True,
            connected_at=datetime.utcnow(),
            consent_given=True,
            consent_date=datetime.utcnow(),
            wifi_only=wifi_only,
            max_requests_per_hour=max_requests_per_hour,
            status=ProxyNodeStatus.ONLINE
        )

        self.nodes[node_id] = node
        logger.info(f"Proxy node registered: {node_id} (type={node_type.value})")

        return node

    def unregister_node(self, server_id: str):
        """Unregister node when disconnected"""
        to_remove = [
            nid for nid, node in self.nodes.items()
            if node.server_id == server_id
        ]
        for node_id in to_remove:
            del self.nodes[node_id]
            logger.info(f"Proxy node unregistered: {node_id}")

    def update_node_status(
        self,
        server_id: str,
        is_wifi: bool,
        battery_level: int
    ):
        """Update node status from heartbeat"""
        for node in self.nodes.values():
            if node.server_id == server_id:
                # Disable if wifi_only and not on wifi
                if node.wifi_only and not is_wifi:
                    node.status = ProxyNodeStatus.DISABLED
                elif battery_level < 20:
                    # Don't use low battery devices
                    node.status = ProxyNodeStatus.DISABLED
                elif node.status == ProxyNodeStatus.DISABLED:
                    node.status = ProxyNodeStatus.ONLINE

    def _get_available_nodes(self, tenant_id: str = None) -> List[ProxyNode]:
        """Get nodes available for requests"""
        now = datetime.utcnow()
        available = []

        for node in self.nodes.values():
            # Check tenant filter
            if tenant_id and node.tenant_id != tenant_id:
                continue

            # Check status
            if node.status not in (ProxyNodeStatus.ONLINE,):
                continue

            # Check rate limit
            history = self.request_history[node.node_id]
            hour_ago = now - timedelta(hours=1)
            recent = [t for t in history if t > hour_ago]

            if len(recent) >= node.max_requests_per_hour:
                continue

            available.append(node)

        return available

    def _select_node(self, nodes: List[ProxyNode]) -> Optional[ProxyNode]:
        """Select best node for request using weighted round-robin"""
        if not nodes:
            return None

        # Prefer operator nodes, then clients with less load
        def score(node: ProxyNode) -> tuple:
            type_priority = 0 if node.node_type == ProxyNodeType.OPERATOR else 1
            hour_ago = datetime.utcnow() - timedelta(hours=1)
            recent_count = len([
                t for t in self.request_history[node.node_id]
                if t > hour_ago
            ])
            return (type_priority, recent_count)

        nodes.sort(key=score)
        return nodes[0]

    async def fetch(
        self,
        request: ProxyFetchRequest,
        timeout: float = 60.0
    ) -> ProxyFetchResponse:
        """
        Execute fetch request via available proxy node.

        Args:
            request: Fetch request details
            timeout: Maximum wait time

        Returns:
            ProxyFetchResponse with result or error
        """
        start_time = datetime.utcnow()
        request_id = str(uuid.uuid4())

        # Find available node
        available = self._get_available_nodes(request.tenant_id)
        node = self._select_node(available)

        if not node:
            return ProxyFetchResponse(
                request_id=request_id,
                success=False,
                error="No proxy nodes available"
            )

        # Create proxy request
        proxy_req = ProxyRequest(
            id=request_id,
            tenant_id=request.tenant_id,
            url=request.url,
            method=request.method,
            headers=request.headers,
            body=request.body,
            timeout=request.timeout,
            priority=request.priority,
            assigned_node_id=node.node_id,
            status="assigned"
        )

        self.pending_requests[request_id] = proxy_req

        # Mark node as busy
        node.status = ProxyNodeStatus.BUSY
        node.current_request_id = request_id

        # Record rate limit
        self.request_history[node.node_id].append(datetime.utcnow())

        # Create future for result
        future = asyncio.get_event_loop().create_future()
        self._request_futures[request_id] = future

        try:
            # Send direct proxy_fetch to node (no local service needed)
            command = TunnelCommand(
                id=request_id,
                action="proxy_fetch",
                body={
                    "url": request.url,
                    "method": request.method,
                    "headers": request.headers,
                    "body": request.body,
                    "timeout": request.timeout
                }
            )

            conn = ws_manager.get_connection(node.server_id)
            if not conn:
                raise ConnectionError(f"Node {node.node_id} disconnected")

            await conn.send(command.model_dump())

            # Wait for result
            response = await asyncio.wait_for(future, timeout=timeout)

            # Update stats
            node.requests_completed += 1
            node.last_request_at = datetime.utcnow()
            node.total_bonus_earned += self.bonus_per_request

            proxy_req.status = "completed"
            proxy_req.completed_at = datetime.utcnow()

            processing_time = int((datetime.utcnow() - start_time).total_seconds() * 1000)

            return ProxyFetchResponse(
                request_id=request_id,
                success=True,
                status=response.get("status"),
                headers=response.get("headers"),
                body=response.get("body"),
                url=response.get("url"),
                node_id=node.node_id,
                processing_time_ms=processing_time
            )

        except asyncio.TimeoutError:
            node.requests_failed += 1
            proxy_req.status = "failed"
            proxy_req.error = "Timeout"

            return ProxyFetchResponse(
                request_id=request_id,
                success=False,
                node_id=node.node_id,
                error="Request timeout"
            )

        except Exception as e:
            node.requests_failed += 1
            proxy_req.status = "failed"
            proxy_req.error = str(e)

            logger.error(f"Proxy fetch error: {e}")
            return ProxyFetchResponse(
                request_id=request_id,
                success=False,
                node_id=node.node_id,
                error=str(e)
            )

        finally:
            # Cleanup
            node.status = ProxyNodeStatus.ONLINE
            node.current_request_id = None
            self._request_futures.pop(request_id, None)

            # Move to completed
            if request_id in self.pending_requests:
                self.completed_requests[request_id] = self.pending_requests.pop(request_id)

    def handle_response(self, request_id: str, response: dict):
        """Handle response from proxy node"""
        future = self._request_futures.get(request_id)
        if future and not future.done():
            future.set_result(response)

    def get_stats(self, tenant_id: str = None) -> ProxyStats:
        """Get proxy usage statistics"""
        nodes = list(self.nodes.values())

        if tenant_id:
            nodes = [n for n in nodes if n.tenant_id == tenant_id]

        online = [n for n in nodes if n.status == ProxyNodeStatus.ONLINE]
        clients = [n for n in nodes if n.node_type == ProxyNodeType.CLIENT]
        operators = [n for n in nodes if n.node_type == ProxyNodeType.OPERATOR]

        # Calculate today's requests
        today_start = datetime.utcnow().replace(hour=0, minute=0, second=0)
        requests_today = sum(
            1 for node in nodes
            for t in self.request_history.get(node.node_id, [])
            if t >= today_start
        )

        # Success rate
        total_completed = sum(n.requests_completed for n in nodes)
        total_failed = sum(n.requests_failed for n in nodes)
        total = total_completed + total_failed
        success_rate = total_completed / total if total > 0 else 0.0

        return ProxyStats(
            total_nodes=len(nodes),
            online_nodes=len(online),
            client_nodes=len(clients),
            operator_nodes=len(operators),
            requests_today=requests_today,
            requests_success_rate=success_rate
        )

    def get_node_bonus(self, node_id: str) -> float:
        """Get total bonus earned by node"""
        node = self.nodes.get(node_id)
        return node.total_bonus_earned if node else 0.0

    def get_client_bonuses(self, tenant_id: str) -> Dict[str, float]:
        """Get bonuses for all client nodes in tenant"""
        return {
            node.node_id: node.total_bonus_earned
            for node in self.nodes.values()
            if node.tenant_id == tenant_id and node.node_type == ProxyNodeType.CLIENT
        }


# Global instance
proxy_manager = ProxyManager()
