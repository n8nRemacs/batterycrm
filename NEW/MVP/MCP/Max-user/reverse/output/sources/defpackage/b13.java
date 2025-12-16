package defpackage;

/* loaded from: classes.dex */
public final class b13 implements cm6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bwf b;
    public final /* synthetic */ bwf c;
    public final /* synthetic */ w5 d;

    public b13(bwf bwfVar, w5 w5Var, bwf bwfVar2) {
        this.b = bwfVar;
        this.d = w5Var;
        this.c = bwfVar2;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ss5(this.b, this.d.d(223), this.c);
            default:
                w5 w5Var = this.d;
                return new ks2(this.b, this.c, w5Var.d(568), (nxg) w5Var.c(122));
        }
    }

    public b13(bwf bwfVar, bwf bwfVar2, w5 w5Var) {
        this.b = bwfVar;
        this.c = bwfVar2;
        this.d = w5Var;
    }
}
