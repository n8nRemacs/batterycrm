"""
Парсер TAGGSM.ru - запчасти для телефонов
"""

import requests
from bs4 import BeautifulSoup
import json
import csv
import time
import re
import os
from datetime import datetime
from typing import Optional
from config import (
    BASE_URL, CATEGORY_URL, PRODUCT_URL, CATEGORIES,
    ITEMS_PER_PAGE, MAX_PAGES, REQUEST_DELAY, REQUEST_TIMEOUT,
    USER_AGENT, DATA_DIR, CATALOG_FILE, PRODUCTS_FILE, PRODUCTS_JSON
)


class TaggsmParser:
    # Города и их fias_id
    CITIES = {
        "Астрахань": "4892",
        "Таганрог": "2838",
        "Москва": "0c5b2444-70a0-4932-980c-b4dc0d3f02b5",
        "Ростов-на-Дону": "c1cfe4b9-f7c2-423c-abfa-6ed1c05a15c5",
    }

    def __init__(self, city: str = None):
        self.session = requests.Session()
        self.session.headers.update({
            "User-Agent": USER_AGENT,
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "ru-RU,ru;q=0.9,en;q=0.8",
        })
        self.products = []
        self.errors = []
        self.city = city
        self.city_fias_id = self.CITIES.get(city) if city else None

        # Создаём папку data если не существует
        os.makedirs(DATA_DIR, exist_ok=True)

        # Устанавливаем город если указан
        if self.city_fias_id:
            self.set_city(self.city_fias_id)

    def set_city(self, fias_id: str):
        """Устанавливает город для сессии"""
        url = f"{BASE_URL}/index.php?route=module/geoip/save&fias_id={fias_id}"
        try:
            self.session.get(url, timeout=REQUEST_TIMEOUT)
            print(f"Город установлен: {self.city} (fias_id={fias_id})")
        except Exception as e:
            print(f"Ошибка установки города: {e}")

    def get_page(self, url: str) -> Optional[BeautifulSoup]:
        """Загружает страницу и возвращает BeautifulSoup объект"""
        try:
            time.sleep(REQUEST_DELAY)
            response = self.session.get(url, timeout=REQUEST_TIMEOUT)
            response.raise_for_status()
            response.encoding = 'utf-8'
            return BeautifulSoup(response.text, 'html.parser')
        except Exception as e:
            print(f"  [ERROR] Ошибка загрузки {url}: {e}")
            self.errors.append({"url": url, "error": str(e)})
            return None

    def parse_category_page(self, category_path: str, page: int = 1) -> list:
        """Парсит страницу категории и возвращает список товаров"""
        url = f"{CATEGORY_URL}&path={category_path}&limit={ITEMS_PER_PAGE}&page={page}"
        print(f"  Страница {page}: {url}")

        soup = self.get_page(url)
        if not soup:
            return []

        products = []

        # Ищем карточки товаров
        # Вариант 1: div.product-thumb
        product_cards = soup.select("div.product-thumb")

        # Вариант 2: div.product-layout
        if not product_cards:
            product_cards = soup.select("div.product-layout")

        # Вариант 3: tr с товарами (табличная верстка)
        if not product_cards:
            product_cards = soup.select("table.product-list tr, div.product-list .product-item")

        for card in product_cards:
            product = self.parse_product_card(card, category_path)
            if product:
                products.append(product)

        # Альтернативный парсинг: ищем ссылки на товары напрямую
        if not products:
            product_links = soup.find_all('a', href=re.compile(r'product_id=\d+'))
            seen_ids = set()
            for link in product_links:
                href = link.get('href', '')
                match = re.search(r'product_id=(\d+)', href)
                if match:
                    product_id = match.group(1)
                    if product_id not in seen_ids:
                        seen_ids.add(product_id)
                        # Получаем данные из ссылки и окружающего контекста
                        product = self.extract_product_from_link(link, product_id, category_path, soup)
                        if product:
                            products.append(product)

        return products

    def extract_product_from_link(self, link, product_id: str, category_path: str, soup) -> Optional[dict]:
        """Извлекает данные товара из ссылки и окружающего HTML"""
        try:
            name = link.get_text(strip=True)
            if not name or len(name) < 3:
                return None

            # Ищем родительский контейнер
            parent = link.find_parent(['div', 'tr', 'td'])

            # Ищем артикул (zm...)
            sku = ""
            if parent:
                sku_text = parent.get_text()
                sku_match = re.search(r'(zm\d+)', sku_text)
                if sku_match:
                    sku = sku_match.group(1)

            # Ищем цену
            price = 0.0
            price_text = ""
            if parent:
                # Ищем элемент с ценой
                price_elem = parent.find(class_=re.compile(r'price|cost'))
                if price_elem:
                    price_text = price_elem.get_text()
                else:
                    # Ищем в тексте
                    price_match = re.search(r'(\d[\d\s]*)\s*р\.?', parent.get_text())
                    if price_match:
                        price_text = price_match.group(1)

                if price_text:
                    price = self.parse_price(price_text)

            return {
                "product_id": product_id,
                "sku": sku,
                "name": name,
                "price": price,
                "category_path": category_path,
                "category_name": CATEGORIES.get(category_path, ""),
                "url": f"{PRODUCT_URL}&path={category_path}&product_id={product_id}",
            }
        except Exception as e:
            return None

    def parse_product_card(self, card, category_path: str) -> Optional[dict]:
        """Парсит карточку товара"""
        try:
            # Product ID из атрибута id карточки или из ссылки
            product_id = card.get('id', '')
            if not product_id:
                link = card.find('a', href=re.compile(r'product_id=\d+'))
                if link:
                    href = link.get('href', '')
                    match = re.search(r'product_id=(\d+)', href)
                    if match:
                        product_id = match.group(1)

            if not product_id:
                return None

            # Название: div.category_name h4 a
            name = ""
            name_elem = card.select_one("div.category_name h4 a")
            if name_elem:
                name = name_elem.get_text(strip=True)
            if not name:
                # Fallback: любая ссылка с product_id
                link = card.find('a', href=re.compile(r'product_id='))
                if link:
                    name = link.get_text(strip=True)

            # Артикул: div.cat_articul
            sku = ""
            sku_elem = card.select_one("div.cat_articul")
            if sku_elem:
                sku = sku_elem.get_text(strip=True)
            if not sku:
                # Fallback: regex
                sku_match = re.search(r'(zm\d+)', card.get_text())
                if sku_match:
                    sku = sku_match.group(1)

            # Цена: div.category_price
            price = 0.0
            price_elem = card.select_one("div.category_price")
            if price_elem:
                price = self.parse_price(price_elem.get_text())

            # Наличие в выбранном городе
            availability = ""
            if self.city:
                nalichie = card.select_one("div.category_nalichie table")
                if nalichie:
                    rows = nalichie.find_all('tr')
                    for row in rows:
                        cells = row.find_all('td')
                        if len(cells) >= 2:
                            city_name = cells[0].get_text(strip=True)
                            status = cells[1].get_text(strip=True)
                            if self.city in city_name:
                                availability = status
                                break

            if not name:
                return None

            result = {
                "product_id": str(product_id),
                "sku": sku,
                "name": name,
                "price": price,
                "category_path": category_path,
                "category_name": CATEGORIES.get(category_path, ""),
                "url": f"{PRODUCT_URL}&path={category_path}&product_id={product_id}",
            }

            if self.city:
                result["city"] = self.city
                result["availability"] = availability

            return result
        except Exception as e:
            return None

    def parse_price(self, price_text: str) -> float:
        """Парсит цену из текста"""
        if not price_text:
            return 0.0
        # Убираем всё кроме цифр и точки/запятой
        price_text = re.sub(r'[^\d,.]', '', price_text)
        price_text = price_text.replace(',', '.')
        try:
            return float(price_text)
        except:
            return 0.0

    def parse_category(self, category_path: str) -> list:
        """Парсит все страницы категории"""
        category_name = CATEGORIES.get(category_path, category_path)
        print(f"\n{'='*60}")
        print(f"Категория: {category_name}")
        print(f"{'='*60}")

        all_products = []
        page = 1

        while page <= MAX_PAGES:
            products = self.parse_category_page(category_path, page)

            if not products:
                print(f"  Страница {page}: товаров не найдено, завершаем категорию")
                break

            all_products.extend(products)
            print(f"  Найдено товаров: {len(products)} (всего: {len(all_products)})")

            # Если товаров меньше лимита - это последняя страница
            if len(products) < ITEMS_PER_PAGE:
                break

            page += 1

        print(f"Итого в категории: {len(all_products)} товаров")
        return all_products

    def parse_all_categories(self):
        """Парсит все категории"""
        print(f"\nЗапуск парсинга TAGGSM.ru")
        print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"Категорий: {len(CATEGORIES)}")

        self.products = []

        for i, (path, name) in enumerate(CATEGORIES.items(), 1):
            print(f"\n[{i}/{len(CATEGORIES)}] {name}")
            products = self.parse_category(path)
            self.products.extend(products)

        # Удаляем дубликаты по product_id
        seen = set()
        unique_products = []
        for p in self.products:
            if p['product_id'] not in seen:
                seen.add(p['product_id'])
                unique_products.append(p)

        self.products = unique_products
        print(f"\n{'='*60}")
        print(f"ИТОГО: {len(self.products)} уникальных товаров")
        print(f"Ошибок: {len(self.errors)}")

    def save_to_csv(self, filename: str = None):
        """Сохраняет товары в CSV"""
        filename = filename or PRODUCTS_FILE

        if not self.products:
            print("Нет товаров для сохранения")
            return

        # Определяем поля на основе данных
        fieldnames = ["product_id", "sku", "name", "price", "category_path", "category_name", "url"]
        if self.city:
            fieldnames.extend(["city", "availability"])

        with open(filename, 'w', newline='', encoding='utf-8-sig') as f:
            writer = csv.DictWriter(f, fieldnames=fieldnames, delimiter=';')
            writer.writeheader()
            writer.writerows(self.products)

        print(f"Сохранено в {filename}: {len(self.products)} товаров")

    def save_to_json(self, filename: str = None):
        """Сохраняет товары в JSON"""
        filename = filename or PRODUCTS_JSON

        data = {
            "date": datetime.now().isoformat(),
            "total": len(self.products),
            "categories": CATEGORIES,
            "products": self.products,
            "errors": self.errors,
        }

        with open(filename, 'w', encoding='utf-8') as f:
            json.dump(data, f, ensure_ascii=False, indent=2)

        print(f"Сохранено в {filename}")


def main():
    import argparse

    arg_parser = argparse.ArgumentParser(description='Парсер TAGGSM.ru')
    arg_parser.add_argument('--city', '-c', type=str, default=None,
                           help='Город для фильтрации (Астрахань, Таганрог, Москва, Ростов-на-Дону)')
    arg_parser.add_argument('--in-stock', '-s', action='store_true',
                           help='Только товары в наличии')
    args = arg_parser.parse_args()

    parser = TaggsmParser(city=args.city)
    parser.parse_all_categories()

    # Фильтруем только товары в наличии если указан флаг
    if args.in_stock and args.city:
        in_stock_products = [
            p for p in parser.products
            if p.get('availability', '').lower() not in ['нет в наличии', '']
        ]
        print(f"\nТоваров в наличии в {args.city}: {len(in_stock_products)} из {len(parser.products)}")
        parser.products = in_stock_products

    parser.save_to_csv()
    parser.save_to_json()

    print("\nПарсинг завершён!")


if __name__ == "__main__":
    main()
