-- Migration 004: IP Nodes for reverse-engineered channels
-- Manages IP pool for WhatsApp, Telegram User, VK User, MAX, Avito
--
-- Logic: 1 tenant prefers 1 IP, but can overflow to other IPs
-- Each IP can have max N sessions per channel type

-- ============================================================================
-- 1. IP Nodes table (IP pool)
-- ============================================================================
CREATE TABLE IF NOT EXISTS elo_ip_nodes (
    id SERIAL PRIMARY KEY,

    -- Server info
    server_name VARCHAR(50) NOT NULL,           -- 'MessagerOne', 'MessagerTwo'
    server_host VARCHAR(100) NOT NULL,          -- '155.212.221.189' (for SSH/management)
    ip_address INET NOT NULL,                   -- Actual IP for binding

    -- Service ports on this IP
    port_whatsapp INTEGER DEFAULT 8769,
    port_telegram_user INTEGER DEFAULT 8767,
    port_vk_user INTEGER DEFAULT 8766,
    port_max INTEGER DEFAULT 8768,
    port_avito INTEGER DEFAULT 8765,

    -- Limits per channel type
    max_sessions_per_type INTEGER DEFAULT 10,   -- Max 10 WhatsApp, 10 MAX, etc per IP

    -- Status
    status VARCHAR(20) DEFAULT 'active',        -- active, maintenance, offline, banned
    notes TEXT,

    -- Timestamps
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    CONSTRAINT elo_ip_nodes_ip_unique UNIQUE(ip_address)
);

-- Index for finding available nodes
CREATE INDEX idx_elo_ip_nodes_status ON elo_ip_nodes(status);
CREATE INDEX idx_elo_ip_nodes_server ON elo_ip_nodes(server_host);

-- ============================================================================
-- 2. Add ip_node_id to tenants (preferred IP)
-- ============================================================================
ALTER TABLE elo_t_tenants
ADD COLUMN IF NOT EXISTS ip_node_id INTEGER REFERENCES elo_ip_nodes(id);

CREATE INDEX idx_elo_t_tenants_ip_node ON elo_t_tenants(ip_node_id);

-- ============================================================================
-- 3. Add ip_node_id to channel_accounts (actual IP for each channel)
-- ============================================================================
ALTER TABLE elo_t_channel_accounts
ADD COLUMN IF NOT EXISTS ip_node_id INTEGER REFERENCES elo_ip_nodes(id),
ADD COLUMN IF NOT EXISTS session_id VARCHAR(100),      -- Session ID on the MCP server
ADD COLUMN IF NOT EXISTS session_status VARCHAR(20) DEFAULT 'pending',  -- pending, qr, connected, disconnected
ADD COLUMN IF NOT EXISTS is_official BOOLEAN DEFAULT false;  -- Official API = no IP needed

CREATE INDEX idx_elo_t_channel_accounts_ip_node ON elo_t_channel_accounts(ip_node_id);
CREATE INDEX idx_elo_t_channel_accounts_session ON elo_t_channel_accounts(session_status);

-- ============================================================================
-- 4. View: IP usage statistics
-- ============================================================================
CREATE OR REPLACE VIEW elo_v_ip_usage AS
SELECT
    n.id as node_id,
    n.server_name,
    n.ip_address,
    n.status,
    n.max_sessions_per_type,

    -- Count per channel type
    COUNT(CASE WHEN c.code = 'whatsapp' THEN 1 END) as whatsapp_count,
    COUNT(CASE WHEN c.code = 'telegram' AND NOT COALESCE(ca.is_official, false) THEN 1 END) as telegram_user_count,
    COUNT(CASE WHEN c.code = 'vk' AND NOT COALESCE(ca.is_official, false) THEN 1 END) as vk_user_count,
    COUNT(CASE WHEN c.code = 'max' THEN 1 END) as max_count,
    COUNT(CASE WHEN c.code = 'avito' THEN 1 END) as avito_count,

    -- Total sessions
    COUNT(ca.id) as total_sessions,

    -- Unique tenants on this IP
    COUNT(DISTINCT ca.tenant_id) as tenant_count

FROM elo_ip_nodes n
LEFT JOIN elo_t_channel_accounts ca ON ca.ip_node_id = n.id AND ca.is_active = true
LEFT JOIN elo_channels c ON ca.channel_id = c.id
GROUP BY n.id, n.server_name, n.ip_address, n.status, n.max_sessions_per_type;

-- ============================================================================
-- 5. Function: Find best IP for tenant + channel type
-- ============================================================================
CREATE OR REPLACE FUNCTION elo_find_ip_for_channel(
    p_tenant_id UUID,
    p_channel_code VARCHAR(20)
) RETURNS INTEGER AS $$
DECLARE
    v_current_node_id INTEGER;
    v_server_host VARCHAR(100);
    v_result_node_id INTEGER;
    v_channel_id INTEGER;
