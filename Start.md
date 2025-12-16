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
**17 December 2025, 00:10 (UTC+4)**

---

## Проект: Android Messager — Омниканальный мессенджер

### Что это
Мобильное приложение для операторов сервисных центров. Общение с клиентами через разные мессенджеры (Avito, VK, MAX, Telegram, WhatsApp) из одного интерфейса + клиентский прокси для парсинга цен.

### Текущий статус
- ✅ Документация и архитектура готовы
- ✅ ROADMAP.md создан с деплоем и API
- ⏳ **NEXT: Бэкенд (tunnel-server)**
- ⏳ Android приложение
- ⏳ Тестирование

---

## Архитектура: tunnel-server + mobile-server

### Схема
```
┌─────────────────────────────────────────────────────────────────┐
│                         VPS SERVER                               │
│  ┌─────────────────────────────────────────────────────────────┐│
│  │                    tunnel-server:8800                        ││
│  │  - WebSocket hub for all phones                             ││
│  │  - API for MCP servers                                      ││
│  │  - Proxy Manager (load balancing)                           ││
│  │  - AI Pipeline (future)                                     ││
│  └─────────────────────────────────────────────────────────────┘│
│                              ▲                                   │
│                              │ WebSocket                         │
└──────────────────────────────┼──────────────────────────────────┘
                               │
        ┌──────────────────────┼──────────────────────┐
        │                      │                      │
        ▼                      ▼                      ▼
┌───────────────┐    ┌───────────────┐    ┌───────────────┐
│   Phone 1     │    │   Phone 2     │    │   Phone N     │
│ mobile-server │    │ mobile-server │    │ mobile-server │
│  - Telegram   │    │  - WhatsApp   │    │  - Proxy only │
│  - Avito      │    │  - VK         │    │               │
│  - Proxy      │    │  - Proxy      │    │               │
└───────────────┘    └───────────────┘    └───────────────┘
```

### Три режима работы телефона
1. **Messenger Only** — только каналы мессенджеров
2. **Proxy Only** — только HTTP прокси для парсинга цен
3. **Both** — всё вместе

---

## Ключевые папки и файлы

| Путь | Описание |
|------|----------|
| `NEW/MVP/Android Messager/` | **Основная папка проекта** |
| `NEW/MVP/Android Messager/ROADMAP.md` | **Роадмап, деплой, API, env** |
| `NEW/MVP/Android Messager/tunnel-server/` | Бэкенд на VPS |
| `NEW/MVP/Android Messager/mobile-server/` | Клиент для Termux на телефоне |
| `NEW/MVP/Android Messager/app_original/` | Android приложение (Kotlin) |

---

## Серверы

| Server | IP | Что там | Статус |
|--------|-----|---------|--------|
| **RU** | 45.144.177.128 | neo4j, redis, marzban (VPN) | ✅ Ready |
| **n8n** | 185.221.214.83 | n8n, postgresql | ✅ Ready |
| **NEW** | 155.212.221.189 | Будет tunnel-server | ⏳ Deploy needed |

---

## Секреты

| Параметр | Значение | Где |
|----------|----------|-----|
| SSH Password | Mi31415926pSss! | Все серверы |
| Neo4j Password | Mi31415926pS | 45.144.177.128 |
| PostgreSQL | supabase_admin | 185.221.214.83:6544 |
| TUNNEL_SECRET | <generate 32 chars> | tunnel ↔ phone |

---

## TODO: План разработки

### Phase 1: Backend (tunnel-server) ⏳ CURRENT

1. **Подготовить tunnel-server код**
   - [ ] Доработать `tunnel-server/app/main.py`
   - [ ] Реализовать WebSocket hub
   - [ ] Реализовать ProxyManager
   - [ ] API endpoints из ROADMAP.md

2. **Деплой на VPS**
   - [ ] SSH to 155.212.221.189 (или другой)
   - [ ] Docker или systemd setup
   - [ ] Nginx + SSL (wss://)
   - [ ] Firewall rules

### Phase 2: Mobile Client (mobile-server) ⏳

1. **Подготовить mobile-server код**
   - [ ] WebSocket клиент к tunnel-server
   - [ ] HTTP proxy handler (proxy_fetch)
   - [ ] Telegram/Avito/VK channel handlers

2. **Деплой на Termux**
   - [ ] Инструкция для пользователей
   - [ ] .env.example с примерами
   - [ ] start.sh скрипт

### Phase 3: Android App ⏳

1. **Обновить приложение**
   - [ ] TunnelService для WebSocket
   - [ ] UI для включения/выключения сервисов
   - [ ] Push notifications (FCM)

2. **Сборка и тестирование**
   - [ ] Build APK
   - [ ] Install on test device
   - [ ] End-to-end testing

---

## Quick Commands

```bash
# Проверить сервера
ssh root@45.144.177.128 "docker ps"
ssh root@185.221.214.83 "docker ps"

# Локальная разработка
cd "C:/Users/User/Documents/Eldoleado/NEW/MVP/Android Messager"

# Сборка APK
cd C:/Users/User/Documents/Eldoleado
export JAVA_HOME="/c/Program Files/Android/Android Studio/jbr"
./gradlew.bat :app:assembleDebug
```

---

## Полная документация

Смотри: `NEW/MVP/Android Messager/ROADMAP.md`

Там есть:
- ✅ Полная архитектура
- ✅ Deployment checklist для VPS и Termux
- ✅ .env примеры для обоих компонентов
- ✅ Nginx config для WSS
- ✅ Все API endpoints
- ✅ External APIs (Telegram, Avito, VK)
- ✅ Security checklist
- ✅ Troubleshooting

---

**Before ending session:** update Start.md, Stop.md, git push
