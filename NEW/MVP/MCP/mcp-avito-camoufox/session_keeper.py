"""
Session Keeper - Automatic session maintenance.

Features:
- Periodic health checks (every 5 minutes)
- Auto-reconnect WebSocket on disconnect
- Cookie refresh before expiration
- Push notification to Android when re-auth needed
- Session state persistence

Flow:
1. Session created → start health monitor
2. Every 5 min → check if session alive (API call)
3. If session dead → notify Android for re-auth
4. WebSocket disconnect → auto-reconnect with backoff
5. Before cookie expire → try silent refresh
"""

import asyncio
import json
import logging
from datetime import datetime, timedelta
from typing import Dict, Any, Optional, Callable
from dataclasses import dataclass, field
from enum import Enum

import httpx

logger = logging.getLogger(__name__)


class SessionStatus(Enum):
    """Session health status."""
    HEALTHY = "healthy"
    DEGRADED = "degraded"       # WebSocket down but API works
    AUTH_REQUIRED = "auth_required"  # Need re-login
    ERROR = "error"


@dataclass
class SessionHealth:
    """Health state of a session."""
    account_id: str
    status: SessionStatus = SessionStatus.HEALTHY
    last_check: Optional[datetime] = None
    last_api_success: Optional[datetime] = None
    last_ws_message: Optional[datetime] = None
    consecutive_failures: int = 0
    auth_attempts: int = 0
    message: str = ""


class SessionKeeper:
    """
    Keeps sessions alive automatically.

    Monitors:
    - API health (can we call /profile?)
    - WebSocket health (receiving messages?)
    - Cookie freshness (when will they expire?)

    Actions:
    - Reconnect WebSocket on disconnect
    - Notify Android when re-auth needed
    - Log warnings for degraded state
    """

    # Configuration
    HEALTH_CHECK_INTERVAL = 300  # 5 minutes
    API_TIMEOUT = 30  # seconds
    MAX_CONSECUTIVE_FAILURES = 3
    WS_INACTIVE_THRESHOLD = 600  # 10 minutes without WS message = warning
    ANDROID_WEBHOOK_URL = "https://n8n.n8nsrv.ru/webhook/avito-camoufox/session-alert"

    def __init__(self):
        self._health: Dict[str, SessionHealth] = {}
        self._tasks: Dict[str, asyncio.Task] = {}
        self._running = False
        self._on_auth_required: Optional[Callable] = None

    def set_auth_callback(self, callback: Callable[[str, str], None]):
        """Set callback when auth is required. Args: (account_id, reason)"""
        self._on_auth_required = callback

    async def start_monitoring(self, account_id: str, channel: Any):
        """Start monitoring a session."""
        if account_id in self._tasks:
            return

        self._health[account_id] = SessionHealth(account_id=account_id)
        self._running = True

        task = asyncio.create_task(self._monitor_loop(account_id, channel))
        self._tasks[account_id] = task

        logger.info(f"[{account_id}] Session monitoring started")

    async def stop_monitoring(self, account_id: str):
        """Stop monitoring a session."""
        if account_id in self._tasks:
            self._tasks[account_id].cancel()
            try:
                await self._tasks[account_id]
            except asyncio.CancelledError:
                pass
            del self._tasks[account_id]

        if account_id in self._health:
            del self._health[account_id]

        logger.info(f"[{account_id}] Session monitoring stopped")

    async def stop_all(self):
        """Stop all monitoring."""
        self._running = False
        for account_id in list(self._tasks.keys()):
            await self.stop_monitoring(account_id)

    def get_health(self, account_id: str) -> Optional[Dict[str, Any]]:
        """Get health status for account."""
        if account_id not in self._health:
            return None

        h = self._health[account_id]
        return {
            "account_id": h.account_id,
            "status": h.status.value,
            "last_check": h.last_check.isoformat() if h.last_check else None,
            "last_api_success": h.last_api_success.isoformat() if h.last_api_success else None,
            "last_ws_message": h.last_ws_message.isoformat() if h.last_ws_message else None,
            "consecutive_failures": h.consecutive_failures,
            "message": h.message,
        }

    def get_all_health(self) -> Dict[str, Dict[str, Any]]:
        """Get health status for all accounts."""
        return {
            account_id: self.get_health(account_id)
            for account_id in self._health
        }

    def record_ws_message(self, account_id: str):
        """Record that we received a WebSocket message."""
        if account_id in self._health:
            self._health[account_id].last_ws_message = datetime.now()

    def record_api_success(self, account_id: str):
        """Record successful API call."""
        if account_id in self._health:
            h = self._health[account_id]
            h.last_api_success = datetime.now()
            h.consecutive_failures = 0
            if h.status == SessionStatus.DEGRADED:
                h.status = SessionStatus.HEALTHY

    async def _monitor_loop(self, account_id: str, channel: Any):
        """Main monitoring loop."""
        while self._running and account_id in self._health:
            try:
                await self._check_health(account_id, channel)
            except asyncio.CancelledError:
                break
            except Exception as e:
                logger.error(f"[{account_id}] Health check error: {e}")

            await asyncio.sleep(self.HEALTH_CHECK_INTERVAL)

    async def _check_health(self, account_id: str, channel: Any):
        """Perform health check."""
        health = self._health[account_id]
        health.last_check = datetime.now()

        # 1. Check API (can we call profile?)
        api_ok = await self._check_api(account_id, channel)

        if not api_ok:
            health.consecutive_failures += 1
            logger.warning(f"[{account_id}] API check failed ({health.consecutive_failures}/{self.MAX_CONSECUTIVE_FAILURES})")

            if health.consecutive_failures >= self.MAX_CONSECUTIVE_FAILURES:
                health.status = SessionStatus.AUTH_REQUIRED
                health.message = "Session expired. Re-authentication required."
                await self._notify_auth_required(account_id, "API unreachable after 3 attempts")
                return
        else:
            health.consecutive_failures = 0
            health.last_api_success = datetime.now()

        # 2. Check WebSocket
        ws_status = await channel.get_ws_status()
        ws_connected = ws_status.get("connected", False)

        if not ws_connected:
            health.status = SessionStatus.DEGRADED
            health.message = "WebSocket disconnected. Attempting reconnect..."
            logger.warning(f"[{account_id}] WebSocket not connected, triggering reconnect")

            # Trigger reconnect (if not already listening)
            if not channel._listening:
                asyncio.create_task(channel.start_listening())
        else:
            # Check if we're receiving messages
            if health.last_ws_message:
                time_since_msg = (datetime.now() - health.last_ws_message).total_seconds()
                if time_since_msg > self.WS_INACTIVE_THRESHOLD:
                    health.status = SessionStatus.DEGRADED
                    health.message = f"No WebSocket messages for {int(time_since_msg)}s"
                    logger.warning(f"[{account_id}] {health.message}")
                else:
                    health.status = SessionStatus.HEALTHY
                    health.message = "OK"
            else:
                health.status = SessionStatus.HEALTHY
                health.message = "OK (no messages yet)"

        logger.debug(f"[{account_id}] Health: {health.status.value} - {health.message}")

    async def _check_api(self, account_id: str, channel: Any) -> bool:
        """Check if API is accessible."""
        try:
            profile = await asyncio.wait_for(
                channel.get_profile(),
                timeout=self.API_TIMEOUT
            )
            return profile is not None and not profile.get("error")
        except asyncio.TimeoutError:
            logger.warning(f"[{account_id}] API timeout")
            return False
        except Exception as e:
            logger.warning(f"[{account_id}] API error: {e}")
            return False

    async def _notify_auth_required(self, account_id: str, reason: str):
        """Notify that re-authentication is required."""
        logger.warning(f"[{account_id}] AUTH REQUIRED: {reason}")

        # Callback
        if self._on_auth_required:
            try:
                self._on_auth_required(account_id, reason)
            except Exception as e:
                logger.error(f"Auth callback error: {e}")

        # Push to Android via webhook
        await self._push_to_android(account_id, "auth_required", reason)

    async def _push_to_android(self, account_id: str, event_type: str, message: str):
        """Send push notification to Android via webhook."""
        try:
            payload = {
                "event": event_type,
                "account_id": account_id,
                "message": message,
                "timestamp": datetime.now().isoformat(),
            }

            async with httpx.AsyncClient() as client:
                response = await client.post(
                    self.ANDROID_WEBHOOK_URL,
                    json=payload,
                    timeout=10
                )
                logger.info(f"[{account_id}] Push to Android: {response.status_code}")

        except Exception as e:
            logger.error(f"[{account_id}] Failed to push to Android: {e}")


