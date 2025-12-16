package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class bs1 extends dtf implements sm6 {
    public final /* synthetic */ CallTopPanelWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.X = callTopPanelWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bs1 bs1Var = (bs1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bs1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bs1 bs1Var = new bs1(continuation, this.X);
        bs1Var.o = obj;
        return bs1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int iIntValue = ((Number) this.o).intValue();
        yy7[] yy7VarArr = CallTopPanelWidget.d;
        this.X.y0().setChatUnreadMessageCount(iIntValue);
        return qqg.a;
    }
}
