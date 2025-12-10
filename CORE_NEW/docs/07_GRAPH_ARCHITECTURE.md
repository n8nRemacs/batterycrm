# ELDOLEADO: Архитектура графа Neo4j

## Философия

### Почему граф, а не реляционная база

**Реляционная БД (PostgreSQL):**
```
SELECT * FROM issues 
JOIN devices ON issues.device_id = devices.id
JOIN clients ON devices.client_id = clients.id
JOIN symptoms ON issues.id = symptoms.issue_id
JOIN diagnoses ON issues.id = diagnoses.issue_id
JOIN repairs ON issues.id = repairs.issue_id
WHERE clients.id = '...'
```
5 JOIN-ов для одного запроса. При глубине связей 6+ — экспоненциальный рост сложности.

**Графовая БД (Neo4j):**
```cypher
MATCH (c:ELO_Client {id: $id})-[*1..6]-(related)
RETURN related
```
Один запрос, любая глубина, миллисекунды.

### Принцип: Сообщение как точка входа

Каждое взаимодействие с системой начинается с сообщения. Сообщение — это **якорь**, от которого расходятся связи ко всему релевантному:

```
                         ELO_Message
                        (точка входа)
                              │
        ┌─────────────────────┼─────────────────────┐
        │                     │                     │
   [:FROM]             [:ABOUT_DEVICE]        [:ABOUT_ISSUE]
        │                     │                     │
        ▼                     ▼                     ▼
   ELO_Client            ELO_Device            ELO_Issue
```

**Граф не хранит состояние диалога** — он вычисляет контекст в момент запроса.

### Три слоя правды

Ключевая инновация — разделение информации о проблеме на три слоя:

| Слой | Источник | Достоверность | Применение |
|------|----------|---------------|------------|
| **Symptom** | Клиент | Субъективно | Первичная оценка, общение |
| **Diagnosis** | Мастер | Объективно | Реальная картина |
| **Repair** | Мастер | Факт | Follow-up, гарантия |

**Пример расхождения:**
- Клиент: "Не работает экран" (Symptom)
- Мастер: "Сгорел фильтр подсветки" (Diagnosis)  
- Ремонт: "Замена фильтра подсветки" (Repair)

Без этого разделения система спросит: "Как ваш новый дисплей?" — хотя дисплей не меняли.

---

## Структура узлов

### Иерархия сущностей

```
ELO_Client (кто)
     │
     └──► ELO_Device (что)
              │
              └──► ELO_Issue (случай обращения)
                        │
                        ├──► ELO_Symptom (со слов клиента)
                        │         │
                        │         └──► ELO_SymptomType (справочник)
                        │
                        ├──► ELO_Diagnosis (что нашёл мастер)
                        │         │
                        │         └──► ELO_DiagnosisType (справочник)
                        │
                        └──► ELO_Repair (что сделали)
                                  │
                                  └──► ELO_RepairAction (справочник)
```

### ELO_Message — Сообщение (точка входа)

```cypher
(:ELO_Message {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Временная метка (определяет порядок)
    timestamp: datetime,
    
    // Направление и канал
    direction: "inbound",              // inbound | outbound
    channel: "telegram",               // telegram | whatsapp | avito | vk | phone
    
    // Внешние идентификаторы
    external_chat_id: "123456789",     // ID чата в мессенджере
    external_msg_id: "msg_789",        // ID сообщения в мессенджере
    
    // Содержимое
    content: "Разбил экран на айфоне, сколько стоит замена?",
    
    // Медиа (если есть)
    has_media: true,
    media_type: "photo",               // photo | video | voice | document
    media_url: "https://..."
})
```

**Зачем:**
- Точка входа в граф для любого запроса
- timestamp определяет хронологию без контейнера "диалог"
- external_chat_id позволяет группировать по чату если нужно

**Связи ОТ сообщения:**
- `[:FROM]` → ELO_Client (кто написал)
- `[:ABOUT_DEVICE]` → ELO_Device (про какое устройство)
- `[:ABOUT_ISSUE]` → ELO_Issue (про какой случай)
- `[:DESCRIBES_SYMPTOM]` → ELO_Symptom (описывает симптом)

---

### ELO_Client — Клиент

```cypher
(:ELO_Client {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Контакты (каналы связи)
    phone: "+79161234567",
    telegram_id: "123456789",
    whatsapp_id: "79161234567",
    vk_id: "id123456",
    avito_id: "avito_user_123",
    email: "ivan@example.com",
    
    // Данные клиента
    name: "Иван Петров",
    
    // Метаданные
    created_at: datetime,
    updated_at: datetime,
    last_contact_at: datetime
})
```

**Зачем:**
- Единый профиль клиента независимо от канала
- Склейка по телефону/идентификаторам
- Центр социального графа (семья, рефералы)

