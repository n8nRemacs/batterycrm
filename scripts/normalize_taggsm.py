#!/usr/bin/env python3
"""
Нормализация и миграция данных Taggsm в elo_prices
Запускать локально
"""

import json
import psycopg2
import sys
import re
from datetime import datetime
from pathlib import Path

# ============== CONFIGURATION ==============

TAGGSM_JSON = Path(__file__).parent.parent / "NEW/Prices/Taggsm/data/products.json"
POSTGRES_DSN = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"

SHOP_NAME = 'Taggsm'
REGION_CODE = 30
REGION_NAME = 'Астрахань'

# ============== CATEGORY TO PART_TYPE MAPPING ==============

CATEGORY_PART_TYPE = {
    "OCA и поляризационные пленки": ("oca_film", "OCA пленка"),
    "SIM, MicroSD - Держатели": ("sim_holder", "Держатель SIM"),
    "SIM, MicroSD - Считыватели": ("sim_reader", "Считыватель SIM"),
    "Аккумуляторы (АКБ)": ("battery", "АКБ"),
    "Антенны": ("antenna", "Антенна"),
    "Вибро": ("vibro_motor", "Вибромотор"),
    "Винты": ("screw", "Винты"),
    "Динамики, Звонки": ("speaker", "Динамик"),
    "Дисплеи": ("display", "Дисплей"),
    "Камеры": ("camera", "Камера"),
    "Клавиатуры": ("keyboard", "Клавиатура"),
    "Кнопки, толкатели": ("button", "Кнопка"),
    "Корпуса, Рамки, Крышки": ("housing", "Корпус"),
    "Крепления плат": ("board_mount", "Крепление платы"),
    "Микросхемы": ("chip", "Микросхема"),
    "Микрофоны": ("microphone", "Микрофон"),
    "Подсветки дисплея": ("backlight", "Подсветка"),
    "Разъёмы": ("connector", "Разъем"),
    "Сеточки динамиков": ("speaker_mesh", "Сеточка динамика"),
    "Скотч (проклейка)": ("adhesive", "Скотч"),
    "Стекла камер": ("camera_glass", "Стекло камеры"),
    "Тачскрины, Стекло": ("touchscreen", "Тачскрин"),
    "Шлейфы, Платы, Подложки": ("flex_cable", "Шлейф"),
}

# ============== BRAND DETECTION ==============

BRAND_KEYWORDS = {
    'Apple': ['iphone', 'ipad', 'apple', 'watch', 'airpods', 'macbook'],
    'Samsung': ['samsung', 'galaxy'],
    'Xiaomi': ['xiaomi', 'redmi', 'poco', 'mi '],
    'Huawei': ['huawei'],
    'Honor': ['honor'],
    'Realme': ['realme'],
    'OPPO': ['oppo'],
    'Vivo': ['vivo'],
    'OnePlus': ['oneplus', 'one plus'],
    'Tecno': ['tecno'],
    'Infinix': ['infinix'],
    'Itel': ['itel'],
    'ZTE': ['zte'],
    'Meizu': ['meizu'],
    'Nokia': ['nokia', 'lumia'],
    'Sony': ['sony', 'xperia'],
    'LG': ['lg '],
    'Motorola': ['motorola', 'moto '],
    'Google': ['google', 'pixel'],
    'Asus': ['asus', 'rog phone', 'zenfone'],
    'Lenovo': ['lenovo'],
    'Nothing': ['nothing phone'],
    'BQ': ['bq-', 'bq '],
    'HTC': ['htc'],
    'Alcatel': ['alcatel'],
    'Fly': ['fly '],
    'Philips': ['philips'],
    'Dexp': ['dexp'],
    'Digma': ['digma'],
    'Prestigio': ['prestigio'],
    'Blackview': ['blackview'],
    'Oukitel': ['oukitel'],
    'Cubot': ['cubot'],
    'Umidigi': ['umidigi'],
    'Doogee': ['doogee'],
    'Ulefone': ['ulefone'],
}


def detect_brand(name: str) -> str:
    """Определить бренд по названию"""
    name_lower = name.lower()

    for brand, keywords in BRAND_KEYWORDS.items():
        for kw in keywords:
            if kw in name_lower:
                return brand

    return 'Unknown'


# ============== MODEL EXTRACTION ==============

