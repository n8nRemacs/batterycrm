package E91;

import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3826b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3827c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3828d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3829e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3830f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3831g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3832h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3833i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3834j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3835k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3836l;

    /* renamed from: m, reason: collision with root package name */
    public final String f3837m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3838n;

    /* renamed from: o, reason: collision with root package name */
    public final String f3839o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3840p;

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.f3825a = str;
        this.f3826b = str2;
        this.f3827c = str3;
        this.f3828d = str4;
        this.f3829e = str5;
        this.f3830f = str6;
        this.f3831g = str7;
        this.f3832h = str8;
        this.f3833i = str9;
        this.f3834j = str10;
        this.f3835k = str11;
        this.f3836l = str12;
        this.f3837m = str13;
        this.f3838n = str14;
        this.f3839o = str15;
        this.f3840p = str16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3825a, dVar.f3825a) && L.f(this.f3826b, dVar.f3826b) && L.f(this.f3827c, dVar.f3827c) && L.f(this.f3828d, dVar.f3828d) && L.f(this.f3829e, dVar.f3829e) && L.f(this.f3830f, dVar.f3830f) && L.f(this.f3831g, dVar.f3831g) && L.f(this.f3832h, dVar.f3832h) && L.f(this.f3833i, dVar.f3833i) && L.f(this.f3834j, dVar.f3834j) && L.f(this.f3835k, dVar.f3835k) && L.f(this.f3836l, dVar.f3836l) && L.f(this.f3837m, dVar.f3837m) && L.f(this.f3838n, dVar.f3838n) && L.f(this.f3839o, dVar.f3839o) && L.f(this.f3840p, dVar.f3840p);
    }

    public final int hashCode() {
        String str = this.f3825a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3826b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3827c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3828d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3829e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3830f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f3831g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f3832h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f3833i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f3834j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f3835k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f3836l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f3837m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f3838n;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f3839o;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f3840p;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentData(type=");
        sb2.append(this.f3825a);
        sb2.append(", countryCode=");
        sb2.append(this.f3826b);
        sb2.append(", sex=");
        sb2.append(this.f3827c);
        sb2.append(", series=");
        sb2.append(this.f3828d);
        sb2.append(", number=");
        sb2.append(this.f3829e);
        sb2.append(", surname=");
        sb2.append(this.f3830f);
        sb2.append(", authority=");
        sb2.append(this.f3831g);
        sb2.append(", birthdate=");
        sb2.append(this.f3832h);
        sb2.append(", firstName=");
        sb2.append(this.f3833i);
        sb2.append(", birthplace=");
        sb2.append(this.f3834j);
        sb2.append(", issuedDate=");
        sb2.append(this.f3835k);
        sb2.append(", middleName=");
        sb2.append(this.f3836l);
        sb2.append(", authorityCode=");
        sb2.append(this.f3837m);
        sb2.append(", expiryDate=");
        sb2.append(this.f3838n);
        sb2.append(", citizenship=");
        sb2.append(this.f3839o);
        sb2.append(", citizenshipCode=");
        return C22026a.c(sb2, this.f3840p, ')');
    }
}
