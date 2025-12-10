// CORE_NEW: Neo4j Migration 002 - ELO_* constraints and indexes
// Run via: ssh root@45.144.177.128 "docker exec neo4j cypher-shell -a 'bolt+ssc://localhost:7687' -u neo4j -p 'Mi31415926pS' < file.cypher"

// === ОСНОВНЫЕ УЗЛЫ ===

// Сообщения (точка входа)
CREATE CONSTRAINT elo_message_id IF NOT EXISTS FOR (m:ELO_Message) REQUIRE m.id IS UNIQUE;
CREATE INDEX elo_message_timestamp IF NOT EXISTS FOR (m:ELO_Message) ON (m.timestamp);
CREATE INDEX elo_message_tenant IF NOT EXISTS FOR (m:ELO_Message) ON (m.tenant_id);
CREATE INDEX elo_message_chat IF NOT EXISTS FOR (m:ELO_Message) ON (m.external_chat_id);

// Клиенты
CREATE CONSTRAINT elo_client_id IF NOT EXISTS FOR (c:ELO_Client) REQUIRE c.id IS UNIQUE;
CREATE INDEX elo_client_tenant IF NOT EXISTS FOR (c:ELO_Client) ON (c.tenant_id);
CREATE INDEX elo_client_phone IF NOT EXISTS FOR (c:ELO_Client) ON (c.phone);
CREATE INDEX elo_client_telegram IF NOT EXISTS FOR (c:ELO_Client) ON (c.telegram_id);

// Устройства
CREATE CONSTRAINT elo_device_id IF NOT EXISTS FOR (d:ELO_Device) REQUIRE d.id IS UNIQUE;
CREATE INDEX elo_device_tenant IF NOT EXISTS FOR (d:ELO_Device) ON (d.tenant_id);

// Issue (случай обращения)
CREATE CONSTRAINT elo_issue_id IF NOT EXISTS FOR (i:ELO_Issue) REQUIRE i.id IS UNIQUE;
CREATE INDEX elo_issue_tenant IF NOT EXISTS FOR (i:ELO_Issue) ON (i.tenant_id);
CREATE INDEX elo_issue_stage IF NOT EXISTS FOR (i:ELO_Issue) ON (i.stage);

// Симптомы
CREATE CONSTRAINT elo_symptom_id IF NOT EXISTS FOR (s:ELO_Symptom) REQUIRE s.id IS UNIQUE;

// Диагнозы
CREATE CONSTRAINT elo_diagnosis_id IF NOT EXISTS FOR (d:ELO_Diagnosis) REQUIRE d.id IS UNIQUE;

// Ремонты
CREATE CONSTRAINT elo_repair_id IF NOT EXISTS FOR (r:ELO_Repair) REQUIRE r.id IS UNIQUE;

// Факты о клиенте
CREATE CONSTRAINT elo_fact_id IF NOT EXISTS FOR (f:ELO_Fact) REQUIRE f.id IS UNIQUE;

// Диалоги
CREATE CONSTRAINT elo_dialog_id IF NOT EXISTS FOR (d:ELO_Dialog) REQUIRE d.id IS UNIQUE;
CREATE INDEX elo_dialog_tenant IF NOT EXISTS FOR (d:ELO_Dialog) ON (d.tenant_id);

// === СПРАВОЧНИКИ ===

// Типы симптомов
CREATE CONSTRAINT elo_symptom_type_id IF NOT EXISTS FOR (st:ELO_SymptomType) REQUIRE st.id IS UNIQUE;
CREATE INDEX elo_symptom_type_code IF NOT EXISTS FOR (st:ELO_SymptomType) ON (st.code);

// Типы диагнозов
CREATE CONSTRAINT elo_diagnosis_type_id IF NOT EXISTS FOR (dt:ELO_DiagnosisType) REQUIRE dt.id IS UNIQUE;
CREATE INDEX elo_diagnosis_type_code IF NOT EXISTS FOR (dt:ELO_DiagnosisType) ON (dt.code);

// Типы ремонтов
CREATE CONSTRAINT elo_repair_action_id IF NOT EXISTS FOR (ra:ELO_RepairAction) REQUIRE ra.id IS UNIQUE;
CREATE INDEX elo_repair_action_code IF NOT EXISTS FOR (ra:ELO_RepairAction) ON (ra.code);

// Категории проблем
CREATE CONSTRAINT elo_problem_category_id IF NOT EXISTS FOR (pc:ELO_ProblemCategory) REQUIRE pc.id IS UNIQUE;
CREATE INDEX elo_problem_category_code IF NOT EXISTS FOR (pc:ELO_ProblemCategory) ON (pc.code);
