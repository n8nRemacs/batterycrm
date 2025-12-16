package com.avito.android.active_orders_common.items.comfortable_deal;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComfortableDealItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/f;", "Lcom/avito/android/active_orders_common/items/comfortable_deal/d;", "<init>", "()V", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f68338b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ComfortableDealOrderItem comfortableDealOrderItem = (ComfortableDealOrderItem) aVar;
        Y41.l<? super DeepLink, G0> lVar = this.f68338b;
        if (lVar != null) {
            lVar.invoke(comfortableDealOrderItem.getOnShowDeeplink());
        }
        hVar.setTitle(comfortableDealOrderItem.getTitle());
        hVar.g(comfortableDealOrderItem.getDescription());
        hVar.KR(comfortableDealOrderItem.b4());
        hVar.qf(comfortableDealOrderItem.v0());
        hVar.x70(comfortableDealOrderItem.H1(), comfortableDealOrderItem.u2());
        hVar.a(new e(comfortableDealOrderItem, this));
    }
}
