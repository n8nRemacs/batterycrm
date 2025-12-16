package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public abstract class ypd implements io7 {
    public SoftReference a;

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        SoftReference softReference = this.a;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj != null) {
            return obj;
        }
        Object objB = b(w5Var);
        this.a = objB != null ? new SoftReference(objB) : null;
        return objB;
    }

    public abstract Object b(w5 w5Var);
}
