package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class bzh implements ar6 {
    public static final bzh a;
    private static final ree descriptor;

    static {
        bzh bzhVar = new bzh();
        a = bzhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageSaveKeyRequest", bzhVar, 4);
        j5cVar.k("queryId", false);
        j5cVar.k("requestId", false);
        j5cVar.k("key", false);
        j5cVar.k(SdkMetricStatEvent.VALUE_KEY, false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        dzh dzhVar = (dzh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        rmf rmfVar = rmf.a;
        bVarA.n(reeVar, 0, rmfVar, dzhVar.a);
        bVarA.s(reeVar, 1, dzhVar.b);
        bVarA.s(reeVar, 2, dzhVar.c);
        bVarA.n(reeVar, 3, rmfVar, dzhVar.d);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        int i = 0;
        String str = null;
        String strJ = null;
        String strJ2 = null;
        String str2 = null;
        boolean z = true;
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
            } else if (iE == 2) {
                strJ2 = yl3VarR.j(reeVar, 2);
                i |= 4;
            } else {
                if (iE != 3) {
                    throw new UnknownFieldException(iE);
                }
                str2 = (String) yl3VarR.w(reeVar, 3, rmf.a, str2);
                i |= 8;
            }
        }
        yl3VarR.m(reeVar);
        return new dzh(i, str, strJ, strJ2, str2);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{wvi.b(rmfVar), rmfVar, rmfVar, wvi.b(rmfVar)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
