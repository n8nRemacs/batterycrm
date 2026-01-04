-- ============================================================================
-- MIGRATION: Configurable Funnel System
-- ============================================================================
-- Version: 001
-- Created: 2026-01-04
-- Description: Fully configurable funnel system without hardcoded logic
-- Principle: "Database knows WHAT to do, LLM knows HOW to say it"
-- ============================================================================

BEGIN;

-- ============================================================================
-- 1. BEHAVIOR TYPES
-- ============================================================================
-- Templates for stage behavior. No hardcoding - all configurable.

CREATE TABLE IF NOT EXISTS elo_behavior_types (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    description TEXT,

    -- Action template: what happens when stage is active
    -- Example: { "on_enter": [...], "on_message": [...], "on_timeout": [...] }
    action_template JSONB NOT NULL DEFAULT '{}',

    -- Default configuration for this behavior type
    -- Can be overridden at stage level via stage_config
    default_config JSONB NOT NULL DEFAULT '{}',

    -- Metadata
    is_system BOOLEAN NOT NULL DEFAULT false,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_behavior_types IS 'Behavior templates for funnel stages';
COMMENT ON COLUMN elo_behavior_types.action_template IS 'JSONB template defining actions for events (on_enter, on_message, on_timeout, etc.)';
COMMENT ON COLUMN elo_behavior_types.default_config IS 'Default configuration that can be overridden at stage level';

-- Insert base behavior types
INSERT INTO elo_behavior_types (code, name, description, action_template, default_config, is_system) VALUES

-- Collect data iteratively until conditions met
('collect_iterative', 'Iterative Collection',
 'Collect required fields through conversation iterations',
 '{
   "on_enter": [
     {"action": "check_completion", "next_if_complete": "auto_advance"}
   ],
   "on_message": [
     {"action": "extract_context"},
     {"action": "check_completion", "next_if_complete": "auto_advance"},
     {"action": "check_iterations", "next_if_max": "handle_max_iterations"},
     {"action": "generate_response", "template": "ask_missing_fields"}
   ],
   "on_timeout": [
     {"action": "send_reminder"}
   ]
 }',
 '{
   "max_iterations": 5,
   "timeout_minutes": 30,
   "completion_threshold": 1.0
 }',
 true),

-- Collect all data in single structured query
('collect_batch', 'Batch Collection',
 'Collect all required fields in one structured message',
 '{
   "on_enter": [
     {"action": "generate_response", "template": "ask_all_fields"}
   ],
   "on_message": [
     {"action": "extract_context"},
     {"action": "check_completion", "next_if_complete": "auto_advance"},
     {"action": "generate_response", "template": "clarify_missing"}
   ]
 }',
 '{
   "max_iterations": 3
 }',
 true),

-- Present information and wait for acknowledgment
('present_and_confirm', 'Present and Confirm',
 'Present information (price, diagnosis) and wait for confirmation',
 '{
   "on_enter": [
     {"action": "build_presentation"},
     {"action": "generate_response", "template": "present_info"}
   ],
   "on_message": [
     {"action": "detect_intent"},
     {"action": "route_by_intent", "routes": {
       "confirm": "advance",
       "reject": "handle_rejection",
       "question": "answer_question",
       "negotiate": "handle_negotiation"
     }}
   ]
 }',
 '{
   "allow_negotiation": true,
   "max_negotiation_rounds": 2
 }',
 true),

-- Wait for external action (payment, arrival, etc.)
('wait_external', 'Wait for External',
 'Wait for external event (payment, client arrival, etc.)',
 '{
   "on_enter": [
     {"action": "generate_response", "template": "wait_instructions"}
   ],
   "on_external_event": [
     {"action": "verify_event"},
     {"action": "advance_if_valid"}
   ],
   "on_message": [
     {"action": "check_status"},
     {"action": "generate_response", "template": "status_update"}
   ],
   "on_timeout": [
     {"action": "send_reminder"}
   ]
 }',
 '{
   "timeout_hours": 24,
   "reminder_interval_hours": 4
 }',
 true),

-- Terminal state - dialog completed
('terminal_success', 'Terminal Success',
 'Dialog successfully completed',
 '{
   "on_enter": [
     {"action": "generate_response", "template": "success_message"},
     {"action": "close_dialog", "status": "completed"}
   ]
 }',
 '{}',
 true),

-- Terminal state - dialog cancelled
('terminal_cancelled', 'Terminal Cancelled',
 'Dialog cancelled by client or operator',
 '{
   "on_enter": [
     {"action": "generate_response", "template": "cancellation_message"},
     {"action": "close_dialog", "status": "cancelled"}
   ]
 }',
 '{}',
 true),

