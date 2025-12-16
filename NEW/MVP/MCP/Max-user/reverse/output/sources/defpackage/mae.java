package defpackage;

/* loaded from: classes.dex */
public final class mae extends svd {
    public final lae Z;
    public final ly0 s0;
    public final kae t0;
    public final byte[] u0;
    public final cz0 v0;

    public mae(lae laeVar, ly0 ly0Var, kae kaeVar, byte[] bArr) {
        this.Z = laeVar;
        this.s0 = ly0Var;
        this.t0 = kaeVar;
        this.u0 = bArr;
        this.v0 = new cz0(ly0Var, laeVar.b, bArr, kaeVar);
    }

    @Override // defpackage.svd
    public final void b() {
        this.v0.j = true;
    }

    @Override // defpackage.svd
    public final Object c() throws Exception {
        this.v0.a();
        kae kaeVar = this.t0;
        if (kaeVar == null) {
            return null;
        }
        kaeVar.o++;
        kaeVar.a.b(kaeVar.b, kaeVar.d, kaeVar.b());
        return null;
    }
}
