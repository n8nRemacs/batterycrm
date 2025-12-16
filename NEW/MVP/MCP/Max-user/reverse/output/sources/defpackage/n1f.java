package defpackage;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class n1f implements Provider {
    public final Object a;

    public n1f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1f) && fni.a(this.a, ((n1f) obj).a);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SimpleProvider(value=" + this.a + ')';
    }
}
