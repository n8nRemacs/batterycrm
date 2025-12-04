"""Rate limiter for iFixit API requests."""

import asyncio
import time
from dataclasses import dataclass, field


@dataclass
class RateLimiter:
    """Token bucket rate limiter for API requests."""

    requests_per_second: float = 0.5  # 1 request per 2 seconds
    _last_request_time: float = field(default=0, init=False)
    _lock: asyncio.Lock = field(default_factory=asyncio.Lock, init=False)

    @property
    def min_interval(self) -> float:
        """Minimum interval between requests in seconds."""
        return 1.0 / self.requests_per_second

    async def acquire(self) -> None:
        """Wait until a request can be made."""
        async with self._lock:
            now = time.monotonic()
            elapsed = now - self._last_request_time
            wait_time = self.min_interval - elapsed

            if wait_time > 0:
                await asyncio.sleep(wait_time)

            self._last_request_time = time.monotonic()

    async def __aenter__(self):
        await self.acquire()
        return self

    async def __aexit__(self, exc_type, exc_val, exc_tb):
        pass
