package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class rsh implements ar6 {
    public static final rsh a;
    private static final ree descriptor;

    static {
        rsh rshVar = new rsh();
        a = rshVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.codereader.WebAppOpenCodeReaderRequest", rshVar, 2);
        j5cVar.k("requestId", false);
        j5cVar.k("fileSelect", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        tsh tshVar = (tsh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, tshVar.a);
        bVarA.n(reeVar, 1, er0.a, tshVar.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String strJ = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
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
                bool = (Boolean) yl3VarR.w(reeVar, 1, er0.a, bool);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new tsh(i, strJ, bool);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a, wvi.b(er0.a)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
