# CORE_NEW: Архитектура и План реализации

> Обновлённый документ архитектуры с планом реализации
> Дата: 2025-12-10 (v2 - с полной граф-архитектурой)

---

## Ключевые изменения от предыдущей версии

1. **Три слоя правды:** Symptom → Diagnosis → Repair (не просто Problem)
2. **ELO_Message как точка входа** — каждое сообщение связано с клиентом, устройством, issue
3. **ELO_Issue вместо Problem** — контейнер для симптомов, диагнозов, ремонтов
4. **Справочники в графе:** SymptomType, DiagnosisType, RepairAction, **ProblemCategory**
5. **ELO_Fact** — факты о клиенте для персонализации
6. **Накопление данных с первого клиента**
7. **Граф = источник истины** — pending, focus_score вычисляются из графа каждый раз (15-20ms)
8. **Микроворонка диалога** — настраиваемые этапы воронки вместо "типа обращения"
9. **PostgreSQL.context минимален** — только current_stage + stage_entered_at

---

## Инсайт о вертикалях

**Ремонт и покупка/продажа — это разные вертикали, а не типы сообщений.**

| Вертикаль | Модель | Фокус | Статус |
|-----------|--------|-------|--------|
| **phone_repair** | Сервисная | Возвращаемость, LTV | ✅ MVP |
| **buy_sell** | Транзакционная | Конверсия, быстрый цикл | ⏳ Следующая |

Вертикаль `buy_sell` универсальна — подходит для автомастерских, бьюти, любого бизнеса с товарами.

**Общее:**
- Один клиент может быть в обеих вертикалях
- Единый граф, разные срезы
- Кросс-продажи между вертикалями

---

## Текущее состояние

### PostgreSQL (13 созданы → 26 после миграции)

| Категория | Таблицы | Статус |
|-----------|---------|--------|
| Ядро (5) | elo_tenants, elo_clients, elo_dialogs, elo_events, elo_operators | ✅ Созданы |
| Справочники (3) | elo_verticals, elo_tenant_verticals, elo_price_list | ✅ Созданы |
| AI (2) | elo_ai_extractions, elo_ai_suggestions | ✅ Созданы |
| Каналы (1) | elo_channel_accounts | ✅ Созданы |
| Задачи (2) | elo_tasks, elo_task_updates | ✅ Созданы |
| **Граф-зеркала (7)** | elo_messages, elo_issues, elo_symptoms, elo_diagnoses, elo_repairs, elo_facts, elo_settings | ⏳ Миграция |
| **Справочники типов (4)** | elo_symptom_types, elo_diagnosis_types, elo_repair_actions, elo_problem_categories | ⏳ Миграция |
| **Микроворонка (2)** | elo_funnel_stages, elo_dialog_stage_history | ⏳ Миграция |

### Neo4j (старые лейблы — будут заменены/дополнены)

| Лейбл | Назначение | Статус |
|-------|------------|--------|
| Client | Клиенты | ✅ → ELO_Client |
| Device | Устройства | ✅ → ELO_Device |
| Problem | Проблемы | ⚠️ → Заменяется на ELO_Issue + ELO_Symptom + ELO_Diagnosis + ELO_Repair |
| ProblemType | Типы проблем | ⚠️ → Разделяется на SymptomType, DiagnosisType, RepairAction |
| Touchpoint | Касания | ⚠️ → ELO_Message |
| остальные | маркетинг, KB | ✅ Оставляем |

### n8n Workflows

| Workflow | Статус |
|----------|--------|
| ELO_In_Avito | ✅ Импортирован |
| ELO_Core_Dialog_Engine | ✅ Импортирован |
| ELO_In_Telegram | ⏳ Файл готов |
| ELO_In_WhatsApp | ⏳ Файл готов |
| ELO_In_VK | ⏳ Файл готов |
| ELO_In_MAX | ⏳ Файл готов |
| ELO_In_Form | ⏳ Файл готов |
| ELO_In_Phone | ⏳ Файл готов |
| ELO_Core_Tenant_Resolver | ⏳ Файл готов |
| ELO_Core_Batcher | ⏳ Файл готов |

---

## Новая архитектура графа Neo4j

### Иерархия сущностей (три слоя правды)

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

### Почему три слоя

| Слой | Источник | Достоверность | Пример |
|------|----------|---------------|--------|
| **Symptom** | Клиент | Субъективно | "Не работает экран" |
| **Diagnosis** | Мастер | Объективно | "Сгорел фильтр подсветки" |
| **Repair** | Мастер | Факт | "Замена фильтра подсветки" |

**Без этого разделения система спросит:** "Как ваш новый дисплей?" — хотя дисплей не меняли.

### Новые узлы Neo4j (ELO_*)

