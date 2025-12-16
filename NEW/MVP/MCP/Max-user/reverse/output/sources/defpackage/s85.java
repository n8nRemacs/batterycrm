package defpackage;

/* loaded from: classes2.dex */
public final class s85 implements e95 {
    public final String a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final zf3 e;
    public final String f;
    public final zf3 g;
    public final String h;
    public final s5g i;
    public final String j;
    public final pxg k;
    public final boolean l;
    public final Long m;

    public s85(String str, long j, String str2, CharSequence charSequence, zf3 zf3Var, String str3, zf3 zf3Var2, String str4, s5g s5gVar, String str5, pxg pxgVar, boolean z, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = charSequence;
        this.e = zf3Var;
        this.f = str3;
        this.g = zf3Var2;
        this.h = str4;
        this.i = s5gVar;
        this.j = str5;
        this.k = pxgVar;
        this.l = z;
        this.m = l;
    }

    public static s85 c(s85 s85Var, String str, zf3 zf3Var, String str2, zf3 zf3Var2, String str3, s5g s5gVar, pxg pxgVar, boolean z, Long l, int i) {
        return new s85(s85Var.a, s85Var.b, (i & 4) != 0 ? s85Var.c : str, s85Var.d, (i & 16) != 0 ? s85Var.e : zf3Var, (i & 32) != 0 ? s85Var.f : str2, (i & 64) != 0 ? s85Var.g : zf3Var2, (i & 128) != 0 ? s85Var.h : str3, (i & 256) != 0 ? s85Var.i : s5gVar, s85Var.j, (i & 1024) != 0 ? s85Var.k : pxgVar, (i & 2048) != 0 ? s85Var.l : z, (i & 4096) != 0 ? s85Var.m : l);
    }

    @Override // defpackage.e95
    public final boolean a(e95 e95Var) {
        if (e95Var == null || !(e95Var instanceof s85)) {
            return false;
        }
        s85 s85Var = (s85) e95Var;
        return (fni.a(s85Var.h, this.h) && s85Var.k == this.k && fni.a(s85Var.c, this.c) && fni.a(s85Var.f, this.f)) ? false : true;
    }

    @Override // defpackage.e95
    public final boolean b(e95 e95Var) {
        if (e95Var == null || !(e95Var instanceof s85)) {
            return false;
        }
        s85 s85Var = (s85) e95Var;
        return (s85Var.k == this.k && fni.a(s85Var.e, this.e) && fni.a(s85Var.g, this.g) && fni.a(this.i, s85Var.i)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s85)) {
            return false;
        }
        s85 s85Var = (s85) obj;
        return fni.a(this.a, s85Var.a) && this.b == s85Var.b && fni.a(this.c, s85Var.c) && fni.a(this.d, s85Var.d) && fni.a(this.e, s85Var.e) && fni.a(this.f, s85Var.f) && fni.a(this.g, s85Var.g) && fni.a(this.h, s85Var.h) && fni.a(this.i, s85Var.i) && fni.a(this.j, s85Var.j) && this.k == s85Var.k && this.l == s85Var.l && fni.a(this.m, s85Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int iA = a9h.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        zf3 zf3Var = this.e;
        int iHashCode3 = (iHashCode2 + (zf3Var == null ? 0 : zf3Var.a.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        zf3 zf3Var2 = this.g;
        int iHashCode5 = (iHashCode4 + (zf3Var2 == null ? 0 : zf3Var2.a.hashCode())) * 31;
        String str4 = this.h;
        int iD = xc0.d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int iHashCode6 = (iD + (str5 == null ? 0 : str5.hashCode())) * 31;
        pxg pxgVar = this.k;
        int iB = a9h.b((iHashCode6 + (pxgVar == null ? 0 : pxgVar.hashCode())) * 31, 31, this.l);
        Long l = this.m;
        return iB + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("EditContactProfileUiModel(avatarUrl=", this.b, this.a, ", contactId=");
        sbQ.append(", firstName=");
        sbQ.append(this.c);
        sbQ.append(", abbreviation=");
        sbQ.append((Object) this.d);
        sbQ.append(", firstNameError=");
        sbQ.append(this.e);
        sbQ.append(", lastName=");
        sbQ.append(this.f);
        sbQ.append(", lastNameError=");
        sbQ.append(this.g);
        sbQ.append(", description=");
        sbQ.append(this.h);
        sbQ.append(", shortLink=");
        sbQ.append(this.i);
        sbQ.append(", phoneNumber=");
        sbQ.append(this.j);
        sbQ.append(", inactiveTtl=");
        sbQ.append(this.k);
        sbQ.append(", isInDeleteState=");
        sbQ.append(this.l);
        sbQ.append(", removeProfileTimestamp=");
        sbQ.append(this.m);
        sbQ.append(")");
        return sbQ.toString();
    }
}
