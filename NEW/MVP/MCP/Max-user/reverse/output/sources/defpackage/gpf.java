package defpackage;

/* loaded from: classes2.dex */
public final class gpf {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final b8c g;
    public final String h;

    public gpf(long j, int i, String str, String str2, CharSequence charSequence, String str3, b8c b8cVar, String str4) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = str3;
        this.g = b8cVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpf)) {
            return false;
        }
        gpf gpfVar = (gpf) obj;
        return this.a == gpfVar.a && this.b == gpfVar.b && fni.a(this.c, gpfVar.c) && fni.a(this.d, gpfVar.d) && fni.a(this.e, gpfVar.e) && fni.a(this.f, gpfVar.f) && fni.a(this.g, gpfVar.g) && fni.a(this.h, gpfVar.h);
    }

    public final int hashCode() {
        int iK = utb.k(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b8c b8cVar = this.g;
        int iHashCode5 = (iHashCode4 + (b8cVar == null ? 0 : b8cVar.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Suggest(id=", ", type=");
        sbL.append(ctd.s(this.b));
        sbL.append(", title=");
        sbL.append(this.c);
        sbL.append(", description=");
        sbL.append(this.d);
        sbL.append(", inputResult=");
        sbL.append((Object) this.e);
        sbL.append(", avatarUrl=");
        sbL.append(this.f);
        sbL.append(", presence=");
        sbL.append(this.g);
        sbL.append(", query=");
        return ho7.l(sbL, this.h, ")");
    }
}
