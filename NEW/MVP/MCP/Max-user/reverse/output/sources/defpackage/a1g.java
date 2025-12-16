package defpackage;

/* loaded from: classes2.dex */
public final class a1g {
    public final cf8 a;
    public final long b;
    public final float c;

    public a1g(float f, long j, cf8 cf8Var) {
        this.a = cf8Var;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1g)) {
            return false;
        }
        a1g a1gVar = (a1g) obj;
        return fni.a(this.a, a1gVar.a) && this.b == a1gVar.b && Float.compare(this.c, a1gVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + a9h.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LocationResult(locationData=" + this.a + ", livePeriod=" + this.b + ", zoom=" + this.c + ")";
    }
}