**Связи:**
- `[:OWNS]` → ELO_Device (владеет устройством)
- `[:BROUGHT]` → ELO_Device (принёс чужое устройство)
- `[:FAMILY {type}]` ↔ ELO_Client (семейные связи)
- `[:REFERRED]` → ELO_Client (привёл клиента)
- `[:HAS_FACT]` → ELO_Fact (факты о клиенте)

---

### ELO_Device — Устройство

```cypher
(:ELO_Device {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Характеристики
    brand: "Apple",
    model: "iPhone 14 Pro",
    color: "белый",
    storage: "256GB",                  // опционально
    
    // Чьё устройство (метка для disambiguation)
    owner_label: "свой",               // "свой" | "жены" | "сына" | "мамы" | "рабочий"
    
    // Уникальные идентификаторы
    imei: "123456789012345",           // опционально
    serial_number: "C39V...",          // опционально
    
    // Метаданные
    created_at: datetime,
    last_issue_at: datetime
})
```

**Зачем:**
- Центр истории ремонтов
- owner_label для различения одинаковых устройств ("мой iPhone 14" vs "iPhone 14 жены")
- Привязка всех обращений к конкретному физическому устройству

**Связи:**
- `[:HAS_ISSUE]` → ELO_Issue (случаи обращения)
- `[:OWNS]` ← ELO_Client (владелец)
- `[:BROUGHT]` ← ELO_Client (кто принёс, если не владелец)

---

### ELO_Issue — Случай обращения

```cypher
(:ELO_Issue {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Статус воронки
    stage: "IN_PROGRESS",
    // NEW → QUOTED → CONFIRMED → RECEIVED → IN_PROGRESS → READY → DELIVERED
    // или CANCELLED на любом этапе
    
    // Финансы
    price_quoted: 15000,               // первоначальная оценка
    price_final: 14500,                // итоговая цена
    price_parts: 8000,                 // стоимость запчастей
    price_labor: 6500,                 // стоимость работы
    
    // Сроки
    estimated_time_hours: 2,
    actual_time_hours: 1.5,
    
    // Гарантия
    warranty_days: 90,
    warranty_until: datetime,
    
    // Метаданные
    created_at: datetime,
    received_at: datetime,             // когда приняли устройство
    completed_at: datetime,            // когда завершили ремонт
    delivered_at: datetime             // когда выдали клиенту
})
```

**Зачем:**
- Контейнер для симптома, диагноза и ремонта
- Воронка и статусы
- Финансовая информация
- Привязка к конкретному устройству

**Связи:**
- `[:HAS_SYMPTOM]` → ELO_Symptom (что сказал клиент)
- `[:HAS_DIAGNOSIS]` → ELO_Diagnosis (что нашёл мастер)
- `[:HAS_REPAIR]` → ELO_Repair (что сделали)
- `[:HAS_ISSUE]` ← ELO_Device (к какому устройству)
- `[:ABOUT_ISSUE]` ← ELO_Message (какие сообщения про это)

---

### ELO_Symptom — Симптом (со слов клиента)

```cypher
(:ELO_Symptom {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Сырой текст от клиента
    raw_text: "экран не работает, вчера уронил и всё",
    
    // Извлечённые детали
    details: {
        trigger: "уронил",             // что спровоцировало
        when: "вчера",                 // когда случилось
        partial_work: false            // работает ли частично
    },
    
    // Метаданные
    created_at: datetime,
    extracted_by: "ai"                 // ai | operator
})
```

**Зачем:**
- Сохраняет оригинальные слова клиента
- Основа для предсказания реальной проблемы
- Контекст для общения (бот говорит словами клиента)

**Связи:**
- `[:SYMPTOM_TYPE]` → ELO_SymptomType (классификация)
- `[:RESULTED_IN]` → ELO_Diagnosis (что оказалось на самом деле)
- `[:HAS_SYMPTOM]` ← ELO_Issue (к какому случаю)
- `[:DESCRIBES_SYMPTOM]` ← ELO_Message (из какого сообщения)

---

### ELO_SymptomType — Тип симптома (справочник)

```cypher
(:ELO_SymptomType {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",                 // NULL = глобальный справочник
    
    // Классификация
    code: "display_not_working",
    name: "Не работает экран",
    category: "display",               // категория для группировки
    
    // Вариации (как клиенты это называют)
    variations: [
        "не работает экран",
        "экран не включается", 
        "чёрный экран",
        "экран погас",
        "дисплей не показывает",
        "тёмный экран"
    ],
    
    // Для AI: типичные уточняющие вопросы
    clarifying_questions: [
        "Телефон падал или контактировал с водой?",
        "Экран полностью чёрный или что-то видно?",
        "Звуки при включении есть?"
    ],
    
    // Статистика (обновляется автоматически)
    total_cases: 1250,
    
    created_at: datetime
})
```

**Зачем:**
- Нормализация "языка клиентов"
- variations пополняются автоматически из новых формулировок
- Основа для ML-классификации симптомов

