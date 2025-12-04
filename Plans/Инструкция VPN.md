# Инструкция по подключению к VPN

## Данные для входа в панель управления

- **Адрес:** https://45.144.177.128
- **Логин:** admin
- **Пароль:** Admin123VPN!

> При открытии сайта браузер покажет предупреждение о сертификате — это нормально, нажмите "Продолжить" или "Дополнительно → Перейти на сайт".

---

## Получение конфигурации

1. Откройте панель управления: https://45.144.177.128
2. Войдите с логином и паролем
3. Перейдите в раздел **Users**
4. Создайте нового пользователя или выберите существующего
5. Скопируйте **ссылку подписки** или отсканируйте **QR-код**

---

## Windows

### v2rayN (рекомендуется)

1. Скачайте [v2rayN](https://github.com/2dust/v2rayN/releases) — выберите файл `v2rayN-windows-64.zip`
2. Распакуйте архив в папку (например, `C:\v2rayN`)
3. Запустите `v2rayN.exe`
4. В панели Marzban скопируйте ссылку подписки
5. В v2rayN: **Subscriptions → Add subscription** → Вставьте ссылку
6. Нажмите **Update subscription**
7. Выберите сервер правой кнопкой → **Set as active server**
8. Внизу окна нажмите кнопку подключения

### Nekoray (альтернатива)

1. Скачайте [Nekoray](https://github.com/MatsuriDayo/nekoray/releases) — файл для Windows
2. Распакуйте и запустите
3. **Server → New profile from clipboard** (предварительно скопировав ссылку)
4. Выберите сервер и подключитесь

---

## macOS

### V2Box (бесплатно)

1. Установите [V2Box](https://apps.apple.com/app/v2box-v2ray-client/id6446814690) из App Store
2. Откройте приложение
3. Нажмите **+** → **Import from clipboard**
4. В панели Marzban скопируйте ссылку и вставьте
5. Выберите сервер и подключитесь

### Shadowrocket (~$3)

1. Установите Shadowrocket из App Store
2. Добавьте ссылку подписки
3. Включите VPN

---

## iOS / iPadOS

### Shadowrocket (~$3, рекомендуется)

1. Установите [Shadowrocket](https://apps.apple.com/app/shadowrocket/id932747118) из App Store
2. Откройте приложение
3. Нажмите **+** в правом верхнем углу
4. Выберите **Type → Subscribe**
5. Вставьте ссылку подписки из панели Marzban
6. Нажмите **Done**
7. Выберите сервер и включите переключатель VPN

### V2Box (бесплатно)

1. Установите [V2Box](https://apps.apple.com/app/v2box-v2ray-client/id6446814690) из App Store
2. Отсканируйте QR-код из панели Marzban
3. Подключитесь

### Streisand (бесплатно)

1. Установите [Streisand](https://apps.apple.com/app/streisand/id6450534064)
2. Импортируйте конфигурацию через QR-код или ссылку

---

## Android

### v2rayNG (рекомендуется)

1. Установите [v2rayNG](https://play.google.com/store/apps/details?id=com.v2ray.ang) из Google Play
2. Откройте приложение
3. Нажмите **+** → **Import config from clipboard** или **Scan QR code**
4. Вставьте ссылку из панели Marzban или отсканируйте QR
5. Нажмите на сервер для подключения
6. Подтвердите разрешение VPN

### NekoBox (альтернатива)

1. Скачайте [NekoBox](https://github.com/MatsuriDayo/NekoBoxForAndroid/releases) с GitHub
2. Установите APK
3. Импортируйте конфигурацию через ссылку или QR-код

---

## Ubuntu / Linux

### Nekoray (GUI)

1. Скачайте [Nekoray](https://github.com/MatsuriDayo/nekoray/releases) для Linux
2. Распакуйте: `tar -xzf nekoray-*.tar.gz`
3. Запустите: `./nekoray`
4. Добавьте конфигурацию через ссылку подписки
5. Подключитесь

### v2rayA (веб-интерфейс)

```bash
# Установка
curl -Ls https://raw.githubusercontent.com/v2rayA/v2rayA-installer/main/installer.sh | sudo bash

# Запуск
sudo systemctl start v2raya
sudo systemctl enable v2raya

# Откройте http://localhost:2017 и добавьте ссылку подписки
```

---

## Проверка работы VPN

После подключения откройте в браузере:

| Сайт | Ожидаемый результат |
|------|---------------------|
| https://ifconfig.me | IP: `217.145.79.27` (Финляндия) |
| https://youtube.com | Работает без ограничений |
| https://instagram.com | Работает |
| https://twitter.com | Работает |
| https://yandex.ru | Работает быстро (напрямую) |

---

## Устранение неполадок

### Не подключается
- Проверьте интернет-соединение
- Обновите ссылку подписки в приложении
- Попробуйте другой протокол (VLESS, VMess, Shadowsocks)

### Медленное соединение
- Выберите другой сервер в списке
- Попробуйте протокол Shadowsocks (меньше накладных расходов)

### Не открываются некоторые сайты
- Убедитесь, что VPN подключён (проверьте IP на ifconfig.me)
- Очистите кэш браузера

---

**Поддержка:** При проблемах обращайтесь к администратору
