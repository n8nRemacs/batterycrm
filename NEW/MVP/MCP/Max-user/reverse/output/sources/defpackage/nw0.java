package defpackage;

/* loaded from: classes.dex */
public final class nw0 implements rfg {
    public final int a;
    public final gf6 b;
    public final q65 c = new q65();
    public gf6 d;
    public rfg e;
    public long f;

    public nw0(int i, int i2, gf6 gf6Var) {
        this.a = i2;
        this.b = gf6Var;
    }

    @Override // defpackage.rfg
    public final int a(je4 je4Var, int i, boolean z) {
        rfg rfgVar = this.e;
        int i2 = xxg.a;
        return rfgVar.e(je4Var, i, z);
    }

    @Override // defpackage.rfg
    public final void b(long j, int i, int i2, int i3, pfg pfgVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        rfg rfgVar = this.e;
        int i4 = xxg.a;
        rfgVar.b(j, i, i2, i3, pfgVar);
    }

    @Override // defpackage.rfg
    public final void c(int i, qyg qygVar) {
        rfg rfgVar = this.e;
        int i2 = xxg.a;
        rfgVar.c(i, qygVar);
    }

    @Override // defpackage.rfg
    public final void d(gf6 gf6Var) {
        gf6 gf6Var2 = this.b;
        if (gf6Var2 != null) {
            gf6Var = gf6Var.c(gf6Var2);
        }
        this.d = gf6Var;
        rfg rfgVar = this.e;
        int i = xxg.a;
        rfgVar.d(gf6Var);
    }
}
