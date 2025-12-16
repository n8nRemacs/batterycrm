package com.avito.android.advert.item.sellersubscription;

import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerSubscriptionPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class A extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApiError.ErrorDialog f79660l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionPresenterImpl f79661m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionItem f79662n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(ApiError.ErrorDialog errorDialog, SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem) {
        super(0);
        this.f79660l = errorDialog;
        this.f79661m = sellerSubscriptionPresenterImpl;
        this.f79662n = sellerSubscriptionItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Action action;
        DeepLink deepLink;
        List<Action> actions = this.f79660l.getUserDialog().getActions();
        if (actions != null && (action = actions.get(0)) != null && (deepLink = action.getDeepLink()) != null) {
            SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79661m;
            sellerSubscriptionPresenterImpl.f79700s = this.f79662n;
            b.a.a(sellerSubscriptionPresenterImpl.f79690i, deepLink, "adverts_seller_subscription_presenter", null, 4);
        }
        return G0.f406611a;
    }
}
