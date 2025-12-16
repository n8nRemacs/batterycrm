package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class f31 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ f31(k31 k31Var, int i) {
        this.a = i;
        this.b = k31Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        Object value;
        int i = this.a;
        qqg qqgVar = qqg.a;
        k31 k31Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                View viewF = dqi.f(k31Var, eyc.call_bottom_control_container);
                if (viewF != null) {
                    break;
                }
                break;
            case 2:
                k31Var.R0 = null;
                break;
            default:
                k31Var.S0 = null;
                j31 j31Var = k31Var.N0;
                if (j31Var != null) {
                    CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
                    yy7[] yy7VarArr = CallBottomPanelWidget.Z;
                    tcf tcfVar = callBottomPanelWidget.z0().v().o;
                    do {
                        value = tcfVar.getValue();
                    } while (!tcfVar.c(value, bt1.a((bt1) value, null, null, null, null, null, 0L, 223)));
                }
                break;
        }
        return qqgVar;
    }
}
