package com.avito.android.location_picker.view;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import kotlin.Metadata;

/* compiled from: LocationPickerViewImplRedesign.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/S;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class S implements AvitoMap.MapMoveEndListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f182528b;

    public S(T t12) {
        this.f182528b = t12;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
        AvitoMapBounds mapBounds;
        AvitoMapCameraPosition mapCameraPosition;
        T t12 = this.f182528b;
        AvitoMap avitoMap = t12.f182610m;
        if (avitoMap != null && (mapCameraPosition = avitoMap.getMapCameraPosition()) != null) {
            t12.f182575O.accept(mapCameraPosition);
        }
        AvitoMap avitoMap2 = t12.f182610m;
        if (avitoMap2 != null && (mapBounds = avitoMap2.getMapBounds()) != null) {
            t12.f182576P.accept(mapBounds);
            t12.f182579S.accept(mapBounds);
        }
        if (t12.f182529v0) {
            com.avito.android.progress_overlay.l lVar = t12.f182563C;
            if (lVar.d()) {
                return;
            }
            lVar.j();
        }
    }
}
