package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class i1g {
    public static final h1g b = new h1g();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public void a(Runnable runnable) {
        if (this.a.compareAndSet(false, true)) {
            runnable.run();
        }
    }
}
