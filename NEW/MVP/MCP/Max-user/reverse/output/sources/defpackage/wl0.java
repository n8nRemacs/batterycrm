package defpackage;

/* loaded from: classes.dex */
public abstract class wl0 implements vta, osc {
    public final vta a;
    public py4 b;
    public osc c;
    public boolean d;
    public int o;

    public wl0(vta vtaVar) {
        this.a = vtaVar;
    }

    @Override // defpackage.vta
    public void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.b();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.b, py4Var)) {
            this.b = py4Var;
            if (py4Var instanceof osc) {
                this.c = (osc) py4Var;
            }
            this.a.c(this);
        }
    }

    public void clear() {
        this.c.clear();
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.psc
    public int h(int i) {
        osc oscVar = this.c;
        if (oscVar == null || (i & 4) != 0) {
            return 0;
        }
        int iH = oscVar.h(i);
        if (iH == 0) {
            return iH;
        }
        this.o = iH;
        return iH;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.vta
    public void onError(Throwable th) {
        if (this.d) {
            t8j.a(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }
}
