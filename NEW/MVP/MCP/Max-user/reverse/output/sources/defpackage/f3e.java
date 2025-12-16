package defpackage;

/* loaded from: classes2.dex */
public final class f3e {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final long g;

    public f3e(long j, boolean z, boolean z2, boolean z3, boolean z4, int i, long j2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3e)) {
            return false;
        }
        f3e f3eVar = (f3e) obj;
        return this.a == f3eVar.a && this.b == f3eVar.b && this.c == f3eVar.c && this.d == f3eVar.d && this.e == f3eVar.e && this.f == f3eVar.f && this.g == f3eVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + xrf.k(this.f, a9h.b(a9h.b(a9h.b(a9h.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "ScrollEvent(mark=", ", isAlreadyLoaded=", this.b);
        hf3.f(", isSmoothScroll=", ", alignToBottom=", sbJ, this.c, this.d);
        sbJ.append(", highlightScrollAnchor=");
        sbJ.append(this.e);
        sbJ.append(", approximateIndex=");
        sbJ.append(this.f);
        return u45.i(this.g, ", msgId=", ")", sbJ);
    }
}
