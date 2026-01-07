#!/usr/bin/env python3
"""
Загрузка сырых данных из всех прайс-листов в elo_prices
Без нормализации - только загрузка
"""

import json
import psycopg2
from pathlib import Path
from datetime import datetime

# Configuration
POSTGRES_DSN = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"
BASE_DIR = Path(__file__).parent.parent / "NEW/Prices"

# Sources configuration
SOURCES = [
    {"folder": "05GSM", "shop": "05GSM", "region_code": 5, "region_name": "Дагестан"},
    {"folder": "GreenSpark", "shop": "GreenSpark", "region_code": 77, "region_name": "Москва"},
    {"folder": "memstech", "shop": "Memstech", "region_code": 77, "region_name": "Москва"},
    {"folder": "Profi", "shop": "Profi", "region_code": 30, "region_name": "Астрахань"},
    {"folder": "Taggsm", "shop": "Taggsm", "region_code": 30, "region_name": "Астрахань"},
    {"folder": "Naffas", "shop": "Naffas", "region_code": 30, "region_name": "Астрахань"},
]


def parse_availability(avail_str):
    """Parse availability string to boolean and quantity code"""
    if not avail_str:
        return False, "none", "Нет в наличии"

    avail_lower = str(avail_str).lower()

    if "нет" in avail_lower or avail_lower == "0":
        return False, "none", "Нет в наличии"
    elif "есть" in avail_lower or "в наличии" in avail_lower or avail_lower == "1":
        return True, "available", "В наличии"
    elif "мало" in avail_lower:
        return True, "few", "В наличии: мало"
    elif "много" in avail_lower:
        return True, "many", "В наличии: много"
    else:
        # Try to parse as number
        try:
            qty = int(avail_str)
            if qty > 0:
                return True, "available", f"В наличии: {qty}"
            else:
                return False, "none", "Нет в наличии"
        except:
            return True, "available", str(avail_str)


def load_source(cur, source):
    """Load products from one source"""
    folder = source["folder"]
    shop = source["shop"]
    region_code = source["region_code"]
    region_name = source["region_name"]

    json_path = BASE_DIR / folder / "data" / "products.json"

    if not json_path.exists():
        print(f"  [SKIP] {folder}: file not found")
        return 0

    # Load JSON
    with open(json_path, 'r', encoding='utf-8') as f:
        data = json.load(f)

    # Get products list
    if isinstance(data, list):
        products = data
    elif 'products' in data:
        products = data['products']
    else:
        print(f"  [SKIP] {folder}: unknown format")
        return 0

    count = 0
    for p in products:
        try:
            # Parse fields
            product_id = p.get('product_id')
            sku = p.get('sku', '') or ''
            name = p.get('name', '') or ''
            price = p.get('price', 0) or 0
            availability = p.get('availability', '')
            category = p.get('category', '') or ''
            url = p.get('url', '') or ''

            # Parse availability
            in_stock, qty_code, qty_str = parse_availability(availability)

            # Parse external_id
            try:
                external_id = int(product_id) if product_id else None
            except:
                external_id = None

            # Category path
            category_path = [category] if category else []

            # Insert
            cur.execute("""
                INSERT INTO elo_prices (
                    external_id, article, name, url,
                    price, in_stock, is_available,
                    quantity, quantity_code,
                    shop, region_code, region_name,
                    category_path, parsed_at
                ) VALUES (
                    %s, %s, %s, %s,
                    %s, %s, %s,
                    %s, %s,
                    %s, %s, %s,
                    %s, NOW()
                )
            """, (
                external_id, str(sku)[:50] if sku else str(product_id)[:50], name, url,
                price, in_stock, in_stock,
                qty_str, qty_code,
                shop, region_code, region_name,
                category_path
            ))
            count += 1

        except Exception as e:
            print(f"  [ERROR] {product_id}: {e}")

    return count


def main():
    print("=" * 70)
    print("LOAD RAW PRICES TO elo_prices")
    print(f"Date: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 70)

    # Connect
    print("\nConnecting to PostgreSQL...")
    conn = psycopg2.connect(POSTGRES_DSN)
    cur = conn.cursor()

    # Truncate
    print("\nTruncating elo_prices...")
    cur.execute("TRUNCATE elo_prices RESTART IDENTITY CASCADE;")
    conn.commit()
    print("  Table cleared")

    # Load each source
    print("\nLoading sources...")
    total = 0

    for source in SOURCES:
        count = load_source(cur, source)
        conn.commit()
        print(f"  {source['shop']}: {count} products")
        total += count

    # Verify
    print("\n" + "=" * 70)
    cur.execute("SELECT COUNT(*) FROM elo_prices;")
    db_count = cur.fetchone()[0]

    cur.execute("SELECT shop, COUNT(*) as cnt FROM elo_prices GROUP BY shop ORDER BY cnt DESC;")
    shops = cur.fetchall()

    print("RESULT:")
    print(f"  Total loaded: {total}")
    print(f"  In database:  {db_count}")
    print("\n  By shop:")
    for shop, cnt in shops:
        print(f"    {shop}: {cnt}")

    conn.close()

    print("\n" + "=" * 70)
    print("DONE!")
    print("=" * 70)


if __name__ == "__main__":
    main()
