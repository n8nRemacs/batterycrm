package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class vye {
    public static final vye a = new vye();
    public static imb b;

    public static void a() {
        bcb bcbVar;
        imb imbVar = b;
        if (imbVar != null && (bcbVar = (bcb) imbVar.b) != null) {
            i40 i40Var = bcbVar.a;
            i40Var.getClass();
            Handler handler = icb.a;
            icb.b((fcb) i40Var.h, ecb.d);
        }
        b = null;
    }

    public static void b(km1 km1Var, cm6 cm6Var) {
        imb imbVar = b;
        if (imbVar == null || ((km1) imbVar.a).compareTo(km1Var) <= 0) {
            a();
            bcb bcbVar = (bcb) cm6Var.invoke();
            if (bcbVar != null) {
                b = new imb(km1Var, bcbVar);
            }
        }
    }
}
