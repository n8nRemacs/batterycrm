"""Guides extractor from iFixit API."""
from __future__ import annotations

import json
from pathlib import Path
from rich.console import Console
from rich.progress import Progress

from src.config import settings
from src.parser.api import IFixitClient
from src.parser.models import GuideInfo, GuideDetail
from src.loader.postgres import PostgresClient
from src.loader.neo4j import Neo4jClient

console = Console()


class GuidesExtractor:
    """Extract guides from iFixit API."""

    def __init__(
        self,
        api_client: IFixitClient,
        pg_client: PostgresClient,
        neo4j_client: Neo4jClient,
    ):
        self.api = api_client
        self.pg = pg_client
        self.neo4j = neo4j_client

    async def get_guides_list(
        self,
        category: str | None = None,
        limit: int = 200,
        offset: int = 0,
    ) -> list[GuideInfo]:
        """Get list of guides (minimal info)."""
        data = await self.api.get_guides_list(
            limit=limit, offset=offset, category=category
        )

        guides = [GuideInfo.from_api(g) for g in data]
        return guides

    async def get_all_guides_for_category(
        self,
        category: str,
        progress: Progress | None = None,
    ) -> list[GuideInfo]:
        """Get all guides for a category with pagination."""
        all_guides = []
        offset = 0
        limit = 200

        task_id = None
        if progress:
            task_id = progress.add_task(
                f"[cyan]Fetching guides list for {category}...", total=None
            )

        while True:
            guides = await self.get_guides_list(
                category=category, limit=limit, offset=offset
            )

            if not guides:
                break

            all_guides.extend(guides)
            offset += limit

            if progress and task_id is not None:
                progress.update(task_id, completed=len(all_guides))

            # If we got less than limit, we're done
            if len(guides) < limit:
                break

        console.print(f"[green]Found {len(all_guides)} guides in {category}[/green]")
        return all_guides

    async def extract_guide_detail(self, guide_id: int) -> GuideDetail | None:
        """Extract full guide details."""
        try:
            data = await self.api.get_guide(guide_id)
        except Exception as e:
            console.print(f"[red]Error fetching guide {guide_id}: {e}[/red]")
            return None

        # Save raw data
        if settings.parser_save_raw_json:
            self._save_raw_guide(guide_id, data)

        return GuideDetail.from_api(data)

    async def extract_and_save_guide(
        self,
        guide_id: int,
        category_name: str | None = None,
    ) -> bool:
        """Extract guide and save to databases."""
        # Check if already exists
        if await self.pg.guide_exists(guide_id):
            return True

        # Fetch guide details
        guide = await self.extract_guide_detail(guide_id)
        if not guide:
            return False

        # Save to PostgreSQL
        pg_id = await self.pg.upsert_guide(
            ifixit_id=guide.guideid,
            title=guide.title,
            guide_type=guide.type,
            difficulty=guide.difficulty,
            device_name=guide.subject,
            category_name=category_name or guide.category,
            introduction=guide.introduction_raw,
            conclusion=guide.conclusion_raw,
            summary=guide.summary,
            time_required=guide.time_required,
            time_min=guide.time_required_min,
            time_max=guide.time_required_max,
            featured=guide.featured,
            source_url=guide.url,
            raw_data=guide.raw_data,
            ifixit_created_at=guide.created_date,
            ifixit_modified_at=guide.modified_date,
        )

        # Save steps
        for i, step in enumerate(guide.steps):
            lines_json = [
                {"text": line.text, "level": line.level, "bullet": line.bullet}
                for line in step.lines
            ]

            await self.pg.upsert_step(
                guide_uuid=pg_id,
                order_num=i + 1,
                ifixit_id=step.stepid,
                title=step.title,
                lines_text=step.text_raw,
                lines_json=lines_json,
                warnings=step.warnings,
                tips=step.tips,
                notes=step.notes,
            )

        # Save tools
        for tool in guide.tools:
            tool_id = await self.pg.upsert_tool(
                name=tool.name,
                url=tool.url,
                thumbnail_url=tool.thumbnail,
            )
            await self.pg.link_guide_tool(pg_id, tool_id)

        # Get device ID for Neo4j
        device_pg_id = None
        if guide.subject:
            device_pg_id = await self.pg.get_device_id_by_name(guide.subject)

        # Save to Neo4j
        await self.neo4j.upsert_guide(
            pg_id=pg_id,
            ifixit_id=guide.guideid,
            title=guide.title,
            guide_type=guide.type,
            difficulty=guide.difficulty,
            difficulty_num=self._difficulty_to_num(guide.difficulty),
            device_pg_id=device_pg_id,
            category_name=category_name or guide.category,
        )

        # Link tools in Neo4j
        for tool in guide.tools:
            await self.neo4j.link_guide_tool(guide.guideid, tool.name)

        return True

    async def extract_guides_for_category(
        self,
        category: str,
        progress: Progress | None = None,
        max_guides: int | None = None,
    ) -> int:
        """Extract all guides for a category."""
        # First get the list
        guides_list = await self.get_all_guides_for_category(category, progress)

        if max_guides:
            guides_list = guides_list[:max_guides]

        task_id = None
        if progress:
            task_id = progress.add_task(
                f"[cyan]Extracting guide details for {category}...",
                total=len(guides_list),
            )

        extracted = 0
        for guide_info in guides_list:
            success = await self.extract_and_save_guide(
                guide_info.guideid, category_name=category
            )
            if success:
                extracted += 1

            if progress and task_id is not None:
                progress.update(task_id, advance=1)

        console.print(
            f"[green]Extracted {extracted}/{len(guides_list)} guides for {category}[/green]"
        )
        return extracted

    def _save_raw_guide(self, guide_id: int, data: dict) -> None:
        """Save raw guide data."""
        settings.ensure_dirs()
        filepath = settings.raw_guides_dir / f"{guide_id}.json"
        with open(filepath, "w", encoding="utf-8") as f:
            json.dump(data, f, ensure_ascii=False, indent=2)

    @staticmethod
    def _difficulty_to_num(difficulty: str | None) -> int | None:
        """Convert difficulty string to number."""
        if not difficulty:
            return None
        mapping = {
            "Easy": 1,
            "Moderate": 2,
            "Difficult": 3,
            "Very difficult": 4,
        }
        return mapping.get(difficulty)
