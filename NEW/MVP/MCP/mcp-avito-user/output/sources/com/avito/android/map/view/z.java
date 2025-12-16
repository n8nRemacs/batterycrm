package com.avito.android.map.view;

import bY.InterfaceC25585b;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMoveReason;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MapViewInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/z;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z implements AvitoMap.MapMoveStartListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f185576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25585b, G0> f185577c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(C c12, Y41.l<? super InterfaceC25585b, G0> lVar) {
        this.f185576b = c12;
        this.f185577c = lVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
    public final void onMapMoveStarted(@Y61.k AvitoMapMoveReason avitoMapMoveReason) {
        C c12 = this.f185576b;
        c12.f185348p = true;
        AvitoMapMoveReason avitoMapMoveReason2 = AvitoMapMoveReason.GESTURE;
        if (avitoMapMoveReason != avitoMapMoveReason2 && !c12.f185350r) {
            c12.f185346n = false;
            return;
        }
        this.f185577c.invoke(new InterfaceC25585b.q(c12.f185350r, avitoMapMoveReason == avitoMapMoveReason2));
        c12.f185350r = false;
        c12.f185346n = true;
    }
}
