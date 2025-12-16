package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class mth implements ar6 {
    public static final mth a;
    private static final ree descriptor;

    static {
        mth mthVar = new mth();
        a = mthVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.phone.WebAppRequestPhoneResponse", mthVar, 2);
        j5cVar.k("requestId", false);
        j5cVar.k("phone", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        oth othVar = (oth) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, othVar.a);
        bVarA.s(reeVar, 1, othVar.b);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        String strJ = null;
        boolean z = true;
        int i = 0;
        String strJ2 = null;
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
                strJ2 = yl3VarR.j(reeVar, 1);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new oth(i, strJ, strJ2);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{rmfVar, rmfVar};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
