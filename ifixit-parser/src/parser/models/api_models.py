"""Pydantic models for iFixit API responses."""
from __future__ import annotations

from datetime import datetime
from typing import Any
from pydantic import BaseModel, Field
from uuid import UUID, uuid4


class ImageInfo(BaseModel):
    """Image data from iFixit."""

    id: int | None = None
    guid: str | None = None
    mini: str | None = None
    thumbnail: str | None = None
    standard: str | None = None
    medium: str | None = None
    large: str | None = None
    huge: str | None = None
    original: str | None = None

    @classmethod
    def from_api(cls, data: dict | None) -> "ImageInfo | None":
        if not data:
            return None
        return cls(
            id=data.get("id"),
            guid=data.get("guid"),
            mini=data.get("mini"),
            thumbnail=data.get("thumbnail"),
            standard=data.get("standard"),
            medium=data.get("medium"),
            large=data.get("large"),
            huge=data.get("huge"),
            original=data.get("original"),
        )


class ToolInfo(BaseModel):
    """Tool required for a guide."""

    name: str
    url: str | None = None
    thumbnail: str | None = None
    text: str | None = None  # Additional text like quantity

    @classmethod
    def from_api(cls, data: dict) -> "ToolInfo":
        return cls(
            name=data.get("text", data.get("name", "Unknown")),
            url=data.get("url"),
            thumbnail=data.get("thumbnail"),
            text=data.get("notes"),
        )


class PartInfo(BaseModel):
    """Part required for a guide."""

    name: str
    url: str | None = None
    thumbnail: str | None = None
    text: str | None = None

    @classmethod
    def from_api(cls, data: dict) -> "PartInfo":
        return cls(
            name=data.get("text", data.get("name", "Unknown")),
            url=data.get("url"),
            thumbnail=data.get("thumbnail"),
            text=data.get("notes"),
        )


class StepLine(BaseModel):
    """Single line in a step."""

    text: str
    level: int = 0
    bullet: str = "black"  # black, red, orange, yellow, icon_note, etc.


class StepInfo(BaseModel):
    """Step in a guide."""

    stepid: int
    orderby: int
    title: str = ""
    lines: list[StepLine] = Field(default_factory=list)
    media: dict = Field(default_factory=dict)

    # Extracted text
    text_raw: str = ""
    warnings: list[str] = Field(default_factory=list)
    tips: list[str] = Field(default_factory=list)
    notes: list[str] = Field(default_factory=list)

    @classmethod
    def from_api(cls, data: dict) -> "StepInfo":
        lines = []
        warnings = []
        tips = []
        notes = []
        text_parts = []

        for line in data.get("lines", []):
            text = line.get("text_raw", line.get("text", ""))
            bullet = line.get("bullet", "black")
            level = line.get("level", 0)

            lines.append(StepLine(text=text, level=level, bullet=bullet))
            text_parts.append(text)

            # Classify by bullet type
            if bullet == "icon_caution" or "caution" in bullet.lower():
                warnings.append(text)
            elif bullet == "icon_note":
                notes.append(text)
            elif bullet == "icon_reminder":
                tips.append(text)

        return cls(
            stepid=data.get("stepid", 0),
            orderby=data.get("orderby", 0),
            title=data.get("title", ""),
            lines=lines,
            media=data.get("media", {}),
            text_raw="\n".join(text_parts),
            warnings=warnings,
            tips=tips,
            notes=notes,
        )


class CategoryInfo(BaseModel):
    """Category from iFixit."""

    name: str
    title: str | None = None
    description: str | None = None
    image_url: str | None = None
    locale: str = "en"
    display_title: str | None = None
    wiki_title: str | None = None

    # Hierarchy
    parent_name: str | None = None
    ancestors: list[str] = Field(default_factory=list)
    children: list[str] = Field(default_factory=list)
    level: int = 0

    # Stats
    guide_count: int = 0
    device_count: int = 0

    # For DB
    uuid: UUID = Field(default_factory=uuid4)


class DeviceInfo(BaseModel):
    """Device from iFixit."""

    name: str
    device_title: str | None = None
    display_title: str | None = None
    topic_uid: str | None = None
    image_url: str | None = None
    image: ImageInfo | None = None
    guide_count: int = 0
    url: str | None = None

    # Parsed from name
    brand: str | None = None
    model: str | None = None

    # Category
    category_name: str | None = None
    ancestors: list[str] = Field(default_factory=list)

    # For DB
    uuid: UUID = Field(default_factory=uuid4)

    @classmethod
    def from_api(cls, data: dict, category_name: str | None = None) -> "DeviceInfo":
        name = data.get("title", data.get("name", "Unknown"))
        image = ImageInfo.from_api(data.get("image"))

        return cls(
            name=name,
            device_title=data.get("device_title"),
            display_title=data.get("display_title"),
            topic_uid=data.get("topic_uid"),
            image_url=image.standard if image else None,
            image=image,
            guide_count=data.get("solutions", 0),
            url=data.get("url"),
            category_name=category_name,
        )


