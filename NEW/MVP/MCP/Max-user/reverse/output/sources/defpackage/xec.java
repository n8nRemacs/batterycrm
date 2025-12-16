package defpackage;

/* loaded from: classes2.dex */
public final class xec {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public xec(String str, long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public static xec a(xec xecVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = xecVar.a;
        }
        String str2 = str;
        long j = xecVar.b;
        CharSequence charSequence = xecVar.c;
        CharSequence charSequence2 = xecVar.d;
        if ((i & 16) != 0) {
            z = xecVar.e;
        }
        return new xec(str2, j, charSequence, charSequence2, z, xecVar.f, xecVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xec)) {
            return false;
        }
        xec xecVar = (xec) obj;
        return fni.a(this.a, xecVar.a) && this.b == xecVar.b && fni.a(this.c, xecVar.c) && fni.a(this.d, xecVar.d) && this.e == xecVar.e && this.f == xecVar.f && this.g == xecVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iA = a9h.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (iA + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return az1.v(this.g) + a9h.b(a9h.b((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("ProfileEditAppBarState(avatarUrl=", this.b, this.a, ", avatarSourceId=");
        sbQ.append(", firstName=");
        sbQ.append((Object) this.c);
        sbQ.append(", abbreviation=");
        sbQ.append((Object) this.d);
        hf3.f(", showAcceptChanges=", ", showAddPhoto=", sbQ, this.e, this.f);
        sbQ.append(", confirmType=");
        int i = this.g;
        sbQ.append(i != 1 ? i != 2 ? "null" : "TOOLBAR_ACTION" : "BUTTON");
        sbQ.append(")");
        return sbQ.toString();
    }
}
