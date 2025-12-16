package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class kv implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8a b;

    public /* synthetic */ kv(n8a n8aVar, int i) {
        this.a = i;
        this.b = n8aVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        boolean zD;
        switch (this.a) {
            case 0:
                zD = this.b.d(((j37) obj).getA());
                break;
            case 1:
                zD = !this.b.a(((fxb) obj).a);
                break;
            default:
                zD = this.b.d(((j37) obj).getA());
                break;
        }
        return Boolean.valueOf(zD);
    }
}