**Связи:**
- `[:SYMPTOM_TYPE]` ← ELO_Symptom (какие симптомы этого типа)
- `[:COMMONLY_LEADS_TO]` → ELO_DiagnosisType (частые реальные причины)

---

### ELO_Diagnosis — Диагноз (что нашёл мастер)

```cypher
(:ELO_Diagnosis {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Описание
    description: "Сгорел фильтр подсветки, следы КЗ на плате",
    
    // Детали
    details: {
        component: "backlight_filter",
        location: "motherboard",
        cause: "short_circuit",
        severity: "medium"             // low | medium | high | critical
    },
    
    // Фото диагностики
    photos: [
        "https://storage.../diag_001.jpg",
        "https://storage.../diag_002.jpg"
    ],
    
    // Кто и когда
    diagnosed_by: "uuid_operator",
    diagnosed_at: datetime
})
```

**Зачем:**
- Реальная техническая картина
- Фото для истории и споров
- Связка с симптомом для обучения AI

**Связи:**
- `[:DIAGNOSIS_TYPE]` → ELO_DiagnosisType (классификация)
- `[:REQUIRED]` → ELO_Repair (какой ремонт потребовался)
- `[:RESULTED_IN]` ← ELO_Symptom (из какого симптома)
- `[:HAS_DIAGNOSIS]` ← ELO_Issue (к какому случаю)

---

### ELO_DiagnosisType — Тип диагноза (справочник)

```cypher
(:ELO_DiagnosisType {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Классификация
    code: "backlight_filter_burned",
    name: "Сгорел фильтр подсветки",
    category: "motherboard",
    
    // Техническое описание
    description: "Выход из строя фильтра цепи подсветки на материнской плате",
    
    // Типичные причины
    common_causes: [
        "Короткое замыкание при замене дисплея",
        "Использование неоригинального дисплея",
        "Попадание влаги"
    ],
    
    // Сложность
    complexity: "high",                // low | medium | high | expert
    requires_microsoldering: true,
    
    // Статистика
    total_cases: 340,
    avg_repair_time_hours: 2.5,
    avg_repair_cost: 4500,
    
    created_at: datetime
})
```

**Зачем:**
- Техническая классификация проблем
- Оценка сложности и времени
- База знаний для обучения новых мастеров

**Связи:**
- `[:DIAGNOSIS_TYPE]` ← ELO_Diagnosis (диагнозы этого типа)
- `[:COMMONLY_LEADS_TO]` ← ELO_SymptomType (какие симптомы к этому приводят)
- `[:TYPICALLY_REQUIRES]` → ELO_RepairAction (типичные ремонты)

---

### ELO_Repair — Выполненный ремонт

```cypher
(:ELO_Repair {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Описание работы
    description: "Заменён фильтр подсветки, восстановлены дорожки",
    
    // Использованные запчасти
    parts_used: [
        {
            name: "Фильтр подсветки iPhone 14 Pro",
            sku: "BLF-IP14P-001",
            quantity: 1,
            cost: 350
        }
    ],
    
    // Время работы
    time_minutes: 90,
    
    // Кто делал
    repaired_by: "uuid_master",
    
    // Результат
    result: "success",                 // success | partial | failed
    notes: "Рекомендовано использовать оригинальные дисплеи",
    
    // Фото после ремонта
    photos_after: [
        "https://storage.../repair_001.jpg"
    ],
    
    created_at: datetime
})
```

**Зачем:**
- Факт выполненной работы
- Основа для follow-up сообщений
- История для гарантийных случаев
- Аналитика по мастерам

**Связи:**
- `[:REPAIR_ACTION]` → ELO_RepairAction (тип ремонта)
- `[:REQUIRED]` ← ELO_Diagnosis (какой диагноз привёл)
- `[:HAS_REPAIR]` ← ELO_Issue (к какому случаю)

---

### ELO_RepairAction — Тип ремонта (справочник)

```cypher
(:ELO_RepairAction {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Классификация
    code: "backlight_filter_replacement",
    name: "Замена фильтра подсветки",
    category: "motherboard",
    
    // Ценообразование
    base_price: 3500,
    base_time_minutes: 60,
    
    // Гарантия
    warranty_days: 90,
    
    // Для follow-up
    follow_up_enabled: true,
    follow_up_days: 30,
    follow_up_template: "Как работает подсветка экрана после ремонта?",
    
    // Для AI при первичной оценке
    common_symptoms: [
        "не работает экран",
        "тёмный экран",
        "экран не включается"
    ],
    
    // Требования
    requires_equipment: ["микроскоп", "паяльная станция"],
    skill_level: "expert",
    
    // Статистика
    total_performed: 280,
    success_rate: 0.94,
    avg_actual_time_minutes: 75,
    
    created_at: datetime
})
```

**Зачем:**
- База знаний по ремонтам
- Автоматические follow-up
- Оценка времени и стоимости
- Контроль качества (success_rate)

