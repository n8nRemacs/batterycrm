package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class nyh implements ar6 {
    public static final nyh a;
    private static final ree descriptor;

    static {
        nyh nyhVar = new nyh();
        a = nyhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyResponse", nyhVar, 3);
        j5cVar.k("requestId", false);
        j5cVar.k("key", false);
        j5cVar.k(SdkMetricStatEvent.VALUE_KEY, false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        pyh pyhVar = (pyh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, pyhVar.a);
        bVarA.s(reeVar, 1, pyhVar.b);
        bVarA.s(reeVar, 2, pyhVar.c);
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
        String strJ3 = null;
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
                strJ3 = yl3VarR.j(reeVar, 2);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new pyh(strJ, i, strJ2, strJ3);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{rmfVar, rmfVar, rmfVar};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
