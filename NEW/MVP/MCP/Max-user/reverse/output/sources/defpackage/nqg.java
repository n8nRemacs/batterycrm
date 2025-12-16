package defpackage;

/* loaded from: classes.dex */
public final class nqg extends yl0 {
    public final /* synthetic */ oqg a;

    public nqg(oqg oqgVar) {
        this.a = oqgVar;
    }

    @Override // defpackage.cof
    public final void cancel() {
        if (this.a.Z) {
            return;
        }
        this.a.Z = true;
        Runnable runnable = (Runnable) this.a.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.a.Y.lazySet(null);
        if (this.a.t0.getAndIncrement() == 0) {
            this.a.Y.lazySet(null);
            oqg oqgVar = this.a;
            if (oqgVar.v0) {
                return;
            }
            oqgVar.b.clear();
        }
    }

    @Override // defpackage.o1f
    public final void clear() {
        this.a.b.clear();
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            oqg oqgVar = this.a;
            nui.a(oqgVar.u0, j);
            oqgVar.i();
        }
    }

    @Override // defpackage.psc
    public final int h(int i) {
        this.a.v0 = true;
        return 2;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    @Override // defpackage.o1f
    public final Object poll() {
        return this.a.b.poll();
    }
}