**Связи:**
- `[:REPAIR_ACTION]` ← ELO_Repair (ремонты этого типа)
- `[:TYPICALLY_REQUIRES]` ← ELO_DiagnosisType (какие диагнозы требуют)

---

### ELO_Fact — Факт о клиенте

```cypher
(:ELO_Fact {
    // Идентификация
    id: "uuid",
    tenant_id: "uuid",
    
    // Тип факта
    type: "preference",
    // preference — предпочтения ("только оригинал", "подешевле")
    // personal — личное ("работает рядом", "день рождения 15 марта")
    // behavior — поведение ("всегда торгуется", "приходит вовремя")
    
    // Значение
    value: "предпочитает оригинальные запчасти",
    
    // Уверенность
    confidence: 0.95,
    
    // Источник
    source_type: "extracted",          // extracted | stated | inferred
    source_message_id: "uuid",
    
    created_at: datetime
})
```

**Зачем:**
- Персонализация общения
- Предсказание предпочтений
- Контекст для AI при генерации ответов

**Связи:**
- `[:HAS_FACT]` ← ELO_Client (к какому клиенту)

---

## Структура связей

### Полная карта связей

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                              СВЯЗИ ГРАФА                                     │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  ELO_Message                                                                │
│       │                                                                     │
│       ├──[:FROM]──────────────────────► ELO_Client                         │
│       │                                      │                              │
│       ├──[:ABOUT_DEVICE]──────────────► ELO_Device                         │
│       │                                      │                              │
│       ├──[:ABOUT_ISSUE]───────────────► ELO_Issue                          │
│       │                                      │                              │
│       └──[:DESCRIBES_SYMPTOM]─────────► ELO_Symptom                        │
│                                              │                              │
│                                              │                              │
│  ELO_Client                                  │                              │
│       │                                      │                              │
│       ├──[:OWNS]──────────────────────► ELO_Device                         │
│       │                                      │                              │
│       ├──[:BROUGHT]───────────────────► ELO_Device                         │
│       │                                      │                              │
│       ├──[:FAMILY {type}]─────────────► ELO_Client                         │
│       │   type: spouse|parent|child|sibling                                │
│       │                                                                     │
│       ├──[:REFERRED]──────────────────► ELO_Client                         │
│       │                                                                     │
│       └──[:HAS_FACT]──────────────────► ELO_Fact                           │
│                                                                             │
│                                                                             │
│  ELO_Device                                                                 │
│       │                                                                     │
│       └──[:HAS_ISSUE]─────────────────► ELO_Issue                          │
│                                              │                              │
│                                              ├──[:HAS_SYMPTOM]──► ELO_Symptom
│                                              │                        │     │
│                                              │                        │     │
│                                              │         [:SYMPTOM_TYPE]┘     │
│                                              │                  ▼           │
│                                              │           ELO_SymptomType    │
│                                              │                              │
│                                              ├──[:HAS_DIAGNOSIS]► ELO_Diagnosis
│                                              │                        │     │
│                                              │                        │     │
│                                              │       [:DIAGNOSIS_TYPE]┘     │
│                                              │                  ▼           │
│                                              │          ELO_DiagnosisType   │
│                                              │                              │
│                                              └──[:HAS_REPAIR]───► ELO_Repair│
│                                                                       │     │
│                                                                       │     │
│                                                        [:REPAIR_ACTION]┘    │
│                                                                  ▼          │
│                                                          ELO_RepairAction   │
│                                                                             │
│                                                                             │
│  СВЯЗИ МЕЖДУ СЛОЯМИ (обучение):                                            │
│                                                                             │
│  ELO_Symptom ──[:RESULTED_IN]──────────► ELO_Diagnosis                     │
│                                                                             │
│  ELO_Diagnosis ──[:REQUIRED]───────────► ELO_Repair                        │
│                                                                             │
│  ELO_SymptomType ──[:COMMONLY_LEADS_TO]► ELO_DiagnosisType                 │
│                                                                             │
│  ELO_DiagnosisType ──[:TYPICALLY_REQUIRES]► ELO_RepairAction               │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

### Типы связей

