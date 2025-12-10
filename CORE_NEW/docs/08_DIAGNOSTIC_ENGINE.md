# ELDOLEADO: Диагностический движок

## Обзор

Самообучающаяся экспертная система диагностики, которая:
- Задаёт уточняющие вопросы на основе признаков/дефектов
- Предсказывает диагноз по комбинации признаков
- Обучается на расхождениях между ожиданием и фактом
- Накапливает экспертизу в графе знаний

---

## Философия

### Три слоя правды

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                                                                             │
│  1. СИМПТОМ (со слов клиента)                                              │
│     "Не заряжается"                                                        │
│     ─────────────────────────────────────────────────────────────────────  │
│     Сырые слова клиента. Часто неточные, эмоциональные.                    │
│     "Вообще сдох", "не включается", "батарея умерла"                       │
│                                                                             │
│                              │                                              │
│                              ▼                                              │
│                                                                             │
│  2. INTAKE (дефектовка при приёмке)                                        │
│     "Предположительно разъём зарядки"                                      │
│     ─────────────────────────────────────────────────────────────────────  │
│     Что планируем на основе уточняющих вопросов.                           │
│     Ожидаемый диагноз, цена, время.                                        │
│                                                                             │
│                              │                                              │
│                              ▼                                              │
│                                                                             │
│  3. REPAIR (факт после ремонта)                                            │
│     "Заменён контроллер питания"                                           │
│     ─────────────────────────────────────────────────────────────────────  │
│     Что реально сделано мастером.                                          │
│     Фактический диагноз, цена, время.                                      │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

### Зачем три слоя

| Проблема | Решение |
|----------|---------|
| Клиент говорит "не работает экран", а проблема в подсветке | Разделяем симптом и диагноз |
| Приёмщик ожидал одно, мастер нашёл другое | Фиксируем расхождение → обучаемся |
| Follow-up спрашивает "как новый дисплей?", а дисплей не меняли | Опираемся на REPAIR, не на SYMPTOM |
| Статистика цен по симптому врёт | Считаем по реальным ремонтам |

### Цикл обучения

```
Симптом → Уточняющие вопросы → Intake (прогноз) → Диагноз мастера → Repair (факт)
                                      │                                   │
                                      └─────────── СРАВНЕНИЕ ─────────────┘
                                                      │
                                            ┌────────┴────────┐
                                            │                 │
                                         Совпало           Расхождение
                                            │                 │
                                            ▼                 ▼
                                      Усиление            Анализ →
                                      паттерна            Новые знания
```

---

## Концепция: Дерево признаков

### От симптома к диагнозу

```
Симптом (что сказал клиент)
     │
     └──► Уточняющие вопросы (признаки/дефекты)
              │
              └──► Комбинация признаков
                        │
                        └──► Предсказание диагноза (с вероятностями)
                                  │
                                  └──► Реальный диагноз (обучение)
```

### Пример: "Не заряжается"

```
"Не заряжается"
     │
     ├── Совсем не реагирует? → ДА
     ├── Другой кабель пробовали? → ДА, не помогло
     ├── Другой блок? → ДА, не помогло  
     ├── Беспроводная зарядка? → РАБОТАЕТ!
     ├── Телефон был в воде? → ДА, неделю назад
     │
     └──► Вывод: 85% контроллер питания, 10% разъём, 5% другое
```

---

## Два потока обогащения знаний

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                                                                             │
│  TOP-DOWN (эксперт)                      BOTTOM-UP (из расхождений)        │
│                                                                             │
│  ┌─────────────────────┐                 ┌─────────────────────┐           │
│  │ Эксперт вручную     │                 │ Система выявила     │           │
│  │ добавляет:          │                 │ расхождение:        │           │
│  │                     │                 │                     │           │
│  │ • Типы симптомов    │                 │ Intake ≠ Repair     │           │
│  │ • Признаки/дефекты  │                 │         │           │           │
│  │ • Уточняющие вопросы│                 │         ▼           │           │
│  │ • Деревья вопросов  │                 │ Диалог → на анализ  │           │
│  │ • Связи признак→диаг│                 │ ответственному      │           │
│  └──────────┬──────────┘                 └──────────┬──────────┘           │
│             │                                       │                       │
│             │                                       │                       │
│             ▼                                       ▼                       │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │                        БАЗА ЗНАНИЙ                                   │   │
│  │                                                                      │   │
│  │   ELO_DefectSign ── ELO_QuestionTree ── ELO_SignPattern             │   │
│  │                                                                      │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

### TOP-DOWN: Экспертное наполнение

Эксперт (владелец бизнеса, опытный мастер) заполняет вручную:
- Типы симптомов и их вариации
- Признаки/дефекты для уточнения
- Вопросы для выявления признаков
- Связи "признак → диагноз"
- Деревья вопросов

### BOTTOM-UP: Обучение на расхождениях

Система автоматически:
1. Сравнивает Intake (ожидание) с Repair (факт)
2. При расхождении создаёт запись в очередь анализа
3. Ответственный анализирует диалог и принимает решение
4. Новые знания добавляются в базу

---

## Узлы графа

### ELO_DefectSign — Признак/Дефект

Наблюдаемый признак, который помогает уточнить диагноз.

```cypher
(:ELO_DefectSign {
    id: "uuid",
    tenant_id: "uuid",
    
    // Идентификация
    code: "charging_wireless_works",
    category: "charging",              // категория: charging, display, sound, etc.
    
    // Вопрос для выявления
    question: "А на беспроводной зарядке заряжается?",
    question_short: "Беспроводная работает?",
    
    // Тип ответа
    answer_type: "boolean",            // boolean | choice | scale | text
    choices: null,                     // для choice: ["да", "нет", "не знаю"]
    
    // Диагностическая ценность
    diagnostic_weight: 0.9,            // насколько важен для диагностики (0-1)
    
    // Когда спрашивать
    ask_order: 3,                      // порядок в цепочке вопросов
    ask_if: {                          // условия для вопроса
        symptom_type: "no_charge",
        previous_signs: ["other_cable_not_helped"]
    },
    
    // Источник
    source: "expert",                  // expert | deviation_analysis | auto
    source_deviation_id: null,         // если из анализа расхождения
    
    // Статистика использования
    times_asked: 1250,
    times_positive: 340,
    
    created_at: datetime,
    updated_at: datetime
})
```

