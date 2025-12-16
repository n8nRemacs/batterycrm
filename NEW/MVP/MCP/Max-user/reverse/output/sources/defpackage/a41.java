package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class a41 extends dtf implements sm6 {
    public final /* synthetic */ CallBottomPanelWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.X = callBottomPanelWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a41 a41Var = (a41) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a41Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a41 a41Var = new a41(continuation, this.X);
        a41Var.o = obj;
        return a41Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ns0 ns0Var = (ns0) this.o;
        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
        CallBottomPanelWidget callBottomPanelWidget = this.X;
        k31 k31VarY0 = callBottomPanelWidget.y0();
        k31 k31VarY02 = callBottomPanelWidget.y0();
        if (k31VarY02 == null) {
            k31VarY02 = null;
        }
        if (k31VarY02 != null && k31VarY02.getVisibility() == 0) {
            ms8 ms8Var = ns0Var.b;
            ms8 ms8Var2 = ns0Var.a;
            k31VarY0.setVideoEnabled(ms8Var);
            k31VarY0.setMicrophoneEnabled(ms8Var2);
            k31VarY0.setRaiseHand(ns0Var.c);
            callBottomPanelWidget.y0().setAudioInfo(ns0Var.d);
            callBottomPanelWidget.o.O(callBottomPanelWidget, CallBottomPanelWidget.Z[1], ms8Var2 == ms8.b ? svi.e(callBottomPanelWidget.getViewLifecycleScope(), null, null, new x31(callBottomPanelWidget, callBottomPanelWidget.y0(), null), 3) : null);
        }
        return qqg.a;
    }
}
