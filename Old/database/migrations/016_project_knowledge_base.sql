-- Migration 016: Project Knowledge Base
-- Date: 2025-12-04
-- Purpose: Store project structure, components, relations for cross-session context

-- ============================================
-- 1. PROJECT_COMPONENTS - All system components
-- ============================================

CREATE TABLE IF NOT EXISTS project_components (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Identity
    type VARCHAR(50) NOT NULL,                    -- workflow, table, android_activity, android_viewmodel,
                                                  -- android_repository, api_endpoint, mcp_server,
                                                  -- neo4j_node, neo4j_relation, script, doc
    name VARCHAR(255) NOT NULL,                   -- Human-readable name
    code VARCHAR(255),                            -- Technical code/identifier

    -- Location
    file_path VARCHAR(500),                       -- Path to file in repo
    line_start INTEGER,                           -- Start line (for code)
    line_end INTEGER,                             -- End line (for code)

    -- Category/Group
    category VARCHAR(100),                        -- API, Core, In, Out, Tool, TaskWork (for workflows)
                                                  -- ui, data, api, fcm, service (for android)
    subcategory VARCHAR(100),                     -- Additional grouping

    -- Technical details
    tech_stack VARCHAR(100),                      -- kotlin, json, sql, cypher, python, js
    version VARCHAR(50),                          -- Version if applicable

    -- Description
    description TEXT,                             -- What it does
    purpose TEXT,                                 -- Why it exists

    -- Metadata (flexible JSON)
    metadata JSONB DEFAULT '{}',                  -- Any additional data
    -- For workflows: {webhook_path, is_active, tags}
    -- For tables: {schema, row_count_estimate}
    -- For android: {extends, implements}
    -- For api: {method, path, auth_required}

    -- Status
    status VARCHAR(20) DEFAULT 'active',          -- active, deprecated, planned, in_progress
    is_documented BOOLEAN DEFAULT FALSE,

    -- Timestamps
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    last_verified_at TIMESTAMP WITH TIME ZONE,    -- When last confirmed to exist

    -- Unique per type+name
    UNIQUE(type, name)
);

CREATE INDEX idx_project_components_type ON project_components(type);
CREATE INDEX idx_project_components_category ON project_components(category);
CREATE INDEX idx_project_components_status ON project_components(status);
CREATE INDEX idx_project_components_file ON project_components(file_path);

-- ============================================
-- 2. COMPONENT_RELATIONS - Links between components
-- ============================================

CREATE TABLE IF NOT EXISTS component_relations (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Relation
    from_component_id UUID NOT NULL REFERENCES project_components(id) ON DELETE CASCADE,
    to_component_id UUID NOT NULL REFERENCES project_components(id) ON DELETE CASCADE,

    -- Relation type
    relation_type VARCHAR(50) NOT NULL,           -- calls, reads_from, writes_to, triggers,
                                                  -- depends_on, extends, implements, uses,
                                                  -- creates, updates, deletes, references

    -- Details
    description TEXT,
    metadata JSONB DEFAULT '{}',                  -- {method: "POST", field: "appeal_id"}

    -- Strength/confidence
    is_direct BOOLEAN DEFAULT TRUE,               -- Direct vs transitive relation
    confidence FLOAT DEFAULT 1.0,                 -- How sure we are (for auto-detected)

    -- Timestamps
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    verified_at TIMESTAMP WITH TIME ZONE,

    -- No duplicate relations
    UNIQUE(from_component_id, to_component_id, relation_type)
);

CREATE INDEX idx_component_relations_from ON component_relations(from_component_id);
CREATE INDEX idx_component_relations_to ON component_relations(to_component_id);
CREATE INDEX idx_component_relations_type ON component_relations(relation_type);

-- ============================================
-- 3. COMPONENT_FIELDS - Fields/properties of components
-- ============================================

CREATE TABLE IF NOT EXISTS component_fields (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    component_id UUID NOT NULL REFERENCES project_components(id) ON DELETE CASCADE,

    -- Field info
    field_name VARCHAR(255) NOT NULL,
    field_type VARCHAR(100),                      -- string, uuid, integer, jsonb, boolean, etc.
    is_required BOOLEAN DEFAULT FALSE,
    is_primary_key BOOLEAN DEFAULT FALSE,
    is_foreign_key BOOLEAN DEFAULT FALSE,

    -- For FK
    references_component_id UUID REFERENCES project_components(id),
    references_field VARCHAR(255),

    -- Description
    description TEXT,
    default_value TEXT,
    example_value TEXT,

    -- Metadata
    metadata JSONB DEFAULT '{}',                  -- {max_length, enum_values, validation}

    -- Timestamps
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),

    UNIQUE(component_id, field_name)
);

