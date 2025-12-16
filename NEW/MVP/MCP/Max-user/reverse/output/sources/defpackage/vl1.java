package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class vl1 extends dtf implements sm6 {
    public final /* synthetic */ CallScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.X = callScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vl1 vl1Var = (vl1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vl1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vl1 vl1Var = new vl1(continuation, this.X);
        vl1Var.o = obj;
        return vl1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = !((Boolean) this.o).booleanValue();
        rha rhaVar = CallScreen.N0;
        this.X.F0().c(z);
        return qqg.a;
    }
}
