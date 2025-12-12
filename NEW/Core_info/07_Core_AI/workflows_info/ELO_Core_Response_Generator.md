# ELO_Core_Response_Generator

> Generates AI response based on context, stage, and cursor position

---

## General Information

| Parameter | Value |
|-----------|-------|
| **ID** | NEW (to be created) |
| **File** | `NEW/workflows/ELO_Core/ELO_Core_Response_Generator.json` |
| **Trigger** | Execute Workflow Trigger |
| **Called from** | ELO_Core_AI_Orchestrator |
| **Calls** | AI Tool (OpenRouter) |

---

## Purpose

Generate contextually appropriate response:

1. Build prompt based on current stage and cursor
2. Include trigger actions (files, messages)
3. Call AI for response generation
4. Format response for channel (buttons, markdown)

---

## Response Strategy

```
┌─────────────────────────────────────────────────────────┐
│                 RESPONSE STRATEGY                        │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  STAGE: data_collection                                 │
│  FOCUS LINE: line_0 (cursor=2, need symptom)           │
│                                                         │
│  → AI Goal: Ask for missing slot (symptom)             │
│  → Context: Device already known                       │
│  → Tone: Friendly, professional                        │
│                                                         │
│  OUTPUT: "Какая проблема с iPhone 14 Pro?"             │
│                                                         │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  STAGE: presentation                                    │
│  All lines complete                                     │
│  Derived: price=8500                                   │
│                                                         │
│  → AI Goal: Present price, show value                  │
│  → Include: warranty info, benefits                    │
│  → Buttons: "Записаться", "Уточнить"                   │
│                                                         │
│  OUTPUT: "Замена дисплея iPhone 14 Pro — 8500₽.        │
│           Гарантия 6 месяцев. Записать?"               │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

---

## Input Data

```json
{
  "context": {
    "tenant_id": "uuid",
    "client_id": "uuid",
    "dialog_id": "uuid",
    "vertical_id": 1,
    "current_stage": "data_collection",
    "lines": [
      {
        "id": "line_0",
        "status": "active",
        "cursor": 1,
        "slots": {
          "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
          "symptom": null
        }
      }
    ],
    "focus_line_id": "line_0",
    "client": {
      "name": "Ivan"
    }
  },
  "triggers_fired": [
    {
      "action": {
        "type": "send_message",
        "message": "Работаем ежедневно с 10 до 20"
      }
    }
  ]
}
```

---

## Output Data

```json
{
  "response": {
    "text": "Привет, Ivan! Что случилось с iPhone 14 Pro?",
    "buttons": [],
    "attachments": [],
    "metadata": {
      "stage": "data_collection",
      "asking_for": "symptom",
      "ai_model": "qwen/qwen3-30b-a3b"
    }
  }
}
```

---

## Nodes

### 1. Execute Workflow Trigger

Entry point from Orchestrator.

---

### 2. Determine Response Goal

**Type:** Code Node

```javascript
const context = $json.context;
const triggersFired = $json.triggers_fired || [];

const stage = context.current_stage;
const focusLine = context.lines.find(l => l.id === context.focus_line_id);

let responseGoal = {
  type: 'ask_slot',
  slot: null,
  stage: stage
};

// Determine what to ask for based on stage
switch (stage) {
  case 'data_collection':
    if (focusLine) {
      // Find first empty required slot
      const requiredSlots = ['device', 'symptom'];
      for (const slot of requiredSlots) {
        if (!focusLine.slots[slot]) {
          responseGoal.slot = slot;
          break;
        }
      }

      // If all required filled, check optional
      if (!responseGoal.slot) {
        responseGoal.type = 'confirm_data';
      }
    }
    break;

  case 'presentation':
    responseGoal.type = 'present_offer';
    responseGoal.include_price = true;
    responseGoal.include_warranty = true;
    break;

  case 'agreement':
    responseGoal.type = 'ask_confirmation';
    break;

  case 'booking':
    // Find first empty booking slot
    const bookingSlots = ['date', 'time', 'name', 'phone'];
    const booking = context.booking || {};
    for (const slot of bookingSlots) {
      if (!booking[slot]) {
        responseGoal.type = 'ask_booking_slot';
        responseGoal.slot = slot;
        break;
      }
    }
    break;

  case 'confirmation':
    responseGoal.type = 'ask_final_confirmation';
    break;
}

