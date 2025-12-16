package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: SxAddressListLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/AddressValue;", "Landroid/os/Parcelable;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddressValue implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AddressValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f67177b;

    /* renamed from: c, reason: collision with root package name */
    public final double f67178c;

    /* renamed from: d, reason: collision with root package name */
    public final double f67179d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f67180e;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressValue> {
        @Override // android.os.Parcelable.Creator
        public final AddressValue createFromParcel(Parcel parcel) {
            return new AddressValue(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressValue[] newArray(int i12) {
            return new AddressValue[i12];
        }
    }

    public AddressValue(@Y61.l String str, double d12, double d13, @Y61.k String str2) {
        this.f67177b = str;
        this.f67178c = d12;
        this.f67179d = d13;
        this.f67180e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f67177b);
        parcel.writeDouble(this.f67178c);
        parcel.writeDouble(this.f67179d);
        parcel.writeString(this.f67180e);
    }
}
