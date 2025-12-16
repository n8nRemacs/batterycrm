package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class rr1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur1 b;

    public /* synthetic */ rr1(ur1 ur1Var, int i) {
        this.a = i;
        this.b = ur1Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        Object value;
        int i = this.a;
        ur1 ur1Var = this.b;
        switch (i) {
            case 0:
                return a93.s0.B(ur1Var).c;
            default:
                tr1 tr1Var = ur1Var.F0;
                if (tr1Var != null) {
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((r5j) tr1Var).b;
                    yy7[] yy7VarArr = CallTopPanelWidget.d;
                    tcf tcfVar = ((d2e) callTopPanelWidget.z0().c.i).s0;
                    do {
                        value = tcfVar.getValue();
                    } while (!tcfVar.c(value, e2e.a((e2e) value, null, null, null, 11)));
                }
                return qqg.a;
        }
    }
}
