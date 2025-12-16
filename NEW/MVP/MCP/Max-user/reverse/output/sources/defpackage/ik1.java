package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class ik1 extends dtf implements sm6 {
    public final /* synthetic */ CallRateBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.X = callRateBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ik1 ik1Var = (ik1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ik1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ik1 ik1Var = new ik1(continuation, this.X);
        ik1Var.o = obj;
        return ik1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        s5g s5gVar = (s5g) this.o;
        CallRateBottomSheet callRateBottomSheet = this.X;
        ((TextView) callRateBottomSheet.I0.D(callRateBottomSheet, CallRateBottomSheet.M0[4])).setText(s5gVar.b(callRateBottomSheet.getContext()));
        return qqg.a;
    }
}
