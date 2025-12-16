package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class qr1 implements gtd {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur1 b;

    public /* synthetic */ qr1(ur1 ur1Var, int i) {
        this.a = i;
        this.b = ur1Var;
    }

    @Override // defpackage.gtd
    public final void a() {
        int i = this.a;
        ur1 ur1Var = this.b;
        switch (i) {
            case 0:
                tr1 tr1Var = ur1Var.F0;
                if (tr1Var != null) {
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((r5j) tr1Var).b;
                    yy7[] yy7VarArr = CallTopPanelWidget.d;
                    xfh.r(callTopPanelWidget.z0().b.L0, jm1.D);
                    break;
                }
                break;
            case 1:
                tr1 tr1Var2 = ur1Var.F0;
                if (tr1Var2 != null) {
                    CallTopPanelWidget callTopPanelWidget2 = (CallTopPanelWidget) ((r5j) tr1Var2).b;
                    yy7[] yy7VarArr2 = CallTopPanelWidget.d;
                    xfh.r(callTopPanelWidget2.z0().b.L0, rm1.D);
                    break;
                }
                break;
            default:
                tr1 tr1Var3 = ur1Var.F0;
                if (tr1Var3 != null) {
                    CallTopPanelWidget callTopPanelWidget3 = (CallTopPanelWidget) ((r5j) tr1Var3).b;
                    yy7[] yy7VarArr3 = CallTopPanelWidget.d;
                    xfh.r(callTopPanelWidget3.z0().b.L0, an1.D);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qr1(ur1 ur1Var, jtd jtdVar) {
        this.a = 1;
        this.b = ur1Var;
    }
}
