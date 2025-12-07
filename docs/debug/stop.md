# Отладка: Redis PUSH не работает в n8n

**Дата:** 2025-12-06
**Статус:** ЗАКРЫТО (2025-12-07) — проблема была в другом

---

## Исходная гипотеза (НЕВЕРНАЯ)

Думали что PUSH не записывает данные в Redis.

## Реальная проблема

**PUSH работает!** Данные записывались корректно.

Проблема была в **BAT Batch Debouncer**:
- Использовал GET для чтения `queue:batch:*`
- Но данные там хранятся как **list** (записаны через PUSH)
- GET для list возвращает NULL
- Debouncer считал batch пустым и удалял очередь

---

## Как нашли

```bash
# Проверили тип ключа
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! TYPE "queue:batch:telegram:tg_1132511247"'
# Результат: list

# Проверили содержимое
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! LRANGE "queue:batch:telegram:tg_1132511247" 0 -1'
# Результат: JSON данные есть!
```

---

## Решение

См. `start.md` — подробные инструкции по исправлению BAT Batch Debouncer.

Кратко:
1. Добавить "Pop Batch Job" для чтения из `queue:debounce:pending`
2. Исправить "Init Debouncer" — парсить `raw.value`
3. Заменить GET на 10 параллельных POP
4. Убрать лишний DELETE (POP уже удаляет)

---

## Урок

Перед исправлением всегда проверять:
1. Тип ключа в Redis (`TYPE key`)
2. Есть ли данные (`LRANGE` для list, `GET` для string)
3. Что реально возвращает нода (смотреть output в n8n)
