#!/usr/bin/env python3
"""
Миграция данных GreenSpark из SQLite в PostgreSQL (elo_prices)
Запускать на сервере 155.212.221.189 где находится greenspark.db
"""

import sqlite3
import psycopg2
import sys
import re
from datetime import datetime
from pathlib import Path

# ============== CONFIGURATION ==============

SQLITE_DB = "/opt/greenspark/data/greenspark.db"
POSTGRES_DSN = "postgresql://supabase_admin:your-super-secret-and-long-postgres-password@185.221.214.83:6544/postgres"

SHOP_NAME = 'GreenSpark'
REGION_CODE = 30
REGION_NAME = 'Астрахань'

# ============== NORMALIZATION (inline for server deployment) ==============

PART_TYPE_MAP = {
    'display': ('Дисплей', ['дисплей', 'display', 'lcd', 'экран']),
    'touchscreen': ('Тачскрин', ['тачскрин', 'touchscreen', 'touch', 'сенсор']),
    'battery': ('АКБ', ['акб', 'аккумулятор', 'батарея', 'battery']),
    'flex_cable': ('Шлейф', ['шлейф', 'flex', 'cable']),
    'back_cover': ('Задняя крышка', ['задняя крышка', 'back cover']),
    'housing': ('Корпус', ['корпус', 'housing']),
    'camera': ('Камера', ['камера', 'camera']),
    'camera_glass': ('Стекло камеры', ['стекло камеры', 'camera glass']),
    'speaker': ('Динамик', ['динамик', 'speaker', 'бузер']),
    'microphone': ('Микрофон', ['микрофон', 'microphone']),
    'button': ('Кнопка', ['кнопка', 'button']),
    'connector': ('Разъем', ['разъем', 'коннектор', 'connector']),
    'frame': ('Рамка', ['рамка', 'frame']),
    'antenna': ('Антенна', ['антенна', 'antenna']),
    'sensor': ('Датчик', ['датчик', 'sensor']),
    'board': ('Плата', ['плата', 'board']),
    'adhesive': ('Скотч', ['скотч', 'adhesive']),
    'glass': ('Стекло', ['стекло', 'glass']),
}

BRAND_KEYWORDS = {
    'Apple': ['iphone', 'ipad', 'apple', 'watch'],
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
    'LG': ['lg'],
    'Motorola': ['motorola', 'moto '],
    'Google': ['google', 'pixel'],
    'Asus': ['asus'],
    'Lenovo': ['lenovo'],
    'Nothing': ['nothing'],
}

QUALITY_MARKERS = {
    'original': ['ориг 100%', 'original', 'оригинал', '100% lcd', 'oem'],
    'premium_copy': ['foxconn', 'jk', 'gx', 'in-cell', 'incell'],
    'standard_copy': ['tianma', 'deji', 'hoco', 'hq', 'cof'],
}

