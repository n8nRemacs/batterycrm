package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class kzf {
    public static volatile kzf b;
    public static final CountDownLatch c = new CountDownLatch(1);
    public final bwf a;

    public kzf(bwf bwfVar) {
        this.a = bwfVar;
    }

    public static gzf a() throws InterruptedException {
        try {
            c.await();
        } catch (InterruptedException e) {
            wqi.f("TamContextAndroid", "TamContext initialization was interrupted: %s", e.getMessage());
        }
        if (c.getCount() == 0) {
            return (gzf) b.a.getValue();
        }
        throw new IllegalStateException("TamContextAndroid should call `init` before `getInstance`");
    }
}
