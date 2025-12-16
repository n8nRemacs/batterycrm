package defpackage;

import android.view.View;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class mk1 extends dtf implements sm6 {
    public final /* synthetic */ CallRateBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.X = callRateBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mk1 mk1Var = (mk1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mk1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mk1 mk1Var = new mk1(continuation, this.X);
        mk1Var.o = obj;
        return mk1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pk1 pk1Var = (pk1) this.o;
        boolean zA = fni.a(pk1Var, nk1.a);
        CallRateBottomSheet callRateBottomSheet = this.X;
        if (zA) {
            d8d d8dVarO0 = CallRateBottomSheet.O0(callRateBottomSheet);
            int childCount = d8dVarO0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = d8dVarO0.getChildAt(i);
                if (childAt instanceof x7d) {
                    ((x7d) childAt).setChecked(false);
                }
            }
        } else {
            if (!(pk1Var instanceof ok1)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((ok1) pk1Var).a) {
                String upperCase = z7.e(callRateBottomSheet.getContext(), mvd.e2).toUpperCase(Locale.ROOT);
                ccb ccbVar = new ccb(callRateBottomSheet);
                ccbVar.g(new n5g(m0b.P0));
                ccbVar.a(new p5g(m0b.O0, ys.D(new Object[]{upperCase})));
                ccbVar.e(new qcb(i0b.d));
                ccbVar.i();
            }
            callRateBottomSheet.E0(true);
        }
        return qqg.a;
    }
}
