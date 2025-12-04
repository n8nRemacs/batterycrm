-- Migration 014: Fingerprints and Short Links for Client Tracking
-- Date: 2025-12-04
-- Purpose: Track browser fingerprints and smart short links for client identification

-- ============================================
-- 1. FINGERPRINTS - Browser fingerprint storage
-- ============================================

CREATE TABLE IF NOT EXISTS fingerprints (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    hash VARCHAR(64) NOT NULL,                    -- SHA-256 hash of fingerprint components
    components JSONB DEFAULT '{}',                -- Raw fingerprint data (canvas, webgl, fonts, etc.)

    -- Metadata
    first_seen TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    last_seen TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    visit_count INTEGER DEFAULT 1,

    -- Tenant isolation
    tenant_id UUID REFERENCES tenants(id),

    UNIQUE(hash, tenant_id)
);

CREATE INDEX idx_fingerprints_hash ON fingerprints(hash);
CREATE INDEX idx_fingerprints_tenant ON fingerprints(tenant_id);
CREATE INDEX idx_fingerprints_last_seen ON fingerprints(last_seen);

-- ============================================
-- 2. CLIENT_FINGERPRINTS - Links clients to fingerprints
-- ============================================

CREATE TABLE IF NOT EXISTS client_fingerprints (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    client_id UUID NOT NULL REFERENCES clients(id) ON DELETE CASCADE,
    fingerprint_id UUID NOT NULL REFERENCES fingerprints(id) ON DELETE CASCADE,

    -- Confidence and source
    confidence FLOAT DEFAULT 1.0,                 -- 0.0-1.0 confidence of link
    linked_via VARCHAR(50) NOT NULL,              -- 'short_link', 'manual', 'auto', 'form_submit'

    -- Metadata
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID REFERENCES tenants(id),

    UNIQUE(client_id, fingerprint_id)
);

CREATE INDEX idx_client_fingerprints_client ON client_fingerprints(client_id);
CREATE INDEX idx_client_fingerprints_fingerprint ON client_fingerprints(fingerprint_id);
CREATE INDEX idx_client_fingerprints_tenant ON client_fingerprints(tenant_id);

-- ============================================
-- 3. SHORT_LINKS - Smart trackable links
-- ============================================

CREATE TABLE IF NOT EXISTS short_links (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    code VARCHAR(8) NOT NULL,                     -- Short code like 'aXf7k'

    -- Target
    target_url VARCHAR(2048) NOT NULL,            -- Where to redirect

    -- Context
    client_id UUID REFERENCES clients(id) ON DELETE SET NULL,  -- For whom created
    appeal_id UUID REFERENCES appeals(id) ON DELETE SET NULL,  -- Related appeal
    channel VARCHAR(50),                          -- Source channel: avito, telegram, whatsapp, vk, sms
    campaign VARCHAR(100),                        -- Optional campaign name

    -- Stats
    click_count INTEGER DEFAULT 0,
    first_click_at TIMESTAMP WITH TIME ZONE,
    last_click_at TIMESTAMP WITH TIME ZONE,

    -- Lifecycle
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    expires_at TIMESTAMP WITH TIME ZONE,          -- NULL = never expires
    is_active BOOLEAN DEFAULT TRUE,

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id),

    UNIQUE(code, tenant_id)
);

CREATE INDEX idx_short_links_code ON short_links(code);
CREATE INDEX idx_short_links_client ON short_links(client_id);
CREATE INDEX idx_short_links_tenant ON short_links(tenant_id);
CREATE INDEX idx_short_links_active ON short_links(is_active) WHERE is_active = TRUE;

-- ============================================
-- 4. FINGERPRINT_VISITS - Visit log with fingerprints
-- ============================================

CREATE TABLE IF NOT EXISTS fingerprint_visits (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    fingerprint_id UUID NOT NULL REFERENCES fingerprints(id) ON DELETE CASCADE,

    -- Visit data
    url VARCHAR(2048),
    referrer VARCHAR(2048),
    short_link_id UUID REFERENCES short_links(id) ON DELETE SET NULL,

    -- Technical
    ip_address INET,
    user_agent TEXT,

    -- Geo (optional, can be enriched later)
    country VARCHAR(2),
    city VARCHAR(100),

    -- Timestamp
    visited_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID REFERENCES tenants(id)
);

CREATE INDEX idx_fingerprint_visits_fingerprint ON fingerprint_visits(fingerprint_id);
CREATE INDEX idx_fingerprint_visits_short_link ON fingerprint_visits(short_link_id);
CREATE INDEX idx_fingerprint_visits_visited_at ON fingerprint_visits(visited_at);
CREATE INDEX idx_fingerprint_visits_tenant ON fingerprint_visits(tenant_id);

-- ============================================
-- 5. CLIENT_MERGES - Merge history for audit
-- ============================================

CREATE TABLE IF NOT EXISTS client_merges (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Merge participants
    master_client_id UUID NOT NULL REFERENCES clients(id),   -- Client that remains
    merged_client_id UUID NOT NULL,                          -- Client that was merged (may be deleted)

    -- Context
    merge_reason VARCHAR(100),                    -- 'same_phone', 'same_fingerprint', 'manual', etc.
    merged_by UUID REFERENCES users(id),          -- Who initiated (NULL = auto)

    -- Data snapshot before merge
    merged_client_data JSONB,                     -- Snapshot of merged client

    -- Timestamp
    merged_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    -- Tenant isolation
    tenant_id UUID NOT NULL REFERENCES tenants(id)
);

CREATE INDEX idx_client_merges_master ON client_merges(master_client_id);
CREATE INDEX idx_client_merges_merged ON client_merges(merged_client_id);
CREATE INDEX idx_client_merges_tenant ON client_merges(tenant_id);

-- ============================================
-- 6. HELPER FUNCTION - Generate short code
-- ============================================

CREATE OR REPLACE FUNCTION generate_short_code(length INTEGER DEFAULT 6)
RETURNS VARCHAR AS $$
DECLARE
    chars VARCHAR := 'abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ23456789';
    result VARCHAR := '';
    i INTEGER;
BEGIN
    FOR i IN 1..length LOOP
        result := result || substr(chars, floor(random() * length(chars) + 1)::integer, 1);
    END LOOP;
    RETURN result;
END;
$$ LANGUAGE plpgsql;

-- ============================================
-- 7. COMMENTS
-- ============================================

COMMENT ON TABLE fingerprints IS 'Browser fingerprints for cross-channel client identification';
COMMENT ON TABLE client_fingerprints IS 'Links between clients and their browser fingerprints';
COMMENT ON TABLE short_links IS 'Trackable short links for client identification from anonymous channels';
COMMENT ON TABLE fingerprint_visits IS 'Log of visits with fingerprint data';
COMMENT ON TABLE client_merges IS 'Audit log of client merge operations';

COMMENT ON COLUMN short_links.channel IS 'Source channel: avito, telegram, whatsapp, vk, sms, email';
COMMENT ON COLUMN client_fingerprints.linked_via IS 'How the link was established: short_link, manual, auto, form_submit';
COMMENT ON COLUMN client_fingerprints.confidence IS 'Confidence score 0.0-1.0 for the client-fingerprint association';
