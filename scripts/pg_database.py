"""
PostgreSQL операции для записи нормализованных данных GreenSpark
Таблицы: elo_prices, elo_prices_history, elo_price_noname
"""

import psycopg2
from psycopg2.extras import execute_values
from datetime import datetime
from typing import Optional

# Подключение к PostgreSQL (через SSH tunnel или напрямую)
POSTGRES_DSN = "postgresql://supabase_admin:your-super-secret-and-long-postgres-password@185.221.214.83:6544/postgres"

# Константы
SHOP_NAME = 'GreenSpark'
REGION_CODE = 30
REGION_NAME = 'Астрахань'


def get_connection():
    """Получить соединение с PostgreSQL"""
    return psycopg2.connect(POSTGRES_DSN)


def upsert_to_elo_prices(conn, data: dict) -> int:
    """
    UPSERT товар в elo_prices.

    Args:
        conn: psycopg2 connection
        data: dict с полями:
            - external_id (greenspark_id)
            - name, url
            - part_type, part_type_ru, brand, models, device_type
            - quality, manufacturer, color, with_frame
            - price, price_wholesale
            - quantity, quantity_code, is_available
            - parsed_at

    Returns:
        id записи
    """
    sql = """
        INSERT INTO elo_prices (
            external_id, article, name, url,
            part_type, part_type_ru, brand, models, device_type,
            quality, manufacturer, color,
            price, price_wholesale,
            quantity, quantity_code, is_available,
            shop, region_code, region_name,
            parsed_at, updated_at
        ) VALUES (
            %(external_id)s, %(article)s, %(name)s, %(url)s,
            %(part_type)s, %(part_type_ru)s, %(brand)s, %(models)s, %(device_type)s,
            %(quality)s, %(manufacturer)s, %(color)s,
            %(price)s, %(price_wholesale)s,
            %(quantity)s, %(quantity_code)s, %(is_available)s,
            %(shop)s, %(region_code)s, %(region_name)s,
            %(parsed_at)s, NOW()
        )
        ON CONFLICT (shop, external_id) WHERE external_id IS NOT NULL
        DO UPDATE SET
            name = EXCLUDED.name,
            url = EXCLUDED.url,
            part_type = EXCLUDED.part_type,
            part_type_ru = EXCLUDED.part_type_ru,
            brand = EXCLUDED.brand,
            models = EXCLUDED.models,
            device_type = EXCLUDED.device_type,
            quality = EXCLUDED.quality,
            manufacturer = EXCLUDED.manufacturer,
            color = EXCLUDED.color,
            price = EXCLUDED.price,
            price_wholesale = EXCLUDED.price_wholesale,
            quantity = EXCLUDED.quantity,
            quantity_code = EXCLUDED.quantity_code,
            is_available = EXCLUDED.is_available,
            parsed_at = EXCLUDED.parsed_at,
            updated_at = NOW()
        RETURNING id
    """

    # Подготавливаем данные
    params = {
        'external_id': data.get('external_id'),
        'article': data.get('article', str(data.get('external_id', ''))),
        'name': data['name'],
        'url': data.get('url'),
        'part_type': data.get('part_type'),
        'part_type_ru': data.get('part_type_ru'),
        'brand': data.get('brand'),
        'models': data.get('models', []),  # PostgreSQL array
        'device_type': data.get('device_type', 'smartphone'),
        'quality': data.get('quality'),
        'manufacturer': data.get('manufacturer'),
        'color': data.get('color'),
        'price': data.get('price'),
        'price_wholesale': data.get('price_wholesale'),
        'quantity': data.get('quantity'),
        'quantity_code': data.get('quantity_code'),
        'is_available': data.get('is_available'),
        'shop': SHOP_NAME,
        'region_code': REGION_CODE,
        'region_name': REGION_NAME,
        'parsed_at': data.get('parsed_at', datetime.now()),
    }

    with conn.cursor() as cur:
        cur.execute(sql, params)
        result = cur.fetchone()
        return result[0] if result else None


def insert_to_history(conn, data: dict):
    """
    INSERT запись в elo_prices_history.
    Вызывается после каждого парсинга для отслеживания изменений цен.
    """
    sql = """
        INSERT INTO elo_prices_history (
            shop, external_id,
            price, price_wholesale,
            quantity, quantity_code, is_available,
            parsed_at
        ) VALUES (
            %(shop)s, %(external_id)s,
            %(price)s, %(price_wholesale)s,
            %(quantity)s, %(quantity_code)s, %(is_available)s,
            %(parsed_at)s
        )
    """

    params = {
        'shop': SHOP_NAME,
        'external_id': data.get('external_id'),
        'price': data.get('price'),
        'price_wholesale': data.get('price_wholesale'),
        'quantity': data.get('quantity'),
        'quantity_code': data.get('quantity_code'),
        'is_available': data.get('is_available'),
        'parsed_at': data.get('parsed_at', datetime.now()),
    }

    with conn.cursor() as cur:
        cur.execute(sql, params)


