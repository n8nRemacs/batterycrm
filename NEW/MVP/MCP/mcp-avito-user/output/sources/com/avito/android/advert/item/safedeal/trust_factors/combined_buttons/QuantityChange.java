package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: QuantityChange.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuantityChange implements Parcelable {

    @k
    public static final Parcelable.Creator<QuantityChange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f79076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79077c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79078d;

    /* compiled from: QuantityChange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<QuantityChange> {
        @Override // android.os.Parcelable.Creator
        public final QuantityChange createFromParcel(Parcel parcel) {
            return new QuantityChange(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final QuantityChange[] newArray(int i12) {
            return new QuantityChange[i12];
        }
    }

    public QuantityChange(int i12, int i13, int i14) {
        this.f79076b = i12;
        this.f79077c = i13;
        this.f79078d = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityChange)) {
            return false;
        }
        QuantityChange quantityChange = (QuantityChange) obj;
        return this.f79076b == quantityChange.f79076b && this.f79077c == quantityChange.f79077c && this.f79078d == quantityChange.f79078d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79078d) + r.e(this.f79077c, Integer.hashCode(this.f79076b) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuantityChange(oldQuantity=");
        sb2.append(this.f79076b);
        sb2.append(", newQuantity=");
        sb2.append(this.f79077c);
        sb2.append(", maxQuantity=");
        return r.t(sb2, this.f79078d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f79076b);
        parcel.writeInt(this.f79077c);
        parcel.writeInt(this.f79078d);
    }
}
