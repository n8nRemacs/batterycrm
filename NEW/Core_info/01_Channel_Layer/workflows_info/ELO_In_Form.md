# ELO_In_Form

> Входящий workflow для Web-форм и квизов

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Файл** | `NEW/workflows/ELO_In/ELO_In_Form.json` |
| **Триггер** | Webhook POST `/form` |
| **Вызывается из** | Лендинги, квизы, формы обратной связи |
| **Вызывает** | Execute Client Resolver, ELO_Core_Tenant_Resolver |
| **Выход** | HTTP Response (без Redis очереди!) |

---

## Назначение

Принимает заявки с web-форм, нормализует контактные данные и создаёт клиента/диалог.

**Особенность:** Не использует Redis очередь — сразу обрабатывает через Client Resolver.

---

## Входные данные

```json
{
  "phone": "+79991234567",
  "name": "Иван Петров",
  "phone_model": "iPhone 14",
  "message": "Разбил экран",
  "email": "ivan@example.com",
  "source": "quiz_landing",
  "form_id": "repair-quiz-1",
  "form_name": "Квиз ремонт телефонов"
}
```

**Поддерживаемые варианты полей:**
- phone / telephone / mobile / cell
- name / full_name / client_name / customer_name
- phone_model / model / device_model / device
- message / comment / description / text

---

## Выходные данные

**HTTP Response:**
```json
{
  "success": true,
  "message": "Спасибо! Мы свяжемся с вами в ближайшее время."
}
```

---

## Ноды

### 1. Form Trigger

| Параметр | Значение |
|----------|----------|
| **ID** | `39820b0b-a59e-41d8-b548-c397a65d1f5b` |
| **Path** | `/form` |
| **Response Mode** | lastNode |

---

### 2. Normalize Form

| Параметр | Значение |
|----------|----------|
| **ID** | `2a784909-75d9-46fa-9dba-3be9ae9ba689` |
| **Тип** | n8n-nodes-base.code |

**Код:**
```javascript
const formData = $input.first().json;

// Извлекаем данные из формы/квиза
const phone = formData.phone || formData.telephone || formData.mobile || formData.cell || null;
const name = formData.name || formData.full_name || formData.client_name || null;
const phoneModel = formData.phone_model || formData.model || formData.device_model || null;
const message = formData.message || formData.comment || formData.description || formData.text || '';
const email = formData.email || null;
const source = formData.source || formData.utm_source || formData.form_source || 'form';
const formId = formData.form_id || formData.quiz_id || formData.id || null;
const formName = formData.form_name || formData.quiz_name || null;

// Формируем текст сообщения
let messageText = '';
if (phoneModel) {
  messageText += `Модель: ${phoneModel}\n`;
}
if (message) {
  messageText += message;
}
if (!messageText.trim()) {
  messageText = '[Заявка с формы без текста]';
}

// Нормализация телефона
let cleanPhone = null;
if (phone) {
  cleanPhone = phone.replace(/\D/g, '');
  // 8 → 7
  if (cleanPhone.length === 11 && cleanPhone.startsWith('8')) {
    cleanPhone = '7' + cleanPhone.substring(1);
  }
  // 9xxxxxxxxx → 7
  if (cleanPhone.length === 10 && cleanPhone.startsWith('9')) {
    cleanPhone = '7' + cleanPhone;
  }
  cleanPhone = '+' + cleanPhone;
}

return {
  channel: 'form',
  external_user_id: cleanPhone?.replace(/\+/g, '') || email || 'unknown',
  external_chat_id: cleanPhone || email || 'unknown',

  text: messageText.trim(),
  timestamp: new Date().toISOString(),

  client_phone: cleanPhone,
  client_name: name,
  client_email: email,

  media: {
    has_voice: false,
    has_images: false,
    has_video: false,
    has_document: false
  },

  meta: {
    external_message_id: formId || Date.now().toString(),
    ad_channel: 'form',
    form_source: source,
    form_id: formId,
    form_name: formName
  },

  prefilled_data: {
    model: phoneModel,  // <-- предзаполненная модель!
    parts_owner: null
  }
};
```

---

### 3. Execute Client Resolver

| Параметр | Значение |
|----------|----------|
| **ID** | `e650cfe1-5df0-4c05-823c-5c01eaca330f` |
| **Вызывает** | `$env.CLIENT_RESOLVER_WORKFLOW_ID` |

---

### 4. Execute Tenant Resolver

| Параметр | Значение |
|----------|----------|
| **ID** | `9168577b-2691-4a26-abbd-0333e92cf428` |
| **Вызывает** | ELO_Core_Tenant_Resolver (rRO6sxLqiCdgvLZz) |

---

### 5. Respond Success

```json
{
  "success": true,
  "message": "Спасибо! Мы свяжемся с вами в ближайшее время."
}
```

---

## Схема потока

```
Form Trigger → Normalize Form → Execute Client Resolver → Execute Tenant Resolver → Respond Success
```

**Без Redis!** Форма обрабатывается синхронно.

---

## Особенности

| Особенность | Описание |
|-------------|----------|
| **Без очереди** | Синхронная обработка, нет Redis |
| **prefilled_data.model** | Модель телефона из формы сразу в prefilled |
| **Нормализация телефона** | 8→7, добавление недостающей 7 |
| **Fallback ID** | email или 'unknown' если нет телефона |
| **form_source** | UTM метка или название источника |

---

## Env переменные

| Переменная | Описание |
|------------|----------|
| `CLIENT_RESOLVER_WORKFLOW_ID` | ID workflow для создания/поиска клиента |
