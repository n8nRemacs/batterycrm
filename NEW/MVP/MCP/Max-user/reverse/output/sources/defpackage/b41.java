package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class b41 extends dtf implements sm6 {
    public final /* synthetic */ CallBottomPanelWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.X = callBottomPanelWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b41 b41Var = (b41) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b41Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b41 b41Var = new b41(continuation, this.X);
        b41Var.o = obj;
        return b41Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            yy7[] yy7VarArr = CallBottomPanelWidget.Z;
            CallBottomPanelWidget callBottomPanelWidget = this.X;
            z34 z34Var = callBottomPanelWidget.X;
            if (z34Var != null) {
                z34Var.dismiss();
            }
            callBottomPanelWidget.X = null;
        }
        return qqg.a;
    }
}
