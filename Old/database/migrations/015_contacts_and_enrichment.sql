-- Migration 015: Contacts and Enrichment System
-- Date: 2025-12-04
-- Purpose: Contact management, enrichment tracking, creatives and A/B testing

-- ============================================
-- 1. CONTACTS - All client contact methods
-- ============================================

CREATE TABLE IF NOT EXISTS contacts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Contact info
    type VARCHAR(20) NOT NULL,                    -- phone, telegram, whatsapp, email, vk, avito
    value VARCHAR(255) NOT NULL,                  -- normalized value (+79..., @username, email)
    raw_value VARCHAR(255),                       -- original value as received

    -- Status
    is_verified BOOLEAN DEFAULT FALSE,            -- confirmed by client response
    is_primary BOOLEAN DEFAULT FALSE,             -- main contact for this type
    is_active BOOLEAN DEFAULT TRUE,               -- not blocked/invalid

    -- Metadata
    display_name VARCHAR(255),                    -- name from profile (WA, TG)
    profile_data JSONB DEFAULT '{}',              -- additional profile info

    -- Discovery
    discovered_via VARCHAR(50),                   -- auto, asked, form, profile, import
    discovered_channel VARCHAR(50),               -- avito, telegram, whatsapp, vk, phone, form
    discovered_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Verification
    verified_at TIMESTAMP WITH TIME ZONE,
    verified_via VARCHAR(50),                     -- response, call, form_submit

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id),

    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Unique contact per tenant
    UNIQUE(type, value, tenant_id)
);

CREATE INDEX idx_contacts_type ON contacts(type);
CREATE INDEX idx_contacts_value ON contacts(value);
CREATE INDEX idx_contacts_tenant ON contacts(tenant_id);
CREATE INDEX idx_contacts_verified ON contacts(is_verified) WHERE is_verified = TRUE;

-- ============================================
-- 2. CLIENT_CONTACTS - Links clients to contacts (M:N)
-- ============================================

CREATE TABLE IF NOT EXISTS client_contacts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    client_id UUID NOT NULL REFERENCES clients(id) ON DELETE CASCADE,
    contact_id UUID NOT NULL REFERENCES contacts(id) ON DELETE CASCADE,

    -- Relationship
    is_owner BOOLEAN DEFAULT TRUE,                -- client owns this contact (vs shared)
    confidence FLOAT DEFAULT 1.0,                 -- 0.0-1.0 confidence

    -- Discovery context
    discovered_touchpoint_id UUID,                -- which touchpoint led to discovery

    -- Timestamps
    linked_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id),

    UNIQUE(client_id, contact_id)
);

CREATE INDEX idx_client_contacts_client ON client_contacts(client_id);
CREATE INDEX idx_client_contacts_contact ON client_contacts(contact_id);
CREATE INDEX idx_client_contacts_tenant ON client_contacts(tenant_id);

-- ============================================
-- 3. ENRICHMENT_ACTIONS - Track enrichment attempts
-- ============================================

CREATE TABLE IF NOT EXISTS enrichment_actions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Target
    client_id UUID NOT NULL REFERENCES clients(id) ON DELETE CASCADE,
    appeal_id UUID REFERENCES appeals(id) ON DELETE SET NULL,

    -- What we're trying to get
    target_contact_type VARCHAR(20) NOT NULL,     -- phone, telegram, whatsapp, email

    -- Method used
    method VARCHAR(50) NOT NULL,                  -- ask_in_chat, send_link, call, form
    channel VARCHAR(50) NOT NULL,                 -- where action was performed
    creative_id UUID,                             -- which creative was used

    -- Result
    status VARCHAR(20) DEFAULT 'pending',         -- pending, success, failed, no_response
    result_contact_id UUID REFERENCES contacts(id),

    -- Timestamps
    attempted_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    completed_at TIMESTAMP WITH TIME ZONE,

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id)
);

