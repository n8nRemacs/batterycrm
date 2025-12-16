package com.avito.android.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedPaymentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery/SavedPaymentData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SavedPaymentData implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedPaymentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134750b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f134751c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f134752d;

    /* compiled from: SavedPaymentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedPaymentData> {
        @Override // android.os.Parcelable.Creator
        public final SavedPaymentData createFromParcel(Parcel parcel) {
            return new SavedPaymentData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedPaymentData[] newArray(int i12) {
            return new SavedPaymentData[i12];
        }
    }

    public SavedPaymentData(@k String str, @l String str2, @k String str3) {
        this.f134750b = str;
        this.f134751c = str2;
        this.f134752d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedPaymentData)) {
            return false;
        }
        SavedPaymentData savedPaymentData = (SavedPaymentData) obj;
        return L.f(this.f134750b, savedPaymentData.f134750b) && L.f(this.f134751c, savedPaymentData.f134751c) && L.f(this.f134752d, savedPaymentData.f134752d);
    }

    public final int hashCode() {
        int iHashCode = this.f134750b.hashCode() * 31;
        String str = this.f134751c;
        return this.f134752d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedPaymentData(sellerId=");
        sb2.append(this.f134750b);
        sb2.append(", selectedPaymentCardId=");
        sb2.append(this.f134751c);
        sb2.append(", transformId=");
        return C22026a.c(sb2, this.f134752d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134750b);
        parcel.writeString(this.f134751c);
        parcel.writeString(this.f134752d);
    }

    public /* synthetic */ SavedPaymentData(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3);
    }
}
