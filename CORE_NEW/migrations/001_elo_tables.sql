-- CORE_NEW: Migration 001 - Create elo_* tables
-- Run on: PostgreSQL 185.221.214.83:6544
-- Command: ssh root@185.221.214.83 "docker exec -i supabase-db psql -U postgres < /path/to/001_elo_tables.sql"

-- =============================================================================
-- 1. elo_tenants - Tenants
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_tenants (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Basic
    name VARCHAR(255) NOT NULL,
    slug VARCHAR(100) UNIQUE,

    -- Settings
    settings JSONB DEFAULT '{}',

    -- Limits
    plan VARCHAR(50) DEFAULT 'free',
    max_operators INT DEFAULT 3,
    max_dialogs_per_month INT DEFAULT 500,

    -- Status
    is_active BOOLEAN DEFAULT true,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

-- =============================================================================
-- 2. elo_operators - Operators (before clients due to FK)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_operators (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Auth
    email VARCHAR(255),
    phone VARCHAR(20),
    telegram_id VARCHAR(50),
    password_hash VARCHAR(255),

    -- Profile
    name VARCHAR(255) NOT NULL,
    avatar_url TEXT,
    role VARCHAR(20) DEFAULT 'operator',

    -- Push
    fcm_tokens JSONB DEFAULT '[]',

    -- Settings
    settings JSONB DEFAULT '{}',

    -- Status
    is_active BOOLEAN DEFAULT true,
    last_seen_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, email),
    UNIQUE(tenant_id, telegram_id)
);

CREATE INDEX IF NOT EXISTS idx_elo_operators_tenant ON elo_operators(tenant_id);

-- =============================================================================
-- 3. elo_clients - Clients
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_clients (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Channel IDs
    phone VARCHAR(20),
    telegram_id VARCHAR(50),
    whatsapp_id VARCHAR(50),
    vk_id VARCHAR(50),
    avito_id VARCHAR(50),
    email VARCHAR(255),

    -- Client data
    name VARCHAR(255),

    -- Profile (AI enriched)
    profile JSONB DEFAULT '{}',

    -- Stats (auto-calculated)
    stats JSONB DEFAULT '{}',

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    -- Unique per channel per tenant
    UNIQUE(tenant_id, phone),
    UNIQUE(tenant_id, telegram_id),
    UNIQUE(tenant_id, whatsapp_id),
    UNIQUE(tenant_id, vk_id),
    UNIQUE(tenant_id, avito_id),
    UNIQUE(tenant_id, email)
);

