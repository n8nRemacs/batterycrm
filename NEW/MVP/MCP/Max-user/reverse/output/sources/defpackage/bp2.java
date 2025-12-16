package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bp2 implements cm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ yq2 b;
    public final /* synthetic */ dv5 c;
    public final /* synthetic */ j09 d;
    public final /* synthetic */ long o;

    public /* synthetic */ bp2(yq2 yq2Var, dv5 dv5Var, j09 j09Var, long j, long j2, int i) {
        this.a = i;
        this.b = yq2Var;
        this.c = dv5Var;
        this.d = j09Var;
        this.o = j;
        this.X = j2;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        long j = this.o;
        long j2 = this.X;
        switch (i) {
            case 0:
                this.b.B(this.c, this.d, j, j2);
                break;
            default:
                this.b.A(this.c, this.d, j, j2);
                break;
        }
        return qqg.a;
    }
}
