package defpackage;

/* loaded from: classes.dex */
public final class dva extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dva(jva jvaVar, int i) {
        super(0);
        this.a = i;
        this.b = jvaVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.c();
                break;
            default:
                this.b.d();
                break;
        }
        return qqg.a;
    }
}
