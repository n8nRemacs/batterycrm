-- ============================================================================
-- MIGRATION: RBAC System (Role-Based Access Control)
-- ============================================================================
-- Version: 003
-- Created: 2026-01-04
-- Description: 4-level permission system (Domain → Vertical → Tenant → Operator)
-- ============================================================================

BEGIN;

-- ============================================================================
-- 1. PERMISSION SCOPES (levels)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_permission_scopes (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    level INT NOT NULL, -- 1=domain (highest), 2=vertical, 3=tenant, 4=operator
    description TEXT,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

INSERT INTO elo_permission_scopes (code, name, level, description) VALUES
('domain', 'Domain', 1, 'Full system access, can configure everything'),
('vertical', 'Vertical', 2, 'Vertical-level access, delegated by domain admin'),
('tenant', 'Tenant', 3, 'Tenant-level access: services, billing, operators'),
('operator', 'Operator', 4, 'Operator-level access: dialogs, messages');


-- ============================================================================
-- 2. RESOURCES (what can be accessed)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_resources (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(30) NOT NULL, -- system, config, data, billing
    min_scope_level INT NOT NULL DEFAULT 3, -- minimum scope level that can access
    description TEXT,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

INSERT INTO elo_resources (code, name, category, min_scope_level, description) VALUES
-- System resources (domain only)
('system.domains', 'Domains', 'system', 1, 'Manage domains'),
('system.verticals', 'Verticals', 'system', 1, 'Manage verticals'),
('system.global_config', 'Global Config', 'system', 1, 'Global system configuration'),
('system.prompts', 'AI Prompts', 'system', 1, 'Manage AI prompts'),
('system.behavior_types', 'Behavior Types', 'system', 1, 'Funnel behavior types'),
('system.executor_types', 'Executor Types', 'system', 1, 'Stage executor types'),

-- Vertical config (domain + vertical)
('config.funnel_stages', 'Funnel Stages', 'config', 2, 'Configure funnel stages'),
('config.context_types', 'Context Types', 'config', 2, 'Configure context extraction'),
('config.intent_types', 'Intent Types', 'config', 2, 'Configure intent detection'),
('config.price_rules', 'Price Rules', 'config', 2, 'Configure pricing rules'),

-- Tenant management (domain + vertical + tenant)
('tenant.settings', 'Tenant Settings', 'config', 3, 'Tenant settings'),
('tenant.channels', 'Channel Accounts', 'config', 3, 'Manage channel accounts'),
('tenant.operators', 'Operators', 'config', 3, 'Manage operators'),
('tenant.billing', 'Billing', 'billing', 3, 'View billing, payments'),

-- Data access (all levels)
('data.dialogs', 'Dialogs', 'data', 4, 'Access dialogs'),
('data.messages', 'Messages', 'data', 4, 'Access messages'),
('data.clients', 'Clients', 'data', 4, 'Access client data'),
('data.analytics', 'Analytics', 'data', 3, 'View analytics'),
('data.reports', 'Reports', 'data', 3, 'Generate reports'),

-- AI control
('ai.mode_override', 'AI Mode Override', 'config', 3, 'Override AI mode per dialog'),
('ai.generation', 'AI Generation', 'config', 2, 'Configure AI generation settings'),
('ai.extraction', 'AI Extraction', 'config', 2, 'Configure context extraction');


-- ============================================================================
-- 3. ACTIONS (what can be done)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_actions (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    description TEXT,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

INSERT INTO elo_actions (code, name, description) VALUES
('read', 'Read', 'View/read access'),
('create', 'Create', 'Create new records'),
('update', 'Update', 'Modify existing records'),
('delete', 'Delete', 'Delete records'),
('execute', 'Execute', 'Execute actions (send, trigger)'),
('delegate', 'Delegate', 'Delegate permissions to lower level'),
('admin', 'Admin', 'Full admin access including dangerous operations');


-- ============================================================================
-- 4. ROLES
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_roles (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL,
    name VARCHAR(100) NOT NULL,
    scope_id INT NOT NULL REFERENCES elo_permission_scopes(id),

    -- Optional scope binding (null = template role)
    domain_id INT REFERENCES elo_domains(id),
    vertical_id INT REFERENCES elo_verticals(id),
    tenant_id UUID REFERENCES elo_t_tenants(id),

    description TEXT,
    is_system BOOLEAN NOT NULL DEFAULT false, -- system roles can't be deleted
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    UNIQUE(code, domain_id, vertical_id, tenant_id)
);

-- System roles (templates)
INSERT INTO elo_roles (code, name, scope_id, description, is_system) VALUES
-- Domain level
('supervisor', 'Supervisor', 1, 'Full system access, can configure everything', true),
('domain_admin', 'Domain Admin', 1, 'Domain administrator', true),

-- Vertical level
('vertical_admin', 'Vertical Admin', 2, 'Vertical administrator, delegated by domain', true),
('vertical_manager', 'Vertical Manager', 2, 'Vertical manager, limited config access', true),

-- Tenant level
('tenant_owner', 'Tenant Owner', 3, 'Tenant owner, billing + operators', true),
('tenant_admin', 'Tenant Admin', 3, 'Tenant admin, operators only', true),

-- Operator level
('operator', 'Operator', 4, 'Regular operator, dialogs only', true),
('operator_senior', 'Senior Operator', 4, 'Senior operator, can override AI', true);


-- ============================================================================
-- 5. PERMISSIONS (role → resource → actions)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_permissions (
    id SERIAL PRIMARY KEY,
    role_id INT NOT NULL REFERENCES elo_roles(id) ON DELETE CASCADE,
    resource_id INT NOT NULL REFERENCES elo_resources(id) ON DELETE CASCADE,

    -- Actions as array for flexibility
    actions VARCHAR(20)[] NOT NULL DEFAULT '{}',

    -- Conditions (optional JSONB for row-level filtering)
    conditions JSONB DEFAULT NULL,

    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    UNIQUE(role_id, resource_id)
);

-- Supervisor permissions (everything)
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    ARRAY['read', 'create', 'update', 'delete', 'execute', 'delegate', 'admin']
FROM elo_roles r, elo_resources res
WHERE r.code = 'supervisor';

-- Domain Admin (everything except dangerous admin actions)
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    ARRAY['read', 'create', 'update', 'delete', 'execute', 'delegate']
FROM elo_roles r, elo_resources res
WHERE r.code = 'domain_admin';

-- Vertical Admin
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    ARRAY['read', 'create', 'update', 'delete', 'execute']
FROM elo_roles r, elo_resources res
WHERE r.code = 'vertical_admin' AND res.min_scope_level >= 2;

-- Vertical Manager (read + limited update)
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    CASE
        WHEN res.category = 'config' THEN ARRAY['read', 'update']
        ELSE ARRAY['read']
    END
FROM elo_roles r, elo_resources res
WHERE r.code = 'vertical_manager' AND res.min_scope_level >= 2;

-- Tenant Owner
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    CASE
        WHEN res.code IN ('tenant.settings', 'tenant.channels', 'tenant.operators')
            THEN ARRAY['read', 'create', 'update', 'delete']
        WHEN res.code = 'tenant.billing'
            THEN ARRAY['read']
        WHEN res.category = 'data'
            THEN ARRAY['read']
        ELSE ARRAY['read']
    END
FROM elo_roles r, elo_resources res
WHERE r.code = 'tenant_owner' AND res.min_scope_level >= 3;

-- Tenant Admin (no billing)
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    CASE
        WHEN res.code = 'tenant.operators' THEN ARRAY['read', 'create', 'update']
        WHEN res.category = 'data' THEN ARRAY['read']
        ELSE ARRAY['read']
    END
FROM elo_roles r, elo_resources res
WHERE r.code = 'tenant_admin' AND res.min_scope_level >= 3 AND res.code != 'tenant.billing';

-- Operator
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    ARRAY['read', 'execute']
FROM elo_roles r, elo_resources res
WHERE r.code = 'operator' AND res.code IN ('data.dialogs', 'data.messages', 'data.clients');

-- Senior Operator (+ AI override)
INSERT INTO elo_permissions (role_id, resource_id, actions)
SELECT
    r.id,
    res.id,
    ARRAY['read', 'execute', 'update']
FROM elo_roles r, elo_resources res
WHERE r.code = 'operator_senior'
  AND res.code IN ('data.dialogs', 'data.messages', 'data.clients', 'ai.mode_override');


-- ============================================================================
-- 6. USER ROLES (assignment)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_user_roles (
    id SERIAL PRIMARY KEY,

    -- User (operator or special admin user)
    operator_id UUID REFERENCES elo_t_operators(id) ON DELETE CASCADE,
    admin_email VARCHAR(255), -- for non-operator admins (domain/vertical level)

    role_id INT NOT NULL REFERENCES elo_roles(id) ON DELETE CASCADE,

    -- Scope binding (determines what this role applies to)
    scope_type VARCHAR(20) NOT NULL, -- domain, vertical, tenant
    domain_id INT REFERENCES elo_domains(id),
    vertical_id INT REFERENCES elo_verticals(id),
    tenant_id UUID REFERENCES elo_t_tenants(id),

    -- Granted by
    granted_by UUID, -- operator_id who granted this
    granted_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    expires_at TIMESTAMPTZ, -- optional expiration

    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CHECK (operator_id IS NOT NULL OR admin_email IS NOT NULL),
    UNIQUE(operator_id, role_id, scope_type, domain_id, vertical_id, tenant_id)
);

CREATE INDEX idx_user_roles_operator ON elo_user_roles(operator_id) WHERE is_active = true;
CREATE INDEX idx_user_roles_email ON elo_user_roles(admin_email) WHERE is_active = true AND admin_email IS NOT NULL;


-- ============================================================================
-- 7. ADMIN USERS (for domain/vertical level admins)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_admin_users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20),

    -- Default scope
    default_scope_type VARCHAR(20) NOT NULL DEFAULT 'domain',
    default_domain_id INT REFERENCES elo_domains(id),
    default_vertical_id INT REFERENCES elo_verticals(id),

    is_active BOOLEAN NOT NULL DEFAULT true,
    last_login_at TIMESTAMPTZ,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);


-- ============================================================================
-- 8. AUDIT LOG
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_permission_audit (
    id BIGSERIAL PRIMARY KEY,

    -- Who
    actor_type VARCHAR(20) NOT NULL, -- admin, operator
    actor_id VARCHAR(50) NOT NULL, -- admin email or operator_id

    -- What
    action VARCHAR(50) NOT NULL, -- role_granted, role_revoked, permission_checked, access_denied
    resource_code VARCHAR(50),

    -- Target
    target_type VARCHAR(20), -- operator, admin, role
    target_id VARCHAR(50),

    -- Context
    scope_type VARCHAR(20),
    domain_id INT,
    vertical_id INT,
    tenant_id UUID,

    -- Details
    details JSONB,
    ip_address VARCHAR(45),
    user_agent TEXT,

    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX idx_permission_audit_actor ON elo_permission_audit(actor_type, actor_id);
CREATE INDEX idx_permission_audit_created ON elo_permission_audit(created_at DESC);


-- ============================================================================
-- 9. VIEWS
-- ============================================================================

-- Effective permissions view (for quick permission checks)
CREATE OR REPLACE VIEW elo_v_effective_permissions AS
SELECT
    ur.operator_id,
    ur.admin_email,
    ur.scope_type,
    ur.domain_id,
    ur.vertical_id,
    ur.tenant_id,
    r.code AS role_code,
    r.name AS role_name,
    res.code AS resource_code,
    res.name AS resource_name,
    p.actions
FROM elo_user_roles ur
JOIN elo_roles r ON ur.role_id = r.id
JOIN elo_permissions p ON p.role_id = r.id
JOIN elo_resources res ON p.resource_id = res.id
WHERE ur.is_active = true
  AND r.is_active = true
  AND p.is_active = true
  AND res.is_active = true
  AND (ur.expires_at IS NULL OR ur.expires_at > NOW());


-- ============================================================================
-- 10. HELPER FUNCTION: Check Permission
-- ============================================================================

CREATE OR REPLACE FUNCTION elo_check_permission(
    p_operator_id UUID,
    p_admin_email VARCHAR,
    p_resource_code VARCHAR,
    p_action VARCHAR,
    p_scope_type VARCHAR DEFAULT NULL,
    p_domain_id INT DEFAULT NULL,
    p_vertical_id INT DEFAULT NULL,
    p_tenant_id UUID DEFAULT NULL
) RETURNS BOOLEAN AS $$
DECLARE
    v_has_permission BOOLEAN := false;
BEGIN
    SELECT EXISTS (
        SELECT 1 FROM elo_v_effective_permissions ep
        WHERE (
            (p_operator_id IS NOT NULL AND ep.operator_id = p_operator_id)
            OR (p_admin_email IS NOT NULL AND ep.admin_email = p_admin_email)
        )
        AND ep.resource_code = p_resource_code
        AND p_action = ANY(ep.actions)
        AND (p_scope_type IS NULL OR ep.scope_type = p_scope_type)
        AND (p_domain_id IS NULL OR ep.domain_id IS NULL OR ep.domain_id = p_domain_id)
        AND (p_vertical_id IS NULL OR ep.vertical_id IS NULL OR ep.vertical_id = p_vertical_id)
        AND (p_tenant_id IS NULL OR ep.tenant_id IS NULL OR ep.tenant_id = p_tenant_id)
    ) INTO v_has_permission;

    RETURN v_has_permission;
END;
$$ LANGUAGE plpgsql STABLE;


-- ============================================================================
-- 11. SEED: Create supervisor user
-- ============================================================================

-- Create default supervisor
INSERT INTO elo_admin_users (email, password_hash, name, default_scope_type, default_domain_id)
VALUES ('admin@eldoleado.ru', '$2b$12$placeholder_hash_change_me', 'Supervisor', 'domain', 1)
ON CONFLICT (email) DO NOTHING;

-- Grant supervisor role
INSERT INTO elo_user_roles (admin_email, role_id, scope_type, domain_id)
SELECT
    'admin@eldoleado.ru',
    r.id,
    'domain',
    1
FROM elo_roles r
WHERE r.code = 'supervisor'
ON CONFLICT DO NOTHING;


COMMIT;

-- ============================================================================
-- MIGRATION COMPLETE
-- ============================================================================
--
-- Created tables:
--   - elo_permission_scopes (4 levels)
--   - elo_resources (22 resources)
--   - elo_actions (7 actions)
--   - elo_roles (8 system roles)
--   - elo_permissions (role-resource mappings)
--   - elo_user_roles (user-role assignments)
--   - elo_admin_users (domain/vertical admins)
--   - elo_permission_audit (audit log)
--
-- Created views:
--   - elo_v_effective_permissions
--
-- Created functions:
--   - elo_check_permission()
--
-- Hierarchy:
--   Domain (supervisor) → Vertical (admin) → Tenant (owner) → Operator
--
-- ============================================================================
