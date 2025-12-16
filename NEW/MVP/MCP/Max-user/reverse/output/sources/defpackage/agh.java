package defpackage;

/* loaded from: classes2.dex */
public final class agh implements mr3 {
    public final em6 a;
    public final k18 b;
    public final jve c;
    public final gbd d;

    public agh(k18 k18Var, em6 em6Var) {
        this.a = em6Var;
        this.b = k18Var;
        jve jveVarB = kve.b(0, 0, 7);
        this.c = jveVarB;
        this.d = new gbd(jveVarB);
    }

    public final qt7 a(f84 f84Var, x74 x74Var, i84 i84Var, sm6 sm6Var) {
        return svi.d(f84Var, x74Var, i84Var, new zfh(this, sm6Var, null));
    }

    @Override // defpackage.mr3
    public final gbd i() {
        return this.d;
    }
}
