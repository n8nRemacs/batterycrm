package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class acj {
    public static final Object a(da6 da6Var, tm9 tm9Var) {
        if (kz5.$EnumSwitchMapping$0[da6Var.ordinal()] == 1) {
            return vfe.c(tm9Var);
        }
        try {
            tm9Var.v();
            return null;
        } catch (Throwable th) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = vfe.a.iterator();
            while (it.hasNext()) {
                ((qwa) it.next()).getClass();
                qwa.a(th);
            }
            int iV = az1.v(ctd.a);
            if (iV == 0) {
                return null;
            }
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
    }

    public static final void b(esg esgVar) {
        esgVar.d(151, new sdf(5));
        esgVar.d(152, new sdf(6));
        esgVar.d(153, new sdf(7));
        esgVar.d(154, new sdf(8));
        esgVar.d(155, new sdf(9));
        esgVar.d(156, new sdf(10));
        esgVar.d(157, new sdf(11));
        esgVar.d(158, new sdf(12));
        esgVar.d(159, new sdf(13));
        esgVar.d(160, new sdf(0));
        esgVar.d(161, new sdf(1));
        esgVar.d(162, new sdf(2));
        esgVar.d(163, new sdf(3));
        esgVar.d(164, new sdf(4));
        esgVar.b(3, new a4e(19));
    }
}