| Связь | От | К | Описание |
|-------|-----|-----|----------|
| `FROM` | Message | Client | Кто отправил сообщение |
| `ABOUT_DEVICE` | Message | Device | Про какое устройство сообщение |
| `ABOUT_ISSUE` | Message | Issue | Про какой случай сообщение |
| `DESCRIBES_SYMPTOM` | Message | Symptom | Сообщение описывает симптом |
| `OWNS` | Client | Device | Клиент владеет устройством |
| `BROUGHT` | Client | Device | Клиент принёс чужое устройство |
| `FAMILY` | Client | Client | Семейная связь (type: spouse/parent/child) |
| `REFERRED` | Client | Client | Клиент привёл другого клиента |
| `HAS_FACT` | Client | Fact | Факт о клиенте |
| `HAS_ISSUE` | Device | Issue | У устройства есть случай обращения |
| `HAS_SYMPTOM` | Issue | Symptom | Случай имеет симптом |
| `HAS_DIAGNOSIS` | Issue | Diagnosis | Случай имеет диагноз |
| `HAS_REPAIR` | Issue | Repair | Случай имеет ремонт |
| `SYMPTOM_TYPE` | Symptom | SymptomType | Классификация симптома |
| `DIAGNOSIS_TYPE` | Diagnosis | DiagnosisType | Классификация диагноза |
| `REPAIR_ACTION` | Repair | RepairAction | Тип выполненного ремонта |
| `RESULTED_IN` | Symptom | Diagnosis | Симптом привёл к диагнозу |
| `REQUIRED` | Diagnosis | Repair | Диагноз потребовал ремонта |
| `COMMONLY_LEADS_TO` | SymptomType | DiagnosisType | Статистическая связь |
| `TYPICALLY_REQUIRES` | DiagnosisType | RepairAction | Статистическая связь |

---

## Применение графа

### 1. Контекст для AI (до ответа)

**Задача:** Клиент написал "Алло, это по поводу айфона". Что отвечать?

```cypher
// Найти все активные issues клиента
MATCH (c:ELO_Client {telegram_id: $telegramId})-[:OWNS|BROUGHT]->(d:ELO_Device)
MATCH (d)-[:HAS_ISSUE]->(i:ELO_Issue)
WHERE i.stage NOT IN ['DELIVERED', 'CANCELLED']
OPTIONAL MATCH (i)-[:HAS_SYMPTOM]->(s:ELO_Symptom)-[:SYMPTOM_TYPE]->(st:ELO_SymptomType)
OPTIONAL MATCH (i)-[:HAS_DIAGNOSIS]->(diag:ELO_Diagnosis)-[:DIAGNOSIS_TYPE]->(dt:ELO_DiagnosisType)
RETURN 
    d.brand + ' ' + d.model as device,
    d.owner_label as whose,
    i.stage as stage,
    st.name as symptom,
    dt.name as diagnosis
```

**Результат:**
| device | whose | stage | symptom | diagnosis |
|--------|-------|-------|---------|-----------|
| iPhone 14 Pro | свой | IN_PROGRESS | Не работает экран | Фильтр подсветки |
| iPhone 13 | жены | QUOTED | Разбит экран | null |

**AI отвечает:** "У вас два iPhone в работе — ваш 14 Pro (ремонт подсветки) и жены 13 (экран). Какой интересует?"

---

### 2. Предсказание проблемы (при первом обращении)

**Задача:** Клиент говорит "не работает экран". Что это скорее всего?

```cypher
// Статистика: симптом → реальный диагноз
MATCH (st:ELO_SymptomType {code: "display_not_working"})<-[:SYMPTOM_TYPE]-(s:ELO_Symptom)
MATCH (s)-[:RESULTED_IN]->(d:ELO_Diagnosis)-[:DIAGNOSIS_TYPE]->(dt:ELO_DiagnosisType)
RETURN dt.name as diagnosis, count(*) as cases
ORDER BY cases DESC
LIMIT 5
```

**Результат:**
| diagnosis | cases |
|-----------|-------|
| Разбит дисплей | 450 |
| Фильтр подсветки | 180 |
| Шлейф дисплея | 95 |
| Проблема с платой | 60 |
| Настройки ПО | 25 |

**AI говорит:** "По статистике, 'не работает экран' — это чаще всего разбитый дисплей (55%) или проблема с подсветкой (22%). Телефон падал?"

---

### 3. Точная оценка цены

**Задача:** Клиент спрашивает цену. Как оценить точнее?

```cypher
// Реальные цены по симптому + модель
MATCH (d:ELO_Device {brand: "Apple", model: "iPhone 14 Pro"})-[:HAS_ISSUE]->(i:ELO_Issue)
MATCH (i)-[:HAS_SYMPTOM]->(s:ELO_Symptom)-[:SYMPTOM_TYPE]->(st:ELO_SymptomType {code: "display_not_working"})
WHERE i.stage = 'DELIVERED' AND i.price_final IS NOT NULL
RETURN 
    min(i.price_final) as min_price,
    avg(i.price_final) as avg_price,
    max(i.price_final) as max_price,
    percentileCont(i.price_final, 0.5) as median_price
```

**Результат:**
| min_price | avg_price | max_price | median_price |
|-----------|-----------|-----------|--------------|
| 2500 | 8900 | 25000 | 6500 |

**AI говорит:** "Для iPhone 14 Pro с такой проблемой обычно 6000-9000₽. Но если плата — может быть до 25000₽. Точнее скажем после диагностики."

---

### 4. Правильный follow-up

**Задача:** Прошло 30 дней после ремонта. Что спросить?

