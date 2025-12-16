package defpackage;

/* loaded from: classes2.dex */
public final class z3a {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public z3a(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z3a.class != obj.getClass()) {
            return false;
        }
        z3a z3aVar = (z3a) obj;
        if (this.b == z3aVar.b && this.c == z3aVar.c && this.d == z3aVar.d) {
            return this.a.equals(z3aVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
