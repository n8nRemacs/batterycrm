package defpackage;

/* loaded from: classes2.dex */
public final class mf extends kf {
    @Override // defpackage.kf
    public final g4i h(g4i g4iVar) {
        e4i e4iVar = g4iVar.a;
        co7 co7VarF = e4iVar.f(this.j);
        co7 co7VarF2 = e4iVar.f(this.d);
        co7 co7VarB = co7.b(co7VarF.a - co7VarF2.a, co7VarF.b - co7VarF2.b, co7VarF.c - co7VarF2.c, co7VarF.d - co7VarF2.d);
        co7 co7VarB2 = co7.b(Math.max(co7VarB.a, 0), Math.max(co7VarB.b, 0), Math.max(co7VarB.c, 0), Math.max(co7VarB.d, 0));
        this.a.setTranslationY(co7VarB2.b - co7VarB2.d);
        return g4iVar;
    }

    @Override // defpackage.kf
    public final void i() {
        this.a.setTranslationY(0.0f);
    }
}
