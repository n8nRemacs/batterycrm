package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mj5 extends AtomicReference implements Runnable, py4 {
    public final n42 a;
    public final n42 b;

    public mj5(Runnable runnable) {
        super(runnable);
        this.a = new n42(2);
        this.b = new n42(2);
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (getAndSet(null) != null) {
            n42 n42Var = this.a;
            n42Var.getClass();
            ty4.a(n42Var);
            n42 n42Var2 = this.b;
            n42Var2.getClass();
            ty4.a(n42Var2);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n42 n42Var = this.b;
        n42 n42Var2 = this.a;
        ty4 ty4Var = ty4.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    n42Var2.lazySet(ty4Var);
                    n42Var.lazySet(ty4Var);
                }
            } catch (Throwable th) {
                t8j.a(th);
                throw th;
            }
        }
    }
}
