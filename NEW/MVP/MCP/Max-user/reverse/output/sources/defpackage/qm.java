package defpackage;

/* loaded from: classes2.dex */
public final class qm {
    public final String a;
    public final String b;
    public final String c;

    public qm(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm)) {
            return false;
        }
        qm qmVar = (qm) obj;
        return fni.a(this.a, qmVar.a) && fni.a(this.b, qmVar.b) && fni.a(this.c, qmVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ho7.l(wy1.l("SessionInfo(sessionKey=", this.a, ", sessionSecret=", this.b, ", apiEndpoint="), this.c, ")");
    }
}
