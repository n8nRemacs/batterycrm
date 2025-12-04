# Техническое задание
## Настройка VPN-инфраструктуры с проксированием через российский сервер

---

## 1. Общее описание проекта

Цель проекта — создание отказоустойчивой VPN-инфраструктуры с централизованным управлением, где российский сервер выступает точкой входа (entry node), а зарубежный сервер в Финляндии обеспечивает выход в интернет.

Такая архитектура позволяет обходить ограничения ТСПУ, поскольку трансграничный трафик идёт между дата-центрами, а не от конечных пользователей.

---

## 2. Инфраструктура

### 2.1. Серверы

| Параметр | RU сервер (Entry) | FI сервер (Exit) |
|----------|-------------------|------------------|
| IP-адрес | 45.144.177.128 | 217.145.79.27 |
| Локация | Россия | Финляндия |
| Роль | Entry node, маршрутизация | Exit node, выход в интернет |
| ПО | Docker, Marzban/3X-UI | OpenVPN, VLESS, Trojan |
| Протоколы входа | WireGuard, IKEv2 | — |

### 2.2. Архитектура сети

```
[Клиент] → [RU сервер] → [FI сервер] → [Интернет]
              │                │
              │                └── WireGuard tunnel
              │
              └── Внутрироссийский трафик (не анализируется ТСПУ)
```

Между клиентом и RU-сервером — внутрироссийский трафик (не анализируется ТСПУ). Между RU и FI — межсерверный трафик через WireGuard.

---

## 3. Этапы реализации

### 3.1. Подготовка FI-сервера (Exit node)

На сервере уже установлены OpenVPN, VLESS, Trojan. Необходимо:

1. Проверить работоспособность существующих протоколов
2. Настроить WireGuard для связи с RU-сервером (site-to-site)
3. Открыть порт для WireGuard (например, 51820/UDP)
4. Настроить NAT/masquerade для исходящего трафика

### 3.2. Настройка RU-сервера (Entry node)

1. Установить WireGuard и настроить туннель до FI-сервера
2. Установить панель управления (Marzban или 3X-UI) через Docker
3. Настроить inbound-протоколы для клиентов: WireGuard, IKEv2
4. Настроить маршрутизацию (split tunneling)
5. Настроить DNS-резолвинг через туннель

### 3.3. Настройка клиентов

1. iOS/macOS: IKEv2 (встроенный) или WireGuard из App Store
2. Android: WireGuard из Google Play
3. Windows: встроенный IKEv2 или WireGuard-клиент
4. Генерация QR-кодов/конфигов через панель управления

---

## 4. Конфигурация маршрутизации (Xray)

### 4.1. Полный конфиг routing для RU-сервера

