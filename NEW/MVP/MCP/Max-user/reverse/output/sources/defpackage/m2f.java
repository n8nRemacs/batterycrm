package defpackage;

/* loaded from: classes.dex */
public final class m2f extends e2f {
    public final /* synthetic */ int a;
    public final e2f b;
    public final tm6 c;

    public /* synthetic */ m2f(e2f e2fVar, tm6 tm6Var, int i) {
        this.a = i;
        this.c = tm6Var;
        this.b = e2fVar;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        switch (this.a) {
            case 0:
                this.b.k(new qu1(v2fVar, 8, this.c));
                break;
            case 1:
                tm6 tm6Var = this.c;
                this.b.k(new aqc(v2fVar, tm6Var, false, 6));
                break;
            default:
                this.b.k(new enb(this, v2fVar, false, 9));
                break;
        }
    }
}
