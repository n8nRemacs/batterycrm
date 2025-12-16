package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class ag5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final int i;
    public final String j;
    public final Integer k;
    public final String l;
    public final String m;
    public final String n;
    public final Locale o;
    public final String p;

    public ag5(String str, String str2, String str3, int i, String str4, String str5, Long l, String str6, int i2, String str7, Integer num, String str8, String str9, String str10, Locale locale, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = l;
        this.h = str6;
        this.i = i2;
        this.j = str7;
        this.k = num;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = locale;
        this.p = str11;
    }

    public static ag5 a(ag5 ag5Var, String str, Long l) {
        String str2 = ag5Var.b;
        String str3 = ag5Var.c;
        int i = ag5Var.d;
        String str4 = ag5Var.e;
        String str5 = ag5Var.f;
        String str6 = ag5Var.h;
        ag5Var.getClass();
        int i2 = ag5Var.i;
        String str7 = ag5Var.j;
        Integer num = ag5Var.k;
        String str8 = ag5Var.l;
        String str9 = ag5Var.m;
        String str10 = ag5Var.n;
        Locale locale = ag5Var.o;
        String str11 = ag5Var.p;
        ag5Var.getClass();
        return new ag5(str, str2, str3, i, str4, str5, l, str6, i2, str7, num, str8, str9, str10, locale, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag5)) {
            return false;
        }
        ag5 ag5Var = (ag5) obj;
        return fni.a(this.a, ag5Var.a) && fni.a(this.b, ag5Var.b) && fni.a(this.c, ag5Var.c) && this.d == ag5Var.d && fni.a(this.e, ag5Var.e) && fni.a(this.f, ag5Var.f) && fni.a(this.g, ag5Var.g) && fni.a(this.h, ag5Var.h) && this.i == ag5Var.i && fni.a(this.j, ag5Var.j) && fni.a(this.k, ag5Var.k) && fni.a(this.l, ag5Var.l) && fni.a(this.m, ag5Var.m) && fni.a(this.n, ag5Var.n) && fni.a(this.o, ag5Var.o) && fni.a(this.p, ag5Var.p);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iE = u45.e(u45.e(iti.a(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31), 31, this.e), 31, this.f);
        Long l = this.g;
        int iE2 = u45.e(iti.a(this.i, u45.e((iE + (l == null ? 0 : l.hashCode())) * 31, 961, this.h)), 31, this.j);
        Integer num = this.k;
        int iHashCode3 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Locale locale = this.o;
        int iHashCode7 = (iHashCode6 + (locale == null ? 0 : locale.hashCode())) * 31;
        String str6 = this.p;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("EndpointParameters(conversationId=", this.a, ", token=", this.b, ", userId=");
        sbL.append(this.c);
        sbL.append(", deviceIndex=");
        sbL.append(this.d);
        sbL.append(", endpointBaseUrl=");
        ho7.r(sbL, this.e, ", appVersion=", this.f, ", peerId=");
        sbL.append(this.g);
        sbL.append(", clientType=");
        sbL.append(this.h);
        sbL.append(", startUrlType=null, protocolVersion=");
        sbL.append(this.i);
        sbL.append(", capabilities=");
        sbL.append(this.j);
        sbL.append(", ispAsNo=");
        sbL.append(this.k);
        sbL.append(", ispAsOrg=");
        sbL.append(this.l);
        sbL.append(", locCc=");
        ho7.r(sbL, this.m, ", locReg=", this.n, ", locale=");
        sbL.append(this.o);
        sbL.append(", compression=");
        sbL.append(this.p);
        sbL.append(")");
        return sbL.toString();
    }
}
