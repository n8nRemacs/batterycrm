package defpackage;

/* loaded from: classes2.dex */
public final class u5e implements w5e {
    public final rj0 a;

    public u5e(rj0 rj0Var) {
        this.a = rj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5e) && fni.a(this.a, ((u5e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchError(event=" + this.a + ")";
    }
}