-- Escalation to human operator
('escalate', 'Escalate to Operator',
 'Escalate dialog to human operator',
 '{
   "on_enter": [
     {"action": "notify_operator", "priority": "high"},
     {"action": "generate_response", "template": "escalation_message"}
   ],
   "on_message": [
     {"action": "forward_to_operator"}
   ]
 }',
 '{
   "auto_return_after_hours": 24
 }',
 true);


-- ============================================================================
-- 2. CONDITION OPERATORS
-- ============================================================================
-- Operators for evaluating transition conditions. Extensible.

CREATE TABLE IF NOT EXISTS elo_condition_operators (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    description TEXT,

    -- Type of evaluator
    evaluator_type VARCHAR(20) NOT NULL DEFAULT 'expression',
    CHECK (evaluator_type IN ('expression', 'sql', 'javascript', 'python', 'workflow')),

    -- Evaluator code/expression
    -- For 'expression': simple expressions like "field >= value"
    -- For 'sql': SQL query returning boolean
    -- For 'javascript': JS code returning boolean
    -- For 'workflow': workflow name to execute
    evaluator_code TEXT,

    -- Input schema (JSON Schema) - what operands this operator expects
    input_schema JSONB NOT NULL DEFAULT '{}',

    -- Number of operands (1=unary, 2=binary, -1=variadic)
    operand_count INT NOT NULL DEFAULT 2,

    -- Metadata
    is_system BOOLEAN NOT NULL DEFAULT false,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_condition_operators IS 'Operators for evaluating stage transition conditions';
COMMENT ON COLUMN elo_condition_operators.evaluator_type IS 'Type: expression, sql, javascript, python, workflow';
COMMENT ON COLUMN elo_condition_operators.evaluator_code IS 'Code/expression for evaluation';

-- Insert base operators
INSERT INTO elo_condition_operators (code, name, description, evaluator_type, evaluator_code, input_schema, operand_count, is_system) VALUES

-- Comparison operators
('eq', 'Equals', 'Field equals value', 'expression',
 '${field} == ${value}',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {}}}',
 2, true),

('neq', 'Not Equals', 'Field not equals value', 'expression',
 '${field} != ${value}',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {}}}',
 2, true),

('gt', 'Greater Than', 'Field greater than value', 'expression',
 '${field} > ${value}',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {"type": "number"}}}',
 2, true),

('gte', 'Greater Than or Equal', 'Field >= value', 'expression',
 '${field} >= ${value}',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {"type": "number"}}}',
 2, true),

('lt', 'Less Than', 'Field less than value', 'expression',
 '${field} < ${value}',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {"type": "number"}}}',
 2, true),

('lte', 'Less Than or Equal', 'Field <= value', 'expression',
 '${field} <= ${value}',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {"type": "number"}}}',
 2, true),

-- String operators
('contains', 'Contains', 'Field contains substring', 'expression',
 '${field}.includes(${value})',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {"type": "string"}}}',
 2, true),

('starts_with', 'Starts With', 'Field starts with value', 'expression',
 '${field}.startsWith(${value})',
 '{"type": "object", "properties": {"field": {"type": "string"}, "value": {"type": "string"}}}',
 2, true),

('matches', 'Matches Regex', 'Field matches regex pattern', 'expression',
 'new RegExp(${pattern}).test(${field})',
 '{"type": "object", "properties": {"field": {"type": "string"}, "pattern": {"type": "string"}}}',
 2, true),

-- Existence operators
('exists', 'Exists', 'Field exists and is not null', 'expression',
 '${field} !== null && ${field} !== undefined',
 '{"type": "object", "properties": {"field": {"type": "string"}}}',
 1, true),

('is_empty', 'Is Empty', 'Field is null, undefined or empty string', 'expression',
 '${field} === null || ${field} === undefined || ${field} === ""',
 '{"type": "object", "properties": {"field": {"type": "string"}}}',
 1, true),

-- Collection operators
('in', 'In List', 'Field value is in list', 'expression',
 '${list}.includes(${field})',
 '{"type": "object", "properties": {"field": {"type": "string"}, "list": {"type": "array"}}}',
 2, true),

('not_in', 'Not In List', 'Field value is not in list', 'expression',
 '!${list}.includes(${field})',
 '{"type": "object", "properties": {"field": {"type": "string"}, "list": {"type": "array"}}}',
 2, true),