CREATE INDEX idx_enrichment_actions_client ON enrichment_actions(client_id);
CREATE INDEX idx_enrichment_actions_status ON enrichment_actions(status);
CREATE INDEX idx_enrichment_actions_creative ON enrichment_actions(creative_id);
CREATE INDEX idx_enrichment_actions_tenant ON enrichment_actions(tenant_id);

-- ============================================
-- 4. CREATIVES - Templates for enrichment
-- ============================================

CREATE TABLE IF NOT EXISTS creatives (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Identity
    code VARCHAR(50) NOT NULL,                    -- unique code for reference
    name VARCHAR(255) NOT NULL,                   -- display name
    description TEXT,

    -- Type and purpose
    type VARCHAR(30) NOT NULL,                    -- text, link, form, page, script
    purpose VARCHAR(30) NOT NULL,                 -- get_phone, get_whatsapp, get_email, get_telegram, get_fingerprint

    -- Content
    content TEXT NOT NULL,                        -- the actual creative content
    variables JSONB DEFAULT '[]',                 -- list of variables like {{client_name}}, {{device}}

    -- Targeting
    channels JSONB DEFAULT '[]',                  -- which channels can use this: ["avito", "telegram"]
    conditions JSONB DEFAULT '{}',                -- when to use: {"has_phone": false, "appeal_status": "new"}

    -- A/B Testing
    ab_group VARCHAR(10),                         -- A, B, C, Z (control)
    ab_test_id UUID,                              -- which test this belongs to
    weight INTEGER DEFAULT 100,                   -- selection weight (for weighted random)

    -- Status
    is_active BOOLEAN DEFAULT TRUE,
    is_default BOOLEAN DEFAULT FALSE,             -- use when no specific creative matches

    -- Stats (denormalized for quick access)
    usage_count INTEGER DEFAULT 0,
    success_count INTEGER DEFAULT 0,
    success_rate FLOAT DEFAULT 0.0,

    -- Timestamps
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id),

    UNIQUE(code, tenant_id)
);

CREATE INDEX idx_creatives_type ON creatives(type);
CREATE INDEX idx_creatives_purpose ON creatives(purpose);
CREATE INDEX idx_creatives_ab_test ON creatives(ab_test_id);
CREATE INDEX idx_creatives_active ON creatives(is_active) WHERE is_active = TRUE;
CREATE INDEX idx_creatives_tenant ON creatives(tenant_id);

-- ============================================
-- 5. AB_TESTS - A/B/Z Test definitions
-- ============================================

CREATE TABLE IF NOT EXISTS ab_tests (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Identity
    name VARCHAR(255) NOT NULL,
    description TEXT,

    -- Configuration
    purpose VARCHAR(30) NOT NULL,                 -- what are we testing for
    variants JSONB NOT NULL,                      -- {"A": {"creative_id": "..."}, "B": {...}, "Z": {...}}
    traffic_split JSONB DEFAULT '{"A": 45, "B": 45, "Z": 10}',  -- percentage split

    -- Targeting
    channels JSONB DEFAULT '[]',                  -- which channels
    segment_rules JSONB DEFAULT '{}',             -- client segment rules

    -- Status
    status VARCHAR(20) DEFAULT 'draft',           -- draft, running, paused, completed

    -- Statistical settings
    min_sample_size INTEGER DEFAULT 100,          -- minimum per variant
    confidence_level FLOAT DEFAULT 0.95,          -- statistical confidence

    -- Winner
    winner_variant VARCHAR(10),                   -- A, B, C... or NULL
    winner_confidence FLOAT,

    -- Timestamps
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    started_at TIMESTAMP WITH TIME ZONE,
    ended_at TIMESTAMP WITH TIME ZONE,

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id)
);

CREATE INDEX idx_ab_tests_status ON ab_tests(status);
CREATE INDEX idx_ab_tests_purpose ON ab_tests(purpose);
CREATE INDEX idx_ab_tests_tenant ON ab_tests(tenant_id);

