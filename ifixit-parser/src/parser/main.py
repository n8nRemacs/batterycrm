"""iFixit Parser - Main entry point."""
from __future__ import annotations

import asyncio
import time
import typer
from rich.console import Console
from rich.progress import Progress, SpinnerColumn, TextColumn, BarColumn, TaskProgressColumn
from rich.table import Table

from src.config import settings
from src.parser.api import IFixitClient
from src.parser.extractors import CategoriesExtractor, DevicesExtractor, GuidesExtractor
from src.loader.postgres import PostgresClient, create_schema
from src.loader.neo4j import Neo4jClient
from src.utils.telegram import TelegramNotifier

console = Console()
app = typer.Typer(help="iFixit Knowledge Base Parser for Eldoleado")


async def init_databases(pg: PostgresClient, neo4j: Neo4jClient) -> None:
    """Initialize database schemas."""
    console.print("[bold]Initializing databases...[/bold]")

    # Create PostgreSQL schema
    await create_schema(pg.pool)
    console.print("[green]+ PostgreSQL schema created[/green]")

    # Create Neo4j constraints
    await neo4j.create_constraints()
    console.print("[green]+ Neo4j constraints created[/green]")


async def run_categories(
    api: IFixitClient,
    pg: PostgresClient,
    neo4j: Neo4jClient,
) -> list[str]:
    """Parse all categories."""
    extractor = CategoriesExtractor(api, pg, neo4j)

    with Progress(
        SpinnerColumn(),
        TextColumn("[progress.description]{task.description}"),
        BarColumn(),
        TaskProgressColumn(),
        console=console,
    ) as progress:
        # Extract from API
        await extractor.extract_all()

        # Save to databases
        await extractor.save_to_db(progress)

    return extractor.get_top_level_categories()


async def run_devices(
    api: IFixitClient,
    pg: PostgresClient,
    neo4j: Neo4jClient,
    categories: list[str],
) -> None:
    """Parse devices for specified categories."""
    extractor = DevicesExtractor(api, pg, neo4j)

    with Progress(
        SpinnerColumn(),
        TextColumn("[progress.description]{task.description}"),
        BarColumn(),
        TaskProgressColumn(),
        console=console,
    ) as progress:
        for category in categories:
            devices = await extractor.extract_for_category(category)
            await extractor.save_to_db(devices, progress)


async def run_guides(
    api: IFixitClient,
    pg: PostgresClient,
    neo4j: Neo4jClient,
    category: str,
    max_guides: int | None = None,
) -> int:
    """Parse guides for a category."""
    extractor = GuidesExtractor(api, pg, neo4j)

    with Progress(
        SpinnerColumn(),
        TextColumn("[progress.description]{task.description}"),
        BarColumn(),
        TaskProgressColumn(),
        console=console,
    ) as progress:
        return await extractor.extract_guides_for_category(
            category, progress, max_guides
        )


async def show_stats(pg: PostgresClient, neo4j: Neo4jClient) -> None:
    """Show database statistics."""
    pg_stats = await pg.get_stats()
    neo4j_stats = await neo4j.get_stats()

    table = Table(title="Database Statistics")
    table.add_column("Entity", style="cyan")
    table.add_column("PostgreSQL", style="green")
    table.add_column("Neo4j", style="blue")

    entities = ["categories", "brands", "devices", "guides", "steps", "tools"]
    neo4j_map = {
        "categories": "Category",
        "brands": "Brand",
        "devices": "Device",
        "guides": "Guide",
        "steps": "-",
        "tools": "Tool",
    }

    for entity in entities:
        pg_count = pg_stats.get(entity, 0)
        neo4j_key = neo4j_map.get(entity)
        neo4j_count = neo4j_stats.get(neo4j_key, "-") if neo4j_key != "-" else "-"
        table.add_row(entity.capitalize(), str(pg_count), str(neo4j_count))

    console.print(table)


@app.command()
def parse_categories():
    """Parse all categories from iFixit."""

    async def _run():
        settings.ensure_dirs()

        async with IFixitClient() as api:
            async with PostgresClient() as pg:
                async with Neo4jClient() as neo4j:
                    await init_databases(pg, neo4j)
                    categories = await run_categories(api, pg, neo4j)
                    console.print(f"\n[bold green]Top-level categories:[/bold green]")
                    for cat in categories:
                        console.print(f"  • {cat}")

    asyncio.run(_run())


@app.command()
def parse_devices(
    category: str = typer.Option(None, "--category", "-c", help="Category to parse"),
    all_categories: bool = typer.Option(False, "--all", "-a", help="Parse all categories"),
):
    """Parse devices for categories."""

    async def _run():
        settings.ensure_dirs()

        async with IFixitClient() as api:
            async with PostgresClient() as pg:
                async with Neo4jClient() as neo4j:
                    if all_categories:
                        # Get all top-level categories from DB
                        cats = await pg.get_categories_to_parse()
                        category_names = [c["name"] for c in cats]
                    elif category:
                        category_names = [category]
                    else:
                        console.print("[red]Specify --category or --all[/red]")
                        return

                    await run_devices(api, pg, neo4j, category_names)

    asyncio.run(_run())


