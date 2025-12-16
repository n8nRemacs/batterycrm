package z01;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: SelfShow.java */
/* loaded from: classes7.dex */
public class h {
    public static void a(Context context, Intent intent) {
        try {
            if (context == null || intent == null) {
                HMSLog.d("PushSelfShowLog", "enter SelfShowReceiver receiver, context or intent is null");
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.intent.action.PUSH".equals(action) || "com.huawei.push.msg.NOTIFY_MSG".equals(action) || "com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action)) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("selfshow_info");
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("selfshow_token");
                if (byteArrayExtra != null && byteArrayExtra2 != null && byteArrayExtra.length != 0 && byteArrayExtra2.length != 0) {
                    b(context, intent, byteArrayExtra, byteArrayExtra2);
                    return;
                }
                HMSLog.i("PushSelfShowLog", "self show info or token is null.");
            }
        } catch (RuntimeException e12) {
            HMSLog.e("PushSelfShowLog", "onReceive RuntimeException.", e12);
        } catch (Exception unused) {
            HMSLog.d("PushSelfShowLog", "onReceive Exception.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0158, code lost:
    
        r0 = (((r9 - r8) * 30) - (r0.getMinutes() % 30)) * 60000;
        r15 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016d, code lost:
    
        r15.append("startIndex is:");
        r15.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
    
        r15.append(" i is:");
        r15.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
    
        r15.append(" delay:");
        r15.append(r0);
        com.huawei.hms.support.log.HMSLog.d("PushSelfShowLog", r15.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018c, code lost:
    
        if (r0 < 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r12, android.content.Intent r13, byte[] r14, byte[] r15) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z01.h.b(android.content.Context, android.content.Intent, byte[], byte[]):void");
    }
}
