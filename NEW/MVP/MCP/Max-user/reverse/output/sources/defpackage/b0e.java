package defpackage;

/* loaded from: classes2.dex */
public final class b0e extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0e(int i, Object obj) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((ggh) this.b.getValue()).h();
            case 1:
                ggh gghVar = (ggh) this.b.getValue();
                s07 s07Var = gghVar instanceof s07 ? (s07) gghVar : null;
                return s07Var != null ? s07Var.e() : y94.b;
            default:
                return this.b;
        }
    }
}