@app.command()
def parse_guides(
    category: str = typer.Argument(..., help="Category to parse guides for"),
    max_guides: int = typer.Option(None, "--max", "-m", help="Max guides to parse"),
):
    """Parse guides for a category."""

    async def _run():
        settings.ensure_dirs()

        async with IFixitClient() as api:
            async with PostgresClient() as pg:
                async with Neo4jClient() as neo4j:
                    count = await run_guides(api, pg, neo4j, category, max_guides)
                    console.print(f"\n[bold green]Parsed {count} guides[/bold green]")

    asyncio.run(_run())


@app.command()
def full_parse(
    categories: list[str] = typer.Option(
        None, "--category", "-c", help="Categories to parse (can specify multiple)"
    ),
    all_categories: bool = typer.Option(False, "--all", "-a", help="Parse ALL categories recursively"),
    max_guides: int = typer.Option(None, "--max-guides", "-m", help="Max guides per category"),
    notify: bool = typer.Option(True, "--notify/--no-notify", help="Send Telegram notifications"),
):
    """Full parse: categories -> devices -> guides.

    Use --all to parse ALL categories (will take a long time!).
    Use --category to parse specific top-level categories.
    """

    async def _run():
        settings.ensure_dirs()
        start_time = time.time()
        tg = TelegramNotifier() if notify and settings.telegram_bot_token else None

        try:
            async with IFixitClient() as api:
                async with PostgresClient() as pg:
                    async with Neo4jClient() as neo4j:
                        # Init
                        await init_databases(pg, neo4j)

                        # Categories
                        console.print("\n[bold]=== STEP 1: Categories ===[/bold]")
                        top_cats = await run_categories(api, pg, neo4j)

                        # Determine target categories
                        if all_categories:
                            # Get ALL categories from DB for parsing
                            all_cats_db = await pg.pool.fetch(
                                f"SELECT name FROM {pg.schema}.categories ORDER BY level, name"
                            )
                            target_cats = [r["name"] for r in all_cats_db]
                            console.print(f"\n[bold]Parsing ALL {len(target_cats)} categories![/bold]")
                        elif categories:
                            target_cats = [c for c in categories if c in top_cats]
                        else:
                            # Default to Phone for testing
                            target_cats = ["Phone"] if "Phone" in top_cats else top_cats[:1]

                        console.print(f"\n[bold]Target categories: {len(target_cats)} total[/bold]")
                        if len(target_cats) <= 10:
                            console.print(f"  {target_cats}")

                        # Send start notification
                        if tg:
                            await tg.notify_start(target_cats[:10])  # Show first 10

                        # Devices - parse all target categories
                        console.print("\n[bold]=== STEP 2: Devices ===[/bold]")
                        await run_devices(api, pg, neo4j, target_cats)

                        # Guides - parse all target categories
                        console.print("\n[bold]=== STEP 3: Guides ===[/bold]")
                        total_guides = 0
                        for i, cat in enumerate(target_cats, 1):
                            count = await run_guides(api, pg, neo4j, cat, max_guides)
                            total_guides += count
                            # Notify every 50 categories
                            if tg and i % 50 == 0:
                                await tg.notify_progress(
                                    f"Categories processed",
                                    i,
                                    len(target_cats),
                                    f"Guides: {total_guides}, API: {api.request_count}",
                                )

                        # Stats
                        console.print("\n[bold]=== FINAL STATS ===[/bold]")
                        pg_stats = await pg.get_stats()
                        neo4j_stats = await neo4j.get_stats()
                        await show_stats(pg, neo4j)

                        console.print(f"\n[bold green]+ Parse complete![/bold green]")
                        console.print(f"API requests made: {api.request_count}")

                        # Send completion notification
                        if tg:
                            duration = (time.time() - start_time) / 60
                            await tg.notify_complete(
                                api.request_count,
                                duration,
                                pg_stats,
                            )

        except Exception as e:
            console.print(f"[red]Error: {e}[/red]")
            if tg:
                await tg.notify_error(str(e), "full_parse")
            raise

    asyncio.run(_run())