class GuideInfo(BaseModel):
    """Guide list item (minimal info)."""

    guideid: int
    title: str
    type: str | None = None
    category: str | None = None
    subject: str | None = None  # Device name
    url: str | None = None
    image_url: str | None = None
    difficulty: str | None = None
    time_required: str | None = None

    @classmethod
    def from_api(cls, data: dict) -> "GuideInfo":
        image = data.get("image")
        return cls(
            guideid=data.get("guideid", 0),
            title=data.get("title", ""),
            type=data.get("type"),
            category=data.get("category"),
            subject=data.get("subject"),
            url=data.get("url"),
            image_url=image.get("standard") if image else None,
            difficulty=data.get("difficulty"),
            time_required=data.get("time_required"),
        )


class GuideDetail(BaseModel):
    """Full guide with all details."""

    guideid: int
    title: str
    type: str | None = None
    category: str | None = None
    subject: str | None = None
    url: str | None = None

    # Content
    introduction_raw: str | None = None
    introduction_rendered: str | None = None
    conclusion_raw: str | None = None
    conclusion_rendered: str | None = None
    summary: str | None = None

    # Difficulty
    difficulty: str | None = None
    time_required: str | None = None
    time_required_min: int | None = None
    time_required_max: int | None = None

    # Flags
    featured: bool = False
    public: bool = True
    patrol_threshold: int | None = None

    # Media
    image: ImageInfo | None = None

    # Steps
    steps: list[StepInfo] = Field(default_factory=list)

    # Tools & Parts
    tools: list[ToolInfo] = Field(default_factory=list)
    parts: list[PartInfo] = Field(default_factory=list)

    # Prerequisites
    prerequisites: list[dict] = Field(default_factory=list)

    # Dates
    created_date: int | None = None  # Unix timestamp
    modified_date: int | None = None
    published_date: int | None = None

    # Locale
    locale: str = "en"

    # Author
    author: dict | None = None

    # For DB
    uuid: UUID = Field(default_factory=uuid4)

    # Raw data for storage
    raw_data: dict | None = None

    @classmethod
    def from_api(cls, data: dict) -> "GuideDetail":
        # Parse steps
        steps = [StepInfo.from_api(s) for s in data.get("steps", [])]

        # Parse tools
        tools = [ToolInfo.from_api(t) for t in data.get("tools", [])]

        # Parse parts
        parts = [PartInfo.from_api(p) for p in data.get("parts", [])]

        # Parse image
        image = ImageInfo.from_api(data.get("image"))

        # Parse time
        time_str = data.get("time_required")
        time_min, time_max = cls._parse_time(time_str)

        # Handle difficulty - API sometimes returns False instead of None
        difficulty = data.get("difficulty")
        if difficulty is False or difficulty is True:
            difficulty = None
        elif difficulty is not None:
            difficulty = str(difficulty)

        return cls(
            guideid=data.get("guideid", 0),
            title=data.get("title", ""),
            type=data.get("type"),
            category=data.get("category"),
            subject=data.get("subject"),
            url=data.get("url"),
            introduction_raw=data.get("introduction_raw"),
            introduction_rendered=data.get("introduction_rendered"),
            conclusion_raw=data.get("conclusion_raw"),
            conclusion_rendered=data.get("conclusion_rendered"),
            summary=data.get("summary"),
            difficulty=difficulty,
            time_required=time_str,
            time_required_min=time_min,
            time_required_max=time_max,
            featured=data.get("featured_document", False),
            public=data.get("public", True),
            patrol_threshold=data.get("patrol_threshold"),
            image=image,
            steps=steps,
            tools=tools,
            parts=parts,
            prerequisites=data.get("prerequisites", []),
            created_date=data.get("created_date"),
            modified_date=data.get("modified_date"),
            published_date=data.get("published_date"),
            locale=data.get("locale", "en"),
            author=data.get("author"),
            raw_data=data,
        )

    @staticmethod
    def _parse_time(time_str: str | None) -> tuple[int | None, int | None]:
        """Parse time string like '15 - 30 minutes' into min/max minutes."""
        if not time_str:
            return None, None

        import re

        # Match patterns like "15 - 30 minutes", "1 hour", "30 minutes"
        time_str = time_str.lower()

        # Hours to minutes
        hours_match = re.search(r"(\d+)\s*hour", time_str)
        if hours_match:
            hours = int(hours_match.group(1))
            return hours * 60, hours * 60

        # Range: "15 - 30 minutes"
        range_match = re.search(r"(\d+)\s*[-–]\s*(\d+)", time_str)
        if range_match:
            return int(range_match.group(1)), int(range_match.group(2))

        # Single value: "30 minutes"
        single_match = re.search(r"(\d+)", time_str)
        if single_match:
            val = int(single_match.group(1))
            return val, val

        return None, None
