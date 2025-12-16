package defpackage;

import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final class pb1 implements g54 {
    public final /* synthetic */ ub1 a;

    public pb1(ub1 ub1Var) {
        this.a = ub1Var;
    }

    @Override // defpackage.g54
    public final void a(c54 c54Var, c54 c54Var2, boolean z) {
        ub1 ub1Var = this.a;
        k18 k18Var = ub1Var.t0;
        tv1 tv1Var = ub1Var.a;
        boolean z2 = false;
        if (c54Var != null) {
            ub1Var.a().c(c54Var instanceof nha, false);
        }
        if (!z && (c54Var2 instanceof nha) && !(c54Var2 instanceof PipScreen) && c54Var == null) {
            ub1Var.a().c(c54Var instanceof nha, true);
        }
        boolean z3 = c54Var instanceof PipScreen;
        bef befVar = bef.b;
        if (z3 && !(c54Var2 instanceof PipScreen)) {
            cef cefVar = (cef) k18Var.getValue();
            String str = ((hw1) tv1Var).l().c;
            tcf tcfVar = cefVar.a;
            if (tcfVar.getValue() != befVar) {
                cefVar.a(str, true);
            }
            tcfVar.m(null, befVar);
        }
        boolean z4 = c54Var2 instanceof PipScreen;
        if (z4 && !z3) {
            cef cefVar2 = (cef) k18Var.getValue();
            String str2 = ((hw1) tv1Var).l().c;
            tcf tcfVar2 = cefVar2.a;
            if (tcfVar2.getValue() == befVar) {
                cefVar2.a(str2, false);
            }
            tcfVar2.m(null, bef.a);
        }
        if (z4 && c54Var == null) {
            wqi.c("PipAppController", "pip screen was hidden quietly, skip hide fake pip.", new Object[0]);
            return;
        }
        if ((c54Var2 instanceof nha) || c54Var2 == null) {
            if (((hw1) tv1Var).u() && ub1Var.a().a()) {
                z2 = true;
            }
            ub1Var.y0 = z2;
        }
    }

    @Override // defpackage.g54
    public final void b(c54 c54Var, c54 c54Var2, boolean z) {
        ub1 ub1Var = this.a;
        if (c54Var != null) {
            ub1Var.a().b(c54Var instanceof nha, false);
        }
        if (z || !(c54Var2 instanceof nha) || (c54Var2 instanceof PipScreen) || c54Var != null) {
            return;
        }
        ub1Var.a().b(c54Var instanceof nha, true);
    }
}