-- ============================================
-- 6. AB_TEST_RESULTS - Individual test exposures
-- ============================================

CREATE TABLE IF NOT EXISTS ab_test_results (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Test reference
    ab_test_id UUID NOT NULL REFERENCES ab_tests(id) ON DELETE CASCADE,
    variant VARCHAR(10) NOT NULL,                 -- A, B, C, Z
    creative_id UUID REFERENCES creatives(id),

    -- Subject
    client_id UUID REFERENCES clients(id) ON DELETE SET NULL,
    fingerprint_id UUID REFERENCES fingerprints(id) ON DELETE SET NULL,
    session_id VARCHAR(100),                      -- for anonymous tracking

    -- Context
    channel VARCHAR(50),
    appeal_id UUID REFERENCES appeals(id) ON DELETE SET NULL,

    -- Outcome
    converted BOOLEAN DEFAULT FALSE,              -- did they complete the goal?
    conversion_value FLOAT,                       -- optional value (e.g., revenue)
    conversion_at TIMESTAMP WITH TIME ZONE,

    -- Timestamps
    exposed_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id)
);

CREATE INDEX idx_ab_test_results_test ON ab_test_results(ab_test_id);
CREATE INDEX idx_ab_test_results_variant ON ab_test_results(ab_test_id, variant);
CREATE INDEX idx_ab_test_results_client ON ab_test_results(client_id);
CREATE INDEX idx_ab_test_results_converted ON ab_test_results(converted) WHERE converted = TRUE;
CREATE INDEX idx_ab_test_results_tenant ON ab_test_results(tenant_id);

-- ============================================
-- 7. CREATIVE_USAGE_LOG - Detailed usage tracking
-- ============================================

CREATE TABLE IF NOT EXISTS creative_usage_log (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- What was used
    creative_id UUID NOT NULL REFERENCES creatives(id) ON DELETE CASCADE,

    -- Context
    client_id UUID REFERENCES clients(id) ON DELETE SET NULL,
    appeal_id UUID REFERENCES appeals(id) ON DELETE SET NULL,
    channel VARCHAR(50),
    operator_id UUID REFERENCES users(id) ON DELETE SET NULL,

    -- Rendered content (with variables filled)
    rendered_content TEXT,

    -- Outcome tracking
    outcome VARCHAR(20),                          -- sent, clicked, converted, ignored
    outcome_at TIMESTAMP WITH TIME ZONE,
    outcome_contact_id UUID REFERENCES contacts(id),  -- if we got a contact

    -- Timestamps
    used_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id)
);

CREATE INDEX idx_creative_usage_creative ON creative_usage_log(creative_id);
CREATE INDEX idx_creative_usage_client ON creative_usage_log(client_id);
CREATE INDEX idx_creative_usage_outcome ON creative_usage_log(outcome);
CREATE INDEX idx_creative_usage_tenant ON creative_usage_log(tenant_id);

-- ============================================
-- 8. HELPER FUNCTIONS
-- ============================================

-- Normalize phone number
CREATE OR REPLACE FUNCTION normalize_phone(phone VARCHAR)
RETURNS VARCHAR AS $$
DECLARE
    cleaned VARCHAR;
BEGIN
    -- Remove all non-digits
    cleaned := regexp_replace(phone, '[^0-9]', '', 'g');

    -- Handle Russian numbers
    IF length(cleaned) = 11 AND (left(cleaned, 1) = '7' OR left(cleaned, 1) = '8') THEN
        cleaned := '7' || right(cleaned, 10);
    ELSIF length(cleaned) = 10 THEN
        cleaned := '7' || cleaned;
    END IF;

    RETURN '+' || cleaned;
END;
$$ LANGUAGE plpgsql IMMUTABLE;

