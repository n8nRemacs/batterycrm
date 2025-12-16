package defpackage;

/* loaded from: classes2.dex */
public final class gcd extends u7j {
    public final boolean a;

    public gcd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcd) && this.a == ((gcd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Online(online=", ")", this.a);
    }
}
