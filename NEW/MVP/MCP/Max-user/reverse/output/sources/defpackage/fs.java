package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class fs extends t6d {
    public static volatile fs c;
    public static final es d = new es(0);
    public final aq4 b = new aq4();

    public static fs c() {
        if (c != null) {
            return c;
        }
        synchronized (fs.class) {
            try {
                if (c == null) {
                    c = new fs();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final void d(Runnable runnable) {
        aq4 aq4Var = this.b;
        if (aq4Var.d == null) {
            synchronized (aq4Var.b) {
                try {
                    if (aq4Var.d == null) {
                        aq4Var.d = aq4.c(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        aq4Var.d.post(runnable);
    }
}
