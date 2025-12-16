package defpackage;

import java.util.TimeZone;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;

/* loaded from: classes2.dex */
public final class cxg {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final TimeZone k;

    public cxg(String str, String str2, String str3, String str4, String str5, String str6) {
        TimeZone timeZone = TimeZone.getDefault();
        this.a = AbstractUploader.SDK_TYPE_STRING;
        this.b = "25.19.0";
        this.c = 6468;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = 2;
        this.k = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxg)) {
            return false;
        }
        cxg cxgVar = (cxg) obj;
        return fni.a(this.a, cxgVar.a) && fni.a(this.b, cxgVar.b) && this.c == cxgVar.c && fni.a(this.d, cxgVar.d) && fni.a(this.e, cxgVar.e) && fni.a(this.f, cxgVar.f) && fni.a(this.g, cxgVar.g) && fni.a(this.h, cxgVar.h) && fni.a(this.i, cxgVar.i) && this.j == cxgVar.j && fni.a(this.k, cxgVar.k);
    }

    public final int hashCode() {
        int iE = u45.e(u45.e(u45.e(u45.e(u45.e(u45.e(xrf.k(this.c, u45.e(this.a.hashCode() * 31, 31, this.b), 961), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        int i = this.j;
        return this.k.hashCode() + ((iE + (i == 0 ? 0 : az1.v(i))) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("UserAgent(deviceType=", this.a, ", appVersion=", this.b, ", buildNumber=");
        sbL.append(this.c);
        sbL.append(", appKey=null, osVersion=");
        sbL.append(this.d);
        sbL.append(", arch=");
        ho7.r(sbL, this.e, ", locale=", this.f, ", deviceLocale=");
        ho7.r(sbL, this.g, ", deviceName=", this.h, ", screen=");
        sbL.append(this.i);
        sbL.append(", pushDeviceType=");
        int i = this.j;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? "null" : "RUSTORE" : "GCM" : "HUAWEI");
        sbL.append(", timeZone=");
        sbL.append(this.k);
        sbL.append(")");
        return sbL.toString();
    }
}