```cypher
// Клиенты для follow-up
MATCH (i:ELO_Issue)-[:HAS_REPAIR]->(r:ELO_Repair)-[:REPAIR_ACTION]->(ra:ELO_RepairAction)
MATCH (d:ELO_Device)-[:HAS_ISSUE]->(i)
MATCH (c:ELO_Client)-[:OWNS]->(d)
WHERE i.stage = 'DELIVERED'
  AND i.delivered_at < datetime() - duration('P30D')
  AND ra.follow_up_enabled = true
  AND NOT exists {
      MATCH (i)-[:HAD_FOLLOWUP]->()
  }
RETURN 
    c.id as client_id,
    c.name as client_name,
    c.telegram_id,
    d.model as device,
    ra.name as repair_done,
    ra.follow_up_template as message
```

**Результат:**
| client_name | device | repair_done | message |
|-------------|--------|-------------|---------|
| Иван | iPhone 14 Pro | Замена фильтра подсветки | Как работает подсветка экрана после ремонта? |
| Мария | iPhone 13 | Замена разъёма | Как заряжается телефон после ремонта? |

**Бот пишет Ивану:** "Иван, добрый день! Прошёл месяц после ремонта подсветки на iPhone 14 Pro. Как работает экран?"

---

### 5. Цепочка диалога по устройству

**Задача:** Показать всю историю общения про конкретный iPhone.

```cypher
// Все сообщения про устройство
MATCH (d:ELO_Device {id: $deviceId})<-[:ABOUT_DEVICE]-(m:ELO_Message)
MATCH (m)-[:FROM]->(c:ELO_Client)
RETURN 
    m.timestamp,
    m.direction,
    c.name as sender,
    m.content
ORDER BY m.timestamp ASC
```

---

### 6. Цепочка диалога по конкретному issue

**Задача:** Показать переписку по конкретному ремонту.

```cypher
// Все сообщения про issue
MATCH (i:ELO_Issue {id: $issueId})<-[:ABOUT_ISSUE]-(m:ELO_Message)
MATCH (m)-[:FROM]->(c:ELO_Client)
RETURN 
    m.timestamp,
    m.direction,
    c.name as sender,
    m.content
ORDER BY m.timestamp ASC
```

---

### 7. Disambiguation (уточнение)

**Задача:** У клиента несколько устройств. Какое имеет в виду?

```cypher
// Устройства клиента с активными issues
MATCH (c:ELO_Client {id: $clientId})-[:OWNS|BROUGHT]->(d:ELO_Device)
OPTIONAL MATCH (d)-[:HAS_ISSUE]->(i:ELO_Issue)
WHERE i IS NULL OR i.stage NOT IN ['DELIVERED', 'CANCELLED']
OPTIONAL MATCH (i)-[:HAS_SYMPTOM]->(s)-[:SYMPTOM_TYPE]->(st:ELO_SymptomType)

// Когда последний раз упоминали устройство
OPTIONAL MATCH (d)<-[:ABOUT_DEVICE]-(m:ELO_Message)
WITH d, i, st, max(m.timestamp) as last_mentioned

RETURN 
    d.id,
    d.brand + ' ' + d.model as device,
    d.owner_label as whose,
    i.stage as status,
    st.name as current_issue,
    last_mentioned
ORDER BY last_mentioned DESC
```

**Логика:**
- Если одно устройство → не уточнять
- Если несколько, но одно упоминали сегодня → использовать его
- Если несколько и давно не упоминали → уточнить

---

### 8. Социальный граф

**Задача:** Найти всех связанных клиентов.

```cypher
// Клиент + семья + рефералы
MATCH (c:ELO_Client {id: $clientId})
OPTIONAL MATCH (c)-[f:FAMILY]-(family:ELO_Client)
OPTIONAL MATCH (c)-[:REFERRED]->(referred:ELO_Client)
OPTIONAL MATCH (referrer:ELO_Client)-[:REFERRED]->(c)
RETURN 
    c,
    collect(DISTINCT {client: family, relation: f.type}) as family,
    collect(DISTINCT referred) as referred_by_me,
    referrer as my_referrer
```

**Применение:**
- "Привет! Как ваша жена Мария — iPhone починили?"
- Реферальные бонусы
- Семейные скидки

---

### 9. Аналитика по симптомам и диагнозам

**Задача:** Насколько слова клиентов соответствуют реальности?

```cypher
// Матрица: симптом → диагноз
MATCH (st:ELO_SymptomType)<-[:SYMPTOM_TYPE]-(s:ELO_Symptom)
MATCH (s)-[:RESULTED_IN]->(d:ELO_Diagnosis)-[:DIAGNOSIS_TYPE]->(dt:ELO_DiagnosisType)
RETURN 
    st.name as symptom,
    dt.name as actual_diagnosis,
    count(*) as cases
ORDER BY st.name, cases DESC
```

**Результат:**
| symptom | actual_diagnosis | cases |
|---------|------------------|-------|
| Не работает экран | Разбит дисплей | 450 |
| Не работает экран | Фильтр подсветки | 180 |
| Не работает экран | Шлейф | 95 |
| Не заряжается | Разъём | 320 |
| Не заряжается | Кабель | 180 |
| Не заряжается | Батарея | 95 |

