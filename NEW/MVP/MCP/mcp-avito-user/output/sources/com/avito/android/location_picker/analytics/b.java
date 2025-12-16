package com.avito.android.location_picker.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: LocationPickerAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/analytics/b;", "Lcom/avito/android/location_picker/analytics/a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.location_picker.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f182209a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocationPickerScreenOpenEvent.EventSource f182210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f182211c = C42727D.c(a.f182212l);

    /* compiled from: LocationPickerAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f182212l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k LocationPickerScreenOpenEvent.EventSource eventSource) {
        this.f182209a = interfaceC28373a;
        this.f182210b = eventSource;
    }

    @Override // com.avito.android.location_picker.analytics.a
    public final void a(@k LocationPickerState locationPickerState) {
        Long distanceInMeters;
        Coordinates coordinates;
        RadiusViewState radiusViewState = locationPickerState.f182375t;
        SearchParams searchParams = radiusViewState.f182393n;
        String str = (String) this.f182211c.getValue();
        String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
        String locationId = searchParams != null ? searchParams.getLocationId() : null;
        List<String> directionId = searchParams != null ? searchParams.getDirectionId() : null;
        List<String> metroIds = searchParams != null ? searchParams.getMetroIds() : null;
        List<String> districtId = searchParams != null ? searchParams.getDistrictId() : null;
        Radius radius = radiusViewState.f182395p;
        this.f182209a.c(new LocationPickerScreenOpenEvent(str, categoryId, locationId, directionId, metroIds, districtId, (radius == null || (coordinates = radius.getCoordinates()) == null) ? null : C42745f0.U(String.valueOf(coordinates.getLatitude()), String.valueOf(coordinates.getLongitude()), "0", String.valueOf(System.currentTimeMillis())), (radius == null || (distanceInMeters = radius.getDistanceInMeters()) == null) ? null : Long.valueOf(distanceInMeters.longValue() / 1000), this.f182210b));
    }

    @Override // com.avito.android.location_picker.analytics.a
    public final void b(@k LocationPickerState locationPickerState, @k ScreenCloseFromBlock screenCloseFromBlock) {
        Object next;
        Long distanceInMeters;
        RadiusViewState radiusViewState = locationPickerState.f182375t;
        SearchParams searchParams = radiusViewState.f182393n;
        String str = (String) this.f182211c.getValue();
        String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
        String locationId = searchParams != null ? searchParams.getLocationId() : null;
        List<String> directionId = searchParams != null ? searchParams.getDirectionId() : null;
        List<String> metroIds = searchParams != null ? searchParams.getMetroIds() : null;
        List<String> districtId = searchParams != null ? searchParams.getDistrictId() : null;
        AvitoMapPoint avitoMapPoint = locationPickerState.f182358c;
        List listU = C42745f0.U(String.valueOf(avitoMapPoint.getLatitude()), String.valueOf(avitoMapPoint.getLongitude()));
        Iterator<T> it = radiusViewState.f182382c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Radius) next).getId(), radiusViewState.f182381b)) {
                    break;
                }
            }
        }
        Radius radius = (Radius) next;
        this.f182209a.c(new e(str, screenCloseFromBlock.f182208b, categoryId, locationId, directionId, metroIds, districtId, listU, (radius == null || (distanceInMeters = radius.getDistanceInMeters()) == null) ? null : Long.valueOf(distanceInMeters.longValue() / 1000)));
    }
}
