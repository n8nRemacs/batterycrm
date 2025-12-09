// ============================================
// Neo4j Schema: Contacts and Enrichment
// Date: 2025-12-04
// ============================================

// ============================================
// 1. CONSTRAINTS
// ============================================

// Contact uniqueness by type+value
CREATE CONSTRAINT contact_unique IF NOT EXISTS
FOR (c:Contact) REQUIRE (c.type, c.value, c.tenant_id) IS UNIQUE;

// Creative code uniqueness
CREATE CONSTRAINT creative_code_unique IF NOT EXISTS
FOR (cr:Creative) REQUIRE (cr.code, cr.tenant_id) IS UNIQUE;

// AB Test uniqueness
CREATE CONSTRAINT ab_test_id_unique IF NOT EXISTS
FOR (ab:ABTest) REQUIRE ab.id IS UNIQUE;

// ============================================
// 2. INDEXES
// ============================================

CREATE INDEX contact_type_idx IF NOT EXISTS FOR (c:Contact) ON (c.type);
CREATE INDEX contact_value_idx IF NOT EXISTS FOR (c:Contact) ON (c.value);
CREATE INDEX contact_verified_idx IF NOT EXISTS FOR (c:Contact) ON (c.is_verified);

CREATE INDEX creative_type_idx IF NOT EXISTS FOR (cr:Creative) ON (cr.type);
CREATE INDEX creative_purpose_idx IF NOT EXISTS FOR (cr:Creative) ON (cr.purpose);
CREATE INDEX creative_active_idx IF NOT EXISTS FOR (cr:Creative) ON (cr.is_active);

CREATE INDEX ab_test_status_idx IF NOT EXISTS FOR (ab:ABTest) ON (ab.status);

// ============================================
// 3. NODE TYPES
// ============================================

// Contact Node
// (:Contact {
//   id: "uuid",
//   type: "phone|telegram|whatsapp|email|vk|avito",
//   value: "+79123456789|@username|email@domain.com",
//   raw_value: "original input",
//   is_verified: true|false,
//   is_primary: true|false,
//   display_name: "Name from profile",
//   discovered_via: "auto|asked|form|profile|import",
//   discovered_channel: "avito|telegram|...",
//   discovered_at: datetime,
//   verified_at: datetime,
//   tenant_id: "uuid"
// })

// Creative Node
// (:Creative {
//   id: "uuid",
//   code: "ask_phone_avito_v1",
//   name: "Запрос телефона в Авито",
//   type: "text|link|form|page|script",
//   purpose: "get_phone|get_whatsapp|get_email|get_telegram|get_fingerprint",
//   content: "Текст креатива...",
//   channels: ["avito", "telegram"],
//   ab_group: "A|B|C|Z",
//   weight: 100,
//   is_active: true,
//   usage_count: 0,
//   success_count: 0,
//   success_rate: 0.0,
//   tenant_id: "uuid"
// })

// ABTest Node
// (:ABTest {
//   id: "uuid",
//   name: "Test phone request variations",
//   purpose: "get_phone",
//   status: "draft|running|paused|completed",
//   traffic_split: {A: 45, B: 45, Z: 10},
//   min_sample_size: 100,
//   confidence_level: 0.95,
//   winner_variant: "A",
//   started_at: datetime,
//   ended_at: datetime,
//   tenant_id: "uuid"
// })

// EnrichmentAction Node
// (:EnrichmentAction {
//   id: "uuid",
//   target_type: "phone|telegram|...",
//   method: "ask_in_chat|send_link|call|form",
//   channel: "avito|telegram|...",
//   status: "pending|success|failed|no_response",
//   attempted_at: datetime,
//   completed_at: datetime,
//   tenant_id: "uuid"
// })

// ============================================
// 4. RELATIONSHIP TYPES
// ============================================

// Client has contact
// (:Client)-[:HAS_CONTACT {
//   is_owner: true,
//   confidence: 1.0,
//   linked_at: datetime,
//   discovered_touchpoint_id: "uuid"
// }]->(:Contact)

// Contact discovered via touchpoint
// (:Contact)-[:DISCOVERED_VIA {
//   method: "auto|asked|form|profile",
//   confidence: 1.0
// }]->(:Touchpoint)

// Contact verified by touchpoint (client responded)
// (:Contact)-[:VERIFIED_BY {
//   verified_at: datetime
// }]->(:Touchpoint)

