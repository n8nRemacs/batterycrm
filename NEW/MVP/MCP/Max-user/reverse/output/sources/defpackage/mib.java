package defpackage;

/* loaded from: classes2.dex */
public final class mib extends cda {
    public final long b;
    public final String c;
    public final String d;

    public mib(long j, String str, String str2) {
        super(qqg.a);
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mib)) {
            return false;
        }
        mib mibVar = (mib) obj;
        return this.b == mibVar.b && fni.a(this.c, mibVar.c) && fni.a(this.d, mibVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + u45.e(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ctd.j(ho7.n("OpenPhoneBook(contactId=", this.b, ", fullName=", this.c), ", phone=", this.d, ")");
    }
}
