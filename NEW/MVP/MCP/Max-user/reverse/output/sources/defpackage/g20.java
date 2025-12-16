package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class g20 extends hz {
    public final dv5 c;
    public final tw0 d;
    public rx e;
    public volatile long f;

    public g20(w10 w10Var, dv5 dv5Var, tw0 tw0Var) {
        super(w10Var);
        this.c = dv5Var;
        this.d = tw0Var;
    }

    @Override // defpackage.hz
    public final vqa b() {
        vqa vqaVarB = super.b();
        if (vqaVarB != null) {
            return vqaVarB;
        }
        rx rxVar = this.e;
        if (rxVar != null) {
            return rxVar;
        }
        this.e = new rx();
        this.d.d(this);
        w10 w10Var = this.a;
        String str = w10Var.r;
        w00 w00Var = w10Var.e;
        m2g m2gVar = new m2g(0L, str, 0L, w00Var.a, 0L, 0L, w00Var.b, true, false, 0L, "", 0, false, false, w10Var.a());
        this.f = m2gVar.o;
        this.c.a(m2gVar);
        return this.e;
    }

    @vnf
    public void onEvent(r05 r05Var) {
        if (this.f == r05Var.a) {
            a(this.e, new Exception("DownloadErrorEvent"));
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @vnf
    public void onEvent(p05 p05Var) {
        if (this.f == p05Var.a) {
            this.e.f(new File(p05Var.c));
            this.e.b();
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }
}
