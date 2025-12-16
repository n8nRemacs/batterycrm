package defpackage;

import com.google.android.gms.maps.model.LatLng;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final class cye extends dtf implements sm6 {
    public final /* synthetic */ ShowLocationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cye(Continuation continuation, ShowLocationScreen showLocationScreen) {
        super(2, continuation);
        this.X = showLocationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cye cyeVar = (cye) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cyeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cye cyeVar = new cye(continuation, this.X);
        cyeVar.o = obj;
        return cyeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xxe xxeVar = (xxe) this.o;
        boolean zA = fni.a(xxeVar, wxe.a);
        ShowLocationScreen showLocationScreen = this.X;
        if (zA) {
            yy7[] yy7VarArr = ShowLocationScreen.B0;
            qsb qsbVar = (qsb) showLocationScreen.z0.getValue();
            s2i s2iVar = (s2i) showLocationScreen.Z.getValue();
            int i = mvd.a;
            qsbVar.getClass();
            qsb.n(qsbVar, s2iVar, qsb.k, 169, mvd.h1, mvd.j1, 32);
        } else {
            if (!(xxeVar instanceof vxe)) {
                throw new NoWhenBranchMatchedException();
            }
            vxe vxeVar = (vxe) xxeVar;
            Float f = vxeVar.c;
            double d = vxeVar.b;
            double d2 = vxeVar.a;
            usd usdVarB = f == null ? yxi.b(new LatLng(d2, d)) : yxi.c(new LatLng(d2, d), vxeVar.c.floatValue());
            iw6 iw6Var = showLocationScreen.x0;
            if (iw6Var != null) {
                iw6Var.c(usdVarB);
            }
        }
        return qqg.a;
    }
}
