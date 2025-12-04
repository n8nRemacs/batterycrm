"""Telegram notifications for iFixit Parser."""
from __future__ import annotations

import httpx
from typing import Optional
from src.config import settings


class TelegramNotifier:
    """Send notifications to Telegram."""

    def __init__(self, bot_token: str = None, chat_id: str = None):
        self.bot_token = bot_token or settings.telegram_bot_token
        self.chat_id = chat_id or settings.telegram_chat_id
        self.base_url = f"https://api.telegram.org/bot{self.bot_token}"

    async def send_message(self, text: str, parse_mode: str = "HTML") -> bool:
        """Send a message to Telegram."""
        if not self.bot_token or not self.chat_id:
            return False

        try:
            async with httpx.AsyncClient() as client:
                response = await client.post(
                    f"{self.base_url}/sendMessage",
                    json={
                        "chat_id": self.chat_id,
                        "text": text,
                        "parse_mode": parse_mode,
                    },
                    timeout=10,
                )
                return response.status_code == 200
        except Exception as e:
            print(f"Telegram error: {e}")
            return False

    async def notify_start(self, categories: list[str]) -> bool:
        """Notify about parsing start."""
        text = (
            "<b>iFixit Parser Started</b>\n\n"
            f"Categories: {', '.join(categories)}\n"
            f"Rate limit: {settings.ifixit_rate_limit_seconds}s"
        )
        return await self.send_message(text)

    async def notify_progress(
        self,
        stage: str,
        current: int,
        total: int,
        details: str = "",
    ) -> bool:
        """Notify about progress."""
        percent = (current / total * 100) if total > 0 else 0
        bar_filled = int(percent / 10)
        bar = "█" * bar_filled + "░" * (10 - bar_filled)

        text = (
            f"<b>{stage}</b>\n"
            f"[{bar}] {percent:.1f}%\n"
            f"{current}/{total}"
        )
        if details:
            text += f"\n{details}"
        return await self.send_message(text)

    async def notify_stats(self, pg_stats: dict, neo4j_stats: dict) -> bool:
        """Notify with database statistics."""
        text = (
            "<b>iFixit Parser - Statistics</b>\n\n"
            "<b>PostgreSQL:</b>\n"
        )
        for key, value in pg_stats.items():
            text += f"  {key}: {value}\n"

        text += "\n<b>Neo4j:</b>\n"
        for key, value in neo4j_stats.items():
            text += f"  {key}: {value}\n"

        return await self.send_message(text)

    async def notify_complete(
        self,
        api_requests: int,
        duration_minutes: float,
        stats: Optional[dict] = None,
    ) -> bool:
        """Notify about completion."""
        text = (
            "<b>iFixit Parser Complete!</b>\n\n"
            f"API requests: {api_requests}\n"
            f"Duration: {duration_minutes:.1f} min"
        )
        if stats:
            text += "\n\n<b>Final counts:</b>\n"
            for key, value in stats.items():
                text += f"  {key}: {value}\n"
        return await self.send_message(text)

    async def notify_error(self, error: str, stage: str = "") -> bool:
        """Notify about an error."""
        text = f"<b>iFixit Parser Error</b>\n\n"
        if stage:
            text += f"Stage: {stage}\n"
        text += f"Error: {error}"
        return await self.send_message(text)


# Global instance
notifier: Optional[TelegramNotifier] = None


def get_notifier() -> Optional[TelegramNotifier]:
    """Get or create the global notifier instance."""
    global notifier
    if notifier is None and settings.telegram_bot_token:
        notifier = TelegramNotifier()
    return notifier
