package com.avito.android.mortgage.landing.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: LandingArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/model/LandingArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f200062b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f200063c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f200064d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f200065e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f200066f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f200067g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f200068h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f200069i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f200070j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f200071k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f200072l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f200073m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f200074n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f200075o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f200076p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final String f200077q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final String f200078r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final String f200079s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final String f200080t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final String f200081u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final String f200082v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final String f200083w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final String f200084x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final String f200085y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f200086z;

    /* compiled from: LandingArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingArguments> {
        @Override // android.os.Parcelable.Creator
        public final LandingArguments createFromParcel(Parcel parcel) {
            return new LandingArguments(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LandingArguments[] newArray(int i12) {
            return new LandingArguments[i12];
        }
    }

    public LandingArguments(@l Integer num, @l String str, @l String str2, @l String str3, @l Integer num2, @l Integer num3, @l Integer num4, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10, @l String str11, @l String str12, @l String str13, @l String str14, @l String str15, @l String str16, @l String str17, @l String str18, @l String str19, @l String str20, boolean z12) {
        this.f200062b = num;
        this.f200063c = str;
        this.f200064d = str2;
        this.f200065e = str3;
        this.f200066f = num2;
        this.f200067g = num3;
        this.f200068h = num4;
        this.f200069i = str4;
        this.f200070j = str5;
        this.f200071k = str6;
        this.f200072l = str7;
        this.f200073m = str8;
        this.f200074n = str9;
        this.f200075o = str10;
        this.f200076p = str11;
        this.f200077q = str12;
        this.f200078r = str13;
        this.f200079s = str14;
        this.f200080t = str15;
        this.f200081u = str16;
        this.f200082v = str17;
        this.f200083w = str18;
        this.f200084x = str19;
        this.f200085y = str20;
        this.f200086z = z12;
    }

    @k
    public final MZ.k c() {
        boolean zF2 = L.f(this.f200065e, "building_house");
        Integer num = this.f200067g;
        return new MZ.k(this.f200085y, this.f200083w, this.f200084x, this.f200064d, this.f200065e, this.f200068h, zF2 ? num : null, !zF2 ? num : null, this.f200066f, this.f200062b, this.f200069i, this.f200063c, this.f200070j, this.f200071k, this.f200072l, this.f200075o, null, this.f200074n, this.f200073m, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingArguments)) {
            return false;
        }
        LandingArguments landingArguments = (LandingArguments) obj;
        return L.f(this.f200062b, landingArguments.f200062b) && L.f(this.f200063c, landingArguments.f200063c) && L.f(this.f200064d, landingArguments.f200064d) && L.f(this.f200065e, landingArguments.f200065e) && L.f(this.f200066f, landingArguments.f200066f) && L.f(this.f200067g, landingArguments.f200067g) && L.f(this.f200068h, landingArguments.f200068h) && L.f(this.f200069i, landingArguments.f200069i) && L.f(this.f200070j, landingArguments.f200070j) && L.f(this.f200071k, landingArguments.f200071k) && L.f(this.f200072l, landingArguments.f200072l) && L.f(this.f200073m, landingArguments.f200073m) && L.f(this.f200074n, landingArguments.f200074n) && L.f(this.f200075o, landingArguments.f200075o) && L.f(this.f200076p, landingArguments.f200076p) && L.f(this.f200077q, landingArguments.f200077q) && L.f(this.f200078r, landingArguments.f200078r) && L.f(this.f200079s, landingArguments.f200079s) && L.f(this.f200080t, landingArguments.f200080t) && L.f(this.f200081u, landingArguments.f200081u) && L.f(this.f200082v, landingArguments.f200082v) && L.f(this.f200083w, landingArguments.f200083w) && L.f(this.f200084x, landingArguments.f200084x) && L.f(this.f200085y, landingArguments.f200085y) && this.f200086z == landingArguments.f200086z;
    }

    public final int hashCode() {
        Integer num = this.f200062b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f200063c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f200064d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f200065e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f200066f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f200067g;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f200068h;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.f200069i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f200070j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f200071k;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f200072l;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f200073m;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f200074n;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f200075o;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f200076p;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f200077q;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f200078r;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f200079s;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f200080t;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f200081u;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f200082v;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f200083w;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f200084x;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f200085y;
        return Boolean.hashCode(this.f200086z) + ((iHashCode23 + (str20 != null ? str20.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingArguments(creditTerm=");
        sb2.append(this.f200062b);
        sb2.append(", borrowerAge=");
        sb2.append(this.f200063c);
        sb2.append(", regionId=");
        sb2.append(this.f200064d);
        sb2.append(", purposeId=");
        sb2.append(this.f200065e);
        sb2.append(", downPayment=");
        sb2.append(this.f200066f);
        sb2.append(", propertyCost=");
        sb2.append(this.f200067g);
        sb2.append(", landCost=");
        sb2.append(this.f200068h);
        sb2.append(", mortgageProgram=");
        sb2.append(this.f200069i);
        sb2.append(", occupation=");
        sb2.append(this.f200070j);
        sb2.append(", totalExperience=");
        sb2.append(this.f200071k);
        sb2.append(", currentExperience=");
        sb2.append(this.f200072l);
        sb2.append(", bankPayrollId=");
        sb2.append(this.f200073m);
        sb2.append(", proofOfIncome=");
        sb2.append(this.f200074n);
        sb2.append(", businessAge=");
        sb2.append(this.f200075o);
        sb2.append(", fromItemId=");
        sb2.append(this.f200076p);
        sb2.append(", utmSource=");
        sb2.append(this.f200077q);
        sb2.append(", utmCampaign=");
        sb2.append(this.f200078r);
        sb2.append(", utmMedium=");
        sb2.append(this.f200079s);
        sb2.append(", utmTerm=");
        sb2.append(this.f200080t);
        sb2.append(", utmContent=");
        sb2.append(this.f200081u);
        sb2.append(", fromPage=");
        sb2.append(this.f200082v);
        sb2.append(", flowType=");
        sb2.append(this.f200083w);
        sb2.append(", sourceType=");
        sb2.append(this.f200084x);
        sb2.append(", applicationId=");
        sb2.append(this.f200085y);
        sb2.append(", clearStack=");
        return r.x(sb2, this.f200086z, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f200062b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f200063c);
        parcel.writeString(this.f200064d);
        parcel.writeString(this.f200065e);
        Integer num2 = this.f200066f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f200067g;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f200068h;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        parcel.writeString(this.f200069i);
        parcel.writeString(this.f200070j);
        parcel.writeString(this.f200071k);
        parcel.writeString(this.f200072l);
        parcel.writeString(this.f200073m);
        parcel.writeString(this.f200074n);
        parcel.writeString(this.f200075o);
        parcel.writeString(this.f200076p);
        parcel.writeString(this.f200077q);
        parcel.writeString(this.f200078r);
        parcel.writeString(this.f200079s);
        parcel.writeString(this.f200080t);
        parcel.writeString(this.f200081u);
        parcel.writeString(this.f200082v);
        parcel.writeString(this.f200083w);
        parcel.writeString(this.f200084x);
        parcel.writeString(this.f200085y);
        parcel.writeInt(this.f200086z ? 1 : 0);
    }

    public /* synthetic */ LandingArguments(Integer num, String str, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z12, int i12, C42822w c42822w) {
        this(num, str, str2, str3, num2, num3, num4, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z12);
    }
}
