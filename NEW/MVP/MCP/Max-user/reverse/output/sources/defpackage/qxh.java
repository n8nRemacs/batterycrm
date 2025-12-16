package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class qxh implements ar6 {
    public static final qxh a;
    private static final ree descriptor;

    static {
        qxh qxhVar = new qxh();
        a = qxhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.share.WebAppShareRequest", qxhVar, 3);
        j5cVar.k("requestId", false);
        j5cVar.k("text", true);
        j5cVar.k("link", true);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        uxh uxhVar = (uxh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        String str = uxhVar.a;
        String str2 = uxhVar.c;
        String str3 = uxhVar.b;
        bVarA.s(reeVar, 0, str);
        if (bVarA.u() || str3 != null) {
            bVarA.n(reeVar, 1, rmf.a, str3);
        }
        if (bVarA.u() || str2 != null) {
            bVarA.n(reeVar, 2, rmf.a, str2);
        }
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String strJ = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strJ = yl3VarR.j(reeVar, 0);
                i |= 1;
            } else if (iE == 1) {
                str = (String) yl3VarR.w(reeVar, 1, rmf.a, str);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new UnknownFieldException(iE);
                }
                str2 = (String) yl3VarR.w(reeVar, 2, rmf.a, str2);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new uxh(strJ, i, str, str2);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{rmfVar, wvi.b(rmfVar), wvi.b(rmfVar)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
