package com.avito.android.barcode.presentation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.barcode_encoder.BarcodeFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeDetailsActivity.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode/presentation/BarcodeArguments;", "Landroid/os/Parcelable;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<BarcodeArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f98677b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BarcodeFormat f98678c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f98679d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f98680e;

    /* compiled from: BarcodeDetailsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BarcodeArguments> {
        @Override // android.os.Parcelable.Creator
        public final BarcodeArguments createFromParcel(Parcel parcel) {
            return new BarcodeArguments(BarcodeFormat.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BarcodeArguments[] newArray(int i12) {
            return new BarcodeArguments[i12];
        }
    }

    public BarcodeArguments(@k BarcodeFormat barcodeFormat, @k String str, @l String str2, @l String str3) {
        this.f98677b = str;
        this.f98678c = barcodeFormat;
        this.f98679d = str2;
        this.f98680e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeArguments)) {
            return false;
        }
        BarcodeArguments barcodeArguments = (BarcodeArguments) obj;
        return L.f(this.f98677b, barcodeArguments.f98677b) && this.f98678c == barcodeArguments.f98678c && L.f(this.f98679d, barcodeArguments.f98679d) && L.f(this.f98680e, barcodeArguments.f98680e);
    }

    public final int hashCode() {
        int iHashCode = (this.f98678c.hashCode() + (this.f98677b.hashCode() * 31)) * 31;
        String str = this.f98679d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98680e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BarcodeArguments(contents=");
        sb2.append(this.f98677b);
        sb2.append(", barcodeFormat=");
        sb2.append(this.f98678c);
        sb2.append(", text=");
        sb2.append(this.f98679d);
        sb2.append(", providerLabel=");
        return C22026a.c(sb2, this.f98680e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f98677b);
        parcel.writeString(this.f98678c.name());
        parcel.writeString(this.f98679d);
        parcel.writeString(this.f98680e);
    }
}
