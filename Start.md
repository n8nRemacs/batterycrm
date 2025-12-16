# START - Context for Continuing Work

## FIRST — Sync

**If reading this file SECOND time after git pull — SKIP this block and go to next section!**

```bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
```

After git pull — REREAD this file from the beginning (Start.md), starting from the next section (skipping this sync block to avoid loops).

---

## Last update date and time
**17 December 2025, 02:15 (UTC+4)**

---

## Проект: Android Messager — Омниканальный мессенджер

### Что это
Мобильное приложение для операторов сервисных центров. Общение с клиентами через разные мессенджеры (Avito, MAX, Telegram) из одного интерфейса + клиентский прокси для парсинга цен.

### Текущий статус
- ✅ tunnel-server ЗАДЕПЛОЕН на 155.212.221.189:8800
- ✅ WebSocket протокол реализован
- ✅ Android TunnelService готов
- ✅ ROADMAP.md обновлён с Phase 4 (n8n)
- ⏳ **NEXT: n8n интеграция + Android UI**

---

## NEXT: Phase 4 — n8n Integration

### Приоритеты на завтра:

#### 1. tunnel-server: добавить интеграцию с n8n
- [ ] Forward incoming messages → n8n webhook
- [ ] `/api/send` endpoint для отправки сообщений
- [ ] Push to Android via WebSocket

#### 2. n8n Workflows
- [ ] `ELO_Incoming_Message` — приём → Neo4j → Push
- [ ] `ELO_Outgoing_Draft` — нормализация текста
- [ ] `ELO_Outgoing_Send` — отправка через tunnel
- [ ] `ELO_Audio_Transcribe` — Whisper транскрипция

#### 3. Android App (app_original)
- [ ] Экран "Клиенты" (список диалогов)
- [ ] Кнопки выбора канала [TG] [Avito] [MAX] [📞]
- [ ] Кнопка звонка (ACTION_DIAL)
- [ ] SpeechRecognizer для голосового ввода

---

## Архитектура сообщений

```
ВХОДЯЩЕЕ:
Клиент → Phone (Termux) → tunnel-server → n8n webhook
    → Neo4j (Client, Message)
    → Whisper (если аудио)
    → Push → Android App оператора

ИСХОДЯЩЕЕ:
Оператор (голос/текст) → tunnel-server → n8n
    → Нормализация (OpenRouter)
    → Return draft → Оператор [Отправить]
    → Neo4j → tunnel-server → Phone → API мессенджера
```

---

## Омниканальность

Один клиент может писать с разных каналов. UI:
```
[TG ✓] [Avito ✗] [MAX ○] [📞]  +7 900 123-45-67
```
- ✓ = выбран для ответа
- ✗ = недоступен (нет аккаунта)
- ○ = доступен, не выбран
- 📞 = звонок (если есть номер)

---

## Технологии

| Задача | Технология |
|--------|------------|
| Транскрипция входящих | Whisper API (n8n) |
| Транскрипция исходящих | Android SpeechRecognizer |
| Нормализация текста | OpenRouter (дешёвая модель) |
| Batching | Redis (TTL 3 сек) |
| Push в Android | WebSocket через tunnel-server |

---

## Серверы

| Server | IP | Что там | Статус |
|--------|-----|---------|--------|
| **RU** | 45.144.177.128 | neo4j, redis | ✅ Ready |
| **n8n** | 185.221.214.83 | n8n, postgresql | ✅ Ready |
| **TUNNEL** | 155.212.221.189 | tunnel-server:8800 | ✅ RUNNING |

---

## Quick Commands

```bash
# Проверить tunnel-server
curl http://155.212.221.189:8800/api/health

# Логи
ssh root@155.212.221.189 "docker logs tunnel-server --tail 50"

# Re-deploy
cd "/c/Users/User/Eldoleado/NEW/MVP/Android Messager/tunnel-server"
scp -r app main.py requirements.txt Dockerfile docker-compose.yml root@155.212.221.189:/opt/eldoleado/tunnel-server/
ssh root@155.212.221.189 "cd /opt/eldoleado/tunnel-server && docker-compose down && docker-compose build --no-cache && docker-compose up -d"
```

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `NEW/MVP/Android Messager/ROADMAP.md` | **Полный роадмап с Phase 4** |
| `NEW/MVP/Android Messager/tunnel-server/` | Бэкенд (DEPLOYED) |
| `NEW/MVP/Android Messager/app_original/` | Android App |

---

**Before ending session:** update Start.md, Stop.md, git push
