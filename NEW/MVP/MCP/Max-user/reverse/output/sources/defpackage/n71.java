package defpackage;

/* loaded from: classes.dex */
public final class n71 implements u71 {
    public final l58 a;

    public n71(l58 l58Var) {
        this.a = l58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n71) && fni.a(this.a, ((n71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LinkInfo(info=" + this.a + ")";
    }
}
