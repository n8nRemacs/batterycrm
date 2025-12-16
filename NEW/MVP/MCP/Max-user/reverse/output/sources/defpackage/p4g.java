package defpackage;

/* loaded from: classes2.dex */
public final class p4g {
    public final int a;
    public final int b;
    public final int c;

    public p4g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4g)) {
            return false;
        }
        p4g p4gVar = (p4g) obj;
        return this.a == p4gVar.a && this.b == p4gVar.b && this.c == p4gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("CacheKey(textHash=", this.a, ", payloadHash=", this.b, ", maxWidth="), this.c, ")");
    }
}