-- Logical operators (for combining conditions)
('and', 'AND', 'All conditions must be true', 'expression',
 '${conditions}.every(c => c)',
 '{"type": "object", "properties": {"conditions": {"type": "array", "items": {"type": "boolean"}}}}',
 -1, true),

('or', 'OR', 'At least one condition must be true', 'expression',
 '${conditions}.some(c => c)',
 '{"type": "object", "properties": {"conditions": {"type": "array", "items": {"type": "boolean"}}}}',
 -1, true),

('not', 'NOT', 'Negate condition', 'expression',
 '!${condition}',
 '{"type": "object", "properties": {"condition": {"type": "boolean"}}}',
 1, true),

-- Completion operators
('fields_complete', 'Fields Complete', 'Required fields are filled', 'expression',
 '${required_fields}.every(f => context[f] !== null && context[f] !== undefined)',
 '{"type": "object", "properties": {"required_fields": {"type": "array", "items": {"type": "string"}}}}',
 1, true),

('completion_ratio', 'Completion Ratio', 'Completion ratio >= threshold', 'expression',
 '(${filled_count} / ${total_count}) >= ${threshold}',
 '{"type": "object", "properties": {"filled_count": {"type": "number"}, "total_count": {"type": "number"}, "threshold": {"type": "number"}}}',
 3, true),

-- Intent operators
('intent_is', 'Intent Is', 'Detected intent matches', 'expression',
 '${detected_intent} === ${expected_intent}',
 '{"type": "object", "properties": {"detected_intent": {"type": "string"}, "expected_intent": {"type": "string"}}}',
 2, true),

('intent_in', 'Intent In', 'Detected intent is one of list', 'expression',
 '${intent_list}.includes(${detected_intent})',
 '{"type": "object", "properties": {"detected_intent": {"type": "string"}, "intent_list": {"type": "array"}}}',
 2, true),

-- Iteration operators
('max_iterations', 'Max Iterations Reached', 'Iteration count >= max', 'expression',
 '${iteration_count} >= ${max_iterations}',
 '{"type": "object", "properties": {"iteration_count": {"type": "number"}, "max_iterations": {"type": "number"}}}',
 2, true);


-- ============================================================================
-- 3. ACTION TYPES
-- ============================================================================
-- Types of actions that can be executed. Fully extensible.

CREATE TABLE IF NOT EXISTS elo_action_types (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    description TEXT,

    -- Executor type
    executor_type VARCHAR(20) NOT NULL DEFAULT 'internal',
    CHECK (executor_type IN ('internal', 'workflow', 'http', 'mcp')),

    -- Reference to executor (workflow name, URL, MCP tool)
    executor_ref VARCHAR(255),

    -- JSON Schema for action configuration
    config_schema JSONB NOT NULL DEFAULT '{}',

    -- Default configuration
    default_config JSONB NOT NULL DEFAULT '{}',

    -- Can this action be used in parallel execution?
    allows_parallel BOOLEAN NOT NULL DEFAULT true,

    -- Metadata
    is_system BOOLEAN NOT NULL DEFAULT false,
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_action_types IS 'Types of actions that can be executed in funnel stages';
COMMENT ON COLUMN elo_action_types.executor_type IS 'How to execute: internal, workflow, http, mcp';
COMMENT ON COLUMN elo_action_types.executor_ref IS 'Reference: workflow name, URL, or MCP tool';

-- Insert base action types
INSERT INTO elo_action_types (code, name, description, executor_type, executor_ref, config_schema, allows_parallel, is_system) VALUES

-- Context actions
('extract_context', 'Extract Context',
 'Extract context from message using AI',
 'workflow', 'ELO_AI_Extract',
 '{
   "type": "object",
   "properties": {
     "extract_types": {"type": "array", "items": {"type": "string"}},
     "confidence_threshold": {"type": "number", "default": 0.7}
   }
 }',
 true, true),

('update_context', 'Update Context',
 'Update dialog context with new values',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "updates": {"type": "object"}
   }
 }',
 true, true),

('check_completion', 'Check Completion',
 'Check if required fields are complete',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "required_fields": {"type": "array", "items": {"type": "string"}},
     "threshold": {"type": "number", "default": 1.0}
   }
 }',
 true, true),

-- Response generation
('generate_response', 'Generate Response',
 'Generate AI response using template',
 'workflow', 'ELO_Response_Generator',
 '{
   "type": "object",
   "properties": {
     "template": {"type": "string"},
     "tone": {"type": "string", "enum": ["friendly", "formal", "concise"]},
     "include_context": {"type": "boolean", "default": true}
   }
 }',
 false, true),

