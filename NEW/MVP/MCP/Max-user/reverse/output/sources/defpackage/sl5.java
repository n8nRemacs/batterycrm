package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sl5 implements pa8, oa8, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ sl5(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((a5c) obj).h0(this.b, this.c);
                break;
            default:
                a5c a5cVar = (a5c) obj;
                a5cVar.m0();
                em5 em5Var = a5cVar.a;
                int i = this.b;
                int i2 = this.c;
                if (i != i2) {
                    em5Var.g1(i, i + 1, i2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((r3c) obj).p(this.b, this.c);
                break;
            default:
                ((q3c) obj).p(this.b, this.c);
                break;
        }
    }
}