| Узел | Назначение | Ключевые поля |
|------|------------|---------------|
| **ELO_Message** | Точка входа, каждое сообщение | id, tenant_id, timestamp, direction, channel, content |
| **ELO_Client** | Клиент | id, tenant_id, phone, telegram_id, name |
| **ELO_Device** | Устройство | id, tenant_id, brand, model, owner_label |
| **ELO_Issue** | Случай обращения | id, tenant_id, stage, price_quoted, price_final |
| **ELO_Symptom** | Симптом (со слов клиента) | id, raw_text, details |
| **ELO_Diagnosis** | Диагноз (мастер) | id, description, photos, diagnosed_by |
| **ELO_Repair** | Выполненный ремонт | id, description, parts_used, repaired_by |
| **ELO_Fact** | Факт о клиенте | id, type, value, confidence |

### Справочники (Type-узлы)

| Узел | Назначение | Ключевые поля |
|------|------------|---------------|
| **ELO_SymptomType** | Тип симптома | code, name, variations[], clarifying_questions[] |
| **ELO_DiagnosisType** | Тип диагноза | code, name, complexity, requires_microsoldering |
| **ELO_RepairAction** | Тип ремонта | code, name, base_price, warranty_days, follow_up_template |
| **ELO_ProblemCategory** | Категория проблемы | code, name (Дисплей, Батарея, Разъём, Камера, Связь, ПО...) |

### Связи графа

```
ELO_Message ──[:FROM]──────────────────► ELO_Client
           ──[:ABOUT_DEVICE]───────────► ELO_Device
           ──[:ABOUT_ISSUE]────────────► ELO_Issue
           ──[:DESCRIBES_SYMPTOM]──────► ELO_Symptom

ELO_Client ──[:OWNS]───────────────────► ELO_Device
           ──[:BROUGHT]────────────────► ELO_Device (чужое устройство)
           ──[:FAMILY {type}]──────────► ELO_Client (spouse|parent|child)
           ──[:REFERRED]───────────────► ELO_Client
           ──[:HAS_FACT]───────────────► ELO_Fact

ELO_Device ──[:HAS_ISSUE]──────────────► ELO_Issue

ELO_Issue  ──[:HAS_SYMPTOM]────────────► ELO_Symptom
           ──[:HAS_DIAGNOSIS]──────────► ELO_Diagnosis
           ──[:HAS_REPAIR]─────────────► ELO_Repair
           ──[:PROBLEM_CATEGORY]───────► ELO_ProblemCategory

ELO_Symptom ──[:SYMPTOM_TYPE]──────────► ELO_SymptomType
            ──[:RESULTED_IN]───────────► ELO_Diagnosis (связь для обучения)

ELO_Diagnosis ──[:DIAGNOSIS_TYPE]──────► ELO_DiagnosisType
              ──[:REQUIRED]────────────► ELO_Repair

ELO_Repair ──[:REPAIR_ACTION]──────────► ELO_RepairAction

// Статистические связи между справочниками
ELO_SymptomType ──[:COMMONLY_LEADS_TO]─► ELO_DiagnosisType
ELO_DiagnosisType ──[:TYPICALLY_REQUIRES]► ELO_RepairAction
```

---

## Что нужно добавить

### 1. Таблица настроек (elo_settings)

Универсальная таблица для хранения любых настроек с версионированием.

```sql
CREATE TABLE elo_settings (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Ключ настройки
    key VARCHAR(100) NOT NULL,           -- 'auto_replies', 'working_hours', 'ai_prompts'

    -- Значение (любой JSON)
    value JSONB NOT NULL,

    -- Версионирование
    version INT DEFAULT 1,
    previous_version_id UUID REFERENCES elo_settings(id),

    -- Метаданные
    description TEXT,
    created_by UUID REFERENCES elo_operators(id),

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, key, version)
);

CREATE INDEX idx_elo_settings_tenant_key ON elo_settings(tenant_id, key);
CREATE INDEX idx_elo_settings_latest ON elo_settings(tenant_id, key, version DESC);
```

### 2. Neo4j: Constraints и Indexes для новых узлов

