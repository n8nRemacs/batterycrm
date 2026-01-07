#!/usr/bin/env python3
"""
Price list normalizer for mobile phone parts.

Extracts from product names:
- Part type (display, battery, cable, camera, etc.)
- Phone model(s)
- Quality (original, copy)
- Manufacturer (FOXCONN, DEJI, etc.)
"""

import pandas as pd
import re
import sys
import subprocess
import json
from typing import Optional, List, Tuple
from dataclasses import dataclass, asdict

# Part types mapping (Russian -> normalized)
PART_TYPES = {
    # Primary types - order matters for matching
    'Дисплей': 'display',
    'Тачскрин': 'touchscreen',
    'АКБ': 'battery',
    'Аккумулятор': 'battery',
    'Шлейф': 'flex_cable',
    'Камера': 'camera',
    'Кнопка': 'button',
    'Задняя крышка': 'back_cover',
    'Корпус': 'housing',
    'Держатель SIM': 'sim_tray',
    'Коннектор SIM': 'sim_connector',
    'Коннектор MMC': 'mmc_connector',
    'Коннектор SIM/MMC': 'sim_mmc_connector',
    'Коннектор SIM/ММС': 'sim_mmc_connector',
    'Модуль беспроводной зарядки': 'wireless_charging',
    'Стекло камеры': 'camera_glass',
    'Стекло': 'glass',
    'Динамик': 'speaker',
    'Звонок': 'ringer',
    'Микрофон': 'microphone',
    'Вибро': 'vibrator',
    'Винт': 'screw',
    'Проклейка': 'adhesive',
    'Скотч': 'tape',
    'Разъем': 'connector',
    'Антенна': 'antenna',
    'Джойстик': 'joystick',
    'Датчик': 'sensor',
}

# Quality markers
QUALITY_ORIGINAL = [
    'ориг 100%',
    'сервисный ориг 100%',
    'сервисный ориг',
    'сервис ориг 100%',
    'серв ориг 100%',
    'cервисный ориг',
    'Original',
    'ORIGINAL',
    'New Orig',
]

QUALITY_COPY_PREMIUM = [
    'OLED',
    'Super AMOLED',
    'Dynamic AMOLED',
    'In-Cell',
    'In-Сell',  # Cyrillic 'С'
    'INCELL',
    'Incell',
    'In-cell',
    'PREMIUM',
    'Premium',
]

QUALITY_COPY_STANDARD = [
    'TFT',
    'HQ',
    'AA',
]

# Known manufacturers
MANUFACTURERS = [
    'FOXCONN',
    'DEJI',
    'HOCO',
    'Elephant',
    'GX',
    'JK',
    'TIANMA',
    'Tianma',
]

# Brand detection patterns
BRANDS = {
    'Apple': ['iPhone', 'iPad', 'Apple', 'APPLE'],
    'Samsung': ['Samsung', 'SAMSUNG', 'Galaxy'],
    'Huawei': ['Huawei', 'HUAWEI', 'Honor', 'HONOR'],
    'Xiaomi': ['Xiaomi', 'XIAOMI', 'Redmi', 'REDMI', 'POCO', 'Mi '],
    'Realme': ['Realme', 'REALME'],
    'OPPO': ['OPPO', 'Oppo'],
    'Vivo': ['Vivo', 'VIVO'],
    'OnePlus': ['OnePlus', 'ONEPLUS'],
    'Asus': ['Asus', 'ASUS'],
    'Sony': ['Sony', 'SONY', 'Xperia'],
    'LG': ['LG '],
    'Nokia': ['Nokia', 'NOKIA'],
    'Motorola': ['Motorola', 'MOTOROLA', 'Moto '],
    'Lenovo': ['Lenovo', 'LENOVO'],
    'ZTE': ['ZTE'],
    'Meizu': ['Meizu', 'MEIZU'],
    'HTC': ['HTC'],
    'Alcatel': ['Alcatel', 'ALCATEL'],
    'Fly': ['Fly', 'FLY'],
    'BQ': ['BQ '],
    'Dexp': ['Dexp', 'DEXP'],
    'Blackview': ['Blackview', 'BLACKVIEW'],
    'Tecno': ['Tecno', 'TECNO'],
    'Infinix': ['Infinix', 'INFINIX'],
    'Google': ['Pixel', 'Google'],
}


