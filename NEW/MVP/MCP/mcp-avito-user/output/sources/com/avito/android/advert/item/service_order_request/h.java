package com.avito.android.advert.item.service_order_request;

import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.advert.item.service_order_request.q;
import kotlin.Metadata;

/* compiled from: ServiceOrderRequestItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/q;", "status", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advert/item/service_order_request/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f79901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ServiceOrderRequestItem f79902d;

    public h(d dVar, j jVar, ServiceOrderRequestItem serviceOrderRequestItem) {
        this.f79900b = dVar;
        this.f79901c = jVar;
        this.f79902d = serviceOrderRequestItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        q qVar = (q) obj;
        boolean z12 = qVar instanceof q.c;
        d dVar = this.f79900b;
        ServiceOrderRequestItem serviceOrderRequestItem = this.f79902d;
        j jVar = this.f79901c;
        if (z12) {
            serviceOrderRequestItem.f79871d = (ServiceOrderRequestItem.Action) new e(qVar).invoke(serviceOrderRequestItem.f79871d);
            dVar.k(jVar, serviceOrderRequestItem);
        } else if (qVar instanceof q.a) {
            serviceOrderRequestItem.f79871d = (ServiceOrderRequestItem.Action) f.f79898l.invoke(serviceOrderRequestItem.f79871d);
            dVar.k(jVar, serviceOrderRequestItem);
        } else if (qVar instanceof q.b) {
            serviceOrderRequestItem.f79871d = (ServiceOrderRequestItem.Action) g.f79899l.invoke(serviceOrderRequestItem.f79871d);
            dVar.k(jVar, serviceOrderRequestItem);
        }
    }
}
