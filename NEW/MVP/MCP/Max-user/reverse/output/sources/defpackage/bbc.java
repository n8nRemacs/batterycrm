package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class bbc {
    public final long a;
    public final boolean b;
    public final List c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final yd0 g;
    public final s5g h;
    public final CharSequence i;
    public final boolean j;
    public final boolean k;

    public bbc(long j, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, yd0 yd0Var, s5g s5gVar, CharSequence charSequence3, boolean z2, boolean z3) {
        this.a = j;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = yd0Var;
        this.h = s5gVar;
        this.i = charSequence3;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbc)) {
            return false;
        }
        bbc bbcVar = (bbc) obj;
        return this.a == bbcVar.a && this.b == bbcVar.b && fni.a(this.c, bbcVar.c) && fni.a(this.d, bbcVar.d) && fni.a(this.e, bbcVar.e) && fni.a(this.f, bbcVar.f) && fni.a(this.g, bbcVar.g) && fni.a(this.h, bbcVar.h) && fni.a(this.i, bbcVar.i) && this.j == bbcVar.j && this.k == bbcVar.k;
    }

    public final int hashCode() {
        int iB = a9h.b(Long.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        yd0 yd0Var = this.g;
        int iHashCode5 = (iHashCode4 + (yd0Var == null ? 0 : yd0Var.hashCode())) * 31;
        s5g s5gVar = this.h;
        int iHashCode6 = (iHashCode5 + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        CharSequence charSequence3 = this.i;
        return Boolean.hashCode(this.k) + a9h.b((iHashCode6 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "ProfileAppBarState(idForAvatar=", ", editEnabled=", this.b);
        sbJ.append(", avatarUrls=");
        sbJ.append(this.c);
        sbJ.append(", lowResAvatarUrl=");
        sbJ.append(this.d);
        sbJ.append(", title=");
        sbJ.append((Object) this.e);
        sbJ.append(", abbreviation=");
        sbJ.append((Object) this.f);
        sbJ.append(", avatarOverlay=");
        sbJ.append(this.g);
        sbJ.append(", subtitle=");
        sbJ.append(this.h);
        sbJ.append(", link=");
        sbJ.append((Object) this.i);
        sbJ.append(", isBlocked=");
        sbJ.append(this.j);
        return vb9.f(sbJ, ", isVerified=", this.k, ")");
    }

    public /* synthetic */ bbc(long j, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, yd0 yd0Var, s5g s5gVar, CharSequence charSequence3, boolean z2, boolean z3, int i) {
        this(j, z, list, str, charSequence, charSequence2, (i & 64) != 0 ? null : yd0Var, s5gVar, charSequence3, (i & 512) != 0 ? false : z2, z3);
    }
}
