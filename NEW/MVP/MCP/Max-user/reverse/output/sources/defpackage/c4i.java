package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class c4i extends b4i {
    public co7 n;
    public co7 o;
    public co7 p;

    public c4i(g4i g4iVar, WindowInsets windowInsets) {
        super(g4iVar, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.e4i
    public co7 g() {
        if (this.o == null) {
            this.o = co7.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.e4i
    public co7 i() {
        if (this.n == null) {
            this.n = co7.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.e4i
    public co7 k() {
        if (this.p == null) {
            this.p = co7.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.z3i, defpackage.e4i
    public g4i l(int i, int i2, int i3, int i4) {
        return g4i.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.a4i, defpackage.e4i
    public void r(co7 co7Var) {
    }
}
