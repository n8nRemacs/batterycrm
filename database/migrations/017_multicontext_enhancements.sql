-- ============================================================================
-- Миграция 017: Мультиконтекст - owner_label и touchpoints
-- Дата: 2025-12-04
-- Задача: Поддержка ТЗ "Мультиконтекстный диалоговый движок"
-- ============================================================================

-- ============================================================================
-- 1. Добавляем owner_label в appeal_devices
-- Позволяет различать "мой iPhone" от "iPhone сына"
-- ============================================================================

ALTER TABLE appeal_devices 
ADD COLUMN IF NOT EXISTS owner_label VARCHAR(100);

COMMENT ON COLUMN appeal_devices.owner_label IS 'Метка владельца: свой, сына, жены, мамы и т.д.';

-- Индекс для поиска по owner_label
CREATE INDEX IF NOT EXISTS idx_appeal_devices_owner ON appeal_devices(owner_label);

-- ============================================================================
-- 2. Добавляем conversation_context поля в appeals
-- Для отслеживания текущего фокуса диалога
-- ============================================================================

ALTER TABLE appeals
ADD COLUMN IF NOT EXISTS conversation_context JSONB DEFAULT '{}';

ALTER TABLE appeals
ADD COLUMN IF NOT EXISTS conversation_focus JSONB DEFAULT '{}';

ALTER TABLE appeals
ADD COLUMN IF NOT EXISTS last_mentioned_device_id UUID REFERENCES appeal_devices(id);

ALTER TABLE appeals
ADD COLUMN IF NOT EXISTS last_mentioned_repair_id UUID REFERENCES appeal_repairs(id);

COMMENT ON COLUMN appeals.conversation_context IS 'Контекст диалога: история упоминаний устройств/ремонтов';
COMMENT ON COLUMN appeals.conversation_focus IS 'Текущий фокус: {device_id, repair_id, device_order}';
COMMENT ON COLUMN appeals.last_mentioned_device_id IS 'Последнее упомянутое устройство';
COMMENT ON COLUMN appeals.last_mentioned_repair_id IS 'Последний упомянутый ремонт';

-- ============================================================================
-- 3. Создаём таблицу touchpoints (точки касания)
-- Объединяет: сообщения, звонки, визиты, ретаргетинг
-- ============================================================================

CREATE TABLE IF NOT EXISTS touchpoints (
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  tenant_id UUID NOT NULL REFERENCES tenants(id),
  client_id UUID REFERENCES clients(id),
  appeal_id UUID REFERENCES appeals(id),
  
  -- Тип и направление
  type VARCHAR(50) NOT NULL, -- message, call, visit, retargeting, email, form
  direction VARCHAR(20) NOT NULL DEFAULT 'inbound', -- inbound, outbound
  channel VARCHAR(50), -- telegram, whatsapp, avito, vk, phone, web, email
  
  -- Связи с сущностями (для контекста)
  device_id UUID REFERENCES appeal_devices(id),
  repair_id UUID REFERENCES appeal_repairs(id),
  
  -- Контент
  content_text TEXT,
  content_media_type VARCHAR(50),
  content_media_url TEXT,
  
  -- Метаданные
  raw_payload JSONB,
  extracted_entities JSONB, -- {devices: [], repairs: [], intents: []}
  
  -- AI обработка
  ai_parsed BOOLEAN DEFAULT FALSE,
  ai_response_id UUID,
  
  -- Временные метки
  occurred_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
  processed_at TIMESTAMPTZ,
  created_at TIMESTAMPTZ DEFAULT NOW()
);

-- Индексы
CREATE INDEX IF NOT EXISTS idx_touchpoints_client ON touchpoints(client_id);
CREATE INDEX IF NOT EXISTS idx_touchpoints_appeal ON touchpoints(appeal_id);
CREATE INDEX IF NOT EXISTS idx_touchpoints_tenant ON touchpoints(tenant_id);
CREATE INDEX IF NOT EXISTS idx_touchpoints_type ON touchpoints(type);
CREATE INDEX IF NOT EXISTS idx_touchpoints_channel ON touchpoints(channel);
CREATE INDEX IF NOT EXISTS idx_touchpoints_occurred ON touchpoints(occurred_at DESC);
CREATE INDEX IF NOT EXISTS idx_touchpoints_device ON touchpoints(device_id);

COMMENT ON TABLE touchpoints IS 'Точки касания: все взаимодействия с клиентом (сообщения, звонки, визиты)';
COMMENT ON COLUMN touchpoints.type IS 'Тип: message, call, visit, retargeting, email, form';
COMMENT ON COLUMN touchpoints.direction IS 'Направление: inbound (от клиента), outbound (к клиенту)';
COMMENT ON COLUMN touchpoints.extracted_entities IS 'Извлечённые AI сущности: устройства, ремонты, интенты';

-- ============================================================================
-- 4. Миграция данных из messages_history в touchpoints
-- ============================================================================

INSERT INTO touchpoints (
  tenant_id,
  client_id, 
  appeal_id,
  type,
  direction,
  channel,
  content_text,
  content_media_type,
  content_media_url,
  occurred_at,
  created_at
)
SELECT 
  mh.tenant_id,
  a.client_id,
  mh.appeal_id,
  'message' as type,
  CASE WHEN mh.message_type = 'client' THEN 'inbound' ELSE 'outbound' END as direction,
  a.ad_channel as channel,
  mh.message_text as content_text,
  mh.media_type as content_media_type,
  mh.media_url as content_media_url,
  mh.created_at as occurred_at,
  mh.created_at
FROM messages_history mh
JOIN appeals a ON a.id = mh.appeal_id
WHERE NOT EXISTS (
  SELECT 1 FROM touchpoints tp 
  WHERE tp.appeal_id = mh.appeal_id 
  AND tp.content_text = mh.message_text 
  AND tp.occurred_at = mh.created_at
);

-- ============================================================================
-- Готово
-- ============================================================================

SELECT 'Миграция 017 выполнена: owner_label, conversation_context, touchpoints' as result;
