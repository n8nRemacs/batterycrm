package com.avito.android.advert.item.sellersubscription;

import Ca.AbstractC13232a;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import kotlin.Metadata;

/* compiled from: SellerSubscriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCa/a;", "action", "Lkotlin/G0;", "accept", "(LCa/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionPresenterImpl f79775b;

    public v(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl) {
        this.f79775b = sellerSubscriptionPresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC13232a abstractC13232a = (AbstractC13232a) obj;
        boolean z12 = abstractC13232a instanceof AbstractC13232a.b;
        SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79775b;
        if (z12) {
            SellerSubscriptionPresenterImpl.g(sellerSubscriptionPresenterImpl, ((AbstractC13232a.b) abstractC13232a).f2249a);
            return;
        }
        if (abstractC13232a instanceof AbstractC13232a.C0114a) {
            SellerSubscriptionItem sellerSubscriptionItem = ((AbstractC13232a.C0114a) abstractC13232a).f2248a;
            sellerSubscriptionPresenterImpl.f79699r = sellerSubscriptionItem;
            com.avito.android.subscriptions_settings.d dVar = sellerSubscriptionPresenterImpl.f79694m;
            if (dVar != null) {
                dVar.d(sellerSubscriptionItem.getF85537g() == SellerNotificationsState.f85635b);
                dVar.c();
            }
        }
    }
}
