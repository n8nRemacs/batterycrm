package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class vwh implements ar6 {
    public static final vwh a;
    private static final ree descriptor;

    static {
        vwh vwhVar = new vwh();
        a = vwhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupScreenCaptureBehaviorRequest", vwhVar, 2);
        j5cVar.k("requestId", false);
        j5cVar.k("isScreenCaptureEnabled", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        xwh xwhVar = (xwh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, xwhVar.a);
        bVarA.c(reeVar, 1, xwhVar.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String strJ = null;
        boolean z = true;
        int i = 0;
        boolean zY = false;
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
                zY = yl3VarR.y(reeVar, 1);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new xwh(strJ, i, zY);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a, er0.a};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