// Enrichment action for client
// (:Client)<-[:FOR_CLIENT]-(:EnrichmentAction)

// Enrichment action in context of appeal
// (:EnrichmentAction)-[:FOR_APPEAL]->(:Appeal)

// Enrichment used creative
// (:EnrichmentAction)-[:USED_CREATIVE]->(:Creative)

// Enrichment resulted in contact
// (:EnrichmentAction)-[:RESULTED_IN]->(:Contact)

// Creative belongs to AB test
// (:Creative)-[:BELONGS_TO_TEST {
//   variant: "A|B|C|Z"
// }]->(:ABTest)

// AB test exposure
// (:Client)-[:EXPOSED_TO {
//   variant: "A",
//   exposed_at: datetime,
//   converted: true|false,
//   converted_at: datetime
// }]->(:ABTest)

// ============================================
// 5. EXAMPLE QUERIES
// ============================================

// Get all contacts for a client
// MATCH (cl:Client {id: $client_id})-[:HAS_CONTACT]->(c:Contact)
// RETURN c ORDER BY c.is_primary DESC, c.is_verified DESC

// Find clients with phone but no telegram
// MATCH (cl:Client)-[:HAS_CONTACT]->(p:Contact {type: "phone"})
// WHERE NOT EXISTS {
//   MATCH (cl)-[:HAS_CONTACT]->(t:Contact {type: "telegram"})
// }
// RETURN cl, p

// Get enrichment success rate by method
// MATCH (ea:EnrichmentAction {status: "success"})
// WITH ea.method as method, count(*) as successes
// MATCH (ea2:EnrichmentAction)
// WHERE ea2.method = method
// WITH method, successes, count(*) as total
// RETURN method, successes, total, toFloat(successes)/total as rate
// ORDER BY rate DESC

// Get creative performance
// MATCH (cr:Creative)
// OPTIONAL MATCH (ea:EnrichmentAction)-[:USED_CREATIVE]->(cr)
// WITH cr, count(ea) as uses,
//      count(CASE WHEN ea.status = "success" THEN 1 END) as successes
// RETURN cr.code, cr.name, uses, successes,
//        CASE WHEN uses > 0 THEN toFloat(successes)/uses ELSE 0 END as rate
// ORDER BY rate DESC

// A/B Test results
// MATCH (ab:ABTest {id: $test_id})
// MATCH (cl:Client)-[e:EXPOSED_TO]->(ab)
// WITH ab, e.variant as variant,
//      count(*) as exposures,
//      count(CASE WHEN e.converted THEN 1 END) as conversions
// RETURN variant, exposures, conversions,
//        toFloat(conversions)/exposures as rate
// ORDER BY variant

// Find best path to get phone from Avito
// MATCH path = (avito:Channel {name: "avito"})-[*..4]->(:Contact {type: "phone"})
// RETURN path, length(path) as steps
// ORDER BY steps
// LIMIT 10

// ============================================
// 6. SAMPLE DATA CREATION
// ============================================

// Create sample creative
// CREATE (cr:Creative {
//   id: randomUUID(),
//   code: "ask_phone_avito_friendly_v1",
//   name: "Дружелюбный запрос телефона (Авито)",
//   type: "text",
//   purpose: "get_phone",
//   content: "Подскажите номер телефона — отправлю адрес и схему проезда в SMS",
//   channels: ["avito"],
//   ab_group: "A",
//   weight: 100,
//   is_active: true,
//   usage_count: 0,
//   success_count: 0,
//   success_rate: 0.0,
//   tenant_id: $tenant_id,
//   created_at: datetime()
// })

// Link contact to client with discovery info
// MATCH (cl:Client {id: $client_id})
// MATCH (tp:Touchpoint {id: $touchpoint_id})
// CREATE (c:Contact {
//   id: randomUUID(),
//   type: "phone",
//   value: "+79123456789",
//   is_verified: false,
//   discovered_via: "asked",
//   discovered_channel: "avito",
//   discovered_at: datetime(),
//   tenant_id: $tenant_id
// })
// CREATE (cl)-[:HAS_CONTACT {
//   is_owner: true,
//   confidence: 1.0,
//   linked_at: datetime(),
//   discovered_touchpoint_id: $touchpoint_id
// }]->(c)
// CREATE (c)-[:DISCOVERED_VIA {method: "asked", confidence: 1.0}]->(tp)
// RETURN c
