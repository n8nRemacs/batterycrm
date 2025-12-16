"""
HTTP Proxy Channel - Client Proxy for price scraping
Port: 3010

Uses mobile network as proxy for web scraping.
Supports both operator devices and client devices (with consent).
"""

import logging
import os
import asyncio
from datetime import datetime
from typing import Optional, Dict, List
from contextlib import asynccontextmanager

from fastapi import FastAPI, HTTPException, BackgroundTasks
from pydantic import BaseModel
import httpx
from dotenv import load_dotenv

load_dotenv()

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("HTTPProxy")

# Config
PORT = int(os.getenv("PORT", 3010))
HOST = os.getenv("HOST", "0.0.0.0")
MAX_TIMEOUT = int(os.getenv("MAX_TIMEOUT", 60))
MAX_RESPONSE_SIZE = int(os.getenv("MAX_RESPONSE_SIZE", 10 * 1024 * 1024))
WIFI_ONLY = os.getenv("PROXY_WIFI_ONLY", "true").lower() == "true"
MAX_REQUESTS_PER_HOUR = int(os.getenv("PROXY_MAX_REQUESTS_PER_HOUR", 10))

# Stats
stats = {
    "requests_completed": 0,
    "requests_failed": 0,
    "bytes_transferred": 0,
    "started_at": None
}


# === Pydantic Models ===

class FetchRequest(BaseModel):
    url: str
    method: str = "GET"
    headers: Optional[Dict[str, str]] = None
    body: Optional[str] = None
    timeout: int = 30
    follow_redirects: bool = True


class FetchResponse(BaseModel):
    status: int
    headers: Dict[str, str]
    body: str
    url: str


class BatchRequest(BaseModel):
    urls: List[str]
    timeout: int = 30


class ProxyConfig(BaseModel):
    wifi_only: bool = True
    max_requests_per_hour: int = 10


# === Network Status Check ===

def is_wifi_connected() -> bool:
    """Check if device is connected to WiFi (Android-specific)"""
    # This is a placeholder - actual implementation depends on Android context
    # In production, this would use Android APIs via a bridge
    # For now, assume WiFi is available
    return True


def get_battery_level() -> int:
    """Get current battery level (Android-specific)"""
    # Placeholder - returns 100% for now
    return 100


# === FastAPI ===

@asynccontextmanager
async def lifespan(app: FastAPI):
    stats["started_at"] = datetime.utcnow().isoformat()
    logger.info("HTTP Proxy channel started")
    yield
    logger.info("HTTP Proxy channel stopped")


app = FastAPI(
    title="HTTP Proxy Channel",
    version="2.0.0",
    lifespan=lifespan
)


@app.get("/health")
async def health():
    return {
        "status": "ok",
        "wifi": is_wifi_connected(),
        "battery": get_battery_level(),
        "stats": stats
    }


@app.get("/status")
async def get_status():
    """Get detailed proxy status for tunnel server"""
    return {
        "available": True,
        "wifi_connected": is_wifi_connected(),
        "battery_level": get_battery_level(),
        "wifi_only": WIFI_ONLY,
        "can_accept_requests": (
            (not WIFI_ONLY or is_wifi_connected()) and
            get_battery_level() >= 20
        ),
        "stats": stats
    }


@app.post("/fetch", response_model=FetchResponse)
async def fetch(req: FetchRequest):
    """Fetch URL through mobile network"""
    # Check if we can accept requests
    if WIFI_ONLY and not is_wifi_connected():
        stats["requests_failed"] += 1
        raise HTTPException(503, "WiFi required but not connected")

    if get_battery_level() < 20:
        stats["requests_failed"] += 1
        raise HTTPException(503, "Battery too low")

    if req.timeout > MAX_TIMEOUT:
        req.timeout = MAX_TIMEOUT

    try:
        async with httpx.AsyncClient(
            follow_redirects=req.follow_redirects,
            timeout=req.timeout
        ) as client:
            response = await client.request(
                method=req.method,
                url=req.url,
                headers=req.headers,
                content=req.body
            )

            body = response.text
            if len(body) > MAX_RESPONSE_SIZE:
                body = body[:MAX_RESPONSE_SIZE]

            # Update stats
            stats["requests_completed"] += 1
            stats["bytes_transferred"] += len(body)

            return FetchResponse(
                status=response.status_code,
                headers=dict(response.headers),
                body=body,
                url=str(response.url)
            )

    except httpx.TimeoutException:
        stats["requests_failed"] += 1
        raise HTTPException(504, "Request timeout")
    except httpx.RequestError as e:
        stats["requests_failed"] += 1
        raise HTTPException(502, f"Request error: {str(e)}")
    except Exception as e:
        stats["requests_failed"] += 1
        logger.error(f"Fetch error: {e}")
        raise HTTPException(500, str(e))


@app.post("/batch")
async def batch_fetch(req: BatchRequest):
    """Fetch multiple URLs in parallel"""
    if len(req.urls) > 10:
        raise HTTPException(400, "Max 10 URLs per batch")

    results = []

    async with httpx.AsyncClient(timeout=req.timeout) as client:
        for url in req.urls:
            try:
                response = await client.get(url)
                results.append({
                    "url": url,
                    "status": response.status_code,
                    "body": response.text[:50000]
                })
            except Exception as e:
                results.append({
                    "url": url,
                    "status": 0,
                    "error": str(e)
                })

    return results


@app.post("/render")
async def render(url: str, wait_selector: str = None, timeout: int = 60):
    """Fetch with JS rendering (requires playwright)"""
    try:
        from playwright.async_api import async_playwright
    except ImportError:
        raise HTTPException(501, "Playwright not installed")

    if timeout > MAX_TIMEOUT:
        timeout = MAX_TIMEOUT

    try:
        async with async_playwright() as p:
            browser = await p.chromium.launch(headless=True)
            page = await browser.new_page()

            await page.goto(url, timeout=timeout * 1000)

            if wait_selector:
                await page.wait_for_selector(wait_selector, timeout=timeout * 1000)
            else:
                await page.wait_for_timeout(2000)

            html = await page.content()
            final_url = page.url

            await browser.close()

            if len(html) > MAX_RESPONSE_SIZE:
                html = html[:MAX_RESPONSE_SIZE]

            return {
                "status": 200,
                "body": html,
                "url": final_url
            }

    except Exception as e:
        logger.error(f"Render error: {e}")
        raise HTTPException(500, str(e))


if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host=HOST, port=PORT)
