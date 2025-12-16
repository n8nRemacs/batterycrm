package com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters;

import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import yz0.InterfaceC50328b;

/* compiled from: InlineFiltersItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/inline_filters/g;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/inline_filters/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC50328b, G0> f290006b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC50328b, G0> lVar) {
        this.f290006b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        ArrayList arrayList = bVar.f289999b;
        iVar.setFilters(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((a) next).f289997b, bVar.f290000c.f289997b)) {
                    break;
                }
            }
        }
        a aVar2 = (a) next;
        if (aVar2 != null) {
            iVar.Av(aVar2);
        }
        iVar.jc(new f(this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        Object next;
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        ArrayList arrayList = bVar.f289999b;
        iVar.setFilters(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((a) next).f289997b, bVar.f290000c.f289997b)) {
                    break;
                }
            }
        }
        a aVar2 = (a) next;
        if (aVar2 != null) {
            iVar.Av(aVar2);
        }
    }
}
