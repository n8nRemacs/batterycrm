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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressVideoVerificationParams;", "Lcom/avito/android/sx_address/SxAddressParams;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxAddressVideoVerificationParams implements SxAddressParams {

    @k
    public static final Parcelable.Creator<SxAddressVideoVerificationParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f292545b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f292546c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f292547d;

    /* compiled from: SxNewAddressOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressVideoVerificationParams> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressVideoVerificationParams createFromParcel(Parcel parcel) {
            return new SxAddressVideoVerificationParams(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressVideoVerificationParams[] newArray(int i12) {
            return new SxAddressVideoVerificationParams[i12];
        }
    }

    public SxAddressVideoVerificationParams(long j12, @l String str, @l String str2) {
        this.f292545b = j12;
        this.f292546c = str;
        this.f292547d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxAddressVideoVerificationParams)) {
            return false;
        }
        SxAddressVideoVerificationParams sxAddressVideoVerificationParams = (SxAddressVideoVerificationParams) obj;
        return this.f292545b == sxAddressVideoVerificationParams.f292545b && L.f(this.f292546c, sxAddressVideoVerificationParams.f292546c) && L.f(this.f292547d, sxAddressVideoVerificationParams.f292547d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f292545b) * 31;
        String str = this.f292546c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f292547d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SxAddressVideoVerificationParams(sellerAddressId=");
        sb2.append(this.f292545b);
        sb2.append(", addressStatus=");
        sb2.append(this.f292546c);
        sb2.append(", addressStatusAction=");
        return C22026a.c(sb2, this.f292547d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f292545b);
        parcel.writeString(this.f292546c);
        parcel.writeString(this.f292547d);
    }
}