// Add trigger messages to include
responseGoal.trigger_messages = triggersFired
  .filter(t => t.action?.type === 'send_message')
  .map(t => t.action.message);

responseGoal.trigger_files = triggersFired
  .filter(t => t.action?.type === 'send_file')
  .map(t => ({
    file: t.action.params?.file,
    message: t.action.message
  }));

return {
  context: context,
  response_goal: responseGoal,
  focus_line: focusLine
};
```

---

### 3. Build AI Prompt

**Type:** Code Node

```javascript
const context = $json.context;
const goal = $json.response_goal;
const focusLine = $json.focus_line;

// Prompts per goal type
const PROMPTS = {
  ask_slot: {
    device: `Спроси у клиента какое устройство нужно отремонтировать.
Будь дружелюбным, используй имя клиента если известно.
Примеры: "Какое устройство нужно починить?", "Что за телефон?"`,

    symptom: `Спроси у клиента что случилось с устройством.
Устройство уже известно: {device}.
Примеры: "Что произошло с {device}?", "Какая проблема?"`,

    diagnosis: `Уточни детали проблемы для точной диагностики.
Устройство: {device}, Симптом: {symptom}.`
  },

  present_offer: `Представь клиенту предложение по ремонту.
Включи:
- Стоимость: {price}₽
- Гарантия: 6 месяцев
- Время ремонта: около часа

Устройство: {device}
Проблема: {symptom}
Диагноз: {diagnosis}

Будь уверенным, но не агрессивным. Предложи записаться.`,

  ask_confirmation: `Спроси готов ли клиент записаться на ремонт.
Цена уже показана. Не повторяй всю информацию.
Примеры: "Записываем?", "Готовы прийти?"`,

  ask_booking_slot: {
    date: `Спроси удобную дату для визита.
Примеры: "На какой день записать?", "Когда удобно?"`,

    time: `Спроси удобное время.
Дата выбрана: {date}.
Примеры: "Во сколько удобно?", "Какое время?"`,

    name: `Спроси имя для записи если не известно.
Пример: "Как вас записать?"`,

    phone: `Спроси телефон для связи если не известен.
Пример: "Оставьте номер для подтверждения записи"`
  },

  ask_final_confirmation: `Попроси подтвердить запись.
Дата: {date}, Время: {time}
Устройство: {device}
Ремонт: {repair}
Цена: {price}₽

Пример: "Подтверждаете запись на {date} в {time}?"`,

  confirm_data: `Подтверди собранные данные и спроси что делать дальше.
Устройство: {device}
Проблема: {symptom}

Пример: "Понял, {device}, {symptom}. Сейчас посмотрю цену."`
};

// Get prompt template
let promptTemplate = '';
if (goal.type === 'ask_slot') {
  promptTemplate = PROMPTS.ask_slot[goal.slot] || PROMPTS.ask_slot.device;
} else if (goal.type === 'ask_booking_slot') {
  promptTemplate = PROMPTS.ask_booking_slot[goal.slot] || PROMPTS.ask_booking_slot.date;
} else {
  promptTemplate = PROMPTS[goal.type] || PROMPTS.ask_slot.device;
}

// Replace placeholders
const replacements = {
  '{device}': focusLine?.slots?.device
    ? `${focusLine.slots.device.brand} ${focusLine.slots.device.model}`
    : 'устройство',
  '{symptom}': focusLine?.slots?.symptom?.text || 'проблема',
  '{diagnosis}': focusLine?.slots?.diagnosis?.text || 'диагностика',
  '{repair}': focusLine?.slots?.repair_type?.text || 'ремонт',
  '{price}': focusLine?.slots?.price?.amount || '???',
  '{date}': context.booking?.date || 'дата',
  '{time}': context.booking?.time || 'время'
};

for (const [key, value] of Object.entries(replacements)) {
  promptTemplate = promptTemplate.replace(new RegExp(key, 'g'), value);
}

