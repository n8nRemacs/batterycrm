package defpackage;

/* loaded from: classes.dex */
public final class t76 extends b2 {
    public final /* synthetic */ int d = 0;
    public final Iterable o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t76(u76 u76Var, int i) {
        super(i, 0);
        this.o = u76Var;
    }

    @Override // defpackage.b2
    public final Object a(int i) {
        switch (this.d) {
            case 0:
                return ((u76) this.o).a[i].iterator();
            default:
                return ((wg7) this.o).get(i);
        }
    }

    public t76(wg7 wg7Var, int i) {
        super(wg7Var.size(), i);
        this.o = wg7Var;
    }
}
