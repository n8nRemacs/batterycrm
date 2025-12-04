"""iFixit API client with rate limiting and retry logic."""
from __future__ import annotations

import httpx
from typing import Any
from tenacity import retry, stop_after_attempt, wait_exponential, retry_if_exception_type
from rich.console import Console

from src.config import settings
from .rate_limiter import RateLimiter

console = Console()


class IFixitAPIError(Exception):
    """iFixit API error."""

    def __init__(self, message: str, status_code: int | None = None):
        self.message = message
        self.status_code = status_code
        super().__init__(message)


class IFixitClient:
    """Async HTTP client for iFixit API v2.0."""

    def __init__(self):
        self.base_url = settings.ifixit_api_url
        self.rate_limiter = RateLimiter(
            requests_per_second=1.0 / settings.ifixit_rate_limit_seconds
        )
        self._client: httpx.AsyncClient | None = None
        self._request_count = 0

    async def __aenter__(self):
        self._client = httpx.AsyncClient(
            timeout=httpx.Timeout(settings.ifixit_timeout_seconds),
            headers={
                "User-Agent": "Eldoleado-KB-Parser/1.0",
                "Accept": "application/json",
            },
        )
        return self

    async def __aexit__(self, exc_type, exc_val, exc_tb):
        if self._client:
            await self._client.aclose()
            self._client = None

    @retry(
        stop=stop_after_attempt(3),
        wait=wait_exponential(multiplier=1, min=2, max=30),
        retry=retry_if_exception_type((httpx.TimeoutException, httpx.NetworkError)),
    )
    async def _request(self, method: str, endpoint: str, **kwargs) -> Any:
        """Make a rate-limited request to the API."""
        if not self._client:
            raise RuntimeError("Client not initialized. Use async with.")

        async with self.rate_limiter:
            url = f"{self.base_url}{endpoint}"
            self._request_count += 1

            try:
                response = await self._client.request(method, url, **kwargs)

                if response.status_code == 429:
                    console.print("[yellow]Rate limited, waiting...[/yellow]")
                    raise httpx.TimeoutException("Rate limited")

                if response.status_code >= 400:
                    raise IFixitAPIError(
                        f"API error: {response.text}", response.status_code
                    )

                return response.json()

            except httpx.TimeoutException:
                console.print(f"[yellow]Timeout on {endpoint}, retrying...[/yellow]")
                raise
            except httpx.NetworkError as e:
                console.print(f"[red]Network error: {e}[/red]")
                raise

    async def get(self, endpoint: str, **kwargs) -> Any:
        """GET request."""
        return await self._request("GET", endpoint, **kwargs)

    # ═══════════════════════════════════════════════════════════
    # CATEGORIES
    # ═══════════════════════════════════════════════════════════

    async def get_categories_tree(self) -> dict:
        """Get full categories hierarchy."""
        return await self.get("/categories")

    async def get_category(self, category_name: str) -> dict:
        """Get category with devices list."""
        return await self.get(f"/categories/{category_name}")

    async def get_category_wiki(self, category_name: str) -> dict:
        """Get category wiki page."""
        return await self.get(f"/wikis/CATEGORY/{category_name}")

    # ═══════════════════════════════════════════════════════════
    # GUIDES
    # ═══════════════════════════════════════════════════════════

    async def get_guides_list(
        self, limit: int = 200, offset: int = 0, category: str | None = None
    ) -> list[dict]:
        """Get list of guides with pagination."""
        params = {"limit": limit, "offset": offset}
        if category:
            params["category"] = category
        return await self.get("/guides", params=params)

    async def get_guide(self, guide_id: int) -> dict:
        """Get full guide details with all steps."""
        return await self.get(f"/guides/{guide_id}")

    # ═══════════════════════════════════════════════════════════
    # SEARCH
    # ═══════════════════════════════════════════════════════════

    async def search(
        self, query: str, filter_type: str = "guide", limit: int = 100
    ) -> dict:
        """Search iFixit content."""
        return await self.get(
            f"/search/{query}", params={"filter": filter_type, "limit": limit}
        )

    async def suggest(self, query: str) -> list[str]:
        """Get autocomplete suggestions."""
        return await self.get(f"/suggest/{query}")

    # ═══════════════════════════════════════════════════════════
    # STATS
    # ═══════════════════════════════════════════════════════════

    @property
    def request_count(self) -> int:
        """Total number of requests made."""
        return self._request_count
