package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ww2 extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ zx2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww2(zx2 zx2Var, View view, Continuation continuation) {
        super(2, continuation);
        this.o = zx2Var;
        this.X = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ww2 ww2Var = (ww2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ww2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ww2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zx2 zx2Var = this.o;
        pb2 pb2Var = (pb2) zx2Var.a1.a.getValue();
        qqg qqgVar = qqg.a;
        if (pb2Var == null) {
            return qqgVar;
        }
        rf2 rf2Var = pb2Var.b;
        boolean Z = pb2Var.Z((pb3) zx2Var.y0.getValue());
        o98 o98VarD = ve3.d();
        if ((pb2Var.Q() || rf2Var.c != of2.c) && !pb2Var.X() && !pb2Var.P() && pb2Var.c != null) {
            o98VarD.add(new b44(zud.L0, new n5g(avd.T), new Integer(yud.K0), (Integer) null, 20));
        }
        if (!pb2Var.W()) {
            o98VarD.add(new b44(!Z ? zud.K0 : zud.J0, new n5g(avd.S), new Integer(!Z ? yud.t1 : yud.s1), (Integer) null, 20));
            if (!pb2Var.M() || pb2Var.h0()) {
                o98VarD.add(new b44(zud.H0, new n5g(avd.n), new Integer(yud.c), (Integer) null, 20));
            }
            zx2Var.w0.getClass();
            l5c l5cVar = (l5c) ((age) zx2Var.z0.getValue());
            l5cVar.getClass();
            if (sg4.a((int) l5cVar.m(PmsKey.f37debugmode, 0)) == sg4.DEV_OPTIONS_MENU && !pb2Var.M()) {
                o98VarD.add(new b44(zud.M0, new n5g(avd.D), new Integer(y9b.t), (Integer) null, 20));
            }
        }
        if (pb2Var.M() && pb2Var.f0()) {
            o98VarD.add(new b44(zud.N0, new n5g(avd.E), new Integer(yud.T1), (Integer) null, 20));
        }
        gu5 gu5Var = (gu5) zx2Var.z();
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f26channelscomplaintenabled, false) && pb2Var.M() && pb2Var.F() && !pb2Var.i0()) {
            o98VarD.add(new b44(zud.I0, new n5g(avd.B), new Integer(w9b.V), new Integer(yud.J0), new Integer(w9b.Q)));
        }
        o98 o98VarA = ve3.a(o98VarD);
        ci5 ci5Var = zx2Var.d1;
        imb imbVar = new imb("chat_server_id", new Long(rf2Var.a));
        ku3 ku3VarN = pb2Var.n();
        xfh.r(ci5Var, new hw2(o98VarA, gwi.b(imbVar, new imb("contact_id", ku3VarN != null ? new Long(ku3VarN.p()) : null)), this.X));
        return qqgVar;
    }
}
