package defpackage;

/* loaded from: classes2.dex */
public final class wne implements xne {
    public final int a;

    public wne(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wne) && this.a == ((wne) obj).a;
    }

    public final int hashCode() {
        return r2b.a.hashCode() + a9h.b(Integer.hashCode(this.a) * 31, 31, false);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", animated=false, appearance=" + r2b.a + ")";
    }
}