### Примеры признаков по категориям

#### Категория: Зарядка (charging)

```cypher
// Базовые признаки
(:ELO_DefectSign {code: "charge_no_reaction", question: "Телефон вообще никак не реагирует на зарядку?", category: "charging", ask_order: 1})
(:ELO_DefectSign {code: "charge_slow", question: "Заряжается, но очень медленно?", category: "charging", ask_order: 1})
(:ELO_DefectSign {code: "charge_intermittent", question: "Заряжается, но прерывается — нужно шевелить кабель?", category: "charging", ask_order: 1})

// Уточняющие — кабель/блок
(:ELO_DefectSign {code: "other_cable_tried", question: "Другой кабель пробовали?", category: "charging", ask_order: 2})
(:ELO_DefectSign {code: "other_cable_helped", question: "С другим кабелем работает?", category: "charging", ask_order: 2})
(:ELO_DefectSign {code: "other_block_tried", question: "Другой блок питания пробовали?", category: "charging", ask_order: 2})

// Уточняющие — беспроводная
(:ELO_DefectSign {code: "wireless_works", question: "На беспроводной зарядке заряжается?", category: "charging", ask_order: 3})
(:ELO_DefectSign {code: "fast_charge_works", question: "Быстрая зарядка работает или только обычная?", category: "charging", ask_order: 3})

// Визуальные признаки
(:ELO_DefectSign {code: "port_dirty", question: "В разъёме есть грязь, пыль, ворсинки?", category: "charging", ask_order: 4})
(:ELO_DefectSign {code: "port_damaged", question: "Разъём визуально повреждён — погнутый, сломанный?", category: "charging", ask_order: 4})
(:ELO_DefectSign {code: "cable_loose", question: "Кабель болтается в разъёме, не держится плотно?", category: "charging", ask_order: 4})

// Контекст
(:ELO_DefectSign {code: "water_contact_recent", question: "Телефон падал в воду или был во влажной среде?", category: "charging", ask_order: 5})
(:ELO_DefectSign {code: "dropped_recently", question: "Телефон недавно падал?", category: "charging", ask_order: 5})
```

#### Категория: Дисплей (display)

```cypher
// Характер повреждения
(:ELO_DefectSign {code: "display_cracked_top", question: "Трещины сверху экрана?", category: "display"})
(:ELO_DefectSign {code: "display_cracked_bottom", question: "Трещины снизу экрана?", category: "display"})
(:ELO_DefectSign {code: "display_cracked_corner", question: "Трещины от угла?", category: "display"})
(:ELO_DefectSign {code: "display_shattered", question: "Экран в мелкую крошку или крупные трещины?", category: "display"})

// Работоспособность тача
(:ELO_DefectSign {code: "display_touch_works", question: "Тачскрин работает — можно нажимать?", category: "display"})
(:ELO_DefectSign {code: "display_touch_partial", question: "Тач работает частично — только в некоторых местах?", category: "display"})
(:ELO_DefectSign {code: "display_touch_ghost", question: "Экран сам нажимает — призрачные касания?", category: "display"})

// Изображение
(:ELO_DefectSign {code: "display_image_visible", question: "Изображение видно?", category: "display"})
(:ELO_DefectSign {code: "display_image_faint", question: "Изображение еле видно, очень тусклое?", category: "display"})
(:ELO_DefectSign {code: "display_black", question: "Экран полностью чёрный, ничего не видно?", category: "display"})

// Артефакты — полосы
(:ELO_DefectSign {code: "display_lines_vertical", question: "Полосы вертикальные?", category: "display"})
(:ELO_DefectSign {code: "display_lines_horizontal", question: "Полосы горизонтальные?", category: "display"})
(:ELO_DefectSign {code: "display_lines_colored", question: "Полосы цветные или чёрные/белые?", category: "display"})
(:ELO_DefectSign {code: "display_lines_permanent", question: "Полосы постоянные или мерцают?", category: "display"})

// Артефакты — пятна
(:ELO_DefectSign {code: "display_spots_black", question: "Пятна чёрные?", category: "display"})
(:ELO_DefectSign {code: "display_spots_colored", question: "Пятна цветные — жёлтые, зелёные, фиолетовые?", category: "display"})
(:ELO_DefectSign {code: "display_bleeding", question: "Пятна растекаются от края или трещины?", category: "display"})
(:ELO_DefectSign {code: "display_spots_growing", question: "Пятна увеличиваются со временем?", category: "display"})

// Подсветка
(:ELO_DefectSign {code: "display_dim", question: "Экран тусклый, яркость на максимум не помогает?", category: "display"})
(:ELO_DefectSign {code: "display_backlight_bleeding", question: "Засветы по краям экрана?", category: "display"})
(:ELO_DefectSign {code: "display_flicker", question: "Экран мерцает?", category: "display"})
(:ELO_DefectSign {code: "display_backlight_only", question: "Подсветка есть (экран светится), но изображения нет?", category: "display"})
```

#### Категория: Звук (sound)

```cypher
// Динамик
(:ELO_DefectSign {code: "sound_speaker_dead", question: "Динамик вообще не работает — ни звука?", category: "sound"})
(:ELO_DefectSign {code: "sound_speaker_quiet", question: "Звук есть, но очень тихий?", category: "sound"})
(:ELO_DefectSign {code: "sound_speaker_distorted", question: "Звук хрипит, искажается?", category: "sound"})
(:ELO_DefectSign {code: "sound_speaker_intermittent", question: "Звук то есть, то пропадает?", category: "sound"})

// Разговорный динамик
(:ELO_DefectSign {code: "sound_earpiece_dead", question: "В разговоре собеседника не слышно?", category: "sound"})
(:ELO_DefectSign {code: "sound_earpiece_quiet", question: "Собеседника слышно, но очень тихо?", category: "sound"})

// Микрофон
(:ELO_DefectSign {code: "sound_mic_dead", question: "Собеседник вас не слышит?", category: "sound"})
(:ELO_DefectSign {code: "sound_mic_quiet", question: "Собеседник слышит вас очень тихо?", category: "sound"})
(:ELO_DefectSign {code: "sound_mic_noisy", question: "Собеседник слышит шум, помехи?", category: "sound"})

// Уточнения
(:ELO_DefectSign {code: "sound_headphones_work", question: "В наушниках звук есть?", category: "sound"})
(:ELO_DefectSign {code: "sound_bluetooth_works", question: "По Bluetooth звук работает?", category: "sound"})
(:ELO_DefectSign {code: "sound_after_water", question: "Проблема появилась после воды?", category: "sound"})
(:ELO_DefectSign {code: "sound_after_drop", question: "Проблема появилась после падения?", category: "sound"})
```

