# mcp-Avito-Server-Mix

Серверный подход к Avito с имитацией браузера.

## Проблема

QRATOR (антибот Avito) блокирует подключения если:
1. TLS fingerprint не соответствует браузеру
2. Неправильные cookies/headers
3. Подозрительная последовательность запросов

## Решение

1. **curl_cffi** — Python библиотека с TLS fingerprint Chrome/Firefox
2. **Playwright cookies** — извлечение сессии из реального браузера
3. **Правильные headers** — полный набор Chrome headers
4. **WebSocket через curl_cffi** — тот же TLS fingerprint

## Структура

```
mcp-Avito-Server-Mix/
├── server.py           # FastAPI сервер
├── avito_browser.py    # Клиент с curl_cffi (TLS fingerprint)
├── avito_ws.py         # WebSocket с правильным fingerprint
├── cookie_extractor.py # Извлечение cookies из Playwright
├── config.json
└── requirements.txt
```

## Тестирование

```bash
# 1. Запустить Playwright для получения cookies
python cookie_extractor.py

# 2. Проверить API
python -c "from avito_browser import AvitoClient; ..."

# 3. Запустить WebSocket
python avito_ws.py
```

## Зависимости

- `curl_cffi` — HTTP с TLS fingerprint
- `websockets` — WebSocket клиент
- `playwright` — для извлечения cookies

## Почему должно работать

Люди используют Avito из офисов — IP не проблема.
Проблема в TLS fingerprint Python клиента.
curl_cffi имитирует TLS fingerprint Chrome.