('send_message', 'Send Message',
 'Send message to client via channel',
 'workflow', 'ELO_Out_Router',
 '{
   "type": "object",
   "properties": {
     "message": {"type": "string"},
     "channel_id": {"type": "integer"},
     "media": {"type": "array"}
   }
 }',
 false, true),

-- Stage management
('advance_stage', 'Advance Stage',
 'Move to next stage in funnel',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "target_stage": {"type": "string"},
     "reason": {"type": "string"}
   }
 }',
 false, true),

('rollback_stage', 'Rollback Stage',
 'Return to previous stage',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "target_stage": {"type": "string"},
     "reason": {"type": "string"}
   }
 }',
 false, true),

-- Operator actions
('notify_operator', 'Notify Operator',
 'Send notification to assigned operator',
 'workflow', 'ELO_Operator_Notify',
 '{
   "type": "object",
   "properties": {
     "notification_type": {"type": "string", "enum": ["new_message", "escalation", "draft_ready", "reminder"]},
     "priority": {"type": "string", "enum": ["low", "normal", "high", "urgent"]},
     "include_draft": {"type": "boolean", "default": false}
   }
 }',
 true, true),

('escalate', 'Escalate',
 'Escalate dialog to human operator or supervisor',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "reason": {"type": "string"},
     "priority": {"type": "string", "enum": ["normal", "high", "urgent"]},
     "target_operator_id": {"type": "string"}
   }
 }',
 false, true),

('forward_to_operator', 'Forward to Operator',
 'Forward message to operator without AI processing',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "include_context": {"type": "boolean", "default": true}
   }
 }',
 false, true),

-- Dialog management
('close_dialog', 'Close Dialog',
 'Close dialog with specified status',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "status": {"type": "string", "enum": ["completed", "cancelled", "expired", "spam"]},
     "reason": {"type": "string"}
   }
 }',
 false, true),

('pause_dialog', 'Pause Dialog',
 'Pause dialog processing',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "reason": {"type": "string"},
     "resume_after_hours": {"type": "number"}
   }
 }',
 false, true),

-- Intent detection
('detect_intent', 'Detect Intent',
 'Detect user intent from message',
 'workflow', 'ELO_Intent_Detector',
 '{
   "type": "object",
   "properties": {
     "intent_types": {"type": "array", "items": {"type": "string"}},
     "context_aware": {"type": "boolean", "default": true}
   }
 }',
 true, true),

-- Graph operations
('write_to_graph', 'Write to Graph',
 'Write extracted data to Neo4j graph',
 'workflow', 'ELO_Core_Graph_Writer',
 '{
   "type": "object",
   "properties": {
     "node_types": {"type": "array", "items": {"type": "string"}},
     "create_relationships": {"type": "boolean", "default": true}
   }
 }',
 true, true),

-- Reminders and timeouts
('send_reminder', 'Send Reminder',
 'Send reminder message to client',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "template": {"type": "string"},
     "max_reminders": {"type": "integer", "default": 3}
   }
 }',
 false, true),

('schedule_followup', 'Schedule Follow-up',
 'Schedule a follow-up action',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "action_type": {"type": "string"},
     "delay_minutes": {"type": "integer"},
     "action_config": {"type": "object"}
   }
 }',
 true, true),

-- Conditional routing
('route_by_intent', 'Route by Intent',
 'Route to different actions based on detected intent',
 'internal', null,
 '{
   "type": "object",
   "properties": {
     "routes": {
       "type": "object",
       "additionalProperties": {"type": "string"}
     },
     "default_route": {"type": "string"}
   }
 }',
 false, true),

-- External integrations
('call_mcp', 'Call MCP',
 'Call external MCP service',
 'mcp', null,
 '{
   "type": "object",
   "properties": {
     "service": {"type": "string"},
     "method": {"type": "string"},
     "params": {"type": "object"}
   }
 }',
 true, true),

('call_http', 'Call HTTP',
 'Make HTTP request to external service',
 'http', null,
 '{
   "type": "object",
   "properties": {
     "url": {"type": "string"},
     "method": {"type": "string", "enum": ["GET", "POST", "PUT", "DELETE"]},
     "headers": {"type": "object"},
     "body": {"type": "object"}
   }
 }',
 true, true);


-- ============================================================================
-- 4. EVENT HANDLERS
-- ============================================================================
-- Global event handlers (replace hardcoded on_max_iterations etc.)