#### Категория: Батарея (battery)

```cypher
(:ELO_DefectSign {code: "battery_drains_fast", question: "Батарея быстро разряжается?", category: "battery"})
(:ELO_DefectSign {code: "battery_drains_standby", question: "Разряжается даже в режиме ожидания?", category: "battery"})
(:ELO_DefectSign {code: "battery_percentage_jumps", question: "Процент заряда скачет — было 50%, стало 20%?", category: "battery"})
(:ELO_DefectSign {code: "battery_shuts_down", question: "Телефон выключается при заряде 20-30%?", category: "battery"})
(:ELO_DefectSign {code: "battery_swollen", question: "Батарея вздулась — крышка или экран отходят?", category: "battery"})
(:ELO_DefectSign {code: "battery_hot", question: "Телефон сильно греется?", category: "battery"})
(:ELO_DefectSign {code: "battery_old", question: "Телефону больше 2 лет?", category: "battery"})
(:ELO_DefectSign {code: "battery_health_low", question: "В настройках здоровье батареи ниже 80%?", category: "battery"})
```

---

### ELO_SignPattern — Паттерн признаков

Комбинация признаков, которая приводит к определённому диагнозу.

```cypher
(:ELO_SignPattern {
    id: "uuid",
    tenant_id: "uuid",
    
    // Хэш для быстрого поиска
    signs_hash: "hash_of_signs_combination",
    
    // Комбинация признаков
    signs: [
        {code: "charge_no_reaction", value: true},
        {code: "other_cable_helped", value: false},
        {code: "wireless_works", value: true},
        {code: "water_contact_recent", value: true}
    ],
    
    // К какому диагнозу приводит
    diagnosis_type_code: "charging_ic",
    
    // Статистика
    cases_count: 45,
    correct_count: 38,
    success_rate: 0.84,                // в 84% случаев диагноз подтвердился
    
    // Ценовой диапазон (из реальных ремонтов)
    price_min: 6000,
    price_max: 12000,
    price_avg: 8500,
    
    // Источник
    source: "deviation_analysis",      // expert | auto | deviation_analysis
    source_deviation_id: "uuid",
    
    created_at: datetime,
    updated_at: datetime
})
```

---

### ELO_QuestionTree — Дерево вопросов

Логика последовательности вопросов для конкретного симптома.

```cypher
(:ELO_QuestionTree {
    id: "uuid",
    tenant_id: "uuid",
    
    // Для какого симптома
    symptom_type_code: "no_charge",
    device_category: "smartphone",     // опционально: для конкретного типа устройств
    
    // Дерево решений (JSON)
    tree: {
        "root": {
            "sign": "charge_no_reaction",
            "question": "Телефон вообще не реагирует на зарядку?",
            "yes": {
                "sign": "other_cable_tried",
                "question": "Другой кабель пробовали?",
                "yes": {
                    "sign": "other_cable_helped",
                    "question": "С другим кабелем заработало?",
                    "yes": {
                        "conclusion": "cable_issue",
                        "message": "Похоже, проблема в кабеле. Попробуйте оригинальный кабель Apple."
                    },
                    "no": {
                        "sign": "wireless_works",
                        "question": "На беспроводной зарядке заряжается?",
                        "yes": {
                            "sign": "water_contact_recent",
                            "question": "Телефон был в воде или во влажной среде?",
                            "yes": {
                                "conclusion": "charging_ic",
                                "confidence": 0.85,
                                "message": "После воды часто страдает контроллер питания."
                            },
                            "no": {
                                "conclusion": "charging_port",
                                "confidence": 0.94,
                                "message": "Скорее всего проблема в разъёме зарядки."
                            }
                        },
                        "no": {
                            "sign": "dropped_recently",
                            "question": "Телефон недавно падал?",
                            "yes": {
                                "conclusion": "board_damage",
                                "confidence": 0.7,
                                "message": "Возможно повреждение платы после падения."
                            },
                            "no": {
                                "conclusion": "charging_ic",
                                "confidence": 0.6,
                                "message": "Возможно проблема в контроллере питания. Нужна диагностика."
                            }
                        }
                    }
                },
                "no": {
                    "action": "suggest_try_cable",
                    "message": "Попробуйте другой кабель и напишите результат."
                }
            },
            "no": {
                "sign": "charge_slow",
                "question": "Заряжается, но медленно?",
                "yes": {
                    "sign": "fast_charge_works",
                    "question": "Быстрая зарядка работает?",
                    "yes": {
                        "conclusion": "power_adapter",
                        "message": "Похоже, проблема в блоке питания — не поддерживает быструю зарядку."
                    },
                    "no": {
                        "conclusion": "charging_port_worn",
                        "confidence": 0.75,
                        "message": "Вероятно износ разъёма или проблема с батареей."
                    }
                }
            }
        }
    },
    
    version: 3,
    is_active: true,
    
    created_at: datetime,
    updated_at: datetime
})
```

---

### ELO_Intake — Запись при приёмке

Фиксация ожиданий при приёме устройства.

```cypher
(:ELO_Intake {
    id: "uuid",
    tenant_id: "uuid",
    issue_id: "uuid",
    
    // Что планируем (на основе дефектовки)
    expected_diagnosis_code: "charging_port",
    expected_diagnosis_name: "Разъём зарядки",
    
    expected_repairs: ["port_replacement"],
    
    expected_price_min: 2000,
    expected_price_max: 3500,
    expected_time_minutes: 60,
    
    // Уверенность в прогнозе
    confidence: 0.94,
    
    // Собранные признаки
    collected_signs: [
        {code: "charge_no_reaction", value: true, source: "client"},
        {code: "other_cable_helped", value: false, source: "client"},
        {code: "wireless_works", value: true, source: "client"},
        {code: "water_contact_recent", value: false, source: "client"},
        {code: "port_dirty", value: true, source: "visual_inspection"}
    ],
    
    // Какой паттерн сработал
    matched_pattern_id: "uuid",
    
    // Кто принял
    received_by_id: "uuid_operator",
    received_by_name: "Алексей",
    received_at: datetime,
    
    // Что сказали клиенту
    client_informed_text: "Скорее всего разъём зарядки, 2000-3500₽, около часа",
    
    // Примечания приёмщика
    notes: "Разъём грязный, много пыли"
})
```

