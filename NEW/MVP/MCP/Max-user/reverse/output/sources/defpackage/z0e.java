package defpackage;

/* loaded from: classes.dex */
public final class z0e extends u08 implements cm6 {
    public final /* synthetic */ a1e a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0e(a1e a1eVar, int i, boolean z) {
        super(0);
        this.a = a1eVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        return this.a.c(this.b, this.c);
    }
}
