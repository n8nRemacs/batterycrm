# ТЗ: Универсальная нормализация прайс-листов

## Цель

Создать единую систему нормализации прайс-листов от разных поставщиков запчастей для мобильных устройств. Все данные хранятся в общей таблице `elo_prices` с возможностью фильтрации по поставщику и магазину.

---

## Архитектура данных

### Основная таблица: elo_prices

```
┌─────────────────────────────────────────────────────────────┐
│                      elo_prices                              │
├─────────────────────────────────────────────────────────────┤
│  shop = 'GreenSpark'  │  shop = 'Профи'  │  shop = '...'    │
│  9,064 товаров        │  3,323 товаров   │  будущие         │
└─────────────────────────────────────────────────────────────┘
```

### Таблицы

| Таблица | Назначение |
|---------|------------|
| `elo_prices` | Нормализованные товары (основная) |
| `elo_prices_history` | История изменений цен |
| `elo_price_noname` | Товары без распознанной модели (ручная нормализация) |
| `elo_shops` | Справочник магазинов/поставщиков |

---

## Справочник магазинов: elo_shops

### Структура

```sql
CREATE TABLE elo_shops (
    id SERIAL PRIMARY KEY,

    -- Идентификация
    uuid UUID DEFAULT gen_random_uuid() UNIQUE,
    code VARCHAR(50) UNIQUE NOT NULL,      -- 'greenspark', 'profi'
    name VARCHAR(200) NOT NULL,            -- 'GreenSpark', 'Профи'

    -- Тип
    shop_type VARCHAR(50),                 -- 'distributor', 'retail', 'marketplace'

    -- Компания (если сеть магазинов)
    company_name VARCHAR(200),             -- 'ООО ГринСпарк'
    company_inn VARCHAR(12),

    -- Контакты
    website VARCHAR(200),
    phone VARCHAR(50),
    email VARCHAR(100),

    -- Локация (для конкретной точки)
    region_code INTEGER,
    region_name VARCHAR(100),
    city VARCHAR(100),
    address VARCHAR(300),

    -- Родительский магазин (для сети)
    parent_shop_id INTEGER REFERENCES elo_shops(id),

    -- Настройки парсинга
    parser_enabled BOOLEAN DEFAULT TRUE,
    parser_cron VARCHAR(50),               -- '0 19 * * *'
    parser_config JSONB,                   -- дополнительные настройки

    -- Метаданные
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

-- Индексы
CREATE INDEX idx_elo_shops_code ON elo_shops(code);
CREATE INDEX idx_elo_shops_parent ON elo_shops(parent_shop_id);
CREATE INDEX idx_elo_shops_region ON elo_shops(region_code);
```

### Начальные данные

```sql
INSERT INTO elo_shops (code, name, shop_type, company_name, website, region_code, region_name, city, parser_cron) VALUES
('greenspark', 'GreenSpark', 'distributor', 'ООО ГринСпарк', 'https://green-spark.ru', 30, 'Астраханская область', 'Ростов-на-Дону', '0 19 * * *'),
('profi', 'Профи', 'distributor', NULL, NULL, 30, 'Астраханская область', 'Астрахань', NULL);
```

### Пример: сеть магазинов

```sql
-- Головной офис GreenSpark
INSERT INTO elo_shops (code, name, shop_type, company_name, region_code, city) VALUES
('greenspark_main', 'GreenSpark (Главный)', 'distributor', 'ООО ГринСпарк', 77, 'Москва');

-- Филиалы
INSERT INTO elo_shops (code, name, shop_type, parent_shop_id, region_code, city, address) VALUES
('greenspark_rostov', 'GreenSpark Ростов', 'retail', 1, 61, 'Ростов-на-Дону', 'ул. Серафимовича, 53А'),
('greenspark_astrahan', 'GreenSpark Астрахань', 'retail', 1, 30, 'Астрахань', 'ул. Савушкина, 46'),
('greenspark_krasnodar', 'GreenSpark Краснодар', 'retail', 1, 23, 'Краснодар', 'ул. Северная, 324');
```

---

## Связь elo_prices с магазинами

### Текущая структура (упрощённая)

```sql
-- Поля в elo_prices
shop VARCHAR(100)        -- код/название магазина: 'GreenSpark', 'Профи'
region_code INTEGER      -- код региона
region_name VARCHAR(100) -- название региона
```

### Будущая структура (с UUID)

```sql
-- Добавить поле
ALTER TABLE elo_prices ADD COLUMN shop_uuid UUID REFERENCES elo_shops(uuid);

-- Индекс
CREATE INDEX idx_elo_prices_shop_uuid ON elo_prices(shop_uuid);
```

### Миграция

```sql
-- Заполнить shop_uuid на основе shop
UPDATE elo_prices p
SET shop_uuid = s.uuid
FROM elo_shops s
WHERE p.shop = s.name OR p.shop = s.code;
```

---

## Структура elo_prices (полная)

