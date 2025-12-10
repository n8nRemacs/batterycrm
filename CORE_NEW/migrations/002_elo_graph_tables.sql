-- CORE_NEW: Migration 002 - Graph tables + Microfunnel
-- Run on: PostgreSQL 185.221.214.83:6544
-- Command: ssh root@185.221.214.83 "docker exec -i supabase-db psql -U postgres" < migrations/002_elo_graph_tables.sql

-- =============================================================================
-- 1. elo_settings - Настройки с версионированием
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_settings (
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

CREATE INDEX IF NOT EXISTS idx_elo_settings_tenant_key ON elo_settings(tenant_id, key);
CREATE INDEX IF NOT EXISTS idx_elo_settings_latest ON elo_settings(tenant_id, key, version DESC);

-- =============================================================================
-- 2. elo_messages - Сообщения (зеркало ELO_Message)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_messages (
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

CREATE INDEX IF NOT EXISTS idx_elo_messages_dialog ON elo_messages(dialog_id, timestamp DESC);
CREATE INDEX IF NOT EXISTS idx_elo_messages_client ON elo_messages(client_id, timestamp DESC);
CREATE INDEX IF NOT EXISTS idx_elo_messages_tenant_chat ON elo_messages(tenant_id, external_chat_id);

-- =============================================================================
-- 3. elo_issues - Случаи обращения (зеркало ELO_Issue)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_issues (
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

CREATE INDEX IF NOT EXISTS idx_elo_issues_tenant ON elo_issues(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_issues_dialog ON elo_issues(dialog_id);
CREATE INDEX IF NOT EXISTS idx_elo_issues_stage ON elo_issues(tenant_id, stage);

-- =============================================================================
-- 4. elo_symptoms - Симптомы (зеркало ELO_Symptom)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_symptoms (
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

CREATE INDEX IF NOT EXISTS idx_elo_symptoms_issue ON elo_symptoms(issue_id);

-- =============================================================================
-- 5. elo_diagnoses - Диагнозы (зеркало ELO_Diagnosis)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_diagnoses (
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

CREATE INDEX IF NOT EXISTS idx_elo_diagnoses_issue ON elo_diagnoses(issue_id);

-- =============================================================================
-- 6. elo_repairs - Выполненные ремонты (зеркало ELO_Repair)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_repairs (
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

CREATE INDEX IF NOT EXISTS idx_elo_repairs_issue ON elo_repairs(issue_id);

-- =============================================================================
-- 7. elo_facts - Факты о клиенте (зеркало ELO_Fact)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_facts (
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

CREATE INDEX IF NOT EXISTS idx_elo_facts_client ON elo_facts(client_id);

-- =============================================================================
-- 8. elo_symptom_types - Справочник типов симптомов
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_symptom_types (
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

-- =============================================================================
-- 9. elo_diagnosis_types - Справочник типов диагнозов
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_diagnosis_types (
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

-- =============================================================================
-- 10. elo_repair_actions - Справочник типов ремонтов
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_repair_actions (
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

-- =============================================================================
-- 11. elo_problem_categories - Категории проблем
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_problem_categories (
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
-- 12. elo_funnel_stages - Этапы микроворонки
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_funnel_stages (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID REFERENCES elo_tenants(id),   -- NULL = шаблон вертикали
    vertical_id UUID REFERENCES elo_verticals(id),

    code VARCHAR(50) NOT NULL,
    name VARCHAR(100) NOT NULL,

    -- Порядок в воронке
    position INT NOT NULL,

    -- Условия входа (когда переходить на этот этап)
    entry_conditions JSONB NOT NULL DEFAULT '{}',
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

CREATE INDEX IF NOT EXISTS idx_elo_funnel_stages_tenant ON elo_funnel_stages(tenant_id, vertical_id, position);

-- =============================================================================
-- 13. elo_dialog_stage_history - История переходов по этапам
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_dialog_stage_history (
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

CREATE INDEX IF NOT EXISTS idx_elo_dialog_stage_history_dialog ON elo_dialog_stage_history(dialog_id, entered_at DESC);
CREATE INDEX IF NOT EXISTS idx_elo_dialog_stage_history_stage ON elo_dialog_stage_history(stage_id);

-- =============================================================================
-- Done! Verify tables created
-- =============================================================================

SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
  AND table_name LIKE 'elo_%'
ORDER BY table_name;
