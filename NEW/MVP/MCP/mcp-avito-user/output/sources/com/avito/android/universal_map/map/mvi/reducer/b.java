package com.avito.android.universal_map.map.mvi.reducer;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContextDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/reducer/b;", "Lcom/avito/android/universal_map/map/mvi/reducer/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.common.marker.j f305675a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AvitoMarkerIconFactory f305676b;

    @Inject
    public b(@Y61.k com.avito.android.universal_map.map.common.marker.j jVar, @Y61.k AvitoMarkerIconFactory avitoMarkerIconFactory) {
        this.f305675a = jVar;
        this.f305676b = avitoMarkerIconFactory;
    }

    @Override // com.avito.android.universal_map.map.mvi.reducer.a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AvitoMarkerIconFactory getF305676b() {
        return this.f305676b;
    }

    @Override // com.avito.android.universal_map.map.mvi.reducer.a
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.avito.android.universal_map.map.common.marker.j getF305675a() {
        return this.f305675a;
    }
}
