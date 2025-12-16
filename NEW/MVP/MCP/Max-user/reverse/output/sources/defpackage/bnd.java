package defpackage;

/* loaded from: classes.dex */
public final class bnd extends vfi {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ ua9 b;
    public final /* synthetic */ int c;

    public bnd(byte[] bArr, ua9 ua9Var, int i) {
        this.a = bArr;
        this.b = ua9Var;
        this.c = i;
    }

    @Override // defpackage.vfi
    public final long b() {
        return this.c;
    }

    @Override // defpackage.vfi
    public final ua9 c() {
        return this.b;
    }

    @Override // defpackage.vfi
    public final void i(vv0 vv0Var) {
        vv0Var.E(this.c, this.a);
    }
}
