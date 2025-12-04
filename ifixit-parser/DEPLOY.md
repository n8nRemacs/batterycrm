# Деплой iFixit Parser на сервер

## 1. Загрузить архив на сервер

```bash
# С локальной машины
scp ifixit-parser.tar.gz root@45.144.177.128:/opt/
```

## 2. На сервере: распаковать и установить

```bash
# Подключиться к серверу
ssh root@45.144.177.128

# Распаковать
cd /opt
tar -xzvf ifixit-parser.tar.gz
cd ifixit-parser

# Создать виртуальное окружение (если Python 3.11+)
python3 -m venv venv
source venv/bin/activate

# Установить зависимости
pip install -e .

# Проверить конфигурацию
cat .env
```

## 3. Тестовый запуск

```bash
cd /opt/ifixit-parser
source venv/bin/activate

# Проверить API
python -m src.parser.main test-api

# Проверить БД
python -m src.parser.main init
```

## 4. Запуск парсинга в фоне

```bash
# С уведомлениями в Telegram
nohup python -m src.parser.main full-parse --category Phone > parser.log 2>&1 &

# Или для всех категорий
nohup python -m src.parser.main full-parse > parser.log 2>&1 &

# Проверить лог
tail -f parser.log
```

## 5. Через screen (рекомендуется)

```bash
# Установить screen если нет
apt install screen -y

# Создать сессию
screen -S ifixit-parser

# В сессии
cd /opt/ifixit-parser
source venv/bin/activate
python -m src.parser.main full-parse --category Phone

# Отключиться от сессии: Ctrl+A, затем D
# Вернуться: screen -r ifixit-parser
```

## Команды парсера

```bash
# Полный парсинг одной категории
python -m src.parser.main full-parse --category Phone

# Несколько категорий
python -m src.parser.main full-parse -c Phone -c Tablet -c Computer

# Ограничить количество гайдов
python -m src.parser.main full-parse --category Phone --max-guides 100

# Без Telegram уведомлений
python -m src.parser.main full-parse --category Phone --no-notify

# Только статистика
python -m src.parser.main stats
```
