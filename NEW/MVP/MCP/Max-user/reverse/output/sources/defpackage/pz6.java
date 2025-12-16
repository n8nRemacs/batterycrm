package defpackage;

/* loaded from: classes.dex */
public final class pz6 implements aa5, ba5 {
    public static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public static final float[] n = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final /* synthetic */ int a;
    public final boolean[] b;
    public long c;
    public String d;
    public boolean e;
    public long f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public pz6(aqc aqcVar) {
        this.a = 0;
        this.g = aqcVar;
        this.b = new boolean[4];
        nz6 nz6Var = new nz6(0);
        nz6Var.f = new byte[128];
        this.i = nz6Var;
        this.f = -9223372036854775807L;
        this.j = new wba(178, 0);
        this.h = new qyg(2, false);
    }

    @Override // defpackage.aa5
    public final void a() {
        switch (this.a) {
            case 0:
                gfi.d(this.b);
                nz6 nz6Var = (nz6) this.i;
                nz6Var.b = false;
                nz6Var.d = 0;
                nz6Var.c = 0;
                oz6 oz6Var = (oz6) this.k;
                if (oz6Var != null) {
                    oz6Var.b = false;
                    oz6Var.c = false;
                    oz6Var.d = false;
                    oz6Var.e = -1;
                }
                wba wbaVar = (wba) this.j;
                if (wbaVar != null) {
                    wbaVar.c();
                }
                this.c = 0L;
                this.f = -9223372036854775807L;
                break;
            default:
                hfi.b(this.b);
                nz6 nz6Var2 = (nz6) this.i;
                nz6Var2.b = false;
                nz6Var2.d = 0;
                nz6Var2.c = 0;
                oz6 oz6Var2 = (oz6) this.k;
                if (oz6Var2 != null) {
                    oz6Var2.b = false;
                    oz6Var2.c = false;
                    oz6Var2.d = false;
                    oz6Var2.e = -1;
                }
                wba wbaVar2 = (wba) this.j;
                if (wbaVar2 != null) {
                    wbaVar2.c();
                }
                this.c = 0L;
                this.f = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    @Override // defpackage.aa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.qyg r28) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz6.d(qyg):void");
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f = j;
                    break;
                }
                break;
            default:
                this.f = j;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    @Override // defpackage.ba5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.umb r21) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz6.f(umb):void");
    }

    @Override // defpackage.aa5
    public void g() {
    }

    @Override // defpackage.ba5
    public void h(boolean z) {
        hsi.h((oz6) this.k);
        if (z) {
            ((oz6) this.k).b(0, this.c, this.e);
            oz6 oz6Var = (oz6) this.k;
            oz6Var.b = false;
            oz6Var.c = false;
            oz6Var.d = false;
            oz6Var.e = -1;
        }
    }

    @Override // defpackage.ba5
    public void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.d = mjgVar.f;
        mjgVar.b();
        sfg sfgVarMo163B = kp5Var.mo163B(mjgVar.e, 2);
        this.l = sfgVarMo163B;
        this.k = new oz6(1, sfgVarMo163B);
        ((qae) this.g).b(kp5Var, mjgVar);
    }

    @Override // defpackage.aa5
    public void j(jp5 jp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.d = mjgVar.f;
        mjgVar.b();
        rfg rfgVarB = jp5Var.B(mjgVar.e, 2);
        this.l = rfgVarB;
        this.k = new oz6(0, rfgVarB);
        ((aqc) this.g).h(jp5Var, mjgVar);
    }

    public pz6(qae qaeVar) {
        this.a = 1;
        this.g = qaeVar;
        this.b = new boolean[4];
        nz6 nz6Var = new nz6(1);
        nz6Var.f = new byte[128];
        this.i = nz6Var;
        this.f = -9223372036854775807L;
        this.j = new wba(178, 1);
        this.h = new umb();
    }
}
