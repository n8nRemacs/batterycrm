package defpackage;

/* loaded from: classes.dex */
public class gs4 extends xl0 {
    public final vta a;
    public Object b;

    public gs4(vta vtaVar) {
        this.a = vtaVar;
    }

    public void a(Object obj) {
        d(obj);
    }

    @Override // defpackage.o1f
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void d(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        vta vtaVar = this.a;
        if (i == 8) {
            this.b = obj;
            lazySet(16);
            vtaVar.f(null);
        } else {
            lazySet(2);
            vtaVar.f(obj);
        }
        if (get() != 4) {
            vtaVar.b();
        }
    }

    @Override // defpackage.py4
    public void dispose() {
        set(4);
        this.b = null;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == 4;
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
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
