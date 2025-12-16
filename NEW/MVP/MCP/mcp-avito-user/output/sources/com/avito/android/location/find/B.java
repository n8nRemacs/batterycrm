package com.avito.android.location.find;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: WeakCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/B;", "Lcom/google/android/gms/location/LocationCallback;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WeakReference<LocationCallback> f181743a;

    public B(@Y61.k LocationCallback locationCallback) {
        this.f181743a = new WeakReference<>(locationCallback);
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(@Y61.k LocationAvailability locationAvailability) {
        LocationCallback locationCallback = this.f181743a.get();
        if (locationCallback != null) {
            locationCallback.onLocationAvailability(locationAvailability);
        }
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(@Y61.k LocationResult locationResult) {
        LocationCallback locationCallback = this.f181743a.get();
        if (locationCallback != null) {
            locationCallback.onLocationResult(locationResult);
        }
    }
}
