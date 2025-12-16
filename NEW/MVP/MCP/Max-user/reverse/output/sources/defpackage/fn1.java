package defpackage;

import java.util.concurrent.CancellationException;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class fn1 {
    public final ub1 a;
    public final tv1 b;

    public fn1() {
        ub1 ub1Var = (ub1) gm1.a.getAccessor().c(511);
        tv1 tv1VarB = e51.a.b();
        this.a = ub1Var;
        this.b = tv1VarB;
    }

    public final boolean a() {
        tv1 tv1Var = this.b;
        return ((hw1) tv1Var).t() && ((hw1) tv1Var).B();
    }

    public final void b(boolean z, boolean z2) {
        boolean zA = a();
        ub1 ub1Var = this.a;
        if (z) {
            ub1Var.h(true);
            ub1.g(ub1Var);
            return;
        }
        ub1Var.j(z2);
        if (!zA) {
            ub1.g(ub1Var);
            return;
        }
        MainActivity mainActivity = ub1Var.s0;
        if (mainActivity != null) {
            ((yp5) ub1Var.b).d(mainActivity, ub1.d());
        }
        MainActivity mainActivity2 = ub1Var.s0;
        if (mainActivity2 != null && ub1Var.y0) {
            lq5 lq5Var = ub1Var.b;
            ytd ytdVarD = ub1.d();
            yp5 yp5Var = (yp5) lq5Var;
            yp5Var.getClass();
            wqi.c("FakePipController", "try to show local pip", new Object[0]);
            qj1 qj1Var = yp5Var.g;
            Float fValueOf = qj1Var != null ? Float.valueOf(qj1Var.getAlpha()) : null;
            if (fValueOf != null && fValueOf.floatValue() == 1.0f && hqi.j(qj1Var)) {
                wqi.c("FakePipController", "local pip already in show progress", new Object[0]);
            } else {
                yp5Var.d(mainActivity2, ytdVarD);
                if (qj1Var != null) {
                    qj1Var.setVisibility(8);
                }
                cef cefVar = (cef) yp5Var.a.getValue();
                String str = ((hw1) ((tv1) yp5Var.e.getValue())).l().c;
                tcf tcfVar = cefVar.a;
                Object value = tcfVar.getValue();
                bef befVar = bef.b;
                if (value != befVar) {
                    cefVar.a(str, true);
                }
                tcfVar.m(null, befVar);
                if (qj1Var != null) {
                    hqi.g(qj1Var, true, 0L, null, 4);
                }
            }
            ub1Var.D0.f(ub1.d().a.a.size() < 2);
        }
    }

    public final void c(boolean z, boolean z2) {
        boolean zA = a();
        ub1 ub1Var = this.a;
        if (z) {
            ub1.g(ub1Var);
            if (zA) {
                ub1Var.h(true);
                return;
            }
            ub1Var.getClass();
            RootController rootController = (RootController) ub1.f();
            boolean zA2 = c9j.b(rootController.getContext()).a();
            if (!rootController.H0().n()) {
                wqi.c("RootController", "hideWithScalingTopController call indicator wasn't init", new Object[0]);
            } else if (RootController.y0(rootController, rootController.I0())) {
                ho7.q("hideWithScalingTopController hide call indicator force=", "RootController", zA2);
                rootController.C0(false, zA2, null);
            } else {
                RootController.z0(rootController, false);
                wqi.c("RootController", "hideWithScalingTopController call indicator already hidden force=" + zA2, new Object[0]);
            }
            ho7.q("try to hide call indicator hasCall=", "PipAppController", ub1Var.c());
            return;
        }
        if (zA) {
            MainActivity mainActivity = ub1Var.s0;
            if (mainActivity == null) {
                return;
            }
            ((yp5) ub1Var.b).d(mainActivity, ub1.d());
            return;
        }
        boolean zC = ub1Var.c();
        bud budVar = (bud) ue3.Q(ub1.d().e());
        c54 c54Var = budVar != null ? budVar.a : null;
        boolean z3 = (c54Var instanceof nha) || c54Var == null;
        wqi.c("PipAppController", xc0.g("try to show call indicator hasCall=", zC, " canShow=", !z3, "."), new Object[0]);
        if (!z3 && zC) {
            x9f x9fVar = ub1Var.A0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            ub1Var.A0 = null;
            eud eudVarF = ub1.f();
            CallIndicatorWidget callIndicatorWidget = new CallIndicatorWidget();
            RootController rootController2 = (RootController) eudVarF;
            boolean zA3 = z2 ? true : c9j.b(rootController2.getContext()).a();
            if (rootController2.H0().n() && RootController.y0(rootController2, rootController2.I0())) {
                RootController.z0(rootController2, true);
                wqi.c("RootController", "showWithScalingTopController call indicator already shown.", new Object[0]);
            } else {
                wqi.c("RootController", "showWithScalingTopController show call indicator force=" + zA3 + ".", new Object[0]);
                rootController2.C0(true, zA3, callIndicatorWidget);
            }
        }
        if (zC) {
            return;
        }
        x9f x9fVar2 = ub1Var.A0;
        if (x9fVar2 == null || !x9fVar2.isActive()) {
            wqi.c("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
            ub1Var.h(true);
        }
    }
}
