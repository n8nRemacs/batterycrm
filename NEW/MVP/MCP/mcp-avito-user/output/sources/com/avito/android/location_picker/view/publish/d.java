package com.avito.android.location_picker.view.publish;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMoveReason;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishLocationPickerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/publish/d;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements AvitoMap.MapMoveStartListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f182739b;

    public d(b bVar) {
        this.f182739b = bVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
    public final void onMapMoveStarted(@Y61.k AvitoMapMoveReason avitoMapMoveReason) {
        AvitoMapMoveReason avitoMapMoveReason2 = AvitoMapMoveReason.GESTURE;
        b bVar = this.f182739b;
        if (avitoMapMoveReason == avitoMapMoveReason2) {
            bVar.f182723y.accept(G0.f406611a);
        }
        bVar.f182668E.accept(G0.f406611a);
    }
}
