"""Neo4j client for iFixit KB."""
from __future__ import annotations

from neo4j import AsyncGraphDatabase
from typing import Any
from uuid import UUID
from rich.console import Console

from src.config import settings

console = Console()


class Neo4jClient:
    """Async Neo4j client with KB_ label prefix."""

    def __init__(self):
        self._driver = None
        self.prefix = settings.neo4j_label_prefix

    async def connect(self) -> None:
        """Create driver connection."""
        self._driver = AsyncGraphDatabase.driver(
            settings.neo4j_uri,
            auth=(settings.neo4j_user, settings.neo4j_password),
        )
        # Test connection
        async with self._driver.session() as session:
            await session.run("RETURN 1")
        console.print(f"[green]Connected to Neo4j[/green]")

    async def close(self) -> None:
        """Close driver."""
        if self._driver:
            await self._driver.close()
            console.print("[yellow]Neo4j connection closed[/yellow]")

    async def __aenter__(self):
        await self.connect()
        return self

    async def __aexit__(self, exc_type, exc_val, exc_tb):
        await self.close()

    def label(self, name: str) -> str:
        """Get label with prefix."""
        return f"{self.prefix}{name}"

    # ═══════════════════════════════════════════════════════════
    # SCHEMA SETUP
    # ═══════════════════════════════════════════════════════════

    async def create_constraints(self) -> None:
        """Create constraints and indexes."""
        constraints = [
            f"CREATE CONSTRAINT {self.prefix}category_name IF NOT EXISTS FOR (c:{self.label('Category')}) REQUIRE c.name IS UNIQUE",
            f"CREATE CONSTRAINT {self.prefix}brand_name IF NOT EXISTS FOR (b:{self.label('Brand')}) REQUIRE b.name IS UNIQUE",
            f"CREATE CONSTRAINT {self.prefix}device_id IF NOT EXISTS FOR (d:{self.label('Device')}) REQUIRE d.id IS UNIQUE",
            f"CREATE CONSTRAINT {self.prefix}guide_id IF NOT EXISTS FOR (g:{self.label('Guide')}) REQUIRE g.ifixit_id IS UNIQUE",
            f"CREATE CONSTRAINT {self.prefix}tool_name IF NOT EXISTS FOR (t:{self.label('Tool')}) REQUIRE t.name IS UNIQUE",
        ]

        indexes = [
            f"CREATE INDEX {self.prefix}device_name IF NOT EXISTS FOR (d:{self.label('Device')}) ON (d.name)",
            f"CREATE INDEX {self.prefix}guide_type IF NOT EXISTS FOR (g:{self.label('Guide')}) ON (g.type)",
            f"CREATE INDEX {self.prefix}guide_difficulty IF NOT EXISTS FOR (g:{self.label('Guide')}) ON (g.difficulty_num)",
            f"CREATE INDEX {self.prefix}category_level IF NOT EXISTS FOR (c:{self.label('Category')}) ON (c.level)",
        ]

        async with self._driver.session() as session:
            for query in constraints + indexes:
                try:
                    await session.run(query)
                except Exception as e:
                    if "already exists" not in str(e).lower():
                        console.print(f"[yellow]Warning: {e}[/yellow]")

        console.print(f"[green]Neo4j constraints and indexes created[/green]")

    # ═══════════════════════════════════════════════════════════
    # CATEGORIES
    # ═══════════════════════════════════════════════════════════

    async def upsert_category(
        self,
        name: str,
        level: int = 0,
        parent_name: str | None = None,
    ) -> None:
        """Create or update category node."""
        query = f"""
        MERGE (c:{self.label('Category')} {{name: $name}})
        SET c.level = $level, c.updated_at = datetime()
        """

        async with self._driver.session() as session:
            await session.run(query, name=name, level=level)

            # Create parent relationship
            if parent_name:
                rel_query = f"""
                MATCH (parent:{self.label('Category')} {{name: $parent_name}})
                MATCH (child:{self.label('Category')} {{name: $child_name}})
                MERGE (parent)-[:PARENT_OF]->(child)
                """
                await session.run(rel_query, parent_name=parent_name, child_name=name)

    # ═══════════════════════════════════════════════════════════
    # BRANDS
    # ═══════════════════════════════════════════════════════════

    async def upsert_brand(self, name: str) -> None:
        """Create or update brand node."""
        query = f"""
        MERGE (b:{self.label('Brand')} {{name: $name}})
        SET b.updated_at = datetime()
        """
        async with self._driver.session() as session:
            await session.run(query, name=name)

    # ═══════════════════════════════════════════════════════════
    # DEVICES
    # ═══════════════════════════════════════════════════════════

    async def upsert_device(
        self,
        pg_id: UUID,
        name: str,
        brand_name: str | None = None,
        category_name: str | None = None,
    ) -> None:
        """Create or update device node."""
        query = f"""
        MERGE (d:{self.label('Device')} {{id: $id}})
        SET d.name = $name, d.updated_at = datetime()
        """

        async with self._driver.session() as session:
            await session.run(query, id=str(pg_id), name=name)

            # Link to brand
            if brand_name:
                brand_query = f"""
                MATCH (d:{self.label('Device')} {{id: $device_id}})
                MERGE (b:{self.label('Brand')} {{name: $brand_name}})
                MERGE (b)-[:PRODUCES]->(d)
                """
                await session.run(
                    brand_query, device_id=str(pg_id), brand_name=brand_name
                )

            # Link to category
            if category_name:
                cat_query = f"""
                MATCH (d:{self.label('Device')} {{id: $device_id}})
                MATCH (c:{self.label('Category')} {{name: $category_name}})
                MERGE (d)-[:BELONGS_TO]->(c)
                """
                await session.run(
                    cat_query, device_id=str(pg_id), category_name=category_name
                )

    # ═══════════════════════════════════════════════════════════
    # GUIDES
    # ═══════════════════════════════════════════════════════════

    async def upsert_guide(
        self,
        pg_id: UUID,
        ifixit_id: int,
        title: str,
        guide_type: str | None = None,
        difficulty: str | None = None,
        difficulty_num: int | None = None,
        device_pg_id: UUID | None = None,
        category_name: str | None = None,
    ) -> None:
        """Create or update guide node."""
        query = f"""
        MERGE (g:{self.label('Guide')} {{ifixit_id: $ifixit_id}})
        SET g.id = $id,
            g.title = $title,
            g.type = $type,
            g.difficulty = $difficulty,
            g.difficulty_num = $difficulty_num,
            g.updated_at = datetime()
        """

        async with self._driver.session() as session:
            await session.run(
                query,
                id=str(pg_id),
                ifixit_id=ifixit_id,
                title=title,
                type=guide_type,
                difficulty=difficulty,
                difficulty_num=difficulty_num,
            )

            # Link to device
            if device_pg_id:
                device_query = f"""
                MATCH (g:{self.label('Guide')} {{ifixit_id: $ifixit_id}})
                MATCH (d:{self.label('Device')} {{id: $device_id}})
                MERGE (g)-[:REPAIRS]->(d)
                """
                await session.run(
                    device_query, ifixit_id=ifixit_id, device_id=str(device_pg_id)
                )

            # Link to category
            if category_name:
                cat_query = f"""
                MATCH (g:{self.label('Guide')} {{ifixit_id: $ifixit_id}})
                MATCH (c:{self.label('Category')} {{name: $category_name}})
                MERGE (g)-[:BELONGS_TO]->(c)
                """
                await session.run(cat_query, ifixit_id=ifixit_id, category_name=category_name)

    async def link_guide_tool(
        self, ifixit_id: int, tool_name: str, quantity: int = 1
    ) -> None:
        """Link guide to tool."""
        query = f"""
        MATCH (g:{self.label('Guide')} {{ifixit_id: $ifixit_id}})
        MERGE (t:{self.label('Tool')} {{name: $tool_name}})
        MERGE (g)-[r:REQUIRES_TOOL]->(t)
        SET r.quantity = $quantity
        """
        async with self._driver.session() as session:
            await session.run(query, ifixit_id=ifixit_id, tool_name=tool_name, quantity=quantity)

    async def link_prerequisite(
        self, guide_ifixit_id: int, prereq_ifixit_id: int, order: int = 0
    ) -> None:
        """Link guide to prerequisite guide."""
        query = f"""
        MATCH (g:{self.label('Guide')} {{ifixit_id: $guide_id}})
        MATCH (p:{self.label('Guide')} {{ifixit_id: $prereq_id}})
        MERGE (g)-[r:PREREQUISITE]->(p)
        SET r.order = $order
        """
        async with self._driver.session() as session:
            await session.run(
                query, guide_id=guide_ifixit_id, prereq_id=prereq_ifixit_id, order=order
            )

    # ═══════════════════════════════════════════════════════════
    # STATS
    # ═══════════════════════════════════════════════════════════

    async def get_stats(self) -> dict:
        """Get node counts."""
        labels = ["Category", "Brand", "Device", "Guide", "Tool"]
        stats = {}

        async with self._driver.session() as session:
            for label in labels:
                result = await session.run(
                    f"MATCH (n:{self.label(label)}) RETURN count(n) as count"
                )
                record = await result.single()
                stats[label] = record["count"] if record else 0

        return stats
