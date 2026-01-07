"""
Нормализация данных GreenSpark для записи в elo_prices
Извлекает структурированные данные из названия товара
"""

import re
import sys
sys.path.insert(0, 'NEW/Prices/Profi')

# Импортируем маппинги устройств из Profi
try:
    from device_mappings import ALL_MODELS, XIAOMI_MODELS, REALME_MODELS, TECNO_MODELS, INFINIX_MODELS
except ImportError:
    ALL_MODELS = {}
    print("[WARN] device_mappings.py not found, model mapping disabled")


# ============== PART TYPE DETECTION ==============

PART_TYPE_MAP = {
    'display': ('Дисплей', ['дисплей', 'display', 'lcd', 'экран']),
    'touchscreen': ('Тачскрин', ['тачскрин', 'touchscreen', 'touch', 'сенсор']),
    'battery': ('АКБ', ['акб', 'аккумулятор', 'батарея', 'battery']),
    'flex_cable': ('Шлейф', ['шлейф', 'flex', 'cable']),
    'back_cover': ('Задняя крышка', ['задняя крышка', 'back cover', 'задняя панель']),
    'housing': ('Корпус', ['корпус', 'housing', 'body']),
    'camera': ('Камера', ['камера', 'camera']),
    'camera_glass': ('Стекло камеры', ['стекло камеры', 'camera glass', 'линза камеры']),
    'speaker': ('Динамик', ['динамик', 'speaker', 'спикер', 'бузер', 'buzzer']),
    'microphone': ('Микрофон', ['микрофон', 'microphone', 'mic']),
    'button': ('Кнопка', ['кнопка', 'button']),
    'connector': ('Разъем', ['разъем', 'коннектор', 'connector', 'порт', 'гнездо']),
    'frame': ('Рамка', ['рамка', 'frame', 'безель', 'bezel']),
    'vibro_motor': ('Вибромотор', ['вибромотор', 'vibro', 'taptic']),
    'antenna': ('Антенна', ['антенна', 'antenna', 'nfc']),
    'sensor': ('Датчик', ['датчик', 'sensor', 'proximity']),
    'board': ('Плата', ['плата', 'board', 'pcb']),
    'adhesive': ('Скотч', ['скотч', 'клей', 'adhesive', 'sticker']),
    'glass': ('Стекло', ['стекло', 'glass']),
    'module': ('Модуль', ['модуль', 'module']),
}


def detect_part_type(name: str) -> tuple:
    """Определить тип запчасти по названию. Возвращает (part_type_en, part_type_ru)"""
    name_lower = name.lower()

    # Приоритет: более специфичные типы сначала
    priority_order = ['camera_glass', 'back_cover', 'flex_cable', 'vibro_motor',
                      'display', 'touchscreen', 'battery', 'camera', 'speaker',
                      'microphone', 'button', 'connector', 'frame', 'antenna',
                      'sensor', 'board', 'adhesive', 'glass', 'module', 'housing']

    for pt in priority_order:
        if pt in PART_TYPE_MAP:
            ru_name, keywords = PART_TYPE_MAP[pt]
            for kw in keywords:
                if kw in name_lower:
                    return (pt, ru_name)

    return ('other', 'Прочее')


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
    'LG': ['lg'],
    'Motorola': ['motorola', 'moto '],
    'Google': ['google', 'pixel'],
    'Asus': ['asus', 'rog phone', 'zenfone'],
    'Lenovo': ['lenovo'],
    'Nothing': ['nothing phone'],
    'BQ': ['bq-', 'bq '],
    'HTC': ['htc'],
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


# ============== MODEL EXTRACTION ==============

