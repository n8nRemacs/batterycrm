# Прайс-листы поставщиков

Единая база цен на запчасти для телефонов от разных поставщиков.

## Структура

```
NEW/Prices/
├── 05GSM/          # 05gsm.ru — оптовый магазин запчастей
├── GreenSpark/     # greenspark.ru — сеть магазинов запчастей
├── memstech/       # memstech.ru — запчасти и оборудование
├── Profi/          # Profi (Астрахань) — Excel прайс-лист
├── Taggsm/         # taggsm.ru — оптовый магазин запчастей
└── Naffas/         # NAFFAS — аккумуляторы (b2b.moysklad.ru)
```

## Источники данных

| Папка | Источник | Товаров | Тип парсера |
|-------|----------|---------|-------------|
| `05GSM/` | https://05gsm.ru | 8,805 | Web (sitemap) |
| `GreenSpark/` | https://greenspark.ru | 2,524 | API |
| `memstech/` | https://memstech.ru | 4,734 | Web (каталог) |
| `Profi/` | Excel файл | 6,288 | Excel (xlrd) |
| `Taggsm/` | https://taggsm.ru | 25,870 | Web (каталог) |
| `Naffas/` | b2b.moysklad.ru | 1,186 | API |

**Всего: ~49,400 товаров**

## Формат данных

Все данные приведены к единому формату CSV:

```csv
product_id;sku;name;price;availability;category;url
```

| Поле | Описание |
|------|----------|
| `product_id` | ID товара у поставщика |
| `sku` | Артикул (если есть, иначе = product_id) |
| `name` | Название товара |
| `price` | Цена (руб) |
| `availability` | "В наличии" / "Нет в наличии" |
| `category` | Категория товара |
| `url` | Ссылка на товар (если есть) |

## Структура каждой папки

```
[Поставщик]/
├── config.py        # Настройки парсера
├── parser.py        # Код парсера
├── requirements.txt # Зависимости Python
├── data/
│   ├── products.csv  # Данные (CSV)
│   └── products.json # Данные (JSON)
└── [исходный файл]   # Только для Profi (Excel)
```

## Запуск парсеров

```bash
cd NEW/Prices/[Папка]
pip install -r requirements.txt
python parser.py
```

### Примеры

```bash
# 05GSM (все товары из sitemap)
cd NEW/Prices/05GSM
python parser.py

# GreenSpark (поиск по брендам и типам запчастей)
cd NEW/Prices/GreenSpark
python parser.py

# Profi (парсинг Excel файла)
cd NEW/Prices/Profi
python parser.py
```

## Особенности

### 05GSM
- Парсит sitemap для получения всех URL товаров
- Поддерживает параллельный парсинг (`--parallel`)

### GreenSpark
- Работает через внутренний API сайта
- Ищет по комбинациям: бренд + тип запчасти
- Требует задержку между запросами (rate limit)

### memstech
- Парсит JSON из атрибута `data-data` на страницах товаров
- Обходит все категории каталога

### Profi
- Парсит локальный Excel файл `Profi Astrahan.xls`
- Не требует интернета

### Taggsm
- Парсит каталог по категориям
- Большой объём данных (~26k товаров)

### Naffas
- Публичный API МойСклад (b2b.moysklad.ru)
- Только аккумуляторы NAFFAS

## Дата обновления

Последнее обновление: 2025-01-06
