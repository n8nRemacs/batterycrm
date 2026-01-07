#!/usr/bin/env python3
"""
Заполнение elo_dict_brands и elo_dict_models из models_normalized.json
"""

import json
import re
import psycopg2
from pathlib import Path
from datetime import datetime

# Configuration
POSTGRES_DSN = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"
JSON_PATH = Path(__file__).parent.parent / "NEW/Prices/Normalize All/models_normalized.json"


def slugify(text: str) -> str:
    """Convert text to slug (lowercase, underscores, no special chars)"""
    text = text.lower()
    text = re.sub(r'[^\w\s-]', '', text)
    text = re.sub(r'[\s-]+', '_', text)
    text = text.strip('_')
    return text[:100]  # Limit to 100 chars for code field


def main():
    print("=" * 70)
    print("POPULATE elo_dict_brands & elo_dict_models")
    print(f"Date: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 70)

    # Load JSON
    print(f"\nLoading: {JSON_PATH}")
    with open(JSON_PATH, 'r', encoding='utf-8') as f:
        data = json.load(f)

    brands_data = data['brands']
    print(f"Brands in JSON: {len(brands_data)}")
    total_models = sum(len(info['models']) for info in brands_data.values())
    print(f"Models in JSON: {total_models}")

    # Connect to PostgreSQL
    print(f"\nConnecting to PostgreSQL...")
    conn = psycopg2.connect(POSTGRES_DSN)
    cur = conn.cursor()

    # Truncate tables (order matters due to FK)
    print("\nTruncating tables...")
    cur.execute("TRUNCATE elo_dict_models CASCADE;")
    cur.execute("TRUNCATE elo_dict_brands CASCADE;")
    conn.commit()
    print("  Tables cleared")

    # Insert brands and collect IDs
    print("\nInserting brands...")
    brand_ids = {}
    for brand_name in sorted(brands_data.keys()):
        code = slugify(brand_name)
        cur.execute("""
            INSERT INTO elo_dict_brands (code, name, aliases, is_active, sort_order)
            VALUES (%s, %s, %s, true, 0)
            RETURNING id
        """, (code, brand_name, '[]'))
        brand_id = cur.fetchone()[0]
        brand_ids[brand_name] = brand_id

    conn.commit()
    print(f"  Inserted: {len(brand_ids)} brands")

    # Insert models
    print("\nInserting models...")
    model_count = 0
    for brand_name, info in brands_data.items():
        brand_id = brand_ids[brand_name]
        for model_name in info['models']:
            code = slugify(f"{brand_name}_{model_name}")
            cur.execute("""
                INSERT INTO elo_dict_models (brand_id, code, name, aliases, device_type_id, is_active, sort_order)
                VALUES (%s, %s, %s, %s, NULL, true, 0)
            """, (brand_id, code, model_name, '[]'))
            model_count += 1

        # Commit every brand
        conn.commit()
        print(f"  {brand_name}: {len(info['models'])} models")

    # Verify
    print("\n" + "=" * 70)
    print("VERIFICATION")
    cur.execute("SELECT COUNT(*) FROM elo_dict_brands;")
    brands_count = cur.fetchone()[0]
    cur.execute("SELECT COUNT(*) FROM elo_dict_models;")
    models_count = cur.fetchone()[0]

    print(f"  elo_dict_brands: {brands_count}")
    print(f"  elo_dict_models: {models_count}")

    conn.close()

    print("\n" + "=" * 70)
    print("DONE!")
    print("=" * 70)


if __name__ == "__main__":
    main()
