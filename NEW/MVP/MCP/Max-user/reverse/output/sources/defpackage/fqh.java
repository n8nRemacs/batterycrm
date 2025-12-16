package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class fqh implements ar6 {
    public static final fqh a;
    private static final ree descriptor;

    static {
        fqh fqhVar = new fqh();
        a = fqhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.download.WebAppDownloadFileRequest", fqhVar, 3);
        j5cVar.k("requestId", false);
        j5cVar.k(KwsFeaturesConfigProviderImpl.URL_KEY, false);
        j5cVar.k("file_name", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        hqh hqhVar = (hqh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.s(reeVar, 0, hqhVar.a);
        bVarA.s(reeVar, 1, hqhVar.b);
        bVarA.s(reeVar, 2, hqhVar.c);
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
        return new hqh(strJ, i, strJ2, strJ3);
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
