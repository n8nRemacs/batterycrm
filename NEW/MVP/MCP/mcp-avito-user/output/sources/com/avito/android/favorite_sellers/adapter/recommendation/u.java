package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class u extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApiError f155694l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f155695m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SellerCarouselItem f155696n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ApiError apiError, i iVar, SellerCarouselItem sellerCarouselItem) {
        super(0);
        this.f155694l = apiError;
        this.f155695m = iVar;
        this.f155696n = sellerCarouselItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Action action;
        DeepLink deepLink;
        List<Action> actions = ((ApiError.ErrorDialog) this.f155694l).getUserDialog().getActions();
        if (actions != null && (action = actions.get(0)) != null && (deepLink = action.getDeepLink()) != null) {
            i iVar = this.f155695m;
            iVar.f155665p = this.f155696n;
            b.a.a(iVar.f155659j, deepLink, "req_key_recommendation_presenter", null, 4);
        }
        return G0.f406611a;
    }
}
