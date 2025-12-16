package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class yri {
    public static final lk6 a = new lk6("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        r5j.J(context).u();
        Set set = yai.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((yai) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (xv6.A0) {
            try {
                xv6 xv6Var = xv6.B0;
                if (xv6Var != null) {
                    xv6Var.s0.incrementAndGet();
                    y1a y1aVar = xv6Var.w0;
                    y1aVar.sendMessageAtFrontOfQueue(y1aVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
