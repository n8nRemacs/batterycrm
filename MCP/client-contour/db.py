import asyncpg
from typing import Optional

from . import config


async def get_pool() -> asyncpg.Pool:
    return await asyncpg.create_pool(dsn=config.DATABASE_URL, min_size=1, max_size=5)


async def ping_db(pool: asyncpg.Pool) -> bool:
    try:
        async with pool.acquire() as conn:
            await conn.execute("SELECT 1;")
        return True
    except Exception:
        return False

