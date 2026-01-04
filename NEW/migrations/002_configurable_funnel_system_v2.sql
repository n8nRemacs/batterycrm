-- ============================================================================
-- MIGRATION: Configurable Funnel System v2
-- ============================================================================
-- Version: 002
-- Created: 2026-01-04
-- Description: Fully configurable funnel system (fixed for existing schema)
-- Note: Uses elo_executor_types instead of conflicting with elo_action_types
-- ============================================================================

BEGIN;

-- ============================================================================
-- 1. BEHAVIOR TYPES
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_behavior_types (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    action_template JSONB NOT NULL DEFAULT '{}',
    default_config JSONB NOT NULL DEFAULT '{}',
    is_system BOOLEAN NOT NULL DEFAULT false,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_behavior_types IS 'Behavior templates for funnel stages';

-- Insert base behavior types (only if table was just created)
INSERT INTO elo_behavior_types (code, name, description, action_template, default_config, is_system)
SELECT * FROM (VALUES
    ('collect_iterative', 'Iterative Collection',
     'Collect required fields through conversation iterations',
     '{"on_enter": [{"action": "check_completion", "next_if_complete": "auto_advance"}], "on_message": [{"action": "extract_context"}, {"action": "check_completion", "next_if_complete": "auto_advance"}, {"action": "generate_response", "template": "ask_missing_fields"}]}'::jsonb,
     '{"max_iterations": 5, "timeout_minutes": 30, "completion_threshold": 1.0}'::jsonb,
     true),

    ('collect_batch', 'Batch Collection',
     'Collect all required fields in one structured message',
     '{"on_enter": [{"action": "generate_response", "template": "ask_all_fields"}], "on_message": [{"action": "extract_context"}, {"action": "check_completion", "next_if_complete": "auto_advance"}]}'::jsonb,
     '{"max_iterations": 3}'::jsonb,
     true),

    ('present_and_confirm', 'Present and Confirm',
     'Present information and wait for confirmation',
     '{"on_enter": [{"action": "build_presentation"}, {"action": "generate_response", "template": "present_info"}], "on_message": [{"action": "detect_intent"}, {"action": "route_by_intent"}]}'::jsonb,
     '{"allow_negotiation": true, "max_negotiation_rounds": 2}'::jsonb,
     true),

    ('wait_external', 'Wait for External',
     'Wait for external event',
     '{"on_enter": [{"action": "generate_response", "template": "wait_instructions"}], "on_external_event": [{"action": "verify_event"}, {"action": "advance_if_valid"}]}'::jsonb,
     '{"timeout_hours": 24, "reminder_interval_hours": 4}'::jsonb,
     true),

    ('terminal_success', 'Terminal Success',
     'Dialog successfully completed',
     '{"on_enter": [{"action": "generate_response", "template": "success_message"}, {"action": "close_dialog", "status": "completed"}]}'::jsonb,
     '{}'::jsonb,
     true),

    ('terminal_cancelled', 'Terminal Cancelled',
     'Dialog cancelled',
     '{"on_enter": [{"action": "generate_response", "template": "cancellation_message"}, {"action": "close_dialog", "status": "cancelled"}]}'::jsonb,
     '{}'::jsonb,
     true),

    ('escalate', 'Escalate to Operator',
     'Escalate dialog to human operator',
     '{"on_enter": [{"action": "notify_operator", "priority": "high"}, {"action": "generate_response", "template": "escalation_message"}], "on_message": [{"action": "forward_to_operator"}]}'::jsonb,
     '{"auto_return_after_hours": 24}'::jsonb,
     true)
) AS v(code, name, description, action_template, default_config, is_system)
WHERE NOT EXISTS (SELECT 1 FROM elo_behavior_types LIMIT 1);


-- ============================================================================
-- 2. CONDITION OPERATORS
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_condition_operators (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    evaluator_type VARCHAR(20) NOT NULL DEFAULT 'expression',
    evaluator_code TEXT,
    input_schema JSONB NOT NULL DEFAULT '{}',
    operand_count INT NOT NULL DEFAULT 2,
    is_system BOOLEAN NOT NULL DEFAULT false,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CHECK (evaluator_type IN ('expression', 'sql', 'javascript', 'python', 'workflow'))
);

COMMENT ON TABLE elo_condition_operators IS 'Operators for evaluating stage transition conditions';

-- Insert base operators
INSERT INTO elo_condition_operators (code, name, description, evaluator_type, evaluator_code, operand_count, is_system)
SELECT * FROM (VALUES
    ('eq', 'Equals', 'Field equals value', 'expression', '${field} == ${value}', 2, true),
    ('neq', 'Not Equals', 'Field not equals value', 'expression', '${field} != ${value}', 2, true),
    ('gt', 'Greater Than', 'Field greater than value', 'expression', '${field} > ${value}', 2, true),
    ('gte', 'Greater Than or Equal', 'Field >= value', 'expression', '${field} >= ${value}', 2, true),
    ('lt', 'Less Than', 'Field less than value', 'expression', '${field} < ${value}', 2, true),
    ('lte', 'Less Than or Equal', 'Field <= value', 'expression', '${field} <= ${value}', 2, true),
    ('contains', 'Contains', 'Field contains substring', 'expression', '${field}.includes(${value})', 2, true),
    ('starts_with', 'Starts With', 'Field starts with value', 'expression', '${field}.startsWith(${value})', 2, true),
    ('exists', 'Exists', 'Field exists and is not null', 'expression', '${field} !== null && ${field} !== undefined', 1, true),
    ('is_empty', 'Is Empty', 'Field is null or empty', 'expression', '${field} === null || ${field} === undefined || ${field} === ""', 1, true),
    ('in', 'In List', 'Field value is in list', 'expression', '${list}.includes(${field})', 2, true),
    ('not_in', 'Not In List', 'Field value is not in list', 'expression', '!${list}.includes(${field})', 2, true),
    ('and', 'AND', 'All conditions must be true', 'expression', '${conditions}.every(c => c)', -1, true),
    ('or', 'OR', 'At least one condition must be true', 'expression', '${conditions}.some(c => c)', -1, true),
    ('not', 'NOT', 'Negate condition', 'expression', '!${condition}', 1, true),
    ('fields_complete', 'Fields Complete', 'Required fields are filled', 'expression', '${required_fields}.every(f => context[f] !== null)', 1, true),
    ('completion_ratio', 'Completion Ratio', 'Completion ratio >= threshold', 'expression', '(${filled_count} / ${total_count}) >= ${threshold}', 3, true),
    ('intent_is', 'Intent Is', 'Detected intent matches', 'expression', '${detected_intent} === ${expected_intent}', 2, true),
    ('intent_in', 'Intent In', 'Detected intent is one of list', 'expression', '${intent_list}.includes(${detected_intent})', 2, true),
    ('max_iterations', 'Max Iterations Reached', 'Iteration count >= max', 'expression', '${iteration_count} >= ${max_iterations}', 2, true)
) AS v(code, name, description, evaluator_type, evaluator_code, operand_count, is_system)
WHERE NOT EXISTS (SELECT 1 FROM elo_condition_operators LIMIT 1);


-- ============================================================================
-- 3. EXECUTOR TYPES (new table, not conflicting with elo_action_types)
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_executor_types (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    executor_type VARCHAR(20) NOT NULL DEFAULT 'internal',
    executor_ref VARCHAR(255),
    config_schema JSONB NOT NULL DEFAULT '{}',
    default_config JSONB NOT NULL DEFAULT '{}',
    allows_parallel BOOLEAN NOT NULL DEFAULT true,
    is_system BOOLEAN NOT NULL DEFAULT false,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CHECK (executor_type IN ('internal', 'workflow', 'http', 'mcp'))
);

COMMENT ON TABLE elo_executor_types IS 'Executor types for stage actions (extends elo_action_types)';

-- Insert base executor types
INSERT INTO elo_executor_types (code, name, description, executor_type, executor_ref, allows_parallel, is_system)
SELECT * FROM (VALUES
    ('extract_context', 'Extract Context', 'Extract context from message using AI', 'workflow', 'ELO_AI_Extract', true, true),
    ('update_context', 'Update Context', 'Update dialog context with new values', 'internal', NULL, true, true),
    ('check_completion', 'Check Completion', 'Check if required fields are complete', 'internal', NULL, true, true),
    ('generate_response', 'Generate Response', 'Generate AI response using template', 'workflow', 'ELO_Response_Generator', false, true),
    ('send_message', 'Send Message', 'Send message to client via channel', 'workflow', 'ELO_Out_Router', false, true),
    ('advance_stage', 'Advance Stage', 'Move to next stage in funnel', 'internal', NULL, false, true),
    ('rollback_stage', 'Rollback Stage', 'Return to previous stage', 'internal', NULL, false, true),
    ('notify_operator', 'Notify Operator', 'Send notification to operator', 'workflow', 'ELO_Operator_Notify', true, true),
    ('escalate', 'Escalate', 'Escalate dialog to human operator', 'internal', NULL, false, true),
    ('forward_to_operator', 'Forward to Operator', 'Forward message to operator', 'internal', NULL, false, true),
    ('close_dialog', 'Close Dialog', 'Close dialog with specified status', 'internal', NULL, false, true),
    ('detect_intent', 'Detect Intent', 'Detect user intent from message', 'workflow', 'ELO_Intent_Detector', true, true),
    ('write_to_graph', 'Write to Graph', 'Write extracted data to Neo4j', 'workflow', 'ELO_Core_Graph_Writer', true, true),
    ('send_reminder', 'Send Reminder', 'Send reminder message', 'internal', NULL, false, true),
    ('route_by_intent', 'Route by Intent', 'Route based on detected intent', 'internal', NULL, false, true),
    ('call_mcp', 'Call MCP', 'Call external MCP service', 'mcp', NULL, true, true),
    ('call_http', 'Call HTTP', 'Make HTTP request', 'http', NULL, true, true)
) AS v(code, name, description, executor_type, executor_ref, allows_parallel, is_system)
WHERE NOT EXISTS (SELECT 1 FROM elo_executor_types LIMIT 1);


-- ============================================================================
-- 4. EVENT HANDLERS
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_event_handlers (
    id SERIAL PRIMARY KEY,
    event_type VARCHAR(50) NOT NULL,
    handler_name VARCHAR(100) NOT NULL,
    scope VARCHAR(20) NOT NULL DEFAULT 'global',
    scope_id VARCHAR(50),
    executor_type_id INT REFERENCES elo_executor_types(id),
    action_config JSONB NOT NULL DEFAULT '{}',
    priority INT NOT NULL DEFAULT 100,
    conditions JSONB DEFAULT NULL,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CHECK (event_type IN (
        'max_iterations_reached', 'timeout_reached', 'completion_threshold_met',
        'escalation_requested', 'intent_not_recognized', 'extraction_failed',
        'validation_failed', 'external_event_received', 'operator_timeout', 'client_inactive'
    )),
    UNIQUE(event_type, scope, scope_id, handler_name)
);

COMMENT ON TABLE elo_event_handlers IS 'Global event handlers for funnel events';

-- Insert default handlers
INSERT INTO elo_event_handlers (event_type, handler_name, scope, executor_type_id, action_config, priority)
SELECT
    v.event_type, v.handler_name, 'global', e.id, v.action_config::jsonb, v.priority
FROM (VALUES
    ('max_iterations_reached', 'default_escalate', 'escalate', '{"reason": "max_iterations_reached", "priority": "high"}', 100),
    ('timeout_reached', 'send_reminder', 'send_reminder', '{"template": "timeout_reminder"}', 50),
    ('timeout_reached', 'close_if_no_response', 'close_dialog', '{"status": "expired", "reason": "no_response"}', 100),
    ('intent_not_recognized', 'ask_clarification', 'generate_response', '{"template": "ask_clarification"}', 50),
    ('client_inactive', 'send_followup', 'send_reminder', '{"template": "followup_inactive"}', 50)
) AS v(event_type, handler_name, executor_code, action_config, priority)
JOIN elo_executor_types e ON e.code = v.executor_code
WHERE NOT EXISTS (SELECT 1 FROM elo_event_handlers LIMIT 1);


-- ============================================================================
-- 5. STAGE CONDITIONS
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_stage_conditions (
    id SERIAL PRIMARY KEY,
    stage_id INT NOT NULL REFERENCES elo_funnel_stages(id) ON DELETE CASCADE,
    target_stage_id INT REFERENCES elo_funnel_stages(id) ON DELETE SET NULL,
    operator_id INT NOT NULL REFERENCES elo_condition_operators(id),
    operands JSONB NOT NULL DEFAULT '{}',
    priority INT NOT NULL DEFAULT 100,
    description TEXT,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_stage_conditions IS 'Conditions for stage transitions';
CREATE INDEX IF NOT EXISTS idx_stage_conditions_stage ON elo_stage_conditions(stage_id) WHERE is_active = true;


-- ============================================================================
-- 6. STAGE ACTIONS
-- ============================================================================

CREATE TABLE IF NOT EXISTS elo_stage_actions (
    id SERIAL PRIMARY KEY,
    stage_id INT NOT NULL REFERENCES elo_funnel_stages(id) ON DELETE CASCADE,
    trigger_event VARCHAR(50) NOT NULL DEFAULT 'on_message',
    executor_type_id INT NOT NULL REFERENCES elo_executor_types(id),
    action_config JSONB NOT NULL DEFAULT '{}',
    execution_order INT NOT NULL DEFAULT 0,
    execution_group INT NOT NULL DEFAULT 0,
    condition_id INT REFERENCES elo_stage_conditions(id),
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CHECK (trigger_event IN ('on_enter', 'on_message', 'on_exit', 'on_timeout', 'on_external'))
);

COMMENT ON TABLE elo_stage_actions IS 'Actions to execute at each funnel stage';
CREATE INDEX IF NOT EXISTS idx_stage_actions_stage_event ON elo_stage_actions(stage_id, trigger_event) WHERE is_active = true;


-- ============================================================================
-- 7. ALTER elo_funnel_stages
-- ============================================================================

ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS behavior_type_id INT REFERENCES elo_behavior_types(id);

ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS stage_config JSONB NOT NULL DEFAULT '{}';

ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS required_context_fields JSONB NOT NULL DEFAULT '[]';

ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS completion_mask BIGINT NOT NULL DEFAULT 0;


-- ============================================================================
-- 8. LINK EXISTING STAGES TO BEHAVIOR TYPES
-- ============================================================================

-- Map existing behavior_type strings to new behavior_type_id
UPDATE elo_funnel_stages fs SET
    behavior_type_id = bt.id
FROM elo_behavior_types bt
WHERE
    (fs.behavior_type = 'COLLECT_REQUIRED' AND bt.code = 'collect_iterative')
    OR (fs.behavior_type = 'SEND_PROMO' AND bt.code = 'present_and_confirm')
    OR (fs.behavior_type = 'CTA_WAIT' AND bt.code = 'wait_external');


-- ============================================================================
-- 9. CREATE VIEWS
-- ============================================================================

CREATE OR REPLACE VIEW elo_v_stage_config_new AS
SELECT
    fs.id AS stage_id,
    fs.code AS stage_code,
    fs.name AS stage_name,
    fs.stage_type,
    fs.sort_order,
    bt.code AS behavior_code,
    bt.name AS behavior_name,
    bt.action_template,
    COALESCE(fs.stage_config, '{}'::jsonb) || COALESCE(bt.default_config, '{}'::jsonb) AS merged_config,
    fs.required_context_fields,
    fs.is_required
FROM elo_funnel_stages fs
LEFT JOIN elo_behavior_types bt ON fs.behavior_type_id = bt.id
WHERE fs.is_active = true;

CREATE OR REPLACE VIEW elo_v_stage_transitions AS
SELECT
    sc.id AS condition_id,
    fs.code AS from_stage,
    ts.code AS to_stage,
    co.code AS operator_code,
    co.evaluator_type,
    co.evaluator_code,
    sc.operands,
    sc.priority,
    sc.description
FROM elo_stage_conditions sc
JOIN elo_funnel_stages fs ON sc.stage_id = fs.id
LEFT JOIN elo_funnel_stages ts ON sc.target_stage_id = ts.id
JOIN elo_condition_operators co ON sc.operator_id = co.id
WHERE sc.is_active = true
ORDER BY fs.sort_order, sc.priority;

CREATE OR REPLACE VIEW elo_v_stage_actions_new AS
SELECT
    sa.id AS action_id,
    fs.code AS stage_code,
    sa.trigger_event,
    et.code AS executor_code,
    et.executor_type,
    et.executor_ref,
    COALESCE(sa.action_config, '{}'::jsonb) || COALESCE(et.default_config, '{}'::jsonb) AS merged_config,
    sa.execution_order,
    sa.execution_group
FROM elo_stage_actions sa
JOIN elo_funnel_stages fs ON sa.stage_id = fs.id
JOIN elo_executor_types et ON sa.executor_type_id = et.id
WHERE sa.is_active = true
ORDER BY fs.sort_order, sa.trigger_event, sa.execution_order;


COMMIT;

-- ============================================================================
-- MIGRATION COMPLETE
-- ============================================================================
--
-- Created tables:
--   - elo_behavior_types (7 behaviors)
--   - elo_condition_operators (20 operators)
--   - elo_executor_types (17 executor types) <- NEW NAME
--   - elo_event_handlers (5 handlers)
--   - elo_stage_conditions
--   - elo_stage_actions
--
-- Modified tables:
--   - elo_funnel_stages (added behavior_type_id, stage_config, etc.)
--
-- Created views:
--   - elo_v_stage_config_new
--   - elo_v_stage_transitions
--   - elo_v_stage_actions_new
--
-- ============================================================================
