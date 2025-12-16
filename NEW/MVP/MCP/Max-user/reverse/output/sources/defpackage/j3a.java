package defpackage;

/* loaded from: classes2.dex */
public final class j3a {
    public final String a;
    public final int b;
    public final int c;

    public j3a(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3a)) {
            return false;
        }
        j3a j3aVar = (j3a) obj;
        return fni.a(this.a, j3aVar.a) && this.b == j3aVar.b && this.c == j3aVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + iti.a(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        return ho7.j(utb.m(this.b, "Quality(link=", this.a, ", width=", ", height="), this.c, ")");
    }
}
