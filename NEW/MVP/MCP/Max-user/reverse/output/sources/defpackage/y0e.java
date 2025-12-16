package defpackage;

/* loaded from: classes.dex */
public final class y0e extends u08 implements cm6 {
    public final /* synthetic */ a1e a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0e(int i, a1e a1eVar) {
        super(0);
        this.a = a1eVar;
        this.b = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        return this.a.b(this.b);
    }
}
