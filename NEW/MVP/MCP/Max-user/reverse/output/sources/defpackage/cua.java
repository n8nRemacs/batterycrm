package defpackage;

/* loaded from: classes.dex */
public final class cua extends q85 {
    public final lp8 B0;
    public final float C0;

    public cua(lp8 lp8Var, float f) {
        super(0);
        this.B0 = lp8Var;
        this.C0 = f;
    }

    @Override // defpackage.q85
    public final boolean o() {
        return true;
    }

    @Override // defpackage.q85
    public final void p(float f, float f2, float f3, gte gteVar) {
        this.B0.p(f, f2 - this.C0, f3, gteVar);
    }
}
