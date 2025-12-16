package defpackage;

/* loaded from: classes2.dex */
public final class v2a {
    public final y2a a;
    public final String b;
    public final String c;
    public final d3a d;
    public final gxi e;
    public final k3a f;

    public v2a(y2a y2aVar, String str, String str2, d3a d3aVar, gxi gxiVar, k3a k3aVar) {
        this.a = y2aVar;
        this.b = str;
        this.c = str2;
        this.d = d3aVar;
        this.e = gxiVar;
        this.f = k3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2a)) {
            return false;
        }
        v2a v2aVar = (v2a) obj;
        return fni.a(this.a, v2aVar.a) && fni.a(this.b, v2aVar.b) && fni.a(this.c, v2aVar.c) && this.d == v2aVar.d && fni.a(this.e, v2aVar.e) && fni.a(this.f, v2aVar.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + u45.e(u45.e(Long.hashCode(this.a.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
