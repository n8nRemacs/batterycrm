package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class lsh implements ar6 {
    public static final lsh a;
    private static final ree descriptor;

    static {
        lsh lshVar = new lsh();
        a = lshVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.share.WebAppMaxShareResponse", lshVar, 2);
        j5cVar.k("requestId", false);
        j5cVar.k("status", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        nsh nshVar = (nsh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        zy7[] zy7VarArr = nsh.c;
        bVarA.s(reeVar, 0, nshVar.a);
        bVarA.o(reeVar, 1, zy7VarArr[1], nshVar.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        zy7[] zy7VarArr = nsh.c;
        String strJ = null;
        boolean z = true;
        int i = 0;
        ayh ayhVar = null;
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
                ayhVar = (ayh) yl3VarR.p(reeVar, 1, zy7VarArr[1], ayhVar);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new nsh(i, strJ, ayhVar);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a, nsh.c[1]};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
