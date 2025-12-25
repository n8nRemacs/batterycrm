# Start Session - План на следующую сессию

## Инфраструктура

| Сервер | IP | Сервисы |
|--------|-----|---------|
| **Messenger** | 155.212.221.189 | Все MCP, Redis |
| **n8n** | 185.221.214.83 | n8n, PostgreSQL, Redis |

---

## Приоритет 1: Тест Browser Service

```bash
# Деплой на сервер
cd /opt/mcp-browser-service
docker-compose up -d

# Тест
curl http://155.212.221.189:8792/health
curl -X POST http://155.212.221.189:8792/session/test/create
curl -X POST http://155.212.221.189:8792/session/test/channel/avito/open
```

- [ ] Задеплоить mcp-Browser-Service на 155.212.221.189
- [ ] Проверить логин в Avito через браузер
- [ ] Проверить что QRATOR не блокирует

---

## Приоритет 2: Интеграция с n8n

- [ ] Создать workflow ELO_In_Browser для приёма сообщений
- [ ] Настроить webhook forwarding из Browser Service

---

## Avito подходы

| Подход | Папка | Для чего |
|--------|-------|----------|
| Android WebView | `app/` | Мобильный IP, обход QRATOR |
| Official API | `Avito-Official-Api/` | Webhook входящих (бесплатно) |
| curl_cffi | `mcp-Avito-Server-Mix/` | TLS fingerprint Chrome |
| **Browser Service** | `mcp-Browser-Service/` | Полный браузер, multi-tenant |

**Рекомендация:** Начать с Browser Service — это самый надёжный подход.

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `mcp-Browser-Service/server.py` | REST API для браузера |
| `mcp-Browser-Service/browser_manager.py` | Управление контекстами |
| `mcp-Browser-Service/fingerprint.py` | Генерация отпечатков |
| `CLAUDE.md` | Основной контекст |

---

## SSH доступ

```bash
ssh root@155.212.221.189  # Messenger
ssh root@185.221.214.83   # n8n
```

---

*Последнее обновление: 2025-12-25*