CREATE TABLE IF NOT EXISTS elo_event_handlers (
    id SERIAL PRIMARY KEY,

    -- Event type this handler responds to
    event_type VARCHAR(50) NOT NULL,
    CHECK (event_type IN (
        'max_iterations_reached',
        'timeout_reached',
        'completion_threshold_met',
        'escalation_requested',
        'intent_not_recognized',
        'extraction_failed',
        'validation_failed',
        'external_event_received',
        'operator_timeout',
        'client_inactive'
    )),

    -- Handler name for identification
    handler_name VARCHAR(100) NOT NULL,

    -- Scope: global, vertical, tenant
    scope VARCHAR(20) NOT NULL DEFAULT 'global',
    scope_id VARCHAR(50), -- vertical_id or tenant_id

    -- Which action to execute
    action_type_id INT NOT NULL REFERENCES elo_action_types(id),

    -- Configuration for the action
    action_config JSONB NOT NULL DEFAULT '{}',

    -- Priority (lower = higher priority)
    priority INT NOT NULL DEFAULT 100,

    -- Conditions for this handler to apply (optional)
    conditions JSONB DEFAULT NULL,

    -- Metadata
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    UNIQUE(event_type, scope, scope_id, handler_name)
);

COMMENT ON TABLE elo_event_handlers IS 'Global event handlers for funnel events';
COMMENT ON COLUMN elo_event_handlers.scope IS 'Scope: global, vertical, or tenant';
COMMENT ON COLUMN elo_event_handlers.conditions IS 'Optional JSONB conditions for handler activation';

-- Insert default event handlers
INSERT INTO elo_event_handlers (event_type, handler_name, scope, action_type_id, action_config, priority) VALUES

-- Default max iterations handlers
('max_iterations_reached', 'default_escalate', 'global',
 (SELECT id FROM elo_action_types WHERE code = 'escalate'),
 '{"reason": "max_iterations_reached", "priority": "high"}',
 100),

-- Default timeout handlers
('timeout_reached', 'send_reminder', 'global',
 (SELECT id FROM elo_action_types WHERE code = 'send_reminder'),
 '{"template": "timeout_reminder"}',
 50),

('timeout_reached', 'close_if_no_response', 'global',
 (SELECT id FROM elo_action_types WHERE code = 'close_dialog'),
 '{"status": "expired", "reason": "no_response_after_reminders"}',
 100),