```cypher
// === ОСНОВНЫЕ УЗЛЫ ===

// Сообщения (точка входа)
CREATE CONSTRAINT elo_message_id FOR (m:ELO_Message) REQUIRE m.id IS UNIQUE;
CREATE INDEX elo_message_timestamp FOR (m:ELO_Message) ON (m.timestamp);
CREATE INDEX elo_message_tenant FOR (m:ELO_Message) ON (m.tenant_id);
CREATE INDEX elo_message_chat FOR (m:ELO_Message) ON (m.external_chat_id);

// Клиенты
CREATE CONSTRAINT elo_client_id FOR (c:ELO_Client) REQUIRE c.id IS UNIQUE;
CREATE INDEX elo_client_tenant FOR (c:ELO_Client) ON (c.tenant_id);
CREATE INDEX elo_client_phone FOR (c:ELO_Client) ON (c.phone);
CREATE INDEX elo_client_telegram FOR (c:ELO_Client) ON (c.telegram_id);

// Устройства
CREATE CONSTRAINT elo_device_id FOR (d:ELO_Device) REQUIRE d.id IS UNIQUE;
CREATE INDEX elo_device_tenant FOR (d:ELO_Device) ON (d.tenant_id);

// Issue (случай обращения)
CREATE CONSTRAINT elo_issue_id FOR (i:ELO_Issue) REQUIRE i.id IS UNIQUE;
CREATE INDEX elo_issue_tenant FOR (i:ELO_Issue) ON (i.tenant_id);
CREATE INDEX elo_issue_stage FOR (i:ELO_Issue) ON (i.stage);

// Симптомы
CREATE CONSTRAINT elo_symptom_id FOR (s:ELO_Symptom) REQUIRE s.id IS UNIQUE;

// Диагнозы
CREATE CONSTRAINT elo_diagnosis_id FOR (d:ELO_Diagnosis) REQUIRE d.id IS UNIQUE;

// Ремонты
CREATE CONSTRAINT elo_repair_id FOR (r:ELO_Repair) REQUIRE r.id IS UNIQUE;

// Факты о клиенте
CREATE CONSTRAINT elo_fact_id FOR (f:ELO_Fact) REQUIRE f.id IS UNIQUE;

// === СПРАВОЧНИКИ ===

// Типы симптомов
CREATE CONSTRAINT elo_symptom_type_id FOR (st:ELO_SymptomType) REQUIRE st.id IS UNIQUE;
CREATE INDEX elo_symptom_type_code FOR (st:ELO_SymptomType) ON (st.code);

// Типы диагнозов
CREATE CONSTRAINT elo_diagnosis_type_id FOR (dt:ELO_DiagnosisType) REQUIRE dt.id IS UNIQUE;
CREATE INDEX elo_diagnosis_type_code FOR (dt:ELO_DiagnosisType) ON (dt.code);

// Типы ремонтов
CREATE CONSTRAINT elo_repair_action_id FOR (ra:ELO_RepairAction) REQUIRE ra.id IS UNIQUE;
CREATE INDEX elo_repair_action_code FOR (ra:ELO_RepairAction) ON (ra.code);

// Категории проблем
CREATE CONSTRAINT elo_problem_category_id FOR (pc:ELO_ProblemCategory) REQUIRE pc.id IS UNIQUE;
CREATE INDEX elo_problem_category_code FOR (pc:ELO_ProblemCategory) ON (pc.code);
```

### 3. PostgreSQL: Зеркальные таблицы для графа

