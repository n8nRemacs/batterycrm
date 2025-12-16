package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class a4i extends z3i {
    public co7 m;

    public a4i(g4i g4iVar, WindowInsets windowInsets) {
        super(g4iVar, windowInsets);
        this.m = null;
    }

    @Override // defpackage.e4i
    public g4i b() {
        return g4i.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.e4i
    public g4i c() {
        return g4i.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.e4i
    public final co7 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = co7.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.e4i
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.e4i
    public void r(co7 co7Var) {
        this.m = co7Var;
    }
}
