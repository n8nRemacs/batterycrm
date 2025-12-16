package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/SuccessScreenInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SuccessScreenInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SuccessScreenInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionApi f107872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107873c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalImage f107874d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f107875e;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuccessScreenInfo> {
        @Override // android.os.Parcelable.Creator
        public final SuccessScreenInfo createFromParcel(Parcel parcel) {
            return new SuccessScreenInfo(ActionApi.CREATOR.createFromParcel(parcel), parcel.readString(), (UniversalImage) parcel.readParcelable(SuccessScreenInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuccessScreenInfo[] newArray(int i12) {
            return new SuccessScreenInfo[i12];
        }
    }

    public SuccessScreenInfo(@k ActionApi actionApi, @k String str, @k UniversalImage universalImage, @k String str2) {
        this.f107872b = actionApi;
        this.f107873c = str;
        this.f107874d = universalImage;
        this.f107875e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessScreenInfo)) {
            return false;
        }
        SuccessScreenInfo successScreenInfo = (SuccessScreenInfo) obj;
        return L.f(this.f107872b, successScreenInfo.f107872b) && L.f(this.f107873c, successScreenInfo.f107873c) && L.f(this.f107874d, successScreenInfo.f107874d) && L.f(this.f107875e, successScreenInfo.f107875e);
    }

    public final int hashCode() {
        return this.f107875e.hashCode() + com.avito.android.actions_sheet.a.a(H.d(this.f107872b.hashCode() * 31, 31, this.f107873c), 31, this.f107874d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessScreenInfo(action=");
        sb2.append(this.f107872b);
        sb2.append(", header=");
        sb2.append(this.f107873c);
        sb2.append(", image=");
        sb2.append(this.f107874d);
        sb2.append(", subHeader=");
        return C22026a.c(sb2, this.f107875e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f107872b.writeToParcel(parcel, i12);
        parcel.writeString(this.f107873c);
        parcel.writeParcelable(this.f107874d, i12);
        parcel.writeString(this.f107875e);
    }
}
