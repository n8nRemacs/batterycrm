# iFixit Parser - База знаний по ремонтам для Eldoleado

## Цель проекта

Создание собственной базы знаний по ремонту электроники на основе данных iFixit.com для:
1. **AI-ассистента** - подсказки операторам и автоматические ответы клиентам
2. **Оценки стоимости** - автоматический расчёт на основе типа ремонта и модели
3. **Обучения персонала** - структурированные инструкции по ремонту
4. **Аналитики** - понимание популярных проблем и устройств

---

## Архитектура системы

### Компоненты

```
┌─────────────────┐     ┌──────────────────┐     ┌─────────────────┐
│   iFixit API    │────>│  iFixit Parser   │────>│   PostgreSQL    │
│   (источник)    │     │  (Python async)  │     │   (ifixit_kb)   │
└─────────────────┘     └──────────────────┘     └─────────────────┘
                                │                         │
                                v                         v
                        ┌──────────────────┐     ┌─────────────────┐
                        │     Neo4j        │     │   Eldoleado     │
                        │   (KB_ графы)    │     │     CRM         │
                        └──────────────────┘     └─────────────────┘
```

### Технологии

| Компонент | Технология | Назначение |
|-----------|------------|------------|
| Парсер | Python 3.10+, asyncio, httpx | Асинхронный сбор данных |
| CLI | Typer + Rich | Удобное управление |
| PostgreSQL | asyncpg, схема `ifixit_kb` | Реляционное хранение |
| Neo4j | neo4j async driver, префикс `KB_` | Графовые связи |
| Уведомления | Telegram Bot API | Мониторинг прогресса |

---

## Структура парсера

### Файловая структура

```
ifixit-parser/
├── src/
│   ├── config.py              # Pydantic Settings (.env)
│   ├── parser/
│   │   ├── api/
│   │   │   ├── client.py      # IFixitClient - HTTP клиент
│   │   │   └── rate_limiter.py # Rate limiting (2 сек/запрос)
│   │   ├── extractors/
│   │   │   ├── categories.py  # Парсинг категорий
│   │   │   ├── devices.py     # Парсинг устройств
│   │   │   └── guides.py      # Парсинг гайдов
│   │   ├── models/
│   │   │   └── api_models.py  # Pydantic модели
│   │   └── main.py            # CLI команды
│   ├── loader/
│   │   ├── postgres/
│   │   │   ├── client.py      # PostgresClient
│   │   │   └── schema.py      # SQL схема
│   │   └── neo4j/
│   │       └── client.py      # Neo4jClient
│   └── utils/
│       └── telegram.py        # TelegramNotifier
├── .env                       # Конфигурация
└── pyproject.toml             # Зависимости
```

### CLI команды

```bash
# Тест API
python -m src.parser.main test-api

# Инициализация БД
python -m src.parser.main init

# Парсинг категорий
python -m src.parser.main parse-categories

# Полный парсинг конкретной категории
python -m src.parser.main full-parse --category Phone

# Умный парсинг всех уровней (рекомендуется)
python -m src.parser.main smart-parse --max-level 15 --batch 20 --delay 3

# Статистика
python -m src.parser.main stats
```

---

## Текущая структура данных

### PostgreSQL (схема `ifixit_kb`)

#### Таблица `categories`
```sql
CREATE TABLE ifixit_kb.categories (
    id UUID PRIMARY KEY,
    name VARCHAR(255) UNIQUE NOT NULL,
    title VARCHAR(500),
    description TEXT,
    image_url TEXT,
    parent_name VARCHAR(255),
    ancestors TEXT[],          -- ['Phone', 'iPhone', 'iPhone 15']
    level INTEGER DEFAULT 0,   -- Глубина в дереве
    guide_count INTEGER DEFAULT 0,
    device_count INTEGER DEFAULT 0,
    created_at TIMESTAMP DEFAULT NOW()
);
```

#### Таблица `devices`
```sql
CREATE TABLE ifixit_kb.devices (
    id UUID PRIMARY KEY,
    name VARCHAR(500) NOT NULL,
    display_title VARCHAR(500),
    category_name VARCHAR(255),
    brand VARCHAR(255),        -- Извлечённый бренд
    model VARCHAR(255),        -- Извлечённая модель
    image_url TEXT,
    guide_count INTEGER DEFAULT 0,
    ifixit_url TEXT,
    created_at TIMESTAMP DEFAULT NOW()
);
```