class CookieRefresher:
    """
    Refreshes cookies before they expire.

    Strategy:
    - Extract cookie expiration from browser
    - Refresh 1 hour before expiration
    - If refresh fails → notify for re-auth
    """

    REFRESH_BEFORE_EXPIRE = 3600  # 1 hour before expiration

    @staticmethod
    async def get_cookie_expiry(page: Any) -> Optional[datetime]:
        """Get earliest cookie expiration time."""
        try:
            cookies = await page.context.cookies()
            expires = []
            for cookie in cookies:
                if cookie["name"] in ("ft", "f", "sessid"):
                    if "expires" in cookie and cookie["expires"] > 0:
                        expires.append(datetime.fromtimestamp(cookie["expires"]))

            if expires:
                return min(expires)
        except Exception as e:
            logger.warning(f"Failed to get cookie expiry: {e}")

        return None

    @staticmethod
    async def needs_refresh(page: Any) -> bool:
        """Check if cookies need refresh."""
        expiry = await CookieRefresher.get_cookie_expiry(page)
        if not expiry:
            return False

        time_until_expire = (expiry - datetime.now()).total_seconds()
        return time_until_expire < CookieRefresher.REFRESH_BEFORE_EXPIRE

    @staticmethod
    async def try_silent_refresh(page: Any) -> bool:
        """Try to refresh session without re-login."""
        try:
            # Navigate to profile to refresh cookies
            await page.goto("https://m.avito.ru/profile", wait_until="domcontentloaded")
            await asyncio.sleep(2)

            # Check if still logged in
            cookies = await page.context.cookies()
            for cookie in cookies:
                if cookie["name"] in ("ft", "f", "sessid") and cookie["value"]:
                    logger.info("Silent cookie refresh successful")
                    return True

            return False

        except Exception as e:
            logger.warning(f"Silent refresh failed: {e}")
            return False


# Singleton instance
session_keeper = SessionKeeper()
