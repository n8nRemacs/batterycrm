#!/usr/bin/env python3
"""
Нормализация моделей устройств с помощью AI
Разбивает записи вида "P Smart Z / Y9s / Honor 9X" на отдельные модели
Убирает мусор типа "+ сканер отпечатка пальца"
"""

import json
import psycopg2
import os
from datetime import datetime
from anthropic import Anthropic

# Configuration
POSTGRES_DSN = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"
OUTPUT_DIR = "NEW/Prices/Normalize All"
OUTPUT_FILE = f"{OUTPUT_DIR}/models_normalized.json"
BATCH_SIZE = 50  # Models per AI request

# Initialize Anthropic client
client = Anthropic()

SYSTEM_PROMPT = """Ты эксперт по мобильным устройствам. Твоя задача - нормализовать названия моделей.

ПРАВИЛА:
1. Разбей записи с несколькими моделями (разделённые / или запятой) на отдельные модели
2. Убери мусор: "+ тачскрин", "+ сканер отпечатка", "с рамкой", "основной", "оригинал" и т.п.
3. Убери технические описания: "mAh", "Li-ion", размеры, PIN и т.п.
4. Оставь только чистое название модели устройства
5. Если модель содержит код (типа OT-4007D), оставь его - это тоже модель
6. Для каждой модели определи, это смартфон, планшет или смарт-часы

ФОРМАТ ОТВЕТА - JSON массив:
[
  {"original": "исходное название", "models": [{"name": "чистая модель", "device_type": "smartphone|tablet|smartwatch"}]}
]

Если из записи невозможно извлечь модель (это мусор) - верни пустой массив models.

ПРИМЕРЫ:
Вход: "P Smart Z / Y9s / Honor 9X / 9X Premium"
Выход: {"original": "P Smart Z / Y9s / Honor 9X / 9X Premium", "models": [
  {"name": "P Smart Z", "device_type": "smartphone"},
  {"name": "Y9s", "device_type": "smartphone"},
  {"name": "Honor 9X", "device_type": "smartphone"},
  {"name": "Honor 9X Premium", "device_type": "smartphone"}
]}

Вход: "Redmi S2 + сканер отпечатка пальца"
Выход: {"original": "Redmi S2 + сканер отпечатка пальца", "models": [
  {"name": "Redmi S2", "device_type": "smartphone"}
]}

Вход: "ONE TOUCH 997D 1800mAhLi-ion"
Выход: {"original": "ONE TOUCH 997D 1800mAhLi-ion", "models": [
  {"name": "OneTouch 997D", "device_type": "smartphone"}
]}

Вход: "100% LCD"
Выход: {"original": "100% LCD", "models": []}
"""


def get_models_from_db():
    """Загружает все модели из базы данных"""
    print("Загрузка моделей из базы данных...")

    conn = psycopg2.connect(POSTGRES_DSN)
    cur = conn.cursor()

    cur.execute("""
        SELECT
            m.id::text as model_uuid,
            b.name as brand,
            dt.code as device_type,
            m.name as raw_name
        FROM elo_dict_models m
        JOIN elo_dict_brands b ON m.brand_id = b.id
        JOIN elo_dict_device_types dt ON m.device_type_id = dt.id
        ORDER BY b.name, m.name
    """)

    rows = cur.fetchall()
    conn.close()

    models = []
    for row in rows:
        models.append({
            "model_uuid": row[0],
            "brand": row[1],
            "device_type": row[2],
            "raw_name": row[3]
        })

    print(f"Загружено: {len(models)} моделей")
    return models


def process_batch_with_ai(batch, brand):
    """Обрабатывает батч моделей через AI"""

    # Prepare input for AI
    raw_names = [m["raw_name"] for m in batch]

    user_message = f"""Бренд: {brand}

Нормализуй следующие названия моделей:

{json.dumps(raw_names, ensure_ascii=False, indent=2)}

Верни JSON массив с результатами для каждого названия."""

    try:
        response = client.messages.create(
            model="claude-sonnet-4-20250514",
            max_tokens=4096,
            messages=[
                {"role": "user", "content": user_message}
            ],
            system=SYSTEM_PROMPT
        )

        # Extract JSON from response
        response_text = response.content[0].text

        # Try to parse JSON
        # Find JSON array in response
        start = response_text.find('[')
        end = response_text.rfind(']') + 1
        if start >= 0 and end > start:
            json_str = response_text[start:end]
            return json.loads(json_str)
        else:
            print(f"  [WARN] No JSON found in response for {brand}")
            return None

    except Exception as e:
        print(f"  [ERROR] AI request failed: {e}")
        return None


def main():
    print("=" * 70)
    print("НОРМАЛИЗАЦИЯ МОДЕЛЕЙ ЧЕРЕЗ AI")
    print(f"Дата: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 70)

    # Create output directory
    os.makedirs(OUTPUT_DIR, exist_ok=True)

    # Load models
    models = get_models_from_db()

    # Group by brand
    brands = {}
    for m in models:
        brand = m["brand"]
        if brand not in brands:
            brands[brand] = []
        brands[brand].append(m)

    print(f"\nБрендов: {len(brands)}")

    # Process each brand
    all_results = []
    total_processed = 0

    for brand, brand_models in sorted(brands.items()):
        print(f"\n[{brand}] {len(brand_models)} моделей")

        # Process in batches
        for i in range(0, len(brand_models), BATCH_SIZE):
            batch = brand_models[i:i + BATCH_SIZE]
            batch_num = i // BATCH_SIZE + 1
            total_batches = (len(brand_models) + BATCH_SIZE - 1) // BATCH_SIZE

            print(f"  Батч {batch_num}/{total_batches} ({len(batch)} моделей)...")

            # Process with AI
            results = process_batch_with_ai(batch, brand)

            if results:
                # Merge results with original data
                for j, result in enumerate(results):
                    if j < len(batch):
                        original = batch[j]
                        all_results.append({
                            "model_uuid": original["model_uuid"],
                            "brand": brand,
                            "original_device_type": original["device_type"],
                            "raw_name": original["raw_name"],
                            "normalized": result.get("models", [])
                        })
                        total_processed += 1
            else:
                # Save originals without normalization
                for m in batch:
                    all_results.append({
                        "model_uuid": m["model_uuid"],
                        "brand": brand,
                        "original_device_type": m["device_type"],
                        "raw_name": m["raw_name"],
                        "normalized": None,
                        "error": "AI processing failed"
                    })

    # Save results
    print(f"\n{'='*70}")
    print(f"Сохранение результатов в {OUTPUT_FILE}...")

    output = {
        "date": datetime.now().isoformat(),
        "total_original": len(models),
        "total_processed": total_processed,
        "results": all_results
    }

    with open(OUTPUT_FILE, 'w', encoding='utf-8') as f:
        json.dump(output, f, ensure_ascii=False, indent=2)

    print(f"Сохранено: {len(all_results)} записей")

    # Stats
    models_extracted = sum(len(r.get("normalized", []) or []) for r in all_results)
    print(f"\nСтатистика:")
    print(f"  Исходных записей: {len(models)}")
    print(f"  Обработано: {total_processed}")
    print(f"  Извлечено моделей: {models_extracted}")

    print("\n" + "=" * 70)
    print("Готово!")


if __name__ == "__main__":
    main()
