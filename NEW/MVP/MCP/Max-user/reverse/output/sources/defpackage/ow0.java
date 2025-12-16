package defpackage;

/* loaded from: classes.dex */
public final class ow0 implements sfg {
    public final int a;
    public final hf6 b;
    public final jx4 c = new jx4();
    public hf6 d;
    public sfg e;
    public long f;

    public ow0(int i, int i2, hf6 hf6Var) {
        this.a = i2;
        this.b = hf6Var;
    }

    @Override // defpackage.sfg
    public final void a(long j, int i, int i2, int i3, qfg qfgVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        sfg sfgVar = this.e;
        String str = zxg.a;
        sfgVar.a(j, i, i2, i3, qfgVar);
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        sfg sfgVar = this.e;
        String str = zxg.a;
        sfgVar.b(umbVar, i, 0);
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) {
        sfg sfgVar = this.e;
        String str = zxg.a;
        return sfgVar.c(ke4Var, i, z);
    }

    @Override // defpackage.sfg
    public final void d(hf6 hf6Var) {
        hf6 hf6Var2 = this.b;
        if (hf6Var2 != null) {
            hf6Var = hf6Var.e(hf6Var2);
        }
        this.d = hf6Var;
        sfg sfgVar = this.e;
        String str = zxg.a;
        sfgVar.d(hf6Var);
    }
}
