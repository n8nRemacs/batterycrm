package com.avito.android.forceupdate.screens.forceupdaterequired;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRequiredOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/ForceUpdateRequiredOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ForceUpdateRequiredOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<ForceUpdateRequiredOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UpdateSource f158484b;

    /* compiled from: ForceUpdateRequiredOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ForceUpdateRequiredOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final ForceUpdateRequiredOpenParams createFromParcel(Parcel parcel) {
            return new ForceUpdateRequiredOpenParams((UpdateSource) parcel.readParcelable(ForceUpdateRequiredOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ForceUpdateRequiredOpenParams[] newArray(int i12) {
            return new ForceUpdateRequiredOpenParams[i12];
        }
    }

    public ForceUpdateRequiredOpenParams(@k UpdateSource updateSource) {
        this.f158484b = updateSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateRequiredOpenParams) && L.f(this.f158484b, ((ForceUpdateRequiredOpenParams) obj).f158484b);
    }

    public final int hashCode() {
        return this.f158484b.hashCode();
    }

    @k
    public final String toString() {
        return "ForceUpdateRequiredOpenParams(updateSource=" + this.f158484b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f158484b, i12);
    }
}