CREATE INDEX idx_component_fields_component ON component_fields(component_id);
CREATE INDEX idx_component_fields_fk ON component_fields(references_component_id);

-- ============================================
-- 4. PROJECT_CHANGELOG - History of changes
-- ============================================

CREATE TABLE IF NOT EXISTS project_changelog (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- What changed
    component_id UUID REFERENCES project_components(id) ON DELETE SET NULL,
    component_type VARCHAR(50),                   -- Backup if component deleted
    component_name VARCHAR(255),                  -- Backup if component deleted

    -- Change details
    change_type VARCHAR(30) NOT NULL,             -- created, updated, deleted, renamed, moved
    change_description TEXT NOT NULL,

    -- Before/After
    old_value JSONB,
    new_value JSONB,

    -- Context
    session_id VARCHAR(100),                      -- Claude session ID
    changed_by VARCHAR(100),                      -- 'claude', 'user', 'auto-sync'
    commit_hash VARCHAR(40),                      -- Git commit if applicable

    -- Timestamp
    changed_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

CREATE INDEX idx_project_changelog_component ON project_changelog(component_id);
CREATE INDEX idx_project_changelog_type ON project_changelog(change_type);
CREATE INDEX idx_project_changelog_date ON project_changelog(changed_at);

-- ============================================
-- 5. PROJECT_SESSIONS - Track work sessions
-- ============================================

CREATE TABLE IF NOT EXISTS project_sessions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Session info
    session_id VARCHAR(100) NOT NULL UNIQUE,      -- External session identifier
    terminal_name VARCHAR(100),                   -- Which terminal/window

    -- Focus
    focus_area VARCHAR(100),                      -- android, backend, database, docs, etc.
    current_task TEXT,

    -- Status
    status VARCHAR(20) DEFAULT 'active',          -- active, completed, abandoned

    -- What was done
    summary TEXT,                                 -- Summary of work done
    components_touched JSONB DEFAULT '[]',        -- Array of component IDs

    -- Timestamps
    started_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    ended_at TIMESTAMP WITH TIME ZONE,
    last_activity_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

CREATE INDEX idx_project_sessions_status ON project_sessions(status);
CREATE INDEX idx_project_sessions_focus ON project_sessions(focus_area);

-- ============================================
-- 6. KNOWLEDGE_SNAPSHOTS - Periodic snapshots
-- ============================================

CREATE TABLE IF NOT EXISTS knowledge_snapshots (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    -- Snapshot info
    snapshot_type VARCHAR(30) NOT NULL,           -- full, incremental
    description TEXT,

    -- Content
    data JSONB NOT NULL,                          -- Full export of knowledge base

    -- Stats at time of snapshot
    stats JSONB DEFAULT '{}',                     -- {components: 150, relations: 300, ...}

    -- Timestamp
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

CREATE INDEX idx_knowledge_snapshots_type ON knowledge_snapshots(snapshot_type);
CREATE INDEX idx_knowledge_snapshots_date ON knowledge_snapshots(created_at);

-- ============================================
-- 7. HELPER VIEWS
-- ============================================

-- Components with relation counts
CREATE OR REPLACE VIEW v_components_summary AS
SELECT
    c.id,
    c.type,
    c.name,
    c.category,
    c.status,
    c.file_path,
    COUNT(DISTINCT rf.id) as outgoing_relations,
    COUNT(DISTINCT rt.id) as incoming_relations,
    COUNT(DISTINCT f.id) as field_count
FROM project_components c
LEFT JOIN component_relations rf ON rf.from_component_id = c.id
LEFT JOIN component_relations rt ON rt.to_component_id = c.id
LEFT JOIN component_fields f ON f.component_id = c.id
GROUP BY c.id;

-- Workflow dependencies
CREATE OR REPLACE VIEW v_workflow_dependencies AS
SELECT
    wf.name as workflow_name,
    wf.category,
    (wf.metadata->>'webhook_path') as webhook_path,
    array_agg(DISTINCT t.name) FILTER (WHERE t.type = 'table') as tables_used,
    array_agg(DISTINCT w2.name) FILTER (WHERE w2.type = 'workflow') as workflows_called
FROM project_components wf
LEFT JOIN component_relations r ON r.from_component_id = wf.id
LEFT JOIN project_components t ON t.id = r.to_component_id
LEFT JOIN project_components w2 ON w2.id = r.to_component_id AND r.relation_type = 'calls'
WHERE wf.type = 'workflow'
GROUP BY wf.id, wf.name, wf.category, wf.metadata;

-- ============================================
-- 8. FUNCTIONS
-- ============================================

-- Add component with auto-timestamp
CREATE OR REPLACE FUNCTION add_component(
    p_type VARCHAR,
    p_name VARCHAR,
    p_category VARCHAR DEFAULT NULL,
    p_file_path VARCHAR DEFAULT NULL,
    p_description TEXT DEFAULT NULL,
    p_metadata JSONB DEFAULT '{}'
) RETURNS UUID AS $$
DECLARE
    v_id UUID;
BEGIN
    INSERT INTO project_components (type, name, category, file_path, description, metadata)
    VALUES (p_type, p_name, p_category, p_file_path, p_description, p_metadata)
    ON CONFLICT (type, name) DO UPDATE SET
        category = COALESCE(EXCLUDED.category, project_components.category),
        file_path = COALESCE(EXCLUDED.file_path, project_components.file_path),
        description = COALESCE(EXCLUDED.description, project_components.description),
        metadata = project_components.metadata || EXCLUDED.metadata,
        updated_at = NOW(),
        last_verified_at = NOW()
    RETURNING id INTO v_id;

    RETURN v_id;
END;
$$ LANGUAGE plpgsql;

-- Add relation between components
CREATE OR REPLACE FUNCTION add_relation(
    p_from_type VARCHAR,
    p_from_name VARCHAR,
    p_to_type VARCHAR,
    p_to_name VARCHAR,
    p_relation_type VARCHAR,
    p_description TEXT DEFAULT NULL
) RETURNS UUID AS $$
DECLARE
    v_from_id UUID;
    v_to_id UUID;
    v_rel_id UUID;
BEGIN
    SELECT id INTO v_from_id FROM project_components WHERE type = p_from_type AND name = p_from_name;
    SELECT id INTO v_to_id FROM project_components WHERE type = p_to_type AND name = p_to_name;

    IF v_from_id IS NULL OR v_to_id IS NULL THEN
        RAISE EXCEPTION 'Component not found: % % or % %', p_from_type, p_from_name, p_to_type, p_to_name;
    END IF;

    INSERT INTO component_relations (from_component_id, to_component_id, relation_type, description)
    VALUES (v_from_id, v_to_id, p_relation_type, p_description)
    ON CONFLICT (from_component_id, to_component_id, relation_type) DO UPDATE SET
        description = COALESCE(EXCLUDED.description, component_relations.description),
        verified_at = NOW()
    RETURNING id INTO v_rel_id;

    RETURN v_rel_id;
END;
$$ LANGUAGE plpgsql;

-- Log change
CREATE OR REPLACE FUNCTION log_component_change(
    p_component_id UUID,
    p_change_type VARCHAR,
    p_description TEXT,
    p_session_id VARCHAR DEFAULT NULL,
    p_changed_by VARCHAR DEFAULT 'claude'
) RETURNS UUID AS $$
DECLARE
    v_id UUID;
    v_comp RECORD;
BEGIN
    SELECT type, name INTO v_comp FROM project_components WHERE id = p_component_id;

    INSERT INTO project_changelog (component_id, component_type, component_name, change_type, change_description, session_id, changed_by)
    VALUES (p_component_id, v_comp.type, v_comp.name, p_change_type, p_description, p_session_id, p_changed_by)
    RETURNING id INTO v_id;

    RETURN v_id;
END;
$$ LANGUAGE plpgsql;

-- ============================================
-- 9. COMMENTS
-- ============================================

COMMENT ON TABLE project_components IS 'All components of the Eldoleado project: workflows, tables, android classes, APIs, etc.';
COMMENT ON TABLE component_relations IS 'Relationships between components: calls, reads, writes, depends';
COMMENT ON TABLE component_fields IS 'Fields/properties of components (table columns, API params, etc.)';
COMMENT ON TABLE project_changelog IS 'History of changes to components';
COMMENT ON TABLE project_sessions IS 'Work sessions tracking for multi-terminal development';
COMMENT ON TABLE knowledge_snapshots IS 'Periodic full exports of the knowledge base';

COMMENT ON COLUMN project_components.type IS 'Component types: workflow, table, android_activity, android_viewmodel, android_repository, api_endpoint, mcp_server, neo4j_node, neo4j_relation, script, doc';
COMMENT ON COLUMN component_relations.relation_type IS 'Relation types: calls, reads_from, writes_to, triggers, depends_on, extends, implements, uses, creates, updates, deletes, references';
