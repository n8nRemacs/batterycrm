-- CORE_NEW: Migration 003 - Seed data for phone_repair vertical
-- Run on: PostgreSQL 185.221.214.83:6544

-- =============================================================================
-- 1. Категории проблем (глобальные, tenant_id = NULL)
-- =============================================================================

INSERT INTO elo_problem_categories (tenant_id, code, name, description, position) VALUES
    (NULL, 'display', 'Дисплей', 'Экран, тачскрин, подсветка', 1),
    (NULL, 'battery', 'Аккумулятор', 'Батарея, быстрая разрядка', 2),
    (NULL, 'connector', 'Разъём', 'Зарядка, наушники, SIM', 3),
    (NULL, 'camera', 'Камера', 'Основная, фронтальная, вспышка', 4),
    (NULL, 'speaker', 'Звук', 'Динамик, микрофон, наушники', 5),
    (NULL, 'network', 'Связь', 'Сеть, Wi-Fi, Bluetooth, GPS', 6),
    (NULL, 'software', 'ПО', 'Прошивка, зависания, вирусы', 7),
    (NULL, 'body', 'Корпус', 'Задняя крышка, рамка, кнопки', 8),
    (NULL, 'water', 'Залитие', 'Попадание влаги', 9),
    (NULL, 'motherboard', 'Материнская плата', 'Микросхемы, пайка', 10)
ON CONFLICT (tenant_id, code) DO NOTHING;

-- =============================================================================
-- 2. Получить vertical_id для phone_repair
-- =============================================================================

-- Сначала проверим что вертикаль существует
DO $$
DECLARE
    v_vertical_id UUID;
BEGIN
    SELECT id INTO v_vertical_id FROM elo_verticals WHERE code = 'phone_repair';

    IF v_vertical_id IS NULL THEN
        RAISE NOTICE 'Vertical phone_repair not found, skipping funnel stages';
        RETURN;
    END IF;

    -- =============================================================================
    -- 3. Этапы микроворонки для phone_repair (глобальные шаблоны)
    -- =============================================================================

    INSERT INTO elo_funnel_stages (tenant_id, vertical_id, code, name, position, entry_conditions, ai_goal, ai_prompt, exit_conditions) VALUES
    (NULL, v_vertical_id, 'greeting', 'Приветствие', 1,
        '{}',
        'Поприветствовать клиента, узнать имя',
        'Поприветствуй клиента. Если он уже представился, используй его имя. Спроси чем можешь помочь.',
        '{"any_of": ["client_name", "has_message"]}'
    ),
    (NULL, v_vertical_id, 'device', 'Устройство', 2,
        '{"has_message": true}',
        'Узнать какое устройство: бренд, модель, цвет',
        'Уточни у клиента какое устройство нуждается в помощи. Нужно узнать: бренд (Apple, Samsung, Xiaomi...), модель, цвет (для идентификации).',
        '{"all_of": ["device_brand", "device_model"]}'
    ),
    (NULL, v_vertical_id, 'problem', 'Проблема', 3,
        '{"all_of": ["device_brand", "device_model"]}',
        'Узнать что случилось: симптомы, когда началось, при каких обстоятельствах',
        'Клиент рассказал про устройство {device_brand} {device_model}. Уточни проблему: что именно не работает, когда это началось, было ли падение или залитие.',
        '{"any_of": ["symptom_text", "problem_category"]}'
    ),
    (NULL, v_vertical_id, 'price', 'Цена', 4,
        '{"any_of": ["symptom_text", "problem_category"]}',
        'Озвучить предварительную стоимость и сроки',
        'На основе описанной проблемы озвучь предварительную стоимость ремонта. Укажи что точная цена будет после диагностики.',
        '{"price_quoted": true}'
    ),
    (NULL, v_vertical_id, 'appointment', 'Запись', 5,
        '{"price_quoted": true}',
        'Договориться о дате и времени визита',
        'Клиент знает примерную цену. Предложи записаться на удобное время. Уточни адрес точки если несколько.',
        '{"any_of": ["appointment_time", "client_declined"]}'
    ),
    (NULL, v_vertical_id, 'closing', 'Закрытие', 6,
        '{"any_of": ["appointment_time", "client_declined"]}',
        'Подтвердить договорённости, попрощаться',
        'Подведи итог: что будем делать, когда ждём. Попрощайся. Если клиент отказался - спроси можно ли связаться позже.',
        '{"dialog_closed": true}'
    )
    ON CONFLICT (tenant_id, vertical_id, code) DO UPDATE SET
        name = EXCLUDED.name,
        position = EXCLUDED.position,
        entry_conditions = EXCLUDED.entry_conditions,
        ai_goal = EXCLUDED.ai_goal,
        ai_prompt = EXCLUDED.ai_prompt,
        exit_conditions = EXCLUDED.exit_conditions;

END $$;

-- =============================================================================
-- 4. Базовые типы симптомов (глобальные)
-- =============================================================================

INSERT INTO elo_symptom_types (tenant_id, code, name, category, variations, clarifying_questions) VALUES
    (NULL, 'screen_black', 'Чёрный экран', 'display',
        '["не включается экран", "экран не горит", "чёрный дисплей", "погас экран"]',
        '["Телефон включается? Звук есть?", "Было падение или удар?"]'
    ),
    (NULL, 'screen_cracked', 'Разбитый экран', 'display',
        '["трещина на экране", "разбил стекло", "паутинка", "сколы"]',
        '["Тачскрин работает?", "Изображение есть?"]'
    ),
    (NULL, 'touch_not_working', 'Не работает тачскрин', 'display',
        '["не реагирует на нажатия", "сенсор не работает", "тач глючит", "phantom touch"]',
        '["Полностью или частично?", "После падения или само?"]'
    ),
    (NULL, 'battery_drain', 'Быстро разряжается', 'battery',
        '["садится батарея", "не держит заряд", "быстро разряжается"]',
        '["За сколько разряжается?", "Сколько телефону лет?", "Вздулась батарея?"]'
    ),
    (NULL, 'not_charging', 'Не заряжается', 'connector',
        '["не заряжает", "не видит зарядку", "кабель не подходит"]',
        '["Пробовали другой кабель/зарядку?", "Было залитие?"]'
    ),
    (NULL, 'no_sound', 'Нет звука', 'speaker',
        '["не слышно", "динамик не работает", "тихий звук", "хрипит"]',
        '["В разговоре или медиа?", "Наушники работают?"]'
    ),
    (NULL, 'camera_blur', 'Камера мутная', 'camera',
        '["мутные фото", "камера не фокусируется", "пятна на фото"]',
        '["Основная или фронтальная?", "Было падение?"]'
    ),
    (NULL, 'water_damage', 'Попала вода', 'water',
        '["уронил в воду", "залил", "намок", "попала влага"]',
        '["Сколько времени прошло?", "Сушили как-то?", "Включается?"]'
    )
ON CONFLICT (tenant_id, code) DO NOTHING;

-- =============================================================================
-- Verify seed data
-- =============================================================================

SELECT 'problem_categories' as table_name, count(*) as cnt FROM elo_problem_categories
UNION ALL
SELECT 'funnel_stages', count(*) FROM elo_funnel_stages
UNION ALL
SELECT 'symptom_types', count(*) FROM elo_symptom_types;
