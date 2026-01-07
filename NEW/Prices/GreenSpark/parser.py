"""
Парсер GreenSpark.ru - запчасти для телефонов
Работает через API green-spark.ru
"""

import httpx
import json
import csv
import time
import os
from datetime import datetime
from typing import Optional, List, Dict, Generator
from concurrent.futures import ThreadPoolExecutor, as_completed

from config import (
    BASE_URL, SEARCH_ENDPOINT,
    REQUEST_DELAY, MAX_PAGES, DEFAULT_SHOP_ID,
    DATA_DIR, PRODUCTS_CSV, PRODUCTS_JSON, ERRORS_LOG,
    BRANDS, PART_TYPES
)


class RateLimitError(Exception):
    """Ошибка превышения лимита запросов"""
    pass


class ParserGreenSpark:
    """Парсер каталога GreenSpark через API"""

    def __init__(self, shop_id: int = DEFAULT_SHOP_ID):
        cookies = {
            "magazine": str(shop_id),
            "global_magazine": str(shop_id),
        }

        self.client = httpx.Client(
            timeout=30.0,
            headers={
                "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36",
                "Accept": "application/json, text/plain, */*",
                "Accept-Language": "ru-RU,ru;q=0.9",
            },
            cookies=cookies,
            follow_redirects=True,
        )
        self.last_request = 0
        self.delay = REQUEST_DELAY
        self.products: List[Dict] = []
        self.errors: List[Dict] = []
        self.seen_ids: set = set()

        os.makedirs(DATA_DIR, exist_ok=True)

    def _rate_limit(self):
        """Ограничение частоты запросов"""
        elapsed = time.time() - self.last_request
        if elapsed < self.delay:
            time.sleep(self.delay - elapsed)
        self.last_request = time.time()

    def search(self, query: str, page: int = 1, only_available: bool = False) -> dict:
        """Поиск товаров через API"""
        self._rate_limit()

        params = {
            "q": query,
            "onlyAvailable": str(only_available).lower(),
            "page": page,
        }

        try:
            response = self.client.get(f"{BASE_URL}{SEARCH_ENDPOINT}", params=params)
            response.raise_for_status()
            return response.json()
        except httpx.HTTPStatusError as e:
            if e.response.status_code == 403:
                raise RateLimitError("API вернул 403 - временная блокировка")
            raise
        except Exception as e:
            self.errors.append({"query": query, "error": str(e), "time": datetime.now().isoformat()})
            raise

    def extract_product_info(self, product: dict, query: str) -> Optional[Dict]:
        """Извлечь информацию о товаре"""
        try:
            greenspark_id = product.get("id")

            # Пропускаем дубликаты
            if greenspark_id in self.seen_ids:
                return None
            self.seen_ids.add(greenspark_id)

            # Цены
            prices = product.get("prices", [])
            price_retail = 0.0
            for p in prices:
                name = p.get("name", "").lower()
                if "розница" in name:
                    price_retail = p.get("price", 0) or 0
                    break

            # Наличие
            qty = product.get("quantity", "none")
            quantity_map = {
                "none": "Нет в наличии",
                "few": "В наличии:Мало",
                "sufficient": "В наличии:Достаточно",
                "many": "В наличии:Много",
            }
            availability = quantity_map.get(qty.lower() if qty else "none", "Нет в наличии")

            return {
                "product_id": str(greenspark_id),
                "sku": str(greenspark_id),
                "name": product.get("name", ""),
                "price": price_retail,
                "availability": availability,
                "category": query,
                "url": "https://greenspark.ru" + product.get("url", ""),
            }
        except Exception as e:
            self.errors.append({"product_id": str(product.get("id")), "error": str(e)})
            return None

    def parse_all_products(self, limit: int = None):
        """Парсит все товары по всем комбинациям бренд+запчасть"""
        print(f"\n{'='*60}")
        print(f"Парсинг GreenSpark.ru")
        print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"{'='*60}")

        # Генерируем запросы
        queries = [f"{part} {brand}" for brand in BRANDS for part in PART_TYPES]
        total_queries = len(queries)

        print(f"Брендов: {len(BRANDS)}")
        print(f"Типов запчастей: {len(PART_TYPES)}")
        print(f"Всего запросов: {total_queries}")

        for i, query in enumerate(queries, 1):
            try:
                print(f"\n[{i}/{total_queries}] Поиск: '{query}'")
                page = 1
                query_count = 0

                while page <= MAX_PAGES:
                    try:
                        result = self.search(query, page=page, only_available=False)
                        products = result.get("data", [])

                        if not products:
                            break

                        for product in products:
                            info = self.extract_product_info(product, query)
                            if info:
                                self.products.append(info)
                                query_count += 1

                        # Проверяем пагинацию
                        meta = result.get("meta", {})
                        if page >= meta.get("pageCount", 1):
                            break
                        page += 1

                    except RateLimitError:
                        print(f"  [RATE LIMIT] Пауза 60 сек...")
                        time.sleep(60)
                        continue

                print(f"  Найдено: {query_count} товаров (всего: {len(self.products)})")

                if limit and len(self.products) >= limit:
                    print(f"\nДостигнут лимит: {limit}")
                    break

            except KeyboardInterrupt:
                print("\n\n[STOP] Прервано пользователем")
                break
            except Exception as e:
                self.errors.append({"query": query, "error": str(e)})
                print(f"  [ERROR] {e}")

        print(f"\n{'='*60}")
        print(f"ИТОГО: {len(self.products)} товаров")
        print(f"Ошибок: {len(self.errors)}")

    def save_to_csv(self, filename: str = None):
        """Сохраняет товары в CSV"""
        filename = filename or PRODUCTS_CSV

        if not self.products:
            print("Нет товаров для сохранения")
            return

        fieldnames = ["product_id", "sku", "name", "price", "availability", "category", "url"]

        with open(filename, 'w', newline='', encoding='utf-8-sig') as f:
            writer = csv.DictWriter(f, fieldnames=fieldnames, delimiter=';', extrasaction='ignore')
            writer.writeheader()
            writer.writerows(self.products)

        print(f"Сохранено в {filename}: {len(self.products)} товаров")

    def save_to_json(self, filename: str = None):
        """Сохраняет товары в JSON"""
        filename = filename or PRODUCTS_JSON

        data = {
            "source": "greenspark.ru",
            "date": datetime.now().isoformat(),
            "total": len(self.products),
            "products": self.products,
        }

        with open(filename, 'w', encoding='utf-8') as f:
            json.dump(data, f, ensure_ascii=False, indent=2)

        print(f"Сохранено в {filename}")

    def save_errors(self, filename: str = None):
        """Сохраняет лог ошибок"""
        filename = filename or ERRORS_LOG

        if self.errors:
            with open(filename, 'w', encoding='utf-8') as f:
                json.dump(self.errors, f, ensure_ascii=False, indent=2)
            print(f"Ошибки сохранены в {filename}")

    def print_stats(self):
        """Выводит статистику"""
        print(f"\n{'='*60}")
        print("СТАТИСТИКА")
        print(f"{'='*60}")

        # По категориям
        categories = {}
        for p in self.products:
            cat = p.get("category", "Без категории") or "Без категории"
            categories[cat] = categories.get(cat, 0) + 1

        print(f"\nКатегорий: {len(categories)}")
        print("\nТоп-10 категорий:")
        for cat, count in sorted(categories.items(), key=lambda x: -x[1])[:10]:
            print(f"  {count:4d} | {cat[:50]}")

        # По наличию
        avail = {}
        for p in self.products:
            a = p.get("availability", "Неизвестно")
            avail[a] = avail.get(a, 0) + 1
        print(f"\nНаличие:")
        for a, count in avail.items():
            print(f"  {count:4d} | {a}")

        # Ценовой диапазон
        prices = [p.get("price", 0) for p in self.products if p.get("price", 0) > 0]
        if prices:
            print(f"\nЦены: от {min(prices):.0f} до {max(prices):.0f} руб")
            print(f"Средняя: {sum(prices)/len(prices):.0f} руб")

    def close(self):
        """Закрыть соединение"""
        self.client.close()

    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        self.close()


def main():
    import argparse

    arg_parser = argparse.ArgumentParser(description='Парсер GreenSpark.ru')
    arg_parser.add_argument('--limit', '-l', type=int, default=None,
                           help='Ограничить количество товаров')
    args = arg_parser.parse_args()

    with ParserGreenSpark() as parser:
        parser.parse_all_products(limit=args.limit)
        parser.print_stats()
        parser.save_to_csv()
        parser.save_to_json()
        parser.save_errors()

    print("\nПарсинг завершён!")


if __name__ == "__main__":
    main()
