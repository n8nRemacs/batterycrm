package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final class ta1 extends dtf implements sm6 {
    public final /* synthetic */ CallHistoryScreen X;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta1(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.X = callHistoryScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ta1 ta1Var = (ta1) l(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ta1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ta1 ta1Var = new ta1(continuation, this.X);
        ta1Var.o = ((Number) obj).longValue();
        return ta1Var;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (this.o > 0) {
            yy7[] yy7VarArr = CallHistoryScreen.D0;
        }
        return qqg.a;
    }
}
