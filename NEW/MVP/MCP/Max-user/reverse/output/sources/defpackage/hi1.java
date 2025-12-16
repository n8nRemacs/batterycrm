package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final class hi1 extends dtf implements sm6 {
    public final /* synthetic */ CallOpponentsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.X = callOpponentsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hi1 hi1Var = (hi1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hi1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hi1 hi1Var = new hi1(continuation, this.X);
        hi1Var.o = obj;
        return hi1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pa paVar = (pa) this.o;
        CallOpponentsListWidget callOpponentsListWidget = this.X;
        hqi.g((TextView) callOpponentsListWidget.z0.D(callOpponentsListWidget, CallOpponentsListWidget.H0[8]), !paVar.b.isEmpty(), 0L, null, 6);
        ((la) callOpponentsListWidget.E0.getValue()).E(paVar.b);
        return qqg.a;
    }
}
