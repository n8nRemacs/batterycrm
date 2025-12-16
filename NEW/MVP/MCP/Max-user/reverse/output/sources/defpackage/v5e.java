package defpackage;

/* loaded from: classes2.dex */
public final class v5e implements w5e {
    public final ds2 a;

    public v5e(ds2 ds2Var) {
        this.a = ds2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5e) && fni.a(this.a, ((v5e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResult(result=" + this.a + ")";
    }
}
