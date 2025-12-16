package com.avito.android.edit_address.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;

/* compiled from: AddressCoordinates.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/entity/AddressCoordinates;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressCoordinates implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressCoordinates> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final double f145891b;

    /* renamed from: c, reason: collision with root package name */
    public final double f145892c;

    /* compiled from: AddressCoordinates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressCoordinates> {
        @Override // android.os.Parcelable.Creator
        public final AddressCoordinates createFromParcel(Parcel parcel) {
            return new AddressCoordinates(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressCoordinates[] newArray(int i12) {
            return new AddressCoordinates[i12];
        }
    }

    public AddressCoordinates(double d12, double d13) {
        this.f145891b = d12;
        this.f145892c = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressCoordinates)) {
            return false;
        }
        AddressCoordinates addressCoordinates = (AddressCoordinates) obj;
        return Double.compare(this.f145891b, addressCoordinates.f145891b) == 0 && Double.compare(this.f145892c, addressCoordinates.f145892c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f145892c) + (Double.hashCode(this.f145891b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressCoordinates(latitude=");
        sb2.append(this.f145891b);
        sb2.append(", longitude=");
        return e.o(sb2, this.f145892c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeDouble(this.f145891b);
        parcel.writeDouble(this.f145892c);
    }
}
