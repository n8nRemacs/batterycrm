package com.avito.android.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;

/* compiled from: LocationInteractorState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/LocationInteractorState;", "Landroid/os/Parcelable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationInteractorState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LocationInteractorState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Location f181707b;

    /* compiled from: LocationInteractorState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationInteractorState> {
        @Override // android.os.Parcelable.Creator
        public final LocationInteractorState createFromParcel(Parcel parcel) {
            return new LocationInteractorState((Location) parcel.readParcelable(LocationInteractorState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocationInteractorState[] newArray(int i12) {
            return new LocationInteractorState[i12];
        }
    }

    public LocationInteractorState(@Y61.l Location location) {
        this.f181707b = location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f181707b, i12);
    }
}
