package com.avito.android.advert.item.service_order_request;

import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.advert.item.service_order_request.q;
import com.avito.android.service_order_widget.domain.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderRequestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/advert/item/service_order_request/ServiceOrderRequestItem$Action;", "action", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements Y41.l<ServiceOrderRequestItem.Action, ServiceOrderRequestItem.Action> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f79897l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar) {
        super(1);
        this.f79897l = qVar;
    }

    @Override // Y41.l
    public final ServiceOrderRequestItem.Action invoke(ServiceOrderRequestItem.Action action) {
        f.a aVar = ((q.c) this.f79897l).f79947a;
        return new ServiceOrderRequestItem.Action(aVar.f278838a, aVar.f278840c, false);
    }
}
