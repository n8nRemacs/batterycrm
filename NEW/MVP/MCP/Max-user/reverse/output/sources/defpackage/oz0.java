package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class oz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj1 b;

    public /* synthetic */ oz0(dj1 dj1Var, int i) {
        this.a = i;
        this.b = dj1Var;
    }

    public void a(boolean z) {
        ti1 ti1Var;
        ti1 ti1Var2;
        switch (this.a) {
            case 1:
                dj1 dj1Var = this.b;
                yi1 yi1Var = dj1Var.a;
                boolean zF = yi1Var.f();
                yi1Var.o = z;
                if (zF != yi1Var.f() && (ti1Var = yi1Var.a) != null) {
                    dj1Var.e(dj1Var.c(ti1Var), Collections.singletonList(yi1Var));
                    break;
                }
                break;
            default:
                dj1 dj1Var2 = this.b;
                yi1 yi1Var2 = dj1Var2.a;
                boolean zF2 = yi1Var2.f();
                yi1Var2.o = z;
                if (zF2 != yi1Var2.f() && (ti1Var2 = yi1Var2.a) != null) {
                    dj1Var2.e(dj1Var2.c(ti1Var2), Collections.singletonList(yi1Var2));
                    break;
                }
                break;
        }
    }
}
