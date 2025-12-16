package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class arh implements ar6 {
    public static final arh a;
    private static final ree descriptor;

    static {
        arh arhVar = new arh();
        a = arhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackImpact", arhVar, 3);
        j5cVar.k("requestId", false);
        j5cVar.k("impactStyle", false);
        j5cVar.k("disableVibrationFallback", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        crh crhVar = (crh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        zy7[] zy7VarArr = crh.d;
        bVarA.s(reeVar, 0, crhVar.a);
        bVarA.o(reeVar, 1, zy7VarArr[1], crhVar.b);
        bVarA.c(reeVar, 2, crhVar.c);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        zy7[] zy7VarArr = crh.d;
        String strJ = null;
        boolean z = true;
        int i = 0;
        boolean zY = false;
        nh7 nh7Var = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strJ = yl3VarR.j(reeVar, 0);
                i |= 1;
            } else if (iE == 1) {
                nh7Var = (nh7) yl3VarR.p(reeVar, 1, zy7VarArr[1], nh7Var);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new UnknownFieldException(iE);
                }
                zY = yl3VarR.y(reeVar, 2);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new crh(i, strJ, nh7Var, zY);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a, crh.d[1], er0.a};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
