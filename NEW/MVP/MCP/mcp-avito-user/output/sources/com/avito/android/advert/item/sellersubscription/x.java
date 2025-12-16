package com.avito.android.advert.item.sellersubscription;

import Ju.InterfaceC14249c;
import com.avito.android.advert.item.W0;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.deep_linking.RetrySellerSubscriptionLink;
import com.avito.android.deep_linking.links.RefreshLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: SellerSubscriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionPresenterImpl f79777b;

    public x(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl) {
        this.f79777b = sellerSubscriptionPresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79777b;
        sellerSubscriptionPresenterImpl.getClass();
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (interfaceC14249c instanceof AuthenticateLink.b.C4024b) {
            W0 w02 = sellerSubscriptionPresenterImpl.f79695n;
            if (w02 != null) {
                w02.B0(((AuthenticateLink.b.C4024b) interfaceC14249c).f133887b);
                return;
            }
            return;
        }
        if (interfaceC14249c instanceof RetrySellerSubscriptionLink.b) {
            String str = ((RetrySellerSubscriptionLink.b) interfaceC14249c).f132870b;
            SellerSubscriptionItem sellerSubscriptionItem = sellerSubscriptionPresenterImpl.f79700s;
            if (sellerSubscriptionItem != null) {
                if (L.f(sellerSubscriptionItem.getF85535e(), str)) {
                    sellerSubscriptionPresenterImpl.n(sellerSubscriptionItem);
                }
                sellerSubscriptionPresenterImpl.f79700s = null;
                return;
            }
            return;
        }
        if (!(interfaceC14249c instanceof RefreshLink.c.a)) {
            sellerSubscriptionPresenterImpl.f79698q = null;
            return;
        }
        SellerSubscriptionItem sellerSubscriptionItem2 = sellerSubscriptionPresenterImpl.f79700s;
        if (sellerSubscriptionItem2 != null) {
            sellerSubscriptionPresenterImpl.p(sellerSubscriptionItem2);
            sellerSubscriptionPresenterImpl.f79700s = null;
        }
    }
}
