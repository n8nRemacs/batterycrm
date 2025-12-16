package com.avito.android.extended_profile_widgets.adapter.map;

import Y41.l;
import Y61.k;
import com.avito.android.avito_map.AvitoMapTarget;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MapItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/map/e;", "Lcom/avito/android/extended_profile_widgets/adapter/map/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154555b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public g f154556c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super oB.k, G0> lVar) {
        this.f154555b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        MapItem mapItem = (MapItem) aVar;
        this.f154556c = gVar;
        gVar.MT(mapItem, this, this, new d(this, mapItem));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.c
    public final void onDestroyView() {
        g gVar = this.f154556c;
        if (gVar != null) {
            gVar.onDestroyView();
        }
        this.f154556c = null;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.c
    public final void onLowMemory() {
        g gVar = this.f154556c;
        if (gVar != null) {
            gVar.onLowMemory();
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.c
    public final void onStart() {
        g gVar = this.f154556c;
        if (gVar != null) {
            gVar.onStart();
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.c
    public final void onStop() {
        g gVar = this.f154556c;
        if (gVar != null) {
            gVar.onStop();
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
    public final void onMapClicked(@k AvitoMapTarget avitoMapTarget) {
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
    public final void onMarkerClicked(@Y61.l Object obj) {
    }
}