#### Таблица `guides`
```sql
CREATE TABLE ifixit_kb.guides (
    id UUID PRIMARY KEY,
    guideid INTEGER UNIQUE NOT NULL,  -- ID из iFixit
    title VARCHAR(1000) NOT NULL,
    type VARCHAR(100),         -- 'replacement', 'repair', 'teardown', etc.
    category VARCHAR(255),
    subject VARCHAR(500),      -- Устройство
    url TEXT,

    -- Контент
    introduction TEXT,
    conclusion TEXT,
    summary TEXT,

    -- Метаданные
    difficulty VARCHAR(50),    -- 'Easy', 'Moderate', 'Difficult', 'Very difficult'
    time_required VARCHAR(100),
    time_min_minutes INTEGER,
    time_max_minutes INTEGER,

    -- Флаги
    featured BOOLEAN DEFAULT FALSE,
    public BOOLEAN DEFAULT TRUE,

    -- Даты
    created_date TIMESTAMP,
    modified_date TIMESTAMP,

    -- Сырые данные
    raw_json JSONB,

    created_at TIMESTAMP DEFAULT NOW()
);
```

#### Таблица `steps`
```sql
CREATE TABLE ifixit_kb.steps (
    id UUID PRIMARY KEY,
    guide_id UUID REFERENCES guides(id),
    stepid INTEGER,
    orderby INTEGER,
    title VARCHAR(500),
    text_raw TEXT,             -- Полный текст шага
    warnings TEXT[],           -- Предупреждения
    tips TEXT[],               -- Советы
    notes TEXT[],              -- Примечания
    media JSONB,               -- Изображения/видео
    created_at TIMESTAMP DEFAULT NOW()
);
```

#### Таблица `tools`
```sql
CREATE TABLE ifixit_kb.tools (
    id UUID PRIMARY KEY,
    name VARCHAR(500) UNIQUE NOT NULL,
    url TEXT,
    thumbnail TEXT,
    created_at TIMESTAMP DEFAULT NOW()
);
```

#### Таблица `guide_tools` (связь многие-ко-многим)
```sql
CREATE TABLE ifixit_kb.guide_tools (
    guide_id UUID REFERENCES guides(id),
    tool_id UUID REFERENCES tools(id),
    notes TEXT,                -- Дополнительные заметки
    PRIMARY KEY (guide_id, tool_id)
);
```

### Neo4j (префикс `KB_`)

#### Узлы (Nodes)

```cypher
// Категория
(:KB_Category {
    uuid: "...",
    name: "iPhone 15",
    level: 2,
    guide_count: 45
})

// Устройство
(:KB_Device {
    uuid: "...",
    name: "iPhone 15 Pro Max",
    brand: "Apple",
    model: "iPhone 15 Pro Max"
})

// Гайд
(:KB_Guide {
    uuid: "...",
    guideid: 123456,
    title: "iPhone 15 Screen Replacement",
    type: "replacement",
    difficulty: "Moderate",
    time_min: 30,
    time_max: 60
})

// Инструмент
(:KB_Tool {
    uuid: "...",
    name: "Phillips #00 Screwdriver"
})

// Бренд
(:KB_Brand {
    name: "Apple"
})
```

#### Связи (Relationships)

```cypher
// Иерархия категорий
(:KB_Category)-[:KB_PARENT_OF]->(:KB_Category)

// Устройство в категории
(:KB_Category)-[:KB_HAS_DEVICE]->(:KB_Device)

// Гайд для категории/устройства
(:KB_Category)-[:KB_HAS_GUIDE]->(:KB_Guide)
(:KB_Device)-[:KB_HAS_GUIDE]->(:KB_Guide)

// Инструменты для гайда
(:KB_Guide)-[:KB_REQUIRES_TOOL]->(:KB_Tool)

// Бренд устройства
(:KB_Device)-[:KB_BRAND]->(:KB_Brand)
```

---

## Целевая структура для CRM

### Маппинг iFixit → Eldoleado CRM

```
iFixit                          Eldoleado CRM
──────                          ─────────────
Category (Phone/iPhone)    →    Brand (Apple)
Device (iPhone 15 Pro)     →    Model (iPhone 15 Pro)
Guide type (replacement)   →    Repair Category (Замена дисплея)
Tools                      →    Required Tools
Steps                      →    Work Instructions
Difficulty                 →    Skill Level Required
Time required              →    Estimated Time
```

### Таблицы CRM (существующие)

```sql
-- Бренды
brands (id, tenant_id, name, ...)

-- Модели
models (id, tenant_id, brand_id, name, ...)

-- Категории ремонта
repair_categories (id, tenant_id, name, ...)

-- Типы неисправностей
issue_types (id, tenant_id, repair_category_id, name, ...)

-- Работы
works (id, tenant_id, name, base_price, ...)

-- Запчасти
parts (id, tenant_id, name, sku, price, ...)
```

### Новые таблицы для базы знаний

