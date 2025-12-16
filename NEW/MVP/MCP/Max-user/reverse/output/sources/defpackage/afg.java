package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class afg {
    public static final bwf a = new bwf(l8.u0);
    public static final bwf b = new bwf(l8.t0);

    public static void a(Runnable runnable) {
        ((Executor) b.getValue()).execute(runnable);
    }

    public static void b(Runnable runnable) {
        ((Executor) a.getValue()).execute(runnable);
    }
}