// Build system prompt
const systemPrompt = `Ты — AI-ассистент сервисного центра по ремонту телефонов.

ПРАВИЛА:
1. Отвечай на русском языке
2. Будь кратким (1-3 предложения)
3. Используй имя клиента: ${context.client?.name || 'клиент'}
4. Не здоровайся повторно в диалоге
5. Не задавай несколько вопросов сразу
6. Будь дружелюбным и профессиональным

${goal.trigger_messages?.length > 0 ? `
ТАКЖЕ ВКЛЮЧИ В ОТВЕТ:
${goal.trigger_messages.join('\n')}
` : ''}`;

// Build user message (context for AI)
const userMessage = `Контекст диалога:
- Этап: ${goal.stage}
- Задача: ${goal.type}
${goal.slot ? `- Спросить: ${goal.slot}` : ''}

${promptTemplate}

Сгенерируй ТОЛЬКО ответ клиенту, без пояснений.`;

return {
  system_prompt: systemPrompt,
  user_message: userMessage,
  goal: goal,
  context: context
};
```

---

### 4. Call AI (OpenRouter)

**Type:** HTTP Request

**URL:** `https://openrouter.ai/api/v1/chat/completions`

**Headers:**
```
Authorization: Bearer {{ $env.OPENROUTER_API_KEY }}
Content-Type: application/json
```

**Body:**
```json
{
  "model": "qwen/qwen3-30b-a3b",
  "messages": [
    {
      "role": "system",
      "content": "{{ $json.system_prompt }}"
    },
    {
      "role": "user",
      "content": "{{ $json.user_message }}"
    }
  ],
  "temperature": 0.7,
  "max_tokens": 300
}
```

---

### 5. Parse AI Response

**Type:** Code Node

```javascript
const response = $json;
const goal = $('Build AI Prompt').first().json.goal;
const context = $('Build AI Prompt').first().json.context;

let responseText = '';
try {
  responseText = response.choices?.[0]?.message?.content || '';
  // Clean up
  responseText = responseText.trim();
  // Remove thinking tags if present (Qwen3)
  responseText = responseText.replace(/<think>[\s\S]*?<\/think>/g, '').trim();
} catch (e) {
  responseText = 'Спасибо за сообщение! Чем могу помочь?';
}

return {
  text: responseText,
  goal: goal,
  context: context,
  model: response.model,
  tokens: response.usage?.total_tokens
};
```

---

### 6. Build Buttons

**Type:** Code Node

```javascript
const goal = $json.goal;
const context = $json.context;
const text = $json.text;

let buttons = [];

// Add buttons based on stage/goal
switch (goal.stage) {
  case 'presentation':
    buttons = [
      { text: 'Записаться', callback_data: 'book' },
      { text: 'Уточнить', callback_data: 'clarify' }
    ];
    break;

  case 'agreement':
    buttons = [
      { text: 'Да, записать', callback_data: 'confirm_book' },
      { text: 'Нет, спасибо', callback_data: 'decline' }
    ];
    break;

  case 'booking':
    if (goal.slot === 'date') {
      // Generate date buttons (next 3 days)
      const today = new Date();
      buttons = [0, 1, 2].map(offset => {
        const date = new Date(today);
        date.setDate(date.getDate() + offset);
        const dateStr = date.toLocaleDateString('ru-RU', { day: 'numeric', month: 'short' });
        return {
          text: offset === 0 ? 'Сегодня' : offset === 1 ? 'Завтра' : dateStr,
          callback_data: `date_${date.toISOString().split('T')[0]}`
        };
      });
    } else if (goal.slot === 'time') {
      buttons = [
        { text: '10:00', callback_data: 'time_10:00' },
        { text: '14:00', callback_data: 'time_14:00' },
        { text: '18:00', callback_data: 'time_18:00' }
      ];
    }
    break;

  case 'confirmation':
    buttons = [
      { text: 'Подтверждаю', callback_data: 'confirm' },
      { text: 'Изменить', callback_data: 'change' }
    ];
    break;
}

return {
  text: text,
  buttons: buttons,
  goal: goal,
  context: context,
  model: $json.model,
  tokens: $json.tokens
};
```

---

### 7. Add Trigger Attachments

**Type:** Code Node

