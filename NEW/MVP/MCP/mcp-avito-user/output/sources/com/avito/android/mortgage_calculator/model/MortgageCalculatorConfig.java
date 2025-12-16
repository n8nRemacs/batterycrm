package com.avito.android.mortgage_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCalculatorConfig.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/model/MortgageCalculatorConfig;", "Landroid/os/Parcelable;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageCalculatorConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageCalculatorConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f204836b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f204837c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f204838d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f204839e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f204840f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f204841g;

    /* compiled from: MortgageCalculatorConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageCalculatorConfig> {
        @Override // android.os.Parcelable.Creator
        public final MortgageCalculatorConfig createFromParcel(Parcel parcel) {
            return new MortgageCalculatorConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageCalculatorConfig[] newArray(int i12) {
            return new MortgageCalculatorConfig[i12];
        }
    }

    public MortgageCalculatorConfig(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.f204836b = str;
        this.f204837c = str2;
        this.f204838d = str3;
        this.f204839e = str4;
        this.f204840f = str5;
        this.f204841g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageCalculatorConfig)) {
            return false;
        }
        MortgageCalculatorConfig mortgageCalculatorConfig = (MortgageCalculatorConfig) obj;
        return L.f(this.f204836b, mortgageCalculatorConfig.f204836b) && L.f(this.f204837c, mortgageCalculatorConfig.f204837c) && L.f(this.f204838d, mortgageCalculatorConfig.f204838d) && L.f(this.f204839e, mortgageCalculatorConfig.f204839e) && L.f(this.f204840f, mortgageCalculatorConfig.f204840f) && L.f(this.f204841g, mortgageCalculatorConfig.f204841g);
    }

    public final int hashCode() {
        int iHashCode = this.f204836b.hashCode() * 31;
        String str = this.f204837c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f204838d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f204839e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f204840f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f204841g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageCalculatorConfig(entityType=");
        sb2.append(this.f204836b);
        sb2.append(", entityId=");
        sb2.append(this.f204837c);
        sb2.append(", utmSource=");
        sb2.append(this.f204838d);
        sb2.append(", utmTerm=");
        sb2.append(this.f204839e);
        sb2.append(", utmCampaign=");
        sb2.append(this.f204840f);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f204841g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f204836b);
        parcel.writeString(this.f204837c);
        parcel.writeString(this.f204838d);
        parcel.writeString(this.f204839e);
        parcel.writeString(this.f204840f);
        parcel.writeString(this.f204841g);
    }

    public /* synthetic */ MortgageCalculatorConfig(String str, String str2, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6);
    }
}
