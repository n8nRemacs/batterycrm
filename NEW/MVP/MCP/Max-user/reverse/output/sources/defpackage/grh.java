package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class grh implements ar6 {
    public static final grh a;
    private static final ree descriptor;

    static {
        grh grhVar = new grh();
        a = grhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackResponse", grhVar, 2);
        j5cVar.k("requestId", false);
        j5cVar.k("status", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        irh irhVar = (irh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        zy7[] zy7VarArr = irh.c;
        bVarA.s(reeVar, 0, irhVar.a);
        bVarA.o(reeVar, 1, zy7VarArr[1], irhVar.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        zy7[] zy7VarArr = irh.c;
        String strJ = null;
        boolean z = true;
        int i = 0;
        nrh nrhVar = null;
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
                nrhVar = (nrh) yl3VarR.p(reeVar, 1, zy7VarArr[1], nrhVar);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new irh(i, strJ, nrhVar);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a, irh.c[1]};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
