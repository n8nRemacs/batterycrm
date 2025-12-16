package defpackage;

/* loaded from: classes.dex */
public final class t0 extends oj0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ v0 c;

    public t0(v0 v0Var, String str, boolean z) {
        this.c = v0Var;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.oj0, defpackage.af4
    public final void a(pe4 pe4Var) {
        r0 r0Var = (r0) pe4Var;
        boolean zG = r0Var.g();
        float fC = r0Var.c();
        String str = this.a;
        v0 v0Var = this.c;
        if (!v0Var.g(str, r0Var)) {
            v0Var.h("ignore_old_datasource @ onProgress", null);
            r0Var.close();
        } else {
            if (zG) {
                return;
            }
            gr6 gr6Var = v0Var.h;
            up5 up5Var = gr6Var.e;
            if (up5Var.c(3) == null) {
                return;
            }
            up5Var.B0++;
            gr6Var.l(fC);
            up5Var.a();
        }
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        r0 r0Var = (r0) pe4Var;
        this.c.k(this.a, r0Var, r0Var.b(), true);
    }

    @Override // defpackage.oj0
    public final void f(r0 r0Var) {
        boolean zG = r0Var.g();
        boolean z = r0Var instanceof qpd;
        float fC = r0Var.c();
        Object objD = r0Var.d();
        v0 v0Var = this.c;
        if (objD != null) {
            v0Var.l(this.a, r0Var, objD, fC, zG, this.b, z);
        } else if (zG) {
            v0Var.k(this.a, r0Var, new NullPointerException(), true);
        }
    }
}
