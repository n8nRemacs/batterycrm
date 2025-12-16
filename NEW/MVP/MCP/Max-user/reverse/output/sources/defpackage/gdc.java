package defpackage;

/* loaded from: classes2.dex */
public final class gdc {
    public final long a;
    public final CharSequence b;
    public final r5g c;
    public final String d;
    public final long e;
    public final CharSequence f;

    public gdc(long j, CharSequence charSequence, r5g r5gVar, String str, long j2, CharSequence charSequence2) {
        this.a = j;
        this.b = charSequence;
        this.c = r5gVar;
        this.d = str;
        this.e = j2;
        this.f = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdc)) {
            return false;
        }
        gdc gdcVar = (gdc) obj;
        return this.a == gdcVar.a && fni.a(this.b, gdcVar.b) && this.c.equals(gdcVar.c) && fni.a(this.d, gdcVar.d) && this.e == gdcVar.e && fni.a(this.f, gdcVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + u45.g(this.b, Long.hashCode(this.a) * 31, 31)) * 31;
        String str = this.d;
        return this.f.hashCode() + a9h.a(a9h.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileContactCellItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        az1.r(this.e, ", isOnline=false, avatarSourceId=", ", abbreviation=", sb);
        sb.append((Object) this.f);
        sb.append(")");
        return sb.toString();
    }
}
