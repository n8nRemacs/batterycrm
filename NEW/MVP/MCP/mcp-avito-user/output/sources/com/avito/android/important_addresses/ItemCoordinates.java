package com.avito.android.important_addresses;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;

/* compiled from: ItemCoordinates.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/ItemCoordinates;", "Landroid/os/Parcelable;", "_avito_important-addresses_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemCoordinates implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemCoordinates> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final double f169572b;

    /* renamed from: c, reason: collision with root package name */
    public final double f169573c;

    /* compiled from: ItemCoordinates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemCoordinates> {
        @Override // android.os.Parcelable.Creator
        public final ItemCoordinates createFromParcel(Parcel parcel) {
            return new ItemCoordinates(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemCoordinates[] newArray(int i12) {
            return new ItemCoordinates[i12];
        }
    }

    public ItemCoordinates(double d12, double d13) {
        this.f169572b = d12;
        this.f169573c = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemCoordinates)) {
            return false;
        }
        ItemCoordinates itemCoordinates = (ItemCoordinates) obj;
        return Double.compare(this.f169572b, itemCoordinates.f169572b) == 0 && Double.compare(this.f169573c, itemCoordinates.f169573c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f169573c) + (Double.hashCode(this.f169572b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemCoordinates(latitude=");
        sb2.append(this.f169572b);
        sb2.append(", longitude=");
        return e.o(sb2, this.f169573c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeDouble(this.f169572b);
        parcel.writeDouble(this.f169573c);
    }
}
