package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d20 {
    public static final /* synthetic */ int d = 0;
    public final kz4 a;
    public final tw0 b;
    public final kz4 c;

    public d20(kz4 kz4Var, tw0 tw0Var, kz4 kz4Var2) {
        this.a = kz4Var;
        this.b = tw0Var;
        this.c = kz4Var2;
    }

    public static boolean a(jdc jdcVar) {
        r10 r10Var;
        f10 f10Var;
        w00 w00Var;
        v10 v10Var;
        k10 k10Var;
        if (jdcVar == null) {
            return true;
        }
        for (w10 w10Var : (List) jdcVar.b) {
            if (w10Var.a == s10.c && (k10Var = w10Var.b) != null && l8g.c(k10Var.Y)) {
                return false;
            }
            s10 s10Var = w10Var.a;
            if (s10Var == s10.d && (v10Var = w10Var.d) != null && v10Var.a == 0) {
                return false;
            }
            if (s10Var == s10.o && (w00Var = w10Var.e) != null && w00Var.a == 0) {
                return false;
            }
            if (s10Var == s10.t0 && (f10Var = w10Var.j) != null && f10Var.a == 0) {
                return false;
            }
            if ((s10Var == s10.X && (r10Var = w10Var.f) != null && r10Var.a == 0) || w10Var.x == m10.b) {
                return false;
            }
        }
        return true;
    }

    public final void b(si9 si9Var) {
        if (si9Var.t()) {
            Iterator it = ((List) si9Var.x0.b).iterator();
            while (it.hasNext()) {
                c(si9Var.a, ((w10) it.next()).r, m10.b);
            }
        }
    }

    public final void c(long j, String str, m10 m10Var) {
        ((qi9) this.a.get()).r(j, str, new xtd(6, m10Var));
    }
}
