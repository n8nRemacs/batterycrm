package com.avito.android.map.view;

import android.os.Parcelable;
import bY.InterfaceC25585b;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerWithIdAndContext;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MapViewInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/A;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements AvitoMap.MarkerClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f185330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25585b, G0> f185331c;

    /* JADX WARN: Multi-variable type inference failed */
    public A(C c12, Y41.l<? super InterfaceC25585b, G0> lVar) {
        this.f185330b = c12;
        this.f185331c = lVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
    public final void onMarkerClicked(@Y61.l Object obj) {
        Parcelable parcelable = obj instanceof MarkerItem ? (MarkerItem) obj : null;
        if (parcelable == null || !(parcelable instanceof MarkerWithIdAndContext)) {
            return;
        }
        C c12 = this.f185330b;
        if (c12.f185348p) {
            return;
        }
        this.f185331c.invoke(new InterfaceC25585b.t((MarkerWithIdAndContext) parcelable));
        c12.f185351s = true;
    }
}
