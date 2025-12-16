package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class y31 extends dtf implements sm6 {
    public final /* synthetic */ CallBottomPanelWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.X = callBottomPanelWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y31 y31Var = (y31) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y31Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        y31 y31Var = new y31(continuation, this.X);
        y31Var.o = obj;
        return y31Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        CallBottomPanelWidget callBottomPanelWidget = this.X;
        if (zBooleanValue) {
            yy7[] yy7VarArr = CallBottomPanelWidget.Z;
            k31 k31VarY0 = callBottomPanelWidget.y0();
            k31VarY0.R0 = k31VarY0.w(k31VarY0.R0, k31VarY0.J0, new n5g(m0b.i2), new f31(k31VarY0, 2), Integer.valueOf(i0b.Q));
        } else {
            yy7[] yy7VarArr2 = CallBottomPanelWidget.Z;
            ncg ncgVar = callBottomPanelWidget.y0().R0;
            if (ncgVar != null) {
                ncgVar.a();
            }
        }
        return qqg.a;
    }
}