COLOR_MAP = {
    'black': ['черный', 'черная', 'чёрный', 'black'],
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


def detect_part_type(name):
    name_lower = name.lower()
    for pt, (ru, keywords) in PART_TYPE_MAP.items():
        for kw in keywords:
            if kw in name_lower:
                return pt, ru
    return 'other', 'Прочее'


def detect_brand(name):
    name_lower = name.lower()
    for brand, keywords in BRAND_KEYWORDS.items():
        for kw in keywords:
            if kw in name_lower:
                return brand
    return 'Unknown'


def extract_models(name, brand):
    models = []

    if brand == 'Apple':
        patterns = [
            r'iPhone\s*(\d{1,2}(?:\s*(?:Pro\s*Max|Pro|Plus|Mini|SE\s*\d{4})?)?)',
            r'iPad\s*((?:Pro|Air|Mini)?\s*[\d.]+(?:\s*\d{4})?)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                model = f"iPhone {match.group(1).strip()}" if 'iphone' in pattern.lower() else match.group(0).strip()
                models.append(model)

    elif brand in ['Xiaomi', 'Redmi', 'POCO']:
        patterns = [
            r'(Redmi\s*Note\s*\d+[A-Za-z]*(?:\s*Pro\+?)?)',
            r'(Redmi\s*\d+[A-Za-z]*)',
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
            r'Galaxy\s*(Note\s*\d+)',
            r'Galaxy\s*(S\d{1,2}(?:\s*(?:Ultra|Plus|\+|FE))?)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                models.append(f"Galaxy {match.group(1).strip()}")
                break

    # Из скобок
    if not models:
        paren_match = re.search(r'\(([^)]+)\)', name)
        if paren_match:
            content = paren_match.group(1)
            if not re.match(r'^[\d\s]+m[Aa][Hh]', content) and len(content) < 50:
                if '/' in content and not any(c in content.lower() for c in ['mah', 'pin']):
                    parts = [p.strip() for p in content.split('/')]
                    models.extend(parts)
                elif content and not any(c in content.lower() for c in ['mah', 'pin', 'orig']):
                    models.append(content)

    return models


def detect_quality(name):
    name_lower = name.lower()
    for quality, markers in QUALITY_MARKERS.items():
        for marker in markers:
            if marker in name_lower:
                return quality
    return 'copy'


def detect_manufacturer(name):
    manufacturers = ['foxconn', 'jk', 'gx', 'tianma', 'deji', 'hoco', 'elephant', 'vixion']
    name_lower = name.lower()
    for mfr in manufacturers:
        if mfr in name_lower:
            return mfr.upper() if mfr in ['jk', 'gx', 'hq'] else mfr.capitalize()
    return None


def detect_color(name):
    name_lower = name.lower()
    for color, keywords in COLOR_MAP.items():
        for kw in keywords:
            if kw in name_lower:
                return color
    return None


def detect_device_type(name):
    name_lower = name.lower()
    if any(x in name_lower for x in ['ipad', 'tab ', 'tablet', 'pad ']):
        return 'tablet'
    if any(x in name_lower for x in ['watch', 'band']):
        return 'smartwatch'
    return 'smartphone'


def normalize_product(name, raw_brand=None, raw_part_type=None):
    brand = detect_brand(name)
    if brand == 'Unknown' and raw_brand:
        brand = raw_brand

    part_type, part_type_ru = detect_part_type(name)
    if part_type == 'other' and raw_part_type:
        pt2, ptr2 = detect_part_type(raw_part_type)
        if pt2 != 'other':
            part_type, part_type_ru = pt2, ptr2

    models = extract_models(name, brand)
    quality = detect_quality(name)
    manufacturer = detect_manufacturer(name)
    color = detect_color(name)
    device_type = detect_device_type(name)
    with_frame = 'с рамкой' in name.lower()

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


# ============== QUANTITY MAPPING ==============

def map_quantity_code(quantity_text):
    """Преобразовать текст наличия в код"""
    if not quantity_text:
        return 'none'
    q = quantity_text.lower()
    if 'нет' in q:
        return 'none'
    if 'мало' in q:
        return 'few'
    if 'достаточно' in q:
        return 'sufficient'
    if 'много' in q:
        return 'many'
    return 'none'


# ============== MIGRATION ==============

def migrate():
    print("=" * 70)
    print("МИГРАЦИЯ GREENSPARK → ELO_PRICES")
    print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 70)

    # SQLite
    print(f"\nПодключение к SQLite: {SQLITE_DB}")
    sqlite_conn = sqlite3.connect(SQLITE_DB)
    sqlite_conn.row_factory = sqlite3.Row

    # PostgreSQL
    print(f"Подключение к PostgreSQL...")
    pg_conn = psycopg2.connect(POSTGRES_DSN)

    # Получаем данные из SQLite (последние цены для каждого товара)
    sqlite_cur = sqlite_conn.cursor()
    sqlite_cur.execute("""
        SELECT
            p.greenspark_id, p.name, p.url, p.brand, p.part_type,
            pr.price_retail, pr.price_green5, pr.quantity, pr.parsed_at
        FROM products p
        LEFT JOIN (
            SELECT product_id, price_retail, price_green5, quantity, parsed_at,
                   ROW_NUMBER() OVER (PARTITION BY product_id ORDER BY parsed_at DESC) as rn
            FROM prices
        ) pr ON pr.product_id = p.id AND pr.rn = 1
    """)

    products = sqlite_cur.fetchall()
    total = len(products)
    print(f"\nНайдено товаров в SQLite: {total}")

    # Статистика
    recognized = 0
    noname = 0
    errors = 0

    pg_cur = pg_conn.cursor()

    for i, row in enumerate(products, 1):
        try:
            greenspark_id = row['greenspark_id']
            name = row['name']
            url = row['url']
            raw_brand = row['brand']
            raw_part_type = row['part_type']
            price_retail = row['price_retail']
            price_green5 = row['price_green5']
            quantity = row['quantity'] or 'Нет в наличии'
            parsed_at = row['parsed_at']

            # Нормализация
            norm = normalize_product(name, raw_brand, raw_part_type)
            quantity_code = map_quantity_code(quantity)
            is_available = quantity_code != 'none'

            if norm['is_recognized']:
                # Записываем в elo_prices
                pg_cur.execute("""
                    INSERT INTO elo_prices (
                        external_id, article, name, url,
                        part_type, part_type_ru, brand, models, device_type,
                        quality, manufacturer, color,
                        price, price_wholesale,
                        quantity, quantity_code, is_available,
                        shop, region_code, region_name,
                        parsed_at, updated_at
                    ) VALUES (
                        %s, %s, %s, %s,
                        %s, %s, %s, %s, %s,
                        %s, %s, %s,
                        %s, %s,
                        %s, %s, %s,
                        %s, %s, %s,
                        %s, NOW()
                    )
                    ON CONFLICT (shop, external_id) WHERE external_id IS NOT NULL
                    DO UPDATE SET
                        name = EXCLUDED.name,
                        price = EXCLUDED.price,
                        price_wholesale = EXCLUDED.price_wholesale,
                        quantity = EXCLUDED.quantity,
                        quantity_code = EXCLUDED.quantity_code,
                        is_available = EXCLUDED.is_available,
                        parsed_at = EXCLUDED.parsed_at,
                        updated_at = NOW()
                """, (
                    greenspark_id, str(greenspark_id), name, url,
                    norm['part_type'], norm['part_type_ru'], norm['brand'], norm['models'], norm['device_type'],
                    norm['quality'], norm['manufacturer'], norm['color'],
                    price_retail, price_green5,
                    quantity, quantity_code, is_available,
                    SHOP_NAME, REGION_CODE, REGION_NAME,
                    parsed_at
                ))
                recognized += 1
            else:
                # Записываем в elo_price_noname
                pg_cur.execute("""
                    INSERT INTO elo_price_noname (
                        external_id, article, name, url,
                        raw_brand, raw_part_type,
                        price, price_wholesale,
                        quantity, quantity_code, is_available,
                        shop, region_code, region_name,
                        parsed_at
                    ) VALUES (
                        %s, %s, %s, %s,
                        %s, %s,
                        %s, %s,
                        %s, %s, %s,
                        %s, %s, %s,
                        %s
                    )
                    ON CONFLICT (shop, external_id)
                    DO UPDATE SET
                        name = EXCLUDED.name,
                        price = EXCLUDED.price,
                        price_wholesale = EXCLUDED.price_wholesale,
                        quantity = EXCLUDED.quantity,
                        quantity_code = EXCLUDED.quantity_code,
                        is_available = EXCLUDED.is_available,
                        parsed_at = EXCLUDED.parsed_at
                """, (
                    greenspark_id, str(greenspark_id), name, url,
                    raw_brand or norm['brand'], raw_part_type or norm['part_type_ru'],
                    price_retail, price_green5,
                    quantity, quantity_code, is_available,
                    SHOP_NAME, REGION_CODE, REGION_NAME,
                    parsed_at
                ))
                noname += 1

            # Коммитим каждые 500 записей
            if i % 500 == 0:
                pg_conn.commit()
                print(f"  [{i}/{total}] Распознано: {recognized}, Не распознано: {noname}")

        except Exception as e:
            errors += 1
            print(f"  [ERROR] {greenspark_id}: {e}")

    # Финальный коммит
    pg_conn.commit()

    # Статистика
    print("\n" + "=" * 70)
    print("РЕЗУЛЬТАТ:")
    print(f"  Всего товаров: {total}")
    print(f"  Распознано (elo_prices): {recognized}")
    print(f"  Не распознано (elo_price_noname): {noname}")
    print(f"  Ошибок: {errors}")
    print(f"  % распознавания: {recognized/total*100:.1f}%")
    print("=" * 70)

    sqlite_conn.close()
    pg_conn.close()


if __name__ == "__main__":
    migrate()
