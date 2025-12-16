package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list;

import Y61.k;
import com.avito.android.imv_cars_details.di.o;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsNeighborsListPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/c;", "LTV0/d;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/e;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/ImvCarsDetailsNeighborsListItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements TV0.d<e, ImvCarsDetailsNeighborsListItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f170129b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f170130c;

    @Inject
    public c(@o @k com.avito.konveyor.adapter.a aVar, @o @k j jVar) {
        this.f170129b = aVar;
        this.f170130c = jVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        ImvCarsDetailsNeighborsListItem imvCarsDetailsNeighborsListItem = (ImvCarsDetailsNeighborsListItem) aVar;
        eVar2.b(imvCarsDetailsNeighborsListItem.f170121c);
        this.f170129b.c(new UV0.c(imvCarsDetailsNeighborsListItem.f170122d));
        this.f170130c.notifyDataSetChanged();
        eVar2.oZ();
    }
}