-- Normalize telegram username
CREATE OR REPLACE FUNCTION normalize_telegram(username VARCHAR)
RETURNS VARCHAR AS $$
BEGIN
    -- Remove @ if present, lowercase
    RETURN lower(regexp_replace(username, '^@', ''));
END;
$$ LANGUAGE plpgsql IMMUTABLE;

-- Update creative stats trigger
CREATE OR REPLACE FUNCTION update_creative_stats()
RETURNS TRIGGER AS $$
BEGIN
    UPDATE creatives
    SET
        usage_count = usage_count + 1,
        success_count = success_count + CASE WHEN NEW.outcome = 'converted' THEN 1 ELSE 0 END,
        success_rate = CASE
            WHEN usage_count + 1 > 0
            THEN (success_count + CASE WHEN NEW.outcome = 'converted' THEN 1 ELSE 0 END)::FLOAT / (usage_count + 1)
            ELSE 0
        END,
        updated_at = NOW()
    WHERE id = NEW.creative_id;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_update_creative_stats
AFTER INSERT ON creative_usage_log
FOR EACH ROW
EXECUTE FUNCTION update_creative_stats();

-- ============================================
-- 9. VIEWS FOR ANALYTICS
-- ============================================

-- Creative performance view
CREATE OR REPLACE VIEW v_creative_performance AS
SELECT
    c.id,
    c.code,
    c.name,
    c.type,
    c.purpose,
    c.ab_group,
    c.usage_count,
    c.success_count,
    c.success_rate,
    c.tenant_id,
    COUNT(DISTINCT cul.client_id) as unique_clients,
    COUNT(CASE WHEN cul.outcome = 'clicked' THEN 1 END) as click_count,
    COUNT(CASE WHEN cul.outcome = 'converted' THEN 1 END) as conversion_count
FROM creatives c
LEFT JOIN creative_usage_log cul ON cul.creative_id = c.id
GROUP BY c.id;

-- A/B Test results summary view
CREATE OR REPLACE VIEW v_ab_test_summary AS
SELECT
    t.id as test_id,
    t.name as test_name,
    t.purpose,
    t.status,
    r.variant,
    COUNT(*) as exposures,
    COUNT(CASE WHEN r.converted THEN 1 END) as conversions,
    ROUND(COUNT(CASE WHEN r.converted THEN 1 END)::NUMERIC / NULLIF(COUNT(*), 0) * 100, 2) as conversion_rate,
    AVG(r.conversion_value) as avg_value,
    t.tenant_id
FROM ab_tests t
LEFT JOIN ab_test_results r ON r.ab_test_id = t.id
GROUP BY t.id, t.name, t.purpose, t.status, r.variant, t.tenant_id;

-- ============================================
-- 10. COMMENTS
-- ============================================

COMMENT ON TABLE contacts IS 'All contact methods for clients (phone, telegram, whatsapp, email, vk)';
COMMENT ON TABLE client_contacts IS 'Many-to-many relationship between clients and contacts';
COMMENT ON TABLE enrichment_actions IS 'Log of attempts to get additional contact info from clients';
COMMENT ON TABLE creatives IS 'Templates and content for enrichment (texts, links, forms)';
COMMENT ON TABLE ab_tests IS 'A/B/Z test definitions and configuration';
COMMENT ON TABLE ab_test_results IS 'Individual exposures and outcomes for A/B tests';
COMMENT ON TABLE creative_usage_log IS 'Detailed log of creative usage for analytics';

COMMENT ON COLUMN creatives.ab_group IS 'Variant group: A, B, C for test variants, Z for control';
COMMENT ON COLUMN creatives.weight IS 'Selection weight for weighted random selection (higher = more likely)';
COMMENT ON COLUMN ab_tests.traffic_split IS 'Percentage of traffic to each variant, e.g., {"A": 45, "B": 45, "Z": 10}';
COMMENT ON COLUMN ab_tests.confidence_level IS 'Required statistical confidence to declare winner (0.95 = 95%)';
