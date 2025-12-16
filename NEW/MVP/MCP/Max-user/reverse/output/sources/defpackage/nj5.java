package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class nj5 extends AtomicBoolean implements Runnable, py4 {
    public final Runnable a;

    public nj5(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.py4
    public final void dispose() {
        lazySet(true);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
        }
    }
}
