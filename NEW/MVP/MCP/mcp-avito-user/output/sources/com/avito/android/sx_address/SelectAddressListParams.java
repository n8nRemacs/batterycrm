package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SxNewAddressOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SelectAddressListParams;", "Lcom/avito/android/sx_address/SxAddressParams;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectAddressListParams implements SxAddressParams {

    @k
    public static final Parcelable.Creator<SelectAddressListParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f292522b;

    /* compiled from: SxNewAddressOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectAddressListParams> {
        @Override // android.os.Parcelable.Creator
        public final SelectAddressListParams createFromParcel(Parcel parcel) {
            return new SelectAddressListParams(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectAddressListParams[] newArray(int i12) {
            return new SelectAddressListParams[i12];
        }
    }

    public SelectAddressListParams(long j12) {
        this.f292522b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectAddressListParams) && this.f292522b == ((SelectAddressListParams) obj).f292522b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f292522b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("SelectAddressListParams(verticalId="), this.f292522b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f292522b);
    }
}
