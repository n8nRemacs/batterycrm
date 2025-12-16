package z01;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* compiled from: PushSelfShowThread.java */
/* loaded from: classes7.dex */
public class n extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public Context f443741b;

    /* renamed from: c, reason: collision with root package name */
    public j f443742c;

    public static boolean a(Context context, j jVar) throws URISyntaxException {
        if (!"cosa".equals(jVar.f443720g)) {
            return false;
        }
        Intent intentB = o.b(context, jVar.f443725l);
        String str = jVar.f443716c;
        if (str != null) {
            try {
                Intent uri = Intent.parseUri(str, 0);
                uri.setSelector(null);
                HMSLog.d("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                if (o.a(context, jVar.f443725l, uri).booleanValue()) {
                    intentB = uri;
                }
            } catch (Exception e12) {
                HMSLog.w("PushSelfShowLog", "intentUri error," + e12.toString());
            }
        } else {
            if (jVar.f443726m != null) {
                Intent intent = new Intent(jVar.f443726m);
                if (o.a(context, jVar.f443725l, intent).booleanValue()) {
                    intentB = intent;
                }
            }
            intentB.setPackage(jVar.f443725l);
        }
        if (intentB != null) {
            return false;
        }
        HMSLog.d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        j jVar = this.f443742c;
        HMSLog.i("PushSelfShowLog", "enter run()");
        try {
            boolean zEquals = "cosa".equals(jVar.f443720g);
            Context context = this.f443741b;
            if (!(zEquals ? o.c(context, jVar.f443725l) : true) || a(context, jVar)) {
                return;
            }
            m.c(context, jVar);
        } catch (Exception e12) {
            HMSLog.e("PushSelfShowLog", e12.toString());
        }
    }
}