BEGIN
    -- Get channel_id
    SELECT id INTO v_channel_id FROM elo_channels WHERE code = p_channel_code;

    -- 1. Check if tenant already has preferred IP with free slot
    SELECT t.ip_node_id, n.server_host
    INTO v_current_node_id, v_server_host
    FROM elo_t_tenants t
    LEFT JOIN elo_ip_nodes n ON t.ip_node_id = n.id
    WHERE t.id = p_tenant_id;

    IF v_current_node_id IS NOT NULL THEN
        -- Check if current IP has free slot for this channel type
        IF (
            SELECT COUNT(*)
            FROM elo_t_channel_accounts ca
            WHERE ca.ip_node_id = v_current_node_id
              AND ca.channel_id = v_channel_id
              AND ca.is_active = true
        ) < (SELECT max_sessions_per_type FROM elo_ip_nodes WHERE id = v_current_node_id) THEN
            RETURN v_current_node_id;
        END IF;

        -- 2. Try another IP on the same server
        SELECT n.id INTO v_result_node_id
        FROM elo_ip_nodes n
        WHERE n.server_host = v_server_host
          AND n.id != v_current_node_id
          AND n.status = 'active'
          AND (
              SELECT COUNT(*)
              FROM elo_t_channel_accounts ca
              WHERE ca.ip_node_id = n.id
                AND ca.channel_id = v_channel_id
                AND ca.is_active = true
          ) < n.max_sessions_per_type
        ORDER BY (
            SELECT COUNT(*) FROM elo_t_channel_accounts ca WHERE ca.ip_node_id = n.id
        ) ASC
        LIMIT 1;

        IF v_result_node_id IS NOT NULL THEN
            RETURN v_result_node_id;
        END IF;
    END IF;

    -- 3. Find any IP with free slot (prefer less loaded)
    SELECT n.id INTO v_result_node_id
    FROM elo_ip_nodes n
    WHERE n.status = 'active'
      AND (
          SELECT COUNT(*)
          FROM elo_t_channel_accounts ca
          WHERE ca.ip_node_id = n.id
            AND ca.channel_id = v_channel_id
            AND ca.is_active = true
      ) < n.max_sessions_per_type
    ORDER BY (
        SELECT COUNT(*) FROM elo_t_channel_accounts ca WHERE ca.ip_node_id = n.id
    ) ASC
    LIMIT 1;

    RETURN v_result_node_id;
END;
$$ LANGUAGE plpgsql;

-- ============================================================================
-- 6. Trigger: Auto-update tenant's preferred IP
-- ============================================================================
CREATE OR REPLACE FUNCTION elo_update_tenant_preferred_ip()
RETURNS TRIGGER AS $$
BEGIN
    -- If tenant doesn't have preferred IP yet, set it
    IF NEW.ip_node_id IS NOT NULL THEN
        UPDATE elo_t_tenants
        SET ip_node_id = NEW.ip_node_id,
            updated_at = NOW()
        WHERE id = NEW.tenant_id
          AND ip_node_id IS NULL;
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS trg_elo_update_tenant_ip ON elo_t_channel_accounts;
CREATE TRIGGER trg_elo_update_tenant_ip
    AFTER INSERT OR UPDATE OF ip_node_id ON elo_t_channel_accounts
    FOR EACH ROW
    EXECUTE FUNCTION elo_update_tenant_preferred_ip();

-- ============================================================================
-- 7. Updated_at trigger for ip_nodes
-- ============================================================================
CREATE OR REPLACE FUNCTION elo_update_timestamp()
RETURNS TRIGGER AS $$
BEGIN
    NEW.updated_at = NOW();
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS trg_elo_ip_nodes_updated ON elo_ip_nodes;
CREATE TRIGGER trg_elo_ip_nodes_updated
    BEFORE UPDATE ON elo_ip_nodes
    FOR EACH ROW
    EXECUTE FUNCTION elo_update_timestamp();

-- ============================================================================
-- Done
-- ============================================================================
COMMENT ON TABLE elo_ip_nodes IS 'IP pool for reverse-engineered channel APIs (WhatsApp, MAX, Telegram User, etc)';
COMMENT ON COLUMN elo_ip_nodes.max_sessions_per_type IS 'Max sessions of each channel type per IP (e.g., 10 WhatsApp + 10 MAX + 10 TG per IP)';
COMMENT ON FUNCTION elo_find_ip_for_channel IS 'Find best IP for tenant channel: 1) current IP, 2) same server, 3) any server';
