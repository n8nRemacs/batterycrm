package defpackage;

/* loaded from: classes.dex */
public final class esa extends hk3 implements on6 {
    public final vqa a;
    public final tm6 b;

    public esa(vqa vqaVar, tm6 tm6Var) {
        this.a = vqaVar;
        this.b = tm6Var;
    }

    @Override // defpackage.on6
    public final vqa b() {
        return new ora(this.a, this.b, 1);
    }

    @Override // defpackage.hk3
    public final void g(rk3 rk3Var) {
        this.a.a(new dsa(rk3Var, this.b));
    }
}