@dataclass
class NormalizedPart:
    """Normalized part data"""
    article: str
    barcode: str
    name: str
    part_type: str
    part_type_ru: str
    brand: str
    models: List[str]
    quality: str  # 'original', 'premium_copy', 'standard_copy', 'unknown'
    manufacturer: Optional[str]
    color: Optional[str]
    price: float
    in_stock: bool
    shop: str
    region_code: int
    region_name: str
    category_path: List[str]


def extract_part_type(name: str) -> Tuple[str, str]:
    """Extract part type from product name"""
    name_lower = name.lower()

    for ru_type, en_type in PART_TYPES.items():
        if ru_type.lower() in name_lower:
            return en_type, ru_type

    return 'other', 'Другое'


def extract_brand(name: str) -> str:
    """Extract brand from product name"""
    for brand, keywords in BRANDS.items():
        for keyword in keywords:
            if keyword in name:
                return brand
    return 'Unknown'


def extract_models(name: str, brand: str) -> List[str]:
    """Extract phone models from product name"""
    models = []

    if brand == 'Apple':
        # iPhone models: iPhone 11 Pro Max, iPhone XS, etc.
        iphone_pattern = r'iPhone\s*(\d+\s*(?:Pro\s*Max|Pro|Plus|Mini)?|\w+\s*(?:Pro\s*Max|Pro|Plus)?)'
        iphone_matches = re.findall(iphone_pattern, name, re.IGNORECASE)
        for match in iphone_matches:
            model = f"iPhone {match.strip()}"
            if model not in models:
                models.append(model)

        # iPad models
        ipad_pattern = r'iPad\s*(Air|Pro|Mini)?\s*[\d.]*\s*(?:\([^)]+\))?'
        ipad_matches = re.findall(ipad_pattern, name, re.IGNORECASE)
        for match in ipad_matches:
            if match:
                model = f"iPad {match.strip()}"
            else:
                model = "iPad"
            if model not in models:
                models.append(model)

    elif brand == 'Samsung':
        # Samsung models: A015F (A01), G780F (S20FE), etc.
        # Pattern: letter + numbers + optional letter, possibly with parenthesized name
        samsung_pattern = r'Samsung\s+([A-Z]\d{2,4}[A-Z]?(?:/[A-Z]\d{2,4}[A-Z]?)*)\s*(?:\(([^)]+)\))?'
        samsung_matches = re.findall(samsung_pattern, name)
        for match in samsung_matches:
            code, friendly_name = match
            # Handle multiple codes like A125F/A127F
            codes = code.split('/')
            if friendly_name:
                # Use friendly name if available
                friendly_names = friendly_name.split('/')
                for i, c in enumerate(codes):
                    if i < len(friendly_names):
                        model = f"{friendly_names[i].strip()}"
                    else:
                        model = c
                    if model not in models:
                        models.append(model)
            else:
                for c in codes:
                    if c not in models:
                        models.append(c)

    elif brand == 'Xiaomi':
        # Xiaomi/Redmi/POCO patterns
        xiaomi_pattern = r'(?:Xiaomi|Redmi|POCO)\s+([A-Za-z0-9\s]+?)(?:\s+\(|\s+\+|$)'
        matches = re.findall(xiaomi_pattern, name)
        for match in matches:
            model = match.strip()
            if model and model not in models:
                models.append(model)

    elif brand == 'Huawei':
        # Huawei/Honor patterns
        huawei_pattern = r'(?:Huawei|Honor)\s+([A-Za-z0-9\s]+?)(?:\s+\(|\s+\+|$)'
        matches = re.findall(huawei_pattern, name)
        for match in matches:
            model = match.strip()
            if model and model not in models:
                models.append(model)

    # Generic model extraction for other brands
    if not models:
        # Try to find model in parentheses
        paren_pattern = r'\(([^)]+)\)'
        paren_matches = re.findall(paren_pattern, name)
        for match in paren_matches:
            # Skip colors and other non-model info
            if not any(c in match.lower() for c in ['черн', 'бел', 'серый', 'золот', 'синий', 'красн', 'зелен']):
                if match not in models:
                    models.append(match)

    return models if models else ['Unknown']


