package defpackage;

/* loaded from: classes2.dex */
public final class c7e implements g7e {
    public static final c7e e = new c7e(0, 0, false, false);
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public c7e(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7e)) {
            return false;
        }
        c7e c7eVar = (c7e) obj;
        return this.a == c7eVar.a && this.b == c7eVar.b && this.c == c7eVar.c && this.d == c7eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.b(xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("Active(totalMessages=", this.a, ", selectMessagePosition=", this.b, ", hasPrev=");
        sbK.append(this.c);
        sbK.append(", hasAfter=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
