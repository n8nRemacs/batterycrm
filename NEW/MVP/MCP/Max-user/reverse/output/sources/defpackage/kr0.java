package defpackage;

/* loaded from: classes2.dex */
public final class kr0 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ kr0(rr0 rr0Var, long j, int i) {
        this.a = i;
        this.b = rr0Var;
        this.c = j;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((iz5) ((qx5) this.b.a.getValue())).e(this.c).delete());
            default:
                return pbj.f(((iz5) ((qx5) this.b.a.getValue())).e(this.c));
        }
    }
}
