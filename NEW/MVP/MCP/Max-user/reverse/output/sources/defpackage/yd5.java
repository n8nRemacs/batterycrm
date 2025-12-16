package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class yd5 extends kf {
    public final View l;
    public final Rect m;
    public int n;
    public int o;
    public int p;
    public boolean q;

    public yd5(qj0 qj0Var, View view) {
        super(qj0Var, new eo7(0, null, 15), null, 56);
        this.l = view;
        this.m = new Rect();
    }

    @Override // defpackage.kf
    public final void g(g4i g4iVar, ssb ssbVar) {
        e4i e4iVar = g4iVar.a;
        int i = e4iVar.f(8).d;
        int i2 = e4iVar.f(7).d;
        boolean z = i == 0;
        int i3 = ((co7) ssbVar.c).d;
        this.p = i3;
        Rect rect = this.m;
        this.o = Math.abs(((this.a.getHeight() + ((z ? (rect.bottom + i2) - i3 : (rect.bottom + i3) - i2) - rect.top)) / 2) - this.n);
    }

    @Override // defpackage.kf
    public final g4i h(g4i g4iVar) {
        e4i e4iVar = g4iVar.a;
        if (this.q) {
            return g4iVar;
        }
        co7 co7VarF = e4iVar.f(this.j);
        co7 co7VarF2 = e4iVar.f(this.d);
        co7 co7VarB = co7.b(co7VarF.a - co7VarF2.a, co7VarF.b - co7VarF2.b, co7VarF.c - co7VarF2.c, co7VarF.d - co7VarF2.d);
        this.a.setTranslationY((co7.b(Math.max(co7VarB.a, 0), Math.max(co7VarB.b, 0), Math.max(co7VarB.c, 0), Math.max(co7VarB.d, 0)).d / (this.p - r4)) * this.o);
        return g4iVar;
    }

    @Override // defpackage.kf
    public final void i() {
        this.a.setTranslationY(0.0f);
        this.q = false;
    }

    @Override // defpackage.kf
    public final void j() {
        this.l.getGlobalVisibleRect(this.m);
        this.n = this.a.getBottom();
    }
}