```sql
-- =============================================================================
-- elo_messages — Сообщения (зеркало ELO_Message)
-- =============================================================================

CREATE TABLE elo_messages (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Связи
    dialog_id UUID REFERENCES elo_dialogs(id),
    client_id UUID REFERENCES elo_clients(id),

    -- Временная метка
    timestamp TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    -- Направление и канал
    direction VARCHAR(10) NOT NULL,      -- inbound | outbound
    channel VARCHAR(20) NOT NULL,        -- telegram | whatsapp | avito | vk | phone

    -- Внешние ID
    external_chat_id VARCHAR(100),
    external_msg_id VARCHAR(100),

    -- Содержимое
    content TEXT,

    -- Медиа
    has_media BOOLEAN DEFAULT false,
    media_type VARCHAR(20),              -- photo | video | voice | document
    media_url TEXT,

    -- Актор (кто отправил)
    actor_type VARCHAR(20),              -- client | operator | ai
    actor_id UUID,

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_messages_dialog ON elo_messages(dialog_id, timestamp DESC);
CREATE INDEX idx_elo_messages_client ON elo_messages(client_id, timestamp DESC);
CREATE INDEX idx_elo_messages_tenant_chat ON elo_messages(tenant_id, external_chat_id);

-- =============================================================================
-- elo_issues — Случаи обращения (зеркало ELO_Issue)
-- =============================================================================

CREATE TABLE elo_issues (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Связи
    dialog_id UUID REFERENCES elo_dialogs(id),
    device_id UUID,                      -- UUID из графа (ELO_Device)

    -- Статус воронки
    stage VARCHAR(20) DEFAULT 'NEW',
    -- NEW → QUOTED → CONFIRMED → RECEIVED → IN_PROGRESS → READY → DELIVERED | CANCELLED

    -- Финансы
    price_quoted DECIMAL(10,2),
    price_final DECIMAL(10,2),
    price_parts DECIMAL(10,2),
    price_labor DECIMAL(10,2),

    -- Сроки
    estimated_time_hours DECIMAL(4,1),
    actual_time_hours DECIMAL(4,1),

    -- Гарантия
    warranty_days INT,
    warranty_until TIMESTAMPTZ,

    -- Timestamps
    received_at TIMESTAMPTZ,             -- когда приняли устройство
    completed_at TIMESTAMPTZ,            -- когда завершили ремонт
    delivered_at TIMESTAMPTZ,            -- когда выдали

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_issues_tenant ON elo_issues(tenant_id);
CREATE INDEX idx_elo_issues_dialog ON elo_issues(dialog_id);
CREATE INDEX idx_elo_issues_stage ON elo_issues(tenant_id, stage);

-- =============================================================================
-- elo_symptoms — Симптомы (зеркало ELO_Symptom)
-- =============================================================================

CREATE TABLE elo_symptoms (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    issue_id UUID REFERENCES elo_issues(id),
    message_id UUID REFERENCES elo_messages(id),

    -- Сырой текст от клиента
    raw_text TEXT NOT NULL,

    -- Извлечённые детали
    details JSONB DEFAULT '{}',
    -- {trigger: "уронил", when: "вчера", partial_work: false}

    -- Классификация
    symptom_type_code VARCHAR(50),

    -- Метаданные
    extracted_by VARCHAR(20),            -- ai | operator

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_symptoms_issue ON elo_symptoms(issue_id);

-- =============================================================================
-- elo_diagnoses — Диагнозы (зеркало ELO_Diagnosis)
-- =============================================================================

CREATE TABLE elo_diagnoses (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    issue_id UUID REFERENCES elo_issues(id),

    -- Описание
    description TEXT NOT NULL,

    -- Детали
    details JSONB DEFAULT '{}',
    -- {component: "backlight_filter", location: "motherboard", severity: "medium"}

    -- Фото диагностики
    photos JSONB DEFAULT '[]',

    -- Классификация
    diagnosis_type_code VARCHAR(50),

    -- Кто и когда
    diagnosed_by UUID REFERENCES elo_operators(id),
    diagnosed_at TIMESTAMPTZ DEFAULT NOW(),

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_diagnoses_issue ON elo_diagnoses(issue_id);

-- =============================================================================
-- elo_repairs — Выполненные ремонты (зеркало ELO_Repair)
-- =============================================================================

CREATE TABLE elo_repairs (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    issue_id UUID REFERENCES elo_issues(id),
    diagnosis_id UUID REFERENCES elo_diagnoses(id),

    -- Описание работы
    description TEXT NOT NULL,

    -- Использованные запчасти
    parts_used JSONB DEFAULT '[]',
    -- [{name: "Фильтр подсветки", sku: "BLF-001", quantity: 1, cost: 350}]

    -- Время работы
    time_minutes INT,

    -- Классификация
    repair_action_code VARCHAR(50),

    -- Результат
    result VARCHAR(20) DEFAULT 'success', -- success | partial | failed
    notes TEXT,

    -- Фото после
    photos_after JSONB DEFAULT '[]',

    -- Кто делал
    repaired_by UUID REFERENCES elo_operators(id),

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_repairs_issue ON elo_repairs(issue_id);

-- =============================================================================
-- elo_facts — Факты о клиенте (зеркало ELO_Fact)
-- =============================================================================

CREATE TABLE elo_facts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    client_id UUID NOT NULL REFERENCES elo_clients(id),

    -- Тип факта
    type VARCHAR(20) NOT NULL,           -- preference | personal | behavior

    -- Значение
    value TEXT NOT NULL,

    -- Уверенность
    confidence DECIMAL(3,2),

    -- Источник
    source_type VARCHAR(20),             -- extracted | stated | inferred
    source_message_id UUID REFERENCES elo_messages(id),

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_facts_client ON elo_facts(client_id);

-- =============================================================================
-- СПРАВОЧНИКИ (PostgreSQL версии Type-узлов)
-- =============================================================================

-- Типы симптомов
CREATE TABLE elo_symptom_types (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID REFERENCES elo_tenants(id), -- NULL = глобальный

    code VARCHAR(50) NOT NULL,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(100),

    -- Вариации (как клиенты это называют)
    variations JSONB DEFAULT '[]',

    -- Уточняющие вопросы
    clarifying_questions JSONB DEFAULT '[]',

    -- Статистика
    total_cases INT DEFAULT 0,

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, code)
);

-- Типы диагнозов
CREATE TABLE elo_diagnosis_types (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID REFERENCES elo_tenants(id),

    code VARCHAR(50) NOT NULL,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(100),
    description TEXT,

    -- Сложность
    complexity VARCHAR(20),              -- low | medium | high | expert
    requires_microsoldering BOOLEAN DEFAULT false,

    -- Типичные причины
    common_causes JSONB DEFAULT '[]',

    -- Статистика
    total_cases INT DEFAULT 0,
    avg_repair_time_hours DECIMAL(4,1),
    avg_repair_cost DECIMAL(10,2),

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, code)
);

-- Типы ремонтов
CREATE TABLE elo_repair_actions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID REFERENCES elo_tenants(id),

    code VARCHAR(50) NOT NULL,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(100),

    -- Ценообразование
    base_price DECIMAL(10,2),
    base_time_minutes INT,

    -- Гарантия
    warranty_days INT DEFAULT 90,

    -- Follow-up
    follow_up_enabled BOOLEAN DEFAULT true,
    follow_up_days INT DEFAULT 30,
    follow_up_template TEXT,

    -- Требования
    requires_equipment JSONB DEFAULT '[]',
    skill_level VARCHAR(20),             -- junior | middle | senior | expert

    -- Статистика
    total_performed INT DEFAULT 0,
    success_rate DECIMAL(3,2),
    avg_actual_time_minutes INT,

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, code)
);

-- Категории проблем (Дисплей, Батарея, Разъём...)
CREATE TABLE elo_problem_categories (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID REFERENCES elo_tenants(id), -- NULL = глобальный

    code VARCHAR(50) NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT,

    -- Порядок отображения
    position INT DEFAULT 0,

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, code)
);

-- =============================================================================
-- МИКРОВОРОНКА ДИАЛОГА
-- =============================================================================

-- Этапы воронки (настраиваемые per tenant)
CREATE TABLE elo_funnel_stages (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID REFERENCES elo_tenants(id),   -- NULL = шаблон вертикали
    vertical_id UUID REFERENCES elo_verticals(id),

    code VARCHAR(50) NOT NULL,
    name VARCHAR(100) NOT NULL,

    -- Порядок в воронке
    position INT NOT NULL,

    -- Условия входа (когда переходить на этот этап)
    entry_conditions JSONB NOT NULL,
    -- {"required_fields": ["device_model"], "or": ["symptom_text", "problem_category"]}

    -- Цель AI на этом этапе
    ai_goal TEXT,
    -- "Собрать информацию об устройстве: бренд, модель, цвет"

    -- Промпт для AI
    ai_prompt TEXT,

    -- Автоматические действия
    auto_actions JSONB DEFAULT '{}',
    -- {"send_price": true, "offer_appointment": true}

    -- Условия выхода (когда считать этап завершённым)
    exit_conditions JSONB,
    -- {"all_fields": ["device_brand", "device_model", "symptom_text"]}

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, vertical_id, code)
);

CREATE INDEX idx_elo_funnel_stages_tenant ON elo_funnel_stages(tenant_id, vertical_id, position);

-- История переходов по этапам
CREATE TABLE elo_dialog_stage_history (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    dialog_id UUID NOT NULL REFERENCES elo_dialogs(id),
    stage_id UUID NOT NULL REFERENCES elo_funnel_stages(id),

    -- Когда вошли и вышли
    entered_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    exited_at TIMESTAMPTZ,

    -- Причина выхода
    exit_reason VARCHAR(50),
    -- completed | skipped | abandoned | forced

    -- Снимок контекста на момент входа (для аналитики)
    context_snapshot JSONB,

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX idx_elo_dialog_stage_history_dialog ON elo_dialog_stage_history(dialog_id, entered_at DESC);
CREATE INDEX idx_elo_dialog_stage_history_stage ON elo_dialog_stage_history(stage_id);
```

