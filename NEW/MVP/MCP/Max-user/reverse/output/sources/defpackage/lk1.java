package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class lk1 extends dtf implements sm6 {
    public final /* synthetic */ CallRateBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.X = callRateBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lk1 lk1Var = (lk1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lk1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lk1 lk1Var = new lk1(continuation, this.X);
        lk1Var.o = obj;
        return lk1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        CallRateBottomSheet callRateBottomSheet = this.X;
        ((OneMeButton) callRateBottomSheet.L0.D(callRateBottomSheet, CallRateBottomSheet.M0[7])).setVisibility(zBooleanValue ? 0 : 8);
        return qqg.a;
    }
}
