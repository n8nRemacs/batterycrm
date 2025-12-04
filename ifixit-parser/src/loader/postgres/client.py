"""PostgreSQL client for iFixit KB."""
from __future__ import annotations

import asyncpg
from typing import Any
from uuid import UUID
from rich.console import Console

from src.config import settings

console = Console()


class PostgresClient:
    """Async PostgreSQL client."""

    def __init__(self):
        self._pool: asyncpg.Pool | None = None
        self.schema = settings.postgres_schema

    async def connect(self) -> None:
        """Create connection pool."""
        self._pool = await asyncpg.create_pool(
            host=settings.postgres_host,
            port=settings.postgres_port,
            user=settings.postgres_user,
            password=settings.postgres_password,
            database=settings.postgres_database,
            min_size=2,
            max_size=10,
        )
        console.print(f"[green]Connected to PostgreSQL[/green]")

    async def close(self) -> None:
        """Close connection pool."""
        if self._pool:
            await self._pool.close()
            console.print("[yellow]PostgreSQL connection closed[/yellow]")

    async def __aenter__(self):
        await self.connect()
        return self

    async def __aexit__(self, exc_type, exc_val, exc_tb):
        await self.close()

    @property
    def pool(self) -> asyncpg.Pool:
        if not self._pool:
            raise RuntimeError("Not connected to PostgreSQL")
        return self._pool

    # ═══════════════════════════════════════════════════════════
    # CATEGORIES
    # ═══════════════════════════════════════════════════════════

    async def upsert_category(
        self,
        name: str,
        title: str | None = None,
        description: str | None = None,
        image_url: str | None = None,
        parent_name: str | None = None,
        level: int = 0,
        path: str | None = None,
    ) -> UUID:
        """Insert or update category."""
        parent_id = None
        if parent_name:
            parent_id = await self.get_category_id(parent_name)

        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"""
                INSERT INTO {self.schema}.categories
                    (name, title, description, image_url, parent_id, level, path)
                VALUES ($1, $2, $3, $4, $5, $6, $7)
                ON CONFLICT (name) DO UPDATE SET
                    title = EXCLUDED.title,
                    description = EXCLUDED.description,
                    image_url = COALESCE(EXCLUDED.image_url, {self.schema}.categories.image_url),
                    parent_id = COALESCE(EXCLUDED.parent_id, {self.schema}.categories.parent_id),
                    level = EXCLUDED.level,
                    path = EXCLUDED.path,
                    updated_at = NOW()
                RETURNING id
                """,
                name,
                title,
                description,
                image_url,
                parent_id,
                level,
                path,
            )
            return row["id"]

    async def get_category_id(self, name: str) -> UUID | None:
        """Get category ID by name."""
        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"SELECT id FROM {self.schema}.categories WHERE name = $1", name
            )
            return row["id"] if row else None

    async def update_category_stats(
        self, name: str, guide_count: int = 0, device_count: int = 0
    ) -> None:
        """Update category statistics."""
        async with self.pool.acquire() as conn:
            await conn.execute(
                f"""
                UPDATE {self.schema}.categories
                SET guide_count = $2, device_count = $3, updated_at = NOW()
                WHERE name = $1
                """,
                name,
                guide_count,
                device_count,
            )

    async def get_categories_to_parse(self) -> list[dict]:
        """Get categories that haven't been parsed for devices."""
        async with self.pool.acquire() as conn:
            rows = await conn.fetch(
                f"""
                SELECT id, name, level, path
                FROM {self.schema}.categories
                WHERE devices_parsed = FALSE
                ORDER BY level ASC, name ASC
                """
            )
            return [dict(r) for r in rows]

    # ═══════════════════════════════════════════════════════════
    # DEVICES
    # ═══════════════════════════════════════════════════════════

    async def upsert_device(
        self,
        name: str,
        topic_uid: str | None = None,
        display_title: str | None = None,
        category_name: str | None = None,
        brand_name: str | None = None,
        model_name: str | None = None,
        image_url: str | None = None,
        source_url: str | None = None,
        guide_count: int = 0,
    ) -> UUID:
        """Insert or update device."""
        category_id = None
        if category_name:
            category_id = await self.get_category_id(category_name)

        brand_id = None
        if brand_name:
            brand_id = await self.upsert_brand(brand_name)

        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"""
                INSERT INTO {self.schema}.devices
                    (name, ifixit_topic_uid, display_title, category_id, brand_id,
                     brand_name, model_name, image_url, source_url, guide_count)
                VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10)
                ON CONFLICT (ifixit_topic_uid) DO UPDATE SET
                    name = EXCLUDED.name,
                    display_title = EXCLUDED.display_title,
                    category_id = COALESCE(EXCLUDED.category_id, {self.schema}.devices.category_id),
                    brand_id = COALESCE(EXCLUDED.brand_id, {self.schema}.devices.brand_id),
                    image_url = COALESCE(EXCLUDED.image_url, {self.schema}.devices.image_url),
                    guide_count = EXCLUDED.guide_count,
                    updated_at = NOW()
                RETURNING id
                """,
                name,
                topic_uid,
                display_title,
                category_id,
                brand_id,
                brand_name,
                model_name,
                image_url,
                source_url,
                guide_count,
            )
            return row["id"]

    async def get_device_id(self, topic_uid: str) -> UUID | None:
        """Get device ID by topic UID."""
        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"SELECT id FROM {self.schema}.devices WHERE ifixit_topic_uid = $1",
                topic_uid,
            )
            return row["id"] if row else None

    async def get_device_id_by_name(self, name: str) -> UUID | None:
        """Get device ID by name."""
        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"SELECT id FROM {self.schema}.devices WHERE name = $1", name
            )
            return row["id"] if row else None

    # ═══════════════════════════════════════════════════════════
    # BRANDS
    # ═══════════════════════════════════════════════════════════

    async def upsert_brand(self, name: str) -> UUID:
        """Insert or update brand."""
        normalized = name.lower().replace(" ", "").replace("-", "")

        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"""
                INSERT INTO {self.schema}.brands (name, name_normalized)
                VALUES ($1, $2)
                ON CONFLICT (name) DO UPDATE SET updated_at = NOW()
                RETURNING id
                """,
                name,
                normalized,
            )
            return row["id"]

    # ═══════════════════════════════════════════════════════════
    # GUIDES
    # ═══════════════════════════════════════════════════════════

    async def upsert_guide(
        self,
        ifixit_id: int,
        title: str,
        guide_type: str | None = None,
        difficulty: str | None = None,
        device_name: str | None = None,
        category_name: str | None = None,
        introduction: str | None = None,
        conclusion: str | None = None,
        summary: str | None = None,
        time_required: str | None = None,
        time_min: int | None = None,
        time_max: int | None = None,
        featured: bool = False,
        source_url: str | None = None,
        raw_data: dict | None = None,
        ifixit_created_at: int | None = None,
        ifixit_modified_at: int | None = None,
    ) -> UUID:
        """Insert or update guide."""
        device_id = None
        if device_name:
            device_id = await self.get_device_id_by_name(device_name)

        category_id = None
        if category_name:
            category_id = await self.get_category_id(category_name)

        # Map difficulty to number
        difficulty_map = {"Easy": 1, "Moderate": 2, "Difficult": 3, "Very difficult": 4}
        difficulty_num = difficulty_map.get(difficulty)

        import json
        from datetime import datetime

        raw_json = json.dumps(raw_data) if raw_data else None

        created_ts = None
        if ifixit_created_at:
            created_ts = datetime.fromtimestamp(ifixit_created_at)

        modified_ts = None
        if ifixit_modified_at:
            modified_ts = datetime.fromtimestamp(ifixit_modified_at)

        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"""
                INSERT INTO {self.schema}.guides
                    (ifixit_id, title, guide_type, difficulty, difficulty_num,
                     device_id, category_id, introduction, conclusion, summary,
                     time_required, time_min, time_max, featured, source_url,
                     raw_data, ifixit_created_at, ifixit_modified_at, parsed_at)
                VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10, $11, $12, $13, $14, $15, $16, $17, $18, NOW())
                ON CONFLICT (ifixit_id) DO UPDATE SET
                    title = EXCLUDED.title,
                    guide_type = EXCLUDED.guide_type,
                    difficulty = EXCLUDED.difficulty,
                    difficulty_num = EXCLUDED.difficulty_num,
                    device_id = COALESCE(EXCLUDED.device_id, {self.schema}.guides.device_id),
                    category_id = COALESCE(EXCLUDED.category_id, {self.schema}.guides.category_id),
                    introduction = EXCLUDED.introduction,
                    conclusion = EXCLUDED.conclusion,
                    summary = EXCLUDED.summary,
                    time_required = EXCLUDED.time_required,
                    time_min = EXCLUDED.time_min,
                    time_max = EXCLUDED.time_max,
                    featured = EXCLUDED.featured,
                    raw_data = EXCLUDED.raw_data,
                    ifixit_modified_at = EXCLUDED.ifixit_modified_at,
                    parsed_at = NOW(),
                    updated_at = NOW()
                RETURNING id
                """,
                ifixit_id,
                title,
                guide_type,
                difficulty,
                difficulty_num,
                device_id,
                category_id,
                introduction,
                conclusion,
                summary,
                time_required,
                time_min,
                time_max,
                featured,
                source_url,
                raw_json,
                created_ts,
                modified_ts,
            )
            return row["id"]

    async def guide_exists(self, ifixit_id: int) -> bool:
        """Check if guide exists."""
        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"SELECT 1 FROM {self.schema}.guides WHERE ifixit_id = $1", ifixit_id
            )
            return row is not None

    async def get_guide_id(self, ifixit_id: int) -> UUID | None:
        """Get guide UUID by iFixit ID."""
        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"SELECT id FROM {self.schema}.guides WHERE ifixit_id = $1", ifixit_id
            )
            return row["id"] if row else None

    # ═══════════════════════════════════════════════════════════
    # STEPS
    # ═══════════════════════════════════════════════════════════

    async def upsert_step(
        self,
        guide_uuid: UUID,
        order_num: int,
        ifixit_id: int | None = None,
        title: str | None = None,
        lines_text: str | None = None,
        lines_json: list | None = None,
        warnings: list[str] | None = None,
        tips: list[str] | None = None,
        notes: list[str] | None = None,
    ) -> UUID:
        """Insert or update step."""
        import json

        lines_data = json.dumps(lines_json) if lines_json else None

        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"""
                INSERT INTO {self.schema}.steps
                    (guide_id, order_num, ifixit_id, title, lines_text, lines, warnings, tips, notes)
                VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9)
                ON CONFLICT (guide_id, order_num) DO UPDATE SET
                    ifixit_id = EXCLUDED.ifixit_id,
                    title = EXCLUDED.title,
                    lines_text = EXCLUDED.lines_text,
                    lines = EXCLUDED.lines,
                    warnings = EXCLUDED.warnings,
                    tips = EXCLUDED.tips,
                    notes = EXCLUDED.notes,
                    updated_at = NOW()
                RETURNING id
                """,
                guide_uuid,
                order_num,
                ifixit_id,
                title,
                lines_text,
                lines_data,
                warnings,
                tips,
                notes,
            )
            return row["id"]

    # ═══════════════════════════════════════════════════════════
    # TOOLS
    # ═══════════════════════════════════════════════════════════

    async def upsert_tool(
        self,
        name: str,
        url: str | None = None,
        thumbnail_url: str | None = None,
    ) -> UUID:
        """Insert or update tool."""
        normalized = name.lower().replace(" ", "").replace("-", "")

        async with self.pool.acquire() as conn:
            row = await conn.fetchrow(
                f"""
                INSERT INTO {self.schema}.tools (name, name_normalized, url, thumbnail_url)
                VALUES ($1, $2, $3, $4)
                ON CONFLICT (name) DO UPDATE SET
                    url = COALESCE(EXCLUDED.url, {self.schema}.tools.url),
                    thumbnail_url = COALESCE(EXCLUDED.thumbnail_url, {self.schema}.tools.thumbnail_url),
                    usage_count = {self.schema}.tools.usage_count + 1,
                    updated_at = NOW()
                RETURNING id
                """,
                name,
                normalized,
                url,
                thumbnail_url,
            )
            return row["id"]

    async def link_guide_tool(
        self, guide_uuid: UUID, tool_uuid: UUID, quantity: int = 1, optional: bool = False
    ) -> None:
        """Link tool to guide."""
        async with self.pool.acquire() as conn:
            await conn.execute(
                f"""
                INSERT INTO {self.schema}.guide_tools (guide_id, tool_id, quantity, optional)
                VALUES ($1, $2, $3, $4)
                ON CONFLICT (guide_id, tool_id) DO NOTHING
                """,
                guide_uuid,
                tool_uuid,
                quantity,
                optional,
            )

    # ═══════════════════════════════════════════════════════════
    # STATS
    # ═══════════════════════════════════════════════════════════

    async def get_stats(self) -> dict:
        """Get database statistics."""
        async with self.pool.acquire() as conn:
            stats = {}
            for table in ["categories", "brands", "devices", "guides", "steps", "tools"]:
                row = await conn.fetchrow(
                    f"SELECT COUNT(*) as count FROM {self.schema}.{table}"
                )
                stats[table] = row["count"]
            return stats
