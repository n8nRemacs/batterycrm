package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class hrf implements crf, Serializable {
    public final transient Object a = new Object();
    public final crf b;
    public volatile transient boolean c;
    public transient Object d;

    public hrf(crf crfVar) {
        this.b = crfVar;
    }

    @Override // defpackage.crf
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
