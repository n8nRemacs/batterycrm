package defpackage;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class swh implements ar6 {
    public static final swh a;
    private static final ree descriptor;

    static {
        swh swhVar = new swh();
        a = swhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupClosingBehaviorRequest", swhVar, 1);
        j5cVar.k("needConfirmation", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        bVarA.c(reeVar, 0, ((uwh) obj).a);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        boolean z = true;
        int i = 0;
        boolean zY = false;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            if (iE == -1) {
                z = false;
            } else {
                if (iE != 0) {
                    throw new UnknownFieldException(iE);
                }
                zY = yl3VarR.y(reeVar, 0);
                i = 1;
            }
        }
        yl3VarR.m(reeVar);
        return new uwh(i, zY);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        return new zy7[]{er0.a};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
