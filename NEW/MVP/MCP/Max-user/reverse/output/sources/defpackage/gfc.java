package defpackage;

/* loaded from: classes2.dex */
public final class gfc implements jfc {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public gfc(Long l, String str, String str2, String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfc)) {
            return false;
        }
        gfc gfcVar = (gfc) obj;
        return fni.a(this.a, gfcVar.a) && fni.a(this.b, gfcVar.b) && fni.a(this.c, gfcVar.c) && fni.a(this.d, gfcVar.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int iE = u45.e(u45.e((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ContactUpdate(requestId=" + this.a + ", fullName=" + this.b + ", nickName=" + this.c + ", avatarUrl=" + this.d + ")";
    }
}
