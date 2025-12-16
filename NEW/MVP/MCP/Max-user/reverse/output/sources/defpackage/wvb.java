package defpackage;

import com.google.android.gms.maps.model.LatLng;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.location.map.pick.PickLocationScreen;

/* loaded from: classes2.dex */
public final class wvb extends dtf implements sm6 {
    public final /* synthetic */ PickLocationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvb(Continuation continuation, PickLocationScreen pickLocationScreen) {
        super(2, continuation);
        this.X = pickLocationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wvb wvbVar = (wvb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wvb wvbVar = new wvb(continuation, this.X);
        wvbVar.o = obj;
        return wvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        usd usdVarB;
        g8j.b(obj);
        svb svbVar = (svb) this.o;
        boolean zA = fni.a(svbVar, rvb.a);
        PickLocationScreen pickLocationScreen = this.X;
        if (zA) {
            yy7[] yy7VarArr = PickLocationScreen.v0;
            qsb qsbVar = (qsb) pickLocationScreen.t0.getValue();
            s2i s2iVar = (s2i) pickLocationScreen.c.getValue();
            int i = mvd.a;
            qsbVar.getClass();
            int i2 = mvd.j1;
            qsb.n(qsbVar, s2iVar, qsb.k, 169, mvd.h1, i2, 32);
        } else {
            if (!(svbVar instanceof qvb)) {
                throw new NoWhenBranchMatchedException();
            }
            qvb qvbVar = (qvb) svbVar;
            Float f = qvbVar.c;
            double d = qvbVar.b;
            double d2 = qvbVar.a;
            if (f != null) {
                usdVarB = yxi.c(new LatLng(d2, d), f.floatValue());
            } else {
                usdVarB = yxi.b(new LatLng(d2, d));
            }
            if (qvbVar.d) {
                iw6 iw6Var = pickLocationScreen.s0;
                if (iw6Var != null) {
                    iw6Var.c(usdVarB);
                }
            } else {
                iw6 iw6Var2 = pickLocationScreen.s0;
                if (iw6Var2 != null) {
                    iw6Var2.g(usdVarB);
                }
            }
        }
        return qqg.a;
    }
}
