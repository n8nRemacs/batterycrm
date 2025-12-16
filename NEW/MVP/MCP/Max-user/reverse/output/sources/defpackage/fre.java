package defpackage;

/* loaded from: classes2.dex */
public final class fre {
    public static final fre h = new fre(-1, null, "", "", "", "", false);
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final boolean g;

    public fre(long j, String str, String str2, CharSequence charSequence, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fre)) {
            return false;
        }
        fre freVar = (fre) obj;
        return this.a == freVar.a && fni.a(this.b, freVar.b) && fni.a(this.c, freVar.c) && fni.a(this.d, freVar.d) && fni.a(this.e, freVar.e) && fni.a(this.f, freVar.f) && this.g == freVar.g;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + u45.e(u45.e(u45.g(this.d, u45.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("SettingsProfileDataModel(id=", this.a, ", avatarUrl=", this.b);
        sbN.append(", fullName=");
        sbN.append(this.c);
        sbN.append(", abbreviation=");
        sbN.append((Object) this.d);
        ho7.r(sbN, ", phone=", this.e, ", nickName=", this.f);
        return vb9.f(sbN, ", hasEsiaConnection=", this.g, ")");
    }
}
