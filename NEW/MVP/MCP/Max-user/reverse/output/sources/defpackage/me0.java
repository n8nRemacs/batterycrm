package defpackage;

/* loaded from: classes.dex */
public final class me0 implements z32 {
    public final le0[] a;

    public me0(le0[] le0VarArr) {
        this.a = le0VarArr;
    }

    public final void a() {
        for (le0 le0Var : this.a) {
            sy4 sy4Var = le0Var.c;
            if (sy4Var == null) {
                sy4Var = null;
            }
            sy4Var.dispose();
        }
    }

    @Override // defpackage.z32
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
