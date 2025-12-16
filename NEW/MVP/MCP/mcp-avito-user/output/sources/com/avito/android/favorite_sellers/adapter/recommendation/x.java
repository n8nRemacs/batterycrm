package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import java.util.concurrent.CancellationException;
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
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$unsubscribeFrom$1", f = "RecommendationItemPresenter.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class x extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f155704q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f155705r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f155706s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SellerCarouselItem f155707t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SellerCarouselItem sellerCarouselItem, i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f155705r = iVar;
        this.f155706s = str;
        this.f155707t = sellerCarouselItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new x(this.f155707t, this.f155705r, this.f155706s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((x) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f155704q;
        SellerCarouselItem sellerCarouselItem = this.f155707t;
        i iVar = this.f155705r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.subscriptions_settings.d dVar = iVar.f155662m;
                if (dVar != null) {
                    dVar.f(true);
                }
                InterfaceC30576b interfaceC30576b = iVar.f155651b;
                String str = this.f155706s;
                SubscriptionSource subscriptionSource = iVar.f155657h;
                this.f155704q = 1;
                if (interfaceC30576b.d(str, subscriptionSource, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            sellerCarouselItem.f155473k = false;
            sellerCarouselItem.f155475m = null;
            i.O(iVar, sellerCarouselItem);
            com.avito.android.subscriptions_settings.d dVar2 = iVar.f155662m;
            if (dVar2 != null) {
                Boxing.boxBoolean(dVar2.b());
            }
        } catch (Throwable th2) {
            try {
                if (!(th2 instanceof CancellationException)) {
                    i.k(iVar, th2, sellerCarouselItem);
                }
                com.avito.android.subscriptions_settings.d dVar3 = iVar.f155662m;
                if (dVar3 != null) {
                }
            } finally {
                com.avito.android.subscriptions_settings.d dVar4 = iVar.f155662m;
                if (dVar4 != null) {
                    dVar4.f(false);
                }
                iVar.V(sellerCarouselItem);
            }
        }
        return G0.f406611a;
    }
}
