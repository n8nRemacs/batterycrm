package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class jk1 extends dtf implements sm6 {
    public final /* synthetic */ CallRateBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.X = callRateBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jk1 jk1Var = (jk1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jk1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jk1 jk1Var = new jk1(continuation, this.X);
        jk1Var.o = obj;
        return jk1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List<v7d> list = (List) this.o;
        CallRateBottomSheet callRateBottomSheet = this.X;
        ((w7d) callRateBottomSheet.J0.D(callRateBottomSheet, CallRateBottomSheet.M0[5])).setButtonToolDataList(list);
        return qqg.a;
    }
}
