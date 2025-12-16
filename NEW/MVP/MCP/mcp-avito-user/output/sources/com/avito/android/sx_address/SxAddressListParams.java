package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressListParams;", "Lcom/avito/android/sx_address/SxAddressParams;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxAddressListParams implements SxAddressParams {

    @k
    public static final Parcelable.Creator<SxAddressListParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f292541b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f292542c;

    /* compiled from: SxNewAddressOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressListParams> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressListParams createFromParcel(Parcel parcel) {
            return new SxAddressListParams(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressListParams[] newArray(int i12) {
            return new SxAddressListParams[i12];
        }
    }

    public SxAddressListParams(long j12, @l String str) {
        this.f292541b = j12;
        this.f292542c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxAddressListParams)) {
            return false;
        }
        SxAddressListParams sxAddressListParams = (SxAddressListParams) obj;
        return this.f292541b == sxAddressListParams.f292541b && L.f(this.f292542c, sxAddressListParams.f292542c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f292541b) * 31;
        String str = this.f292542c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SxAddressListParams(verticalId=");
        sb2.append(this.f292541b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f292542c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f292541b);
        parcel.writeString(this.f292542c);
    }
}