---

## Микроворонка диалога

### Концепция

Вместо "типа обращения" (Ремонт, Покупка, Консультация) используем **микроворонку** — последовательность этапов диалога:

```
👋 Приветствие → 📱 Устройство → 🔧 Проблема → 💰 Цена → 📅 Запись → 👋 Прощание
```

Каждый этап — это микроцель для AI с условиями входа/выхода.

### Почему не "тип обращения"

| Подход | Проблема |
|--------|----------|
| Тип обращения | Требует классификации в начале, клиент может не знать что хочет |
| Микроворонка | Ведёт клиента пошагово, определяет намерение по ходу |

### Структура этапа

```json
{
  "code": "problem",
  "name": "Обсуждение проблемы",
  "position": 3,
  "entry_conditions": {
    "required_fields": ["device_model"]
  },
  "ai_goal": "Собрать симптомы: что не работает, когда началось, при каких условиях",
  "ai_prompt": "Клиент рассказал про устройство {device}. Уточни проблему...",
  "auto_actions": {},
  "exit_conditions": {
    "any_of": ["symptom_text", "problem_category"]
  }
}
```

### Стандартные этапы (вертикаль phone_repair)

| # | code | name | ai_goal |
|---|------|------|---------|
| 1 | greeting | Приветствие | Поздороваться, узнать имя |
| 2 | device | Устройство | Бренд, модель, цвет, владелец |
| 3 | problem | Проблема | Симптомы, когда началось |
| 4 | price | Цена | Озвучить стоимость |
| 5 | appointment | Запись | Дата/время визита |
| 6 | closing | Закрытие | Подтвердить, попрощаться |

### Хранение текущего этапа

**PostgreSQL (elo_dialogs.context):**
```json
{
  "current_stage": "problem",
  "stage_entered_at": "2025-12-10T10:30:00Z"
}
```

Минимум данных. Всё остальное — из графа.

---

## Focus Score и Pending (вычисляемые)

### Концепция

**focus_score** — процент заполненности контекста диалога (0-100%).

**pending** — список полей, которые ещё нужно собрать.

### Почему НЕ хранить

1. **Граф = источник истины** — всегда актуальные данные
2. **15-20ms** — достаточно быстро для каждого запроса
3. **Нет рассинхрона** — не нужно инвалидировать кэш

### Как вычислять

