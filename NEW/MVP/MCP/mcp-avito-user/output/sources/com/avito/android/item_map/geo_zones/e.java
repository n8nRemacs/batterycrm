package com.avito.android.item_map.geo_zones;

import com.avito.android.util.P2;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.K;
import sO.InterfaceC48083a;
import tO.C48586c;

/* compiled from: GeoZonesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/geo_zones/e;", "Lcom/avito/android/item_map/geo_zones/a;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48083a f173349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f173350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f173351c;

    @Inject
    public e(@Y61.k InterfaceC48083a interfaceC48083a, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k R0 r02) {
        this.f173349a = interfaceC48083a;
        this.f173350b = fVar;
        this.f173351c = r02;
    }

    @Override // com.avito.android.item_map.geo_zones.a
    @Y61.k
    public final L0 a(@Y61.k String str, @Y61.l List list, @Y61.l List list2) {
        return K.a(this.f173351c.a(), new b(this, new C48586c(list, str, list2), null)).d0(new com.avito.android.blueprints.publish.reg_number.d(4, c.f173347l)).r0(P2.c.f318721a).m0(new com.avito.android.blueprints.publish.reg_number.d(5, new d(this)));
    }
}
