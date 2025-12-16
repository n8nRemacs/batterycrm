package defpackage;

/* loaded from: classes2.dex */
public final class od9 implements sd9 {
    public final long a;

    public od9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od9) && this.a == ((od9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "OnMemberClicked(id=", ")");
    }
}