---

### ELO_Deviation — Расхождение

Фиксация расхождения между ожиданием и фактом.

```cypher
(:ELO_Deviation {
    id: "uuid",
    tenant_id: "uuid",
    issue_id: "uuid",
    
    // Что ожидали (из Intake)
    intake_diagnosis_code: "charging_port",
    intake_diagnosis_name: "Разъём зарядки",
    intake_price_min: 2000,
    intake_price_max: 3500,
    intake_confidence: 0.94,
    
    // Что получили (из Repair)
    actual_diagnosis_code: "charging_ic",
    actual_diagnosis_name: "Контроллер питания",
    actual_price: 8500,
    
    // Тип расхождения
    deviation_type: "diagnosis_mismatch",    // diagnosis_mismatch | price_mismatch | time_mismatch
    
    // Серьёзность
    severity: "high",                         // low | medium | high | critical
    // low: цена отличается на 10-30%
    // medium: цена отличается на 30-50% или другой диагноз той же категории
    // high: цена отличается на 50-100% или совсем другой диагноз
    // critical: цена отличается более чем в 2 раза
    
    // Статус обработки
    status: "pending",                        // pending | in_review | resolved | dismissed
    
    // Назначено на анализ
    assigned_to_id: "uuid_responsible",
    assigned_to_name: "Дмитрий",
    assigned_at: datetime,
    
    // Результат анализа (заполняется после)
    resolution_type: null,
    // new_sign_added — добавлен новый признак/вопрос
    // pattern_updated — обновлена связь признаки→диагноз
    // tree_updated — изменено дерево вопросов
    // operator_error — ошибка приёмщика
    // edge_case — редкий случай
    // client_misinformed — клиент дал неверную информацию
    // dismissed — ложное срабатывание
    
    resolution_notes: null,
    
    // Что добавлено в базу знаний
    knowledge_added: null,
    // {
    //     type: "defect_sign",
    //     sign: {...},
    //     pattern: {...}
    // }
    
    resolved_by_id: null,
    resolved_by_name: null,
    resolved_at: null,
    
    created_at: datetime
})
```

---

## Связи для обучения

### Признак указывает на диагноз

```cypher
// Признак часто приводит к определённому диагнозу
(sign:ELO_DefectSign)-[:INDICATES {
    strength: 0.85,                    // сила связи (0-1)
    cases: 450,                        // на скольких случаях основано
    last_updated: datetime
}]->(diagType:ELO_DiagnosisType)
```

### Паттерн предсказывает диагноз

```cypher
// Комбинация признаков → диагноз
(pattern:ELO_SignPattern)-[:PREDICTS {
    confidence: 0.94,
    cases: 234
}]->(diagType:ELO_DiagnosisType)
```

### Расхождение привело к новому знанию

```cypher
// Из анализа расхождения добавлен признак
(deviation:ELO_Deviation)-[:RESULTED_IN]->(sign:ELO_DefectSign)

// Из анализа расхождения добавлен паттерн
(deviation:ELO_Deviation)-[:RESULTED_IN]->(pattern:ELO_SignPattern)
```

---

## Полная схема связей

```
ELO_Message (точка входа)
     │
     └──[:FROM]──► ELO_Client
                        │
                        └──[:OWNS]──► ELO_Device
                                          │
                                          └──[:HAS_ISSUE]──► ELO_Issue
                                                                │
                   ┌────────────────────────────────────────────┼────────────────────────────────────────────┐
                   │                                            │                                            │
                   ▼                                            ▼                                            ▼
             ELO_Symptom                                  ELO_Intake                                  ELO_Diagnosis
             (со слов клиента)                           (при приёмке)                               (что нашли)
                   │                                            │                                            │
                   ├──[:SYMPTOM_TYPE]──► ELO_SymptomType        │                                            │
                   │                                            │                                            │
                   │                                    collected_signs                                      │
                   │                                            │                                            │
                   │                                            ▼                                            │
                   │                                   ELO_SignPattern                                       │
                   │                                            │                                            │
                   │                                    [:PREDICTS]                                          │
                   │                                            │                                            │
                   │                                            ▼                                            │
                   │                              ┌───── ELO_DiagnosisType ◄────[:DIAGNOSIS_TYPE]────────────┘
                   │                              │             │
                   │                              │             │
                   │                       [:INDICATES]         │
                   │                              │             │
                   │                              ▲             │
                   │                              │             │
                   │                       ELO_DefectSign       │
                   │                              │             │
                   │                              │             │
                   │                       [:RESULTED_IN]       │
                   │                              │             │
                   │                              │             │
                   │                       ELO_Deviation ◄──────┤ (если расхождение)
                   │                                            │
                   │                                            │
                   │                                            ▼
                   │                                      ELO_Repair
                   │                                      (что сделали)
                   │                                            │
                   │                                            └──[:REPAIR_ACTION]──► ELO_RepairAction
                   │
                   └──[:HAS_SIGN]──► (собранные признаки в процессе диалога)
```

---

## Workflow обработки сообщения

### 1. Клиент описывает симптом

```
Клиент: "Телефон не заряжается"
```

### 2. AI извлекает симптом, загружает дерево вопросов

```cypher
// Найти тип симптома
MATCH (st:ELO_SymptomType)
WHERE st.code = 'no_charge' 
   OR 'не заряжается' IN st.variations
RETURN st

// Загрузить дерево вопросов
MATCH (tree:ELO_QuestionTree {symptom_type_code: 'no_charge', is_active: true})
RETURN tree.tree as decision_tree
```

### 3. AI задаёт уточняющие вопросы

