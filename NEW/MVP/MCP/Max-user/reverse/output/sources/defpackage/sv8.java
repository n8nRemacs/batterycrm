package defpackage;

/* loaded from: classes.dex */
public final class sv8 extends rv8 {
    public final /* synthetic */ k89 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv8(k89 k89Var) {
        super(k89Var);
        this.g = k89Var;
    }

    @Override // defpackage.ds4
    public final b89 m() {
        k89 k89Var = this.g;
        pv8 pv8Var = k89Var.X;
        if (pv8Var == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (pv8Var != k89Var.c) {
            return pv8Var.d;
        }
        qv8 qv8Var = (qv8) this.b;
        qv8Var.getClass();
        return new b89(qv8Var.getCurrentBrowserInfo());
    }
}