def upsert_to_noname(conn, data: dict) -> int:
    """
    UPSERT товар в elo_price_noname (для ручной нормализации).
    Используется когда модель устройства не удалось определить.
    """
    sql = """
        INSERT INTO elo_price_noname (
            external_id, article, name, url,
            raw_brand, raw_part_type,
            price, price_wholesale,
            quantity, quantity_code, is_available,
            shop, region_code, region_name,
            parsed_at
        ) VALUES (
            %(external_id)s, %(article)s, %(name)s, %(url)s,
            %(raw_brand)s, %(raw_part_type)s,
            %(price)s, %(price_wholesale)s,
            %(quantity)s, %(quantity_code)s, %(is_available)s,
            %(shop)s, %(region_code)s, %(region_name)s,
            %(parsed_at)s
        )
        ON CONFLICT (shop, external_id)
        DO UPDATE SET
            name = EXCLUDED.name,
            url = EXCLUDED.url,
            raw_brand = EXCLUDED.raw_brand,
            raw_part_type = EXCLUDED.raw_part_type,
            price = EXCLUDED.price,
            price_wholesale = EXCLUDED.price_wholesale,
            quantity = EXCLUDED.quantity,
            quantity_code = EXCLUDED.quantity_code,
            is_available = EXCLUDED.is_available,
            parsed_at = EXCLUDED.parsed_at
        RETURNING id
    """

    params = {
        'external_id': data.get('external_id'),
        'article': data.get('article', str(data.get('external_id', ''))),
        'name': data['name'],
        'url': data.get('url'),
        'raw_brand': data.get('raw_brand'),
        'raw_part_type': data.get('raw_part_type'),
        'price': data.get('price'),
        'price_wholesale': data.get('price_wholesale'),
        'quantity': data.get('quantity'),
        'quantity_code': data.get('quantity_code'),
        'is_available': data.get('is_available'),
        'shop': SHOP_NAME,
        'region_code': REGION_CODE,
        'region_name': REGION_NAME,
        'parsed_at': data.get('parsed_at', datetime.now()),
    }

    with conn.cursor() as cur:
        cur.execute(sql, params)
        result = cur.fetchone()
        return result[0] if result else None


def process_greenspark_product(
    conn,
    greenspark_id: int,
    name: str,
    url: str,
    raw_brand: str,
    raw_part_type: str,
    price_retail: float,
    price_green5: float,
    quantity: str,
    quantity_code: str,
    normalized: dict,
    parsed_at: datetime = None
):
    """
    Обработать товар GreenSpark: записать в нужную таблицу.

    Args:
        conn: psycopg2 connection
        greenspark_id: ID товара в GreenSpark
        name: название товара
        url: URL товара
        raw_brand: сырой бренд из парсера
        raw_part_type: сырой тип запчасти из парсера
        price_retail: розничная цена
        price_green5: цена по тарифу Грин5
        quantity: наличие (текст)
        quantity_code: код наличия (none/few/sufficient/many)
        normalized: результат normalize_greenspark_product()
        parsed_at: время парсинга
    """
    if parsed_at is None:
        parsed_at = datetime.now()

    is_available = quantity_code != 'none' if quantity_code else False

    if normalized['is_recognized']:
        # Товар распознан — записываем в elo_prices
        data = {
            'external_id': greenspark_id,
            'name': name,
            'url': url,
            'part_type': normalized['part_type'],
            'part_type_ru': normalized['part_type_ru'],
            'brand': normalized['brand'],
            'models': normalized['models'],
            'device_type': normalized['device_type'],
            'quality': normalized['quality'],
            'manufacturer': normalized['manufacturer'],
            'color': normalized['color'],
            'price': price_retail,
            'price_wholesale': price_green5,
            'quantity': quantity,
            'quantity_code': quantity_code,
            'is_available': is_available,
            'parsed_at': parsed_at,
        }

        upsert_to_elo_prices(conn, data)
        insert_to_history(conn, data)

        return 'recognized'
    else:
        # Товар не распознан — записываем в elo_price_noname
        data = {
            'external_id': greenspark_id,
            'name': name,
            'url': url,
            'raw_brand': raw_brand or normalized.get('brand', 'Unknown'),
            'raw_part_type': raw_part_type or normalized.get('part_type_ru', 'Прочее'),
            'price': price_retail,
            'price_wholesale': price_green5,
            'quantity': quantity,
            'quantity_code': quantity_code,
            'is_available': is_available,
            'parsed_at': parsed_at,
        }

        upsert_to_noname(conn, data)

        return 'noname'


def get_stats(conn) -> dict:
    """Получить статистику по таблицам"""
    stats = {}

    with conn.cursor() as cur:
        # elo_prices
        cur.execute("SELECT COUNT(*) FROM elo_prices WHERE shop = %s", (SHOP_NAME,))
        stats['elo_prices'] = cur.fetchone()[0]

        # elo_price_noname
        cur.execute("SELECT COUNT(*) FROM elo_price_noname WHERE shop = %s", (SHOP_NAME,))
        stats['elo_price_noname'] = cur.fetchone()[0]

        # elo_prices_history
        cur.execute("SELECT COUNT(*) FROM elo_prices_history WHERE shop = %s", (SHOP_NAME,))
        stats['elo_prices_history'] = cur.fetchone()[0]

    return stats


# ============== TEST ==============

if __name__ == '__main__':
    print("Testing PostgreSQL connection...")

    try:
        conn = get_connection()
        print("Connected!")

        stats = get_stats(conn)
        print(f"\nCurrent stats for {SHOP_NAME}:")
        for table, count in stats.items():
            print(f"  {table}: {count}")

        conn.close()
        print("\nConnection closed.")

    except Exception as e:
        print(f"Error: {e}")
