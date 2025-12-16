package defpackage;

/* loaded from: classes2.dex */
public final class qd9 implements sd9 {
    public final long a;

    public qd9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd9) && this.a == ((qd9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "OnOwnerClicked(id=", ")");
    }
}
