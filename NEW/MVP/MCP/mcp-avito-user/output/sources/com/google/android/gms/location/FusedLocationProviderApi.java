package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import j.a0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@Deprecated
/* loaded from: classes6.dex */
public interface FusedLocationProviderApi {

    @j.N
    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";

    @j.N
    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @j.N
    com.google.android.gms.common.api.m<Status> flushLocations(@j.N com.google.android.gms.common.api.i iVar);

    @j.P
    @a0
    Location getLastLocation(@j.N com.google.android.gms.common.api.i iVar);

    @j.P
    @a0
    LocationAvailability getLocationAvailability(@j.N com.google.android.gms.common.api.i iVar);

    @j.N
    com.google.android.gms.common.api.m<Status> removeLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N PendingIntent pendingIntent);

    @j.N
    com.google.android.gms.common.api.m<Status> removeLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N LocationCallback locationCallback);

    @j.N
    com.google.android.gms.common.api.m<Status> removeLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N InterfaceC36788i interfaceC36788i);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> requestLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N LocationRequest locationRequest, @j.N PendingIntent pendingIntent);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> requestLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N LocationRequest locationRequest, @j.N LocationCallback locationCallback, @j.N Looper looper);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> requestLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N LocationRequest locationRequest, @j.N InterfaceC36788i interfaceC36788i);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> requestLocationUpdates(@j.N com.google.android.gms.common.api.i iVar, @j.N LocationRequest locationRequest, @j.N InterfaceC36788i interfaceC36788i, @j.N Looper looper);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> setMockLocation(@j.N com.google.android.gms.common.api.i iVar, @j.N Location location);

    @j.N
    @a0
    com.google.android.gms.common.api.m<Status> setMockMode(@j.N com.google.android.gms.common.api.i iVar, boolean z12);
}
