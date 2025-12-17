"""
Operator Connector - WebSocket connections to Android operator apps

Handles push notifications and drafts to operators.
"""

import logging
from typing import Dict, Optional, Set
from datetime import datetime

from fastapi import WebSocket

logger = logging.getLogger("OperatorConnector")


class OperatorConnection:
    """Single operator app connection"""

    def __init__(self, websocket: WebSocket, operator_id: str, tenant_id: str):
        self.websocket = websocket
        self.operator_id = operator_id
        self.tenant_id = tenant_id
        self.connected_at = datetime.utcnow()
        self.device_info: dict = {}

    async def send(self, data: dict) -> bool:
        """Send data to operator app"""
        try:
            await self.websocket.send_json(data)
            return True
        except Exception as e:
            logger.error(f"Send to operator {self.operator_id} failed: {e}")
            return False


class OperatorConnector:
    """
    Manages WebSocket connections from Android operator apps.

    Handles:
    - new_message: push incoming client message
    - show_draft: push normalized draft for approval
    """

    def __init__(self):
        # operator_id -> connection
        self.connections: Dict[str, OperatorConnection] = {}
        # tenant_id -> set of operator_ids
        self.tenant_operators: Dict[str, Set[str]] = {}

    async def connect(
        self,
        websocket: WebSocket,
        operator_id: str,
        tenant_id: str,
        device_info: dict = None
    ) -> OperatorConnection:
        """Accept new operator connection"""
        await websocket.accept()

        # Close existing connection
        if operator_id in self.connections:
            old = self.connections[operator_id]
            try:
                await old.websocket.close(code=1000, reason="New connection")
            except:
                pass

        conn = OperatorConnection(websocket, operator_id, tenant_id)
        conn.device_info = device_info or {}
        self.connections[operator_id] = conn

        # Track by tenant
        if tenant_id not in self.tenant_operators:
            self.tenant_operators[tenant_id] = set()
        self.tenant_operators[tenant_id].add(operator_id)

        logger.info(f"Operator connected: {operator_id} (tenant: {tenant_id})")
        return conn

    async def disconnect(self, operator_id: str):
        """Remove operator connection"""
        if operator_id in self.connections:
            conn = self.connections[operator_id]
            tenant_id = conn.tenant_id

            del self.connections[operator_id]

            if tenant_id in self.tenant_operators:
                self.tenant_operators[tenant_id].discard(operator_id)

            logger.info(f"Operator disconnected: {operator_id}")

    # === Push Methods ===

    async def push_to_operator(self, payload: dict) -> int:
        """
        Push message/draft to operators.

        Determines target operators from payload context.

        Returns: number of operators notified
        """
        action = payload.get("action")
        message = payload.get("message", {})

        # TODO: Determine target operators
        # For now, broadcast to all connected operators
        # In production: use tenant_id, assigned_operator, etc.

        sent = 0
        for conn in self.connections.values():
            if await conn.send(payload):
                sent += 1

        logger.info(f"Pushed {action} to {sent} operators")
        return sent

    async def push_to_tenant(self, tenant_id: str, payload: dict) -> int:
        """Push to all operators of a tenant"""
        operator_ids = self.tenant_operators.get(tenant_id, set())

        sent = 0
        for oid in operator_ids:
            conn = self.connections.get(oid)
            if conn and await conn.send(payload):
                sent += 1

        return sent

    async def push_to_operators(self, operator_ids: list, payload: dict) -> int:
        """Push to specific operators"""
        sent = 0
        for oid in operator_ids:
            conn = self.connections.get(oid)
            if conn and await conn.send(payload):
                sent += 1

        return sent

    # === Query Methods ===

    def get_online_operators(self, tenant_id: str = None) -> list:
        """Get online operator IDs"""
        if tenant_id:
            return list(self.tenant_operators.get(tenant_id, set()))
        return list(self.connections.keys())

    def is_online(self, operator_id: str) -> bool:
        """Check if operator is online"""
        return operator_id in self.connections


# Global instance
operator_connector = OperatorConnector()
