package com.avito.android.map_core.view;

import Y41.l;
import Y61.k;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MapAsyncProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/b;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements AvitoMapAttachHelper.MapAttachListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<AvitoMap, G0> f185696b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super AvitoMap, G0> lVar) {
        this.f185696b = lVar;
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@k AvitoMap avitoMap) {
        this.f185696b.invoke(avitoMap);
    }
}
