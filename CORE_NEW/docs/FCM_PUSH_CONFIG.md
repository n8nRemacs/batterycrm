# FCM Push Configuration

> Firebase Cloud Messaging setup for Eldoleado
> Last updated: 2025-12-20

---

## Firebase Project

| Field | Value |
|-------|-------|
| Project ID | `eldoleado` |
| Service Account Email | `firebase-adminsdk-fbsvc@eldoleado.iam.gserviceaccount.com` |
| Credential File | `eldoleado-92fa9b3ffc04.json` |

---

## FCM HTTP v1 API

### Endpoint
```
POST https://fcm.googleapis.com/v1/projects/eldoleado/messages:send
```

### Authentication

OAuth2 with Google Service Account. Requires scope:
```
https://www.googleapis.com/auth/firebase.messaging
```

### Request Body
```json
{
  "message": {
    "token": "<FCM_DEVICE_TOKEN>",
    "notification": {
      "title": "Новое сообщение",
      "body": "<message_text>"
    },
    "data": {
      "dialog_id": "<uuid>",
      "tenant_id": "<uuid>",
      "type": "new_message"
    },
    "android": {
      "priority": "high"
    }
  }
}
```

---

## Python Implementation

```python
import google.auth
from google.oauth2 import service_account
from google.auth.transport.requests import Request
import requests
import json

# Service Account credentials
SERVICE_ACCOUNT_FILE = 'eldoleado-92fa9b3ffc04.json'
SCOPES = ['https://www.googleapis.com/auth/firebase.messaging']
PROJECT_ID = 'eldoleado'

def get_access_token():
    """Get OAuth2 access token from service account."""
    credentials = service_account.Credentials.from_service_account_file(
        SERVICE_ACCOUNT_FILE,
        scopes=SCOPES
    )
    credentials.refresh(Request())
    return credentials.token

def send_fcm_push(fcm_token: str, title: str, body: str, data: dict = None):
    """Send FCM push notification."""

    access_token = get_access_token()

    url = f'https://fcm.googleapis.com/v1/projects/{PROJECT_ID}/messages:send'

    headers = {
        'Authorization': f'Bearer {access_token}',
        'Content-Type': 'application/json'
    }

    message = {
        'message': {
            'token': fcm_token,
            'notification': {
                'title': title,
                'body': body
            },
            'android': {
                'priority': 'high'
            }
        }
    }

    if data:
        message['message']['data'] = {k: str(v) for k, v in data.items()}

    response = requests.post(url, headers=headers, json=message)
    response.raise_for_status()

    return response.json()

# Example usage
if __name__ == '__main__':
    result = send_fcm_push(
        fcm_token='device_fcm_token_here',
        title='Новое сообщение',
        body='Привет от клиента',
        data={
            'dialog_id': 'uuid-here',
            'tenant_id': 'uuid-here',
            'type': 'new_message'
        }
    )
    print(result)
```

### Dependencies
```
pip install google-auth google-auth-oauthlib requests
```

---

## Service Account Private Key

