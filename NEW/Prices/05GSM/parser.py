"""
Парсер 05GSM.ru - запчасти для телефонов и оборудование
"""

import requests
from bs4 import BeautifulSoup
import json
import csv
import time
import re
import os
from datetime import datetime
from typing import Optional, List, Dict
from concurrent.futures import ThreadPoolExecutor, as_completed
from bs4 import XMLParsedAsHTMLWarning
import warnings
warnings.filterwarnings("ignore", category=XMLParsedAsHTMLWarning)

from config import (
    BASE_URL, SITEMAP_PRODUCTS,
    REQUEST_DELAY, REQUEST_TIMEOUT, MAX_RETRIES, CONCURRENT_REQUESTS,
    USER_AGENT, DATA_DIR, SITEMAP_CACHE,
    PRODUCTS_CSV, PRODUCTS_JSON, ERRORS_LOG,
    PRODUCT_URL_PATTERN
)


class Parser05GSM:
    """Парсер каталога 05GSM.ru"""

    def __init__(self):
        self.session = requests.Session()
        self.session.headers.update({
            "User-Agent": USER_AGENT,
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "ru-RU,ru;q=0.9,en;q=0.8",
        })
        self.products: List[Dict] = []
        self.errors: List[Dict] = []
        self.product_urls: List[str] = []

        os.makedirs(DATA_DIR, exist_ok=True)

    def get_page(self, url: str, retries: int = MAX_RETRIES) -> Optional[BeautifulSoup]:
        """Загружает страницу с повторными попытками"""
        for attempt in range(retries):
            try:
                time.sleep(REQUEST_DELAY)
                response = self.session.get(url, timeout=REQUEST_TIMEOUT)
                response.raise_for_status()
                response.encoding = 'utf-8'
                return BeautifulSoup(response.text, 'lxml')
            except Exception as e:
                if attempt == retries - 1:
                    print(f"  [ERROR] {url}: {e}")
                    self.errors.append({"url": url, "error": str(e), "time": datetime.now().isoformat()})
                    return None
                time.sleep(REQUEST_DELAY * (attempt + 1))
        return None

    def fetch_sitemap_urls(self) -> List[str]:
        """Загружает URL товаров из sitemap"""
        print(f"\nЗагрузка sitemap: {SITEMAP_PRODUCTS}")

        # Проверяем кеш
        if os.path.exists(SITEMAP_CACHE):
            with open(SITEMAP_CACHE, 'r', encoding='utf-8') as f:
                cached = json.load(f)
                if cached.get('date') == datetime.now().strftime('%Y-%m-%d'):
                    print(f"  Используем кеш: {len(cached['urls'])} URL")
                    return cached['urls']

        try:
            response = self.session.get(SITEMAP_PRODUCTS, timeout=REQUEST_TIMEOUT)
            response.raise_for_status()
            soup = BeautifulSoup(response.text, 'lxml')

            urls = []
            for loc in soup.find_all('loc'):
                url = loc.get_text(strip=True)
                # Фильтруем только товары (числовой ID)
                if re.search(PRODUCT_URL_PATTERN, url):
                    urls.append(url)

            print(f"  Найдено товаров в sitemap: {len(urls)}")

            # Сохраняем в кеш
            with open(SITEMAP_CACHE, 'w', encoding='utf-8') as f:
                json.dump({'date': datetime.now().strftime('%Y-%m-%d'), 'urls': urls}, f)

            return urls

        except Exception as e:
            print(f"  [ERROR] Ошибка загрузки sitemap: {e}")
            return []

    def parse_product_page(self, url: str) -> Optional[Dict]:
        """Парсит страницу товара"""
        soup = self.get_page(url)
        if not soup:
            return None

        try:
            # ID товара из URL
            match = re.search(r'/catalog/(\d+)/', url)
            product_id = match.group(1) if match else ""

            # Название товара
            name = ""
            h1 = soup.find('h1')
            if h1:
                name = h1.get_text(strip=True)

            # Цена
            price = 0.0
            price_elem = soup.find(class_=re.compile(r'product.*price|price.*product', re.I))
            if not price_elem:
                price_elem = soup.find(attrs={'data-price': True})
            if not price_elem:
                # Ищем в meta или script
                meta_price = soup.find('meta', {'itemprop': 'price'})
                if meta_price:
                    price = self.parse_price(meta_price.get('content', ''))
            if price_elem and price == 0:
                price = self.parse_price(price_elem.get_text())

            # Fallback: ищем любой элемент с ценой в рублях
            if price == 0:
                price_match = re.search(r'(\d[\d\s]*)\s*₽', soup.get_text())
                if price_match:
                    price = self.parse_price(price_match.group(1))

            # Артикул = product_id из URL
            sku = product_id

            # Наличие
            availability = "Неизвестно"
            avail_elem = soup.find(class_=re.compile(r'availab|stock|наличи', re.I))
            if avail_elem:
                avail_text = avail_elem.get_text(strip=True).lower()
                if 'в наличии' in avail_text or 'есть' in avail_text:
                    availability = "В наличии"
                elif 'нет' in avail_text or 'под заказ' in avail_text:
                    availability = "Нет в наличии"

            # Категория из хлебных крошек
            category = ""
            breadcrumbs = soup.find(class_=re.compile(r'breadcrumb', re.I))
            if breadcrumbs:
                crumbs = breadcrumbs.find_all('a')
                if len(crumbs) > 1:
                    category = " > ".join([c.get_text(strip=True) for c in crumbs[1:]])

            # Характеристики
            specs = {}
            spec_table = soup.find('table', class_=re.compile(r'char|spec|prop', re.I))
            if spec_table:
                rows = spec_table.find_all('tr')
                for row in rows:
                    cells = row.find_all(['td', 'th'])
                    if len(cells) >= 2:
                        key = cells[0].get_text(strip=True)
                        val = cells[1].get_text(strip=True)
                        if key and val:
                            specs[key] = val

            if not name:
                return None

            return {
                "product_id": product_id,
                "sku": sku,
                "name": name,
                "price": price,
                "availability": availability,
                "category": category,
                "specs": specs,
                "url": url,
            }

        except Exception as e:
            self.errors.append({"url": url, "error": str(e), "time": datetime.now().isoformat()})
            return None

    def parse_price(self, price_text: str) -> float:
        """Парсит цену из текста"""
        if not price_text:
            return 0.0
        price_text = re.sub(r'[^\d,.]', '', str(price_text))
        price_text = price_text.replace(',', '.')
        try:
            return float(price_text)
        except:
            return 0.0

    def parse_all_products(self, limit: int = None):
        """Парсит все товары из sitemap"""
        print(f"\n{'='*60}")
        print(f"Парсинг 05GSM.ru")
        print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"{'='*60}")

        # Загружаем URL товаров
        self.product_urls = self.fetch_sitemap_urls()

        if limit:
            self.product_urls = self.product_urls[:limit]
            print(f"Ограничение: {limit} товаров")

        total = len(self.product_urls)
        print(f"\nПарсинг {total} товаров...")

        # Последовательный парсинг (безопаснее)
        for i, url in enumerate(self.product_urls, 1):
            if i % 50 == 0 or i == 1:
                print(f"\n[{i}/{total}] ({i*100//total}%)")

            product = self.parse_product_page(url)
            if product:
                self.products.append(product)
                if i % 100 == 0:
                    print(f"  Успешно: {len(self.products)}, Ошибок: {len(self.errors)}")

        print(f"\n{'='*60}")
        print(f"ИТОГО: {len(self.products)} товаров")
        print(f"Ошибок: {len(self.errors)}")

    def parse_parallel(self, limit: int = None, workers: int = CONCURRENT_REQUESTS):
        """Параллельный парсинг товаров"""
        print(f"\n{'='*60}")
        print(f"Параллельный парсинг 05GSM.ru ({workers} потоков)")
        print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"{'='*60}")

        self.product_urls = self.fetch_sitemap_urls()

        if limit:
            self.product_urls = self.product_urls[:limit]
            print(f"Ограничение: {limit} товаров")

        total = len(self.product_urls)
        print(f"\nПарсинг {total} товаров...")

        with ThreadPoolExecutor(max_workers=workers) as executor:
            futures = {executor.submit(self.parse_product_page, url): url for url in self.product_urls}
            completed = 0
            for future in as_completed(futures):
                completed += 1
                if completed % 100 == 0:
                    print(f"  [{completed}/{total}] Товаров: {len(self.products)}")
                result = future.result()
                if result:
                    self.products.append(result)

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
            "source": "05gsm.ru",
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
            print(f"  {count:4d} | {cat[:60]}")

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


def main():
    import argparse

    arg_parser = argparse.ArgumentParser(description='Парсер 05GSM.ru')
    arg_parser.add_argument('--limit', '-l', type=int, default=None,
                           help='Ограничить количество товаров')
    arg_parser.add_argument('--parallel', '-p', action='store_true',
                           help='Параллельный парсинг')
    arg_parser.add_argument('--workers', '-w', type=int, default=CONCURRENT_REQUESTS,
                           help='Количество потоков (по умолчанию 5)')
    args = arg_parser.parse_args()

    parser = Parser05GSM()

    if args.parallel:
        parser.parse_parallel(limit=args.limit, workers=args.workers)
    else:
        parser.parse_all_products(limit=args.limit)

    parser.print_stats()
    parser.save_to_csv()
    parser.save_to_json()
    parser.save_errors()

    print("\nПарсинг завершён!")


if __name__ == "__main__":
    main()
