package defpackage;

/* loaded from: classes.dex */
public final class k2f extends e2f {
    public final /* synthetic */ int a;
    public final e2f b;
    public final gu3 c;

    public /* synthetic */ k2f(e2f e2fVar, gu3 gu3Var, int i) {
        this.a = i;
        this.b = e2fVar;
        this.c = gu3Var;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        switch (this.a) {
            case 0:
                this.b.k(new enb(this, v2fVar, false, 8));
                break;
            default:
                this.b.k(new wib(this, 9, v2fVar));
                break;
        }
    }
}
