package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class zi2 extends ml2 {
    @Override // defpackage.ml2
    public final void F(yb9 yb9Var, em6 em6Var, sm6 sm6Var) {
        ub9 ub9Var = (ub9) yb9Var;
        z(ub9Var);
        super.F(ub9Var, em6Var, sm6Var);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    @Override // defpackage.d2f
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void z(ub9 ub9Var) {
        jl2 jl2Var = (jl2) this.a;
        jl2Var.setId((int) ub9Var.a);
        uxa uxaVar = jl2Var.J0;
        jl2Var.setTitle(ub9Var.o);
        jl2Var.setLink(ub9Var.Y);
        jl2Var.setSubtitle(ub9Var.X);
        if (!ub9Var.Z) {
            jl2Var.setLinkPhoto(ub9Var.d);
            return;
        }
        uxaVar.J0 = null;
        uxaVar.b.i(null);
        uxa.o(uxaVar, (Drawable) jl2Var.F0.getValue(), new gf1(16), new gf1(17), 6);
        jl2Var.v();
    }
}
