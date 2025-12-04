"""Categories extractor from iFixit API."""
from __future__ import annotations

import json
from pathlib import Path
from rich.console import Console
from rich.progress import Progress, TaskID

from src.config import settings
from src.parser.api import IFixitClient
from src.parser.models import CategoryInfo
from src.loader.postgres import PostgresClient
from src.loader.neo4j import Neo4jClient

console = Console()


class CategoriesExtractor:
    """Extract and store categories from iFixit."""

    def __init__(
        self,
        api_client: IFixitClient,
        pg_client: PostgresClient,
        neo4j_client: Neo4jClient,
    ):
        self.api = api_client
        self.pg = pg_client
        self.neo4j = neo4j_client
        self.categories: list[CategoryInfo] = []

    async def extract_all(self) -> list[CategoryInfo]:
        """Extract all categories from iFixit API."""
        console.print("[bold blue]Fetching categories tree...[/bold blue]")

        # Get categories tree
        tree = await self.api.get_categories_tree()

        # Save raw data
        if settings.parser_save_raw_json:
            self._save_raw(tree)

        # Parse tree recursively
        self.categories = []
        self._parse_tree(tree, parent_name=None, level=0, ancestors=[])

        console.print(f"[green]Found {len(self.categories)} categories[/green]")
        return self.categories

    def _parse_tree(
        self,
        node: dict,
        parent_name: str | None,
        level: int,
        ancestors: list[str],
    ) -> None:
        """Recursively parse categories tree."""
        for name, data in node.items():
            # Skip special keys
            if name.startswith("_") or not isinstance(data, dict):
                continue

            # Create category info
            category = CategoryInfo(
                name=name,
                title=data.get("display_title", name),
                description=data.get("description"),
                image_url=data.get("image", {}).get("standard") if isinstance(data.get("image"), dict) else None,
                parent_name=parent_name,
                ancestors=ancestors.copy(),
                level=level,
            )

            # Extract children names
            children = []
            for child_name, child_data in data.items():
                if not child_name.startswith("_") and isinstance(child_data, dict):
                    children.append(child_name)
            category.children = children

            self.categories.append(category)

            # Recursively parse children
            self._parse_tree(
                data,
                parent_name=name,
                level=level + 1,
                ancestors=ancestors + [name],
            )

    async def save_to_db(self, progress: Progress | None = None) -> None:
        """Save categories to PostgreSQL and Neo4j."""
        task_id = None
        if progress:
            task_id = progress.add_task(
                "[cyan]Saving categories...", total=len(self.categories)
            )

        # Sort by level to ensure parents are created first
        sorted_cats = sorted(self.categories, key=lambda c: c.level)

        for cat in sorted_cats:
            # Build path
            path = "/".join(cat.ancestors + [cat.name]) if cat.ancestors else cat.name

            # Save to PostgreSQL
            await self.pg.upsert_category(
                name=cat.name,
                title=cat.title,
                description=cat.description,
                image_url=cat.image_url,
                parent_name=cat.parent_name,
                level=cat.level,
                path=path,
            )

            # Save to Neo4j
            await self.neo4j.upsert_category(
                name=cat.name,
                level=cat.level,
                parent_name=cat.parent_name,
            )

            if progress and task_id is not None:
                progress.update(task_id, advance=1)

        console.print(f"[green]Saved {len(self.categories)} categories to DB[/green]")

    def _save_raw(self, data: dict) -> None:
        """Save raw JSON data."""
        settings.ensure_dirs()
        filepath = settings.raw_categories_dir / "categories_tree.json"
        with open(filepath, "w", encoding="utf-8") as f:
            json.dump(data, f, ensure_ascii=False, indent=2)
        console.print(f"[dim]Saved raw data to {filepath}[/dim]")

    def get_top_level_categories(self) -> list[str]:
        """Get names of top-level categories."""
        return [c.name for c in self.categories if c.level == 0]

    def get_category_by_name(self, name: str) -> CategoryInfo | None:
        """Get category by name."""
        for cat in self.categories:
            if cat.name == name:
                return cat
        return None
