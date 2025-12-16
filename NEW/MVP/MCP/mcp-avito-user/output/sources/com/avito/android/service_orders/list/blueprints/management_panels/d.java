package com.avito.android.service_orders.list.blueprints.management_panels;

import com.avito.android.service_orders.list.blueprints.f;
import com.avito.android.service_orders.list.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrdersManagementPanelsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f279316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.service_orders.list.blueprints.f f279317m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, com.avito.android.service_orders.list.blueprints.f fVar) {
        super(0);
        this.f279316l = gVar;
        this.f279317m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l lVar = this.f279316l.f279322b;
        if (lVar != null) {
            f.a aVar = this.f279317m.f279304d;
            lVar.c(aVar != null ? aVar.f279310d : null);
        }
        return G0.f406611a;
    }
}