def extract_quality(name: str) -> str:
    """Extract quality level from product name"""
    # Check for original markers
    for marker in QUALITY_ORIGINAL:
        if marker.lower() in name.lower():
            return 'original'

    # Check for premium copy markers
    for marker in QUALITY_COPY_PREMIUM:
        if marker in name:
            return 'premium_copy'

    # Check for standard copy markers
    for marker in QUALITY_COPY_STANDARD:
        if marker in name:
            return 'standard_copy'

    return 'unknown'


def extract_manufacturer(name: str) -> Optional[str]:
    """Extract manufacturer from product name"""
    for mfr in MANUFACTURERS:
        if mfr in name:
            return mfr
    return None


def extract_color(name: str) -> Optional[str]:
    """Extract color from product name"""
    colors = {
        'черный': 'black',
        'черная': 'black',
        'белый': 'white',
        'белая': 'white',
        'серый': 'gray',
        'серая': 'gray',
        'серебро': 'silver',
        'серебристый': 'silver',
        'золото': 'gold',
        'золотой': 'gold',
        'синий': 'blue',
        'синяя': 'blue',
        'голубой': 'light_blue',
        'голубая': 'light_blue',
        'красный': 'red',
        'красная': 'red',
        'зеленый': 'green',
        'зеленая': 'green',
        'розовый': 'pink',
        'розовая': 'pink',
        'фиолетовый': 'purple',
        'фиолетовая': 'purple',
        'оранжевый': 'orange',
        'оранжевая': 'orange',
        'желтый': 'yellow',
        'желтая': 'yellow',
        'коричневый': 'brown',
        'бронзовый': 'bronze',
        'лавандовый': 'lavender',
        'ультрафиолет': 'ultraviolet',
    }

    name_lower = name.lower()
    for ru_color, en_color in colors.items():
        if ru_color in name_lower:
            return en_color

    return None


def parse_price(price_str: str) -> float:
    """Parse price string to float"""
    if pd.isna(price_str):
        return 0.0

    # Remove currency, spaces, quotes
    price_clean = str(price_str).replace('руб.', '').replace("'", '').replace(' ', '').strip()

    try:
        return float(price_clean)
    except ValueError:
        return 0.0


def parse_stock(stock_str: str) -> bool:
    """Parse stock indicator"""
    if pd.isna(stock_str):
        return False
    return str(stock_str).strip() != ''


