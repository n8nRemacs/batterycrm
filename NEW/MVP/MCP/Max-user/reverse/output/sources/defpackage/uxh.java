package defpackage;

/* loaded from: classes2.dex */
public final class uxh {
    public static final sxh Companion = new sxh();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ uxh(String str, int i, String str2, String str3) {
        if (1 != (i & 1)) {
            g5j.c(i, 1, qxh.a.d());
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
        if (!(obj instanceof uxh)) {
            return false;
        }
        uxh uxhVar = (uxh) obj;
        return fni.a(this.a, uxhVar.a) && fni.a(this.b, uxhVar.b) && fni.a(this.c, uxhVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppShareRequest(requestId=", this.a, ", text=", this.b, ", link="), this.c, ")");
    }
}