```javascript
const goal = $json.goal;
const text = $json.text;
const buttons = $json.buttons;

let attachments = [];

// Add files from triggers
if (goal.trigger_files?.length > 0) {
  attachments = goal.trigger_files.map(f => ({
    type: 'file',
    filename: f.file,
    caption: f.message
  }));
}

return {
  response: {
    text: text,
    buttons: buttons,
    attachments: attachments,
    metadata: {
      stage: goal.stage,
      asking_for: goal.slot || goal.type,
      ai_model: $json.model,
      tokens_used: $json.tokens
    }
  }
};
```

---

## Flow Diagram

```
Execute Trigger
       │
       ▼
┌──────────────────────┐
│ Determine Goal       │  ← What to ask/say based on stage
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│ Build AI Prompt      │  ← System + user prompts
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│ Call OpenRouter      │  ← Qwen3-30B
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│ Parse AI Response    │  ← Extract text
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│ Build Buttons        │  ← Add action buttons
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│ Add Attachments      │  ← Files from triggers
└──────────┬───────────┘
           │
           ▼
      Return response
```

---

## Response Goals Reference

### ask_slot

| Slot | Goal | Example Response |
|------|------|------------------|
| device | Ask what device | "Какой телефон нужно починить?" |
| symptom | Ask what's wrong | "Что случилось с iPhone?" |
| diagnosis | Clarify problem | "Экран совсем не работает или есть трещины?" |

### present_offer

Present price and value proposition with call-to-action.

```
"Замена дисплея iPhone 14 Pro — 8500₽.
Используем оригинальные запчасти.
Гарантия 6 месяцев. Записать на сегодня?"
```

### ask_confirmation

Simple yes/no question about proceeding.

```
"Записываем?"
```

### ask_booking_slot

| Slot | Example |
|------|---------|
| date | "На какой день записать?" |
| time | "Во сколько удобно?" |
| name | "Как вас записать?" |
| phone | "Номер для подтверждения?" |

### ask_final_confirmation

Summary + confirmation request.

```
"Записал: завтра в 14:00, iPhone 14 Pro, замена дисплея, 8500₽. Подтверждаете?"
```

---

## Button Templates

### Presentation Stage

```json
[
  {"text": "Записаться", "callback_data": "book"},
  {"text": "Уточнить цену", "callback_data": "clarify_price"},
  {"text": "Другая проблема", "callback_data": "other_issue"}
]
```

### Agreement Stage

```json
[
  {"text": "Да, записать", "callback_data": "confirm_book"},
  {"text": "Подумаю", "callback_data": "think"},
  {"text": "Нет", "callback_data": "decline"}
]
```

### Booking: Date

```json
[
  {"text": "Сегодня", "callback_data": "date_2024-12-10"},
  {"text": "Завтра", "callback_data": "date_2024-12-11"},
  {"text": "Другой день", "callback_data": "date_other"}
]
```

### Booking: Time

```json
[
  {"text": "10:00", "callback_data": "time_10:00"},
  {"text": "14:00", "callback_data": "time_14:00"},
  {"text": "18:00", "callback_data": "time_18:00"},
  {"text": "Другое", "callback_data": "time_other"}
]
```

### Confirmation Stage

```json
[
  {"text": "Подтверждаю", "callback_data": "confirm"},
  {"text": "Изменить дату", "callback_data": "change_date"},
  {"text": "Отмена", "callback_data": "cancel"}
]
```

---

## AI Model Configuration

### Qwen3-30B (Default for Response)

```json
{
  "model": "qwen/qwen3-30b-a3b",
  "temperature": 0.7,
  "max_tokens": 300
}
```

**Pros:** Fast, cheap, good Russian
**Cons:** May need <think> tag cleanup

### Claude 3.5 Sonnet (Premium)

```json
{
  "model": "anthropic/claude-3-5-sonnet",
  "temperature": 0.7,
  "max_tokens": 500
}
```

**Pros:** Best quality, natural responses
**Cons:** Expensive ($3/1M tokens)

---

## Error Handling

| Error | Fallback Response |
|-------|-------------------|
| AI timeout | "Спасибо за сообщение! Обрабатываю..." |
| Empty response | "Чем могу помочь?" |
| Rate limit | "Минутку, сейчас отвечу..." |
| Parse error | Generic response based on stage |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| External | OpenRouter API | AI response generation |
| Input | context | Current dialog state |
| Input | triggers_fired | Trigger actions to include |
| Output | response | Formatted response |
