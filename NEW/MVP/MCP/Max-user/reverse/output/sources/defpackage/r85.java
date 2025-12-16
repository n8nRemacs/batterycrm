package defpackage;

/* loaded from: classes2.dex */
public final class r85 implements e95 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final zf3 e;
    public final String f;
    public final int g;

    public r85(String str, long j, CharSequence charSequence, String str2, zf3 zf3Var, String str3, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = zf3Var;
        this.f = str3;
        this.g = i;
    }

    public static r85 c(r85 r85Var, String str, zf3 zf3Var, String str2, int i) {
        String str3 = r85Var.a;
        long j = r85Var.b;
        CharSequence charSequence = r85Var.c;
        if ((i & 8) != 0) {
            str = r85Var.d;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            zf3Var = r85Var.e;
        }
        zf3 zf3Var2 = zf3Var;
        if ((i & 32) != 0) {
            str2 = r85Var.f;
        }
        return new r85(str3, j, charSequence, str4, zf3Var2, str2, r85Var.g);
    }

    @Override // defpackage.e95
    public final boolean a(e95 e95Var) {
        if (e95Var == null || !(e95Var instanceof r85)) {
            return false;
        }
        r85 r85Var = (r85) e95Var;
        return (fni.a(this.d, r85Var.d) && fni.a(this.f, r85Var.f) && this.g == r85Var.g) ? false : true;
    }

    @Override // defpackage.e95
    public final boolean b(e95 e95Var) {
        if (e95Var == null || !(e95Var instanceof r85)) {
            return false;
        }
        return this.g != ((r85) e95Var).g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r85)) {
            return false;
        }
        r85 r85Var = (r85) obj;
        return fni.a(this.a, r85Var.a) && this.b == r85Var.b && fni.a(this.c, r85Var.c) && fni.a(this.d, r85Var.d) && fni.a(this.e, r85Var.e) && fni.a(this.f, r85Var.f) && this.g == r85Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = u45.g(this.c, a9h.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        String str2 = this.d;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        zf3 zf3Var = this.e;
        int iHashCode2 = (iHashCode + (zf3Var == null ? 0 : zf3Var.a.hashCode())) * 31;
        String str3 = this.f;
        return az1.v(this.g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("EditChatProfileUiModel(avatarUrl=", this.b, this.a, ", avatarSourceId=");
        sbQ.append(", abbreviation=");
        sbQ.append((Object) this.c);
        sbQ.append(", title=");
        sbQ.append(this.d);
        sbQ.append(", titleError=");
        sbQ.append(this.e);
        sbQ.append(", description=");
        sbQ.append(this.f);
        sbQ.append(", chatType=");
        sbQ.append(wy1.x(this.g));
        sbQ.append(")");
        return sbQ.toString();
    }
}