```cypher
MATCH (d:ELO_Dialog {id: $dialogId})
OPTIONAL MATCH (d)-[:HAS_CLIENT]->(c:ELO_Client)
OPTIONAL MATCH (d)-[:ABOUT_DEVICE]->(dev:ELO_Device)
OPTIONAL MATCH (d)-[:HAS_ISSUE]->(i:ELO_Issue)
OPTIONAL MATCH (i)-[:HAS_SYMPTOM]->(s:ELO_Symptom)
OPTIONAL MATCH (i)-[:PROBLEM_CATEGORY]->(pc:ELO_ProblemCategory)

WITH d, {
  client_name: c.name,
  client_phone: c.phone,
  device_brand: dev.brand,
  device_model: dev.model,
  device_color: dev.color,
  problem_category: pc.code,
  symptom_text: s.raw_text
} as values

RETURN
  values,
  [k IN keys(values) WHERE values[k] IS NULL] as pending,
  toFloat(size([k IN keys(values) WHERE values[k] IS NOT NULL])) / size(keys(values)) as focus_score
```

### Пример результата

```json
{
  "values": {
    "client_name": "Иван",
    "client_phone": null,
    "device_brand": "Apple",
    "device_model": "iPhone 13",
    "device_color": null,
    "problem_category": "display",
    "symptom_text": "не работает экран"
  },
  "pending": ["client_phone", "device_color"],
  "focus_score": 0.71
}
```

### Использование

**AI Router:**
```
focus_score < 0.5 → продолжаем сбор информации
focus_score >= 0.8 → можно озвучивать цену
focus_score == 1.0 → диалог готов к закрытию
```

**Дожим незакрытых:**
```
Клиент: "Ну всё, спасибо, до свидания"
AI: "Подождите, вы не сказали телефон для связи. Оставите?"
```

---

## Обновлённая архитектура

### Слои системы

```
┌─────────────────────────────────────────────────────────────────┐
│                        КЛИЕНТЫ                                   │
│         Telegram, WhatsApp, VK, Avito, MAX, Phone, Web          │
└─────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                      MCP КАНАЛЫ (v2.0.0)                         │
│  mcp-telegram │ mcp-whatsapp │ mcp-avito │ mcp-vk │ mcp-max     │
└─────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                      n8n WORKFLOWS (ELO_*)                       │
│                                                                  │
│  ┌──────────────┐   ┌──────────────┐   ┌──────────────┐        │
│  │ ELO_In_*     │ → │ ELO_Core_*   │ → │ ELO_Out_*    │        │
│  │ (входящие)   │   │ (обработка)  │   │ (исходящие)  │        │
│  └──────────────┘   └──────────────┘   └──────────────┘        │
│                                                                  │
│  Tenant Resolver → Batcher → Dialog Engine → AI Router → Out    │
└─────────────────────────────────────────────────────────────────┘
                              │
                    ┌─────────┴─────────┐
                    ▼                   ▼
┌─────────────────────────┐   ┌─────────────────────────┐
│      PostgreSQL         │   │        Neo4j            │
│      (elo_* таблицы)    │   │    (граф связей)        │
│                         │   │                         │
│ • Диалоги, события     │   │ • Client → Device       │
│ • Клиенты, операторы   │   │ • Device → Problem      │
│ • Настройки            │   │ • SPOUSE, REFERRED_BY   │
│ • Задачи               │   │ • ELO_DefectSign        │
│ • Приёмки (intakes)    │   │ • ELO_SignPattern       │
└─────────────────────────┘   └─────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                    Android App (API v2)                          │
│                                                                  │
│  • Диалоги (не заявки)                                          │
│  • AI подсказки                                                 │
│  • Задачи мастеров                                              │
│  • WebSocket для realtime                                       │
└─────────────────────────────────────────────────────────────────┘
```

### Поток обработки сообщения

```
1. MCP получает webhook
   │
2. ELO_In_{Channel} нормализует
   │
   ▼
3. ELO_Core_Tenant_Resolver
   • Находит tenant по webhook_hash
   • Добавляет tenant_id, tenant_settings
   │
   ▼
4. ELO_Core_Batcher
   • Объединяет сообщения за N секунд
   • Предотвращает спам AI-запросов
   │
   ▼
5. ELO_Core_Dialog_Engine
   • Находит/создаёт client (PostgreSQL)
   • Находит/создаёт dialog
   • Сохраняет event (message.inbound)
   • Синхронизирует в Neo4j
   │
   ▼
6. ELO_Core_AI_Router
   • Загружает context из dialog
   • Вызывает AI для извлечения
   • Сохраняет extractions
   • Генерирует suggestions
   • Обновляет dialog.context
   │
   ▼
7. ELO_Out_{Channel}
   • Форматирует ответ под канал
   • Отправляет через MCP
```

---

## План реализации

### Фаза 0: Подготовка БД (1-2 дня)

**Цель:** Добавить все таблицы для трёх слоёв правды

