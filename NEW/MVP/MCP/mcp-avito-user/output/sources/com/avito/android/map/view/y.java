package com.avito.android.map.view;

import bY.InterfaceC25585b;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.google.AvitoGoogleMapKt;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: MapViewInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/y;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y implements AvitoMap.MapMoveEndListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f185574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25585b, G0> f185575c;

    /* JADX WARN: Multi-variable type inference failed */
    public y(C c12, Y41.l<? super InterfaceC25585b, G0> lVar) {
        this.f185574b = c12;
        this.f185575c = lVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
        AvitoMap value;
        AvitoMapCameraPosition mapCameraPosition;
        AvitoMapBounds viewportBounds;
        C c12 = this.f185574b;
        c12.f185348p = false;
        if (c12.f185347o) {
            c12.f185347o = false;
            return;
        }
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = c12.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null || (mapCameraPosition = value.getMapCameraPosition()) == null || (viewportBounds = mapCameraPosition.getViewportBounds()) == null) {
            return;
        }
        float zoomLevel = mapCameraPosition.getZoomLevel();
        LatLngBounds latLngBounds = AvitoGoogleMapKt.toLatLngBounds(viewportBounds);
        if (!c12.f185349q || c12.f185346n) {
            this.f185575c.invoke(new InterfaceC25585b.r(latLngBounds, zoomLevel, c12.f185346n));
        }
        c12.f185344l = latLngBounds;
        c12.f185349q = false;
    }
}