```
AI: Телефон вообще не реагирует на зарядку, или заряжается, но медленно/с перебоями?

Клиент: Вообще не реагирует

AI: (записал: charge_no_reaction = true)

AI: Пробовали другой кабель?

Клиент: Да, не помогло

AI: (записал: other_cable_tried = true, other_cable_helped = false)

AI: А на беспроводной зарядке работает?

Клиент: Да, беспроводная работает!

AI: (записал: wireless_works = true)
```

### 4. AI ищет паттерн

```cypher
// Найти паттерн по собранным признакам
MATCH (pattern:ELO_SignPattern)
WHERE pattern.signs_hash = $signsHash
RETURN pattern

// Или найти наиболее похожий паттерн
UNWIND $collectedSigns as sign
MATCH (s:ELO_DefectSign {code: sign.code})-[r:INDICATES]->(dt:ELO_DiagnosisType)
WHERE r.cases > 10
WITH dt, 
     sum(r.strength) as score,
     collect(s.code) as matched_signs
RETURN dt.code, dt.name, score, matched_signs
ORDER BY score DESC
LIMIT 3
```

### 5. AI делает прогноз

```
AI: Понял. По симптомам похоже на проблему с разъёмом зарядки — 
    в 94% случаев с такими признаками это именно он.
    
    Замена разъёма на iPhone 14 Pro: 2500-3500₽, около часа.
    
    Но точно скажем после диагностики — иногда бывает проблема 
    в контроллере питания.
    
    Записать на диагностику?
```

### 6. При приёмке создаётся Intake

```cypher
CREATE (intake:ELO_Intake {
    id: randomUUID(),
    issue_id: $issueId,
    expected_diagnosis_code: 'charging_port',
    expected_price_min: 2500,
    expected_price_max: 3500,
    confidence: 0.94,
    collected_signs: $signs,
    received_by_id: $operatorId,
    received_at: datetime()
})
```

### 7. После ремонта — сравнение

```cypher
// Триггер после создания Repair
MATCH (intake:ELO_Intake {issue_id: $issueId})
MATCH (repair:ELO_Repair {issue_id: $issueId})
MATCH (diag:ELO_Diagnosis {issue_id: $issueId})

// Проверить совпадение
WITH intake, repair, diag,
     intake.expected_diagnosis_code = diag.diagnosis_type_code as diagnosis_match,
     repair.total_price <= intake.expected_price_max * 1.1 as price_match

// Если совпало — усилить паттерн
FOREACH (_ IN CASE WHEN diagnosis_match AND price_match THEN [1] ELSE [] END |
    MERGE (pattern:ELO_SignPattern {signs_hash: intake.signs_hash})
    SET pattern.cases_count = pattern.cases_count + 1,
        pattern.correct_count = pattern.correct_count + 1,
        pattern.success_rate = toFloat(pattern.correct_count) / pattern.cases_count
)

// Если НЕ совпало — создать Deviation
FOREACH (_ IN CASE WHEN NOT diagnosis_match OR NOT price_match THEN [1] ELSE [] END |
    CREATE (dev:ELO_Deviation {
        id: randomUUID(),
        issue_id: $issueId,
        intake_diagnosis_code: intake.expected_diagnosis_code,
        actual_diagnosis_code: diag.diagnosis_type_code,
        intake_price_max: intake.expected_price_max,
        actual_price: repair.total_price,
        deviation_type: CASE 
            WHEN NOT diagnosis_match THEN 'diagnosis_mismatch'
            ELSE 'price_mismatch'
        END,
        severity: CASE 
            WHEN repair.total_price > intake.expected_price_max * 2 THEN 'critical'
            WHEN repair.total_price > intake.expected_price_max * 1.5 THEN 'high'
            WHEN NOT diagnosis_match THEN 'medium'
            ELSE 'low'
        END,
        status: 'pending',
        created_at: datetime()
    })
)
```

---

## Workflow анализа расхождений

### Автоматический триггер

При создании ELO_Repair система автоматически:
1. Сравнивает с ELO_Intake
2. При расхождении создаёт ELO_Deviation
3. Назначает на ответственного (по правилам тенанта)
4. Отправляет уведомление

### Интерфейс очереди расхождений

