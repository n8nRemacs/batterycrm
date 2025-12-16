package defpackage;

/* loaded from: classes2.dex */
public final class e35 {
    public final y25 a;
    public final String b;
    public final long c;
    public final wvg d;
    public final p2h e;

    public e35(y25 y25Var, String str, long j, wvg wvgVar, p2h p2hVar) {
        this.a = y25Var;
        this.b = str;
        this.c = j;
        this.d = wvgVar;
        this.e = p2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e35)) {
            return false;
        }
        e35 e35Var = (e35) obj;
        return fni.a(this.a, e35Var.a) && fni.a(this.b, e35Var.b) && this.c == e35Var.c && this.d == e35Var.d && fni.a(this.e, e35Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a9h.a(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        p2h p2hVar = this.e;
        return iHashCode + (p2hVar == null ? 0 : p2hVar.hashCode());
    }

    public final String toString() {
        return "DraftUpload(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + this.d + ", videoConvertOptions=" + this.e + ")";
    }
}
