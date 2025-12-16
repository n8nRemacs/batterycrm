package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public final /* synthetic */ class koh implements ar6 {
    public static final koh a;
    private static final ree descriptor;

    static {
        koh kohVar = new koh();
        a = kohVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryUpdateTokenRequest", kohVar, 4);
        j5cVar.k("queryId", false);
        j5cVar.k("requestId", false);
        j5cVar.k(IceCandidatePairChangedStat.KEY_REASON, true);
        j5cVar.k(ApiProtocol.KEY_TOKEN, true);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        moh mohVar = (moh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        rmf rmfVar = rmf.a;
        String str = mohVar.a;
        String str2 = mohVar.d;
        String str3 = mohVar.c;
        bVarA.n(reeVar, 0, rmfVar, str);
        bVarA.s(reeVar, 1, mohVar.b);
        if (bVarA.u() || str3 != null) {
            bVarA.n(reeVar, 2, rmfVar, str3);
        }
        if (bVarA.u() || str2 != null) {
            bVarA.n(reeVar, 3, rmfVar, str2);
        }
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        int i = 0;
        String str = null;
        String strJ = null;
        String str2 = null;
        String str3 = null;
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
                str2 = (String) yl3VarR.w(reeVar, 2, rmf.a, str2);
                i |= 4;
            } else {
                if (iE != 3) {
                    throw new UnknownFieldException(iE);
                }
                str3 = (String) yl3VarR.w(reeVar, 3, rmf.a, str3);
                i |= 8;
            }
        }
        yl3VarR.m(reeVar);
        return new moh(i, str, strJ, str2, str3);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{wvi.b(rmfVar), rmfVar, wvi.b(rmfVar), wvi.b(rmfVar)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
