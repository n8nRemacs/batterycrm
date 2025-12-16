package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wn6 implements uu1, yu {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha8 b;

    public /* synthetic */ wn6(ha8 ha8Var, int i) {
        this.a = i;
        this.b = ha8Var;
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((q02) this.b.get()).a();
            default:
                return ((q02) this.b.get()).b();
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 0:
                vp4 vp4Var = new vp4(tu1Var, 1);
                ex4 ex4VarA = ayi.a();
                ha8 ha8Var = this.b;
                ha8Var.d(vp4Var, ex4VarA);
                return "transformVoidFuture [" + ha8Var + "]";
            default:
                ex4 ex4VarA2 = ayi.a();
                ha8 ha8Var2 = this.b;
                wsf.i(false, ha8Var2, tu1Var, ex4VarA2);
                return "nonCancellationPropagating[" + ha8Var2 + "]";
        }
    }
}