```
┌─────────────────────────────────────────────────────────────────────────────┐
│  РАСХОЖДЕНИЯ НА АНАЛИЗ                                        [Фильтры ▼]  │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  🔴 CRITICAL (2)    🟠 HIGH (5)    🟡 MEDIUM (12)    ⚪ LOW (8)            │
│                                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │ 🔴 iPhone 14 Pro — Зарядка                           2 часа назад   │   │
│  │                                                                      │   │
│  │ Ожидали: Разъём (2500₽)                                             │   │
│  │ Факт:    Контроллер питания (8500₽)                                 │   │
│  │                                                                      │   │
│  │ Признаки: [не реагирует ✓] [другой кабель ✓] [беспроводная ✓]       │   │
│  │                                                                      │   │
│  │ [Открыть диалог]  [Анализировать]                                   │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
│                                                                             │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │ 🟠 Samsung S23 — Дисплей                              вчера         │   │
│  │                                                                      │   │
│  │ Ожидали: Замена дисплея (12000₽)                                    │   │
│  │ Факт:    Замена дисплея + шлейф (15000₽)                            │   │
│  │                                                                      │   │
│  │ [Открыть диалог]  [Анализировать]                                   │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

### Экран анализа расхождения

```
┌─────────────────────────────────────────────────────────────────────────────┐
│  АНАЛИЗ РАСХОЖДЕНИЯ                                              [Закрыть] │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  КЛИЕНТ: Иван Петров           УСТРОЙСТВО: iPhone 14 Pro                   │
│                                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  ┌─ ДИАЛОГ С КЛИЕНТОМ ──────────────────────────────────────────────────┐  │
│  │                                                                       │  │
│  │  Клиент: Телефон не заряжается                                       │  │
│  │                                                                       │  │
│  │  Бот: Телефон вообще не реагирует на зарядку?                        │  │
│  │                                                                       │  │
│  │  Клиент: Да, вообще ноль                                             │  │
│  │                                                                       │  │
│  │  Бот: Другой кабель пробовали?                                       │  │
│  │                                                                       │  │
│  │  Клиент: Да, три разных, не помогает                                 │  │
│  │                                                                       │  │
│  │  Бот: А на беспроводной зарядке работает?                            │  │
│  │                                                                       │  │
│  │  Клиент: Да, беспроводная работает!                                  │  │
│  │                                                                       │  │
│  │  💡 Система не спросила: был ли контакт с водой?                     │  │
│  │                                                                       │  │
│  └───────────────────────────────────────────────────────────────────────┘  │
│                                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  ┌─ INTAKE (приёмка) ───────────────┐  ┌─ ФАКТ (ремонт) ─────────────────┐ │
│  │                                   │  │                                 │ │
│  │ Диагноз: Разъём зарядки          │  │ Диагноз: Контроллер питания     │ │
│  │ Цена: 2000-3500₽                 │  │ Цена: 8500₽                     │ │
│  │ Уверенность: 94%                 │  │                                 │ │
│  │                                   │  │ Комментарий мастера:            │ │
│  │ Признаки:                        │  │ "Разъём в норме, сгорел         │ │
│  │ ✓ Не реагирует                   │  │  контроллер. Следы окисления —  │ │
│  │ ✓ Другой кабель не помог         │  │  был в воде"                    │ │
│  │ ✓ Беспроводная работает          │  │                                 │ │
│  │                                   │  │                                 │ │
│  └───────────────────────────────────┘  └─────────────────────────────────┘ │
│                                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  ПРИЧИНА РАСХОЖДЕНИЯ:                                                      │
│                                                                             │
│  ○ Ошибка приёмщика                                                        │
│  ○ Редкий случай (edge case)                                               │
│  ● Не хватило вопроса для уточнения                                        │
│  ○ Клиент дал неверную информацию                                          │
│  ○ Другое: _______________                                                 │
│                                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  ДЕЙСТВИЕ:                                                                  │
│                                                                             │
│  ☑ Добавить новый признак:                                                 │
│    ┌─────────────────────────────────────────────────────────────────────┐ │
│    │ Код: water_contact_recent                                           │ │
│    │ Вопрос: "Телефон падал в воду или был во влажной среде?"            │ │
│    │ Категория: charging                                                 │ │
│    │ Спрашивать после: [wireless_works = true]                           │ │
│    └─────────────────────────────────────────────────────────────────────┘ │
│                                                                             │
│  ☑ Добавить связь:                                                         │
│    [wireless_works=true] + [water_contact=true] → charging_ic (85%)        │
│                                                                             │
│  ☑ Обновить дерево вопросов:                                               │
│    После "беспроводная работает?" добавить ветку "контакт с водой?"        │
│                                                                             │
│                                          [Отмена]  [Сохранить и закрыть]   │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

### Типы резолюций

| Тип | Описание | Действие в системе |
|-----|----------|-------------------|
| `new_sign_added` | Добавлен новый признак/вопрос | Создан ELO_DefectSign, обновлено дерево |
| `pattern_updated` | Обновлена связь признаки→диагноз | Создан/изменён ELO_SignPattern |
| `tree_updated` | Изменено дерево вопросов | Обновлён ELO_QuestionTree |
| `operator_error` | Ошибка приёмщика | Записано в метрику качества приёмщика |
| `edge_case` | Редкий случай, не влияет на модель | Помечено, паттерн не изменяется |
| `client_misinformed` | Клиент дал неверную информацию | Помечено, возможно добавить проверочный вопрос |
| `dismissed` | Ложное срабатывание | Игнорируется |

---

## Применение новых знаний

### После добавления нового признака

```cypher
// Создать новый признак
CREATE (sign:ELO_DefectSign {
    id: randomUUID(),
    tenant_id: $tenantId,
    code: 'water_contact_recent',
    category: 'charging',
    question: 'Телефон падал в воду или был во влажной среде?',
    question_short: 'Контакт с водой?',
    answer_type: 'boolean',
    diagnostic_weight: 0.8,
    ask_order: 4,
    ask_if: {
        symptom_type: 'no_charge',
        previous_signs: ['wireless_works']
    },
    source: 'deviation_analysis',
    source_deviation_id: $deviationId,
    times_asked: 0,
    times_positive: 0,
    created_at: datetime()
})

// Связать расхождение с новым знанием
MATCH (dev:ELO_Deviation {id: $deviationId})
CREATE (dev)-[:RESULTED_IN]->(sign)
```

### После добавления паттерна

```cypher
// Создать паттерн
CREATE (pattern:ELO_SignPattern {
    id: randomUUID(),
    tenant_id: $tenantId,
    signs_hash: $signsHash,
    signs: [
        {code: 'charge_no_reaction', value: true},
        {code: 'wireless_works', value: true},
        {code: 'water_contact_recent', value: true}
    ],
    diagnosis_type_code: 'charging_ic',
    cases_count: 1,
    correct_count: 1,
    success_rate: 1.0,
    source: 'deviation_analysis',
    source_deviation_id: $deviationId,
    created_at: datetime()
})

// Связать с типом диагноза
MATCH (dt:ELO_DiagnosisType {code: 'charging_ic'})
CREATE (pattern)-[:PREDICTS {confidence: 0.85}]->(dt)
```

### Обновление дерева вопросов

```cypher
// Получить текущее дерево
MATCH (tree:ELO_QuestionTree {symptom_type_code: 'no_charge', is_active: true})

// Обновить JSON (добавить ветку)
SET tree.tree = $updatedTree,
    tree.version = tree.version + 1,
    tree.updated_at = datetime()
```

---

## Диалог после обучения

### До обучения

```
Клиент: Телефон не заряжается

AI: Телефон вообще не реагирует на зарядку?

Клиент: Да

AI: Другой кабель пробовали?

Клиент: Да, не помогает

AI: А на беспроводной зарядке работает?

Клиент: Да, беспроводная работает

AI: Похоже на проблему с разъёмом зарядки — 2500-3500₽.
```

### После обучения

```
Клиент: Телефон не заряжается

AI: Телефон вообще не реагирует на зарядку?

Клиент: Да

AI: Другой кабель пробовали?

Клиент: Да, не помогает

AI: А на беспроводной зарядке работает?

Клиент: Да, беспроводная работает

AI: Телефон падал в воду или был во влажной среде?  ← НОВЫЙ ВОПРОС

Клиент: Да, неделю назад уронил в ванну

AI: Понял. После контакта с водой при таких симптомах 
    обычно проблема в контроллере питания, не в разъёме.
    
    Ремонт контроллера: 6000-9000₽, 2-3 часа.
    
    Если бы воды не было — скорее всего был бы просто 
    разъём (2500-3500₽).
    
    Записать на диагностику?
```

