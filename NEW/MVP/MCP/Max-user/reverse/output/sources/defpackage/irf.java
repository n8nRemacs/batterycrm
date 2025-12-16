package defpackage;

/* loaded from: classes.dex */
public final class irf implements crf {
    public static final te4 d = new te4(5);
    public final Object a = new Object();
    public volatile crf b;
    public Object c;

    public irf(crf crfVar) {
        this.b = crfVar;
    }

    @Override // defpackage.crf
    public final Object get() {
        crf crfVar = this.b;
        te4 te4Var = d;
        if (crfVar != te4Var) {
            synchronized (this.a) {
                try {
                    if (this.b != te4Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = te4Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