```sql
CREATE TABLE elo_prices (
    id SERIAL PRIMARY KEY,

    -- Идентификация товара
    external_id INTEGER,              -- ID у поставщика (greenspark_id, profi_id)
    article VARCHAR(100),             -- артикул
    barcode VARCHAR(100),             -- штрихкод

    -- Название и URL
    name TEXT NOT NULL,               -- оригинальное название
    url TEXT,                         -- ссылка на товар

    -- Классификация (нормализованная)
    part_type VARCHAR(50),            -- display, battery, flex_cable...
    part_type_ru VARCHAR(100),        -- Дисплей, АКБ, Шлейф...
    brand VARCHAR(100),               -- Apple, Samsung, Xiaomi...
    models TEXT[],                    -- ["iPhone 14", "iPhone 14 Pro"]
    device_type VARCHAR(50),          -- smartphone, tablet, smartwatch

    -- Качество
    quality VARCHAR(50),              -- original, premium_copy, standard_copy, copy
    manufacturer VARCHAR(100),        -- FOXCONN, JK, GX, TianMa...

    -- Характеристики
    color VARCHAR(50),                -- black, white, gold...
    with_frame BOOLEAN,               -- с рамкой / без рамки

    -- Цены
    price DECIMAL(10,2),              -- розничная цена
    price_wholesale DECIMAL(10,2),    -- оптовая цена

    -- Наличие
    quantity VARCHAR(50),             -- "В наличии:Мало", "Нет в наличии"
    quantity_code VARCHAR(20),        -- none, few, sufficient, many
    is_available BOOLEAN,             -- true/false
    in_stock BOOLEAN,                 -- алиас для is_available
    stock_indicator VARCHAR(10),      -- визуальный индикатор

    -- Источник (текущий)
    shop VARCHAR(100) NOT NULL,       -- 'GreenSpark', 'Профи'
    region_code INTEGER,
    region_name VARCHAR(100),

    -- Источник (будущий)
    shop_uuid UUID,                   -- FK to elo_shops.uuid

    -- Метаданные
    category_path TEXT[],             -- путь в каталоге поставщика
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),
    parsed_at TIMESTAMPTZ,            -- время последнего парсинга

    -- Уникальность
    UNIQUE(shop, external_id)
);
```

---

## Процесс нормализации

### Входные данные

Прайс-лист от поставщика в любом формате:
- XLS/XLSX (Profi)
- JSON/API (GreenSpark)
- CSV
- XML

### Этапы обработки

```
┌─────────────────┐
│  Сырой прайс    │  XLS, JSON, CSV, API
└────────┬────────┘
         │
         ▼
┌─────────────────┐
│  Парсер         │  Извлечение: name, price, article, quantity
└────────┬────────┘
         │
         ▼
┌─────────────────┐
│  Нормализатор   │  Извлечение: brand, models, part_type, quality, color
└────────┬────────┘
         │
    ┌────┴────┐
    │         │
    ▼         ▼
┌───────┐ ┌───────────┐
│elo_   │ │elo_price_ │
│prices │ │noname     │
└───────┘ └───────────┘
 (92.9%)    (7.1%)
```

### Правила нормализации

#### 1. Определение бренда

```python
BRAND_KEYWORDS = {
    'Apple': ['iphone', 'ipad', 'apple', 'watch', 'airpods'],
    'Samsung': ['samsung', 'galaxy'],
    'Xiaomi': ['xiaomi', 'redmi', 'poco', 'mi '],
    'Huawei': ['huawei'],
    'Honor': ['honor'],
    'Realme': ['realme'],
    'OPPO': ['oppo'],
    'Vivo': ['vivo'],
    # ... и другие
}
```

#### 2. Определение типа запчасти

```python
PART_TYPE_MAP = {
    'display': ['дисплей', 'display', 'lcd', 'экран'],
    'battery': ['акб', 'аккумулятор', 'батарея'],
    'touchscreen': ['тачскрин', 'сенсор'],
    'flex_cable': ['шлейф', 'flex'],
    'back_cover': ['задняя крышка'],
    'camera': ['камера'],
    # ... и другие
}
```

#### 3. Извлечение моделей

```python
# Из названия: "Дисплей для iPhone 14 Pro Max + тачскрин"
# Результат: ["iPhone 14 Pro Max"]

# Из скобок: "Шлейф для Xiaomi (M2101K7AG)"
# Результат: ["Xiaomi Redmi Note 10"] (через маппинг кодов)
```

#### 4. Определение качества

```python
QUALITY_MARKERS = {
    'original': ['ориг 100%', 'original', 'оригинал', '100% lcd', 'oem'],
    'premium_copy': ['foxconn', 'jk', 'gx', 'in-cell'],
    'standard_copy': ['tianma', 'deji', 'hoco', 'hq'],
    'copy': []  # по умолчанию
}
```

#### 5. Определение цвета

```python
COLOR_MAP = {
    'black': ['черный', 'черная', 'чёрный', 'black'],
    'white': ['белый', 'белая', 'white'],
    'gold': ['золото', 'золотой', 'gold'],
    # ... и другие
}
```

---

## Справочники маппинга

### device_mappings.py

Технические коды устройств → названия моделей:

