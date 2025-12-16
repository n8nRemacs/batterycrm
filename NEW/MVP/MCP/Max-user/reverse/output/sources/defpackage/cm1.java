package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;

/* loaded from: classes.dex */
public final class cm1 extends dtf implements sm6 {
    public final /* synthetic */ CallScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.X = callScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cm1 cm1Var = (cm1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cm1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cm1 cm1Var = new cm1(continuation, this.X);
        cm1Var.o = obj;
        return cm1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        CallScreen callScreen = this.X;
        if (zBooleanValue) {
            if (k8j.b(CallScreen.y0(callScreen).a) == null) {
                c83 c83VarY0 = CallScreen.y0(callScreen);
                ytd ytdVar = c83VarY0.a;
                if (!fni.a(c83VarY0.b(), "call_vpn_panel_widget_tag")) {
                    ytdVar.R(false);
                    VpnPanelWidget vpnPanelWidget = new VpnPanelWidget(callScreen.s0, null);
                    vpnPanelWidget.a = new x6i(5, callScreen);
                    bud budVarA = l8j.a(vpnPanelWidget, null, null);
                    budVarA.d("call_vpn_panel_widget_tag");
                    ytdVar.S(budVarA);
                }
            }
        } else {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            c54 c54VarB = k8j.b(CallScreen.y0(callScreen).a);
            VpnPanelWidget vpnPanelWidget2 = c54VarB instanceof VpnPanelWidget ? (VpnPanelWidget) c54VarB : null;
            if (vpnPanelWidget2 != null) {
                vpnPanelWidget2.getRouter().B(vpnPanelWidget2);
                x6i x6iVar = vpnPanelWidget2.a;
                if (x6iVar != null) {
                    CallScreen.y0((CallScreen) x6iVar.b).a();
                }
                vpnPanelWidget2.a = null;
            }
        }
        return qqg.a;
    }
}
