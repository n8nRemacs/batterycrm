// ============================================
// Neo4j Schema: Project Knowledge Graph
// Date: 2025-12-04
// Purpose: Store project structure and component relationships
// IMPORTANT: Uses :KB_ prefix to separate from business data
// ============================================

// ============================================
// 1. CONSTRAINTS
// ============================================

// Unique component by type+name (KB = Knowledge Base)
CREATE CONSTRAINT kb_component_unique IF NOT EXISTS
FOR (c:KB_Component) REQUIRE (c.type, c.name) IS UNIQUE;

// Unique session
CREATE CONSTRAINT kb_session_unique IF NOT EXISTS
FOR (s:KB_Session) REQUIRE s.session_id IS UNIQUE;

// ============================================
// 2. INDEXES
// ============================================

CREATE INDEX kb_component_type_idx IF NOT EXISTS FOR (c:KB_Component) ON (c.type);
CREATE INDEX kb_component_category_idx IF NOT EXISTS FOR (c:KB_Component) ON (c.category);
CREATE INDEX kb_component_status_idx IF NOT EXISTS FOR (c:KB_Component) ON (c.status);
CREATE INDEX kb_component_file_idx IF NOT EXISTS FOR (c:KB_Component) ON (c.file_path);

// ============================================
// 3. NODE LABELS (Component types as labels)
// All use KB_ prefix to separate from business data
// ============================================

// Base Component structure:
// (:KB_Component {
//   id: "uuid",
//   type: "workflow|table|android_activity|...",
//   name: "BAT_Appeal_Manager",
//   code: "technical-code",
//   category: "Core",
//   subcategory: "...",
//   file_path: "n8n_workflows/Core/BAT_Appeal_Manager.json",
//   tech_stack: "json",
//   description: "...",
//   status: "active|deprecated|planned",
//   created_at: datetime,
//   updated_at: datetime
// })

// Additional labels by type (double-labeled):
// (:KB_Component:KB_Workflow {..., webhook_path: "/path", is_active: true, tags: ["BattCRM", "Core"]})
// (:KB_Component:KB_Table {..., schema: "public", estimated_rows: 1000})
// (:KB_Component:KB_AndroidActivity {..., extends: "AppCompatActivity", layout: "activity_main"})
// (:KB_Component:KB_AndroidViewModel {..., state_flows: ["appeals", "isLoading"]})
// (:KB_Component:KB_ApiEndpoint {..., method: "POST", path: "/api/...", auth_required: true})
// (:KB_Component:KB_McpServer {..., port: 8080, docker: true})
// (:KB_Component:KB_Neo4jNode {...})
// (:KB_Component:KB_Neo4jRelation {...})
// (:KB_Component:KB_Script {..., language: "python"})
// (:KB_Component:KB_Doc {..., format: "markdown", lines: 500})

// Session node:
// (:KB_Session {
//   session_id: "abc123",
//   terminal_name: "Terminal 1",
//   focus_area: "android",
//   current_task: "Implementing FCM",
//   status: "active",
//   started_at: datetime,
//   last_activity_at: datetime
// })

// ============================================
// 4. RELATIONSHIP TYPES (KB_ prefix for clarity)
// ============================================

// Component relationships:
// (:KB_Component)-[:KB_CALLS {method: "POST", endpoint: "/webhook/..."}]->(:KB_Component)
// (:KB_Component)-[:KB_READS_FROM {fields: ["id", "name"]}]->(:KB_Component)
// (:KB_Component)-[:KB_WRITES_TO {operation: "INSERT|UPDATE|DELETE"}]->(:KB_Component)
// (:KB_Component)-[:KB_TRIGGERS {event: "webhook", condition: "..."}]->(:KB_Component)
// (:KB_Component)-[:KB_DEPENDS_ON {reason: "..."}]->(:KB_Component)
// (:KB_Component)-[:KB_EXTENDS]->(:KB_Component)
// (:KB_Component)-[:KB_IMPLEMENTS]->(:KB_Component)
// (:KB_Component)-[:KB_USES {how: "..."}]->(:KB_Component)
// (:KB_Component)-[:KB_REFERENCES {field: "appeal_id"}]->(:KB_Component)

// Field relationship:
// (:KB_Component)-[:KB_HAS_FIELD {
//   name: "appeal_id",
//   type: "uuid",
//   is_pk: false,
//   is_fk: true,
//   references: "appeals.id"
// }]->(:KB_Component)  // FK target

// Session relationships:
// (:KB_Session)-[:KB_WORKED_ON {action: "created|updated|deleted", at: datetime}]->(:KB_Component)
// (:KB_Session)-[:KB_BASED_ON]->(:KB_Session)  // Continuation

