package com.avito.android.service_orders.list.blueprints;

import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null) || !(aVar instanceof ServiceOrdersListSnippetItem) || !(aVar2 instanceof ServiceOrdersListSnippetItem)) {
            return null;
        }
        ServiceOrdersListSnippetItem serviceOrdersListSnippetItem = (ServiceOrdersListSnippetItem) aVar2;
        return new d(serviceOrdersListSnippetItem.f279233f, serviceOrdersListSnippetItem.f279234g, serviceOrdersListSnippetItem.f279235h, serviceOrdersListSnippetItem.f279238k, serviceOrdersListSnippetItem.f279239l, serviceOrdersListSnippetItem.f279240m, serviceOrdersListSnippetItem.f279237j);
    }
}
