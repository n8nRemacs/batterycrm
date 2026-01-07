"""
Парсер прайс-листа Profi (Excel файл)
"""

import pandas as pd
import json
import csv
import re
import os
from datetime import datetime
from typing import List, Dict

from config import (
    SOURCE_FILE, DATA_DIR, PRODUCTS_CSV, PRODUCTS_JSON,
    DATA_START_ROW, COL_CODE, COL_NAME, COL_AVAILABILITY, COL_PRICE
)


class ParserProfi:
    """Парсер Excel прайс-листа Profi"""

    def __init__(self, source_file: str = SOURCE_FILE):
        self.source_file = source_file
        self.products: List[Dict] = []
        os.makedirs(DATA_DIR, exist_ok=True)

    def parse_price(self, price_text: str) -> float:
        """Парсит цену из текста"""
        if not price_text or pd.isna(price_text):
            return 0.0
        price_match = re.search(r'([\d\s]+[.,]?\d*)\s*руб', str(price_text))
        if price_match:
            price_str = price_match.group(1).replace(' ', '').replace(',', '.')
            try:
                return float(price_str)
            except:
                return 0.0
        return 0.0

    def parse_all_products(self):
        """Парсит все товары из Excel файла"""
        print(f"\n{'='*60}")
        print(f"Парсинг прайс-листа Profi")
        print(f"Файл: {self.source_file}")
        print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"{'='*60}")

        # Читаем Excel
        df = pd.read_excel(self.source_file, header=None)
        print(f"Всего строк в файле: {len(df)}")

        current_category = ''

        for i in range(DATA_START_ROW, len(df)):
            row = df.iloc[i]

            code = str(row[COL_CODE]) if pd.notna(row[COL_CODE]) else ''
            name = str(row[COL_NAME]) if pd.notna(row[COL_NAME]) else ''
            avail = str(row[COL_AVAILABILITY]) if pd.notna(row[COL_AVAILABILITY]) else ''
            price_str = str(row[COL_PRICE]) if pd.notna(row[COL_PRICE]) else ''

            # Пропускаем пустые строки
            if not name.strip():
                continue

            # Категория (нет кода, только название)
            if not code.strip() and name.strip():
                current_category = name.strip()
                continue

            # Товар
            if code.strip():
                price = self.parse_price(price_str)
                availability = 'В наличии' if avail.strip() == '*' else 'Нет в наличии'

                self.products.append({
                    'product_id': code.strip(),
                    'sku': code.strip(),
                    'name': name.strip(),
                    'price': price,
                    'availability': availability,
                    'category': current_category,
                    'url': '',
                })

        print(f"\n{'='*60}")
        print(f"ИТОГО: {len(self.products)} товаров")

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
            "source": "profi-astrahan.xls",
            "date": datetime.now().isoformat(),
            "total": len(self.products),
            "products": self.products,
        }

        with open(filename, 'w', encoding='utf-8') as f:
            json.dump(data, f, ensure_ascii=False, indent=2)

        print(f"Сохранено в {filename}")

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


def main():
    parser = ParserProfi()
    parser.parse_all_products()
    parser.print_stats()
    parser.save_to_csv()
    parser.save_to_json()
    print("\nПарсинг завершён!")


if __name__ == "__main__":
    main()
