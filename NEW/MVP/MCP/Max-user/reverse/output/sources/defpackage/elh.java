package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public final /* synthetic */ class elh implements ar6 {
    public static final elh a;
    private static final ree descriptor;

    static {
        elh elhVar = new elh();
        a = elhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAccessRequest", elhVar, 3);
        j5cVar.k("queryId", false);
        j5cVar.k("requestId", false);
        j5cVar.k(IceCandidatePairChangedStat.KEY_REASON, true);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        glh glhVar = (glh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        rmf rmfVar = rmf.a;
        String str = glhVar.a;
        String str2 = glhVar.c;
        bVarA.n(reeVar, 0, rmfVar, str);
        bVarA.s(reeVar, 1, glhVar.b);
        if (bVarA.u() || str2 != null) {
            bVarA.n(reeVar, 2, rmfVar, str2);
        }
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
        String str2 = null;
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
                str2 = (String) yl3VarR.w(reeVar, 2, rmf.a, str2);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new glh(str, i, strJ, str2);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{wvi.b(rmfVar), rmfVar, wvi.b(rmfVar)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