```sql
-- Связь моделей CRM с iFixit
CREATE TABLE model_kb_mapping (
    id UUID PRIMARY KEY,
    model_id UUID REFERENCES models(id),
    ifixit_device_id UUID,     -- Ссылка на ifixit_kb.devices
    ifixit_category_name VARCHAR(255),
    confidence FLOAT,          -- Уверенность в маппинге
    verified BOOLEAN DEFAULT FALSE
);

-- База знаний по ремонтам
CREATE TABLE repair_knowledge (
    id UUID PRIMARY KEY,
    repair_category_id UUID REFERENCES repair_categories(id),
    model_id UUID REFERENCES models(id),

    -- Из iFixit
    ifixit_guide_id INTEGER,
    guide_title TEXT,
    guide_url TEXT,

    -- Структурированные данные
    difficulty VARCHAR(50),
    estimated_time_min INTEGER,
    estimated_time_max INTEGER,

    -- Извлечённые AI
    symptoms TEXT[],           -- Симптомы проблемы
    causes TEXT[],             -- Возможные причины
    solutions TEXT[],          -- Варианты решения
    warnings TEXT[],           -- Предупреждения

    -- Для расчёта стоимости
    required_parts JSONB,      -- [{name, sku, optional}]
    required_tools JSONB,      -- [{name, ifixit_url}]

    created_at TIMESTAMP DEFAULT NOW()
);
```

---

## Пример анализа гайда

### Исходный гайд: "iPhone Not Charging"

```json
{
  "title": "iPhone Not Charging",
  "type": "troubleshooting",
  "category": "iPhone",
  "difficulty": null,
  "introduction": "Use this page to troubleshoot why your iPhone might turn on, but won't hold a charge..."
}
```

### Структурированный результат

```json
{
  "repair_category": "Не заряжается",
  "variants": [
    {
      "issue": "Программный сбой (Firmware Issue)",
      "symptoms": ["Телефон не заряжается без видимых повреждений"],
      "solution": "Принудительная перезагрузка",
      "work": "Диагностика",
      "parts": [],
      "difficulty": "Easy",
      "time_min": 5
    },
    {
      "issue": "Неисправный кабель",
      "symptoms": ["Повреждённый кабель", "Изношенный разъём"],
      "solution": "Замена кабеля",
      "work": null,
      "parts": ["Кабель Lightning/USB-C"],
      "difficulty": "Easy",
      "time_min": 0,
      "note": "Клиент покупает сам"
    },
    {
      "issue": "Грязный порт зарядки",
      "symptoms": ["Пыль/мусор в порте"],
      "solution": "Чистка порта",
      "work": "Чистка разъёма",
      "parts": [],
      "difficulty": "Easy",
      "time_min": 10
    },
    {
      "issue": "Неисправный порт зарядки",
      "symptoms": ["Чистка не помогла", "Разболтанный разъём"],
      "solution": "Замена порта зарядки",
      "work": "Замена шлейфа порта зарядки",
      "parts": ["Шлейф порта зарядки {model}"],
      "difficulty": "Moderate",
      "time_min": 30,
      "model_specific": true
    }
  ]
}
```

---

## Процесс парсинга

### Текущий статус (04.12.2024)

```
Парсер: smart_parse --max-level 15 --batch 20 --delay 3
Сервер: 45.144.177.128
Screen: ifixit

Статистика Neo4j:
- Categories: 4909
- Guides: 2000+ (растёт)
- Tools: 160+
- Devices: 0 (появятся на Level 1+)
- Brands: 0 (появятся на Level 1+)

Скорость: ~30 гайдов/минуту
Оценка полного парсинга: 2-3 дня
```

### Защита от блокировки

1. **Rate limiting**: 2 секунды между запросами
2. **Batch delay**: 3 секунды между батчами (20 категорий)
3. **Последовательные запросы**: никакого параллелизма к API
4. **Telegram уведомления**: мониторинг ошибок в реальном времени

### Команды мониторинга

```bash
# Проверка статуса (Windows)
python check_parser.py      # Процессы и лог
python live_check.py        # Статистика Neo4j
python tail_log.py          # Последние строки лога

# На сервере
screen -r ifixit            # Подключиться к screen
tail -f /opt/ifixit-parser/parser.log  # Логи в реальном времени
```

---

## Следующие шаги

### Фаза 1: Сбор данных (текущая)
- [x] Разработка парсера
- [x] Деплой на сервер
- [x] Запуск smart_parse
- [ ] Дождаться завершения (~60,000 гайдов)

### Фаза 2: Анализ данных
- [ ] Изучить структуру собранных гайдов
- [ ] Определить типы гайдов (replacement, repair, teardown, troubleshooting)
- [ ] Выявить паттерны в названиях и контенте
- [ ] Оценить качество данных

