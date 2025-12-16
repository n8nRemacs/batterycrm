package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class byh implements ar6 {
    public static final byh a;
    private static final ree descriptor;

    static {
        byh byhVar = new byh();
        a = byhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageClearRequest", byhVar, 2);
        j5cVar.k("queryId", false);
        j5cVar.k("requestId", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        dyh dyhVar = (dyh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.n(reeVar, 0, rmf.a, dyhVar.a);
        bVarA.s(reeVar, 1, dyhVar.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String str = null;
        boolean z = true;
        int i = 0;
        String strJ = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                str = (String) yl3VarR.w(reeVar, 0, rmf.a, str);
                i |= 1;
            } else {
                if (iE != 1) {
                    throw new UnknownFieldException(iE);
                }
                strJ = yl3VarR.j(reeVar, 1);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new dyh(i, str, strJ);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{wvi.b(rmfVar), rmfVar};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
