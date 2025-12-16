package com.avito.android.service_order_map.serviceordermap;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceOrderMapView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/m;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements AvitoMap.MapMoveEndListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f278721b;

    public m(k kVar) {
        this.f278721b = kVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar;
        k kVar = this.f278721b;
        AvitoMap avitoMap = kVar.f278698o;
        if (avitoMap == null || avitoMap.getMapCameraPosition() == null || (lVar = kVar.f278699p) == null) {
            return;
        }
        ((a) lVar).invoke(new a.e(avitoMapCameraPosition.getMapPoint()));
    }
}