// Change history:
// (:KB_Component)-[:KB_CHANGED {
//   type: "created|updated|deleted",
//   description: "...",
//   by: "claude|user",
//   at: datetime
// }]->(:KB_Component)  // self-loop or to snapshot

// ============================================
// 5. EXAMPLE QUERIES (all use KB_ prefix)
// ============================================

// Find all workflows that call a specific workflow
// MATCH (caller:KB_Component:KB_Workflow)-[:KB_CALLS]->(target:KB_Component:KB_Workflow {name: "BAT_Appeal_Manager"})
// RETURN caller.name, caller.category

// Find all tables a workflow reads/writes
// MATCH (wf:KB_Component:KB_Workflow {name: "API_Android_Appeals_List"})
// MATCH (wf)-[r:KB_READS_FROM|KB_WRITES_TO]->(t:KB_Component:KB_Table)
// RETURN t.name, type(r), r.fields

// Get full dependency chain
// MATCH path = (start:KB_Component {name: "MainActivity"})-[:KB_DEPENDS_ON|KB_USES|KB_CALLS*1..5]->(dep:KB_Component)
// RETURN path

// Find orphan components (no relations)
// MATCH (c:KB_Component)
// WHERE NOT (c)-[]-()
// RETURN c.type, c.name

// Get component statistics
// MATCH (c:KB_Component)
// RETURN c.type, count(*) as count
// ORDER BY count DESC

// Workflow flow visualization
// MATCH (in:KB_Component:KB_Workflow)-[:KB_TRIGGERS]->(router:KB_Component:KB_Workflow)-[:KB_CALLS]->(out:KB_Component:KB_Workflow)
// WHERE in.category = "In" AND out.category = "Out"
// RETURN in.name, router.name, out.name

// Android architecture view
// MATCH (act:KB_Component:KB_AndroidActivity)-[:KB_USES]->(vm:KB_Component:KB_AndroidViewModel)-[:KB_USES]->(repo:KB_Component:KB_AndroidRepository)-[:KB_CALLS]->(api:KB_Component:KB_ApiEndpoint)
// RETURN act.name, vm.name, repo.name, api.name

// ============================================
// 6. IMPORT FUNCTIONS (Cypher procedures)
// ============================================

// Add workflow component
// CREATE (w:KB_Component:KB_Workflow {
//   id: randomUUID(),
//   type: "workflow",
//   name: $name,
//   category: $category,
//   file_path: $file_path,
//   webhook_path: $webhook_path,
//   is_active: $is_active,
//   tags: $tags,
//   tech_stack: "json",
//   status: "active",
//   created_at: datetime(),
//   updated_at: datetime()
// })

// Add table component
// CREATE (t:KB_Component:KB_Table {
//   id: randomUUID(),
//   type: "table",
//   name: $name,
//   category: "database",
//   file_path: $migration_file,
//   schema: "public",
//   tech_stack: "sql",
//   status: "active",
//   created_at: datetime(),
//   updated_at: datetime()
// })

// Add Android component
// CREATE (a:KB_Component:KB_AndroidActivity {
//   id: randomUUID(),
//   type: "android_activity",
//   name: $name,
//   category: "ui",
//   file_path: $file_path,
//   extends: $extends,
//   layout: $layout,
//   tech_stack: "kotlin",
//   status: "active",
//   created_at: datetime(),
//   updated_at: datetime()
// })

// Add relation
// MATCH (from:KB_Component {type: $from_type, name: $from_name})
// MATCH (to:KB_Component {type: $to_type, name: $to_name})
// CREATE (from)-[:KB_$relation_type {
//   description: $description,
//   created_at: datetime()
// }]->(to)

// ============================================
// 7. VISUALIZATION QUERIES
// ============================================

// Full system architecture (limited)
// MATCH (c:KB_Component)
// WHERE c.status = "active"
// OPTIONAL MATCH (c)-[r]->(c2:KB_Component)
// RETURN c, r, c2
// LIMIT 500

// Workflow ecosystem
// MATCH (w:KB_Component:KB_Workflow)
// OPTIONAL MATCH (w)-[r:KB_CALLS|KB_TRIGGERS]->(w2:KB_Component:KB_Workflow)
// RETURN w, r, w2

// Data flow (tables and who uses them)
// MATCH (t:KB_Component:KB_Table)
// OPTIONAL MATCH (c:KB_Component)-[r:KB_READS_FROM|KB_WRITES_TO]->(t)
// RETURN t, r, c

// API to Android mapping
// MATCH (api:KB_Component:KB_ApiEndpoint)
// OPTIONAL MATCH (android:KB_Component)-[:KB_CALLS]->(api)
// RETURN api.name, api.path, collect(android.name) as callers