-- Intent not recognized
('intent_not_recognized', 'ask_clarification', 'global',
 (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
 '{"template": "ask_clarification"}',
 50),

('intent_not_recognized', 'escalate_after_retries', 'global',
 (SELECT id FROM elo_action_types WHERE code = 'escalate'),
 '{"reason": "intent_not_recognized", "priority": "normal"}',
 100),

-- Client inactive
('client_inactive', 'send_followup', 'global',
 (SELECT id FROM elo_action_types WHERE code = 'send_reminder'),
 '{"template": "followup_inactive"}',
 50);


-- ============================================================================
-- 5. STAGE CONDITIONS
-- ============================================================================
-- Configurable conditions for stage transitions

CREATE TABLE IF NOT EXISTS elo_stage_conditions (
    id SERIAL PRIMARY KEY,

    -- Source stage
    stage_id INT NOT NULL REFERENCES elo_funnel_stages(id) ON DELETE CASCADE,

    -- Target stage (null = stay in current stage)
    target_stage_id INT REFERENCES elo_funnel_stages(id) ON DELETE SET NULL,

    -- Condition operator
    operator_id INT NOT NULL REFERENCES elo_condition_operators(id),

    -- Operands for the operator (JSONB)
    operands JSONB NOT NULL DEFAULT '{}',

    -- Priority (lower = evaluate first)
    priority INT NOT NULL DEFAULT 100,

    -- Description for documentation
    description TEXT,

    -- Metadata
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_stage_conditions IS 'Conditions for stage transitions';
COMMENT ON COLUMN elo_stage_conditions.operands IS 'JSONB operands for condition evaluation';

CREATE INDEX idx_stage_conditions_stage ON elo_stage_conditions(stage_id) WHERE is_active = true;


-- ============================================================================
-- 6. STAGE ACTIONS
-- ============================================================================
-- Actions configured per stage

CREATE TABLE IF NOT EXISTS elo_stage_actions (
    id SERIAL PRIMARY KEY,

    -- Stage this action belongs to
    stage_id INT NOT NULL REFERENCES elo_funnel_stages(id) ON DELETE CASCADE,

    -- Event that triggers this action
    trigger_event VARCHAR(50) NOT NULL DEFAULT 'on_message',
    CHECK (trigger_event IN ('on_enter', 'on_message', 'on_exit', 'on_timeout', 'on_external')),

    -- Action type
    action_type_id INT NOT NULL REFERENCES elo_action_types(id),

    -- Action configuration (overrides action_type defaults)
    action_config JSONB NOT NULL DEFAULT '{}',

    -- Execution order within trigger event
    execution_order INT NOT NULL DEFAULT 0,

    -- Execution group (actions in same group can run in parallel)
    execution_group INT NOT NULL DEFAULT 0,

    -- Condition for this action (optional - if null, always execute)
    condition_id INT REFERENCES elo_stage_conditions(id),

    -- Metadata
    is_active BOOLEAN NOT NULL DEFAULT true,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE elo_stage_actions IS 'Actions to execute at each funnel stage';
COMMENT ON COLUMN elo_stage_actions.execution_group IS 'Actions in same group execute in parallel';

CREATE INDEX idx_stage_actions_stage_event ON elo_stage_actions(stage_id, trigger_event) WHERE is_active = true;


-- ============================================================================
-- 7. ALTER elo_funnel_stages
-- ============================================================================
-- Add new columns for configurable behavior

-- Add behavior_type reference
ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS behavior_type_id INT REFERENCES elo_behavior_types(id);

-- Add stage-specific configuration (overrides behavior_type defaults)
ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS stage_config JSONB NOT NULL DEFAULT '{}';

-- Add required context fields for this stage
ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS required_context_fields JSONB NOT NULL DEFAULT '[]';

-- Add completion mask (binary mask tracking which fields complete the stage)
ALTER TABLE elo_funnel_stages
ADD COLUMN IF NOT EXISTS completion_mask BIGINT NOT NULL DEFAULT 0;

-- Update comments
COMMENT ON COLUMN elo_funnel_stages.behavior_type_id IS 'Reference to behavior template';
COMMENT ON COLUMN elo_funnel_stages.stage_config IS 'Stage-specific config overriding behavior defaults';
COMMENT ON COLUMN elo_funnel_stages.required_context_fields IS 'JSONB array of required context field names';
COMMENT ON COLUMN elo_funnel_stages.completion_mask IS 'Binary mask for completion tracking';


-- ============================================================================
-- 8. SAMPLE DATA: Phone Repair Funnel
-- ============================================================================

-- First, ensure we have the vertical
INSERT INTO elo_verticals (id, domain_id, code, name, is_active)
VALUES (1, 1, 'phone_repair', 'Phone Repair', true)
ON CONFLICT (id) DO NOTHING;

-- Update existing funnel stages with new behavior types
UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'collect_batch'),
    stage_config = '{"max_iterations": 1}',
    required_context_fields = '["client_name"]'
WHERE code = 'lead';

UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'collect_iterative'),
    stage_config = '{"max_iterations": 5, "completion_threshold": 0.8}',
    required_context_fields = '["device_brand", "device_model", "device_type"]'
WHERE code = 'qualification';

UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'collect_iterative'),
    stage_config = '{"max_iterations": 7, "completion_threshold": 1.0}',
    required_context_fields = '["symptoms", "problem_description", "warranty_status"]'
WHERE code = 'data_collection';

UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'present_and_confirm'),
    stage_config = '{"allow_negotiation": true, "max_negotiation_rounds": 2}',
    required_context_fields = '[]'
WHERE code = 'presentation';

UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'present_and_confirm'),
    stage_config = '{"allow_negotiation": false}',
    required_context_fields = '[]'
WHERE code = 'agreement';

UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'collect_batch'),
    stage_config = '{}',
    required_context_fields = '["preferred_date", "preferred_time"]'
WHERE code = 'booking';

UPDATE elo_funnel_stages SET
    behavior_type_id = (SELECT id FROM elo_behavior_types WHERE code = 'terminal_success'),
    stage_config = '{}',
    required_context_fields = '[]'
WHERE code = 'confirmation';


-- Insert stage conditions for phone_repair
-- Lead → Qualification: when client_name is collected
INSERT INTO elo_stage_conditions (stage_id, target_stage_id, operator_id, operands, priority, description)
SELECT
    s.id,
    t.id,
    (SELECT id FROM elo_condition_operators WHERE code = 'exists'),
    '{"field": "context.client_name"}',
    10,
    'Advance when client name is collected'
FROM elo_funnel_stages s, elo_funnel_stages t
WHERE s.code = 'lead' AND t.code = 'qualification';

-- Qualification → Data Collection: when device info is complete
INSERT INTO elo_stage_conditions (stage_id, target_stage_id, operator_id, operands, priority, description)
SELECT
    s.id,
    t.id,
    (SELECT id FROM elo_condition_operators WHERE code = 'fields_complete'),
    '{"required_fields": ["device_brand", "device_model"]}',
    10,
    'Advance when device info is collected'
