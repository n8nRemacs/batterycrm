package com.google.android.gms.location;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.tasks.Task;
import j.a0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* renamed from: com.google.android.gms.location.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36781b extends com.google.android.gms.common.api.j<C36616a.d.C10620d> {
    @j.N
    @a0
    Task<Location> getLastLocation();

    @j.N
    Task<Void> removeLocationUpdates(@j.N LocationCallback locationCallback);

    @j.N
    @a0
    Task<Void> requestLocationUpdates(@j.N LocationRequest locationRequest, @j.N LocationCallback locationCallback, @j.P Looper looper);
}
