# База знаний по ремонту техники — iFixit Full Parser

## Обзор проекта

**Цель:** Создать полную базу знаний на основе ВСЕГО контента iFixit с переработанным текстом для коммерческого использования.

**Источник данных:** iFixit API v2.0 (https://www.ifixit.com/api/2.0/)

**Хранилище:** Neo4j Graph Database

**Объём:** ~60,000+ гайдов, все категории

---

## Статистика контента iFixit

| Категория | Гайдов | % от общего |
|-----------|--------|-------------|
| PC | 9,845 | 16.4% |
| Medical Device | 9,687 | 16.1% |
| Appliance | 8,597 | 14.3% |
| Electronics | 6,395 | 10.6% |
| Tool | 6,128 | 10.2% |
| Phone | 5,120 | 8.5% |
| Computer Hardware | 2,319 | 3.9% |
| Household | 2,063 | 3.4% |
| Camera | 2,027 | 3.4% |
| Tablet | 1,493 | 2.5% |
| Car and Truck | 1,455 | 2.4% |
| Mac | 1,354 | 2.3% |
| Game Console | 1,213 | 2.0% |
| Apparel | 707 | 1.2% |
| Vehicle | 479 | 0.8% |
| Skills | 334 | 0.6% |
| **ИТОГО** | **~60,000+** | **100%** |

---

## Архитектура системы

```
┌──────────────────────────────────────────────────────────────────────┐
│                            FULL PIPELINE                              │
├──────────────────────────────────────────────────────────────────────┤
│                                                                       │
│   ┌─────────────┐                                                     │
│   │ iFixit API  │                                                     │
│   │   v2.0      │                                                     │
│   └──────┬──────┘                                                     │
│          │                                                            │
│          ▼                                                            │
│   ┌─────────────────────────────────────────────────────────┐        │
│   │                    PARSER MODULE                         │        │
│   ├─────────────────────────────────────────────────────────┤        │
│   │  • Rate Limiter (1 req / 2 sec)                         │        │
│   │  • Category Extractor                                    │        │
│   │  • Device Extractor                                      │        │
│   │  • Guide Extractor                                       │        │
│   │  • Media Downloader                                      │        │
│   │  • Progress Tracker                                      │        │
│   └──────┬──────────────────────────────────────────────────┘        │
│          │                                                            │
│          ▼                                                            │
│   ┌─────────────────────────────────────────────────────────┐        │
│   │                   RAW DATA STORAGE                       │        │
│   │              (JSON files + Images)                       │        │
│   └──────┬──────────────────────────────────────────────────┘        │
│          │                                                            │
│          ▼                                                            │
│   ┌─────────────────────────────────────────────────────────┐        │
│   │                   AI REWRITER MODULE                     │        │
│   ├─────────────────────────────────────────────────────────┤        │
│   │  • Claude/GPT Integration                                │        │
│   │  • EN → RU Translation                                   │        │
│   │  • Content Rewriting                                     │        │
│   │  • Quality Validator                                     │        │
│   └──────┬──────────────────────────────────────────────────┘        │
│          │                                                            │
│          ▼                                                            │
│   ┌─────────────────────────────────────────────────────────┐        │
│   │                   NEO4J LOADER                           │        │
│   ├─────────────────────────────────────────────────────────┤        │
│   │  • Node Importer                                         │        │
│   │  • Relationship Builder                                  │        │
│   │  • Index Manager                                         │        │
│   └──────┬──────────────────────────────────────────────────┘        │
│          │                                                            │
│          ▼                                                            │
│   ┌─────────────────────────────────────────────────────────┐        │
│   │                   NEO4J GRAPH DB                         │        │
│   │              (~60K guides, ~500K nodes)                  │        │
│   └──────┬──────────────────────────────────────────────────┘        │
│          │                                                            │
│          ▼                                                            │
│   ┌─────────────────────────────────────────────────────────┐        │
│   │                     REST API                             │        │
│   │                    (FastAPI)                             │        │
│   └─────────────────────────────────────────────────────────┘        │
│                                                                       │
└──────────────────────────────────────────────────────────────────────┘
```

---

## Структура графа Neo4j

### Узлы (Nodes)

#### Category (Категория)
```cypher
(:Category {
    id: Integer,                -- Внутренний ID
    name: String,               -- "Phone", "PC", "Appliance"
    name_ru: String,            -- "Телефоны", "Компьютеры", "Бытовая техника"
    slug: String,               -- URL-friendly name
    description: String,
    description_ru: String,
    image_url: String,
    guide_count: Integer,       -- Количество гайдов
    device_count: Integer,      -- Количество устройств
    level: Integer,             -- Уровень вложенности (0 = root)
    path: String,               -- "Electronics/Phone/iPhone"
    created_at: DateTime,
    updated_at: DateTime
})
```

#### Brand (Бренд)
```cypher
(:Brand {
    id: Integer,
    name: String,               -- "Apple", "Samsung", "Bosch"
    name_ru: String,
    country: String,            -- "USA", "South Korea", "Germany"
    logo_url: String,
    website: String,
    categories: [String],       -- ["Phone", "Tablet", "PC"]
    guide_count: Integer,
    created_at: DateTime
})
```

#### Device (Устройство)
```cypher
(:Device {
    id: Integer,
    name: String,               -- "iPhone 12 Pro Max"
    name_ru: String,
    display_title: String,      -- Полное название для отображения
    model_numbers: [String],    -- ["A2342", "A2410"]
    release_date: Date,
    
    -- Медиа
    image_url: String,
    thumbnail_url: String,
    
    -- Характеристики (JSON)
    specifications: Map,
    
    -- Метаданные
    guide_count: Integer,
    popularity: Integer,        -- Для сортировки
    
    -- Источник
    source_url: String,
    source_id: String,
    
    created_at: DateTime,
    updated_at: DateTime
})
```

#### Guide (Гайд/Инструкция)
```cypher
(:Guide {
    id: Integer,                -- ID из iFixit
    
    -- Названия
    title: String,              -- Оригинальное название (EN)
    title_ru: String,           -- Русское название
    
    -- Тип и сложность
    type: String,               -- "replacement", "repair", "disassembly", 
                                -- "teardown", "technique", "maintenance"
    difficulty: String,         -- "Easy", "Moderate", "Difficult", "Very difficult"
    difficulty_num: Integer,    -- 1-4 для сортировки
    
    -- Время
    time_required: String,      -- Оригинальная строка "15 - 30 minutes"
    time_min: Integer,          -- Минимальное время (минуты)
    time_max: Integer,          -- Максимальное время (минуты)
    
    -- Контент
    introduction: String,       -- Введение (EN)
    introduction_ru: String,    -- Введение (RU)
    conclusion: String,         -- Заключение (EN)
    conclusion_ru: String,      -- Заключение (RU)
    summary: String,            -- Краткое описание
    summary_ru: String,
    
    -- Флаги
    featured: Boolean,          -- Рекомендованный
    public: Boolean,
    patrol_threshold: Integer,
    
    -- Статистика
    step_count: Integer,
    view_count: Integer,
    
    -- Статусы контента
    text_status: String,        -- "original" | "rewritten" | "reviewed" | "custom"
    images_status: String,      -- "ifixit" | "mixed" | "own"
    translation_status: String, -- "none" | "auto" | "manual" | "verified"
    
    -- Источник
    source_url: String,
    source_id: Integer,
    locale: String,             -- "en"
    
    -- Локальные данные (для сервиса)
    price_rub: Integer,         -- Цена ремонта
    avg_repair_time: Integer,   -- Реальное время ремонта
    success_rate: Float,        -- Процент успешных ремонтов
    notes: String,              -- Заметки мастеров
    
    created_at: DateTime,
    modified_at: DateTime,      -- Дата изменения в iFixit
    updated_at: DateTime        -- Дата обновления в нашей БД
})
```

#### Step (Шаг инструкции)
```cypher
(:Step {
    id: Integer,
    guide_id: Integer,          -- Связь с гайдом
    order: Integer,             -- Порядковый номер (1, 2, 3...)
    
    -- Контент
    title: String,              -- Заголовок шага (если есть)
    title_ru: String,
    
    -- Текст (массив bullet points)
    lines: [Map],               -- [{text, level, bullet}]
    lines_text: String,         -- Объединённый текст (EN)
    lines_text_ru: String,      -- Объединённый текст (RU)
    
    -- Специальные блоки
    warnings: [String],         -- Предупреждения (EN)
    warnings_ru: [String],
    tips: [String],             -- Советы (EN)  
    tips_ru: [String],
    notes: [String],            -- Заметки (EN)
    notes_ru: [String],
    reminders: [String],        -- Напоминания
    reminders_ru: [String],
    
    -- Статусы
    text_status: String,
    images_status: String,
    
    created_at: DateTime,
    updated_at: DateTime
})
```

#### Tool (Инструмент)
```cypher
(:Tool {
    id: Integer,
    
    -- Названия
    name: String,               -- "Phillips #00 Screwdriver"
    name_ru: String,            -- "Крестовая отвёртка Phillips #00"
    
    -- Описание
    description: String,
    description_ru: String,
    
    -- Медиа
    url: String,                -- Ссылка на iFixit
    image_url: String,
    thumbnail_url: String,
    
    -- Тип
    type: String,               -- "screwdriver", "spudger", "tweezers", etc.
    
    -- Локальные данные
    price_rub: Integer,
    suppliers_ru: [Map],        -- [{name, url, price}]
    alternatives: [String],     -- Альтернативные инструменты
    in_stock: Boolean,
    
    -- Статистика
    usage_count: Integer,       -- Сколько раз используется
    
    created_at: DateTime,
    updated_at: DateTime
})
```

#### Part (Запчасть)
```cypher
(:Part {
    id: Integer,
    
    -- Названия
    name: String,
    name_ru: String,
    
    -- Идентификаторы
    sku: String,                -- Артикул iFixit
    part_number: String,        -- Номер детали производителя
    
    -- Медиа
    url: String,
    image_url: String,
    thumbnail_url: String,
    
    -- Цены iFixit
    price_usd: Float,
    
    -- Локальные данные
    price_rub: Integer,
    suppliers_ru: [Map],        -- [{name, url, price, quality}]
    quality_grade: String,      -- "original", "oem", "refurbished", "copy"
    in_stock: Boolean,
    lead_time_days: Integer,    -- Срок доставки
    
    -- Статистика
    usage_count: Integer,
    
    created_at: DateTime,
    updated_at: DateTime
})
```

#### Image (Изображение)
```cypher
(:Image {
    id: Integer,                -- ID из iFixit
    guid: String,               -- GUID изображения
    
    -- URL разных размеров (iFixit)
    url_mini: String,           -- 56x42
    url_thumbnail: String,      -- 96x72
    url_140x105: String,
    url_200x150: String,
    url_standard: String,       -- 300x225
    url_440x330: String,
    url_medium: String,         -- 592x444
    url_large: String,          -- 800x600
    url_huge: String,           -- 1600x1200
    url_original: String,       -- Оригинал
    
    -- Свои изображения
    url_own: String,            -- URL своего фото
    local_path: String,         -- Локальный путь
    
    -- Метаданные
    width: Integer,
    height: Integer,
    
    -- Статус
    status: String,             -- "temporary" | "downloaded" | "replaced"
    downloaded: Boolean,
    
    created_at: DateTime,
    replaced_at: DateTime
})
```

#### Document (Wiki страница)
```cypher
(:Document {
    id: Integer,
    
    -- Названия
    title: String,
    title_ru: String,
    
    -- Тип
    type: String,               -- "wiki", "info", "troubleshooting"
    
    -- Контент
    content_raw: String,        -- Raw wiki markup
    content_html: String,       -- HTML
    content_text: String,       -- Plain text
    content_ru: String,         -- Русский перевод
    
    -- Источник
    source_url: String,
    
    -- Статус
    text_status: String,
    
    created_at: DateTime,
    updated_at: DateTime
})
```

---

### Связи (Relationships)

```cypher
-- ═══════════════════════════════════════════════════════════
-- ИЕРАРХИЯ КАТЕГОРИЙ
-- ═══════════════════════════════════════════════════════════

-- Родительская категория
(:Category)-[:PARENT_OF]->(:Category)

-- Пример: Electronics -> Phone -> iPhone
-- (Electronics)-[:PARENT_OF]->(Phone)-[:PARENT_OF]->(iPhone)


-- ═══════════════════════════════════════════════════════════
-- БРЕНДЫ И УСТРОЙСТВА  
-- ═══════════════════════════════════════════════════════════

-- Бренд производит устройства
(:Brand)-[:PRODUCES]->(:Device)

-- Устройство принадлежит категории
(:Device)-[:BELONGS_TO]->(:Category)

-- Устройство имеет wiki-страницу
(:Device)-[:HAS_WIKI]->(:Document)


-- ═══════════════════════════════════════════════════════════
-- ГАЙДЫ
-- ═══════════════════════════════════════════════════════════

-- Гайд ремонтирует устройство
(:Guide)-[:REPAIRS]->(:Device)

-- Гайд принадлежит категории (для skill guides без устройства)
(:Guide)-[:BELONGS_TO]->(:Category)

-- Гайд требует предварительного выполнения другого гайда
(:Guide)-[:PREREQUISITE {order: Integer}]->(:Guide)

-- Гайд содержит шаги
(:Guide)-[:HAS_STEP {order: Integer}]->(:Step)

-- Гайд требует инструменты (сводный список)
(:Guide)-[:REQUIRES_TOOL {quantity: Integer, optional: Boolean}]->(:Tool)

-- Гайд требует запчасти (сводный список)
(:Guide)-[:REQUIRES_PART {quantity: Integer}]->(:Part)

-- Главное изображение гайда
(:Guide)-[:HAS_MAIN_IMAGE]->(:Image)

-- Автор гайда (если нужно)
(:Guide)-[:AUTHORED_BY]->(:Author)


-- ═══════════════════════════════════════════════════════════
-- ШАГИ
-- ═══════════════════════════════════════════════════════════

-- Шаг содержит изображения
(:Step)-[:HAS_IMAGE {order: Integer, marker: String}]->(:Image)
-- marker: для маркировки областей на фото (красный/оранжевый/жёлтый круг)

-- Шаг требует инструмент
(:Step)-[:REQUIRES_TOOL {quantity: Integer}]->(:Tool)

-- Шаг требует запчасть
(:Step)-[:REQUIRES_PART {quantity: Integer}]->(:Part)

-- Шаг ссылается на другой гайд
(:Step)-[:REFERENCES]->(:Guide)


-- ═══════════════════════════════════════════════════════════
-- ДОПОЛНИТЕЛЬНЫЕ СВЯЗИ
-- ═══════════════════════════════════════════════════════════

-- Совместимость запчастей
(:Part)-[:COMPATIBLE_WITH]->(:Device)

-- Альтернативный инструмент
(:Tool)-[:ALTERNATIVE_TO]->(:Tool)

-- Связанные гайды
(:Guide)-[:RELATED_TO]->(:Guide)
```

---

## Структура проекта

```
ifixit-full-parser/
│
├── docker-compose.yml
├── .env.example
├── .env
├── README.md
├── Makefile                    # Команды для запуска
├── pyproject.toml              # Poetry/pip конфиг
│
├── src/
│   ├── __init__.py
│   ├── config.py               # Глобальная конфигурация
│   │
│   ├── parser/
│   │   ├── __init__.py
│   │   ├── main.py             # Точка входа парсера
│   │   │
│   │   ├── api/
│   │   │   ├── __init__.py
│   │   │   ├── client.py       # HTTP клиент (httpx/aiohttp)
│   │   │   ├── rate_limiter.py # Token bucket rate limiter
│   │   │   ├── endpoints.py    # Все эндпоинты API
│   │   │   └── retry.py        # Retry логика
│   │   │
│   │   ├── models/
│   │   │   ├── __init__.py
│   │   │   ├── api_models.py   # Pydantic модели ответов API
│   │   │   ├── graph_models.py # Модели для Neo4j
│   │   │   └── enums.py        # Enum'ы (статусы, типы)
│   │   │
│   │   ├── extractors/
│   │   │   ├── __init__.py
│   │   │   ├── base.py         # Базовый класс экстрактора
│   │   │   ├── categories.py   # Извлечение категорий
│   │   │   ├── devices.py      # Извлечение устройств
│   │   │   ├── guides.py       # Извлечение гайдов
│   │   │   ├── steps.py        # Извлечение шагов
│   │   │   ├── tools.py        # Извлечение инструментов
│   │   │   ├── parts.py        # Извлечение запчастей
│   │   │   └── media.py        # Извлечение медиа
│   │   │
│   │   ├── storage/
│   │   │   ├── __init__.py
│   │   │   ├── json_storage.py # Сохранение в JSON
│   │   │   ├── image_storage.py# Скачивание изображений
│   │   │   └── checkpoint.py   # Сохранение прогресса
│   │   │
│   │   └── utils/
│   │       ├── __init__.py
│   │       ├── logger.py
│   │       ├── progress.py     # Progress bar
│   │       └── helpers.py
│   │
│   ├── rewriter/
│   │   ├── __init__.py
│   │   ├── main.py             # Точка входа rewriter
│   │   │
│   │   ├── prompts/
│   │   │   ├── __init__.py
│   │   │   ├── system.py       # Системные промпты
│   │   │   ├── guide.py        # Промпты для гайдов
│   │   │   ├── step.py         # Промпты для шагов
│   │   │   └── tools.py        # Промпты для инструментов
│   │   │
│   │   ├── processors/
│   │   │   ├── __init__.py
│   │   │   ├── translator.py   # EN → RU
│   │   │   ├── rewriter.py     # Переработка текста
│   │   │   ├── batch.py        # Batch processing
│   │   │   └── validator.py    # Валидация качества
│   │   │
│   │   └── clients/
│   │       ├── __init__.py
│   │       ├── base.py         # Базовый класс
│   │       ├── openai.py       # OpenAI GPT
│   │       └── anthropic.py    # Anthropic Claude
│   │
│   ├── loader/
│   │   ├── __init__.py
│   │   ├── main.py             # Точка входа загрузчика
│   │   │
│   │   ├── neo4j/
│   │   │   ├── __init__.py
│   │   │   ├── client.py       # Neo4j driver wrapper
│   │   │   ├── connection.py   # Connection pool
│   │   │   └── queries/
│   │   │       ├── __init__.py
│   │   │       ├── constraints.cypher
│   │   │       ├── indexes.cypher
│   │   │       └── common.py
│   │   │
│   │   └── importers/
│   │       ├── __init__.py
│   │       ├── base.py         # Базовый импортер
│   │       ├── categories.py
│   │       ├── brands.py
│   │       ├── devices.py
│   │       ├── guides.py
│   │       ├── steps.py
│   │       ├── tools.py
│   │       ├── parts.py
│   │       ├── images.py
│   │       └── relationships.py
│   │
│   └── api/
│       ├── __init__.py
│       ├── main.py             # FastAPI app
│       │
│       ├── routes/
│       │   ├── __init__.py
│       │   ├── categories.py
│       │   ├── brands.py
│       │   ├── devices.py
│       │   ├── guides.py
│       │   ├── search.py
│       │   ├── stats.py
│       │   └── health.py
│       │
│       ├── services/
│       │   ├── __init__.py
│       │   ├── graph.py        # Сервис работы с графом
│       │   ├── search.py       # Полнотекстовый поиск
│       │   └── cache.py        # Redis кэш
│       │
│       ├── schemas/
│       │   ├── __init__.py
│       │   ├── category.py
│       │   ├── device.py
│       │   ├── guide.py
│       │   └── common.py
│       │
│       └── middleware/
│           ├── __init__.py
│           └── logging.py
│
├── scripts/
│   ├── init_db.py              # Инициализация Neo4j
│   ├── run_full_parse.py       # Полный парсинг
│   ├── run_category_parse.py   # Парсинг одной категории
│   ├── run_rewriter.py         # Запуск переработки
│   ├── export_stats.py         # Экспорт статистики
│   └── cleanup.py              # Очистка данных
│
├── tests/
│   ├── __init__.py
│   ├── conftest.py
│   ├── test_parser/
│   ├── test_rewriter/
│   ├── test_loader/
│   └── test_api/
│
├── data/
│   ├── raw/                    # Сырые JSON данные
│   │   ├── categories/
│   │   ├── devices/
│   │   ├── guides/
│   │   └── metadata/
│   │
│   ├── processed/              # Обработанные данные
│   │   ├── translated/
│   │   └── rewritten/
│   │
│   ├── images/                 # Изображения
│   │   ├── ifixit/             # Скачанные с iFixit
│   │   │   ├── mini/
│   │   │   ├── thumbnail/
│   │   │   ├── standard/
│   │   │   └── large/
│   │   └── own/                # Свои фотографии
│   │
│   ├── checkpoints/            # Точки сохранения прогресса
│   │
│   └── exports/                # Экспорты данных
│
└── docs/
    ├── api.md                  # Документация API
    ├── schema.md               # Схема данных
    └── deployment.md           # Инструкция по деплою
```

---

## Порядок парсинга

### Приоритет категорий

| Приоритет | Категория | Гайдов | Время парсинга* | Комментарий |
|-----------|-----------|--------|-----------------|-------------|
| 1 | Phone | 5,120 | 3-4 часа | Основной бизнес |
| 2 | Tablet | 1,493 | 1 час | Связан с Phone |
| 3 | Mac | 1,354 | 1 час | Популярная категория |
| 4 | Game Console | 1,213 | 45 мин | Высокий спрос |
| 5 | PC | 9,845 | 6-7 часов | Большая категория |
| 6 | Computer Hardware | 2,319 | 1.5 часа | Связан с PC |
| 7 | Electronics | 6,395 | 4 часа | Разнообразная |
| 8 | Appliance | 8,597 | 5-6 часов | Бытовая техника |
| 9 | Camera | 2,027 | 1.5 часа | |
| 10 | Household | 2,063 | 1.5 часа | |
| 11 | Tool | 6,128 | 4 часа | |
| 12 | Car and Truck | 1,455 | 1 час | |
| 13 | Vehicle | 479 | 20 мин | |
| 14 | Medical Device | 9,687 | 6-7 часов | Специфичная |
| 15 | Apparel | 707 | 30 мин | |
| 16 | Skills | 334 | 15 мин | Базовые навыки |

*При rate limit 1 запрос / 2 секунды

### Общее время парсинга

```
Всего гайдов: ~60,000
Запросов на гайд: 1 (список) + 1 (детали) = 2
Всего запросов: ~120,000 + категории + устройства ≈ 130,000

При 1 req/2 sec: 130,000 × 2 = 260,000 сек ≈ 72 часа ≈ 3 дня

С параллелизмом (5 workers): ~15-20 часов
```

---

## iFixit API Endpoints

### Категории

```python
# Получить все категории (дерево)
GET /api/2.0/categories

# Получить категорию с устройствами
GET /api/2.0/categories/{category}

# Получить wiki страницу категории
GET /api/2.0/wikis/CATEGORY/{title}
```

### Гайды

```python
# Список всех гайдов (пагинация)
GET /api/2.0/guides?limit=200&offset=0

# Гайды по категории
GET /api/2.0/guides?category={category}&limit=200&offset=0

# Детали гайда (все шаги, инструменты, запчасти)
GET /api/2.0/guides/{guideid}
```

### Поиск

```python
# Поиск по всему контенту
GET /api/2.0/search/{query}?filter=guide&limit=100

# Автодополнение
GET /api/2.0/suggest/{query}
```

### Медиа

```python
# Получить изображение в разных размерах
GET /api/2.0/media/{imageid}

# Размеры: mini, thumbnail, standard, medium, large, huge, original
```

---

## Конфигурация

### .env

```bash
# ═══════════════════════════════════════════════════════════
# NEO4J
# ═══════════════════════════════════════════════════════════
NEO4J_URI=bolt://localhost:7687
NEO4J_USER=neo4j
NEO4J_PASSWORD=your_secure_password
NEO4J_DATABASE=ifixit

# ═══════════════════════════════════════════════════════════
# IFIXIT API
# ═══════════════════════════════════════════════════════════
IFIXIT_API_URL=https://www.ifixit.com/api/2.0
IFIXIT_RATE_LIMIT_SECONDS=2
IFIXIT_MAX_RETRIES=3
IFIXIT_TIMEOUT_SECONDS=30

# ═══════════════════════════════════════════════════════════
# PARSER
# ═══════════════════════════════════════════════════════════
PARSER_WORKERS=5
PARSER_BATCH_SIZE=100
PARSER_SAVE_RAW_JSON=true
PARSER_DOWNLOAD_IMAGES=true
PARSER_IMAGE_SIZES=thumbnail,standard,large
PARSER_DATA_DIR=./data
PARSER_CHECKPOINT_INTERVAL=100

# ═══════════════════════════════════════════════════════════
# AI REWRITER
# ═══════════════════════════════════════════════════════════
OPENAI_API_KEY=sk-...
ANTHROPIC_API_KEY=sk-ant-...
REWRITER_PROVIDER=openai
REWRITER_MODEL=gpt-4o-mini
REWRITER_BATCH_SIZE=10
REWRITER_MAX_TOKENS=4000
REWRITER_TEMPERATURE=0.3

# ═══════════════════════════════════════════════════════════
# API
# ═══════════════════════════════════════════════════════════
API_HOST=0.0.0.0
API_PORT=8000
API_DEBUG=false
API_CORS_ORIGINS=["http://localhost:3000"]

# ═══════════════════════════════════════════════════════════
# REDIS (опционально, для кэша)
# ═══════════════════════════════════════════════════════════
REDIS_URL=redis://localhost:6379/0

# ═══════════════════════════════════════════════════════════
# LOGGING
# ═══════════════════════════════════════════════════════════
LOG_LEVEL=INFO
LOG_FORMAT=json
```

### docker-compose.yml

```yaml
version: '3.8'

services:
  # ═══════════════════════════════════════════════════════════
  # NEO4J DATABASE
  # ═══════════════════════════════════════════════════════════
  neo4j:
    image: neo4j:5-community
    container_name: ifixit-neo4j
    ports:
      - "7474:7474"   # HTTP Browser
      - "7687:7687"   # Bolt
    volumes:
      - neo4j_data:/data
      - neo4j_logs:/logs
      - neo4j_plugins:/plugins
    environment:
      - NEO4J_AUTH=neo4j/${NEO4J_PASSWORD}
      - NEO4J_PLUGINS=["apoc"]
      - NEO4J_apoc_export_file_enabled=true
      - NEO4J_apoc_import_file_enabled=true
      - NEO4J_dbms_memory_heap_initial__size=1G
      - NEO4J_dbms_memory_heap_max__size=4G
      - NEO4J_dbms_memory_pagecache_size=2G
    healthcheck:
      test: ["CMD", "neo4j", "status"]
      interval: 10s
      timeout: 5s
      retries: 5
    restart: unless-stopped

  # ═══════════════════════════════════════════════════════════
  # REDIS CACHE (опционально)
  # ═══════════════════════════════════════════════════════════
  redis:
    image: redis:7-alpine
    container_name: ifixit-redis
    ports:
      - "6379:6379"
    volumes:
      - redis_data:/data
    restart: unless-stopped

  # ═══════════════════════════════════════════════════════════
  # PARSER SERVICE
  # ═══════════════════════════════════════════════════════════
  parser:
    build:
      context: .
      dockerfile: docker/Dockerfile.parser
    container_name: ifixit-parser
    depends_on:
      neo4j:
        condition: service_healthy
    volumes:
      - ./data:/app/data
      - ./src:/app/src:ro
    environment:
      - NEO4J_URI=bolt://neo4j:7687
      - NEO4J_USER=neo4j
      - NEO4J_PASSWORD=${NEO4J_PASSWORD}
    env_file:
      - .env
    command: ["python", "-m", "src.parser.main"]

  # ═══════════════════════════════════════════════════════════
  # REWRITER SERVICE
  # ═══════════════════════════════════════════════════════════
  rewriter:
    build:
      context: .
      dockerfile: docker/Dockerfile.rewriter
    container_name: ifixit-rewriter
    depends_on:
      neo4j:
        condition: service_healthy
    volumes:
      - ./data:/app/data
      - ./src:/app/src:ro
    environment:
      - NEO4J_URI=bolt://neo4j:7687
      - NEO4J_USER=neo4j
      - NEO4J_PASSWORD=${NEO4J_PASSWORD}
    env_file:
      - .env
    command: ["python", "-m", "src.rewriter.main"]
    profiles:
      - rewrite

  # ═══════════════════════════════════════════════════════════
  # API SERVICE
  # ═══════════════════════════════════════════════════════════
  api:
    build:
      context: .
      dockerfile: docker/Dockerfile.api
    container_name: ifixit-api
    ports:
      - "8000:8000"
    depends_on:
      neo4j:
        condition: service_healthy
    environment:
      - NEO4J_URI=bolt://neo4j:7687
      - NEO4J_USER=neo4j
      - NEO4J_PASSWORD=${NEO4J_PASSWORD}
      - REDIS_URL=redis://redis:6379/0
    env_file:
      - .env
    command: ["uvicorn", "src.api.main:app", "--host", "0.0.0.0", "--port", "8000"]
    restart: unless-stopped

volumes:
  neo4j_data:
  neo4j_logs:
  neo4j_plugins:
  redis_data:
```

---

## Neo4j Constraints и Indexes

```cypher
-- ═══════════════════════════════════════════════════════════
-- CONSTRAINTS (уникальность)
-- ═══════════════════════════════════════════════════════════

CREATE CONSTRAINT category_name IF NOT EXISTS
FOR (c:Category) REQUIRE c.name IS UNIQUE;

CREATE CONSTRAINT brand_name IF NOT EXISTS
FOR (b:Brand) REQUIRE b.name IS UNIQUE;

CREATE CONSTRAINT device_id IF NOT EXISTS
FOR (d:Device) REQUIRE d.id IS UNIQUE;

CREATE CONSTRAINT guide_id IF NOT EXISTS
FOR (g:Guide) REQUIRE g.id IS UNIQUE;

CREATE CONSTRAINT step_id IF NOT EXISTS
FOR (s:Step) REQUIRE s.id IS UNIQUE;

CREATE CONSTRAINT tool_name IF NOT EXISTS
FOR (t:Tool) REQUIRE t.name IS UNIQUE;

CREATE CONSTRAINT image_id IF NOT EXISTS
FOR (i:Image) REQUIRE i.id IS UNIQUE;


-- ═══════════════════════════════════════════════════════════
-- INDEXES (производительность)
-- ═══════════════════════════════════════════════════════════

-- Поиск по названиям
CREATE INDEX device_name IF NOT EXISTS FOR (d:Device) ON (d.name);
CREATE INDEX guide_title IF NOT EXISTS FOR (g:Guide) ON (g.title);
CREATE INDEX guide_title_ru IF NOT EXISTS FOR (g:Guide) ON (g.title_ru);
CREATE INDEX tool_name_idx IF NOT EXISTS FOR (t:Tool) ON (t.name);

-- Фильтрация по типам и статусам
CREATE INDEX guide_type IF NOT EXISTS FOR (g:Guide) ON (g.type);
CREATE INDEX guide_difficulty IF NOT EXISTS FOR (g:Guide) ON (g.difficulty);
CREATE INDEX guide_text_status IF NOT EXISTS FOR (g:Guide) ON (g.text_status);
CREATE INDEX guide_images_status IF NOT EXISTS FOR (g:Guide) ON (g.images_status);

-- Сортировка
CREATE INDEX guide_difficulty_num IF NOT EXISTS FOR (g:Guide) ON (g.difficulty_num);
CREATE INDEX device_popularity IF NOT EXISTS FOR (d:Device) ON (d.popularity);

-- Полнотекстовый поиск
CREATE FULLTEXT INDEX guide_search IF NOT EXISTS
FOR (g:Guide) ON EACH [g.title, g.title_ru, g.introduction_ru];

CREATE FULLTEXT INDEX device_search IF NOT EXISTS
FOR (d:Device) ON EACH [d.name, d.name_ru, d.display_title];


-- ═══════════════════════════════════════════════════════════
-- COMPOSITE INDEXES
-- ═══════════════════════════════════════════════════════════

CREATE INDEX guide_category_difficulty IF NOT EXISTS
FOR (g:Guide) ON (g.type, g.difficulty_num);
```

---

## Примеры Cypher запросов

### Базовые запросы

```cypher
-- Получить все категории верхнего уровня
MATCH (c:Category)
WHERE c.level = 0
RETURN c.name, c.name_ru, c.guide_count, c.device_count
ORDER BY c.guide_count DESC

-- Дерево категорий
MATCH path = (root:Category {name: "Phone"})-[:PARENT_OF*0..3]->(child:Category)
RETURN path

-- Все устройства бренда
MATCH (b:Brand {name: "Apple"})-[:PRODUCES]->(d:Device)
RETURN d.name, d.guide_count
ORDER BY d.guide_count DESC
LIMIT 20
```

### Гайды

```cypher
-- Гайды для устройства с полной информацией
MATCH (d:Device {name: "iPhone 12"})<-[:REPAIRS]-(g:Guide)
OPTIONAL MATCH (g)-[:HAS_MAIN_IMAGE]->(img:Image)
OPTIONAL MATCH (g)-[:REQUIRES_TOOL]->(t:Tool)
RETURN g.title_ru, g.difficulty, g.time_min, g.time_max,
       img.url_thumbnail,
       collect(DISTINCT t.name_ru) AS tools
ORDER BY g.difficulty_num

-- Полный гайд со всеми шагами
MATCH (g:Guide {id: 136578})
OPTIONAL MATCH (g)-[hs:HAS_STEP]->(s:Step)
OPTIONAL MATCH (s)-[hi:HAS_IMAGE]->(img:Image)
OPTIONAL MATCH (s)-[:REQUIRES_TOOL]->(t:Tool)
WITH g, s, collect(DISTINCT img) AS images, 
     collect(DISTINCT t.name_ru) AS tools
ORDER BY s.order
RETURN g {
    .id, .title_ru, .difficulty, .introduction_ru,
    steps: collect({
        order: s.order,
        text: s.lines_text_ru,
        warnings: s.warnings_ru,
        tips: s.tips_ru,
        images: [img IN images | img.url_standard],
        tools: tools
    })
}

-- Цепочка prerequisite
MATCH path = (g:Guide {id: 136578})-[:PREREQUISITE*]->(prereq:Guide)
RETURN [n IN nodes(path) | {id: n.id, title: n.title_ru}] AS chain
```

### Инструменты и запчасти

```cypher
-- Топ инструментов для категории
MATCH (c:Category {name: "Phone"})<-[:BELONGS_TO]-(d:Device)
      <-[:REPAIRS]-(g:Guide)-[:REQUIRES_TOOL]->(t:Tool)
WITH t, count(DISTINCT g) AS usage
RETURN t.name, t.name_ru, usage,
       t.price_rub, t.suppliers_ru
ORDER BY usage DESC
LIMIT 20

-- Запчасти для модели
MATCH (d:Device {name: "iPhone 12"})<-[:REPAIRS]-(g:Guide)
      -[:REQUIRES_PART]->(p:Part)
WITH p, count(DISTINCT g) AS guides
RETURN p.name, p.name_ru, p.price_rub, guides
ORDER BY guides DESC
```

### Статистика и аналитика

```cypher
-- Прогресс переработки контента
MATCH (g:Guide)
WITH g.text_status AS status, count(*) AS cnt
WITH collect({status: status, count: cnt}) AS stats, sum(cnt) AS total
UNWIND stats AS s
RETURN s.status, s.count, 
       round(100.0 * s.count / total, 2) AS percentage
ORDER BY s.count DESC

-- Категории с непереработанным контентом
MATCH (c:Category)<-[:BELONGS_TO]-(d:Device)<-[:REPAIRS]-(g:Guide)
WHERE g.text_status = 'original'
WITH c, count(g) AS original_count
RETURN c.name, original_count
ORDER BY original_count DESC

-- Устройства с наибольшим количеством гайдов
MATCH (d:Device)<-[:REPAIRS]-(g:Guide)
WITH d, count(g) AS guide_count
RETURN d.name, guide_count
ORDER BY guide_count DESC
LIMIT 50

-- Гайды, требующие замены фото
MATCH (g:Guide)-[:HAS_STEP]->(s:Step)-[:HAS_IMAGE]->(i:Image)
WHERE i.status = 'temporary'
WITH g, count(DISTINCT i) AS temp_images
WHERE temp_images > 0
RETURN g.id, g.title_ru, temp_images
ORDER BY temp_images DESC
LIMIT 100
```

### Поиск

```cypher
-- Полнотекстовый поиск по гайдам
CALL db.index.fulltext.queryNodes('guide_search', 'замена экрана iPhone')
YIELD node, score
RETURN node.id, node.title_ru, score
LIMIT 20

-- Поиск устройств
CALL db.index.fulltext.queryNodes('device_search', 'Galaxy S21')
YIELD node, score
MATCH (node)<-[:REPAIRS]-(g:Guide)
RETURN node.name, count(g) AS guides, score
ORDER BY score DESC
LIMIT 10
```

---

## Makefile

```makefile
.PHONY: help setup up down logs parse rewrite api test clean

help:
	@echo "Доступные команды:"
	@echo "  make setup    - Первоначальная настройка"
	@echo "  make up       - Запуск всех сервисов"
	@echo "  make down     - Остановка всех сервисов"
	@echo "  make logs     - Просмотр логов"
	@echo "  make parse    - Запуск полного парсинга"
	@echo "  make rewrite  - Запуск AI переработки"
	@echo "  make api      - Запуск только API"
	@echo "  make test     - Запуск тестов"
	@echo "  make clean    - Очистка данных"

setup:
	cp .env.example .env
	mkdir -p data/{raw,processed,images,checkpoints,exports}
	docker-compose pull

up:
	docker-compose up -d neo4j redis
	@echo "Ожидание запуска Neo4j..."
	sleep 30
	docker-compose up -d api

down:
	docker-compose down

logs:
	docker-compose logs -f

parse:
	docker-compose run --rm parser python -m src.parser.main --full

parse-category:
	docker-compose run --rm parser python -m src.parser.main --category $(CATEGORY)

rewrite:
	docker-compose --profile rewrite up rewriter

api:
	docker-compose up -d api

test:
	docker-compose run --rm parser pytest tests/

clean:
	rm -rf data/raw/* data/processed/* data/checkpoints/*
	docker-compose down -v

# Утилиты
stats:
	docker-compose exec neo4j cypher-shell -u neo4j -p $NEO4J_PASSWORD \
		"MATCH (g:Guide) RETURN g.text_status, count(*)"

backup:
	docker-compose exec neo4j neo4j-admin database dump neo4j \
		--to-path=/backups/
```

---

## Метрики и мониторинг

### Метрики парсинга

| Метрика | Описание |
|---------|----------|
| `parser_requests_total` | Всего запросов к API |
| `parser_requests_failed` | Неудачных запросов |
| `parser_guides_parsed` | Спарсено гайдов |
| `parser_images_downloaded` | Скачано изображений |
| `parser_rate_limit_hits` | Срабатываний rate limit |

### Метрики контента

| Метрика | Старт | 1 неделя | 1 месяц | 3 месяца |
|---------|-------|----------|---------|----------|
| Всего гайдов | 0 | 60,000 | 60,000 | 65,000+ |
| Текст переработан | 0% | 10% | 50% | 100% |
| Переведено на RU | 0% | 20% | 70% | 100% |
| Свои фото | 0% | 0% | 5% | 20% |

---

## Checklist запуска

### День 1: Инфраструктура

- [ ] Настроить Docker Compose
- [ ] Поднять Neo4j
- [ ] Создать constraints и indexes
- [ ] Проверить подключение к API iFixit

### День 2-3: Парсер

- [ ] Реализовать API client с rate limiter
- [ ] Реализовать экстракторы категорий
- [ ] Реализовать экстракторы устройств
- [ ] Реализовать экстракторы гайдов
- [ ] Реализовать загрузчик в Neo4j
- [ ] Добавить checkpoint/resume логику

### День 4: Запуск парсинга

- [ ] Запустить парсинг Phone категории (тест)
- [ ] Проверить качество данных в Neo4j
- [ ] Запустить полный парсинг всех категорий
- [ ] Мониторить прогресс

### День 5-6: AI Rewriter

- [ ] Настроить промпты для перевода
- [ ] Реализовать batch processing
- [ ] Запустить переработку приоритетных категорий
- [ ] Валидация качества перевода

### День 7: API

- [ ] Реализовать REST API
- [ ] Добавить поиск
- [ ] Документация OpenAPI
- [ ] Деплой

---

*Документ создан: 2024*
*Версия: 2.0 (Full Parse)*
*Общий объём: ~60,000 гайдов*