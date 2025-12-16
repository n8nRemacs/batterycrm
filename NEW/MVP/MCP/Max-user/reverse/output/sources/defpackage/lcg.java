package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class lcg implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ncg b;

    public /* synthetic */ lcg(ncg ncgVar, int i) {
        this.a = i;
        this.b = ncgVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return qqg.a;
            default:
                ncg ncgVar = this.b;
                return new hcg(ncgVar.c, ncgVar.o, ncgVar.X);
        }
    }
}
