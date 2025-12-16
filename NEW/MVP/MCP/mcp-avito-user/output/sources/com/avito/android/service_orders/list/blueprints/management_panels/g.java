package com.avito.android.service_orders.list.blueprints.management_panels;

import Y61.k;
import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrdersManagementPanelsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/management_panels/g;", "Lcom/avito/android/service_orders/list/blueprints/management_panels/c;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.service_orders.list.l f279322b;

    @Inject
    public g() {
    }

    @Override // com.avito.android.service_orders.list.blueprints.management_panels.c
    public final void F1(@k com.avito.android.service_orders.list.l lVar) {
        this.f279322b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        com.avito.android.service_orders.list.blueprints.f fVar = (com.avito.android.service_orders.list.blueprints.f) aVar;
        iVar.Oo(fVar.f279304d);
        iVar.t40(fVar.f279305e);
        iVar.tM(fVar.f279306f);
        iVar.E40(new d(this, fVar));
        iVar.ZM(new e(this, fVar));
        iVar.yC(new f(this, fVar));
    }

    @Override // com.avito.android.service_orders.list.blueprints.management_panels.c
    public final void e() {
        this.f279322b = null;
    }
}