def extract_models(name: str, brand: str) -> list:
    """
    Извлечь модели устройств из названия.
    Возвращает список моделей или пустой список если не определено.
    """
    models = []

    # Паттерны для разных брендов
    if brand == 'Apple':
        # iPhone X, iPhone 11 Pro Max, iPad Air 2020
        patterns = [
            r'iPhone\s*(\d{1,2}(?:\s*(?:Pro\s*Max|Pro|Plus|Mini|SE\s*\d{4})?)?)',
            r'iPad\s*((?:Pro|Air|Mini)?\s*[\d.]+(?:\s*\d{4})?)',
            r'Watch\s*(Series\s*\d+|SE|Ultra)',
        ]
        for pattern in patterns:
            match = re.search(pattern, name, re.IGNORECASE)
            if match:
                model = f"iPhone {match.group(1).strip()}" if 'iphone' in pattern.lower() else match.group(0).strip()
                models.append(model)

    elif brand in ['Xiaomi', 'Redmi', 'POCO']:
        # Redmi Note 11, Mi 11 Lite, POCO X3 Pro
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
        # Galaxy A52, Galaxy S21 Ultra
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

    # Попробуем найти технический код и маппировать
    code_patterns = [
        r'\b(M1[89]\d{2}[A-Z0-9]+)\b',      # Xiaomi
        r'\b(2[0-4]\d{5,}[A-Z]?G?)\b',       # Xiaomi new
        r'\b(RMX\d{4})\b',                   # Realme
        r'\b(CPH\d{4})\b',                   # OPPO
        r'\b(V2\d{3})\b',                    # Vivo
        r'\b(SM-[A-Z]\d{3,4}[A-Z]?)\b',      # Samsung
    ]

    for pattern in code_patterns:
        match = re.search(pattern, name)
        if match:
            code = match.group(1)
            if code in ALL_MODELS:
                mapped = ALL_MODELS[code]
                if mapped not in models:
                    models.append(mapped)

    # Если модели в скобках: (iPhone 12/iPhone 12 Pro)
    paren_match = re.search(r'\(([^)]+)\)', name)
    if paren_match and not models:
        content = paren_match.group(1)
        # Проверяем что это не технические характеристики
        if not re.match(r'^[\d\s]+m[Aa][Hh]', content) and len(content) < 50:
            if '/' in content:
                parts = [p.strip() for p in content.split('/')]
                models.extend(parts)
            elif content and not any(c in content.lower() for c in ['mah', 'pin', 'orig', 'copy']):
                models.append(content)

    return models


# ============== QUALITY DETECTION ==============

QUALITY_MARKERS = {
    'original': ['ориг 100%', 'original', 'оригинал', '100% lcd', 'oem', 'снятая'],
    'premium_copy': ['foxconn', 'jk', 'gx', 'in-cell', 'incell', 'elephant'],
    'standard_copy': ['tianma', 'tianma ', 'deji', 'hoco', 'hq', 'cof'],
}

MANUFACTURERS = ['foxconn', 'jk', 'gx', 'tianma', 'deji', 'hoco', 'elephant',
                 'vixion', 'pisen', 'baseus', 'nillkin']


def detect_quality(name: str) -> str:
    """Определить качество товара"""
    name_lower = name.lower()

    for quality, markers in QUALITY_MARKERS.items():
        for marker in markers:
            if marker in name_lower:
                return quality

    return 'copy'


def detect_manufacturer(name: str) -> str:
    """Определить производителя"""
    name_lower = name.lower()

    for mfr in MANUFACTURERS:
        if mfr in name_lower:
            return mfr.upper() if mfr in ['jk', 'gx', 'hq'] else mfr.capitalize()

    return None


# ============== COLOR DETECTION ==============

COLOR_MAP = {
    'black': ['черный', 'черная', 'чёрный', 'чёрная', 'black'],
    'white': ['белый', 'белая', 'white'],
    'gray': ['серый', 'серая', 'grey', 'gray', 'графит', 'graphite'],
    'gold': ['золото', 'золотой', 'золотая', 'gold'],
    'silver': ['серебро', 'серебристый', 'серебристая', 'silver'],
    'blue': ['синий', 'синяя', 'голубой', 'голубая', 'blue'],
    'red': ['красный', 'красная', 'red'],
    'green': ['зеленый', 'зелёный', 'зеленая', 'зелёная', 'green'],
    'purple': ['фиолетовый', 'фиолетовая', 'purple', 'лавандовый', 'lavender'],
    'pink': ['розовый', 'розовая', 'pink'],
    'orange': ['оранжевый', 'оранжевая', 'orange'],
    'yellow': ['желтый', 'жёлтый', 'желтая', 'жёлтая', 'yellow'],
}


