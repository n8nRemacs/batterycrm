package defpackage;

/* loaded from: classes2.dex */
public final class d0f {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public d0f(c0f c0fVar) {
        this.a = c0fVar.a;
        this.b = c0fVar.b;
        this.c = c0fVar.c;
        this.e = c0fVar.e;
        this.d = c0fVar.d;
        this.f = c0fVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0f.class != obj.getClass()) {
            return false;
        }
        d0f d0fVar = (d0f) obj;
        return this.a == d0fVar.a && this.b == d0fVar.b && this.c == d0fVar.c && this.d == d0fVar.d && this.f == d0fVar.f && this.e == d0fVar.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