---

### 10. Качество работы мастеров

**Задача:** Кто чаще делает ремонты с проблемами?

```cypher
// Follow-up статистика по мастерам
MATCH (r:ELO_Repair)-[:REPAIR_ACTION]->(ra:ELO_RepairAction)
MATCH (i:ELO_Issue)-[:HAS_REPAIR]->(r)
OPTIONAL MATCH (i)-[f:HAD_FOLLOWUP]->()
WHERE r.repaired_by IS NOT NULL
RETURN 
    r.repaired_by as master_id,
    count(*) as total_repairs,
    count(CASE WHEN f.result = 'positive' THEN 1 END) as positive,
    count(CASE WHEN f.result = 'negative' THEN 1 END) as negative,
    count(CASE WHEN f.result = 'no_response' THEN 1 END) as no_response
```

---

## Обогащение графа

### Автоматическое пополнение справочников

**1. Новые формулировки симптомов:**

```cypher
// Клиент написал "дисплей потух" — нет в variations
// После классификации AI:
MATCH (st:ELO_SymptomType {code: "display_not_working"})
SET st.variations = st.variations + "дисплей потух"
```

**2. Новые связи симптом→диагноз:**

```cypher
// После диагностики мастера:
MATCH (s:ELO_Symptom {id: $symptomId})
MATCH (d:ELO_Diagnosis {id: $diagnosisId})
MERGE (s)-[:RESULTED_IN]->(d)

// Обновить статистику
MATCH (st:ELO_SymptomType)<-[:SYMPTOM_TYPE]-(s)-[:RESULTED_IN]->(d)-[:DIAGNOSIS_TYPE]->(dt:ELO_DiagnosisType)
MERGE (st)-[r:COMMONLY_LEADS_TO]->(dt)
ON CREATE SET r.count = 1
ON MATCH SET r.count = r.count + 1
```

**3. Статистика по ремонтам:**

```cypher
// После выдачи устройства:
MATCH (ra:ELO_RepairAction {id: $repairActionId})
SET ra.total_performed = ra.total_performed + 1,
    ra.avg_actual_time_minutes = (ra.avg_actual_time_minutes * (ra.total_performed - 1) + $actualTime) / ra.total_performed
```

### Самообучение системы

Граф накапливает знания автоматически:

| Что накапливается | Как используется |
|-------------------|------------------|
| variations симптомов | Лучше распознаём формулировки |
| Связи симптом→диагноз | Точнее предсказываем проблему |
| Связи диагноз→ремонт | Точнее оцениваем цену и время |
| success_rate ремонтов | Предупреждаем о рисках |
| Статистика по моделям | "На iPhone 12 это чаще X" |

**Чем больше данных — тем умнее система.**

---

## Интеграция с PostgreSQL

### Принцип разделения

| Что | Где хранится | Почему |
|-----|--------------|--------|
| Связи | Neo4j | Быстрый обход графа |
| Полный текст сообщений | PostgreSQL | Полнотекстовый поиск |
| Финансы, бухгалтерия | PostgreSQL | Транзакционность, отчёты |
| Файлы, медиа | S3 / PostgreSQL | Хранение |
| Справочники | Neo4j + PostgreSQL | Дублируются для скорости |

### Синхронизация

**При создании сообщения:**
1. PostgreSQL: сохранить полный текст, медиа
2. Neo4j: создать узел ELO_Message с минимумом данных
3. Neo4j: создать связи FROM, ABOUT_DEVICE, ABOUT_ISSUE

**При создании issue:**
1. PostgreSQL: создать запись с финансами, статусами
2. Neo4j: создать узел ELO_Issue
3. Neo4j: создать связи HAS_ISSUE, HAS_SYMPTOM

**При завершении ремонта:**
1. PostgreSQL: обновить price_final, статус
2. Neo4j: обновить узел, создать связи с Diagnosis и Repair
3. Neo4j: обновить статистику справочников

### UUID как ключ

Все сущности имеют одинаковый UUID в PostgreSQL и Neo4j:

```cypher
// Neo4j
(:ELO_Issue {id: "550e8400-e29b-41d4-a716-446655440000"})
```

```sql
-- PostgreSQL
SELECT * FROM issues WHERE id = '550e8400-e29b-41d4-a716-446655440000'
```

---

## Производительность

### Индексы Neo4j

