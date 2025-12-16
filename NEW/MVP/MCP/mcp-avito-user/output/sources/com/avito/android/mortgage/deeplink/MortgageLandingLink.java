package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import q50.InterfaceC47204b;
import shark.AndroidResourceIdNames;

/* compiled from: MortgageLandingLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageLandingLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageLandingLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<MortgageLandingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f198717b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f198718c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f198719d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f198720e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f198721f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f198722g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f198723h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f198724i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f198725j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f198726k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f198727l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f198728m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f198729n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f198730o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f198731p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f198732q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final String f198733r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f198734s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f198735t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final String f198736u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final String f198737v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final String f198738w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final String f198739x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f198740y;

    /* compiled from: MortgageLandingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageLandingLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageLandingLink createFromParcel(Parcel parcel) {
            return new MortgageLandingLink(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageLandingLink[] newArray(int i12) {
            return new MortgageLandingLink[i12];
        }
    }

    public MortgageLandingLink() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777215, null);
    }

    public static MortgageLandingLink a(MortgageLandingLink mortgageLandingLink, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, String str3, String str4, String str5, String str6, String str7, int i12) {
        String str8;
        String str9;
        String str10 = mortgageLandingLink.f198717b;
        Integer num5 = (i12 & 2) != 0 ? mortgageLandingLink.f198718c : num;
        Integer num6 = (i12 & 4) != 0 ? mortgageLandingLink.f198719d : num2;
        Integer num7 = (i12 & 8) != 0 ? mortgageLandingLink.f198720e : num3;
        String str11 = (i12 & 16) != 0 ? mortgageLandingLink.f198721f : str;
        String str12 = (i12 & 32) != 0 ? mortgageLandingLink.f198722g : str2;
        Integer num8 = (i12 & 64) != 0 ? mortgageLandingLink.f198723h : num4;
        String str13 = mortgageLandingLink.f198724i;
        String str14 = mortgageLandingLink.f198725j;
        String str15 = mortgageLandingLink.f198726k;
        String str16 = mortgageLandingLink.f198727l;
        String str17 = mortgageLandingLink.f198728m;
        String str18 = mortgageLandingLink.f198729n;
        String str19 = mortgageLandingLink.f198730o;
        String str20 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? mortgageLandingLink.f198731p : str3;
        String str21 = (i12 & 32768) != 0 ? mortgageLandingLink.f198732q : str4;
        String str22 = (65536 & i12) != 0 ? mortgageLandingLink.f198733r : str5;
        String str23 = mortgageLandingLink.f198734s;
        if ((i12 & 262144) != 0) {
            str8 = str23;
            str9 = mortgageLandingLink.f198735t;
        } else {
            str8 = str23;
            str9 = str6;
        }
        String str24 = (i12 & 524288) != 0 ? mortgageLandingLink.f198736u : str7;
        String str25 = mortgageLandingLink.f198737v;
        String str26 = mortgageLandingLink.f198738w;
        String str27 = mortgageLandingLink.f198739x;
        boolean z12 = mortgageLandingLink.f198740y;
        mortgageLandingLink.getClass();
        return new MortgageLandingLink(str10, num5, num6, num7, str11, str12, num8, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str8, str9, str24, str25, str26, str27, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageLandingLink)) {
            return false;
        }
        MortgageLandingLink mortgageLandingLink = (MortgageLandingLink) obj;
        return kotlin.jvm.internal.L.f(this.f198717b, mortgageLandingLink.f198717b) && kotlin.jvm.internal.L.f(this.f198718c, mortgageLandingLink.f198718c) && kotlin.jvm.internal.L.f(this.f198719d, mortgageLandingLink.f198719d) && kotlin.jvm.internal.L.f(this.f198720e, mortgageLandingLink.f198720e) && kotlin.jvm.internal.L.f(this.f198721f, mortgageLandingLink.f198721f) && kotlin.jvm.internal.L.f(this.f198722g, mortgageLandingLink.f198722g) && kotlin.jvm.internal.L.f(this.f198723h, mortgageLandingLink.f198723h) && kotlin.jvm.internal.L.f(this.f198724i, mortgageLandingLink.f198724i) && kotlin.jvm.internal.L.f(this.f198725j, mortgageLandingLink.f198725j) && kotlin.jvm.internal.L.f(this.f198726k, mortgageLandingLink.f198726k) && kotlin.jvm.internal.L.f(this.f198727l, mortgageLandingLink.f198727l) && kotlin.jvm.internal.L.f(this.f198728m, mortgageLandingLink.f198728m) && kotlin.jvm.internal.L.f(this.f198729n, mortgageLandingLink.f198729n) && kotlin.jvm.internal.L.f(this.f198730o, mortgageLandingLink.f198730o) && kotlin.jvm.internal.L.f(this.f198731p, mortgageLandingLink.f198731p) && kotlin.jvm.internal.L.f(this.f198732q, mortgageLandingLink.f198732q) && kotlin.jvm.internal.L.f(this.f198733r, mortgageLandingLink.f198733r) && kotlin.jvm.internal.L.f(this.f198734s, mortgageLandingLink.f198734s) && kotlin.jvm.internal.L.f(this.f198735t, mortgageLandingLink.f198735t) && kotlin.jvm.internal.L.f(this.f198736u, mortgageLandingLink.f198736u) && kotlin.jvm.internal.L.f(this.f198737v, mortgageLandingLink.f198737v) && kotlin.jvm.internal.L.f(this.f198738w, mortgageLandingLink.f198738w) && kotlin.jvm.internal.L.f(this.f198739x, mortgageLandingLink.f198739x) && this.f198740y == mortgageLandingLink.f198740y;
    }

    public final int hashCode() {
        String str = this.f198717b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f198718c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f198719d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f198720e;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f198721f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f198722g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.f198723h;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.f198724i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f198725j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f198726k;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f198727l;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f198728m;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f198729n;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f198730o;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f198731p;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f198732q;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f198733r;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f198734s;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f198735t;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f198736u;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f198737v;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f198738w;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f198739x;
        return Boolean.hashCode(this.f198740y) + ((iHashCode22 + (str19 != null ? str19.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageLandingLink(borrowerAge=");
        sb2.append(this.f198717b);
        sb2.append(", cost=");
        sb2.append(this.f198718c);
        sb2.append(", landCost=");
        sb2.append(this.f198719d);
        sb2.append(", downPayment=");
        sb2.append(this.f198720e);
        sb2.append(", regionId=");
        sb2.append(this.f198721f);
        sb2.append(", purpose=");
        sb2.append(this.f198722g);
        sb2.append(", creditTerm=");
        sb2.append(this.f198723h);
        sb2.append(", mortgageProgram=");
        sb2.append(this.f198724i);
        sb2.append(", occupation=");
        sb2.append(this.f198725j);
        sb2.append(", totalExperience=");
        sb2.append(this.f198726k);
        sb2.append(", currentExperience=");
        sb2.append(this.f198727l);
        sb2.append(", bankPayrollId=");
        sb2.append(this.f198728m);
        sb2.append(", proofOfIncome=");
        sb2.append(this.f198729n);
        sb2.append(", businessAge=");
        sb2.append(this.f198730o);
        sb2.append(", fromItemId=");
        sb2.append(this.f198731p);
        sb2.append(", utmSource=");
        sb2.append(this.f198732q);
        sb2.append(", utmCampaign=");
        sb2.append(this.f198733r);
        sb2.append(", utmMedium=");
        sb2.append(this.f198734s);
        sb2.append(", utmTerm=");
        sb2.append(this.f198735t);
        sb2.append(", utmContent=");
        sb2.append(this.f198736u);
        sb2.append(", fromPage=");
        sb2.append(this.f198737v);
        sb2.append(", flowType=");
        sb2.append(this.f198738w);
        sb2.append(", sourceType=");
        sb2.append(this.f198739x);
        sb2.append(", clearStack=");
        return androidx.appcompat.app.r.x(sb2, this.f198740y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198717b);
        Integer num = this.f198718c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f198719d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f198720e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeString(this.f198721f);
        parcel.writeString(this.f198722g);
        Integer num4 = this.f198723h;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        parcel.writeString(this.f198724i);
        parcel.writeString(this.f198725j);
        parcel.writeString(this.f198726k);
        parcel.writeString(this.f198727l);
        parcel.writeString(this.f198728m);
        parcel.writeString(this.f198729n);
        parcel.writeString(this.f198730o);
        parcel.writeString(this.f198731p);
        parcel.writeString(this.f198732q);
        parcel.writeString(this.f198733r);
        parcel.writeString(this.f198734s);
        parcel.writeString(this.f198735t);
        parcel.writeString(this.f198736u);
        parcel.writeString(this.f198737v);
        parcel.writeString(this.f198738w);
        parcel.writeString(this.f198739x);
        parcel.writeInt(this.f198740y ? 1 : 0);
    }

    public /* synthetic */ MortgageLandingLink(String str, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "more_than_twenty_one" : str, (i12 & 2) != 0 ? 5000000 : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? 1000000 : num3, (i12 & 16) != 0 ? "637640" : str2, (i12 & 32) != 0 ? "primary" : str3, (i12 & 64) != 0 ? 30 : num4, (i12 & 128) != 0 ? "standart" : str4, (i12 & 256) != 0 ? "hired" : str5, (i12 & 512) != 0 ? "more_than_year" : str6, (i12 & 1024) != 0 ? "more_than_three_months" : str7, (i12 & 2048) != 0 ? null : str8, (i12 & 4096) != 0 ? null : str9, (i12 & 8192) != 0 ? null : str10, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (i12 & 32768) != 0 ? null : str12, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str13, (i12 & 131072) != 0 ? null : str14, (i12 & 262144) != 0 ? null : str15, (i12 & 524288) != 0 ? null : str16, (i12 & 1048576) != 0 ? null : str17, (i12 & 2097152) != 0 ? null : str18, (i12 & 4194304) != 0 ? null : str19, (i12 & 8388608) != 0 ? false : z12);
    }

    public MortgageLandingLink(@Y61.l String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str2, @Y61.l String str3, @Y61.l Integer num4, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l String str13, @Y61.l String str14, @Y61.l String str15, @Y61.l String str16, @Y61.l String str17, @Y61.l String str18, @Y61.l String str19, boolean z12) {
        this.f198717b = str;
        this.f198718c = num;
        this.f198719d = num2;
        this.f198720e = num3;
        this.f198721f = str2;
        this.f198722g = str3;
        this.f198723h = num4;
        this.f198724i = str4;
        this.f198725j = str5;
        this.f198726k = str6;
        this.f198727l = str7;
        this.f198728m = str8;
        this.f198729n = str9;
        this.f198730o = str10;
        this.f198731p = str11;
        this.f198732q = str12;
        this.f198733r = str13;
        this.f198734s = str14;
        this.f198735t = str15;
        this.f198736u = str16;
        this.f198737v = str17;
        this.f198738w = str18;
        this.f198739x = str19;
        this.f198740y = z12;
    }
}
