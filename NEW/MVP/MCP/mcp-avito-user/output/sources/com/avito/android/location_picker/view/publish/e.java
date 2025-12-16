package com.avito.android.location_picker.view.publish;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: PublishLocationPickerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/publish/e;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements AvitoMap.MapMoveEndListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f182740b;

    public e(b bVar) {
        this.f182740b = bVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
        AvitoMapBounds mapBounds;
        AvitoMapCameraPosition mapCameraPosition;
        b bVar = this.f182740b;
        AvitoMap avitoMap = bVar.f182711m;
        if (avitoMap != null && (mapCameraPosition = avitoMap.getMapCameraPosition()) != null) {
            bVar.f182724z.accept(mapCameraPosition);
        }
        AvitoMap avitoMap2 = bVar.f182711m;
        if (avitoMap2 != null && (mapBounds = avitoMap2.getMapBounds()) != null) {
            bVar.f182664A.accept(mapBounds);
            bVar.f182667D.accept(mapBounds);
        }
        if (!bVar.f182697e || D6.y(bVar.f182710l.f182751f)) {
            return;
        }
        bVar.f182714p.b();
    }
}
