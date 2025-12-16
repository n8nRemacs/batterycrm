package defpackage;

/* loaded from: classes2.dex */
public final class g35 {
    public final z25 a;
    public final String b;
    public final long c;
    public final wvg d;
    public final u10 e;

    public g35(z25 z25Var, String str, long j, wvg wvgVar, u10 u10Var) {
        this.a = z25Var;
        this.b = str;
        this.c = j;
        this.d = wvgVar;
        this.e = u10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g35)) {
            return false;
        }
        g35 g35Var = (g35) obj;
        return fni.a(this.a, g35Var.a) && fni.a(this.b, g35Var.b) && this.c == g35Var.c && this.d == g35Var.d && fni.a(this.e, g35Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a9h.a(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        u10 u10Var = this.e;
        return iHashCode + (u10Var == null ? 0 : u10Var.hashCode());
    }

    public final String toString() {
        return "DraftUploadDb(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + this.d + ", videoConvertOptions=" + this.e + ")";
    }
}
