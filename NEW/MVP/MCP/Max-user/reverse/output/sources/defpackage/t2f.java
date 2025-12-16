package defpackage;

/* loaded from: classes.dex */
public abstract class t2f implements io7 {
    public volatile Object a = nmi.a;

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        Object objB;
        Object obj = this.a;
        Object obj2 = nmi.a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objB = this.a;
            if (objB == obj2) {
                objB = b(w5Var);
                this.a = objB;
            }
        }
        return objB;
    }

    public abstract Object b(w5 w5Var);
}
