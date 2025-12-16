package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.deep_linking.RetrySellerSubscriptionLink;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.internal.C43238h;
import kv.C43501a;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$attachView$5", f = "RecommendationItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class p extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f155680q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f155681r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i iVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f155681r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f155681r, continuation);
        pVar.f155680q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((p) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f155680q;
        int i12 = i.f155650t;
        i iVar = this.f155681r;
        iVar.getClass();
        if (c43501a.f413261b instanceof RetrySellerSubscriptionLink.b) {
            SellerCarouselItem sellerCarouselItem = iVar.f155665p;
            if (sellerCarouselItem != null) {
                C43259k.d(iVar.f155667r, null, null, new w(sellerCarouselItem, iVar, sellerCarouselItem.f155466d, null), 3);
            }
        } else {
            SellerCarouselItem sellerCarouselItem2 = iVar.f155665p;
            if (sellerCarouselItem2 != null) {
                sellerCarouselItem2.f155474l = false;
                iVar.V(sellerCarouselItem2);
                C43238h c43238h = iVar.f155668s;
                Q0.d(c43238h.f411905b);
                C43259k.d(c43238h, null, null, new v(iVar, sellerCarouselItem2.f155465c, null), 3);
                iVar.f155665p = null;
            }
        }
        return G0.f406611a;
    }
}