@app.command()
def smart_parse(
    max_level: int = typer.Option(10, "--max-level", "-l", help="Max depth level to parse"),
    batch_size: int = typer.Option(20, "--batch", "-b", help="Categories per batch"),
    delay: float = typer.Option(3.0, "--delay", "-d", help="Delay between batches (seconds)"),
    notify: bool = typer.Option(True, "--notify/--no-notify", help="Send Telegram notifications"),
):
    """Smart recursive parse - level by level, with pauses.

    Parses categories depth-first, level by level:
    Level 0: Phone, PC, Mac, etc.
    Level 1: iPhone, Samsung, etc.
    Level 2: iPhone 15, Galaxy S24, etc.
    ...

    Includes delays between batches to avoid rate limiting.
    """

    async def _run():
        import asyncio as aio
        settings.ensure_dirs()
        start_time = time.time()
        tg = TelegramNotifier() if notify and settings.telegram_bot_token else None

        try:
            async with IFixitClient() as api:
                async with PostgresClient() as pg:
                    async with Neo4jClient() as neo4j:
                        # Init
                        await init_databases(pg, neo4j)

                        # Step 1: Categories (just once)
                        console.print("\n[bold]=== STEP 1: Categories ===[/bold]")
                        await run_categories(api, pg, neo4j)

                        if tg:
                            await tg.notify_start(["Smart parse started"])

                        total_devices = 0
                        total_guides = 0

                        # Step 2 & 3: Parse level by level
                        for level in range(max_level + 1):
                            # Get categories at this level
                            cats_at_level = await pg.pool.fetch(
                                f"SELECT name FROM {pg.schema}.categories WHERE level = $1 ORDER BY name",
                                level
                            )

                            if not cats_at_level:
                                console.print(f"[dim]No categories at level {level}, stopping[/dim]")
                                break

                            cat_names = [r["name"] for r in cats_at_level]
                            console.print(f"\n[bold]=== LEVEL {level}: {len(cat_names)} categories ===[/bold]")

                            # Process in batches
                            for i in range(0, len(cat_names), batch_size):
                                batch = cat_names[i:i + batch_size]
                                console.print(f"\n[cyan]Batch {i//batch_size + 1}: {len(batch)} categories[/cyan]")

                                # Devices for this batch
                                console.print(f"  Devices...")
                                extractor = DevicesExtractor(api, pg, neo4j)
                                for cat in batch:
                                    devices = await extractor.extract_for_category(cat)
                                    if devices:
                                        await extractor.save_to_db(devices)
                                        total_devices += len(devices)

                                # Guides for this batch
                                console.print(f"  Guides...")
                                for cat in batch:
                                    count = await run_guides(api, pg, neo4j, cat, max_guides=None)
                                    total_guides += count

                                # Progress notification
                                if tg:
                                    await tg.notify_progress(
                                        f"Level {level}",
                                        i + len(batch),
                                        len(cat_names),
                                        f"D:{total_devices} G:{total_guides} API:{api.request_count}",
                                    )

                                # Delay between batches
                                if i + batch_size < len(cat_names):
                                    console.print(f"  [dim]Waiting {delay}s...[/dim]")
                                    await aio.sleep(delay)

                        # Final stats
                        console.print("\n[bold]=== FINAL STATS ===[/bold]")
                        pg_stats = await pg.get_stats()
                        await show_stats(pg, neo4j)

                        console.print(f"\n[bold green]+ Smart parse complete![/bold green]")
                        console.print(f"Total devices: {total_devices}")
                        console.print(f"Total guides: {total_guides}")
                        console.print(f"API requests: {api.request_count}")

                        if tg:
                            duration = (time.time() - start_time) / 60
                            await tg.notify_complete(api.request_count, duration, pg_stats)

        except Exception as e:
            console.print(f"[red]Error: {e}[/red]")
            if tg:
                await tg.notify_error(str(e), "smart_parse")
            raise

    asyncio.run(_run())


@app.command()
def stats():
    """Show database statistics."""

    async def _run():
        async with PostgresClient() as pg:
            async with Neo4jClient() as neo4j:
                await show_stats(pg, neo4j)

    asyncio.run(_run())


@app.command()
def init():
    """Initialize database schemas only."""

    async def _run():
        async with PostgresClient() as pg:
            async with Neo4jClient() as neo4j:
                await init_databases(pg, neo4j)
                console.print("[bold green]+ Databases initialized[/bold green]")

    asyncio.run(_run())


@app.command()
def test_api():
    """Test iFixit API connection."""

    async def _run():
        async with IFixitClient() as api:
            console.print("[bold]Testing iFixit API...[/bold]")

            # Test categories
            tree = await api.get_categories_tree()
            cat_count = len(tree)
            console.print(f"[green]+ Categories: {cat_count} top-level[/green]")

            # Test guide
            guides = await api.get_guides_list(limit=1)
            if guides:
                console.print(f"[green]+ Guides: Can fetch (sample: {guides[0].get('title', 'N/A')})[/green]")

            console.print(f"\n[bold green]API is working! Requests made: {api.request_count}[/bold green]")

    asyncio.run(_run())


if __name__ == "__main__":
    app()
