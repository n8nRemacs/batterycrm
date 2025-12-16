package defpackage;

/* loaded from: classes.dex */
public final class d99 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public d99(Object obj) {
        this(-1L, obj);
    }

    public final d99 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new d99(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d99)) {
            return false;
        }
        d99 d99Var = (d99) obj;
        return this.a.equals(d99Var.a) && this.b == d99Var.b && this.c == d99Var.c && this.d == d99Var.d && this.e == d99Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public d99(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public d99(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public d99(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
