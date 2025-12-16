package defpackage;

/* loaded from: classes2.dex */
public final class eme {
    public final n5g a;
    public final int b;
    public final boolean c;

    public eme(int i, n5g n5gVar, boolean z) {
        this.a = n5gVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eme)) {
            return false;
        }
        eme emeVar = (eme) obj;
        return fni.a(this.a, emeVar.a) && this.b == emeVar.b && this.c == emeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return az1.k(sb, this.c, ")");
    }
}
