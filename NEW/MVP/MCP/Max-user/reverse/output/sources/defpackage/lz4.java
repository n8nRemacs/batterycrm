package defpackage;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class lz4 implements Provider {
    public static final Object c = new Object();
    public volatile qp5 a;
    public volatile Object b;

    public static Provider a(qp5 qp5Var) {
        if (qp5Var instanceof lz4) {
            return qp5Var;
        }
        lz4 lz4Var = new lz4();
        lz4Var.b = c;
        lz4Var.a = qp5Var;
        return lz4Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
