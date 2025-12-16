package defpackage;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class gnh implements ar6 {
    public static final gnh a;
    private static final ree descriptor;

    static {
        gnh gnhVar = new gnh();
        a = gnhVar;
        j5c j5cVar = new j5c("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryInfoResponse", gnhVar, 7);
        j5cVar.k("requestId", false);
        j5cVar.k("available", false);
        j5cVar.k("type", false);
        j5cVar.k("accessRequested", false);
        j5cVar.k("accessGranted", false);
        j5cVar.k("tokenSaved", false);
        j5cVar.k("deviceId", false);
        descriptor = j5cVar;
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        inh inhVar = (inh) obj;
        ree reeVar = descriptor;
        b bVarA = bVar.a(reeVar);
        zy7[] zy7VarArr = inh.h;
        bVarA.s(reeVar, 0, inhVar.a);
        bVarA.c(reeVar, 1, inhVar.b);
        bVarA.o(reeVar, 2, zy7VarArr[2], inhVar.c);
        bVarA.c(reeVar, 3, inhVar.d);
        bVarA.c(reeVar, 4, inhVar.e);
        bVarA.c(reeVar, 5, inhVar.f);
        bVarA.s(reeVar, 6, inhVar.g);
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVar = descriptor;
        yl3 yl3VarR = lh4Var.r(reeVar);
        zy7[] zy7VarArr = inh.h;
        int i = 0;
        boolean zY = false;
        boolean zY2 = false;
        boolean zY3 = false;
        boolean zY4 = false;
        String strJ = null;
        List list = null;
        String strJ2 = null;
        boolean z = true;
        while (z) {
            int iE = yl3VarR.e(reeVar);
            switch (iE) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strJ = yl3VarR.j(reeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    zY = yl3VarR.y(reeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) yl3VarR.p(reeVar, 2, zy7VarArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    zY2 = yl3VarR.y(reeVar, 3);
                    i |= 8;
                    break;
                case 4:
                    zY3 = yl3VarR.y(reeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    zY4 = yl3VarR.y(reeVar, 5);
                    i |= 32;
                    break;
                case 6:
                    strJ2 = yl3VarR.j(reeVar, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iE);
            }
        }
        yl3VarR.m(reeVar);
        return new inh(i, strJ, zY, list, zY2, zY3, zY4, strJ2);
    }

    @Override // defpackage.ar6
    public final zy7[] c() {
        zy7 zy7Var = inh.h[2];
        rmf rmfVar = rmf.a;
        er0 er0Var = er0.a;
        return new zy7[]{rmfVar, er0Var, zy7Var, er0Var, er0Var, er0Var, rmfVar};
    }

    @Override // defpackage.zy7
    public final ree d() {
        return descriptor;
    }
}
