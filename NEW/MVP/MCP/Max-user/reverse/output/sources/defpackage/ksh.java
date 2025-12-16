package defpackage;

/* loaded from: classes2.dex */
public final class ksh {
    public static final jsh Companion = new jsh();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ksh(String str, int i, String str2, String str3) {
        if (1 != (i & 1)) {
            g5j.c(i, 1, ish.a.d());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksh)) {
            return false;
        }
        ksh kshVar = (ksh) obj;
        return fni.a(this.a, kshVar.a) && fni.a(this.b, kshVar.b) && fni.a(this.c, kshVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppMaxShareRequest(requestId=", this.a, ", text=", this.b, ", link="), this.c, ")");
    }
}
