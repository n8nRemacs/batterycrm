"""Global configuration for iFixit Parser."""
from __future__ import annotations

from pathlib import Path
from pydantic_settings import BaseSettings
from pydantic import Field


class Settings(BaseSettings):
    """Application settings loaded from environment variables."""

    # Neo4j
    neo4j_uri: str = Field(default="bolt://45.144.177.128:7687")
    neo4j_user: str = Field(default="neo4j")
    neo4j_password: str = Field(default="")
    neo4j_database: str = Field(default="neo4j")
    neo4j_label_prefix: str = Field(default="KB_")

    # PostgreSQL
    postgres_host: str = Field(default="localhost")
    postgres_port: int = Field(default=5432)
    postgres_user: str = Field(default="postgres")
    postgres_password: str = Field(default="")
    postgres_database: str = Field(default="eldoleado")
    postgres_schema: str = Field(default="ifixit_kb")

    # iFixit API
    ifixit_api_url: str = Field(default="https://www.ifixit.com/api/2.0")
    ifixit_rate_limit_seconds: float = Field(default=2.0)
    ifixit_max_retries: int = Field(default=3)
    ifixit_timeout_seconds: int = Field(default=30)

    # Parser
    parser_workers: int = Field(default=3)
    parser_batch_size: int = Field(default=50)
    parser_save_raw_json: bool = Field(default=True)
    parser_download_images: bool = Field(default=False)
    parser_image_sizes: str = Field(default="thumbnail,standard")
    parser_data_dir: Path = Field(default=Path("./data"))
    parser_checkpoint_interval: int = Field(default=100)

    # Telegram
    telegram_bot_token: str = Field(default="")
    telegram_chat_id: str = Field(default="")

    # Logging
    log_level: str = Field(default="INFO")

    class Config:
        env_file = ".env"
        env_file_encoding = "utf-8"
        extra = "ignore"

    @property
    def postgres_dsn(self) -> str:
        """PostgreSQL connection string."""
        return f"postgresql://{self.postgres_user}:{self.postgres_password}@{self.postgres_host}:{self.postgres_port}/{self.postgres_database}"

    @property
    def image_sizes_list(self) -> list[str]:
        """List of image sizes to download."""
        return [s.strip() for s in self.parser_image_sizes.split(",")]

    # Paths
    @property
    def raw_categories_dir(self) -> Path:
        return self.parser_data_dir / "raw" / "categories"

    @property
    def raw_devices_dir(self) -> Path:
        return self.parser_data_dir / "raw" / "devices"

    @property
    def raw_guides_dir(self) -> Path:
        return self.parser_data_dir / "raw" / "guides"

    @property
    def images_dir(self) -> Path:
        return self.parser_data_dir / "images"

    @property
    def checkpoints_dir(self) -> Path:
        return self.parser_data_dir / "checkpoints"

    def ensure_dirs(self) -> None:
        """Create all required directories."""
        dirs = [
            self.raw_categories_dir,
            self.raw_devices_dir,
            self.raw_guides_dir,
            self.images_dir / "ifixit" / "thumb",
            self.images_dir / "ifixit" / "standard",
            self.images_dir / "ifixit" / "large",
            self.images_dir / "own",
            self.parser_data_dir / "processed" / "translated",
            self.parser_data_dir / "processed" / "rewritten",
            self.checkpoints_dir,
        ]
        for d in dirs:
            d.mkdir(parents=True, exist_ok=True)


# Global settings instance
settings = Settings()
