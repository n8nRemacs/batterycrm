package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class p7j {
    public static final Object g = new Object();
    public static p7j h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile y1a c;
    public final ms3 d;
    public final long e;
    public final long f;

    public p7j(Context context, Looper looper) {
        z5f z5fVar = new z5f(2, this);
        this.b = context.getApplicationContext();
        y1a y1aVar = new y1a(looper, z5fVar, 6);
        Looper.getMainLooper();
        this.c = y1aVar;
        this.d = ms3.a();
        this.e = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        h3j h3jVar = new h3j(str, z);
        s5j.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                l4j l4jVar = (l4j) this.a.get(h3jVar);
                if (l4jVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(h3jVar.toString()));
                }
                if (!l4jVar.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(h3jVar.toString()));
                }
                l4jVar.a.remove(serviceConnection);
                if (l4jVar.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, h3jVar), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(h3j h3jVar, aki akiVar, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                l4j l4jVar = (l4j) this.a.get(h3jVar);
                if (l4jVar == null) {
                    l4jVar = new l4j(this, h3jVar);
                    l4jVar.a.put(akiVar, akiVar);
                    l4jVar.a(str, null);
                    this.a.put(h3jVar, l4jVar);
                } else {
                    this.c.removeMessages(0, h3jVar);
                    if (l4jVar.a.containsKey(akiVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h3jVar.toString()));
                    }
                    l4jVar.a.put(akiVar, akiVar);
                    int i2 = l4jVar.b;
                    if (i2 == 1) {
                        akiVar.onServiceConnected(l4jVar.X, l4jVar.d);
                    } else if (i2 == 2) {
                        l4jVar.a(str, null);
                    }
                }
                z = l4jVar.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