**PostgreSQL:**
- [ ] `elo_settings` — настройки с версионированием
- [ ] `elo_messages` — зеркало ELO_Message
- [ ] `elo_issues` — случаи обращения
- [ ] `elo_symptoms` — симптомы (со слов клиента)
- [ ] `elo_diagnoses` — диагнозы (мастер)
- [ ] `elo_repairs` — выполненные ремонты
- [ ] `elo_facts` — факты о клиенте
- [ ] `elo_symptom_types` — справочник типов симптомов
- [ ] `elo_diagnosis_types` — справочник типов диагнозов
- [ ] `elo_repair_actions` — справочник типов ремонтов

**Neo4j:**
- [ ] Constraints для ELO_Message, ELO_Client, ELO_Device, ELO_Issue
- [ ] Constraints для ELO_Symptom, ELO_Diagnosis, ELO_Repair, ELO_Fact
- [ ] Constraints для справочников: ELO_SymptomType, ELO_DiagnosisType, ELO_RepairAction
- [ ] Indexes для поиска

**Файл миграции:** `002_elo_graph_tables.sql`

### Фаза 1: Core Workflows (3-5 дней)

**Цель:** Работающий pipeline входящих сообщений с записью в граф

- [ ] Импортировать все ELO_* workflows в n8n
- [ ] Протестировать ELO_Core_Tenant_Resolver
- [ ] Протестировать ELO_Core_Batcher
- [ ] Обновить ELO_Core_Dialog_Engine для записи в:
  - PostgreSQL: elo_messages, elo_dialogs
  - Neo4j: ELO_Message, ELO_Client (связи)
- [ ] Создать ELO_Core_AI_Router (базовый)
- [ ] Создать ELO_Out_* workflows

### Фаза 2: MCP интеграция (2-3 дня)

**Цель:** Подключить каналы к ELO workflows

- [ ] Настроить mcp-telegram → ELO_In_Telegram
- [ ] Настроить mcp-whatsapp → ELO_In_WhatsApp
- [ ] Настроить mcp-avito → ELO_In_Avito
- [ ] Проверить health check MCP серверов
- [ ] Тест end-to-end: сообщение → ответ

### Фаза 3: Android API v2 (5-7 дней)

**Цель:** Переработать Android под новую архитектуру

- [ ] Создать api-android v2 endpoints
- [ ] GET /v2/dialogs (список диалогов)
- [ ] GET /v2/dialogs/{id} (детали + сообщения из elo_messages)
- [ ] GET /v2/dialogs/{id}/issues (случаи обращения)
- [ ] POST /v2/dialogs/{id}/messages (отправка)
- [ ] GET /v2/dialogs/{id}/suggestions (AI подсказки)
- [ ] WebSocket для realtime
- [ ] Обновить Android app

### Фаза 4: AI Pipeline + Graph Sync (5-7 дней)

**Цель:** AI извлечение + синхронизация в граф

- [ ] Настроить Universal Tools в n8n:
  - device_extract → ELO_Device
  - symptom_extract → ELO_Symptom + ELO_SymptomType
  - intent_classify
  - response_generate
- [ ] Синхронизация в Neo4j при извлечении
- [ ] Связи: Message→Client, Message→Device, Message→Symptom
- [ ] Настроить промпты для вертикали phone_repair
- [ ] Seed-данные справочников (SymptomType, DiagnosisType, RepairAction)

### Фаза 5: Диагностика и Ремонты (3-5 дней)

**Цель:** Полный цикл Issue → Symptom → Diagnosis → Repair

- [ ] Форма приёмки в Android (создаёт ELO_Issue + ELO_Symptom)
- [ ] Форма диагностики (создаёт ELO_Diagnosis)
- [ ] Форма завершения ремонта (создаёт ELO_Repair)
- [ ] Связи в Neo4j:
  - Issue→Symptom, Issue→Diagnosis, Issue→Repair
  - Symptom→RESULTED_IN→Diagnosis
  - Diagnosis→REQUIRED→Repair
- [ ] Обновление статистики справочников (total_cases)
- [ ] НЕ делаем: автоматическое обучение на расхождениях

### Фаза 6: Факты и Персонализация (2-3 дня)

**Цель:** Накопление знаний о клиентах

- [ ] AI extraction фактов из сообщений → ELO_Fact
- [ ] Связь Client→HAS_FACT→Fact
- [ ] Использование фактов в AI response generation
- [ ] Социальный граф: FAMILY, REFERRED связи

---

## Итоговая структура БД

### PostgreSQL: 26 таблиц elo_*

**Существующие (13):**
| # | Таблица | Назначение |
|---|---------|------------|
| 1 | elo_tenants | Тенанты |
| 2 | elo_operators | Операторы |
| 3 | elo_clients | Клиенты |
| 4 | elo_dialogs | Диалоги |
| 5 | elo_events | События (EventStore) |
| 6 | elo_verticals | Вертикали бизнеса |
| 7 | elo_tenant_verticals | Связь тенант-вертикаль |
| 8 | elo_price_list | Прайс-лист |
| 9 | elo_ai_extractions | AI извлечения |
| 10 | elo_ai_suggestions | AI подсказки |
| 11 | elo_channel_accounts | Аккаунты каналов |
| 12 | elo_tasks | Задачи |
| 13 | elo_task_updates | История задач |