CREATE INDEX IF NOT EXISTS idx_elo_clients_tenant ON elo_clients(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_clients_phone ON elo_clients(tenant_id, phone);
CREATE INDEX IF NOT EXISTS idx_elo_clients_telegram ON elo_clients(tenant_id, telegram_id);

-- =============================================================================
-- 4. elo_dialogs - Dialogs (replaces appeals)
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_dialogs (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    client_id UUID NOT NULL REFERENCES elo_clients(id),

    -- Current channel
    channel VARCHAR(20) NOT NULL,
    external_chat_id VARCHAR(100),

    -- Status
    status VARCHAR(20) DEFAULT 'active',

    -- AI context
    context JSONB DEFAULT '{}',

    -- Metadata
    metadata JSONB DEFAULT '{}',

    -- Operators
    assigned_operator_id UUID REFERENCES elo_operators(id),
    last_operator_id UUID REFERENCES elo_operators(id),

    -- Timestamps
    last_message_at TIMESTAMPTZ,
    last_client_message_at TIMESTAMPTZ,
    last_operator_message_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_dialogs_tenant ON elo_dialogs(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_dialogs_client ON elo_dialogs(client_id);
CREATE INDEX IF NOT EXISTS idx_elo_dialogs_status ON elo_dialogs(tenant_id, status);
CREATE INDEX IF NOT EXISTS idx_elo_dialogs_channel ON elo_dialogs(tenant_id, channel);
CREATE INDEX IF NOT EXISTS idx_elo_dialogs_last_message ON elo_dialogs(tenant_id, last_message_at DESC);

-- =============================================================================
-- 5. elo_events - EventStore
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_events (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Links
    dialog_id UUID REFERENCES elo_dialogs(id),
    client_id UUID REFERENCES elo_clients(id),

    -- Event type
    event_type VARCHAR(50) NOT NULL,

    -- Event data
    data JSONB NOT NULL,

    -- Actor
    actor_type VARCHAR(20),
    actor_id UUID,

    -- External
    external_id VARCHAR(100),

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_events_tenant ON elo_events(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_events_dialog ON elo_events(dialog_id);
CREATE INDEX IF NOT EXISTS idx_elo_events_client ON elo_events(client_id);
CREATE INDEX IF NOT EXISTS idx_elo_events_type ON elo_events(tenant_id, event_type);
CREATE INDEX IF NOT EXISTS idx_elo_events_created ON elo_events(tenant_id, created_at DESC);

-- =============================================================================
-- 6. elo_verticals - Business verticals
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_verticals (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    code VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,

    -- Vertical config
    config JSONB NOT NULL,

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW()
);

-- Default vertical for MVP
INSERT INTO elo_verticals (code, name, config) VALUES (
    'phone_repair',
    'Ремонт телефонов',
    '{
        "intents": ["repair", "purchase", "question", "sale"],
        "stages": ["new", "quoted", "scheduled", "received", "in_progress", "ready", "delivered"],
        "entity_types": ["device", "issue"],
        "device_brands": ["Apple", "Samsung", "Xiaomi", "Huawei", "Honor", "Realme", "OPPO", "Vivo"],
        "issue_categories": ["Дисплей", "Аккумулятор", "Корпус", "Камера", "Связь", "ПО"]
    }'
) ON CONFLICT (code) DO NOTHING;

-- =============================================================================
-- 7. elo_tenant_verticals - Tenant-vertical binding
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_tenant_verticals (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    vertical_id UUID NOT NULL REFERENCES elo_verticals(id),

    -- Custom config
    custom_config JSONB DEFAULT '{}',

    is_primary BOOLEAN DEFAULT false,

    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, vertical_id)
);

-- =============================================================================
-- 8. elo_price_list - Price list
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_price_list (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- What
    service_type VARCHAR(50) NOT NULL,

    -- For what (optional)
    brand VARCHAR(100),
    model VARCHAR(100),
    issue_category VARCHAR(100),

    -- Service name
    name VARCHAR(255) NOT NULL,
    description TEXT,

    -- Price
    price_min DECIMAL(10,2),
    price_max DECIMAL(10,2),
    price_display VARCHAR(100),

    -- Duration
    duration_minutes INT,
    duration_display VARCHAR(50),

    -- Availability
    availability VARCHAR(20) DEFAULT 'available',

    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_price_list_tenant ON elo_price_list(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_price_list_search ON elo_price_list(tenant_id, brand, model, issue_category);

-- =============================================================================
-- 9. elo_ai_extractions - AI extractions
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_ai_extractions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    dialog_id UUID NOT NULL REFERENCES elo_dialogs(id),
    event_id UUID REFERENCES elo_events(id),

    -- What was extracted
    extraction_type VARCHAR(50) NOT NULL,

    -- Result
    value JSONB NOT NULL,
    confidence DECIMAL(3,2),

    -- Status
    status VARCHAR(20) DEFAULT 'extracted',

    confirmed_by UUID REFERENCES elo_operators(id),
    confirmed_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_ai_extractions_dialog ON elo_ai_extractions(dialog_id);
CREATE INDEX IF NOT EXISTS idx_elo_ai_extractions_type ON elo_ai_extractions(tenant_id, extraction_type);

-- =============================================================================
-- 10. elo_ai_suggestions - AI suggestions
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_ai_suggestions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    dialog_id UUID NOT NULL REFERENCES elo_dialogs(id),

    -- Suggestion type
    suggestion_type VARCHAR(50) NOT NULL,

    -- Content
    content JSONB NOT NULL,

    -- Usage
    status VARCHAR(20) DEFAULT 'pending',

    used_by UUID REFERENCES elo_operators(id),
    used_at TIMESTAMPTZ,
    modified_text TEXT,

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_ai_suggestions_dialog ON elo_ai_suggestions(dialog_id);

-- =============================================================================
-- 11. elo_channel_accounts - Channel accounts
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_channel_accounts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    channel VARCHAR(20) NOT NULL,

    -- Identification
    account_id VARCHAR(100) NOT NULL,
    account_name VARCHAR(255),

    -- Webhook
    webhook_hash VARCHAR(32),
    webhook_url TEXT,

    -- Credentials
    credentials JSONB,

    -- Status
    is_active BOOLEAN DEFAULT true,
    last_webhook_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, channel, account_id)
);

CREATE INDEX IF NOT EXISTS idx_elo_channel_accounts_tenant ON elo_channel_accounts(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_channel_accounts_webhook ON elo_channel_accounts(webhook_hash);

-- =============================================================================
-- 12. elo_tasks - Tasks
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_tasks (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),

    -- Links (optional)
    dialog_id UUID REFERENCES elo_dialogs(id),
    client_id UUID REFERENCES elo_clients(id),
    device_id UUID,

    -- Assignee
    assignee_id UUID REFERENCES elo_operators(id),
    created_by_id UUID REFERENCES elo_operators(id),

    -- Content
    title VARCHAR(255) NOT NULL,
    description TEXT,

    -- Task type
    task_type VARCHAR(50) DEFAULT 'general',

    -- Deadline
    deadline TIMESTAMPTZ,
    estimated_duration_min INT,

    -- Status
    status VARCHAR(20) DEFAULT 'pending',

    -- Priority
    priority VARCHAR(10) DEFAULT 'normal',

    -- Hierarchy
    parent_task_id UUID REFERENCES elo_tasks(id),

    -- Metadata
    metadata JSONB DEFAULT '{}',

    -- Timestamps
    started_at TIMESTAMPTZ,
    completed_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_tasks_tenant ON elo_tasks(tenant_id);
CREATE INDEX IF NOT EXISTS idx_elo_tasks_assignee ON elo_tasks(assignee_id, status);
CREATE INDEX IF NOT EXISTS idx_elo_tasks_dialog ON elo_tasks(dialog_id);
CREATE INDEX IF NOT EXISTS idx_elo_tasks_client ON elo_tasks(client_id);
CREATE INDEX IF NOT EXISTS idx_elo_tasks_status ON elo_tasks(tenant_id, status, priority);
CREATE INDEX IF NOT EXISTS idx_elo_tasks_deadline ON elo_tasks(tenant_id, deadline) WHERE status IN ('pending', 'in_progress');
CREATE INDEX IF NOT EXISTS idx_elo_tasks_parent ON elo_tasks(parent_task_id);

-- =============================================================================
-- 13. elo_task_updates - Task updates history
-- =============================================================================

CREATE TABLE IF NOT EXISTS elo_task_updates (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    task_id UUID NOT NULL REFERENCES elo_tasks(id) ON DELETE CASCADE,

    -- Who
    author_id UUID NOT NULL REFERENCES elo_operators(id),

    -- Update type
    update_type VARCHAR(30) NOT NULL,

    -- Content
    content TEXT,

    -- Changes
    changes JSONB DEFAULT '{}',

    -- Attachments
    attachments JSONB DEFAULT '[]',

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_elo_task_updates_task ON elo_task_updates(task_id, created_at DESC);
CREATE INDEX IF NOT EXISTS idx_elo_task_updates_author ON elo_task_updates(author_id);

-- =============================================================================
-- Done!
-- =============================================================================

-- Verify tables created
SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
  AND table_name LIKE 'elo_%'
ORDER BY table_name;
