"""
Конфигурация парсера GreenSpark.ru
"""

# URLs
BASE_URL = "https://green-spark.ru/local/api"
SEARCH_ENDPOINT = "/catalog/fast-search/"

# Настройки запросов
REQUEST_DELAY = 2.0  # Задержка между запросами (секунды)
REQUEST_TIMEOUT = 30  # Таймаут запроса (секунды)
MAX_PAGES = 100  # Максимум страниц на запрос

# Магазин (Ростов-на-Дону, ул. Серафимовича, 53А)
DEFAULT_SHOP_ID = 15226

# Пути к файлам
DATA_DIR = "data"
PRODUCTS_CSV = f"{DATA_DIR}/products.csv"
PRODUCTS_JSON = f"{DATA_DIR}/products.json"
ERRORS_LOG = f"{DATA_DIR}/errors.json"

# Бренды для парсинга
BRANDS = [
    "iphone",
    "samsung",
    "xiaomi",
    "huawei",
    "honor",
    "realme",
    "oneplus",
    "oppo",
    "vivo",
    "infinix",
    "tecno",
    "itel",
    "poco",
    "redmi",
    "meizu",
    "zte",
    "nokia",
    "motorola",
    "lg",
    "sony",
    "asus",
    "lenovo",
    "google pixel",
    "nothing",
]

# Типы запчастей
PART_TYPES = [
    "дисплей",
    "тачскрин",
    "акб",
    "аккумулятор",
    "шлейф",
    "корпус",
    "задняя крышка",
    "камера",
    "плата",
    "разъем",
    "динамик",
    "микрофон",
    "кнопка",
    "стекло",
    "рамка",
    "батарея",
]
