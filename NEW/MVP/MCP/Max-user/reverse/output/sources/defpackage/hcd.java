package defpackage;

/* loaded from: classes2.dex */
public final class hcd extends u7j {
    public final boolean a;

    public hcd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcd) && this.a == ((hcd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Verified(verified=", ")", this.a);
    }
}
