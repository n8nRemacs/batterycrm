package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import z01.g;
import z01.t;
import z01.u;

/* loaded from: classes7.dex */
public final class PushReceiver extends BroadcastReceiver {

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Context f363639b;

        /* renamed from: c, reason: collision with root package name */
        public final Intent f363640c;

        public a(Context context, Intent intent, c cVar) {
            this.f363639b = context;
            this.f363640c = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            Intent intent2 = this.f363640c;
            intent.setPackage(intent2.getPackage());
            try {
                JSONObject jSONObjectA = PushReceiver.a(intent2);
                String strB = E01.b.b(jSONObjectA, "moduleName", "");
                int iA2 = E01.b.a(jSONObjectA, "msgType", 0);
                int iA3 = E01.b.a(jSONObjectA, "status", 0);
                ErrorEnum errorEnum = ErrorEnum.SUCCESS;
                if (iA3 != 0) {
                    iA3 = 800300010;
                }
                Bundle bundle = new Bundle();
                if ("Push".equals(strB) && iA2 == 1) {
                    bundle.putString("message_type", NotificationsSettings.Section.SECTION_DELIVERY);
                    bundle.putString(MessageSuggest.MESSAGE_ID, E01.b.b(jSONObjectA, "msgId", ""));
                    bundle.putInt("error", iA3);
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, E01.b.b(jSONObjectA, "transactionId", ""));
                } else {
                    if (intent2.getExtras() != null) {
                        bundle.putAll(intent2.getExtras());
                    }
                    bundle.putString("message_type", "received_message");
                    bundle.putString(MessageSuggest.MESSAGE_ID, intent2.getStringExtra("msgIdStr"));
                    bundle.putByteArray("message_body", intent2.getByteArrayExtra("msg_data"));
                    bundle.putString("device_token", u.a(intent2.getByteArrayExtra("device_token")));
                    bundle.putInt("inputType", 1);
                    bundle.putString("message_proxy_type", intent2.getStringExtra("message_proxy_type"));
                }
                if (new g().a(this.f363639b, intent, bundle)) {
                    StringBuilder sb2 = new StringBuilder("receive ");
                    sb2.append(intent2.getAction());
                    sb2.append(" and start service success");
                    HMSLog.i("PushReceiver", sb2.toString());
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive ");
                sb3.append(intent2.getAction());
                sb3.append(" and start service failed");
                HMSLog.e("PushReceiver", sb3.toString());
            } catch (RuntimeException unused) {
                HMSLog.e("PushReceiver", "handle push message occur exception.");
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Context f363641b;

        /* renamed from: c, reason: collision with root package name */
        public final Intent f363642c;

        public b(Context context, Intent intent, c cVar) {
            this.f363641b = context;
            this.f363642c = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f363641b;
            Intent intent = this.f363642c;
            try {
                byte[] byteArrayExtra = intent.getByteArrayExtra("device_token");
                if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                    HMSLog.i("PushReceiver", "receive a push token: " + context.getPackageName());
                    Intent intent2 = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent2.setPackage(intent.getPackage());
                    Bundle bundle = new Bundle();
                    bundle.putString("message_type", "new_token");
                    bundle.putString("device_token", u.a(byteArrayExtra));
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
                    bundle.putString("subjectId", intent.getStringExtra("subjectId"));
                    ErrorEnum errorEnum = ErrorEnum.SUCCESS;
                    bundle.putInt("error", intent.getIntExtra("error", 0));
                    bundle.putString("belongId", intent.getStringExtra("belongId"));
                    if (new g().a(context, intent2, bundle)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("receive ");
                    sb2.append(intent.getAction());
                    sb2.append(" and start service failed");
                    HMSLog.e("PushReceiver", sb2.toString());
                    return;
                }
                HMSLog.i("PushReceiver", "get a deviceToken, but it is null or empty");
            } catch (RejectedExecutionException unused) {
                HMSLog.e("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                HMSLog.e("PushReceiver", "handle push token error");
            }
        }
    }

    public static JSONObject a(Intent intent) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(u.a(intent.getByteArrayExtra("msg_data")));
        } catch (JSONException unused) {
            HMSLog.w("PushReceiver", "JSONException:parse message body failed.");
            jSONObject = null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("msgContent") : null;
        String strB = E01.b.b(jSONObjectOptJSONObject, "data", null);
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("psContent") : null;
        if (jSONObjectOptJSONObject == null || (TextUtils.isEmpty(strB) && jSONObjectOptJSONObject2 == null)) {
            return jSONObject;
        }
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return new JSONObject(strB);
        } catch (JSONException unused2) {
            return null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        if (intent == null || context == null) {
            return;
        }
        HMSLog.i("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                try {
                    if (!intent.hasExtra("device_token")) {
                        HMSLog.i("PushReceiver", "This message dose not sent by hwpush.");
                        return;
                    }
                    synchronized (t.f443744a) {
                        threadPoolExecutor2 = t.f443745b;
                    }
                    threadPoolExecutor2.execute(new b(context, intent, null));
                    return;
                } catch (RuntimeException unused) {
                    HMSLog.e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
                    return;
                } catch (Exception unused2) {
                    HMSLog.e("PushReceiver", "handlePushTokenEvent execute task error");
                    return;
                }
            }
            if (!"com.huawei.android.push.intent.RECEIVE".equals(action)) {
                HMSLog.i("PushReceiver", "message can't be recognised.");
                return;
            }
            try {
                if (!intent.hasExtra("msg_data")) {
                    HMSLog.i("PushReceiver", "This push message dose not sent by hwpush.");
                    return;
                }
                synchronized (t.f443744a) {
                    threadPoolExecutor = t.f443745b;
                }
                threadPoolExecutor.execute(new a(context, intent, null));
            } catch (RuntimeException unused3) {
                HMSLog.e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
            } catch (Exception unused4) {
                HMSLog.e("PushReceiver", "handlePushMessageEvent execute task error");
            }
        } catch (Exception unused5) {
            HMSLog.e("PushReceiver", "intent has some error");
        }
    }
}
