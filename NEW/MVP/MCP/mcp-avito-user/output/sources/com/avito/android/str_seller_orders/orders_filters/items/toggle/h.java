package com.avito.android.str_seller_orders.orders_filters.items.toggle;

import Y41.l;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qz0.InterfaceC47467a;

/* compiled from: StrOrdersFiltersTogglePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/h;", "LTV0/f;", "Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/j;", "Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements TV0.f<j, e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC47467a, G0> f289181b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super InterfaceC47467a, G0> lVar) {
        this.f289181b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        e eVar2 = (e) aVar;
        jVar.MP(eVar2.f289176c);
        jVar.S(new g(this, eVar2));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        e eVar2 = (e) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof f) {
                obj = obj2;
            }
        }
        f fVar = (f) (obj instanceof f ? obj : null);
        if (fVar == null) {
            jVar.MP(eVar2.f289176c);
            jVar.S(new g(this, eVar2));
        } else {
            kV.b bVar = fVar.f289178a;
            if (bVar != null) {
                jVar.MP(bVar);
            }
            jVar.S(new g(this, eVar2));
        }
    }
}
