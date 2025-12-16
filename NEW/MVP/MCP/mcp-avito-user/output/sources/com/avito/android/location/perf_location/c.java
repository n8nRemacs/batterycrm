package com.avito.android.location.perf_location;

import android.location.Address;
import android.location.Geocoder$GeocodeListener;
import com.avito.android.analytics.statsd.y;
import com.avito.android.location.perf_location.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.SafeContinuation;

/* compiled from: AndroidGeocoderRegionProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/perf_location/c;", "Landroid/location/Geocoder$GeocodeListener;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements Geocoder$GeocodeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f181815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f181816b;

    public c(b bVar, SafeContinuation safeContinuation) {
        this.f181815a = bVar;
        this.f181816b = safeContinuation;
    }

    public final void onError(@Y61.l String str) {
        this.f181815a.f181814a.c(new y.a(b.a.a(b.f181813b, "location-failed-after-13"), 0L, 2, null));
        SafeContinuation safeContinuation = this.f181816b;
        int i12 = Z.f406624c;
        safeContinuation.resumeWith(new Z.b(new IllegalStateException(str)));
    }

    public final void onGeocode(@Y61.k List<Address> list) {
        Address address = (Address) C42745f0.G(list);
        if (address != null) {
            b bVar = this.f181815a;
            SafeContinuation safeContinuation = this.f181816b;
            bVar.f181814a.c(new y.a(b.a.a(b.f181813b, "success-after-13"), 0L, 2, null));
            int i12 = Z.f406624c;
            safeContinuation.resumeWith(address);
        }
    }
}
