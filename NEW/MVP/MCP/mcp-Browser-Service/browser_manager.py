"""
Browser Manager - Multi-tenant browser context management.

One browser instance, multiple isolated contexts (one per tenant).
Each tenant has unique fingerprint and isolated storage.
"""

import asyncio
import logging
from pathlib import Path
from typing import Dict, Optional, Any, List
from dataclasses import dataclass, field

from playwright.async_api import async_playwright, Browser, BrowserContext, Page, Playwright

from fingerprint import get_playwright_context_options

logger = logging.getLogger(__name__)

# Data directory for session storage
DATA_DIR = Path("/data/browser-service")


@dataclass
class TenantSession:
    """Session state for one tenant."""
    tenant_id: str
    context: BrowserContext
    pages: Dict[str, Page] = field(default_factory=dict)  # channel -> page
    storage_path: Path = None

    async def get_page(self, channel: str, url: str = None) -> Page:
        """Get or create page for channel."""
        if channel not in self.pages:
            page = await self.context.new_page()
            if url:
                await page.goto(url, wait_until="domcontentloaded")
            self.pages[channel] = page
            logger.info(f"[{self.tenant_id}] Created page for {channel}")
        return self.pages[channel]

    async def close_page(self, channel: str):
        """Close page for channel."""
        if channel in self.pages:
            await self.pages[channel].close()
            del self.pages[channel]
            logger.info(f"[{self.tenant_id}] Closed page for {channel}")

    async def save_storage(self):
        """Save session state to disk."""
        if self.storage_path:
            await self.context.storage_state(path=str(self.storage_path))
            logger.info(f"[{self.tenant_id}] Session saved to {self.storage_path}")

    async def close(self):
        """Close all pages and context."""
        # Save session before closing
        await self.save_storage()

        # Close all pages
        for page in list(self.pages.values()):
            await page.close()
        self.pages.clear()

        # Close context
        await self.context.close()
        logger.info(f"[{self.tenant_id}] Session closed")


class BrowserManager:
    """
    Manages browser contexts for multiple tenants.

    Usage:
        manager = BrowserManager()
        await manager.start()

        # Get session for tenant
        session = await manager.get_session("remaks")

        # Get page for channel
        page = await session.get_page("avito", "https://m.avito.ru")

        # Do something with page
        await page.goto("https://m.avito.ru/profile")
        cookies = await session.context.cookies()

        # Cleanup
        await manager.stop()
    """

    def __init__(self, data_dir: Path = DATA_DIR):
        self.data_dir = Path(data_dir)
        self.data_dir.mkdir(parents=True, exist_ok=True)

        self._playwright: Optional[Playwright] = None
        self._browser: Optional[Browser] = None
        self._sessions: Dict[str, TenantSession] = {}
        self._lock = asyncio.Lock()

    async def start(self):
        """Start browser."""
        logger.info("Starting browser manager...")

        self._playwright = await async_playwright().start()
        self._browser = await self._playwright.chromium.launch(
            headless=True,
            args=[
                "--disable-blink-features=AutomationControlled",
                "--disable-dev-shm-usage",
                "--no-sandbox",
                "--disable-setuid-sandbox",
                "--disable-gpu",
                "--disable-software-rasterizer",
            ]
        )

        logger.info(f"Browser started. Data dir: {self.data_dir}")

    async def stop(self):
        """Stop browser and save all sessions."""
        logger.info("Stopping browser manager...")

        # Close all sessions
        for session in list(self._sessions.values()):
            await session.close()
        self._sessions.clear()

        # Close browser
        if self._browser:
            await self._browser.close()
            self._browser = None

        if self._playwright:
            await self._playwright.stop()
            self._playwright = None

        logger.info("Browser manager stopped")

    def _get_storage_path(self, tenant_id: str) -> Path:
        """Get storage path for tenant."""
        tenant_dir = self.data_dir / tenant_id
        tenant_dir.mkdir(parents=True, exist_ok=True)
        return tenant_dir / "session.json"

    async def get_session(self, tenant_id: str) -> TenantSession:
        """Get or create session for tenant."""
        async with self._lock:
            if tenant_id in self._sessions:
                return self._sessions[tenant_id]

            # Create new session
            storage_path = self._get_storage_path(tenant_id)

            # Get fingerprint options
            options = get_playwright_context_options(tenant_id)

            # Load existing session if available
            if storage_path.exists():
                options["storage_state"] = str(storage_path)
                logger.info(f"[{tenant_id}] Loading existing session")

            # Create context
            context = await self._browser.new_context(**options)

            # Create session
            session = TenantSession(
                tenant_id=tenant_id,
                context=context,
                storage_path=storage_path,
            )

            self._sessions[tenant_id] = session
            logger.info(f"[{tenant_id}] Session created with fingerprint")

            return session

    async def close_session(self, tenant_id: str):
        """Close and remove session for tenant."""
        async with self._lock:
            if tenant_id in self._sessions:
                await self._sessions[tenant_id].close()
                del self._sessions[tenant_id]
                logger.info(f"[{tenant_id}] Session removed")

    def get_active_sessions(self) -> List[str]:
        """Get list of active tenant IDs."""
        return list(self._sessions.keys())

    async def get_stats(self) -> Dict[str, Any]:
        """Get manager statistics."""
        return {
            "browser_running": self._browser is not None,
            "active_sessions": len(self._sessions),
            "tenants": [
                {
                    "tenant_id": tid,
                    "pages": list(session.pages.keys()),
                }
                for tid, session in self._sessions.items()
            ],
        }


# Singleton instance
_manager: Optional[BrowserManager] = None


async def get_manager() -> BrowserManager:
    """Get or create browser manager singleton."""
    global _manager
    if _manager is None:
        _manager = BrowserManager()
        await _manager.start()
    return _manager


# Test
if __name__ == "__main__":
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
    )

    async def test():
        manager = BrowserManager(data_dir=Path("./test_data"))
        await manager.start()

        try:
            # Create session for tenant
            session = await manager.get_session("test_tenant")

            # Open Avito
            page = await session.get_page("avito", "https://m.avito.ru")
            print(f"Page title: {await page.title()}")

            # Check fingerprint
            ua = await page.evaluate("() => navigator.userAgent")
            print(f"User-Agent: {ua[:60]}...")

            # Stats
            stats = await manager.get_stats()
            print(f"Stats: {stats}")

        finally:
            await manager.stop()

    asyncio.run(test())
