package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class nyd extends AtomicInteger implements qsc {
    public final Object a;
    public final aof b;

    public nyd(aof aofVar, Object obj) {
        this.b = aofVar;
        this.a = obj;
    }

    @Override // defpackage.cof
    public final void cancel() {
        lazySet(2);
    }

    @Override // defpackage.o1f
    public final void clear() {
        lazySet(1);
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            aof aofVar = this.b;
            aofVar.f(obj);
            if (get() != 2) {
                aofVar.b();
            }
        }
    }

    @Override // defpackage.psc
    public final int h(int i) {
        return 1;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.o1f
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }
}
