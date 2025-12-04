"""Devices extractor from iFixit API."""
from __future__ import annotations

import json
import re
from pathlib import Path
from rich.console import Console
from rich.progress import Progress

from src.config import settings
from src.parser.api import IFixitClient
from src.parser.models import DeviceInfo
from src.loader.postgres import PostgresClient
from src.loader.neo4j import Neo4jClient

console = Console()

# Known brands for extraction
KNOWN_BRANDS = [
    "Apple", "Samsung", "Google", "Huawei", "Xiaomi", "OnePlus", "Sony",
    "LG", "Motorola", "Nokia", "HTC", "ASUS", "Lenovo", "Dell", "HP",
    "Acer", "Microsoft", "Razer", "MSI", "Gigabyte", "Intel", "AMD",
    "Nintendo", "PlayStation", "Xbox", "Logitech", "Corsair", "SteelSeries",
    "Bose", "JBL", "Beats", "Sennheiser", "Canon", "Nikon", "GoPro",
    "DJI", "Dyson", "iRobot", "Roomba", "Bosch", "Siemens", "Whirlpool",
    "KitchenAid", "Fitbit", "Garmin", "Oculus", "Meta", "Tesla",
]


class DevicesExtractor:
    """Extract devices from iFixit categories."""

    def __init__(
        self,
        api_client: IFixitClient,
        pg_client: PostgresClient,
        neo4j_client: Neo4jClient,
    ):
        self.api = api_client
        self.pg = pg_client
        self.neo4j = neo4j_client
        self.devices: list[DeviceInfo] = []

    async def extract_for_category(self, category_name: str) -> list[DeviceInfo]:
        """Extract all devices for a category."""
        console.print(f"[blue]Fetching devices for category: {category_name}[/blue]")

        try:
            data = await self.api.get_category(category_name)
        except Exception as e:
            console.print(f"[red]Error fetching category {category_name}: {e}[/red]")
            return []

        # Save raw data
        if settings.parser_save_raw_json:
            self._save_raw(category_name, data)

        # Extract devices from category data
        devices = []

        # Devices can be in 'children' or 'devices' field
        device_list = data.get("children", [])
        if isinstance(device_list, dict):
            device_list = list(device_list.values())

        for item in device_list:
            if not isinstance(item, dict):
                continue

            # Skip if it's a subcategory (has children)
            if item.get("children"):
                continue

            device = self._parse_device(item, category_name)
            if device:
                devices.append(device)

        # Also check 'devices' field
        for item in data.get("devices", []):
            device = self._parse_device(item, category_name)
            if device:
                devices.append(device)

        console.print(f"[green]Found {len(devices)} devices in {category_name}[/green]")
        self.devices.extend(devices)
        return devices

    def _parse_device(self, data: dict, category_name: str) -> DeviceInfo | None:
        """Parse device from API data."""
        name = data.get("title", data.get("display_title", data.get("name")))
        if not name:
            return None

        # Extract brand and model
        brand, model = self._extract_brand_model(name)

        # Get image
        image = data.get("image", {})
        image_url = None
        if isinstance(image, dict):
            image_url = image.get("standard") or image.get("thumbnail")

        return DeviceInfo(
            name=name,
            device_title=data.get("device_title"),
            display_title=data.get("display_title"),
            topic_uid=data.get("topic_uid") or data.get("wikiid"),
            image_url=image_url,
            guide_count=data.get("solutions", 0),
            url=data.get("url"),
            brand=brand,
            model=model,
            category_name=category_name,
        )

    def _extract_brand_model(self, name: str) -> tuple[str | None, str | None]:
        """Extract brand and model from device name."""
        # Try to match known brands
        for brand in KNOWN_BRANDS:
            if name.lower().startswith(brand.lower()):
                model = name[len(brand):].strip()
                return brand, model

        # Try common patterns
        # "Brand Model" pattern
        parts = name.split(" ", 1)
        if len(parts) == 2:
            potential_brand = parts[0]
            # Check if first word could be a brand (capitalized, not a generic word)
            if potential_brand[0].isupper() and len(potential_brand) > 1:
                return potential_brand, parts[1]

        return None, name

    async def save_to_db(
        self,
        devices: list[DeviceInfo] | None = None,
        progress: Progress | None = None,
    ) -> None:
        """Save devices to PostgreSQL and Neo4j."""
        devices = devices or self.devices

        task_id = None
        if progress:
            task_id = progress.add_task(
                "[cyan]Saving devices...", total=len(devices)
            )

        for device in devices:
            # Save to PostgreSQL
            pg_id = await self.pg.upsert_device(
                name=device.name,
                topic_uid=device.topic_uid,
                display_title=device.display_title,
                category_name=device.category_name,
                brand_name=device.brand,
                model_name=device.model,
                image_url=device.image_url,
                source_url=device.url,
                guide_count=device.guide_count,
            )

            # Save to Neo4j
            await self.neo4j.upsert_device(
                pg_id=pg_id,
                name=device.name,
                brand_name=device.brand,
                category_name=device.category_name,
            )

            if progress and task_id is not None:
                progress.update(task_id, advance=1)

        console.print(f"[green]Saved {len(devices)} devices to DB[/green]")

    def _save_raw(self, category_name: str, data: dict) -> None:
        """Save raw category data with devices."""
        settings.ensure_dirs()
        # Sanitize category name for filename
        safe_name = re.sub(r'[<>:"/\\|?*]', "_", category_name)
        filepath = settings.raw_devices_dir / f"{safe_name}.json"
        with open(filepath, "w", encoding="utf-8") as f:
            json.dump(data, f, ensure_ascii=False, indent=2)
