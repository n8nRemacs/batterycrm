package z01;

import F01.a;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PushNotification.java */
/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static int f443740a;

    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.app.Notification a(android.content.Context r16, z01.j r17, int[] r18) throws org.json.JSONException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z01.m.a(android.content.Context, z01.j, int[]):android.app.Notification");
    }

    public static Intent b(Context context, j jVar, int[] iArr, String str, int i12) throws JSONException {
        byte[] bytes;
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        jVar.getClass();
        try {
            JSONObject jSONObjectC = jVar.c(jVar.l());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, jVar.f443732s);
            jSONObject.put("bigTitle", jVar.f443733t);
            jSONObject.put("bigContent", jVar.f443734u);
            jSONObject.put("bigPic", "");
            bytes = jVar.a(jVar.b(jSONObjectC, jSONObject)).toString().getBytes(v.f443746a);
        } catch (JSONException e12) {
            HMSLog.e("PushSelfShowLog", "getMsgData failed JSONException:", e12);
            bytes = new byte[0];
        }
        intent.putExtra("selfshow_info", bytes).putExtra("selfshow_token", jVar.f443731r.getBytes(v.f443746a)).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i12);
        return intent;
    }

    public static synchronized void c(Context context, j jVar) {
        int iHashCode;
        int iHashCode2;
        int i12;
        int iHashCode3;
        if (context != null && jVar != null) {
            try {
                if (!TextUtils.isEmpty(jVar.f443723j) || !TextUtils.isEmpty(jVar.f443721h)) {
                    HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + jVar.k());
                    if (f443740a == 0) {
                        f443740a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                    }
                    if (TextUtils.isEmpty(jVar.f443714a)) {
                        String str = jVar.f443738y;
                        if (!TextUtils.isEmpty(str)) {
                            int iHashCode4 = str.hashCode();
                            jVar.f443739z = iHashCode4;
                            HMSLog.d("PushSelfShowLog", "notification msgTag = " + iHashCode4);
                        }
                        iHashCode = jVar.f443739z;
                        if (iHashCode != -1) {
                            iHashCode3 = (jVar.f443719f + System.currentTimeMillis()).hashCode();
                            i12 = iHashCode3 + 1;
                            iHashCode2 = (jVar.f443739z + jVar.f443719f + context.getPackageName()).hashCode();
                        } else {
                            int i13 = f443740a;
                            int i14 = i13 + 1;
                            int i15 = i13 + 2;
                            int i16 = i13 + 3;
                            int i17 = i13 + 4;
                            f443740a = i17;
                            iHashCode2 = i17;
                            iHashCode = i14;
                            iHashCode3 = i15;
                            i12 = i16;
                        }
                    } else {
                        iHashCode = (jVar.f443714a + jVar.f443719f).hashCode();
                        int i18 = f443740a;
                        int i19 = i18 + 1;
                        int i22 = i18 + 2;
                        f443740a = i22;
                        iHashCode2 = (jVar.f443714a + jVar.f443719f + context.getPackageName()).hashCode();
                        i12 = i22;
                        iHashCode3 = i19;
                    }
                    HMSLog.d("PushSelfShowLog", "notifyId:" + iHashCode + ",openNotifyId:" + iHashCode3 + ",delNotifyId:" + i12 + ",alarmNotifyId:" + iHashCode2);
                    if (jVar.f443715b <= 0) {
                        iHashCode2 = 0;
                    }
                    int[] iArr = {iHashCode, iHashCode3, i12, iHashCode2};
                    Notification notificationA = a(context, jVar, iArr);
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
                    if (notificationManager != null && notificationA != null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("HwPushChannelID", context.getString(ResourceLoaderUtil.getStringId("hms_push_channel")), 3));
                        notificationManager.notify(iHashCode, notificationA);
                        d(context, jVar, iArr);
                        jVar.k();
                        a.C0270a.f4473a.getClass();
                    }
                }
            } finally {
            }
        }
    }

    public static void d(Context context, j jVar, int[] iArr) throws JSONException {
        HMSLog.i("PushSelfShowLog", "setAutoClear time is: " + jVar.f443715b);
        if (jVar.f443715b <= 0) {
            return;
        }
        Intent intentB = b(context, jVar, iArr, DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME, 32);
        long j12 = jVar.f443715b;
        int i12 = iArr[3];
        try {
            StringBuilder sb2 = new StringBuilder("enter setDelayAlarm(interval:");
            sb2.append(j12);
            sb2.append("ms.");
            HMSLog.d("PushSelfShowLog", sb2.toString());
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j12, PendingIntent.getBroadcast(context, i12, intentB, 67108864));
            }
        } catch (Exception e12) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error." + e12.toString());
        }
    }
}
