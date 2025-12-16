package defpackage;

/* loaded from: classes2.dex */
public final class td3 implements af4 {
    public final /* synthetic */ pd7 a;
    public final /* synthetic */ ld3 b;

    public td3(zd3 zd3Var, pd7 pd7Var, ld3 ld3Var) {
        this.a = pd7Var;
        this.b = ld3Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    @Override // defpackage.af4
    public final void a(pe4 pe4Var) {
        r0 r0Var = (r0) pe4Var;
        float fC = r0Var.c();
        boolean z = (r0Var.g() || r0Var.f()) ? false : true;
        if (fC >= 0.99f || !z) {
            return;
        }
        int iD = kti.d(fC * 10000);
        yy7[] yy7VarArr = zd3.l;
        ld3 ld3Var = this.b;
        pd3 pd3Var = ld3Var.b;
        nd3 nd3Var = nd3.a;
        if (!fni.a(pd3Var, nd3Var)) {
            zd3.k(this.a, ld3Var, nd3Var);
        }
        ((r00) ld3Var.c.c.getValue()).setLevel(iD);
    }

    @Override // defpackage.af4
    public final void b(pe4 pe4Var) {
    }

    @Override // defpackage.af4
    public final void c() {
    }

    @Override // defpackage.af4
    public final void d(pe4 pe4Var) {
    }
}