def detect_color(name: str) -> str:
    """Определить цвет"""
    name_lower = name.lower()

    for color, keywords in COLOR_MAP.items():
        for kw in keywords:
            if kw in name_lower:
                return color

    return None


# ============== DEVICE TYPE DETECTION ==============

def detect_device_type(name: str, brand: str) -> str:
    """Определить тип устройства: smartphone, tablet, smartwatch"""
    name_lower = name.lower()

    if any(x in name_lower for x in ['ipad', 'tab ', 'tabs', 'tablet', 'pad ', 'mediapad', 'matepad']):
        return 'tablet'

    if any(x in name_lower for x in ['watch', 'band', 'браслет']):
        return 'smartwatch'

    return 'smartphone'


# ============== MAIN NORMALIZE FUNCTION ==============

def normalize_greenspark_product(
    name: str,
    raw_brand: str = None,
    raw_part_type: str = None
) -> dict:
    """
    Нормализовать товар GreenSpark.

    Returns:
        dict с полями:
        - part_type, part_type_ru
        - brand
        - models (list)
        - device_type
        - quality
        - manufacturer
        - color
        - with_frame
        - is_recognized (bool) - удалось ли распознать модель
    """
    # Определяем бренд
    brand = detect_brand(name)
    if brand == 'Unknown' and raw_brand:
        brand = raw_brand

    # Определяем тип запчасти
    part_type, part_type_ru = detect_part_type(name)
    if part_type == 'other' and raw_part_type:
        # Пробуем по сырому типу
        pt2, ptr2 = detect_part_type(raw_part_type)
        if pt2 != 'other':
            part_type, part_type_ru = pt2, ptr2

    # Извлекаем модели
    models = extract_models(name, brand)

    # Определяем качество и производителя
    quality = detect_quality(name)
    manufacturer = detect_manufacturer(name)

    # Определяем цвет
    color = detect_color(name)

    # Определяем тип устройства
    device_type = detect_device_type(name, brand)

    # Проверяем наличие рамки
    with_frame = 'с рамкой' in name.lower() or 'рамка' in name.lower()

    # Признак успешного распознавания
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


# ============== TEST ==============

if __name__ == '__main__':
    test_names = [
        "Дисплей для iPhone 14 Pro Max + тачскрин черный с рамкой (100% LCD)",
        "Аккумулятор для iPhone 5S/5C (Vixion) усиленная (1800 mAh)",
        "Дисплей для Samsung Galaxy A52 (A525F) + тачскрин черный (In-Cell JK)",
        "Шлейф для Xiaomi Redmi Note 11 (M2101K7AG) разъема зарядки",
        "Задняя крышка для Realme C11 2021 (RMX3231) синяя",
        "АКБ для Huawei Honor 10 Lite (HRY-LX1) FOXCONN",
        "Камера для iPhone 13 Pro Max основная (комплект 3шт)",
        "Стекло камеры для Samsung Galaxy S21 Ultra",
    ]

    print("=" * 70)
    print("ТЕСТ НОРМАЛИЗАЦИИ")
    print("=" * 70)

    for name in test_names:
        result = normalize_greenspark_product(name)
        print(f"\n>>> {name}")
        print(f"    brand: {result['brand']}")
        print(f"    models: {result['models']}")
        print(f"    part_type: {result['part_type']} ({result['part_type_ru']})")
        print(f"    quality: {result['quality']}, manufacturer: {result['manufacturer']}")
        print(f"    color: {result['color']}, with_frame: {result['with_frame']}")
        print(f"    is_recognized: {result['is_recognized']}")
