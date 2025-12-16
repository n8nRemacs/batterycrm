package z01;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.BaseException;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.push.SendException;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.yandex.div2.D8;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z01.r;

/* compiled from: HmsMessageService.java */
/* renamed from: z01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ServiceC50337a extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f443701b;

    /* compiled from: HmsMessageService.java */
    /* renamed from: z01.a$a, reason: collision with other inner class name */
    public class C12938a implements r.a {
        public C12938a(b bVar) {
        }

        @Override // z01.r.a
        public final void handleMessage(Message message) {
            if (message == null) {
                HMSLog.e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.i("HmsMessageService", "handle message start...");
            Bundle data = Message.obtain(message).getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                intent.putExtra("inputType", data.getInt("inputType", -1));
                ServiceC50337a.this.i(intent);
            }
        }
    }

    public ServiceC50337a() {
        C12938a c12938a = new C12938a(null);
        r rVar = new r();
        rVar.f443743a = new WeakReference<>(c12938a);
        this.f443701b = new Messenger(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Intent r2, int r3) {
        /*
            java.lang.String r0 = "HmsMessageService"
            if (r2 == 0) goto L22
            android.os.Bundle r1 = r2.getExtras()     // Catch: java.lang.Exception -> L17 java.lang.RuntimeException -> L1d
            if (r1 == 0) goto L22
            android.os.Bundle r2 = r2.getExtras()     // Catch: java.lang.Exception -> L17 java.lang.RuntimeException -> L1d
            java.lang.String r1 = "exception_key"
            java.io.Serializable r2 = r2.getSerializable(r1)     // Catch: java.lang.Exception -> L17 java.lang.RuntimeException -> L1d
            com.huawei.hms.common.ResolvableApiException r2 = (com.huawei.hms.common.ResolvableApiException) r2     // Catch: java.lang.Exception -> L17 java.lang.RuntimeException -> L1d
            goto L23
        L17:
            java.lang.String r2 = "get resApiException error Exception"
            com.huawei.hms.support.log.HMSLog.e(r0, r2)
            goto L22
        L1d:
            java.lang.String r2 = "get resApiException error RuntimeException"
            com.huawei.hms.support.log.HMSLog.e(r0, r2)
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L2b
            java.lang.String r2 = "resApiException is not null"
            com.huawei.hms.support.log.HMSLog.i(r0, r2)
            goto L30
        L2b:
            com.huawei.hms.push.BaseException r2 = new com.huawei.hms.push.BaseException
            r2.<init>(r3)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z01.ServiceC50337a.a(android.content.Intent, int):void");
    }

    public final void b(Intent intent, String str) {
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        int i12 = 0;
        int intExtra = intent.getIntExtra("error", 0);
        d(PushNaming.GETTOKEN_ASYNC_RSP, str, intExtra);
        String stringExtra = intent.getStringExtra("subjectId");
        String stringExtra2 = intent.getStringExtra("message_proxy_type");
        HMSLog.i("HmsMessageService", "doOnNewToken:transactionId = " + str + " , internalCode = " + intExtra + ",subjectId:" + stringExtra + ",proxyType:" + stringExtra2);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString("subject_id", stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString("proxy_type", stringExtra2);
        }
        if (intExtra != 0) {
            HMSLog.i("HmsMessageService", "Apply token failed, subId: " + stringExtra);
            synchronized (this) {
                try {
                    Context applicationContext = getApplicationContext();
                    String packageName = applicationContext.getPackageName();
                    y01.n nVar = new y01.n(applicationContext, "push_client_self_info");
                    nVar.f442830b = applicationContext;
                    boolean zIsEmpty = TextUtils.isEmpty(nVar.c(packageName));
                    if (bundle.isEmpty() && !zIsEmpty) {
                        HMSLog.i("HmsMessageService", "onTokenError to host app.");
                        new BaseException(intExtra);
                        String packageName2 = applicationContext.getPackageName();
                        y01.n nVar2 = new y01.n(applicationContext, "push_client_self_info");
                        nVar2.f442830b = applicationContext;
                        nVar2.d(packageName2);
                    }
                    if (TextUtils.isEmpty(stringExtra)) {
                        y01.n nVar3 = new y01.n(applicationContext, "push_client_self_info");
                        nVar3.f442830b = applicationContext;
                        String strC = nVar3.c("subjectId");
                        String[] strArrSplit = TextUtils.isEmpty(strC) ? new String[0] : strC.split(",");
                        if (strArrSplit != null && strArrSplit.length != 0) {
                            while (i12 < strArrSplit.length) {
                                new Bundle().putString("subject_id", strArrSplit[i12]);
                                HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + strArrSplit[i12]);
                                a(intent, intExtra);
                                i12++;
                            }
                            y01.n nVar4 = new y01.n(applicationContext, "push_client_self_info");
                            nVar4.f442830b = applicationContext;
                            nVar4.d("subjectId");
                        }
                        HMSLog.i("HmsMessageService", "onTokenError to host app with bundle.");
                        a(intent, intExtra);
                        return;
                    }
                    HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + stringExtra);
                    a(intent, intExtra);
                    return;
                } finally {
                }
            }
        }
        HMSLog.i("HmsMessageService", "Apply token OnNewToken, subId: " + stringExtra);
        synchronized (this) {
            try {
                String stringExtra3 = intent.getStringExtra("device_token");
                c(stringExtra3, stringExtra);
                Context applicationContext2 = getApplicationContext();
                String packageName3 = applicationContext2.getPackageName();
                y01.n nVar5 = new y01.n(applicationContext2, "push_client_self_info");
                nVar5.f442830b = applicationContext2;
                boolean zIsEmpty2 = TextUtils.isEmpty(nVar5.c(packageName3));
                if (bundle.isEmpty() && !zIsEmpty2) {
                    HMSLog.i("HmsMessageService", "onNewToken to host app.");
                    String packageName4 = applicationContext2.getPackageName();
                    y01.n nVar6 = new y01.n(applicationContext2, "push_client_self_info");
                    nVar6.f442830b = applicationContext2;
                    nVar6.d(packageName4);
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    y01.n nVar7 = new y01.n(applicationContext2, "push_client_self_info");
                    nVar7.f442830b = applicationContext2;
                    String strC2 = nVar7.c("subjectId");
                    String[] strArrSplit2 = TextUtils.isEmpty(strC2) ? new String[0] : strC2.split(",");
                    if (strArrSplit2 != null && strArrSplit2.length != 0) {
                        while (i12 < strArrSplit2.length) {
                            new Bundle().putString("subject_id", strArrSplit2[i12]);
                            HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + strArrSplit2[i12]);
                            k();
                            c(stringExtra3, strArrSplit2[i12]);
                            i12++;
                        }
                        y01.n nVar8 = new y01.n(applicationContext2, "push_client_self_info");
                        nVar8.f442830b = applicationContext2;
                        nVar8.d("subjectId");
                    }
                    HMSLog.i("HmsMessageService", "onNewToken to host app with bundle.");
                    bundle.putString("belongId", intent.getStringExtra("belongId"));
                    k();
                    return;
                }
                HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + stringExtra);
                k();
            } finally {
            }
        }
    }

    public final void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = getApplicationContext();
        if (str.equals(y01.n.g(applicationContext).i(str2))) {
            new y01.r(applicationContext, str).start();
            return;
        }
        HMSLog.i("HmsMessageService", "receive a token, refresh the local token");
        y01.n nVar = new y01.n(applicationContext, "push_client_self_info");
        nVar.f442830b = applicationContext;
        nVar.j(str2, str);
    }

    public final void d(String str, String str2, int i12) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        HiAnalyticsClient.reportExit(getApplicationContext(), str, str2, Status.SUCCESS.getStatusCode(), i12, 60300301);
    }

    public final void e(int i12, String str, String str2) {
        HMSLog.i("HmsMessageService", "onSendError, message id:" + str2 + " error:" + i12 + ", transactionId: " + str);
        d(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i12);
        new SendException(i12);
    }

    public final void f(Intent intent) throws JSONException {
        HMSLog.i("HmsMessageService", "parse batch response.");
        String stringExtra = intent.getStringExtra("batchMsgbody");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i12);
                String strOptString = jSONObject.optString("transactionId");
                String strOptString2 = jSONObject.optString("msgId");
                ErrorEnum errorEnum = ErrorEnum.SUCCESS;
                int iOptInt = jSONObject.optInt("ret", 800000005);
                ErrorEnum errorEnum2 = ErrorEnum.SUCCESS;
                if (iOptInt == 0) {
                    g(strOptString, strOptString2);
                } else {
                    e(iOptInt, strOptString, strOptString2);
                }
            }
        } catch (JSONException unused) {
            HMSLog.w("HmsMessageService", "parse batch response failed.");
        }
    }

    public final void g(String str, String str2) {
        HMSLog.i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        d(PushNaming.UPSEND_MSG_ASYNC_RSP, str, 0);
    }

    public final void h(Intent intent) throws JSONException {
        JSONObject jSONObject;
        Bundle bundle = new Bundle();
        bundle.putString(MessageSuggest.MESSAGE_ID, intent.getStringExtra(MessageSuggest.MESSAGE_ID));
        bundle.putByteArray("message_body", intent.getByteArrayExtra("message_body"));
        bundle.putString("device_token", intent.getStringExtra("device_token"));
        if (intent.getIntExtra("inputType", -1) == 1) {
            bundle.putInt("inputType", 1);
        }
        RemoteMessage remoteMessage = new RemoteMessage();
        Bundle bundle2 = new Bundle();
        try {
            jSONObject = new JSONObject(u.a(bundle.getByteArray("message_body")));
        } catch (JSONException unused) {
            HMSLog.w("RemoteMessage", "JSONException:parse message body failed.");
            jSONObject = null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("msgContent") : null;
        String strB = E01.b.b(jSONObjectOptJSONObject, "data", null);
        bundle2.putString("analyticInfo", E01.b.b(jSONObjectOptJSONObject, "analyticInfo", null));
        bundle2.putString("device_token", bundle.getString("device_token"));
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("psContent") : null;
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject("notifyDetail") : null;
        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject("param") : null;
        if (bundle.getInt("inputType") == 1 && (jSONObjectOptJSONObject == null || (TextUtils.isEmpty(strB) && jSONObjectOptJSONObject2 == null))) {
            bundle2.putString("data", u.a(bundle.getByteArray("message_body")));
        } else {
            String string = bundle.getString(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME);
            String string2 = bundle.getString("message_type");
            String strB2 = E01.b.b(jSONObjectOptJSONObject, "msgId", null);
            bundle2.putString(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, string);
            bundle2.putString("data", strB);
            bundle2.putString("msgId", strB2);
            bundle2.putString("message_type", string2);
            E01.b.c(jSONObject, bundle2, RemoteMessage.f363598d);
            Bundle bundle3 = new Bundle();
            E01.b.c(jSONObjectOptJSONObject2, bundle3, RemoteMessage.f363599e);
            E01.b.c(jSONObjectOptJSONObject3, bundle3, RemoteMessage.f363600f);
            E01.b.c(jSONObject, bundle3, RemoteMessage.f363601g);
            E01.b.c(jSONObjectOptJSONObject4, bundle3, RemoteMessage.f363602h);
            bundle3.putInt("notifyId", E01.b.a(jSONObjectOptJSONObject, "notifyId", 0));
            bundle2.putBundle(NotificationsSettings.Section.SECTION_PAID_SERVICES, bundle3);
        }
        remoteMessage.f363603b = bundle2;
        j(remoteMessage);
    }

    public final void i(Intent intent) {
        if (intent == null) {
            HMSLog.e("HmsMessageService", "receive message is null");
            return;
        }
        try {
            String stringExtra = intent.getStringExtra(MessageSuggest.MESSAGE_ID);
            String stringExtra2 = intent.getStringExtra("message_type");
            String stringExtra3 = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
            if ("new_token".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "onNewToken");
                b(intent, stringExtra3);
            } else if ("received_message".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "onMessageReceived, message id:" + stringExtra);
                ErrorEnum errorEnum = ErrorEnum.SUCCESS;
                d(PushNaming.RECEIVE_MSG_RSP, stringExtra, 0);
                h(intent);
            } else if ("sent_message".equals(stringExtra2)) {
                g(stringExtra3, stringExtra);
            } else if ("send_error".equals(stringExtra2)) {
                ErrorEnum errorEnum2 = ErrorEnum.SUCCESS;
                e(intent.getIntExtra("error", 800000005), stringExtra3, stringExtra);
            } else if (NotificationsSettings.Section.SECTION_DELIVERY.equals(stringExtra2)) {
                ErrorEnum errorEnum3 = ErrorEnum.SUCCESS;
                int intExtra = intent.getIntExtra("error", 800300010);
                StringBuilder sb2 = new StringBuilder("onMessageDelivery, message id:");
                sb2.append(stringExtra);
                sb2.append(", status:");
                sb2.append(intExtra);
                sb2.append(", transactionId: ");
                sb2.append(stringExtra3);
                HMSLog.i("HmsMessageService", sb2.toString());
                d(PushNaming.UPSEND_RECEIPT, stringExtra3, intExtra);
                new SendException(intExtra);
            } else if ("server_deleted_message".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "delete message, message id:" + stringExtra);
            } else if ("batchSent".equals(stringExtra2)) {
                f(intent);
            } else {
                HMSLog.e("HmsMessageService", "Receive unknown message: " + stringExtra2);
            }
        } catch (RuntimeException e12) {
            HMSLog.e("HmsMessageService", "handle intent RuntimeException: " + e12.getMessage());
        } catch (Exception e13) {
            D8.q(e13, new StringBuilder("handle intent exception: "), "HmsMessageService");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        HMSLog.i("HmsMessageService", "start to bind");
        return this.f443701b.getBinder();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        HMSLog.i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i12, int i13) {
        HMSLog.i("HmsMessageService", "start to command , startId = " + i13);
        i(intent);
        return 2;
    }

    public void k() {
    }

    public void j(RemoteMessage remoteMessage) {
    }
}
