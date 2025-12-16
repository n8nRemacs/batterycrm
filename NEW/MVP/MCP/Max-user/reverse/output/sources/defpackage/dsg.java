package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class dsg implements k18, Serializable {
    public cm6 a;
    public Object b;

    @Override // defpackage.k18
    public final boolean e() {
        return this.b != qha.G0;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        if (this.b == qha.G0) {
            this.b = this.a.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
