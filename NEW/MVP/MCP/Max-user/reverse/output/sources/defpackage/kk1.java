package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class kk1 extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ CallRateBottomSheet Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(Continuation continuation, View view, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.X = view;
        this.Y = callRateBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kk1 kk1Var = (kk1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kk1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kk1 kk1Var = new kk1(continuation, this.X, this.Y);
        kk1Var.o = obj;
        return kk1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List<qk1> list = (List) this.o;
        ViewGroup viewGroup = (ViewGroup) this.X;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        TransitionManager.beginDelayedTransition(viewGroup, callRateBottomSheet.G0);
        CallRateBottomSheet.O0(callRateBottomSheet).removeAllViews();
        CallRateBottomSheet.O0(callRateBottomSheet).setVisibility(!list.isEmpty() ? 0 : 8);
        for (qk1 qk1Var : list) {
            d8d d8dVarO0 = CallRateBottomSheet.O0(callRateBottomSheet);
            int i = qk1Var.a;
            String strValueOf = String.valueOf(qk1Var.b.b(callRateBottomSheet.getContext()));
            d8dVarO0.getClass();
            x7d x7dVar = new x7d(d8dVarO0.getContext());
            x7dVar.setId(Integer.hashCode(i));
            x7dVar.setText(strValueOf);
            x7dVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            x7dVar.setTextAlignment(4);
            wsf.j(x7dVar, x7dVar.getPaint(), dpg.i);
            x7dVar.setChecked(false);
            d8d.a(x7dVar, a93.s0.y(x7dVar));
            d8dVarO0.b(x7dVar, x7dVar.b, i);
            x7dVar.setOnClickListener(new iq5(x7dVar, d8dVarO0, i, 2));
            d8dVarO0.addView(x7dVar);
        }
        return qqg.a;
    }
}
