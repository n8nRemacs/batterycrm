package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import jc.C42354c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$attachView$1$2", f = "RecommendationItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class l extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i f155675q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f155675q = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f155675q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((l) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        i iVar = this.f155675q;
        SellerCarouselItem sellerCarouselItem = iVar.f155664o;
        if (sellerCarouselItem != null) {
            SubscriptionSource subscriptionSource = iVar.f155657h;
            String str = sellerCarouselItem.f155466d;
            iVar.f155656g.c(new C42354c(str, subscriptionSource));
            C43259k.d(iVar.f155667r, null, null, new x(sellerCarouselItem, iVar, str, null), 3);
        }
        return G0.f406611a;
    }
}
