package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import com.avito.android.remote.model.SubscribeInfo;
import com.avito.android.remote.model.SubscribeInfoKt;
import com.avito.android.remote.model.SubscribeResult;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$subscribeTo$1", f = "RecommendationItemPresenter.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class w extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f155700q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SellerCarouselItem f155701r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f155702s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f155703t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SellerCarouselItem sellerCarouselItem, i iVar, String str, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f155701r = sellerCarouselItem;
        this.f155702s = iVar;
        this.f155703t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new w(this.f155701r, this.f155702s, this.f155703t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f155700q;
        i iVar = this.f155702s;
        SellerCarouselItem sellerCarouselItem = this.f155701r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                sellerCarouselItem.f155474l = true;
                int i13 = i.f155650t;
                iVar.V(sellerCarouselItem);
                InterfaceC30576b interfaceC30576b = iVar.f155651b;
                String str = this.f155703t;
                SubscriptionSource subscriptionSource = iVar.f155657h;
                this.f155700q = 1;
                obj = interfaceC30576b.c(str, subscriptionSource, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            SubscribeInfo subscribeInfo = SubscribeInfoKt.toSubscribeInfo((SubscribeResult) obj);
            sellerCarouselItem.f155474l = false;
            sellerCarouselItem.f155473k = true;
            sellerCarouselItem.f155475m = subscribeInfo.isNotificationsActivated();
            int i14 = i.f155650t;
            iVar.V(sellerCarouselItem);
            i.O(iVar, sellerCarouselItem);
            String str2 = sellerCarouselItem.f155465c;
            C43238h c43238h = iVar.f155668s;
            Q0.d(c43238h.f411905b);
            C43259k.d(c43238h, null, null, new v(iVar, str2, null), 3);
            iVar.f155665p = null;
            sellerCarouselItem.f155474l = false;
        } catch (Throwable th2) {
            try {
                if (!(th2 instanceof CancellationException)) {
                    i.k(iVar, th2, sellerCarouselItem);
                }
                sellerCarouselItem.f155474l = false;
                int i15 = i.f155650t;
            } catch (Throwable th3) {
                sellerCarouselItem.f155474l = false;
                int i16 = i.f155650t;
                iVar.V(sellerCarouselItem);
                throw th3;
            }
        }
        iVar.V(sellerCarouselItem);
        return G0.f406611a;
    }
}
