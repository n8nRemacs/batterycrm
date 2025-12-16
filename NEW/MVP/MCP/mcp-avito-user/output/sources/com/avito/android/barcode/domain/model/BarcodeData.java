package com.avito.android.barcode.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.barcode_encoder.BarcodeFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode/domain/model/BarcodeData;", "Landroid/os/Parcelable;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeData implements Parcelable {

    @k
    public static final Parcelable.Creator<BarcodeData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f98664b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f98665c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f98666d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BarcodeFormat f98667e;

    /* compiled from: BarcodeData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BarcodeData> {
        @Override // android.os.Parcelable.Creator
        public final BarcodeData createFromParcel(Parcel parcel) {
            return new BarcodeData(BarcodeFormat.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BarcodeData[] newArray(int i12) {
            return new BarcodeData[i12];
        }
    }

    public BarcodeData(@k BarcodeFormat barcodeFormat, @k String str, @l String str2, @l String str3) {
        this.f98664b = str;
        this.f98665c = str2;
        this.f98666d = str3;
        this.f98667e = barcodeFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeData)) {
            return false;
        }
        BarcodeData barcodeData = (BarcodeData) obj;
        return L.f(this.f98664b, barcodeData.f98664b) && L.f(this.f98665c, barcodeData.f98665c) && L.f(this.f98666d, barcodeData.f98666d) && this.f98667e == barcodeData.f98667e;
    }

    public final int hashCode() {
        int iHashCode = this.f98664b.hashCode() * 31;
        String str = this.f98665c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98666d;
        return this.f98667e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "BarcodeData(contents=" + this.f98664b + ", text=" + this.f98665c + ", providerLabel=" + this.f98666d + ", barcodeFormat=" + this.f98667e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f98664b);
        parcel.writeString(this.f98665c);
        parcel.writeString(this.f98666d);
        parcel.writeString(this.f98667e.name());
    }
}
