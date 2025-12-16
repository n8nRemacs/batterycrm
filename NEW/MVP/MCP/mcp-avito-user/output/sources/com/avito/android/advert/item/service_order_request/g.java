package com.avito.android.advert.item.service_order_request;

import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderRequestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/advert/item/service_order_request/ServiceOrderRequestItem$Action;", "action", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<ServiceOrderRequestItem.Action, ServiceOrderRequestItem.Action> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f79899l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final ServiceOrderRequestItem.Action invoke(ServiceOrderRequestItem.Action action) {
        return ServiceOrderRequestItem.Action.a(action, true);
    }
}
