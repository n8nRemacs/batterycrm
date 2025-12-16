package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public final class ka1 extends dtf implements sm6 {
    public final /* synthetic */ CallHistoryPageScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka1(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.X = callHistoryPageScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ka1 ka1Var = (ka1) l((cmb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ka1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ka1 ka1Var = new ka1(this.X, continuation);
        ka1Var.o = obj;
        return ka1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cmb cmbVar = (cmb) this.o;
        if (!fni.a(cmbVar, bmb.a)) {
            if (!(cmbVar instanceof amb)) {
                throw new NoWhenBranchMatchedException();
            }
            v17 v17Var = CallHistoryPageScreen.u0;
            CallHistoryPageScreen callHistoryPageScreen = this.X;
            ha1 ha1Var = (ha1) callHistoryPageScreen.Y.getValue();
            Collection collectionValues = ((amb) cmbVar).a.values();
            ha1Var.getClass();
            ha1Var.E(ue3.d0(collectionValues));
            callHistoryPageScreen.z0().setRefreshingNext(callHistoryPageScreen.B0().v());
            EndlessRecyclerView2 endlessRecyclerView2Z0 = callHistoryPageScreen.z0();
            pa1 pa1VarB0 = callHistoryPageScreen.B0();
            pa1VarB0.getClass();
            bb1 bb1Var = bb1.b;
            endlessRecyclerView2Z0.setRefreshingPrev(pa1VarB0.b == bb1.b && !((ArrayList) pa1VarB0.d.d).isEmpty());
        }
        return qqg.a;
    }
}