### Фаза 3: AI-обработка
- [ ] Создать промпты для извлечения структуры
- [ ] Извлечь: симптомы, причины, решения, запчасти
- [ ] Классифицировать по категориям ремонта CRM
- [ ] Связать с моделями устройств

### Фаза 4: Интеграция с CRM
- [ ] Создать маппинг iFixit devices → CRM models
- [ ] Импортировать базу знаний в CRM
- [ ] Настроить AI-агента для использования знаний
- [ ] Автоматические подсказки операторам

### Фаза 5: Автоматизация
- [ ] Периодический парсинг новых гайдов
- [ ] Автообновление базы знаний
- [ ] Мониторинг изменений на iFixit

---

## Конфигурация (.env)

```env
# iFixit API
IFIXIT_API_BASE=https://www.ifixit.com/api/2.0

# PostgreSQL (Supabase)
POSTGRES_HOST=185.221.214.83
POSTGRES_PORT=6544
POSTGRES_USER=supabase_admin
POSTGRES_PASSWORD=***
POSTGRES_DB=postgres

# Neo4j
NEO4J_URI=bolt+ssc://45.144.177.128:7687
NEO4J_USER=neo4j
NEO4J_PASSWORD=***

# Telegram уведомления
TELEGRAM_BOT_TOKEN=***
TELEGRAM_CHAT_ID=***

# Настройки парсера
RATE_LIMIT_DELAY=2.0
DATA_DIR=data
```

---

## Полезные запросы

### PostgreSQL

```sql
-- Статистика по таблицам
SELECT
    'categories' as entity, COUNT(*) as count FROM ifixit_kb.categories
UNION ALL
SELECT 'devices', COUNT(*) FROM ifixit_kb.devices
UNION ALL
SELECT 'guides', COUNT(*) FROM ifixit_kb.guides
UNION ALL
SELECT 'tools', COUNT(*) FROM ifixit_kb.tools;

-- Гайды по типам
SELECT type, COUNT(*)
FROM ifixit_kb.guides
GROUP BY type
ORDER BY COUNT(*) DESC;

-- Гайды по сложности
SELECT difficulty, COUNT(*)
FROM ifixit_kb.guides
WHERE difficulty IS NOT NULL
GROUP BY difficulty;

-- Популярные инструменты
SELECT t.name, COUNT(gt.guide_id) as usage_count
FROM ifixit_kb.tools t
JOIN ifixit_kb.guide_tools gt ON t.id = gt.tool_id
GROUP BY t.name
ORDER BY usage_count DESC
LIMIT 20;
```

### Neo4j (Cypher)

```cypher
// Статистика узлов
MATCH (n)
RETURN labels(n)[0] as label, COUNT(*) as count
ORDER BY count DESC;

// Категории с наибольшим количеством гайдов
MATCH (c:KB_Category)-[:KB_HAS_GUIDE]->(g:KB_Guide)
RETURN c.name, COUNT(g) as guides
ORDER BY guides DESC
LIMIT 20;

// Путь от категории к гайду
MATCH path = (root:KB_Category {name: 'Phone'})-[:KB_PARENT_OF*]->(c:KB_Category)-[:KB_HAS_GUIDE]->(g:KB_Guide)
RETURN path
LIMIT 10;

// Инструменты для iPhone гайдов
MATCH (c:KB_Category {name: 'iPhone'})-[:KB_PARENT_OF*0..]->(sub:KB_Category)-[:KB_HAS_GUIDE]->(g:KB_Guide)-[:KB_REQUIRES_TOOL]->(t:KB_Tool)
RETURN t.name, COUNT(DISTINCT g) as guides
ORDER BY guides DESC
LIMIT 20;
```

---

## Troubleshooting

### Ошибка: `difficulty - Input should be a valid string`

**Причина**: iFixit API иногда возвращает `difficulty: false` вместо строки.

**Решение** (уже применено):
```python
# В api_models.py, GuideDetail.from_api()
difficulty = data.get("difficulty")
if difficulty is False or difficulty is True:
    difficulty = None
elif difficulty is not None:
    difficulty = str(difficulty)
```

### Парсер завершился с 0 устройств/гайдов

**Причина**: Родительские категории (Phone, Mac) не содержат устройств напрямую.

**Решение**: Использовать `smart_parse` который парсит уровень за уровнем.

### SSH таймауты

**Причина**: Нестабильное соединение или долгие команды.

**Решение**: Использовать Python-скрипты с paramiko вместо прямого SSH.

---

## Контакты и ресурсы

- **iFixit API docs**: https://www.ifixit.com/api/2.0/doc
- **Сервер парсера**: 45.144.177.128
- **PostgreSQL**: 185.221.214.83:6544 (Supabase)
- **Neo4j Browser**: https://45.144.177.128:7474

---

*Документ создан: 04.12.2024*
*Последнее обновление: 04.12.2024*