FROM elo_funnel_stages s, elo_funnel_stages t
WHERE s.code = 'qualification' AND t.code = 'data_collection';

-- Data Collection → Presentation: when symptoms collected
INSERT INTO elo_stage_conditions (stage_id, target_stage_id, operator_id, operands, priority, description)
SELECT
    s.id,
    t.id,
    (SELECT id FROM elo_condition_operators WHERE code = 'exists'),
    '{"field": "context.symptoms"}',
    10,
    'Advance when symptoms are collected'
FROM elo_funnel_stages s, elo_funnel_stages t
WHERE s.code = 'data_collection' AND t.code = 'presentation';

-- Presentation → Agreement: when client confirms price
INSERT INTO elo_stage_conditions (stage_id, target_stage_id, operator_id, operands, priority, description)
SELECT
    s.id,
    t.id,
    (SELECT id FROM elo_condition_operators WHERE code = 'intent_is'),
    '{"detected_intent": "$.last_intent", "expected_intent": "confirm"}',
    10,
    'Advance when client confirms price'
FROM elo_funnel_stages s, elo_funnel_stages t
WHERE s.code = 'presentation' AND t.code = 'agreement';

-- Agreement → Booking: when client agrees to terms
INSERT INTO elo_stage_conditions (stage_id, target_stage_id, operator_id, operands, priority, description)
SELECT
    s.id,
    t.id,
    (SELECT id FROM elo_condition_operators WHERE code = 'intent_is'),
    '{"detected_intent": "$.last_intent", "expected_intent": "confirm"}',
    10,
    'Advance when client agrees to terms'
FROM elo_funnel_stages s, elo_funnel_stages t
WHERE s.code = 'agreement' AND t.code = 'booking';

-- Booking → Confirmation: when date/time selected
INSERT INTO elo_stage_conditions (stage_id, target_stage_id, operator_id, operands, priority, description)
SELECT
    s.id,
    t.id,
    (SELECT id FROM elo_condition_operators WHERE code = 'fields_complete'),
    '{"required_fields": ["preferred_date", "preferred_time"]}',
    10,
    'Advance when booking details are collected'
FROM elo_funnel_stages s, elo_funnel_stages t
WHERE s.code = 'booking' AND t.code = 'confirmation';


-- Insert stage actions for phone_repair funnel
-- Lead stage: on_enter - greet and ask name
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
    '{"template": "greeting_ask_name", "tone": "friendly"}',
    0
FROM elo_funnel_stages s WHERE s.code = 'lead';

-- Lead stage: on_message - extract name and check completion
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order, execution_group)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'extract_context'),
    '{"extract_types": ["client_name", "greeting"]}',
    0, 0
FROM elo_funnel_stages s WHERE s.code = 'lead';

INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order, execution_group)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'check_completion'),
    '{"required_fields": ["client_name"]}',
    1, 1
FROM elo_funnel_stages s WHERE s.code = 'lead';

-- Qualification stage: on_enter - ask about device
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
    '{"template": "ask_device_info", "tone": "friendly"}',
    0
FROM elo_funnel_stages s WHERE s.code = 'qualification';

-- Qualification stage: on_message - extract device info
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order, execution_group)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'extract_context'),
    '{"extract_types": ["device_brand", "device_model", "device_type"]}',
    0, 0
FROM elo_funnel_stages s WHERE s.code = 'qualification';

INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order, execution_group)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'check_completion'),
    '{"required_fields": ["device_brand", "device_model"]}',
    1, 1
FROM elo_funnel_stages s WHERE s.code = 'qualification';

-- Data Collection stage: on_enter - ask about problem
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
    '{"template": "ask_problem_description", "tone": "friendly"}',
    0
FROM elo_funnel_stages s WHERE s.code = 'data_collection';

-- Data Collection stage: on_message - extract symptoms
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order, execution_group)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'extract_context'),
    '{"extract_types": ["symptoms", "problem_description", "warranty_status"]}',
    0, 0
FROM elo_funnel_stages s WHERE s.code = 'data_collection';

INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order, execution_group)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'write_to_graph'),
    '{"node_types": ["Symptom", "Device"]}',
    0, 0
FROM elo_funnel_stages s WHERE s.code = 'data_collection';

-- Presentation stage: on_enter - build and present diagnosis with price
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
    '{"template": "present_diagnosis_and_price", "tone": "formal"}',
    0
FROM elo_funnel_stages s WHERE s.code = 'presentation';

-- Presentation stage: on_message - detect intent and route
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'detect_intent'),
    '{"intent_types": ["confirm", "reject", "question", "negotiate"]}',
    0