---

## Метрики качества

### Точность дефектовки по приёмщикам

```cypher
MATCH (intake:ELO_Intake)
MATCH (diag:ELO_Diagnosis {issue_id: intake.issue_id})
WITH intake.received_by_id as operator_id,
     intake.received_by_name as operator_name,
     count(*) as total,
     sum(CASE WHEN intake.expected_diagnosis_code = diag.diagnosis_type_code THEN 1 ELSE 0 END) as correct
RETURN operator_name, total, correct, 
       round(toFloat(correct) / total * 100, 1) as accuracy_percent
ORDER BY total DESC
```

**Результат:**

| Приёмщик | Всего | Верно | Точность |
|----------|-------|-------|----------|
| Алексей | 450 | 410 | 91.1% |
| Мария | 380 | 320 | 84.2% |
| Новичок | 50 | 30 | 60.0% |

### Улучшение точности со временем

```cypher
MATCH (intake:ELO_Intake)
MATCH (diag:ELO_Diagnosis {issue_id: intake.issue_id})
WITH date(intake.received_at).month as month,
     date(intake.received_at).year as year,
     count(*) as total,
     sum(CASE WHEN intake.expected_diagnosis_code = diag.diagnosis_type_code THEN 1 ELSE 0 END) as correct
RETURN year, month, total, correct,
       round(toFloat(correct) / total * 100, 1) as accuracy_percent
ORDER BY year, month
```

**Результат:**

| Год | Месяц | Всего | Верно | Точность |
|-----|-------|-------|-------|----------|
| 2025 | 1 | 200 | 140 | 70.0% |
| 2025 | 2 | 250 | 190 | 76.0% |
| 2025 | 3 | 300 | 252 | 84.0% |
| 2025 | 4 | 320 | 284 | 88.8% |

**Инсайт:** Система обучается — точность выросла с 70% до 89% за 4 месяца.

### Эффективность добавленных признаков

```cypher
MATCH (sign:ELO_DefectSign)
WHERE sign.source = 'deviation_analysis'
  AND sign.times_asked > 0
RETURN sign.code, sign.question,
       sign.times_asked,
       sign.times_positive,
       round(toFloat(sign.times_positive) / sign.times_asked * 100, 1) as hit_rate
ORDER BY sign.times_asked DESC
```

### Статистика расхождений

```cypher
MATCH (d:ELO_Deviation)
WHERE d.created_at > datetime() - duration('P30D')
RETURN d.severity as severity,
       d.status as status,
       count(*) as count
ORDER BY 
    CASE d.severity 
        WHEN 'critical' THEN 1 
        WHEN 'high' THEN 2 
        WHEN 'medium' THEN 3 
        ELSE 4 
    END
```

### Вклад обучения в базу знаний

```cypher
MATCH (d:ELO_Deviation)
WHERE d.resolution_type IS NOT NULL 
  AND d.resolution_type <> 'dismissed'
RETURN d.resolution_type as type,
       count(*) as count
ORDER BY count DESC
```

**Результат:**

| Тип резолюции | Количество |
|---------------|------------|
| new_sign_added | 45 |
| pattern_updated | 120 |
| tree_updated | 25 |
| operator_error | 30 |
| edge_case | 15 |
| client_misinformed | 10 |

---

## Предсказание диагноза

### Запрос для предсказания

```cypher
// Собранные признаки от клиента
WITH [
    {code: 'charge_no_reaction', value: true},
    {code: 'other_cable_helped', value: false},
    {code: 'wireless_works', value: true}
] as collectedSigns

// Найти паттерны с этими признаками
MATCH (pattern:ELO_SignPattern)
WHERE all(sign IN collectedSigns WHERE 
    sign IN pattern.signs
)
AND pattern.cases_count >= 5  // минимум 5 случаев для статистики

// Вернуть с вероятностями
RETURN pattern.diagnosis_type_code as diagnosis,
       pattern.success_rate as probability,
       pattern.cases_count as cases,
       pattern.price_min as price_min,
       pattern.price_max as price_max
ORDER BY pattern.success_rate DESC
LIMIT 3
```

### Альтернативный запрос (по весам признаков)

```cypher
UNWIND $collectedSigns as sign
MATCH (s:ELO_DefectSign {code: sign.code})-[r:INDICATES]->(dt:ELO_DiagnosisType)
WHERE r.cases > 10

WITH dt, 
     sum(r.strength * s.diagnostic_weight) as score,
     count(s) as matched_signs,
     collect(s.code) as signs_used

RETURN dt.code as diagnosis,
       dt.name as diagnosis_name,
       round(score * 100, 1) as confidence_score,
       matched_signs,
       signs_used
ORDER BY score DESC
LIMIT 3
```

---

## Seed Data: Начальные данные

### Категории признаков

```cypher
// Категории для группировки признаков
CREATE (:ELO_SignCategory {code: 'charging', name: 'Зарядка'})
CREATE (:ELO_SignCategory {code: 'display', name: 'Дисплей'})
CREATE (:ELO_SignCategory {code: 'sound', name: 'Звук'})
CREATE (:ELO_SignCategory {code: 'battery', name: 'Батарея'})
CREATE (:ELO_SignCategory {code: 'camera', name: 'Камера'})
CREATE (:ELO_SignCategory {code: 'connectivity', name: 'Связь'})
CREATE (:ELO_SignCategory {code: 'physical', name: 'Физические повреждения'})
CREATE (:ELO_SignCategory {code: 'software', name: 'Программные проблемы'})
```

### Базовые признаки (минимальный набор)

