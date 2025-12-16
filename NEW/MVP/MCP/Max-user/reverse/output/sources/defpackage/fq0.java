package defpackage;

/* loaded from: classes2.dex */
public final class fq0 implements iq0 {
    public final ux3 a;

    public fq0(ux3 ux3Var) {
        this.a = ux3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq0) && fni.a(this.a, ((fq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactList(event=" + this.a + ")";
    }
}