def normalize_price_list(
    file_path: str,
    shop: str,
    region_code: int,
    region_name: str
) -> List[NormalizedPart]:
    """
    Normalize price list from Excel file.

    Args:
        file_path: Path to Excel file
        shop: Shop name (e.g., 'Профи')
        region_code: Region code (e.g., 30)
        region_name: Region name (e.g., 'Астрахань')

    Returns:
        List of normalized parts
    """
    # Read Excel file
    df = pd.read_excel(file_path, header=None)

    parts = []
    current_categories = []

    # Find data start (row with headers: FIX, Код, Штрих-Код, etc.)
    data_start = None
    for i in range(len(df)):
        row = df.iloc[i]
        if pd.notna(row[1]) and str(row[1]).strip() == 'FIX':
            data_start = i + 1
            break

    if data_start is None:
        raise ValueError("Could not find data start in Excel file")

    print(f"Data starts at row {data_start}")

    # Process rows
    for i in range(data_start, len(df)):
        row = df.iloc[i]

        # Check if this is a category row (only column 4 is filled)
        if pd.notna(row[4]) and pd.isna(row[2]) and pd.isna(row[3]):
            category = str(row[4]).strip()

            # Determine category level by content
            if category == 'ТОВАР':
                current_categories = []
            elif category.startswith(('1.', '2.', '3.', '4.', '5.')):
                # Top-level category
                current_categories = [category]
            elif 'ЗАПЧАСТИ ДЛЯ' in category:
                # Brand category
                if len(current_categories) >= 1:
                    current_categories = current_categories[:1] + [category]
                else:
                    current_categories = [category]
            else:
                # Sub-category (part type)
                if len(current_categories) >= 2:
                    current_categories = current_categories[:2] + [category]
                elif len(current_categories) >= 1:
                    current_categories = current_categories[:1] + [category]
                else:
                    current_categories = [category]
            continue

        # Check if this is a data row
        if pd.notna(row[2]) and pd.notna(row[4]):
            article = str(row[2]).strip()
            barcode = str(row[3]).strip() if pd.notna(row[3]) else ''
            name = str(row[4]).strip()
            stock = parse_stock(row[5])
            price = parse_price(row[6])

            # Extract normalized fields
            part_type, part_type_ru = extract_part_type(name)
            brand = extract_brand(name)
            models = extract_models(name, brand)
            quality = extract_quality(name)
            manufacturer = extract_manufacturer(name)
            color = extract_color(name)

            part = NormalizedPart(
                article=article,
                barcode=barcode,
                name=name,
                part_type=part_type,
                part_type_ru=part_type_ru,
                brand=brand,
                models=models,
                quality=quality,
                manufacturer=manufacturer,
                color=color,
                price=price,
                in_stock=stock,
                shop=shop,
                region_code=region_code,
                region_name=region_name,
                category_path=current_categories.copy(),
            )
            parts.append(part)

    return parts


def upload_to_database(
    parts: List[NormalizedPart],
    db_host: str = '185.221.214.83',
    db_port: int = 6544,
    db_user: str = 'supabase_admin',
    db_pass: str = 'PuSuPa_21_Base-AdmiN',
    db_name: str = 'postgres',
    clear_existing: bool = False
) -> int:
    """
    Upload normalized parts to PostgreSQL database.

    Args:
        parts: List of normalized parts
        db_host: Database host
        db_port: Database port
        db_user: Database user
        db_pass: Database password
        db_name: Database name
        clear_existing: If True, clear existing data for same shop/region

    Returns:
        Number of inserted rows
    """
    import psycopg2
    from psycopg2.extras import execute_values

    if not parts:
        print("No parts to upload")
        return 0

    # Connect to database
    print(f"Connecting to {db_host}:{db_port}...")
    conn = psycopg2.connect(
        host=db_host,
        port=db_port,
        user=db_user,
        password=db_pass,
        database=db_name
    )
    conn.autocommit = False
    cursor = conn.cursor()

    try:
        # Get shop and region from first part
        shop = parts[0].shop
        region_code = parts[0].region_code

        # Clear existing data if requested
        if clear_existing:
            print(f"Clearing existing data for shop='{shop}', region_code={region_code}...")
            cursor.execute(
                "DELETE FROM elo_prices WHERE shop = %s AND region_code = %s",
                (shop, region_code)
            )
            print(f"Deleted {cursor.rowcount} existing rows")

        # Prepare data for bulk insert
        print("Preparing data for insert...")
        values = []
        for part in parts:
            values.append((
                part.article,
                part.barcode,
                part.name,
                part.part_type,
                part.part_type_ru,
                part.brand,
                part.models,
                part.quality,
                part.manufacturer,
                part.color,
                part.price,
                part.in_stock,
                part.shop,
                part.region_code,
                part.region_name,
                part.category_path,
            ))

        # Bulk insert
        print(f"Inserting {len(values)} rows...")
        insert_sql = """
            INSERT INTO elo_prices (
                article, barcode, name, part_type, part_type_ru, brand, models,
                quality, manufacturer, color, price, in_stock, shop, region_code,
                region_name, category_path
            ) VALUES %s
        """
        execute_values(cursor, insert_sql, values, page_size=500)

        conn.commit()
        print(f"Successfully inserted {len(values)} rows")
        return len(values)

    except Exception as e:
        conn.rollback()
        print(f"Error: {e}")
        raise
    finally:
        cursor.close()
        conn.close()


