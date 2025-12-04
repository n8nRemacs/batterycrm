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

## 9. Статус реализации

### 9.1. Выполнено

| Компонент | Статус | Детали |
|-----------|--------|--------|
| WireGuard на FI | ✅ Готово | 10.0.0.1/24, порт 51820/UDP |
| WireGuard на RU | ✅ Готово | 10.0.0.2/24, туннель до FI |
| Marzban | ✅ Готово | Панель управления на RU |
| Nginx + SSL | ✅ Готово | Reverse proxy для Marzban |
| Xray routing | ✅ Готово | Split tunneling через wg0 |

### 9.2. Данные для доступа

- **Панель управления Marzban:** https://45.144.177.128 (самоподписанный сертификат)
- **Логин:** admin
- **Пароль:** Admin123VPN!

### 9.3. WireGuard ключи (для справки)

**FI Server (Exit node):**
- Public Key: `NkyrHg+iS2U1U+7n2Fpky9ue79khXNtOZ1EoR5ZWGlM=`
- IP в туннеле: 10.0.0.1

**RU Server (Entry node):**
- Public Key: `rUFL4LLAipj1UvP5yKJOi6h4vSJ8pliLij9OPUMIYzA=`
- IP в туннеле: 10.0.0.2

---

## 10. Инструкции по настройке клиентов

### 10.1. Получение конфигурации

1. Откройте панель управления: https://45.144.177.128
2. Войдите с логином `admin` и паролем `Admin123VPN!`
3. Создайте нового пользователя в разделе Users
4. Скачайте конфигурацию или отсканируйте QR-код

### 10.2. Windows

**Вариант 1: v2rayN (рекомендуется)**
1. Скачайте [v2rayN](https://github.com/2dust/v2rayN/releases) (последняя версия)
2. Распакуйте архив в удобную папку
3. Запустите `v2rayN.exe`
4. В панели Marzban скопируйте ссылку подписки
5. В v2rayN: Subscriptions → Add subscription → Вставьте ссылку
6. Нажмите Update subscription
7. Выберите сервер и нажмите "Activate"

**Вариант 2: Nekoray**
1. Скачайте [Nekoray](https://github.com/MatsuriDayo/nekoray/releases)
2. Распакуйте и запустите
3. Добавьте ссылку подписки: Server → New profile from clipboard
4. Подключитесь к серверу

### 10.3. macOS

**Вариант 1: V2Box (App Store)**
1. Установите [V2Box](https://apps.apple.com/app/v2box-v2ray-client/id6446814690) из App Store
2. Откройте приложение
3. Нажмите "+" → "Import from clipboard"
4. В панели Marzban скопируйте ссылку и вставьте в V2Box
5. Подключитесь к серверу

**Вариант 2: Shadowrocket (платный)**
1. Установите Shadowrocket из App Store (~$3)
2. Добавьте ссылку подписки
3. Включите VPN

### 10.4. iOS / iPadOS

**Вариант 1: Shadowrocket (рекомендуется, ~$3)**
1. Установите [Shadowrocket](https://apps.apple.com/app/shadowrocket/id932747118) из App Store
2. Откройте приложение
3. Нажмите "+" в правом верхнем углу
4. Выберите "Type" → "Subscribe"
5. Вставьте ссылку подписки из панели Marzban
6. Нажмите "Done"
7. Выберите сервер и включите переключатель VPN

**Вариант 2: V2Box (бесплатно)**
1. Установите [V2Box](https://apps.apple.com/app/v2box-v2ray-client/id6446814690)
2. Отсканируйте QR-код из панели Marzban
3. Подключитесь

**Вариант 3: Streisand (бесплатно)**
1. Установите [Streisand](https://apps.apple.com/app/streisand/id6450534064)
2. Импортируйте конфигурацию через QR-код или ссылку

### 10.5. Android

**Вариант 1: v2rayNG (рекомендуется)**
1. Установите [v2rayNG](https://play.google.com/store/apps/details?id=com.v2ray.ang) из Google Play
2. Откройте приложение
3. Нажмите "+" → "Import config from clipboard" или "Scan QR code"
4. Вставьте ссылку из панели Marzban или отсканируйте QR
5. Нажмите на сервер для подключения
6. Подтвердите разрешение VPN

**Вариант 2: NekoBox**
1. Скачайте [NekoBox](https://github.com/MatsuriDayo/NekoBoxForAndroid/releases) с GitHub
2. Установите APK
3. Импортируйте конфигурацию через ссылку или QR-код

### 10.6. Ubuntu / Linux

**Вариант 1: Nekoray (GUI)**
1. Скачайте [Nekoray](https://github.com/MatsuriDayo/nekoray/releases) для Linux
2. Распакуйте и запустите
3. Добавьте конфигурацию через ссылку подписки
4. Подключитесь

**Вариант 2: v2rayA (веб-интерфейс)**
```bash
# Установка
curl -Ls https://raw.githubusercontent.com/v2rayA/v2rayA-installer/main/installer.sh | sudo bash

# Запуск
sudo systemctl start v2raya

# Откройте http://localhost:2017 и добавьте ссылку подписки
```

**Вариант 3: Xray напрямую (для продвинутых)**
```bash
# Установка Xray
bash -c "$(curl -L https://github.com/XTLS/Xray-install/raw/main/install-release.sh)" @ install

# Скопируйте конфиг из панели Marzban в /usr/local/etc/xray/config.json
# Запустите
sudo systemctl start xray
```

---

## 11. Проверка работы VPN

После подключения проверьте:

1. **IP-адрес:** Откройте https://ifconfig.me — должен показать `217.145.79.27` (Финляндия)
2. **YouTube:** Откройте youtube.com — должен работать без ограничений
3. **Telegram:** Должен работать без прокси
4. **Российские сайты:** Yandex, VK, Госуслуги — должны открываться напрямую (быстро)

---

## 12. Устранение неполадок

### Не подключается к VPN
- Проверьте, что ссылка подписки актуальна
- Попробуйте другой протокол (VLESS, VMess, Shadowsocks)
- Проверьте интернет-соединение

### Медленное соединение
- Попробуйте другой сервер/порт
- Проверьте загрузку процессора на устройстве
- Используйте протокол с меньшими накладными расходами (Shadowsocks)

### Не работают российские сайты
- Отключите VPN для проверки
- Проверьте правила маршрутизации в панели

---

**Дата:** Декабрь 2024
**Версия:** 2.0 (реализовано)
