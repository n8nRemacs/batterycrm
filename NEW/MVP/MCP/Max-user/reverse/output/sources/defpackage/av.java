package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class av implements sk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ av(ul2 ul2Var, long j, int i) {
        this.a = i;
        this.b = ul2Var;
        this.c = j;
    }

    @Override // defpackage.sk3
    public final void c(jk3 jk3Var) {
        switch (this.a) {
            case 0:
                b47 b47Var = this.b.b;
                iv6 iv6Var = b47Var.e;
                long c = this.c;
                iv6Var.u("loadPrev: " + iv6.k(c));
                b47Var.q();
                if (b47Var.d().j().isEmpty()) {
                    b47Var.l(c);
                } else {
                    j37 j37VarB = gei.b(b47Var.f(c));
                    if (j37VarB != null) {
                        c = j37VarB.getC();
                    }
                    long j = c;
                    b47Var.j(b47Var.b, j, true, false, false);
                    b47Var.k(b47Var.c, j, true, false);
                }
                iei.b(iv6Var, b47Var.e());
                if (!jk3Var.e()) {
                    jk3Var.b();
                    break;
                }
                break;
            default:
                b47 b47Var2 = this.b.b;
                iv6 iv6Var2 = b47Var2.e;
                long j2 = this.c;
                iv6Var2.u("load: " + iv6.k(j2));
                b47Var2.q();
                if (b47Var2.d().j().isEmpty()) {
                    b47Var2.l(j2);
                } else {
                    b47Var2.j(b47Var2.b, j2, true, true, false);
                    b47Var2.k(b47Var2.c, j2, true, true);
                }
                iei.b(iv6Var2, b47Var2.e());
                if (!jk3Var.e()) {
                    jk3Var.b();
                    break;
                }
                break;
        }
    }
}