def extract_models(name: str, brand: str) -> list:
    """Извлечь модели устройств из названия"""
    models = []

    if brand == 'Apple':
        patterns = [
            r'iPhone\s*(\d{1,2}(?:\s*(?:Pro\s*Max|Pro|Plus|Mini|SE(?:\s*\d{4})?))?)',
            r'iPad\s*((?:Pro|Air|Mini)?\s*[\d.]+(?:\s*\d{4})?)',
            r'Watch\s*(Series\s*\d+|SE|Ultra)',
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
            r'(Mi\s*\d+[A-Za-z]*(?:\s*Lite|Pro|Ultra)?)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                models.append(match.group(1).strip())
                break

    elif brand == 'Samsung':
        patterns = [
            r'Galaxy\s*([A-Z]\d{1,2}(?:\s*(?:Ultra|Plus|\+|FE|s|e))?)',
            r'Galaxy\s*(Note\s*\d+(?:\s*(?:Ultra|Plus|\+))?)',
            r'Galaxy\s*(S\d{1,2}(?:\s*(?:Ultra|Plus|\+|FE))?)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                models.append(f"Galaxy {match.group(1).strip()}")
                break

    # Модели в скобках или через /
    if not models:
        # Ищем паттерны типа "для Huawei Honor 10 Lite / 10i / 20e"
        paren_match = re.search(r'для\s+\w+\s+(.+?)(?:\s+\(|\s+\d+\s*шт|$)', name)
        if paren_match:
            model_text = paren_match.group(1)
            # Убираем технические характеристики
            model_text = re.sub(r'\(\d+["\']?\)', '', model_text)
            model_text = re.sub(r'\d+\s*микрон', '', model_text)
            model_text = model_text.strip()
            if model_text and len(model_text) < 100:
                models.append(model_text)

    return models


# ============== QUALITY & COLOR DETECTION ==============

QUALITY_MARKERS = {
    'original': ['ориг', 'original', 'оригинал', 'oem', '100%'],
    'premium_copy': ['foxconn', 'jk', 'gx', 'in-cell', 'incell', 'elephant', 'amoled'],
    'standard_copy': ['tianma', 'deji', 'hoco', 'hq', 'cof', 'tft'],
}

MANUFACTURERS = ['foxconn', 'jk', 'gx', 'tianma', 'deji', 'hoco', 'elephant', 'vixion', 'pisen']

COLOR_MAP = {
    'black': ['черный', 'черная', 'чёрный', 'black'],
    'white': ['белый', 'белая', 'white'],
    'gray': ['серый', 'серая', 'grey', 'gray', 'графит'],
    'gold': ['золото', 'золотой', 'gold'],
    'silver': ['серебро', 'серебристый', 'silver'],
    'blue': ['синий', 'синяя', 'голубой', 'blue'],
    'red': ['красный', 'красная', 'red'],
    'green': ['зеленый', 'зелёный', 'green'],
    'purple': ['фиолетовый', 'purple', 'лавандовый'],
    'pink': ['розовый', 'pink'],
    'orange': ['оранжевый', 'orange'],
    'yellow': ['желтый', 'жёлтый', 'yellow'],
}


def detect_quality(name: str) -> str:
    name_lower = name.lower()
    for quality, markers in QUALITY_MARKERS.items():
        for marker in markers:
            if marker in name_lower:
                return quality
    return 'copy'


def detect_manufacturer(name: str) -> str:
    name_lower = name.lower()
    for mfr in MANUFACTURERS:
        if mfr in name_lower:
            return mfr.upper() if mfr in ['jk', 'gx', 'hq'] else mfr.capitalize()
    return None


def detect_color(name: str) -> str:
    name_lower = name.lower()
    for color, keywords in COLOR_MAP.items():
        for kw in keywords:
            if kw in name_lower:
                return color
    return None


def detect_device_type(name: str) -> str:
    name_lower = name.lower()
    if any(x in name_lower for x in ['ipad', 'tab ', 'tablet', 'pad ', 'mediapad', 'matepad']):
        return 'tablet'
    if any(x in name_lower for x in ['watch', 'band', 'браслет']):
        return 'smartwatch'
    return 'smartphone'


# ============== AVAILABILITY MAPPING ==============

def map_availability(availability: str) -> tuple:
    """Возвращает (quantity, quantity_code, is_available)"""
    if not availability:
        return ('Нет в наличии', 'none', False)

    avail_lower = availability.lower()

    if 'нет' in avail_lower:
        return ('Нет в наличии', 'none', False)
    elif 'есть' in avail_lower or 'в наличии' in avail_lower:
        return ('В наличии', 'sufficient', True)
    elif 'мало' in avail_lower:
        return ('В наличии:Мало', 'few', True)
    elif 'много' in avail_lower:
        return ('В наличии:Много', 'many', True)
    else:
        return (availability, 'none', False)


# ============== NORMALIZATION ==============

def normalize_product(product: dict, category_name: str) -> dict:
    """Нормализовать товар Taggsm"""
    name = product.get('name', '')

    # Part type from category
    if category_name in CATEGORY_PART_TYPE:
        part_type, part_type_ru = CATEGORY_PART_TYPE[category_name]
    else:
        part_type, part_type_ru = 'other', 'Прочее'

    # Brand
    brand = detect_brand(name)

    # Models
    models = extract_models(name, brand)

    # Quality & Manufacturer
    quality = detect_quality(name)
    manufacturer = detect_manufacturer(name)

    # Color
    color = detect_color(name)

    # Device type
    device_type = detect_device_type(name)

    # With frame
    with_frame = 'с рамкой' in name.lower() or 'рамка' in name.lower()

    # Is recognized
    is_recognized = bool(models) and brand != 'Unknown'

    return {
        'part_type': part_type,
        'part_type_ru': part_type_ru,
        'brand': brand,
        'models': models,
        'device_type': device_type,
        'quality': quality,
        'manufacturer': manufacturer,
        'color': color,
        'with_frame': with_frame,
        'is_recognized': is_recognized,
    }


# ============== MIGRATION ==============

def migrate():
    print("=" * 70)
    print("MIGRATION TAGGSM -> ELO_PRICES")
    print(f"Date: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 70)

    # Load JSON
    print(f"\nReading JSON: {TAGGSM_JSON}")
    with open(TAGGSM_JSON, 'r', encoding='utf-8') as f:
        data = json.load(f)

    products = data.get('products', [])
    total = len(products)
    print(f"Found products: {total}")

    # PostgreSQL
    print(f"\nConnecting to PostgreSQL...")
    pg_conn = psycopg2.connect(POSTGRES_DSN)
    pg_cur = pg_conn.cursor()

    # Statistics
    recognized = 0
    noname = 0
    errors = 0

    for i, product in enumerate(products, 1):
        try:
            product_id = product.get('product_id')
            sku = product.get('sku', '')
            name = product.get('name', '')
            price = product.get('price', 0)
            url = product.get('url', '')
            category_name = product.get('category_name', '')
            availability = product.get('availability', '')

            # Normalize
            norm = normalize_product(product, category_name)
            quantity, quantity_code, is_available = map_availability(availability)

            if norm['is_recognized']:
                # Insert to elo_prices
                pg_cur.execute("""
                    INSERT INTO elo_prices (
                        external_id, article, name, url,
                        part_type, part_type_ru, brand, models, device_type,
                        quality, manufacturer, color, with_frame,
                        price,
                        quantity, quantity_code, is_available,
                        shop, region_code, region_name,
                        category_path, parsed_at, updated_at
                    ) VALUES (
                        %s, %s, %s, %s,
                        %s, %s, %s, %s, %s,
                        %s, %s, %s, %s,
                        %s,
                        %s, %s, %s,
                        %s, %s, %s,
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
                    int(product_id), sku, name, url,
                    norm['part_type'], norm['part_type_ru'], norm['brand'], norm['models'], norm['device_type'],
                    norm['quality'], norm['manufacturer'], norm['color'], norm['with_frame'],
                    price,
                    quantity, quantity_code, is_available,
                    SHOP_NAME, REGION_CODE, REGION_NAME,
                    [category_name]
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
                        shop, region_code, region_name,
                        parsed_at
                    ) VALUES (
                        %s, %s, %s, %s,
                        %s, %s,
                        %s,
                        %s, %s, %s,
                        %s, %s, %s,
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
                    int(product_id), sku, name, url,
                    norm['brand'], norm['part_type_ru'],
                    price,
                    quantity, quantity_code, is_available,
                    SHOP_NAME, REGION_CODE, REGION_NAME
                ))
                noname += 1

            # Commit every 500 records
            if i % 500 == 0:
                pg_conn.commit()
                print(f"  [{i}/{total}] Recognized: {recognized}, Noname: {noname}")

        except Exception as e:
            errors += 1
            print(f"  [ERROR] {product.get('product_id')}: {e}")

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
