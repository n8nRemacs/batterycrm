package defpackage;

/* loaded from: classes2.dex */
public final class ypc extends fj0 {
    public final int j;

    public ypc(uda udaVar, nr3 nr3Var, c9f c9fVar, qs3 qs3Var, int i) {
        super(udaVar, nr3Var, c9fVar, qs3Var);
        this.j = i;
    }

    @Override // defpackage.cb3
    public final void close() {
    }

    @Override // defpackage.cb3
    public final int d() {
        return this.f.b();
    }

    @Override // defpackage.cb3
    public final void g(boolean z) {
    }

    @Override // defpackage.cb3
    public final String i() {
        return this.f.a;
    }

    @Override // defpackage.cb3
    public final int j() {
        return this.j;
    }

    public final String toString() {
        return "ProxyClient{connectionHost=" + this.f + "}";
    }
}
