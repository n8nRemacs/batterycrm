package com.avito.android.messenger.map.viewing;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.C42001z;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: PlatformMapInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/viewing/v;", "Lcom/avito/android/messenger/map/viewing/t;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GeoMarker[] f196857a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f196858b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final MarkersRequest f196859c;

    @Inject
    public v(@Y61.k GeoMarker[] geoMarkerArr, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.l MarkersRequest markersRequest) {
        this.f196857a = geoMarkerArr;
        this.f196858b = interfaceC47842z;
        this.f196859c = markersRequest;
    }

    @Override // com.avito.android.messenger.map.viewing.t
    @Y61.k
    public final io.reactivex.rxjava3.core.z<GeoMarker[]> a() {
        C41998x0 c41998x0C0 = io.reactivex.rxjava3.core.z.c0(this.f196857a);
        MarkersRequest markersRequest = this.f196859c;
        if (markersRequest != null) {
            return new C42001z(c41998x0C0, this.f196858b.m(markersRequest).k(u.f196856b));
        }
        V2.f318762a.i("PlatformMapInteractor", "markersRequest == null, using initialGeoMarkers only", null);
        return c41998x0C0;
    }
}
