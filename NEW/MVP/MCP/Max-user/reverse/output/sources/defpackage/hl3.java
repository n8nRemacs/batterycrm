package defpackage;

import androidx.fragment.app.b;

/* loaded from: classes.dex */
public final /* synthetic */ class hl3 implements b48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        switch (this.a) {
            case 0:
                jva jvaVar = (jva) this.b;
                b bVar = (b) this.c;
                if (k38Var == k38.ON_CREATE) {
                    jvaVar.e = il3.a.a(bVar);
                    jvaVar.e(jvaVar.g);
                    return;
                }
                return;
            default:
                q38 q38Var = (q38) this.b;
                qt7 qt7Var = (qt7) this.c;
                ay4 ay4Var = q38Var.c;
                if (j48Var.p().d == l38.a) {
                    qt7Var.cancel(null);
                    q38Var.a();
                    return;
                } else if (j48Var.p().d.compareTo(q38Var.b) < 0) {
                    ay4Var.a = true;
                    return;
                } else {
                    if (ay4Var.a) {
                        if (ay4Var.b) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher");
                        }
                        ay4Var.a = false;
                        ay4Var.a();
                        return;
                    }
                    return;
                }
        }
    }
}
