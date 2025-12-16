package com.avito.android.item_map.routes;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import vO.InterfaceC49241a;

/* compiled from: RoutesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/h;", "Lcom/avito/android/item_map/routes/e;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49241a f173385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f173386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173387c;

    @Inject
    public h(@Y61.k InterfaceC49241a interfaceC49241a, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f173385a = interfaceC49241a;
        this.f173386b = fVar;
        this.f173387c = interfaceC35745a5;
    }

    @Override // com.avito.android.item_map.routes.e
    @Y61.k
    public final C41982q1 a(@Y61.k AvitoMapPoint avitoMapPoint) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(avitoMapPoint.getLatitude());
        sb2.append(',');
        sb2.append(avitoMapPoint.getLongitude());
        linkedHashMap.put("end", sb2.toString());
        return this.f173385a.b(P0.q(linkedHashMap)).d0(new com.avito.android.blueprints.publish.reg_number.d(6, f.f173383l)).r0(P2.c.f318721a).m0(new com.avito.android.blueprints.publish.reg_number.d(7, new g(this))).x0(this.f173387c.a());
    }
}
