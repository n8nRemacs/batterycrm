package defpackage;

/* loaded from: classes.dex */
public final class ik3 extends hk3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ik3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hk3
    public final void g(rk3 rk3Var) {
        switch (this.a) {
            case 0:
                ((hk3) this.b).f(new qu1(rk3Var, 1, (hk3) this.c));
                break;
            case 1:
                ((hk3) this.b).f(new xo8((Object) this, (Object) rk3Var, false, 12));
                break;
            default:
                qu1 qu1Var = new qu1(rk3Var, 9, (tm6) this.c);
                rk3Var.c(qu1Var);
                ((e2f) this.b).k(qu1Var);
                break;
        }
    }
}
