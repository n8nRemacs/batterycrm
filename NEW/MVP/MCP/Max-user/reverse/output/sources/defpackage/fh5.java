package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class fh5 implements ar6 {
    public static final fh5 a;
    private static final ree descriptor;

    static {
        fh5 fh5Var = new fh5();
        a = fh5Var;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.ErrorResponse.Error", fh5Var, 1);
        j5cVar.k("code", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, ((hh5) obj).a);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String strJ = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else {
                if (iE != 0) {
                    throw new UnknownFieldException(iE);
                }
                strJ = yl3VarR.j(reeVar, 0);
                i = 1;
            }
        }
        yl3VarR.m(reeVar);
        return new hh5(i, strJ);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{rmf.a};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
