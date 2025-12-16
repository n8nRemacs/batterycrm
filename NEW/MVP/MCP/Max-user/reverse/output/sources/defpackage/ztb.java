package defpackage;

/* loaded from: classes2.dex */
public final class ztb {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public ztb(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztb)) {
            return false;
        }
        ztb ztbVar = (ztb) obj;
        return this.a == ztbVar.a && this.b == ztbVar.b && this.c == ztbVar.c && fni.a(this.d, ztbVar.d) && this.e == ztbVar.e && fni.a(this.f, ztbVar.f) && fni.a(this.g, ztbVar.g) && fni.a(this.h, ztbVar.h) && fni.a(this.i, ztbVar.i) && this.j == ztbVar.j;
    }

    public final int hashCode() {
        int iA = a9h.a(u45.e(xrf.k(this.c, a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iE = u45.e((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return az1.v(this.j) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "PhoneEntity(id=", ", phonebookId=");
        utb.n(sbL, this.b, ", contactId=", this.c);
        sbL.append(", phone=");
        sbL.append(this.d);
        sbL.append(", serverPhone=");
        hf3.e(this.e, ", email=", this.f, sbL);
        ho7.r(sbL, ", firstName=", this.g, ", lastName=", this.h);
        sbL.append(", avatarPath=");
        sbL.append(this.i);
        sbL.append(", type=");
        sbL.append(utb.p(this.j));
        sbL.append(")");
        return sbL.toString();
    }
}
