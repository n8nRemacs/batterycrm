"""
Extract Avito cookies using Playwright.

This runs a real browser, logs in, and saves cookies.
Use this to get valid sessid and hash_id.
"""

import asyncio
import json
import logging
from pathlib import Path

from playwright.async_api import async_playwright

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

CONFIG_FILE = Path(__file__).parent / "config.json"


async def extract_cookies():
    """
    Open browser, let user login, extract cookies.
    """
    logger.info("Starting browser for Avito login...")

    async with async_playwright() as p:
        # Launch visible browser
        browser = await p.chromium.launch(headless=False)
        context = await browser.new_context(
            user_agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
            locale="ru-RU",
        )
        page = await context.new_page()

        # Go to Avito login
        await page.goto("https://www.avito.ru/profile/settings")

        logger.info("=" * 50)
        logger.info("LOGIN TO AVITO IN THE BROWSER")
        logger.info("When done, press Enter here...")
        logger.info("=" * 50)

        # Wait for user to login
        input("Press Enter after login...")

        # Get cookies
        cookies = await context.cookies()
        logger.info(f"Got {len(cookies)} cookies")

        # Find sessid
        sessid = None
        for cookie in cookies:
            if cookie["name"] == "sessid":
                sessid = cookie["value"]
                logger.info(f"Found sessid: {sessid[:20]}...")
                break

        if not sessid:
            logger.error("sessid not found in cookies!")
            await browser.close()
            return

        # Get user hash_id from page
        hash_id = await page.evaluate("""
            () => {
                // Try to find hash_id in page scripts
                const scripts = document.querySelectorAll('script');
                for (const script of scripts) {
                    const match = script.textContent.match(/"my_hash_id":"([^"]+)"/);
                    if (match) return match[1];
                }
                return null;
            }
        """)

        if not hash_id:
            # Try profile API
            logger.info("hash_id not found in page, trying API...")
            await page.goto("https://m.avito.ru/api/1/profile/short")
            content = await page.content()
            try:
                data = json.loads(await page.evaluate("() => document.body.innerText"))
                hash_id = data.get("public_id")
                logger.info(f"Found hash_id from API: {hash_id}")
            except:
                pass

        await browser.close()

        # Save config
        config = {
            "sessid": sessid,
            "hash_id": hash_id,
            "n8n_webhook": "https://n8n.n8nsrv.ru/webhook/avito/incoming",
            "cookies": cookies,
        }

        with open(CONFIG_FILE, "w") as f:
            json.dump(config, f, indent=2, ensure_ascii=False)

        logger.info(f"Config saved to {CONFIG_FILE}")
        logger.info(f"sessid: {sessid[:30]}...")
        logger.info(f"hash_id: {hash_id}")


if __name__ == "__main__":
    asyncio.run(extract_cookies())
