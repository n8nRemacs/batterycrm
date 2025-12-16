package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.imv_cars_details.di.o;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvCarsDetailsNeighborsListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/a;", "LTV0/b;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/e;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/ImvCarsDetailsNeighborsListItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<e, ImvCarsDetailsNeighborsListItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f170123a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f170124b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f170125c = new g.a<>(R.layout.imv_cars_details_neighbors_list_item, new C5033a());

    /* compiled from: ImvCarsDetailsNeighborsListBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.a$a, reason: collision with other inner class name */
    public static final class C5033a extends N implements p<ViewGroup, View, f> {
        public C5033a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view, a.this.f170124b);
        }
    }

    @Inject
    public a(@k c cVar, @o @k j jVar) {
        this.f170123a = cVar;
        this.f170124b = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f170123a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f170125c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ImvCarsDetailsNeighborsListItem;
    }
}
