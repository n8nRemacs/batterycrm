package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final /* synthetic */ class klh implements ar6 {
    public static final klh a;
    private static final ree descriptor;

    static {
        klh klhVar = new klh();
        a = klhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthResponse", klhVar, 3);
        j5cVar.k("requestId", false);
        j5cVar.k(ApiProtocol.KEY_TOKEN, false);
        j5cVar.k("status", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        mlh mlhVar = (mlh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        zy7[] zy7VarArr = mlh.d;
        bVarA.s(reeVar, 0, mlhVar.a);
        bVarA.s(reeVar, 1, mlhVar.b);
        bVarA.o(reeVar, 2, zy7VarArr[2], mlhVar.c);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        zy7[] zy7VarArr = mlh.d;
        String strJ = null;
        boolean z = true;
        int i = 0;
        String strJ2 = null;
        epf epfVar = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strJ = yl3VarR.j(reeVar, 0);
                i |= 1;
            } else if (iE == 1) {
                strJ2 = yl3VarR.j(reeVar, 1);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new UnknownFieldException(iE);
                }
                epfVar = (epf) yl3VarR.p(reeVar, 2, zy7VarArr[2], epfVar);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new mlh(i, strJ, strJ2, epfVar);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        zy7 zy7Var = mlh.d[2];
        rmf rmfVar = rmf.a;
        return new zy7[]{rmfVar, rmfVar, zy7Var};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
