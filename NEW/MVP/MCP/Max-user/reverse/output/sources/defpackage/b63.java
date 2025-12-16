package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class b63 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lzf b;

    public /* synthetic */ b63(lzf lzfVar, int i) {
        this.a = i;
        this.b = lzfVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return d7j.a(((q2b) this.b).b());
            default:
                return new pv6(d7j.a(((q2b) this.b).a()));
        }
    }
}
