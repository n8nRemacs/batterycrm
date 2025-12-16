package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class hoh implements ar6 {
    public static final hoh a;
    private static final ree descriptor;

    static {
        hoh hohVar = new hoh();
        a = hohVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryUnavailableResponse", hohVar, 3);
        j5cVar.k("requestId", false);
        j5cVar.k("available", false);
        j5cVar.k("deviceId", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        joh johVar = (joh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, johVar.a);
        bVarA.c(reeVar, 1, johVar.b);
        bVarA.s(reeVar, 2, johVar.c);
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
        String strJ2 = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strJ = yl3VarR.j(reeVar, 0);
                i |= 1;
            } else if (iE == 1) {
                zY = yl3VarR.y(reeVar, 1);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new UnknownFieldException(iE);
                }
                strJ2 = yl3VarR.j(reeVar, 2);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new joh(strJ, i, strJ2, zY);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{rmfVar, er0.a, rmfVar};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