FROM elo_funnel_stages s WHERE s.code = 'presentation';

INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_message',
    (SELECT id FROM elo_action_types WHERE code = 'route_by_intent'),
    '{
      "routes": {
        "confirm": "advance",
        "reject": "handle_rejection",
        "question": "answer_question",
        "negotiate": "handle_negotiation"
      },
      "default_route": "clarify"
    }',
    1
FROM elo_funnel_stages s WHERE s.code = 'presentation';

-- Booking stage: on_enter - ask for preferred time
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
    '{"template": "ask_booking_time", "tone": "friendly"}',
    0
FROM elo_funnel_stages s WHERE s.code = 'booking';

-- Confirmation stage: on_enter - send confirmation
INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'generate_response'),
    '{"template": "booking_confirmation", "tone": "formal"}',
    0
FROM elo_funnel_stages s WHERE s.code = 'confirmation';

INSERT INTO elo_stage_actions (stage_id, trigger_event, action_type_id, action_config, execution_order)
SELECT
    s.id,
    'on_enter',
    (SELECT id FROM elo_action_types WHERE code = 'close_dialog'),
    '{"status": "completed", "reason": "booking_confirmed"}',
    1
FROM elo_funnel_stages s WHERE s.code = 'confirmation';


-- ============================================================================
-- 9. CREATE INDEXES
-- ============================================================================

CREATE INDEX IF NOT EXISTS idx_behavior_types_code ON elo_behavior_types(code) WHERE is_active = true;
CREATE INDEX IF NOT EXISTS idx_condition_operators_code ON elo_condition_operators(code) WHERE is_active = true;
CREATE INDEX IF NOT EXISTS idx_action_types_code ON elo_action_types(code) WHERE is_active = true;
CREATE INDEX IF NOT EXISTS idx_event_handlers_event ON elo_event_handlers(event_type, scope) WHERE is_active = true;


-- ============================================================================
-- 10. CREATE VIEWS
-- ============================================================================

-- View: Full stage configuration with behavior
CREATE OR REPLACE VIEW elo_v_stage_config AS
SELECT
    fs.id AS stage_id,
    fs.code AS stage_code,
    fs.name AS stage_name,
    fs.stage_type,
    fs.sort_order,
    bt.code AS behavior_code,
    bt.name AS behavior_name,
    bt.action_template,
    COALESCE(fs.stage_config, '{}') || COALESCE(bt.default_config, '{}') AS merged_config,
    fs.required_context_fields,
    fs.completion_mask,
    fs.is_required
FROM elo_funnel_stages fs
LEFT JOIN elo_behavior_types bt ON fs.behavior_type_id = bt.id
WHERE fs.is_active = true;

COMMENT ON VIEW elo_v_stage_config IS 'Full stage configuration with merged behavior config';

-- View: Stage transitions with conditions
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

COMMENT ON VIEW elo_v_stage_transitions IS 'Stage transitions with condition details';

-- View: Stage actions with full details
CREATE OR REPLACE VIEW elo_v_stage_actions AS
SELECT
    sa.id AS action_id,
    fs.code AS stage_code,
    sa.trigger_event,
    at.code AS action_code,
    at.executor_type,
    at.executor_ref,
    COALESCE(sa.action_config, '{}') || COALESCE(at.default_config, '{}') AS merged_config,
    sa.execution_order,
    sa.execution_group
FROM elo_stage_actions sa
JOIN elo_funnel_stages fs ON sa.stage_id = fs.id
JOIN elo_action_types at ON sa.action_type_id = at.id
WHERE sa.is_active = true
ORDER BY fs.sort_order, sa.trigger_event, sa.execution_order;

COMMENT ON VIEW elo_v_stage_actions IS 'Stage actions with executor details';


COMMIT;

-- ============================================================================
-- MIGRATION COMPLETE
-- ============================================================================
--
-- Created tables:
--   - elo_behavior_types (7 base behaviors)
--   - elo_condition_operators (19 operators)
--   - elo_action_types (18 action types)
--   - elo_event_handlers (6 default handlers)
--   - elo_stage_conditions (configurable transitions)
--   - elo_stage_actions (stage-specific actions)
--
-- Modified tables:
--   - elo_funnel_stages (added behavior_type_id, stage_config, etc.)
--
-- Created views:
--   - elo_v_stage_config
--   - elo_v_stage_transitions
--   - elo_v_stage_actions
--
-- Sample data:
--   - Phone repair funnel (7 stages with full configuration)
--
-- ============================================================================