```cypher
// Основные индексы
CREATE INDEX elo_message_id FOR (m:ELO_Message) ON (m.id);
CREATE INDEX elo_message_timestamp FOR (m:ELO_Message) ON (m.timestamp);
CREATE INDEX elo_message_tenant FOR (m:ELO_Message) ON (m.tenant_id);
CREATE INDEX elo_message_chat FOR (m:ELO_Message) ON (m.external_chat_id);

CREATE INDEX elo_client_id FOR (c:ELO_Client) ON (c.id);
CREATE INDEX elo_client_tenant FOR (c:ELO_Client) ON (c.tenant_id);
CREATE INDEX elo_client_phone FOR (c:ELO_Client) ON (c.phone);
CREATE INDEX elo_client_telegram FOR (c:ELO_Client) ON (c.telegram_id);

CREATE INDEX elo_device_id FOR (d:ELO_Device) ON (d.id);
CREATE INDEX elo_device_tenant FOR (d:ELO_Device) ON (d.tenant_id);

CREATE INDEX elo_issue_id FOR (i:ELO_Issue) ON (i.id);
CREATE INDEX elo_issue_tenant FOR (i:ELO_Issue) ON (i.tenant_id);
CREATE INDEX elo_issue_stage FOR (i:ELO_Issue) ON (i.stage);

// Составные индексы
CREATE INDEX elo_client_tenant_phone FOR (c:ELO_Client) ON (c.tenant_id, c.phone);
CREATE INDEX elo_issue_tenant_stage FOR (i:ELO_Issue) ON (i.tenant_id, i.stage);
```

### Типичные запросы

| Запрос | Сложность | Время |
|--------|-----------|-------|
| Найти клиента по telegram_id | O(1) | <1ms |
| Устройства клиента | O(k), k = кол-во устройств | <5ms |
| Активные issues клиента | O(k*n), n = issues на устройство | <10ms |
| Цепочка сообщений по issue | O(m), m = кол-во сообщений | <20ms |
| Статистика симптом→диагноз | O(n), n = кол-во случаев | <100ms |

---

## Миграция и инициализация

### Seed-данные справочников

```cypher
// Типы симптомов
CREATE (:ELO_SymptomType {code: "display_not_working", name: "Не работает экран", category: "display", variations: ["не работает экран", "экран не включается", "чёрный экран"]})
CREATE (:ELO_SymptomType {code: "display_broken", name: "Разбит экран", category: "display", variations: ["разбит экран", "треснул экран", "разбил дисплей"]})
CREATE (:ELO_SymptomType {code: "no_charge", name: "Не заряжается", category: "charging", variations: ["не заряжается", "не берёт зарядку", "зарядка не идёт"]})
// ... ещё ~50 типов

// Типы диагнозов
CREATE (:ELO_DiagnosisType {code: "display_broken", name: "Разбит дисплей", category: "display", complexity: "low"})
CREATE (:ELO_DiagnosisType {code: "backlight_filter", name: "Сгорел фильтр подсветки", category: "motherboard", complexity: "high"})
CREATE (:ELO_DiagnosisType {code: "charging_port", name: "Неисправен разъём зарядки", category: "charging", complexity: "medium"})
// ... ещё ~100 типов

// Типы ремонтов
CREATE (:ELO_RepairAction {code: "display_replacement", name: "Замена дисплея", category: "display", base_price: 5000, warranty_days: 90, follow_up_template: "Как работает новый дисплей?"})
CREATE (:ELO_RepairAction {code: "backlight_repair", name: "Ремонт подсветки", category: "motherboard", base_price: 3500, warranty_days: 90, follow_up_template: "Как работает подсветка экрана?"})
// ... ещё ~80 типов
```

---

## Безопасность и multi-tenancy

### Изоляция данных

Каждый запрос фильтруется по tenant_id:

```cypher
// ВСЕГДА добавляем tenant_id
MATCH (c:ELO_Client {tenant_id: $tenantId, telegram_id: $telegramId})
...
```

### Row-level security (концептуально)

```cypher
// Нельзя увидеть данные чужого тенанта
MATCH (c:ELO_Client)
WHERE c.tenant_id = $currentTenantId  // обязательный фильтр
...
```

---

## Резюме

### Что даёт граф

| Возможность | Как реализуется |
|-------------|-----------------|
| Мгновенный контекст | Обход связей за миллисекунды |
| Предсказание проблем | Статистика симптом→диагноз |
| Точные цены | История реальных ремонтов |
| Правильный follow-up | Связь с реальным ремонтом, не симптомом |
| Disambiguation | Устройства с owner_label, история упоминаний |
| Социальный граф | Семья, рефералы, связи |
| Самообучение | Автоматическое обогащение справочников |
| Персонализация | Факты о клиенте |

### Конкурентное преимущество

**Legacy CRM:**
- Плоские таблицы
- JOIN-ы на каждый запрос
- Статичные справочники
- Нет связи симптом→диагноз

**Eldoleado:**
- Граф связей
- Обход за миллисекунды
- Самообучающиеся справочники
- Три слоя правды: симптом→диагноз→ремонт

**Чем больше данных — тем умнее система. Network effect на знаниях.**

---

---

**Документ:** 03_GRAPH_ARCHITECTURE.md
**Версия:** 1.0
**Создан:** 2025-12-10 09:45 UTC
**Автор:** Dmitry + Claude
**Проект:** Eldoleado
