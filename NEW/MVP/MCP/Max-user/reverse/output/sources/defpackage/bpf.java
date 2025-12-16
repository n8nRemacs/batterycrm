package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class bpf implements ar6 {
    public static final bpf a;
    private static final ree descriptor;

    static {
        bpf bpfVar = new bpf();
        a = bpfVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.SuccessResponse", bpfVar, 2);
        j5cVar.k("status", false);
        j5cVar.k("requestId", true);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        fpf fpfVar = (fpf) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        zy7 zy7Var = fpf.c[0];
        epf epfVar = fpfVar.a;
        String str = fpfVar.b;
        bVarA.o(reeVar, 0, zy7Var, epfVar);
        if (bVarA.u() || str != null) {
            bVarA.n(reeVar, 1, rmf.a, str);
        }
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        zy7[] zy7VarArr = fpf.c;
        epf epfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                epfVar = (epf) yl3VarR.p(reeVar, 0, zy7VarArr[0], epfVar);
                i |= 1;
            } else {
                if (iE != 1) {
                    throw new UnknownFieldException(iE);
                }
                str = (String) yl3VarR.w(reeVar, 1, rmf.a, str);
                i |= 2;
            }
        }
        yl3VarR.m(reeVar);
        return new fpf(i, epfVar, str);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{fpf.c[0], wvi.b(rmf.a)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
