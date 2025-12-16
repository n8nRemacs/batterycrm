package defpackage;

import java.io.File;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u0h extends hz {
    public final hwa c;
    public final pb3 d;
    public final dv5 e;
    public final tw0 f;
    public rx g;
    public long h;
    public long i;

    public u0h(w10 w10Var, hwa hwaVar, pb3 pb3Var, dv5 dv5Var, tw0 tw0Var) {
        super(w10Var);
        this.c = hwaVar;
        this.d = pb3Var;
        this.e = dv5Var;
        this.f = tw0Var;
    }

    @Override // defpackage.hz
    public final vqa b() {
        vqa vqaVarB = super.b();
        if (vqaVarB != null) {
            return vqaVarB;
        }
        rx rxVar = this.g;
        if (rxVar != null) {
            return rxVar;
        }
        this.g = new rx();
        this.f.d(this);
        w10 w10Var = this.a;
        v10 v10Var = w10Var.d;
        this.h = this.c.H(false, v10Var.a, 0L, 0L, 0L, w10Var.r, false, v10Var.n);
        return this.g;
    }

    public final void c() {
        try {
            this.f.f(this);
        } catch (Exception unused) {
        }
    }

    @vnf
    public void onEvent(yah yahVar) {
        long j = this.h;
        long j2 = yahVar.a;
        Map map = yahVar.b;
        if (j == j2) {
            if (map == null) {
                a(this.g, new Exception("uris empty"));
                c();
                return;
            }
            if (xpi.f(map) == null) {
                a(this.g, new Exception("download url not found"));
                c();
                return;
            }
            String strF = xpi.f(map);
            if (l8g.c(strF)) {
                a(this.g, new Exception("download url not found"));
                c();
            } else {
                this.i = ((w4e) this.d).k();
                w10 w10Var = this.a;
                this.e.a(new m2g(0L, w10Var.r, yahVar.c, 0L, 0L, 0L, strF, true, false, 0L, "", 0, false, true, w10Var.a()));
            }
        }
    }

    @vnf
    public void onEvent(rj0 rj0Var) {
        if (this.h == rj0Var.a) {
            a(this.g, new Exception(rj0Var.b.b));
            c();
        }
    }

    @vnf
    public void onEvent(r05 r05Var) {
        if (this.i == r05Var.a) {
            a(this.g, new Exception("DownloadErrorEvent"));
            c();
        }
    }

    @vnf
    public void onEvent(p05 p05Var) {
        if (this.i == p05Var.a) {
            rx rxVar = this.g;
            File file = new File(p05Var.c);
            if (!this.b) {
                rxVar.f(file);
                rxVar.b();
            }
            c();
        }
    }
}
