package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class kc1 extends dtf implements sm6 {
    public final /* synthetic */ CallIndicatorWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(Continuation continuation, CallIndicatorWidget callIndicatorWidget) {
        super(2, continuation);
        this.X = callIndicatorWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kc1 kc1Var = (kc1) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kc1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kc1 kc1Var = new kc1(continuation, this.X);
        kc1Var.o = obj;
        return kc1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        CallIndicatorWidget.y0(this.X).setTime((String) this.o);
        return qqg.a;
    }
}
