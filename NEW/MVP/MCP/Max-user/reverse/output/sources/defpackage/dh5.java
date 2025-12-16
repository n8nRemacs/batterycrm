package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final /* synthetic */ class dh5 implements ar6 {
    public static final dh5 a;
    private static final ree descriptor;

    static {
        dh5 dh5Var = new dh5();
        a = dh5Var;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.ErrorResponse", dh5Var, 2);
        j5cVar.k("requestId", false);
        j5cVar.k(NegotiationErrorStat.KEY_ERROR, false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        ih5 ih5Var = (ih5) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, ih5Var.a);
        bVarA.o(reeVar, 1, fh5.a, ih5Var.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String strJ = null;
        boolean z = true;
        int i = 0;
        hh5 hh5Var = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strJ = yl3VarR.j(reeVar, 0);
                i |= 1;
            } else {
                if (iE != 1) {
                    throw new UnknownFieldException(iE);
                }
                hh5Var = (hh5) yl3VarR.p(reeVar, 1, fh5.a, hh5Var);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new ih5(i, strJ, hh5Var);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a, fh5.a};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