def main():
    """Main function"""
    import argparse

    parser = argparse.ArgumentParser(description='Normalize and upload price list')
    parser.add_argument('--file', '-f', default=r'C:\Users\User\Documents\Eldoleado\NEW\Prices\Profi Astrahan.xls',
                        help='Path to Excel file')
    parser.add_argument('--shop', '-s', default='Профи', help='Shop name')
    parser.add_argument('--region-code', '-r', type=int, default=30, help='Region code')
    parser.add_argument('--region-name', '-n', default='Астрахань', help='Region name')
    parser.add_argument('--upload', '-u', action='store_true', help='Upload to database')
    parser.add_argument('--clear', '-c', action='store_true', help='Clear existing data before upload')
    parser.add_argument('--stats-only', action='store_true', help='Show only statistics')

    args = parser.parse_args()

    print(f"Processing: {args.file}")
    print(f"Shop: {args.shop}, Region: {args.region_name} ({args.region_code})")
    print()

    parts = normalize_price_list(args.file, args.shop, args.region_code, args.region_name)

    print(f"Total parts: {len(parts)}")
    print()

    if not args.stats_only:
        # Show sample results
        print("=== Sample Results ===")
        for i, part in enumerate(parts[:10]):
            print(f"\n--- Part {i+1} ---")
            print(f"Article: {part.article}")
            print(f"Name: {part.name}")
            print(f"Type: {part.part_type} ({part.part_type_ru})")
            print(f"Brand: {part.brand}")
            print(f"Models: {', '.join(part.models)}")
            print(f"Quality: {part.quality}")
            print(f"Manufacturer: {part.manufacturer}")
            print(f"Color: {part.color}")
            print(f"Price: {part.price}")
            print(f"In Stock: {part.in_stock}")
            print(f"Categories: {' > '.join(part.category_path)}")

    # Statistics
    print("\n=== Statistics ===")

    # Part types distribution
    type_counts = {}
    for part in parts:
        type_counts[part.part_type_ru] = type_counts.get(part.part_type_ru, 0) + 1

    print("\nPart Types:")
    for ptype, count in sorted(type_counts.items(), key=lambda x: -x[1])[:15]:
        print(f"  {ptype}: {count}")

    # Brand distribution
    brand_counts = {}
    for part in parts:
        brand_counts[part.brand] = brand_counts.get(part.brand, 0) + 1

    print("\nBrands:")
    for brand, count in sorted(brand_counts.items(), key=lambda x: -x[1])[:15]:
        print(f"  {brand}: {count}")

    # Quality distribution
    quality_counts = {}
    for part in parts:
        quality_counts[part.quality] = quality_counts.get(part.quality, 0) + 1

    print("\nQuality:")
    for quality, count in sorted(quality_counts.items(), key=lambda x: -x[1]):
        print(f"  {quality}: {count}")

    # Upload to database if requested
    if args.upload:
        print("\n=== Uploading to Database ===")
        inserted = upload_to_database(parts, clear_existing=args.clear)
        print(f"\nTotal inserted: {inserted} rows")

    return parts


if __name__ == '__main__':
    main()
