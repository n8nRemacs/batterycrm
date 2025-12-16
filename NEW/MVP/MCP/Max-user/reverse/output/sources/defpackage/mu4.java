package defpackage;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class mu4 {
    public static final bwf c = new bwf(new ps3(14));
    public final ThreadLocal a;
    public final Looper b;

    public mu4(ThreadLocal threadLocal) {
        this.a = threadLocal;
        Looper.prepare();
        this.b = Looper.myLooper();
    }
}