```cypher
// Зарядка
CREATE (:ELO_DefectSign {code: 'charge_no_reaction', category: 'charging', question: 'Телефон вообще не реагирует на зарядку?', answer_type: 'boolean', diagnostic_weight: 0.9, ask_order: 1, source: 'expert'})
CREATE (:ELO_DefectSign {code: 'charge_slow', category: 'charging', question: 'Заряжается очень медленно?', answer_type: 'boolean', diagnostic_weight: 0.7, ask_order: 1, source: 'expert'})
CREATE (:ELO_DefectSign {code: 'other_cable_tried', category: 'charging', question: 'Другой кабель пробовали?', answer_type: 'boolean', diagnostic_weight: 0.8, ask_order: 2, source: 'expert'})
CREATE (:ELO_DefectSign {code: 'wireless_works', category: 'charging', question: 'На беспроводной зарядке работает?', answer_type: 'boolean', diagnostic_weight: 0.95, ask_order: 3, source: 'expert'})

// Дисплей
CREATE (:ELO_DefectSign {code: 'display_cracked', category: 'display', question: 'Экран разбит/треснут?', answer_type: 'boolean', diagnostic_weight: 0.9, ask_order: 1, source: 'expert'})
CREATE (:ELO_DefectSign {code: 'display_touch_works', category: 'display', question: 'Тачскрин работает?', answer_type: 'boolean', diagnostic_weight: 0.85, ask_order: 2, source: 'expert'})
CREATE (:ELO_DefectSign {code: 'display_image_visible', category: 'display', question: 'Изображение видно?', answer_type: 'boolean', diagnostic_weight: 0.9, ask_order: 2, source: 'expert'})

// Контекст
CREATE (:ELO_DefectSign {code: 'water_contact', category: 'physical', question: 'Телефон был в воде?', answer_type: 'boolean', diagnostic_weight: 0.85, ask_order: 5, source: 'expert'})
CREATE (:ELO_DefectSign {code: 'dropped_recently', category: 'physical', question: 'Телефон недавно падал?', answer_type: 'boolean', diagnostic_weight: 0.7, ask_order: 5, source: 'expert'})
```

### Базовые связи признак→диагноз

```cypher
// wireless_works = true → высокая вероятность проблемы с разъёмом
MATCH (sign:ELO_DefectSign {code: 'wireless_works'})
MATCH (diag:ELO_DiagnosisType {code: 'charging_port_damaged'})
CREATE (sign)-[:INDICATES {strength: 0.9, cases: 100}]->(diag)

// wireless_works = true + water_contact = true → контроллер питания
MATCH (sign:ELO_DefectSign {code: 'water_contact'})
MATCH (diag:ELO_DiagnosisType {code: 'charging_ic'})
CREATE (sign)-[:INDICATES {strength: 0.85, cases: 50}]->(diag)
```

---

## Итоговая архитектура

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                                                                             │
│                      ДИАГНОСТИЧЕСКИЙ ДВИЖОК                                 │
│                                                                             │
│  ┌─────────────────────┐                 ┌─────────────────────┐           │
│  │                     │                 │                     │           │
│  │    TOP-DOWN         │                 │    BOTTOM-UP        │           │
│  │    (эксперт)        │                 │    (расхождения)    │           │
│  │                     │                 │                     │           │
│  │  • Справочники      │                 │  • Авто-триггер     │           │
│  │  • Типы симптомов   │                 │  • Очередь анализа  │           │
│  │  • Признаки/вопросы │                 │  • Интерфейс        │           │
│  │  • Деревья          │                 │  • Резолюции        │           │
│  │                     │                 │                     │           │
│  └──────────┬──────────┘                 └──────────┬──────────┘           │
│             │                                       │                       │
│             ▼                                       ▼                       │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │                        БАЗА ЗНАНИЙ                                   │   │
│  │                                                                      │   │
│  │   ELO_DefectSign ── ELO_SignPattern ── ELO_QuestionTree             │   │
│  │         │                  │                    │                    │   │
│  │         └──────────────────┼────────────────────┘                    │   │
│  │                            │                                         │   │
│  │                     [:INDICATES]                                     │   │
│  │                     [:PREDICTS]                                      │   │
│  │                            │                                         │   │
│  │                            ▼                                         │   │
│  │                   ELO_DiagnosisType                                  │   │
│  │                                                                      │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
│                            │                                               │
│                            ▼                                               │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │                      AI-ДВИЖОК                                       │   │
│  │                                                                      │   │
│  │  1. Извлекает симптом из сообщения                                  │   │
│  │  2. Загружает дерево вопросов                                       │   │
│  │  3. Задаёт уточняющие вопросы                                       │   │
│  │  4. Собирает признаки                                               │   │
│  │  5. Ищет паттерн → предсказывает диагноз                           │   │
│  │  6. Формирует Intake при приёмке                                    │   │
│  │                                                                      │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
│                            │                                               │
│                            ▼                                               │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │                   ЦИКЛ ОБРАТНОЙ СВЯЗИ                                │   │
│  │                                                                      │   │
│  │   Intake (ожидание) ──► Repair (факт) ──► Сравнение                 │   │
│  │                                               │                      │   │
│  │                              ┌────────────────┴────────────────┐     │   │
│  │                              │                                 │     │   │
│  │                           Совпало                         Расхождение│   │
│  │                              │                                 │     │   │
│  │                              ▼                                 ▼     │   │
│  │                        Усиление                           Анализ → │   │
│  │                        паттерна                           Новые     │   │
│  │                                                           знания    │   │
│  │                                                                      │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Преимущества системы

| Аспект | Было | Стало |
|--------|------|-------|
| Дефектовка | "Не знаю, пока не посмотрю" | "В 94% случаев это разъём, но если была вода — контроллер" |
| Обучение | Опыт в голове мастера | Опыт в графе, доступен всем |
| Вопросы | Одинаковые всем | Адаптивные, зависят от предыдущих ответов |
| Ошибки | Повторяются | Анализируются → система учится |
| Новички | Долго набирают опыт | Сразу используют накопленные знания |
| Цены | "Примерно от ... до ..." | Точные диапазоны из статистики |

---

## Следующие шаги

1. [ ] Создать базовые справочники признаков (top-down)
2. [ ] Реализовать workflow сбора признаков в диалоге
3. [ ] Реализовать создание Intake при приёмке
4. [ ] Реализовать сравнение Intake vs Repair
5. [ ] Создать интерфейс анализа расхождений
6. [ ] Реализовать применение новых знаний из анализа

---

**Документ:** 04_DIAGNOSTIC_ENGINE.md
**Версия:** 1.0
**Создан:** 2025-12-10 10:32 UTC
**Автор:** Dmitry + Claude
**Проект:** Eldoleado
