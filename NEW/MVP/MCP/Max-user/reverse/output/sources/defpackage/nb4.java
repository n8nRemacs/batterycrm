package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class nb4 implements q8a {
    public final oz0 a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public nb4(oz0 oz0Var) {
        this.a = oz0Var;
    }

    @Override // defpackage.q8a
    public final void h(r8a r8aVar) {
        yi1 yi1Var;
        ti1 ti1Var;
        boolean z = (fni.a(this.b, Boolean.valueOf(r8aVar.e)) && fni.a(this.c, Boolean.valueOf(r8aVar.f)) && fni.a(this.d, Boolean.valueOf(r8aVar.g)) && fni.a(this.e, Boolean.valueOf(r8aVar.b))) ? false : true;
        this.b = Boolean.valueOf(r8aVar.e);
        this.c = Boolean.valueOf(r8aVar.f);
        this.d = Boolean.valueOf(r8aVar.g);
        this.e = Boolean.valueOf(r8aVar.b);
        if (z) {
            oz0 oz0Var = this.a;
            int i = oz0Var.a;
            dj1 dj1Var = oz0Var.b;
            switch (i) {
                case 0:
                    yi1Var = dj1Var.a;
                    ti1Var = yi1Var.a;
                    if (ti1Var == null) {
                        return;
                    }
                    break;
                default:
                    yi1Var = dj1Var.a;
                    ti1Var = yi1Var.a;
                    if (ti1Var == null) {
                        return;
                    }
                    break;
            }
            dj1Var.e(dj1Var.c(ti1Var), Collections.singletonList(yi1Var));
        }
    }
}
