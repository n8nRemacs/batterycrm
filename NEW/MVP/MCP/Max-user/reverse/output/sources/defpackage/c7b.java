package defpackage;

/* loaded from: classes.dex */
public final class c7b {
    public final long a;
    public final int b;
    public final boolean c;

    public c7b(int i, long j, boolean z) {
        this.a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7b)) {
            return false;
        }
        c7b c7bVar = (c7b) obj;
        return this.a == c7bVar.a && this.b == c7bVar.b && this.c == c7bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.k(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(animojiId=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        return vb9.f(sb, ", overrideAlpha=", this.c, ")");
    }
}
