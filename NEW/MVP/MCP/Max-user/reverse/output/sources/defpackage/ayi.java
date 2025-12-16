package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class ayi {
    public static final /* synthetic */ int a = 0;

    public static ex4 a() {
        if (ex4.b != null) {
            return ex4.b;
        }
        synchronized (ex4.class) {
            try {
                if (ex4.b == null) {
                    ex4.b = new ex4(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ex4.b;
    }

    public static bo0 b() {
        if (bo0.c != null) {
            return bo0.c;
        }
        synchronized (bo0.class) {
            try {
                if (bo0.c == null) {
                    bo0.c = new bo0(3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bo0.c;
    }

    public static ns7 c() {
        if (ns7.c != null) {
            return ns7.c;
        }
        synchronized (ns7.class) {
            try {
                if (ns7.c == null) {
                    ns7.c = new ns7(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ns7.c;
    }

    public static a07 d() {
        if (fn8.a != null) {
            return fn8.a;
        }
        synchronized (fn8.class) {
            try {
                if (fn8.a == null) {
                    fn8.a = new a07(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fn8.a;
    }
}
