package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class bwf implements k18, Serializable {
    public cm6 a;
    public volatile Object b = qha.G0;
    public final Object c = this;

    public bwf(cm6 cm6Var) {
        this.a = cm6Var;
    }

    @Override // defpackage.k18
    public final boolean e() {
        return this.b != qha.G0;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        qha qhaVar = qha.G0;
        if (obj != qhaVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == qhaVar) {
                objInvoke = this.a.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
