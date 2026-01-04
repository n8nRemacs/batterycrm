-- Migration 008: Tenant Tools Access
-- Purpose: Per-tenant tool configuration and limits

-- ============================================================================
-- 1. TENANT TOOLS ACCESS
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_t_tenant_tools (
    id SERIAL PRIMARY KEY,
    tenant_id UUID NOT NULL REFERENCES elo_t_tenants(id) ON DELETE CASCADE,
    tool_id INT NOT NULL REFERENCES elo_agent_tools(id) ON DELETE CASCADE,
    is_enabled BOOLEAN DEFAULT true,
    custom_config JSONB DEFAULT '{}',         -- endpoint overrides, auth, etc.
    usage_limit_daily INT DEFAULT NULL,       -- NULL = unlimited
    usage_count_today INT DEFAULT 0,
    last_reset_date DATE DEFAULT CURRENT_DATE,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),
    UNIQUE(tenant_id, tool_id)
);

-- Indexes
CREATE INDEX IF NOT EXISTS idx_tenant_tools_tenant ON elo_t_tenant_tools(tenant_id);
CREATE INDEX IF NOT EXISTS idx_tenant_tools_enabled ON elo_t_tenant_tools(tenant_id, is_enabled) WHERE is_enabled = true;

-- Comment
COMMENT ON TABLE elo_t_tenant_tools IS 'Per-tenant tool access configuration and usage limits';


-- ============================================================================
-- 2. SEED DEFAULT TOOLS FOR EXISTING TENANTS
-- ============================================================================

-- Give all existing tenants access to all active tools (enabled by default)
INSERT INTO elo_t_tenant_tools (tenant_id, tool_id, is_enabled)
SELECT t.id, at.id, true
FROM elo_t_tenants t
CROSS JOIN elo_agent_tools at
WHERE at.is_active = true
ON CONFLICT (tenant_id, tool_id) DO NOTHING;


-- ============================================================================
-- 3. FUNCTION: Reset daily usage counters
-- ============================================================================

CREATE OR REPLACE FUNCTION elo_reset_daily_tool_usage()
RETURNS void AS $$
BEGIN
    UPDATE elo_t_tenant_tools
    SET usage_count_today = 0,
        last_reset_date = CURRENT_DATE
    WHERE last_reset_date < CURRENT_DATE;
END;
$$ LANGUAGE plpgsql;

COMMENT ON FUNCTION elo_reset_daily_tool_usage IS 'Reset daily tool usage counters (call from cron)';


-- ============================================================================
-- 4. FUNCTION: Check and increment tool usage
-- ============================================================================

CREATE OR REPLACE FUNCTION elo_check_tool_access(
    p_tenant_id UUID,
    p_tool_code VARCHAR(50)
)
RETURNS TABLE(
    allowed BOOLEAN,
    reason VARCHAR(100),
    out_tool_id INT
) AS $$
DECLARE
    v_tool_id INT;
    v_is_enabled BOOLEAN;
    v_usage_limit INT;
    v_usage_count INT;
BEGIN
    -- Get tool
    SELECT id INTO v_tool_id FROM elo_agent_tools WHERE code = p_tool_code AND is_active = true;
    IF v_tool_id IS NULL THEN
        RETURN QUERY SELECT false, 'tool_not_found'::VARCHAR(100), NULL::INT;
        RETURN;
    END IF;

    -- Get tenant config
    SELECT tt.is_enabled, tt.usage_limit_daily,
           CASE WHEN tt.last_reset_date < CURRENT_DATE THEN 0 ELSE tt.usage_count_today END
    INTO v_is_enabled, v_usage_limit, v_usage_count
    FROM elo_t_tenant_tools tt
    WHERE tt.tenant_id = p_tenant_id AND tt.tool_id = v_tool_id;

    -- No config = not allowed
    IF v_is_enabled IS NULL THEN
        RETURN QUERY SELECT false, 'tool_not_configured'::VARCHAR(100), v_tool_id;
        RETURN;
    END IF;

    -- Disabled
    IF NOT v_is_enabled THEN
        RETURN QUERY SELECT false, 'tool_disabled'::VARCHAR(100), v_tool_id;
        RETURN;
    END IF;

    -- Check limit
    IF v_usage_limit IS NOT NULL AND v_usage_count >= v_usage_limit THEN
        RETURN QUERY SELECT false, 'daily_limit_exceeded'::VARCHAR(100), v_tool_id;
        RETURN;
    END IF;

    -- Allowed - increment counter (using table alias to avoid ambiguity)
    UPDATE elo_t_tenant_tools ttt
    SET usage_count_today = CASE WHEN ttt.last_reset_date < CURRENT_DATE THEN 1 ELSE ttt.usage_count_today + 1 END,
        last_reset_date = CURRENT_DATE
    WHERE ttt.tenant_id = p_tenant_id AND ttt.tool_id = v_tool_id;

    RETURN QUERY SELECT true, 'ok'::VARCHAR(100), v_tool_id;
END;
$$ LANGUAGE plpgsql;

COMMENT ON FUNCTION elo_check_tool_access IS 'Check if tenant can use a tool and increment usage counter';


-- ============================================================================
-- 5. EXTEND elo_t_tenants.settings WITH AGENT CONFIG SCHEMA
-- ============================================================================

-- Add agent config to settings JSONB (example for existing tenants)
-- This is optional - just documents the expected structure

COMMENT ON COLUMN elo_t_tenants.settings IS 'Tenant settings including agent config. Expected keys:
- ai_mode: auto|assisted|manual
- default_tier: nano|small|optima|pro|expert
- max_tier: maximum allowed tier
- agent_personality: {tone, language, emoji_allowed}
- max_iterations: agent loop limit (default 5)
- monthly_token_limit: billing limit
- debounce_seconds: message debounce time
- working_hours: {start, end}
- currency: RUB|USD|EUR
- timezone: Europe/Moscow
- language: ru|en';


-- ============================================================================
-- MIGRATION COMPLETE
-- ============================================================================
