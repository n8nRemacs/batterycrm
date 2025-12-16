package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$changeNotifications$2", f = "RecommendationItemPresenter.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f155688q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.subscriptions_settings.d f155689r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f155690s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f155691t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f155692u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SellerCarouselItem f155693v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.avito.android.subscriptions_settings.d dVar, i iVar, String str, boolean z12, SellerCarouselItem sellerCarouselItem, Continuation continuation) {
        super(2, continuation);
        this.f155689r = dVar;
        this.f155690s = iVar;
        this.f155691t = str;
        this.f155692u = z12;
        this.f155693v = sellerCarouselItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t(this.f155689r, this.f155690s, this.f155691t, this.f155692u, this.f155693v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f155688q;
        com.avito.android.subscriptions_settings.d dVar = this.f155689r;
        SellerCarouselItem sellerCarouselItem = this.f155693v;
        boolean z12 = this.f155692u;
        i iVar = this.f155690s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                dVar.e(true);
                InterfaceC30576b interfaceC30576b = iVar.f155651b;
                String str = this.f155691t;
                SubscriptionSource subscriptionSource = iVar.f155657h;
                this.f155688q = 1;
                if (interfaceC30576b.a(str, z12, subscriptionSource, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            dVar.d(z12);
            sellerCarouselItem.f155475m = Boxing.boxBoolean(z12);
            i.O(iVar, sellerCarouselItem);
        } finally {
            try {
                return G0.f406611a;
            } finally {
            }
        }
        return G0.f406611a;
    }
}
