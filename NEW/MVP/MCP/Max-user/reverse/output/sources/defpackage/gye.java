package defpackage;

/* loaded from: classes2.dex */
public final class gye {
    public final fye a;
    public final s5g b;
    public final String c;
    public final s5g d;
    public final String e;
    public final String f;

    public gye(fye fyeVar, s5g s5gVar, String str, s5g s5gVar2, String str2, String str3) {
        this.a = fyeVar;
        this.b = s5gVar;
        this.c = str;
        this.d = s5gVar2;
        this.e = str2;
        this.f = str3;
    }

    public static gye a(gye gyeVar, fye fyeVar, s5g s5gVar, String str, s5g s5gVar2, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            fyeVar = gyeVar.a;
        }
        fye fyeVar2 = fyeVar;
        if ((i & 2) != 0) {
            s5gVar = gyeVar.b;
        }
        s5g s5gVar3 = s5gVar;
        if ((i & 4) != 0) {
            str = gyeVar.c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            s5gVar2 = gyeVar.d;
        }
        s5g s5gVar4 = s5gVar2;
        if ((i & 16) != 0) {
            str2 = gyeVar.e;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = gyeVar.f;
        }
        gyeVar.getClass();
        return new gye(fyeVar2, s5gVar3, str4, s5gVar4, str5, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gye)) {
            return false;
        }
        gye gyeVar = (gye) obj;
        return fni.a(this.a, gyeVar.a) && fni.a(this.b, gyeVar.b) && fni.a(this.c, gyeVar.c) && fni.a(this.d, gyeVar.d) && fni.a(this.e, gyeVar.e) && fni.a(this.f, gyeVar.f);
    }

    public final int hashCode() {
        fye fyeVar = this.a;
        int iHashCode = (fyeVar == null ? 0 : fyeVar.hashCode()) * 31;
        s5g s5gVar = this.b;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        s5g s5gVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (s5gVar2 == null ? 0 : s5gVar2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ShowLocationState(markerModel=" + this.a + ", senderName=" + this.b + ", locationText=" + this.c + ", distanceUnits=" + this.d + ", distanceValue=" + this.e + ", timeText=" + this.f + ")";
    }
}