```python
XIAOMI_MODELS = {
    'M1901F7G': 'Xiaomi Redmi Note 7',
    'M2101K7AG': 'Xiaomi Redmi Note 10',
    '2201117PG': 'Xiaomi Redmi Note 11S',
    # 100+ маппингов
}

REALME_MODELS = {
    'RMX3231': 'realme C11 2021 / realme Narzo 50i',
    'RMX3085': 'realme 8',
    # 60+ маппингов
}

# Также: TECNO_MODELS, INFINIX_MODELS, HUAWEI_MODELS, VIVO_MODELS, NOKIA_MODELS
```

### Расположение

```
NEW/Prices/Profi/device_mappings.py   # основной файл
scripts/normalize_greenspark.py        # функции нормализации
```

---

## Добавление нового поставщика

### Шаг 1: Регистрация в elo_shops

```sql
INSERT INTO elo_shops (code, name, shop_type, website, region_code, region_name)
VALUES ('newshop', 'Новый Поставщик', 'distributor', 'https://newshop.ru', 77, 'Москва');
```

### Шаг 2: Создать парсер

```
NEW/Prices/NewShop/
├── parser.py           # парсинг API/файла
├── config.py           # настройки
└── normalize.py        # адаптация нормализатора (если нужно)
```

### Шаг 3: Использовать общий нормализатор

```python
from scripts.normalize_greenspark import normalize_greenspark_product

# Нормализация работает для любого названия товара
result = normalize_greenspark_product(
    name="Дисплей для Samsung Galaxy A52 черный",
    raw_brand="Samsung",
    raw_part_type="Дисплей"
)
# result = {
#     'brand': 'Samsung',
#     'models': ['Galaxy A52'],
#     'part_type': 'display',
#     'part_type_ru': 'Дисплей',
#     'quality': 'copy',
#     'color': 'black',
#     'is_recognized': True
# }
```

### Шаг 4: Записать в elo_prices

```python
from scripts.pg_database import upsert_to_elo_prices

upsert_to_elo_prices(conn, {
    'external_id': 12345,
    'name': 'Дисплей для Samsung Galaxy A52 черный',
    'brand': 'Samsung',
    'models': ['Galaxy A52'],
    'part_type': 'display',
    'price': 1500.00,
    'shop': 'Новый Поставщик',
    # ...
})
```

---

## API для работы с данными

### Получение товаров по фильтрам

```sql
-- Все дисплеи для iPhone от всех поставщиков
SELECT shop, name, brand, models, price, price_wholesale, is_available
FROM elo_prices
WHERE part_type = 'display'
  AND brand = 'Apple'
  AND 'iPhone 14' = ANY(models)
ORDER BY price;

-- Сравнение цен между поставщиками
SELECT
    shop,
    COUNT(*) as total,
    AVG(price) as avg_price,
    MIN(price) as min_price,
    MAX(price) as max_price
FROM elo_prices
WHERE brand = 'Apple' AND part_type = 'display'
GROUP BY shop;
```

### Товары для ручной нормализации

```sql
-- Нераспознанные товары по брендам
SELECT raw_brand, COUNT(*) as cnt
FROM elo_price_noname
GROUP BY raw_brand
ORDER BY cnt DESC;

-- После ручной нормализации — перенести в elo_prices
UPDATE elo_price_noname
SET normalized_brand = 'Apple',
    normalized_model = 'iPhone XR',
    normalized_part_type = 'display',
    is_normalized = TRUE,
    normalized_at = NOW(),
    normalized_by = 'admin'
WHERE id = 123;
```

---

## Текущее состояние

### Поставщики

| Поставщик | Товаров | Распознано | Нераспознано | Cron |
|-----------|---------|------------|--------------|------|
| GreenSpark | 9,754 | 9,064 (92.9%) | 690 | 19:00 |
| Профи | 3,323 | 3,323 (100%) | 0 | — |

### Файлы

| Файл | Расположение | Описание |
|------|--------------|----------|
| `parse_all.py` | 155.212.221.189:/opt/greenspark/ | Парсер GreenSpark |
| `pg_sync.py` | 155.212.221.189:/opt/greenspark/ | Синхронизация с PostgreSQL |
| `device_mappings.py` | NEW/Prices/Profi/ | Маппинг кодов устройств |
| `normalize_greenspark.py` | scripts/ | Функции нормализации |

### База данных

- **Сервер:** 185.221.214.83:6544
- **База:** postgres
- **Таблицы:** elo_prices, elo_prices_history, elo_price_noname

---

## Дальнейшие улучшения

1. **Улучшить распознавание:**
   - iPhone XR, XS, XS Max
   - Samsung Galaxy Note
   - Ноутбуки (Asus, Lenovo)

2. **UI для ручной нормализации:**
   - Веб-интерфейс для обработки elo_price_noname
   - Автоматическое добавление новых маппингов

3. **Алерты:**
   - Уведомления об изменении цен > 10%
   - Уведомления о появлении новых товаров

4. **Аналитика:**
   - Сравнение цен между поставщиками
   - Динамика цен по категориям
