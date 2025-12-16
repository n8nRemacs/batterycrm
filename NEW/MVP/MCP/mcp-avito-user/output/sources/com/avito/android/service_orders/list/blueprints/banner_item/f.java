package com.avito.android.service_orders.list.blueprints.banner_item;

import Y61.k;
import Y61.l;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersBannerItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.f2;

/* compiled from: ServiceOrdersBannerPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/banner_item/f;", "Lcom/avito/android/service_orders/list/blueprints/banner_item/c;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.service_orders.list.l f279265b;

    @Inject
    public f() {
        f2.b(0, 1, BufferOverflow.f410778c, 1);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ServiceOrdersBannerItem serviceOrdersBannerItem = (ServiceOrdersBannerItem) aVar;
        ((h) eVar).iX(serviceOrdersBannerItem, new d(this), new e(this, serviceOrdersBannerItem));
    }

    @Override // com.avito.android.service_orders.list.blueprints.banner_item.c
    public final void e() {
        this.f279265b = null;
    }

    @Override // com.avito.android.service_orders.list.blueprints.banner_item.c
    public final void t3(@k com.avito.android.service_orders.list.l lVar) {
        this.f279265b = lVar;
    }
}
