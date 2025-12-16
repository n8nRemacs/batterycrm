package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: SxAddressDeeplinkResult.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/SxAddressCancel;", "Lcom/avito/android/sx_address/SxAddressLinkResult;", "<init>", "()V", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxAddressCancel implements SxAddressLinkResult {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final SxAddressCancel f292528b = new SxAddressCancel();

    @k
    public static final Parcelable.Creator<SxAddressCancel> CREATOR = new a();

    /* compiled from: SxAddressDeeplinkResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressCancel> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressCancel createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SxAddressCancel.f292528b;
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressCancel[] newArray(int i12) {
            return new SxAddressCancel[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof SxAddressCancel);
    }

    public final int hashCode() {
        return 353381856;
    }

    @k
    public final String toString() {
        return "SxAddressCancel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
