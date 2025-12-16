package defpackage;

/* loaded from: classes.dex */
public abstract class hs4 extends yl0 {
    public final aof a;
    public Object b;

    public hs4(aof aofVar) {
        this.a = aofVar;
    }

    public void a(Object obj) {
        e(obj);
    }

    @Override // defpackage.o1f
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void e(Object obj) {
        int i = get();
        do {
            aof aofVar = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                aofVar.f(null);
                if (get() != 4) {
                    aofVar.b();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                aofVar.f(obj);
                if (get() != 4) {
                    aofVar.b();
                    return;
                }
                return;
            }
            this.b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.b = null;
    }

    @Override // defpackage.cof
    public final void g(long j) {
        Object obj;
        if (fof.e(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    aof aofVar = this.a;
                    aofVar.f(obj);
                    if (get() != 4) {
                        aofVar.b();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // defpackage.psc
    public final int h(int i) {
        lazySet(8);
        return 2;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.o1f
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
