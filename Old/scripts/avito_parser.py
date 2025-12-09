"""
Avito Messenger Parser
Парсит все чаты и сообщения из Avito мессенджера

Использование:
1. Залогиньтесь на m.avito.ru в браузере
2. Откройте DevTools (F12) → Application → Cookies
3. Скопируйте значение cookie 'sessid'
4. Запустите: python scripts/avito_parser.py --sessid "ваш_sessid"
"""

import argparse
import json
import time
import os
from datetime import datetime
from pathlib import Path

import requests


class AvitoMessengerParser:
    def __init__(self, sessid: str, output_dir: str = "avito_chats"):
        self.session = requests.Session()
        self.session.cookies.set('sessid', sessid)
        self.session.cookies.set('auth', '1')
        self.session.headers.update({
            'Content-Type': 'application/json',
            'Accept': 'application/json, text/plain, */*',
            'Origin': 'https://m.avito.ru',
            'Referer': 'https://m.avito.ru/profile/messenger',
            'User-Agent': 'Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36'
        })
        self.base_url = 'https://m.avito.ru/web/1/messenger'
        self.output_dir = Path(output_dir)
        self.output_dir.mkdir(exist_ok=True)

    def get_channels(self, limit: int = 30, category: int = 1, offset_timestamp: int = None) -> dict:
        """Получить список чатов"""
        payload = {
            'limit': limit,
            'category': category,
            'filters': {'anyTags': [], 'excludeTags': []}
        }
        if offset_timestamp:
            payload['offsetTimestamp'] = offset_timestamp

        resp = self.session.post(f'{self.base_url}/getChannels', json=payload)
        resp.raise_for_status()
        return resp.json()

    def get_all_channels(self, category: int = 1) -> list:
        """Получить ВСЕ чаты с пагинацией"""
        all_channels = []
        offset = None
        page = 1

        print(f"\n📥 Загрузка чатов (категория {category})...")

        while True:
            try:
                data = self.get_channels(limit=30, category=category, offset_timestamp=offset)
            except requests.exceptions.HTTPError as e:
                print(f"❌ Ошибка HTTP: {e}")
                if e.response.status_code == 401:
                    print("   → Сессия истекла. Получите новый sessid.")
                break
            except Exception as e:
                print(f"❌ Ошибка: {e}")
                break

            success = data.get('success', {})
            channels = success.get('channels', [])

            if not channels:
                break

            all_channels.extend(channels)
            print(f"   Страница {page}: +{len(channels)} чатов (всего: {len(all_channels)})")

            if not success.get('hasMore', False):
                break

            # Берём sortingTimestamp последнего чата как offset
            offset = channels[-1]['sortingTimestamp']
            page += 1

            # Rate limit protection
            time.sleep(1.5)

        return all_channels

    def get_messages(self, channel_id: str, limit: int = 100) -> list:
        """Получить сообщения чата"""
        payload = {
            'channelId': channel_id,
            'limit': limit,
            'order': 0
        }
        resp = self.session.post(f'{self.base_url}/getUserVisibleMessages', json=payload)
        resp.raise_for_status()
        data = resp.json()
        return data.get('success', {}).get('messages', [])

    def get_all_messages(self, channel_id: str) -> list:
        """Получить ВСЕ сообщения чата (с пагинацией если нужно)"""
        # Пока берём последние 100 сообщений
        # TODO: добавить пагинацию для длинных чатов
        return self.get_messages(channel_id, limit=100)

    def parse_timestamp(self, ns_timestamp: int) -> str:
        """Конвертировать наносекунды в читаемую дату"""
        if not ns_timestamp:
            return None
        seconds = ns_timestamp / 1_000_000_000
        return datetime.fromtimestamp(seconds).strftime('%Y-%m-%d %H:%M:%S')

    def extract_channel_info(self, channel: dict) -> dict:
        """Извлечь полезную информацию из чата"""
        info = channel.get('info', {})
        last_msg = channel.get('lastMessage', {})
        users = channel.get('users', [])

        # Найти собеседника (не себя)
        other_user = None
        for user in users:
            if user.get('id') != channel.get('userId'):
                other_user = user
                break

        return {
            'id': channel.get('id'),
            'type': 'item' if channel.get('id', '').startswith('u2i-') else 'support',
            'created': self.parse_timestamp(channel.get('created')),
            'updated': self.parse_timestamp(channel.get('updated')),
            'is_read': channel.get('isRead', False),
            'is_answered': channel.get('isAnswered', False),
            'item_title': info.get('details', {}).get('title'),
            'contact_name': other_user.get('name') if other_user else info.get('name'),
            'contact_id': other_user.get('id') if other_user else None,
            'last_message_text': last_msg.get('body', {}).get('text', {}).get('text'),
            'last_message_date': self.parse_timestamp(last_msg.get('createdAt')),
        }

    def extract_message_info(self, message: dict, my_user_id: str) -> dict:
        """Извлечь полезную информацию из сообщения"""
        body = message.get('body', {})
        text_obj = body.get('text', {})

        return {
            'id': message.get('id'),
            'date': self.parse_timestamp(message.get('createdAt')),
            'is_mine': message.get('authorId') == my_user_id,
            'author_id': message.get('authorId'),
            'text': text_obj.get('text') if isinstance(text_obj, dict) else str(text_obj),
            'is_first': message.get('isFirstMessage', False),
            'read_at': self.parse_timestamp(message.get('readAt')),
        }

    def parse_all(self, categories: list = [1, 2], save_raw: bool = False):
        """Спарсить все чаты и сообщения"""
        all_data = {
            'parsed_at': datetime.now().isoformat(),
            'chats': []
        }

        # Собираем чаты из всех категорий
        all_channels = []
        for cat in categories:
            channels = self.get_all_channels(category=cat)
            all_channels.extend(channels)
            time.sleep(1)

        # Убираем дубликаты по ID
        seen_ids = set()
        unique_channels = []
        for ch in all_channels:
            if ch['id'] not in seen_ids:
                seen_ids.add(ch['id'])
                unique_channels.append(ch)

        print(f"\n📊 Найдено {len(unique_channels)} уникальных чатов")
        print(f"\n💬 Загрузка сообщений...")

        # Определяем свой user_id из первого чата
        my_user_id = unique_channels[0].get('userId') if unique_channels else None

        for i, channel in enumerate(unique_channels, 1):
            channel_info = self.extract_channel_info(channel)
            print(f"   [{i}/{len(unique_channels)}] {channel_info['contact_name'] or 'Unknown'}: {channel_info['item_title'] or 'N/A'}")

            try:
                messages = self.get_all_messages(channel['id'])
                channel_info['messages'] = [
                    self.extract_message_info(msg, my_user_id)
                    for msg in messages
                ]
                channel_info['message_count'] = len(messages)
            except Exception as e:
                print(f"      ⚠️ Ошибка загрузки сообщений: {e}")
                channel_info['messages'] = []
                channel_info['message_count'] = 0
                channel_info['error'] = str(e)

            if save_raw:
                channel_info['_raw'] = channel

            all_data['chats'].append(channel_info)

            # Rate limit
            time.sleep(1)

        # Сохраняем результат
        output_file = self.output_dir / f"avito_chats_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json"
        with open(output_file, 'w', encoding='utf-8') as f:
            json.dump(all_data, f, ensure_ascii=False, indent=2)

        print(f"\n✅ Готово! Сохранено в: {output_file}")
        print(f"   Чатов: {len(all_data['chats'])}")
        print(f"   Сообщений: {sum(ch['message_count'] for ch in all_data['chats'])}")

        # Также сохраняем в читаемом формате
        self.save_readable(all_data)

        return all_data

    def save_readable(self, data: dict):
        """Сохранить в читаемом текстовом формате"""
        output_file = self.output_dir / f"avito_chats_{datetime.now().strftime('%Y%m%d_%H%M%S')}.txt"

        with open(output_file, 'w', encoding='utf-8') as f:
            f.write(f"AVITO CHATS EXPORT\n")
            f.write(f"Дата экспорта: {data['parsed_at']}\n")
            f.write(f"Всего чатов: {len(data['chats'])}\n")
            f.write("=" * 80 + "\n\n")

            for chat in data['chats']:
                f.write(f"{'=' * 80}\n")
                f.write(f"ЧАТ: {chat['contact_name'] or 'Unknown'}\n")
                f.write(f"Объявление: {chat['item_title'] or 'N/A'}\n")
                f.write(f"Создан: {chat['created']}\n")
                f.write(f"Обновлён: {chat['updated']}\n")
                f.write(f"Сообщений: {chat['message_count']}\n")
                f.write("-" * 80 + "\n\n")

                # Сообщения в хронологическом порядке
                for msg in reversed(chat.get('messages', [])):
                    sender = "Я" if msg['is_mine'] else chat['contact_name']
                    f.write(f"[{msg['date']}] {sender}:\n")
                    f.write(f"  {msg['text']}\n\n")

                f.write("\n")

        print(f"   Читаемый формат: {output_file}")


def main():
    parser = argparse.ArgumentParser(description='Avito Messenger Parser')
    parser.add_argument('--sessid', required=True, help='Cookie sessid из браузера')
    parser.add_argument('--output', default='avito_chats', help='Папка для результатов')
    parser.add_argument('--categories', default='1,2', help='Категории чатов (1=продажи, 2=покупки)')
    parser.add_argument('--raw', action='store_true', help='Сохранять сырые данные')

    args = parser.parse_args()

    categories = [int(c) for c in args.categories.split(',')]

    print("🚀 Avito Messenger Parser")
    print(f"   Output: {args.output}/")
    print(f"   Categories: {categories}")

    parser = AvitoMessengerParser(sessid=args.sessid, output_dir=args.output)
    parser.parse_all(categories=categories, save_raw=args.raw)


if __name__ == '__main__':
    main()
