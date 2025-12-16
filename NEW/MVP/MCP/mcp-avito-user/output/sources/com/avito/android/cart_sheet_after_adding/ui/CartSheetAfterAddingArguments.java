package com.avito.android.cart_sheet_after_adding.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingActivity.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/CartSheetAfterAddingArguments;", "Landroid/os/Parcelable;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartSheetAfterAddingArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CartSheetAfterAddingArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f115458b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f115459c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f115460d;

    /* compiled from: CartSheetAfterAddingActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartSheetAfterAddingArguments> {
        @Override // android.os.Parcelable.Creator
        public final CartSheetAfterAddingArguments createFromParcel(Parcel parcel) {
            return new CartSheetAfterAddingArguments(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CartSheetAfterAddingArguments[] newArray(int i12) {
            return new CartSheetAfterAddingArguments[i12];
        }
    }

    public CartSheetAfterAddingArguments(long j12, @Y61.l String str, @Y61.l String str2) {
        this.f115458b = j12;
        this.f115459c = str;
        this.f115460d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSheetAfterAddingArguments)) {
            return false;
        }
        CartSheetAfterAddingArguments cartSheetAfterAddingArguments = (CartSheetAfterAddingArguments) obj;
        return this.f115458b == cartSheetAfterAddingArguments.f115458b && kotlin.jvm.internal.L.f(this.f115459c, cartSheetAfterAddingArguments.f115459c) && kotlin.jvm.internal.L.f(this.f115460d, cartSheetAfterAddingArguments.f115460d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f115458b) * 31;
        String str = this.f115459c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115460d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSheetAfterAddingArguments(contentId=");
        sb2.append(this.f115458b);
        sb2.append(", searchContext=");
        sb2.append(this.f115459c);
        sb2.append(", segment=");
        return C22026a.c(sb2, this.f115460d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f115458b);
        parcel.writeString(this.f115459c);
        parcel.writeString(this.f115460d);
    }
}
