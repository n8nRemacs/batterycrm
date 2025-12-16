package com.avito.android.service_orders.list.blueprints.calendar_button_item;

import Mu0.InterfaceC14531a;
import com.avito.android.service_orders.list.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrdersListCalendarButtonPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f279281l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.service_orders.list.blueprints.a f279282m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.avito.android.service_orders.list.blueprints.a aVar) {
        super(0);
        this.f279281l = eVar;
        this.f279282m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l lVar = this.f279281l.f279284c;
        if (lVar != null) {
            lVar.f279388c.accept(new InterfaceC14531a.c(this.f279282m.f279257d));
        }
        return G0.f406611a;
    }
}
