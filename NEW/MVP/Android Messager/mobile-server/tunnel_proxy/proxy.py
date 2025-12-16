"""
Tunnel Proxy - Core component
WebSocket client that proxies HTTP requests from server to local services.
"""

import asyncio
import json
import logging
import signal
import sys
from typing import Optional, Dict, Any
from datetime import datetime

import websockets
import httpx

import config

logging.basicConfig(
    level=getattr(logging, config.LOG_LEVEL),
    format='%(asctime)s [%(levelname)s] %(name)s: %(message)s'
)
logger = logging.getLogger("TunnelProxy")


class TunnelProxy:
    """
    WebSocket tunnel client that proxies HTTP requests to local services.
    """

    def __init__(self):
        self.ws: Optional[websockets.WebSocketClientProtocol] = None
        self.http_client: Optional[httpx.AsyncClient] = None
        self.running = False
        self.reconnect_delay = config.RECONNECT_DELAY
        self.connected = False
        self._status_task: Optional[asyncio.Task] = None
        self.stats = {
            "requests_handled": 0,
            "errors": 0,
            "connected_at": None
        }

    async def start(self):
        """Start the tunnel proxy"""
        self.running = True
        self.http_client = httpx.AsyncClient(timeout=config.HTTP_TIMEOUT)

        logger.info(f"Starting Tunnel Proxy (server_id={config.SERVER_ID})")

        while self.running:
            try:
                await self.connect()
            except Exception as e:
                logger.error(f"Connection error: {e}")

            if self.running:
                logger.info(f"Reconnecting in {self.reconnect_delay}s...")
                await asyncio.sleep(self.reconnect_delay)
                # Exponential backoff
                self.reconnect_delay = min(
                    self.reconnect_delay * 2,
                    config.MAX_RECONNECT_DELAY
                )

    async def stop(self):
        """Stop the tunnel proxy"""
        logger.info("Stopping Tunnel Proxy...")
        self.running = False
        self.connected = False

        if self.ws:
            await self.ws.close()

        if self.http_client:
            await self.http_client.aclose()

    async def connect(self):
        """Connect to tunnel server"""
        url = f"{config.TUNNEL_URL}?server_id={config.SERVER_ID}&secret={config.TUNNEL_SECRET}"

        logger.info(f"Connecting to {config.TUNNEL_URL}...")

        async with websockets.connect(
            url,
            ping_interval=30,
            ping_timeout=10,
            close_timeout=5
        ) as ws:
            self.ws = ws
            self.connected = True
            self.reconnect_delay = config.RECONNECT_DELAY  # Reset on success
            self.stats["connected_at"] = datetime.now().isoformat()

            logger.info("Connected to tunnel server")

            # Send hello message
            await self.send_hello()

            # Start status update loop
            self._status_task = asyncio.create_task(self._status_update_loop())

            # Listen for messages
            try:
                async for message in ws:
                    await self.handle_message(message)
            finally:
                # Cancel status task on disconnect
                if self._status_task:
                    self._status_task.cancel()
                    self._status_task = None

    async def send_hello(self):
        """Send hello/registration message with proxy settings"""
        hello = {
            "action": "hello",
            "server_id": config.SERVER_ID,
            "services": list(config.SERVICES.keys()),
            # Proxy settings for auto-registration
            "tenant_id": config.TENANT_ID,
            "node_type": config.NODE_TYPE,
            "wifi_only": config.WIFI_ONLY,
            "max_requests_per_hour": config.MAX_REQUESTS_PER_HOUR,
            "timestamp": datetime.now().isoformat()
        }
        await self.send(hello)
        logger.info(f"Sent hello: tenant={config.TENANT_ID}, type={config.NODE_TYPE}")

    async def handle_message(self, raw: str):
        """Handle incoming message from server"""
        try:
            msg = json.loads(raw)
            action = msg.get("action", "")
            msg_id = msg.get("id", "unknown")

            logger.debug(f"Received: {action} (id={msg_id})")

            if action == "http_request":
                await self.handle_http_request(msg)
            elif action == "proxy_fetch":
                # Direct proxy request (for price scraping via mobile IP)
                await self.handle_proxy_fetch(msg)
            elif action == "ping":
                await self.handle_ping(msg)
            elif action == "status":
                await self.handle_status(msg)
            else:
                await self.send_error(msg_id, f"Unknown action: {action}")

        except json.JSONDecodeError as e:
            logger.error(f"Invalid JSON: {e}")
        except Exception as e:
            logger.error(f"Error handling message: {e}")
            self.stats["errors"] += 1

    async def handle_http_request(self, msg: Dict[str, Any]):
        """
        Handle HTTP request from server.

        Expected format:
        {
            "id": "uuid",
            "action": "http_request",
            "service": "telegram",      # or "localhost:3002"
            "method": "POST",
            "path": "/send",
            "headers": {},
            "body": {}
        }
        """
        msg_id = msg.get("id", "unknown")
        service = msg.get("service", "")
        method = msg.get("method", "GET").upper()
        path = msg.get("path", "/")
        headers = msg.get("headers", {})
        body = msg.get("body")

        # Resolve service URL
        if service in config.SERVICES:
            base_url = config.SERVICES[service]
        elif ":" in service:
            # Direct localhost:port format
            base_url = f"http://{service}"
        else:
            await self.send_error(msg_id, f"Unknown service: {service}")
            return

        url = f"{base_url}{path}"

        try:
            # Prepare request
            request_kwargs = {
                "method": method,
                "url": url,
                "headers": headers,
            }

            if body is not None:
                if isinstance(body, dict):
                    request_kwargs["json"] = body
                else:
                    request_kwargs["content"] = str(body)

            # Execute request
            response = await self.http_client.request(**request_kwargs)

            # Try to parse response as JSON
            try:
                response_body = response.json()
            except:
                response_body = response.text

            # Send response
            await self.send({
                "id": msg_id,
                "status": response.status_code,
                "headers": dict(response.headers),
                "body": response_body
            })

            self.stats["requests_handled"] += 1
            logger.debug(f"Request {msg_id}: {method} {url} -> {response.status_code}")

        except httpx.ConnectError:
            await self.send_error(msg_id, f"Service unavailable: {service}")
            self.stats["errors"] += 1
        except httpx.TimeoutException:
            await self.send_error(msg_id, f"Service timeout: {service}")
            self.stats["errors"] += 1
        except Exception as e:
            await self.send_error(msg_id, str(e))
            self.stats["errors"] += 1
            logger.error(f"HTTP request error: {e}")

    async def handle_proxy_fetch(self, msg: Dict[str, Any]):
        """
        Handle direct proxy fetch request.
        Fetches external URL directly via mobile IP (for price scraping).

        Expected format:
        {
            "id": "uuid",
            "action": "proxy_fetch",
            "url": "https://example.com/price",
            "method": "GET",
            "headers": {},
            "body": null,
            "timeout": 30
        }
        """
        msg_id = msg.get("id", "unknown")
        url = msg.get("url", "")
        method = msg.get("method", "GET").upper()
        headers = msg.get("headers", {})
        body = msg.get("body")
        timeout = msg.get("timeout", 30)

        if not url:
            await self.send_error(msg_id, "Missing URL")
            return

        logger.info(f"Proxy fetch: {method} {url}")

        try:
            request_kwargs = {
                "method": method,
                "url": url,
                "headers": headers,
                "timeout": timeout,
                "follow_redirects": True
            }

            if body is not None:
                if isinstance(body, dict):
                    request_kwargs["json"] = body
                else:
                    request_kwargs["content"] = str(body)

            response = await self.http_client.request(**request_kwargs)

            # Send proxy_response (distinct from http_request response)
            await self.send({
                "id": msg_id,
                "action": "proxy_response",
                "status": response.status_code,
                "headers": dict(response.headers),
                "body": response.text,
                "url": str(response.url)
            })

            self.stats["requests_handled"] += 1
            self.stats["proxy_fetches"] = self.stats.get("proxy_fetches", 0) + 1
            logger.info(f"Proxy fetch {msg_id}: {method} {url} -> {response.status_code}")

        except httpx.TimeoutException:
            await self.send_error(msg_id, "Request timeout")
            self.stats["errors"] += 1
        except httpx.RequestError as e:
            await self.send_error(msg_id, f"Request error: {str(e)}")
            self.stats["errors"] += 1
        except Exception as e:
            await self.send_error(msg_id, str(e))
            self.stats["errors"] += 1
            logger.error(f"Proxy fetch error: {e}")

    async def handle_ping(self, msg: Dict[str, Any]):
        """Handle ping from server"""
        await self.send({
            "id": msg.get("id"),
            "action": "pong",
            "timestamp": datetime.now().isoformat()
        })

    async def handle_status(self, msg: Dict[str, Any]):
        """Handle status request"""
        # Check which services are available
        services_status = {}
        for name, url in config.SERVICES.items():
            try:
                resp = await self.http_client.get(f"{url}/health", timeout=5)
                services_status[name] = {
                    "available": True,
                    "status": resp.status_code
                }
            except:
                services_status[name] = {
                    "available": False
                }

        await self.send({
            "id": msg.get("id"),
            "action": "status_response",
            "server_id": config.SERVER_ID,
            "connected": self.connected,
            "stats": self.stats,
            "services": services_status
        })

    async def send(self, data: Dict[str, Any]):
        """Send message to server"""
        if self.ws and self.connected:
            await self.ws.send(json.dumps(data))

    async def send_error(self, msg_id: str, error: str):
        """Send error response"""
        await self.send({
            "id": msg_id,
            "status": 500,
            "error": error
        })

    async def forward_incoming(self, service: str, data: Dict[str, Any]):
        """
        Forward incoming message from local service to server.
        Called by local services when they receive new messages.
        """
        await self.send({
            "action": "incoming",
            "service": service,
            "data": data,
            "timestamp": datetime.now().isoformat()
        })

    async def _status_update_loop(self):
        """Periodically send proxy_status to server"""
        while self.connected and self.running:
            try:
                await asyncio.sleep(config.STATUS_UPDATE_INTERVAL)
                await self.send_proxy_status()
            except asyncio.CancelledError:
                break
            except Exception as e:
                logger.error(f"Status update error: {e}")

    async def send_proxy_status(self):
        """Send current device status for proxy decisions"""
        is_wifi, battery_level = self._get_device_status()

        await self.send({
            "action": "proxy_status",
            "server_id": config.SERVER_ID,
            "is_wifi": is_wifi,
            "battery_level": battery_level,
            "timestamp": datetime.now().isoformat()
        })
        logger.debug(f"Sent proxy_status: wifi={is_wifi}, battery={battery_level}")

    def _get_device_status(self) -> tuple:
        """
        Get device wifi and battery status.

        On Termux/Android, this can be obtained via:
        - termux-wifi-connectioninfo
        - termux-battery-status

        For now, returns defaults. Override for actual implementation.
        """
        # TODO: Implement actual status detection
        # On Termux:
        #   import subprocess
        #   wifi_info = subprocess.run(['termux-wifi-connectioninfo'], capture_output=True)
        #   battery_info = subprocess.run(['termux-battery-status'], capture_output=True)

        # Default: assume wifi and full battery
        is_wifi = True
        battery_level = 100

        # Try to detect on Linux/Android
        try:
            import subprocess
            # Check if we're on Termux
            result = subprocess.run(
                ['termux-wifi-connectioninfo'],
                capture_output=True,
                text=True,
                timeout=5
            )
            if result.returncode == 0:
                import json
                wifi_data = json.loads(result.stdout)
                is_wifi = wifi_data.get("supplicant_state") == "COMPLETED"
        except:
            pass

        try:
            import subprocess
            result = subprocess.run(
                ['termux-battery-status'],
                capture_output=True,
                text=True,
                timeout=5
            )
            if result.returncode == 0:
                import json
                battery_data = json.loads(result.stdout)
                battery_level = battery_data.get("percentage", 100)
        except:
            pass

        return is_wifi, battery_level


# Global instance
proxy = TunnelProxy()


async def main():
    """Main entry point"""
    loop = asyncio.get_event_loop()

    # Handle shutdown signals
    for sig in (signal.SIGINT, signal.SIGTERM):
        loop.add_signal_handler(sig, lambda: asyncio.create_task(proxy.stop()))

    await proxy.start()


if __name__ == "__main__":
    try:
        asyncio.run(main())
    except KeyboardInterrupt:
        logger.info("Interrupted by user")
        sys.exit(0)
