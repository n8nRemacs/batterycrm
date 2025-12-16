package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PreApprovalFormLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/PreApprovalFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class PreApprovalFormLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PreApprovalFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f198759b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f198760c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f198761d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f198762e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f198763f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f198764g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f198765h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f198766i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f198767j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f198768k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f198769l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f198770m;

    /* compiled from: PreApprovalFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreApprovalFormLink> {
        @Override // android.os.Parcelable.Creator
        public final PreApprovalFormLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new PreApprovalFormLink(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), string, string2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreApprovalFormLink[] newArray(int i12) {
            return new PreApprovalFormLink[i12];
        }
    }

    public /* synthetic */ PreApprovalFormLink(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4, String str5, Integer num5, String str6, String str7, int i12, C42822w c42822w) {
        this(num, num2, num3, num4, (i12 & 512) != 0 ? null : num5, str, str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) != 0 ? null : str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreApprovalFormLink)) {
            return false;
        }
        PreApprovalFormLink preApprovalFormLink = (PreApprovalFormLink) obj;
        return kotlin.jvm.internal.L.f(this.f198759b, preApprovalFormLink.f198759b) && kotlin.jvm.internal.L.f(this.f198760c, preApprovalFormLink.f198760c) && kotlin.jvm.internal.L.f(this.f198761d, preApprovalFormLink.f198761d) && kotlin.jvm.internal.L.f(this.f198762e, preApprovalFormLink.f198762e) && kotlin.jvm.internal.L.f(this.f198763f, preApprovalFormLink.f198763f) && kotlin.jvm.internal.L.f(this.f198764g, preApprovalFormLink.f198764g) && kotlin.jvm.internal.L.f(this.f198765h, preApprovalFormLink.f198765h) && kotlin.jvm.internal.L.f(this.f198766i, preApprovalFormLink.f198766i) && kotlin.jvm.internal.L.f(this.f198767j, preApprovalFormLink.f198767j) && kotlin.jvm.internal.L.f(this.f198768k, preApprovalFormLink.f198768k) && kotlin.jvm.internal.L.f(this.f198769l, preApprovalFormLink.f198769l) && kotlin.jvm.internal.L.f(this.f198770m, preApprovalFormLink.f198770m);
    }

    public final int hashCode() {
        String str = this.f198759b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f198760c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f198761d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f198762e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f198763f;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f198764g;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f198765h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f198766i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f198767j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.f198768k;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.f198769l;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f198770m;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalFormLink(purposeId=");
        sb2.append(this.f198759b);
        sb2.append(", regionId=");
        sb2.append(this.f198760c);
        sb2.append(", propertyCost=");
        sb2.append(this.f198761d);
        sb2.append(", landCost=");
        sb2.append(this.f198762e);
        sb2.append(", downPayment=");
        sb2.append(this.f198763f);
        sb2.append(", term=");
        sb2.append(this.f198764g);
        sb2.append(", age=");
        sb2.append(this.f198765h);
        sb2.append(", occupation=");
        sb2.append(this.f198766i);
        sb2.append(", currentExperience=");
        sb2.append(this.f198767j);
        sb2.append(", income=");
        sb2.append(this.f198768k);
        sb2.append(", proofOfIncome=");
        sb2.append(this.f198769l);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f198770m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198759b);
        parcel.writeString(this.f198760c);
        Integer num = this.f198761d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f198762e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f198763f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f198764g;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        parcel.writeString(this.f198765h);
        parcel.writeString(this.f198766i);
        parcel.writeString(this.f198767j);
        Integer num5 = this.f198768k;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        parcel.writeString(this.f198769l);
        parcel.writeString(this.f198770m);
    }

    public PreApprovalFormLink(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f198759b = str;
        this.f198760c = str2;
        this.f198761d = num;
        this.f198762e = num2;
        this.f198763f = num3;
        this.f198764g = num4;
        this.f198765h = str3;
        this.f198766i = str4;
        this.f198767j = str5;
        this.f198768k = num5;
        this.f198769l = str6;
        this.f198770m = str7;
    }
}
