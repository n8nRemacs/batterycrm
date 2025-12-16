package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class jc1 extends dtf implements sm6 {
    public final /* synthetic */ CallIndicatorWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(Continuation continuation, CallIndicatorWidget callIndicatorWidget) {
        super(2, continuation);
        this.X = callIndicatorWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jc1 jc1Var = (jc1) l((xb1) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jc1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jc1 jc1Var = new jc1(continuation, this.X);
        jc1Var.o = obj;
        return jc1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xb1 xb1Var = (xb1) this.o;
        zb1 zb1VarY0 = CallIndicatorWidget.y0(this.X);
        zb1VarY0.setTitle(xb1Var.a);
        zb1VarY0.setIndicatorState(xb1Var.b);
        return qqg.a;
    }
}
