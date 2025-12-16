package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class rxh implements ar6 {
    public static final rxh a;
    private static final ree descriptor;

    static {
        rxh rxhVar = new rxh();
        a = rxhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.WebAppShareRequest", rxhVar, 3);
        j5cVar.k(KwsFeaturesConfigProviderImpl.URL_KEY, true);
        j5cVar.k("title", true);
        j5cVar.k("text", true);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        vxh vxhVar = (vxh) obj;
        String str = vxhVar.c;
        String str2 = vxhVar.b;
        String str3 = vxhVar.a;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        if (bVarA.u() || str3 != null) {
            bVarA.n(reeVar, 0, rmf.a, str3);
        }
        if (bVarA.u() || str2 != null) {
            bVarA.n(reeVar, 1, rmf.a, str2);
        }
        if (bVarA.u() || str != null) {
            bVarA.n(reeVar, 2, rmf.a, str);
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
        String str2 = null;
        String str3 = null;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                str = (String) yl3VarR.w(reeVar, 0, rmf.a, str);
                i |= 1;
            } else if (iE == 1) {
                str2 = (String) yl3VarR.w(reeVar, 1, rmf.a, str2);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new UnknownFieldException(iE);
                }
                str3 = (String) yl3VarR.w(reeVar, 2, rmf.a, str3);
                i |= 4;
            }
        }
        yl3VarR.m(reeVar);
        return new vxh(str, i, str2, str3);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        rmf rmfVar = rmf.a;
        return new zy7[]{wvi.b(rmfVar), wvi.b(rmfVar), wvi.b(rmfVar)};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
