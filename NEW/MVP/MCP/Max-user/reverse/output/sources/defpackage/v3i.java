package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v3i extends y3i {
    public final WindowInsets.Builder c;

    public v3i() {
        this.c = yhh.f();
    }

    @Override // defpackage.y3i
    public g4i b() {
        a();
        g4i g4iVarH = g4i.h(null, this.c.build());
        g4iVarH.a.p(this.b);
        return g4iVarH;
    }

    @Override // defpackage.y3i
    public void d(co7 co7Var) {
        this.c.setMandatorySystemGestureInsets(co7Var.d());
    }

    @Override // defpackage.y3i
    public void e(co7 co7Var) {
        this.c.setStableInsets(co7Var.d());
    }

    @Override // defpackage.y3i
    public void f(co7 co7Var) {
        this.c.setSystemGestureInsets(co7Var.d());
    }

    @Override // defpackage.y3i
    public void g(co7 co7Var) {
        this.c.setSystemWindowInsets(co7Var.d());
    }

    @Override // defpackage.y3i
    public void h(co7 co7Var) {
        this.c.setTappableElementInsets(co7Var.d());
    }

    public v3i(g4i g4iVar) {
        WindowInsets.Builder builderF;
        super(g4iVar);
        WindowInsets windowInsetsG = g4iVar.g();
        if (windowInsetsG != null) {
            builderF = yhh.g(windowInsetsG);
        } else {
            builderF = yhh.f();
        }
        this.c = builderF;
    }
}