```json
{
  "routing": {
    "domainStrategy": "IPIfNonMatch",
    "rules": [
      {
        "type": "field",
        "ip": ["geoip:private"],
        "outboundTag": "direct"
      },
      {
        "type": "field",
        "domain": [
          "domain:youtube.com",
          "domain:googlevideo.com",
          "domain:ytimg.com",
          "domain:ggpht.com",
          "domain:youtu.be"
        ],
        "outboundTag": "finland"
      },
      {
        "type": "field",
        "domain": [
          "domain:openai.com",
          "domain:anthropic.com",
          "domain:claude.ai",
          "domain:gemini.google.com",
          "domain:bard.google.com",
          "domain:ai.google.com"
        ],
        "outboundTag": "finland"
      },
      {
        "type": "field",
        "domain": [
          "domain:instagram.com",
          "domain:cdninstagram.com",
          "domain:facebook.com",
          "domain:fbcdn.net",
          "domain:twitter.com",
          "domain:x.com",
          "domain:twimg.com",
          "domain:tiktok.com",
          "domain:tiktokcdn.com"
        ],
        "outboundTag": "finland"
      },
      {
        "type": "field",
        "domain": [
          "domain:telegram.org",
          "domain:t.me",
          "domain:whatsapp.com",
          "domain:whatsapp.net",
          "domain:wa.me"
        ],
        "outboundTag": "finland"
      },
      {
        "type": "field",
        "ip": [
          "91.108.4.0/22",
          "91.108.8.0/22",
          "91.108.12.0/22",
          "91.108.16.0/22",
          "91.108.56.0/22",
          "149.154.160.0/20"
        ],
        "outboundTag": "finland"
      },
      {
        "type": "field",
        "domain": [
          "domain:github.com",
          "domain:githubusercontent.com",
          "domain:figma.com",
          "domain:discord.com",
          "domain:midjourney.com",
          "domain:cursor.sh",
          "domain:linear.app",
          "domain:cloudflare.com"
        ],
        "outboundTag": "finland"
      },
      {
        "type": "field",
        "domain": ["geosite:category-ru"],
        "outboundTag": "direct"
      },
      {
        "type": "field",
        "ip": ["geoip:ru"],
        "outboundTag": "direct"
      },
      {
        "type": "field",
        "network": "tcp,udp",
        "outboundTag": "finland"
      }
    ]
  },
  "outbounds": [
    {
      "tag": "finland",
      "protocol": "wireguard",
      "settings": {
        "secretKey": "ПРИВАТНЫЙ_КЛЮЧ_RU_СЕРВЕРА",
        "address": ["10.0.0.2/32"],
        "peers": [
          {
            "publicKey": "ПУБЛИЧНЫЙ_КЛЮЧ_FI_СЕРВЕРА",
            "endpoint": "217.145.79.27:51820",
            "allowedIPs": ["0.0.0.0/0"]
          }
        ]
      }
    },
    {
      "tag": "direct",
      "protocol": "freedom"
    }
  ]
}
```

### 4.2. Логика маршрутизации

| Категория | Домены/IP | Маршрут |
|-----------|-----------|---------|
| Локальная сеть | geoip:private | DIRECT |
| YouTube | youtube.com, googlevideo.com, ytimg.com | Finland |
| AI-сервисы | openai.com, anthropic.com, claude.ai, gemini | Finland |
| Соцсети | instagram, facebook, twitter/x, tiktok | Finland |
| Мессенджеры | telegram, whatsapp | Finland |
| Dev tools | github, figma, discord, midjourney, cursor | Finland |
| Российские сайты | geosite:category-ru, geoip:ru | DIRECT |
| Всё остальное | * | Finland |

---

## 5. Преимущества архитектуры

- **Централизованное управление** — все изменения только на RU-сервере
- **Простота для пользователей** — нативные клиенты, один QR-код
- **Обход ТСПУ** — трансграничный трафик идёт между дата-центрами
- **Оптимизация скорости** — российские сайты идут напрямую
- **Масштабируемость** — легко добавлять пользователей через панель
- **Отказоустойчивость** — при проблемах с FI-сервером легко переключить outbound

---

## 6. План тестирования

1. Проверить связность WireGuard-туннеля между серверами (ping, iperf)
2. Проверить доступ к заблокированным ресурсам (YouTube, Instagram, Claude)
3. Проверить корректность split tunneling (российские сайты — напрямую)
4. Проверить DNS-резолвинг заблокированных доменов
5. Проверить подключение с разных устройств и ОС
6. Замерить латентность и скорость (speedtest)

---

## 7. Рекомендации по безопасности

- [ ] Сменить пароли SSH на обоих серверах
- [ ] Настроить SSH-ключи и отключить вход по паролю
- [ ] Настроить fail2ban для защиты от брутфорса
- [ ] Ограничить доступ к панели управления по IP или через VPN
- [ ] Настроить автоматические обновления безопасности
- [ ] Регулярно обновлять Xray/WireGuard/панель управления

---

## 8. Следующие шаги (опционально)

После базовой настройки можно реализовать:

1. Telegram-бот для выдачи конфигов семье/подписчикам
2. Интеграция с платёжной системой (ЮKassa) для монетизации
3. Лимиты трафика и устройств на пользователя
4. Мониторинг и алерты (Grafana, Prometheus)
5. Резервное копирование конфигурации

---

**Дата:** Декабрь 2024  
**Версия:** 1.1
