package com.avito.android.location.find;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.location.Location;
import com.avito.android.util.V2;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.InterfaceC36781b;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FusedLocationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location/find/u;", "Lcom/avito/android/location/find/r;", "Lcom/google/android/gms/location/LocationCallback;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u extends LocationCallback implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.j f181771a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public K<Location> f181772b;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public InterfaceC36781b f181773p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public WeakReference<Activity> f181774q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final LocationRequest f181775r;

    @Inject
    public u(@Y61.k com.avito.android.geo.j jVar) {
        this.f181771a = jVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        LocationRequest.a aVar = new LocationRequest.a(102, timeUnit.convert(10L, timeUnit2));
        long jConvert = timeUnit.convert(5L, timeUnit2);
        boolean z12 = true;
        if (jConvert != -1 && jConvert < 0) {
            z12 = false;
        }
        C36729v.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z12);
        aVar.f354237c = jConvert;
        this.f181775r = aVar.a();
    }

    @Override // com.avito.android.location.find.r
    @Y61.k
    @SuppressLint({"MissingPermission"})
    public final C42006d a(boolean z12) {
        return new C42006d(new s(this, z12));
    }

    public final void b(Location location) {
        if (location == null) {
            return;
        }
        this.f181771a.m(location);
        V2.f318762a.b("Get fused Coordinates: " + location, null);
        K<Location> k12 = this.f181772b;
        if (k12 != null) {
            k12.onSuccess(location);
        }
    }

    @Override // com.avito.android.location.find.r
    public final void d(@Y61.k Activity activity) {
        this.f181774q = new WeakReference<>(activity);
    }

    @Override // com.avito.android.location.find.r
    public final boolean e() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f181774q;
        return (weakReference == null || (activity = weakReference.get()) == null || C36687f.f349287e.c(C36688g.f349288a, activity) != 0) ? false : true;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(@Y61.k LocationAvailability locationAvailability) {
        K<Location> k12;
        if (locationAvailability.f354218e >= 1000 && (k12 = this.f181772b) != null) {
            k12.onError(new IllegalStateException("location is not available"));
        }
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(@Y61.k LocationResult locationResult) {
        b(locationResult.h());
    }
}
