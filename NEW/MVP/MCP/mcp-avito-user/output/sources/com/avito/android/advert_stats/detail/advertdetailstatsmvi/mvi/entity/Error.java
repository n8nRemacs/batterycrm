package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailStatsMVIState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/Error;", "Landroid/os/Parcelable;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Error implements Parcelable {

    @k
    public static final Parcelable.Creator<Error> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86121b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiError f86122c;

    /* compiled from: AdvertDetailStatsMVIState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Error> {
        @Override // android.os.Parcelable.Creator
        public final Error createFromParcel(Parcel parcel) {
            return new Error((ApiError) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Error[] newArray(int i12) {
            return new Error[i12];
        }
    }

    public Error(@l ApiError apiError, @k String str) {
        this.f86121b = str;
        this.f86122c = apiError;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return L.f(this.f86121b, error.f86121b) && L.f(this.f86122c, error.f86122c);
    }

    public final int hashCode() {
        int iHashCode = this.f86121b.hashCode() * 31;
        ApiError apiError = this.f86122c;
        return iHashCode + (apiError == null ? 0 : apiError.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(message=");
        sb2.append(this.f86121b);
        sb2.append(", error=");
        return c.n(sb2, this.f86122c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86121b);
        parcel.writeParcelable(this.f86122c, i12);
    }

    public /* synthetic */ Error(String str, ApiError apiError, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : apiError, str);
    }
}