**Новые (13):**
| # | Таблица | Назначение |
|---|---------|------------|
| 14 | **elo_settings** | Настройки с версионированием |
| 15 | **elo_messages** | Сообщения (зеркало ELO_Message) |
| 16 | **elo_issues** | Случаи обращения |
| 17 | **elo_symptoms** | Симптомы (со слов клиента) |
| 18 | **elo_diagnoses** | Диагнозы (мастер) |
| 19 | **elo_repairs** | Выполненные ремонты |
| 20 | **elo_facts** | Факты о клиенте |
| 21 | **elo_symptom_types** | Справочник типов симптомов |
| 22 | **elo_diagnosis_types** | Справочник типов диагнозов |
| 23 | **elo_repair_actions** | Справочник типов ремонтов |
| 24 | **elo_problem_categories** | Категории проблем (Дисплей, Батарея...) |
| 25 | **elo_funnel_stages** | Этапы микроворонки |
| 26 | **elo_dialog_stage_history** | История переходов по этапам |

### Neo4j: Лейблы

**Старые (сохраняем для маркетинга/KB):**
- Fingerprint, Contact, Creative, ABTest
- KB_Category, KB_Brand, KB_Device, KB_Guide, KB_Tool

**Новые ELO_* (основные):**
| Лейбл | Назначение |
|-------|------------|
| ELO_Message | Точка входа, каждое сообщение |
| ELO_Client | Клиент |
| ELO_Device | Устройство |
| ELO_Issue | Случай обращения |
| ELO_Symptom | Симптом (со слов клиента) |
| ELO_Diagnosis | Диагноз (мастер) |
| ELO_Repair | Выполненный ремонт |
| ELO_Fact | Факт о клиенте |

**Новые ELO_* (справочники — 4):**
| Лейбл | Назначение |
|-------|------------|
| ELO_SymptomType | Тип симптома |
| ELO_DiagnosisType | Тип диагноза |
| ELO_RepairAction | Тип ремонта |
| ELO_ProblemCategory | Категория проблемы (Дисплей, Батарея...) |

---

## Принципы

1. **Три слоя правды:** Symptom → Diagnosis → Repair
2. **Накопление данных с первого клиента** — всё пишем в граф и PostgreSQL
3. **ELO_Message как точка входа** — каждое сообщение связано с клиентом, устройством, issue
4. **Prompt-in-Request** — промпты в запросе, не в коде
5. **Кнут-Пряник-Кнут** — правила → AI → валидация
6. **Диалогоцентричность** — диалог главная сущность
7. **PostgreSQL = кэш + транзакции, Neo4j = связи + обход**
8. **Самообучение — ОТЛОЖЕНО** — инфраструктура есть, логика позже
9. **Цены из истории — НЕ НУЖНО** — только прайс-лист

---

## Ключевые запросы к графу

### Контекст для AI (до ответа)

```cypher
// Найти все активные issues клиента
MATCH (c:ELO_Client {telegram_id: $telegramId})-[:OWNS|BROUGHT]->(d:ELO_Device)
MATCH (d)-[:HAS_ISSUE]->(i:ELO_Issue)
WHERE i.stage NOT IN ['DELIVERED', 'CANCELLED']
OPTIONAL MATCH (i)-[:HAS_SYMPTOM]->(s:ELO_Symptom)-[:SYMPTOM_TYPE]->(st:ELO_SymptomType)
OPTIONAL MATCH (i)-[:HAS_DIAGNOSIS]->(diag:ELO_Diagnosis)-[:DIAGNOSIS_TYPE]->(dt:ELO_DiagnosisType)
RETURN d, i, st.name as symptom, dt.name as diagnosis
```

### Правильный follow-up

```cypher
// По реальному ремонту, не симптому
MATCH (i:ELO_Issue)-[:HAS_REPAIR]->(r:ELO_Repair)-[:REPAIR_ACTION]->(ra:ELO_RepairAction)
WHERE ra.follow_up_enabled = true
  AND i.delivered_at < datetime() - duration('P30D')
RETURN ra.follow_up_template as message
```

### Социальный граф

```cypher
MATCH (c:ELO_Client {id: $clientId})
OPTIONAL MATCH (c)-[f:FAMILY]-(family:ELO_Client)
OPTIONAL MATCH (c)-[:REFERRED]->(referred:ELO_Client)
RETURN c, collect({client: family, relation: f.type}) as family
```

---

## Следующий шаг

После утверждения этого плана:
1. Создать миграцию `002_elo_graph_tables.sql`
2. Применить на PostgreSQL
3. Создать Neo4j constraints и indexes
4. Начать Фазу 1 (Core Workflows)

---

**Автор:** Claude Code
**Дата:** 2025-12-10
**Версия:** 3.0 (+ микроворонка, focus_score, ELO_ProblemCategory)
