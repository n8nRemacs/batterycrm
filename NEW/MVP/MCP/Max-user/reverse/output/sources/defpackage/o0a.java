package defpackage;

/* loaded from: classes2.dex */
public final class o0a implements p0a {
    public final s5g a;
    public final s5g b;
    public final d3c c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;

    public o0a(s5g s5gVar, s5g s5gVar2, d3c d3cVar, boolean z, boolean z2, int i) {
        this.a = s5gVar;
        this.b = s5gVar2;
        this.c = d3cVar;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = z || z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0a)) {
            return false;
        }
        o0a o0aVar = (o0a) obj;
        return this.a.equals(o0aVar.a) && this.b.equals(o0aVar.b) && this.c == o0aVar.c && this.d == o0aVar.d && this.e == o0aVar.e && this.f == o0aVar.f;
    }

    public final int hashCode() {
        int iD = xc0.d(this.a.hashCode() * 31, 31, this.b);
        d3c d3cVar = this.c;
        return az1.v(this.f) + a9h.b(a9h.b((iD + (d3cVar == null ? 0 : d3cVar.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        sb.append(this.d);
        sb.append(", isPaused=");
        sb.append(this.e);
        sb.append(", type=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? "null" : "VIDEO_MSG" : "AUDIO");
        sb.append(")");
        return sb.toString();
    }
}
