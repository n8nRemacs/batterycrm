package defpackage;

/* loaded from: classes2.dex */
public final class moh {
    public static final loh Companion = new loh();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ moh(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, koh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moh)) {
            return false;
        }
        moh mohVar = (moh) obj;
        return fni.a(this.a, mohVar.a) && fni.a(this.b, mohVar.b) && fni.a(this.c, mohVar.c) && fni.a(this.d, mohVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iE = u45.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("WebAppBiometryUpdateTokenRequest(queryId=", this.a, ", requestId=", this.b, ", reason=");
        sbL.append(this.c);
        sbL.append(", token=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