```
-----BEGIN PRIVATE KEY-----
MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCujR+Wss/CQ9JV
dJiwwy0pH9kR2Yr1MYZNBZEPC+BBiZLKUhoIP04TMjuXHQlsuKwfRGUDBO2dKBcv
MHKJ3iezYiroyrIkSz+/CPEHlRcjdgwH8tlQYadLpxKbYqrEGqU3+U+CDDeQTKhB
x89220TSx51UodQZIhcuv9zoiXWkbNam8TBveVKyuyaob9PNBF2XmauKZjf8tC1x
ld15l2VJBkqBKYuO/IrRnIBF7K7vi/UmHQGbi1l4PUsHHGj7/64T0DcJoK/02uBz
0ZOFRTKmwesq7ANug+P76wgni4OBxluupwGUW+dSOjWlAe7Fyy6NtylxzMygC6GZ
Yqy2XR6LAgMBAAECggEASt07UaqyofrtwPonrRShD3TZ6KZ5y20o0WsUSrRIxEMp
or3w7V2dcm1GkqsBClDwfd6bRl68PP3fZ71rOsd+FpmBluOs4RUnK5u9qQdga7Sr
N1OIskmX88IeIGgCnuZgu2+iEsCDqk++kKwOxscHrzGvQIfCDN+KuuHOcSvXuaPA
aWy/R+c98/8pMyii06T3uOqV90RfVuEDlfrWfzhh/vDxKWF7ywwbfZMJVMgBhMb+
j4M1SUSw+2uubhWRpQT8qrsHo00jUnDKMjmEZ9lvYvMeLrcL72a0oXKAbSxJi9Wm
Czz3UYpDYIoOmcJe8aaCQ2fOsEuzTZvVUMKxwe9cmQKBgQDqP5A1QgAFqUOnp2Hf
983/rkPlFDqQjcZqPSf2KxPNPyWmEOOPA6dGhbB5EMPS7SXgzDiLHW7vxRqX8olA
pn5xxrpG7hWJYjjAM9EVTX3dsjJWlgLWL5G8TK+dLLvlLs9+bkh/U4uqd/LhzlRG
MGe37cEILoXNeH4/rEVOnwEWWQKBgQC+wnikB9BX3kXq019Yz3jP8sbcQwvzGxTP
wCKwXWIbo9PrCsJW8O3KdDMvuWz7NGrZSdxU5krp8T47qgMDvAS0w9COxHkEMhCU
zvmf73BOkmwYm0G5QvKJiOgAurJEb5QZL0+EaV+Lxquuty4a8B0tMPsGPoiGVKpU
5HeM7PxHgwKBgGld1BkQqf/h5ku4b78VsTSMB4A4fCtfiltpTNte/xY4jE/JkwJW
a1y+b+XVE7CB+aLHWbvBro/tggvNDc3l1kSJVmrnVwqoAsz5wdeqNq6NJDVsXrRH
S29+sxOo9o+dYboGE1gqlU1FjRvi+mdkCJNkP4rVmlwVEfzEGZzGyu9pAoGBAJ7G
FsvQhSTdqKwviqjM5u2OUN58H7IU1Fmmvji1QTdoQLbdmavrlMBxvzj1yTO9CUIa
K/2uQKQ/W2ElvKSbFf+vDCQIfAF1+j8hlrv7+yoqzTYd47JjeqPnA9O3kTFM/aOI
sVKwsgoRLkyZwxJA0MgQgJ9N5SyJw8ws7SSrC8ApAoGBANB0UpLkoKvo5GEtqiLn
RHsaMa9U7w1Crbvm4JR5RhTe80kNVNx7znVXanyPOE3Qe251bHtSR2Qx1g1a52wx
r0eXgjwLIFtzt3ZmFLFGZ4bdrtxqTdHJDQFWamW1Y7K5w5kYyD3m3ISKjJrlePTU
Z6m4wqgHK1aErtx1REV9qsqb
-----END PRIVATE KEY-----
```

---

## Database: Get FCM Tokens

```sql
SELECT
  od.fcm_token,
  od.operator_id,
  o.name as operator_name
FROM elo_t_operator_devices od
JOIN elo_t_operators o ON o.id = od.operator_id
WHERE od.tenant_id = :tenant_id
  AND od.fcm_token IS NOT NULL
  AND od.device_type = 'mobile'
  AND o.is_active = true;
```

---

## n8n Workflow Configuration

### Node: Get Operator FCM Tokens
- **Type:** PostgreSQL
- **Query:** See SQL above

### Node: Send FCM Push
- **Type:** HTTP Request
- **Method:** POST
- **URL:** `https://fcm.googleapis.com/v1/projects/eldoleado/messages:send`
- **Authentication:** Google Service Account API
- **Body:**
```json
{
  "message": {
    "token": "{{ $json.fcm_token }}",
    "notification": {
      "title": "Новое сообщение",
      "body": "{{ $('Webhook').first().json.text.substring(0, 100) }}"
    },
    "data": {
      "dialog_id": "{{ $('Webhook').first().json.dialog_id }}",
      "tenant_id": "{{ $('Webhook').first().json.tenant_id }}",
      "type": "new_message"
    },
    "android": {
      "priority": "high"
    }
  }
}
```

---

*Generated: 2025-12-20*
