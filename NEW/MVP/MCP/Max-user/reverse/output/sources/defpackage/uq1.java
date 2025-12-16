package defpackage;

import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class uq1 implements jh1 {
    public final /* synthetic */ vq1 a;

    public uq1(vq1 vq1Var) {
        this.a = vq1Var;
    }

    @Override // defpackage.ft1
    public final void i(zi1 zi1Var) {
        tq1 tq1Var = this.a.X0;
        if (tq1Var != null) {
            ((bm1) tq1Var).i(zi1Var);
        }
    }

    @Override // defpackage.ft1
    public final void j(zi1 zi1Var, Point point) {
        tq1 tq1Var = this.a.X0;
        if (tq1Var != null) {
            CallScreen callScreen = ((bm1) tq1Var).a;
            rha rhaVar = CallScreen.N0;
            callScreen.H0().C(zi1Var, point);
        }
    }

    @Override // defpackage.ft1
    public final void k(zi1 zi1Var) {
        tq1 tq1Var = this.a.X0;
        if (tq1Var != null) {
            CallScreen callScreen = ((bm1) tq1Var).a;
            rha rhaVar = CallScreen.N0;
            callScreen.H0().Z.f(zi1Var);
        }
    }

    @Override // defpackage.ft1
    public final void p(zi1 zi1Var) {
        tq1 tq1Var = this.a.X0;
        if (tq1Var == null) {
            return;
        }
        CallScreen callScreen = ((bm1) tq1Var).a;
        rha rhaVar = CallScreen.N0;
        tcf tcfVar = callScreen.H0().c.o;
        while (true) {
            Object value = tcfVar.getValue();
            zi1 zi1Var2 = zi1Var;
            if (tcfVar.c(value, bt1.a((bt1) value, null, null, zi1Var2, null, null, 0L, 251))) {
                return;
            } else {
                zi1Var = zi1Var2;
            }
        }
    }

    @Override // defpackage.ft1
    public final void q() {
        tq1 tq1Var = this.a.X0;
        if (tq1Var != null) {
            CallScreen callScreen = ((bm1) tq1Var).a;
            rha rhaVar = CallScreen.N0;
            callScreen.H0().Z.h();
        }
    }
}
