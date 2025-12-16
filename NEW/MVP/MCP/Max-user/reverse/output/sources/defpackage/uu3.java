package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class uu3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu3 b;

    public /* synthetic */ uu3(vu3 vu3Var, int i) {
        this.a = i;
        this.b = vu3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        vu3 vu3Var = this.b;
        switch (i) {
            case 0:
                usd usdVar = vu3Var.O0;
                if (usdVar != null) {
                    long j = vu3Var.Q0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) usdVar.b;
                    v17 v17Var = CallHistoryPageScreen.u0;
                    if (((xa1) callHistoryPageScreen.A0().X.getValue()).a) {
                        o37 o37VarT = callHistoryPageScreen.B0().t(j);
                        if (o37VarT == null) {
                            return;
                        }
                        callHistoryPageScreen.A0().t(j, o37VarT);
                        return;
                    }
                    o37 o37VarT2 = callHistoryPageScreen.B0().t(j);
                    if (o37VarT2 == null) {
                        return;
                    }
                    if (o37VarT2 instanceof m37) {
                        m37 m37Var = (m37) o37VarT2;
                        ca1.c.M0(m37Var.b, ((Number) ue3.G(m37Var.c)).longValue());
                        return;
                    } else if (o37VarT2 instanceof k37) {
                        k37 k37Var = (k37) o37VarT2;
                        ca1.c.M0(k37Var.b, ((Number) ue3.G(k37Var.d)).longValue());
                        return;
                    } else if (o37VarT2 instanceof l37) {
                        l37 l37Var = (l37) o37VarT2;
                        ca1.c.L0(Long.valueOf(l37Var.c), l37Var.a, l37Var.d);
                        return;
                    } else {
                        if (!o37VarT2.equals(n37.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                return;
            case 1:
                usd usdVar2 = vu3Var.O0;
                if (usdVar2 != null) {
                    usdVar2.p(vu3Var.Q0, true);
                    return;
                }
                return;
            default:
                usd usdVar3 = vu3Var.O0;
                if (usdVar3 != null) {
                    usdVar3.p(vu3Var.Q0, false);
                    return;
                }
                return;
        }
    }
}
