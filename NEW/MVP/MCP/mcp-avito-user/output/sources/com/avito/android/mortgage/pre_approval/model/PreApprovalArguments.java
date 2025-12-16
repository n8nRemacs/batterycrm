package com.avito.android.mortgage.pre_approval.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/model/PreApprovalArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PreApprovalArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<PreApprovalArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f201965b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f201966c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f201967d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f201968e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f201969f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f201970g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f201971h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f201972i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f201973j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Integer f201974k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f201975l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f201976m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f201977n;

    /* compiled from: PreApprovalArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreApprovalArguments> {
        @Override // android.os.Parcelable.Creator
        public final PreApprovalArguments createFromParcel(Parcel parcel) {
            return new PreApprovalArguments(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreApprovalArguments[] newArray(int i12) {
            return new PreApprovalArguments[i12];
        }
    }

    public PreApprovalArguments(@l String str, @l String str2, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l String str3, @l String str4, @l String str5, @l Integer num5, @l String str6, @l String str7, @l String str8) {
        this.f201965b = str;
        this.f201966c = str2;
        this.f201967d = num;
        this.f201968e = num2;
        this.f201969f = num3;
        this.f201970g = num4;
        this.f201971h = str3;
        this.f201972i = str4;
        this.f201973j = str5;
        this.f201974k = num5;
        this.f201975l = str6;
        this.f201976m = str7;
        this.f201977n = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreApprovalArguments)) {
            return false;
        }
        PreApprovalArguments preApprovalArguments = (PreApprovalArguments) obj;
        return L.f(this.f201965b, preApprovalArguments.f201965b) && L.f(this.f201966c, preApprovalArguments.f201966c) && L.f(this.f201967d, preApprovalArguments.f201967d) && L.f(this.f201968e, preApprovalArguments.f201968e) && L.f(this.f201969f, preApprovalArguments.f201969f) && L.f(this.f201970g, preApprovalArguments.f201970g) && L.f(this.f201971h, preApprovalArguments.f201971h) && L.f(this.f201972i, preApprovalArguments.f201972i) && L.f(this.f201973j, preApprovalArguments.f201973j) && L.f(this.f201974k, preApprovalArguments.f201974k) && L.f(this.f201975l, preApprovalArguments.f201975l) && L.f(this.f201976m, preApprovalArguments.f201976m) && L.f(this.f201977n, preApprovalArguments.f201977n);
    }

    public final int hashCode() {
        String str = this.f201965b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f201966c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f201967d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f201968e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f201969f;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f201970g;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f201971h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f201972i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f201973j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.f201974k;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.f201975l;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f201976m;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f201977n;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalArguments(purposeId=");
        sb2.append(this.f201965b);
        sb2.append(", regionId=");
        sb2.append(this.f201966c);
        sb2.append(", propertyCost=");
        sb2.append(this.f201967d);
        sb2.append(", landCost=");
        sb2.append(this.f201968e);
        sb2.append(", downPayment=");
        sb2.append(this.f201969f);
        sb2.append(", term=");
        sb2.append(this.f201970g);
        sb2.append(", age=");
        sb2.append(this.f201971h);
        sb2.append(", occupation=");
        sb2.append(this.f201972i);
        sb2.append(", currentExperience=");
        sb2.append(this.f201973j);
        sb2.append(", income=");
        sb2.append(this.f201974k);
        sb2.append(", proofOfIncome=");
        sb2.append(this.f201975l);
        sb2.append(", mortgageProgram=");
        sb2.append(this.f201976m);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f201977n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f201965b);
        parcel.writeString(this.f201966c);
        Integer num = this.f201967d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f201968e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f201969f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f201970g;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        parcel.writeString(this.f201971h);
        parcel.writeString(this.f201972i);
        parcel.writeString(this.f201973j);
        Integer num5 = this.f201974k;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        parcel.writeString(this.f201975l);
        parcel.writeString(this.f201976m);
        parcel.writeString(this.f201977n);
    }
}
