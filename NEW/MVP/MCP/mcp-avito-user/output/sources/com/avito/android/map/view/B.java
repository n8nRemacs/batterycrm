package com.avito.android.map.view;

import bY.InterfaceC25585b;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapTarget;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MapViewInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/B;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B implements AvitoMap.MapClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25585b, G0> f185332b;

    /* JADX WARN: Multi-variable type inference failed */
    public B(Y41.l<? super InterfaceC25585b, G0> lVar) {
        this.f185332b = lVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
    public final void onMapClicked(@Y61.k AvitoMapTarget avitoMapTarget) {
        this.f185332b.invoke(InterfaceC25585b.p.f57149a);
    }
}
