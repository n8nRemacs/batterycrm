package defpackage;

/* loaded from: classes.dex */
public final class kxg implements gs1 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final boolean d;
    public final String e;

    public kxg(long j, String str, CharSequence charSequence, boolean z, String str2) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = z;
        this.e = str2;
    }

    @Override // defpackage.gs1
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.gs1
    public final long d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxg)) {
            return false;
        }
        kxg kxgVar = (kxg) obj;
        return this.a == kxgVar.a && fni.a(this.b, kxgVar.b) && fni.a(this.c, kxgVar.c) && this.d == kxgVar.d && fni.a(this.e, kxgVar.e);
    }

    @Override // defpackage.gs1
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int iB = a9h.b(u45.g(this.c, u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // defpackage.gs1
    public final CharSequence j() {
        return this.c;
    }

    @Override // defpackage.gs1
    public final String q() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("UserInfo(serverId=", this.a, ", name=", this.b);
        sbN.append(", abbreviation=");
        sbN.append((Object) this.c);
        sbN.append(", isUnknown=");
        sbN.append(this.d);
        return ctd.j(sbN, ", avatar=", this.e, ")");
    }
}
