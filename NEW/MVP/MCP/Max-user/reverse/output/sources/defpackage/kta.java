package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class kta extends AtomicInteger implements osc, Runnable {
    public final vta a;
    public final Object b;

    public kta(vta vtaVar, Object obj) {
        this.a = vtaVar;
        this.b = obj;
    }

    @Override // defpackage.o1f
    public final void clear() {
        lazySet(3);
    }

    @Override // defpackage.py4
    public final void dispose() {
        set(3);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == 3;
    }

    @Override // defpackage.psc
    public final int h(int i) {
        lazySet(1);
        return 1;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.o1f
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            vta vtaVar = this.a;
            vtaVar.f(obj);
            if (get() == 2) {
                lazySet(3);
                vtaVar.b();
            }
        }
    }
}
