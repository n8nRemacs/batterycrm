"""
Парсер каталога NAFFAS с b2b.moysklad.ru
"""

import requests
import json
import csv
import os
from datetime import datetime

# Конфигурация
CATALOG_ID = "S1AlNWEsMzM7"
API_URL = f"https://b2b.moysklad.ru/desktop-api/public/{CATALOG_ID}/products.json"
DATA_DIR = "data"
PRODUCTS_CSV = f"{DATA_DIR}/products.csv"
PRODUCTS_JSON = f"{DATA_DIR}/products.json"

USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"


def fetch_products():
    """Загружает все товары из API с пагинацией"""
    print(f"Загрузка товаров из API...")
    print(f"URL: {API_URL}")

    headers = {
        "User-Agent": USER_AGENT,
        "Accept": "application/json",
    }

    all_products = []
    offset = 0
    page_size = 100

    while True:
        url = f"{API_URL}?offset={offset}"
        response = requests.get(url, headers=headers, timeout=60)
        response.raise_for_status()

        data = response.json()
        products = data.get("products", [])
        total_size = data.get("size", 0)

        if not products:
            break

        all_products.extend(products)
        print(f"  Загружено: {len(all_products)} / {total_size}")

        if len(products) < page_size or len(all_products) >= total_size:
            break

        offset += page_size

    print(f"Всего загружено: {len(all_products)} товаров")
    return all_products


def process_products(products):
    """Обрабатывает и нормализует товары"""
    processed = []

    for p in products:
        processed.append({
            "id": p.get("id", ""),
            "code": p.get("code", ""),
            "article": p.get("article") or "",
            "name": p.get("name", ""),
            "category": p.get("category", ""),
            "price": p.get("price", 0),
            "currency": p.get("currency", "руб"),
            "stock": p.get("stock", 0),
            "available": p.get("available", False),
            "description": p.get("description") or "",
            "imageURL": p.get("imageURL") or "",
        })

    return processed


def save_to_csv(products, filename=PRODUCTS_CSV):
    """Сохраняет товары в CSV (стандартный формат)"""
    if not products:
        print("Нет товаров для сохранения")
        return

    # Конвертируем в стандартный формат
    standard = []
    for p in products:
        stock = p.get("stock", 0) or 0
        available = p.get("available", False)
        availability = "В наличии" if stock > 0 or available else "Нет в наличии"
        sku = p.get("article") or p.get("code", "")

        standard.append({
            "product_id": p.get("code", ""),
            "sku": sku,
            "name": p.get("name", ""),
            "price": p.get("price", 0),
            "availability": availability,
            "category": p.get("category", ""),
            "url": "",
        })

    fieldnames = ["product_id", "sku", "name", "price", "availability", "category", "url"]

    with open(filename, 'w', newline='', encoding='utf-8-sig') as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames, delimiter=';')
        writer.writeheader()
        writer.writerows(standard)

    print(f"Сохранено в {filename}: {len(products)} товаров")


def save_to_json(products, filename=PRODUCTS_JSON):
    """Сохраняет товары в JSON (стандартный формат)"""
    # Конвертируем в стандартный формат
    standard = []
    for p in products:
        stock = p.get("stock", 0) or 0
        available = p.get("available", False)
        availability = "В наличии" if stock > 0 or available else "Нет в наличии"
        sku = p.get("article") or p.get("code", "")

        standard.append({
            "product_id": p.get("code", ""),
            "sku": sku,
            "name": p.get("name", ""),
            "price": p.get("price", 0),
            "availability": availability,
            "category": p.get("category", ""),
            "url": "",
        })

    data = {
        "source": "b2b.moysklad.ru (NAFFAS)",
        "date": datetime.now().isoformat(),
        "total": len(standard),
        "products": standard,
    }

    with open(filename, 'w', encoding='utf-8') as f:
        json.dump(data, f, ensure_ascii=False, indent=2)

    print(f"Сохранено в {filename}")


def print_stats(products):
    """Выводит статистику по товарам"""
    print("\n" + "=" * 60)
    print("СТАТИСТИКА")
    print("=" * 60)

    # По категориям
    categories = {}
    for p in products:
        cat = p.get("category", "Без категории")
        categories[cat] = categories.get(cat, 0) + 1

    print(f"\nКатегорий: {len(categories)}")
    print("\nТоп-10 категорий:")
    for cat, count in sorted(categories.items(), key=lambda x: -x[1])[:10]:
        print(f"  {count:4d} | {cat}")

    # В наличии
    in_stock = sum(1 for p in products if p.get("stock", 0) > 0)
    print(f"\nВ наличии: {in_stock} из {len(products)} ({in_stock*100//len(products)}%)")

    # Ценовой диапазон
    prices = [p.get("price", 0) for p in products if p.get("price", 0) > 0]
    if prices:
        print(f"Цены: от {min(prices):.0f} до {max(prices):.0f} руб")


def main():
    # Создаём папку data
    os.makedirs(DATA_DIR, exist_ok=True)

    print(f"\nПарсинг каталога NAFFAS")
    print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 60)

    # Загружаем товары
    products = fetch_products()

    # Обрабатываем
    products = process_products(products)

    # Статистика
    print_stats(products)

    # Сохраняем
    print("\n" + "=" * 60)
    print("СОХРАНЕНИЕ")
    print("=" * 60)
    save_to_csv(products)
    save_to_json(products)

    print("\nПарсинг завершён!")


if __name__ == "__main__":
    main()
