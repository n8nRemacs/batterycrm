#!/usr/bin/env python3
"""
Нормализация и миграция данных NAFFAS в elo_prices
Запускать локально
"""

import json
import psycopg2
import sys
import re
from datetime import datetime
from pathlib import Path

# ============== CONFIGURATION ==============

NAFFAS_JSON = Path(__file__).parent.parent / "NEW/Prices/Naffas/data/products.json"
POSTGRES_DSN = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"

SHOP_NAME = 'NAFFAS'
SHOP_CODE = 'naffas'
REGION_CODE = 30
REGION_NAME = 'Астрахань'

# ============== CATEGORY TO PART_TYPE MAPPING ==============

CATEGORY_PART_TYPE = {
    "Аккумуляторы": ("battery", "АКБ"),
    "Дисплеи": ("display", "Дисплей"),
    "Тачскрины": ("touchscreen", "Тачскрин"),
    "Шлейфы": ("flex_cable", "Шлейф"),
    "Камеры": ("camera", "Камера"),
    "Динамики": ("speaker", "Динамик"),
    "Микрофоны": ("microphone", "Микрофон"),
    "Разъемы": ("connector", "Разъем"),
    "Корпуса": ("housing", "Корпус"),
    "Кнопки": ("button", "Кнопка"),
    "Антенны": ("antenna", "Антенна"),
}

# ============== BRAND DETECTION ==============

BRAND_KEYWORDS = {
    'Apple': ['iphone', 'ipad', 'apple', 'watch', 'airpods'],
    'Samsung': ['samsung', 'galaxy'],
    'Xiaomi': ['xiaomi', 'redmi', 'poco', 'mi '],
    'Huawei': ['huawei'],
    'Honor': ['honor'],
    'Realme': ['realme'],
    'OPPO': ['oppo'],
    'Vivo': ['vivo'],
    'OnePlus': ['oneplus'],
    'Tecno': ['tecno'],
    'Infinix': ['infinix'],
    'Itel': ['itel'],
    'ZTE': ['zte'],
    'Meizu': ['meizu'],
    'Nokia': ['nokia'],
    'Sony': ['sony', 'xperia'],
    'LG': ['lg '],
    'Motorola': ['motorola', 'moto '],
    'Google': ['google', 'pixel'],
    'Asus': ['asus'],
    'Lenovo': ['lenovo'],
    'Nothing': ['nothing'],
    'BQ': ['bq-', 'bq '],
    'Fly': ['fly '],
    'Alcatel': ['alcatel'],
}


def detect_brand(name: str) -> str:
    """Определить бренд по названию"""
    name_lower = name.lower()

    for brand, keywords in BRAND_KEYWORDS.items():
        for kw in keywords:
            if kw in name_lower:
                return brand

    return 'Unknown'


def detect_part_type_from_category(category: str) -> tuple:
    """Определить тип запчасти из категории"""
    if not category:
        return ('other', 'Прочее')

    category_lower = category.lower()

    for key, (part_type, part_type_ru) in CATEGORY_PART_TYPE.items():
        if key.lower() in category_lower:
            return (part_type, part_type_ru)

    return ('other', 'Прочее')


# ============== MODEL EXTRACTION ==============

