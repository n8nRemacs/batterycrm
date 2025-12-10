-- ============================================================================
-- ОТКАТ МИГРАЦИИ: Multi-Device Architecture
-- Дата: 2025-11-22
-- ⚠️ ВНИМАНИЕ: Это удалит все данные из новых таблиц!
-- ============================================================================

DO $$
BEGIN
  RAISE NOTICE '========================================';
  RAISE NOTICE '⚠️  ОТКАТ МИГРАЦИИ 001';
  RAISE NOTICE '========================================';
  RAISE WARNING 'Это удалит все данные из таблиц:';
  RAISE WARNING '- appeal_devices';
  RAISE WARNING '- appeal_repairs';
  RAISE WARNING '- context_fields_config';
  RAISE WARNING 'И удалит новые поля из таблицы appeals';
  RAISE NOTICE '========================================';
END $$;

-- Пауза для осознания (можно раскомментировать для подтверждения)
-- SELECT pg_sleep(5);

-- ============================================================================
-- 1. Удаление VIEW
-- ============================================================================
DROP VIEW IF EXISTS v_appeals_with_devices CASCADE;
RAISE NOTICE 'VIEW v_appeals_with_devices удалено';

-- ============================================================================
-- 2. Удаление триггеров
-- ============================================================================
DROP TRIGGER IF EXISTS update_appeal_devices_updated_at ON appeal_devices;
DROP TRIGGER IF EXISTS update_appeal_repairs_updated_at ON appeal_repairs;
DROP TRIGGER IF EXISTS update_context_fields_config_updated_at ON context_fields_config;
RAISE NOTICE 'Триггеры удалены';

-- ============================================================================
-- 3. Удаление таблиц (в правильном порядке - сначала зависимые)
-- ============================================================================

-- Удаляем таблицу ремонтов (зависит от appeal_devices)
DROP TABLE IF EXISTS appeal_repairs CASCADE;
RAISE NOTICE 'Таблица appeal_repairs удалена';

-- Удаляем таблицу устройств (зависит от appeals)
DROP TABLE IF EXISTS appeal_devices CASCADE;
RAISE NOTICE 'Таблица appeal_devices удалена';

-- Удаляем таблицу конфигурации
DROP TABLE IF EXISTS context_fields_config CASCADE;
RAISE NOTICE 'Таблица context_fields_config удалена';

-- ============================================================================
-- 4. Удаление новых полей из appeals
-- ============================================================================
ALTER TABLE appeals DROP COLUMN IF EXISTS conversation_context;
ALTER TABLE appeals DROP COLUMN IF EXISTS context_completion_status;
ALTER TABLE appeals DROP COLUMN IF EXISTS conversation_focus;
ALTER TABLE appeals DROP COLUMN IF EXISTS last_greeting_at;
RAISE NOTICE 'Новые поля из таблицы appeals удалены';

-- ============================================================================
-- 5. Удаление функции (если не используется где-то ещё)
-- ============================================================================
DROP FUNCTION IF EXISTS update_updated_at_column() CASCADE;
RAISE NOTICE 'Функция update_updated_at_column() удалена';

-- ============================================================================
-- ОТКАТ ЗАВЕРШЁН
-- ============================================================================
DO $$
BEGIN
  RAISE NOTICE '========================================';
  RAISE NOTICE '✅ Откат миграции 001 завершён';
  RAISE NOTICE '========================================';
  RAISE NOTICE 'Удалено:';
  RAISE NOTICE '- VIEW v_appeals_with_devices';
  RAISE NOTICE '- Таблица appeal_repairs';
  RAISE NOTICE '- Таблица appeal_devices';
  RAISE NOTICE '- Таблица context_fields_config';
  RAISE NOTICE '- Поля из appeals (conversation_context, conversation_focus, ...)';
  RAISE NOTICE '- Триггеры и функции';
  RAISE NOTICE '========================================';
  RAISE WARNING 'Для восстановления данных используйте backup!';
END $$;
