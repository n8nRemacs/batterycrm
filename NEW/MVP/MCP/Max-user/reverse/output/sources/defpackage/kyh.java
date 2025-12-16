package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class kyh implements ar6 {
    public static final kyh a;
    private static final ree descriptor;

    static {
        kyh kyhVar = new kyh();
        a = kyhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyRequest", kyhVar, 3);
        j5cVar.k("queryId", false);
        j5cVar.k("requestId", false);
        j5cVar.k("key", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        myh myhVar = (myh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.n(reeVar, 0, rmf.a, myhVar.a);
        bVarA.s(reeVar, 1, myhVar.b);
        bVarA.s(reeVar, 2, myhVar.c);
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
        String strJ2 = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                str = (String) yl3VarR.w(reeVar, 0, rmf.a, str);
                i |= 1;
            } else if (iE == 1) {
                strJ = yl3VarR.j(reeVar, 1);
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
        return new myh(str, i, strJ, strJ2);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{wvi.b(rmfVar), rmfVar, rmfVar};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