def extract_models(name: str, brand: str) -> list:
    """Извлечь модели устройств из названия"""
    models = []

    if brand == 'Apple':
        patterns = [
            r'iPhone\s*(\d{1,2}(?:\s*(?:Pro\s*Max|Pro|Plus|Mini|SE(?:\s*\d{4})?))?)',
            r'iPad\s*((?:Pro|Air|Mini)?\s*[\d.]+)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                model = f"iPhone {match.group(1).strip()}" if 'iphone' in pattern.lower() else match.group(0).strip()
                models.append(model)

    elif brand in ['Xiaomi', 'Redmi', 'POCO']:
        patterns = [
            r'(Redmi\s*Note\s*\d+[A-Za-z]*(?:\s*Pro\+?)?)',
            r'(Redmi\s*\d+[A-Za-z]*(?:\s*Pro)?)',
            r'(POCO\s*[A-Z]\d+(?:\s*Pro)?)',
            r'(Mi\s*\d+[A-Za-z]*)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                models.append(match.group(1).strip())
                break

    elif brand == 'Samsung':
        patterns = [
            r'Galaxy\s*([A-Z]\d{1,2}(?:\s*(?:Ultra|Plus|\+|FE|s|e))?)',
            r'Galaxy\s*(S\d{1,2}(?:\s*(?:Ultra|Plus|\+|FE))?)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                models.append(f"Galaxy {match.group(1).strip()}")
                break

    elif brand == 'Infinix':
        # Infinix Hot 10 Play/11/11 Play -> extract all models
        patterns = [
            r'(Hot\s*\d+[A-Za-z]*(?:\s*(?:Play|Pro|Plus|i|S))?)',
            r'(Smart\s*\d+(?:\s*(?:HD|Plus))?)',
            r'(Note\s*\d+(?:\s*(?:Pro|Plus))?)',
            r'(Zero\s*\d+)',
        ]
        for pattern in patterns:
            matches = re.findall(pattern, name, re.IGNORECASE)
            for m in matches:
                model_name = f"Infinix {m.strip()}"
                if model_name not in models:
                    models.append(model_name)

    elif brand == 'Tecno':
        patterns = [
            r'(Spark\s*\d+[A-Za-z]*(?:\s*(?:Go|Pro|Plus))?)',
            r'(Camon\s*\d+[A-Za-z]*)',
            r'(Pova\s*\d+[A-Za-z]*)',
            r'(Pop\s*\d+[A-Za-z]*)',
        ]
        for pattern in patterns:
            matches = re.findall(pattern, name, re.IGNORECASE)
            for m in matches:
                model_name = f"Tecno {m.strip()}"
                if model_name not in models:
                    models.append(model_name)

    # Fallback: try to extract from parentheses or slashes
    if not models:
        # Pattern like "Hot 10 Play/11/11 Play" - extract models separated by /
        paren_match = re.search(r'(?:for|для)?\s*\w+\s+(.+?)(?:\s*\(|$)', name)
        if paren_match:
            model_text = paren_match.group(1).strip()
            # Clean up
            model_text = re.sub(r'\([^)]*\)', '', model_text)
            if len(model_text) < 100 and model_text:
                models.append(model_text)

    return models


# ============== QUALITY & COLOR DETECTION ==============

QUALITY_MARKERS = {
    'original': ['ориг', 'original', 'оригинал', 'oem'],
    'premium_copy': ['naffas', 'premium'],
    'standard_copy': ['copy', 'копия'],
}


def detect_quality(name: str) -> str:
    name_lower = name.lower()
    for quality, markers in QUALITY_MARKERS.items():
        for marker in markers:
            if marker in name_lower:
                return quality
    # NAFFAS products are premium by default
    if 'naffas' in name_lower:
        return 'premium_copy'
    return 'copy'


COLOR_MAP = {
    'black': ['черный', 'черная', 'black'],
    'white': ['белый', 'белая', 'white'],
    'gray': ['серый', 'серая', 'grey', 'gray'],
    'gold': ['золото', 'золотой', 'gold'],
    'silver': ['серебро', 'серебристый', 'silver'],
    'blue': ['синий', 'синяя', 'голубой', 'blue'],
    'red': ['красный', 'красная', 'red'],
    'green': ['зеленый', 'зелёный', 'green'],
    'purple': ['фиолетовый', 'purple'],
    'pink': ['розовый', 'pink'],
}


def detect_color(name: str) -> str:
    name_lower = name.lower()
    for color, keywords in COLOR_MAP.items():
        for kw in keywords:
            if kw in name_lower:
                return color
    return None


def detect_device_type(name: str) -> str:
    name_lower = name.lower()
    if any(x in name_lower for x in ['ipad', 'tab ', 'tablet', 'pad ']):
        return 'tablet'
    if any(x in name_lower for x in ['watch', 'band']):
        return 'smartwatch'
    return 'smartphone'


# ============== AVAILABILITY MAPPING ==============

def map_availability(stock, available) -> tuple:
    """Возвращает (quantity, quantity_code, is_available)"""
    if not available or stock <= 0:
        return ('Нет в наличии', 'none', False)
    elif stock <= 2:
        return ('В наличии:Мало', 'few', True)
    elif stock <= 10:
        return ('В наличии', 'sufficient', True)
    else:
        return ('В наличии:Много', 'many', True)


# ============== NORMALIZATION ==============

def normalize_product(product: dict) -> dict:
    """Нормализовать товар NAFFAS"""
    name = product.get('name', '')
    category = product.get('category', '')

    # Part type from category
    part_type, part_type_ru = detect_part_type_from_category(category)

    # Brand
    brand = detect_brand(name)

    # Models
    models = extract_models(name, brand)

    # Quality
    quality = detect_quality(name)

    # Color
    color = detect_color(name)

    # Device type
    device_type = detect_device_type(name)

    # Is recognized
    is_recognized = bool(models) and brand != 'Unknown'

    return {
        'part_type': part_type,
        'part_type_ru': part_type_ru,
        'brand': brand,
        'models': models,
        'device_type': device_type,
        'quality': quality,
        'manufacturer': 'NAFFAS',  # NAFFAS is the manufacturer
        'color': color,
        'with_frame': False,
        'is_recognized': is_recognized,
    }


# ============== MIGRATION ==============

def migrate():
    print("=" * 70)
    print("MIGRATION NAFFAS -> ELO_PRICES")
    print(f"Date: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 70)

    # Load JSON
    print(f"\nReading JSON: {NAFFAS_JSON}")
    with open(NAFFAS_JSON, 'r', encoding='utf-8') as f:
        data = json.load(f)

    products = data.get('products', [])
    total = len(products)
    print(f"Found products: {total}")

    # PostgreSQL
    print(f"\nConnecting to PostgreSQL...")
    pg_conn = psycopg2.connect(POSTGRES_DSN)
    pg_cur = pg_conn.cursor()

    # Add shop to elo_shops
    print("Adding shop to elo_shops...")
    pg_cur.execute("""
        INSERT INTO elo_shops (code, name, shop_type, website, region_code, region_name, city)
        VALUES (%s, %s, %s, %s, %s, %s, %s)
        ON CONFLICT (code) DO UPDATE SET name = EXCLUDED.name, updated_at = NOW()
        RETURNING uuid
    """, (SHOP_CODE, SHOP_NAME, 'distributor', 'https://b2b.moysklad.ru', REGION_CODE, REGION_NAME, 'Астрахань'))
    shop_uuid = pg_cur.fetchone()[0]
    pg_conn.commit()
    print(f"Shop UUID: {shop_uuid}")

    # Statistics
    recognized = 0
    noname = 0
    errors = 0

    for i, product in enumerate(products, 1):
        try:
            product_id = product.get('code', '')
            name = product.get('name', '')
            price = product.get('price', 0)
            category = product.get('category', '')
            stock = product.get('stock', 0)
            available = product.get('available', False)

            # Normalize
            norm = normalize_product(product)
            quantity, quantity_code, is_available = map_availability(stock, available)

            # Use code as external_id (convert to int if possible)
            try:
                external_id = int(product_id)
            except:
                external_id = hash(product_id) % 1000000000  # fallback

            if norm['is_recognized']:
                # Insert to elo_prices
                pg_cur.execute("""
                    INSERT INTO elo_prices (
                        external_id, article, name, url,
                        part_type, part_type_ru, brand, models, device_type,
                        quality, manufacturer, color, with_frame,
                        price,
                        quantity, quantity_code, is_available,
                        shop, shop_uuid, region_code, region_name,
                        category_path, parsed_at, updated_at
                    ) VALUES (
                        %s, %s, %s, %s,
                        %s, %s, %s, %s, %s,
                        %s, %s, %s, %s,
                        %s,
                        %s, %s, %s,
                        %s, %s, %s, %s,
                        %s, NOW(), NOW()
                    )
                    ON CONFLICT (shop, external_id) WHERE external_id IS NOT NULL
                    DO UPDATE SET
                        name = EXCLUDED.name,
                        price = EXCLUDED.price,
                        quantity = EXCLUDED.quantity,
                        quantity_code = EXCLUDED.quantity_code,
                        is_available = EXCLUDED.is_available,
                        parsed_at = NOW(),
                        updated_at = NOW()
                """, (
                    external_id, product_id, name, None,
                    norm['part_type'], norm['part_type_ru'], norm['brand'], norm['models'], norm['device_type'],
                    norm['quality'], norm['manufacturer'], norm['color'], norm['with_frame'],
                    price,
                    quantity, quantity_code, is_available,
                    SHOP_NAME, shop_uuid, REGION_CODE, REGION_NAME,
                    category.split('/') if category else []
                ))
                recognized += 1
            else:
                # Insert to elo_price_noname
                pg_cur.execute("""
                    INSERT INTO elo_price_noname (
                        external_id, article, name, url,
                        raw_brand, raw_part_type,
                        price,
                        quantity, quantity_code, is_available,
                        shop, shop_uuid, region_code, region_name,
                        parsed_at
                    ) VALUES (
                        %s, %s, %s, %s,
                        %s, %s,
                        %s,
                        %s, %s, %s,
                        %s, %s, %s, %s,
                        NOW()
                    )
                    ON CONFLICT (shop, external_id)
                    DO UPDATE SET
                        name = EXCLUDED.name,
                        price = EXCLUDED.price,
                        quantity = EXCLUDED.quantity,
                        quantity_code = EXCLUDED.quantity_code,
                        is_available = EXCLUDED.is_available,
                        parsed_at = NOW()
                """, (
                    external_id, product_id, name, None,
                    norm['brand'], norm['part_type_ru'],
                    price,
                    quantity, quantity_code, is_available,
                    SHOP_NAME, shop_uuid, REGION_CODE, REGION_NAME
                ))
                noname += 1

            # Commit every 100 records
            if i % 100 == 0:
                pg_conn.commit()
                print(f"  [{i}/{total}] Recognized: {recognized}, Noname: {noname}")

        except Exception as e:
            errors += 1
            print(f"  [ERROR] {product.get('code')}: {e}")

    # Final commit
    pg_conn.commit()

    # Statistics
    print("\n" + "=" * 70)
    print("RESULT:")
    print(f"  Total products: {total}")
    print(f"  Recognized (elo_prices): {recognized}")
    print(f"  Noname (elo_price_noname): {noname}")
    print(f"  Errors: {errors}")
    if total > 0:
        print(f"  Recognition rate: {recognized/total*100:.1f}%")
    print("=" * 70)

    pg_conn.close()


if __name__ == "__main__":
    migrate()
