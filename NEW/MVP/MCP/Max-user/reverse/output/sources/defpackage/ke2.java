package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ke2 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ke2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((af2) obj).i0 = this.b;
                break;
            case 1:
                af2 af2Var = (af2) obj;
                af2Var.a0 = new cs0(af2Var.a0.a, this.b);
                break;
            default:
                ((pb2) obj).b.f0 = this.b;
                break;
        }
    }
}
