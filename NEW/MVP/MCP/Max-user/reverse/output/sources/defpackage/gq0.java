package defpackage;

/* loaded from: classes2.dex */
public final class gq0 implements iq0 {
    public final t24 a;

    public gq0(t24 t24Var) {
        this.a = t24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq0) && fni.a(this.a, ((gq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(event=" + this.a + ")";
    }
}
