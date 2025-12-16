package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class xwd implements k18, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(xwd.class, Object.class, "b");
    public volatile cm6 a;
    public volatile Object b;

    @Override // defpackage.k18
    public final boolean e() {
        return this.b != qha.G0;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        Object obj = this.b;
        qha qhaVar = qha.G0;
        if (obj != qhaVar) {
            return obj;
        }
        cm6 cm6Var = this.a;
        if (cm6Var != null) {
            Object objInvoke = cm6Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qhaVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != qhaVar) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
