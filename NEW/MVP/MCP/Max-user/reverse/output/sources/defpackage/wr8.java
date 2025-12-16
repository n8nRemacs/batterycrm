package defpackage;

/* loaded from: classes.dex */
public final class wr8 extends or8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final tm6 c;

    public /* synthetic */ wr8(Object obj, tm6 tm6Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = tm6Var;
    }

    @Override // defpackage.or8
    public final void f(bs8 bs8Var) {
        switch (this.a) {
            case 0:
                ((xr8) this.b).e(new qu1(bs8Var, 3, (t2h) this.c));
                break;
            default:
                ((e2f) this.b).k(new qu1(bs8Var, 10, this.c));
                break;
        }
    }
}
