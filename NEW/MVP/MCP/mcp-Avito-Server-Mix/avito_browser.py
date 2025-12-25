"""
Avito API client with browser TLS fingerprint.

Uses curl_cffi to match Chrome's TLS fingerprint.
QRATOR checks TLS fingerprint - this should bypass it.
"""

import json
import logging
from typing import Optional, Dict, Any, List
from curl_cffi import requests

logger = logging.getLogger(__name__)

# Chrome 120 headers
CHROME_HEADERS = {
    "Accept": "application/json, text/plain, */*",
    "Accept-Language": "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "Cache-Control": "no-cache",
    "Pragma": "no-cache",
    "Sec-Ch-Ua": '"Not_A Brand";v="8", "Chromium";v="120", "Google Chrome";v="120"',
    "Sec-Ch-Ua-Mobile": "?0",
    "Sec-Ch-Ua-Platform": '"Windows"',
    "Sec-Fetch-Dest": "empty",
    "Sec-Fetch-Mode": "cors",
    "Sec-Fetch-Site": "same-origin",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
}


class AvitoBrowserClient:
    """
    Avito API client using curl_cffi for Chrome TLS fingerprint.
    """

    def __init__(self, sessid: str, user_id: Optional[str] = None):
        """
        Args:
            sessid: Session ID from Avito cookies
            user_id: User ID (will be fetched if not provided)
        """
        self.sessid = sessid
        self.user_id = user_id
        self.base_url = "https://m.avito.ru"

        # Create session with Chrome fingerprint
        self.session = requests.Session(impersonate="chrome120")

        # Set cookies
        self.session.cookies.set("sessid", sessid, domain=".avito.ru")

        # Set headers
        self.session.headers.update(CHROME_HEADERS)
        self.session.headers["Referer"] = "https://m.avito.ru/profile"

    async def get_profile(self) -> Dict[str, Any]:
        """Get current user profile."""
        url = f"{self.base_url}/api/1/profile/short"

        response = self.session.get(url)
        response.raise_for_status()

        data = response.json()
        self.user_id = str(data.get("id"))
        logger.info(f"Profile fetched: user_id={self.user_id}")

        return data

    async def get_channels(self, limit: int = 50) -> List[Dict[str, Any]]:
        """Get list of chat channels."""
        url = f"{self.base_url}/web/1/messenger/getChannels"

        payload = {
            "limit": limit,
            "offset": 0
        }

        response = self.session.post(url, json=payload)
        response.raise_for_status()

        data = response.json()
        channels = data.get("result", {}).get("channels", [])
        logger.info(f"Got {len(channels)} channels")

        return channels

    async def get_messages(self, channel_id: str, limit: int = 50) -> List[Dict[str, Any]]:
        """Get messages from a channel."""
        url = f"{self.base_url}/web/1/messenger/getUserVisibleMessages"

        payload = {
            "channelId": channel_id,
            "limit": limit
        }

        response = self.session.post(url, json=payload)
        response.raise_for_status()

        data = response.json()
        messages = data.get("result", {}).get("messages", [])
        logger.info(f"Got {len(messages)} messages from {channel_id}")

        return messages

    async def send_message(self, channel_id: str, text: str) -> Dict[str, Any]:
        """Send a text message."""
        url = f"{self.base_url}/web/1/messenger/postMessage"

        payload = {
            "channelId": channel_id,
            "body": {"text": text},
            "type": "text"
        }

        response = self.session.post(url, json=payload)
        response.raise_for_status()

        return response.json()

    def get_websocket_url(self) -> str:
        """Get WebSocket URL for real-time updates."""
        if not self.user_id:
            raise ValueError("User ID not set. Call get_profile() first.")

        # Get hash_id from user_id
        hash_id = self._get_hash_id()

        return (
            f"wss://socket.avito.ru/"
            f"?use_seq=true&seq=0&id_version=v2"
            f"&my_hash_id={hash_id}"
            f"&app_name=web&app_version=7.456.1"
        )

    def _get_hash_id(self) -> str:
        """Get user hash ID for WebSocket."""
        # This needs to be fetched from profile or computed
        # For now, use profile endpoint
        url = f"{self.base_url}/api/1/profile/short"
        response = self.session.get(url)
        data = response.json()
        return data.get("public_id", "")

    def get_websocket_headers(self) -> Dict[str, str]:
        """Get headers for WebSocket connection."""
        return {
            "Origin": "https://m.avito.ru",
            "User-Agent": CHROME_HEADERS["User-Agent"],
            "Cookie": f"sessid={self.sessid}",
        }


# Test
if __name__ == "__main__":
    import asyncio

    logging.basicConfig(level=logging.INFO)

    # Test with sessid from config
    with open("config.json") as f:
        config = json.load(f)

    sessid = config.get("sessid")
    if not sessid:
        print("No sessid in config.json")
        exit(1)

    client = AvitoBrowserClient(sessid)

    async def test():
        profile = await client.get_profile()
        print(f"Profile: {profile}")

        channels = await client.get_channels()
        print(f"Channels: {len(channels)}")

        if channels:
            messages = await client.get_messages(channels[0]["id"])
            print(f"Messages: {len(messages)}")

    asyncio.run(test())
