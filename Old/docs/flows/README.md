# Документация потоков Eldoleado

*Сгенерировано: 2025-12-04 14:56:23*

---

## Входящие каналы

| Канал | Описание | Документация |
|-------|----------|--------------|
| telegram | Входящее сообщение из Telegram | [channel_telegram.md](channel_telegram.md) |
| avito | Входящее сообщение из Avito | [channel_avito.md](channel_avito.md) |
| max | Входящее сообщение из MAX.ru | [channel_max.md](channel_max.md) |
| whatsapp | Входящее сообщение из WhatsApp | [channel_whatsapp.md](channel_whatsapp.md) |
| vk | Входящее сообщение из VK | [channel_vk.md](channel_vk.md) |
| phone | Входящий звонок | [channel_phone.md](channel_phone.md) |
| form | Заявка с формы на сайте | [channel_form.md](channel_form.md) |

## Действия оператора

| Действие | Описание | Документация |
|----------|----------|--------------|
| normalize | Нормализация текста ответа | [action_normalize.md](action_normalize.md) |
| send_response | Отправка ответа клиенту | [action_send_response.md](action_send_response.md) |
| take_appeal | Взять обращение в работу | [action_take_appeal.md](action_take_appeal.md) |
| reject | Отклонить обращение | [action_reject.md](action_reject.md) |
| send_promo | Отправить промо-материал | [action_send_promo.md](action_send_promo.md) |
| login | Авторизация оператора | [action_login.md](action_login.md) |
| logout | Выход из системы | [action_logout.md](action_logout.md) |
| appeals_list | Список обращений | [action_appeals_list.md](action_appeals_list.md) |
| appeal_detail | Детали обращения | [action_appeal_detail.md](action_appeal_detail.md) |
| device_create | Добавить устройство | [action_device_create.md](action_device_create.md) |
| device_update | Обновить устройство | [action_device_update.md](action_device_update.md) |
| device_delete | Удалить устройство | [action_device_delete.md](action_device_delete.md) |
| repair_create | Добавить ремонт | [action_repair_create.md](action_repair_create.md) |
| repair_update | Обновить ремонт | [action_repair_update.md](action_repair_update.md) |
| repair_delete | Удалить ремонт | [action_repair_delete.md](action_repair_delete.md) |

---

## Использование

```bash
# Сгенерировать всё заново
python scripts/generate_all_flow_docs.py

# Сгенерировать один поток
python scripts/generate_flow_doc.py --channel max
python scripts/generate_flow_doc.py --action normalize
```