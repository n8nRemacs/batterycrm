package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.favorite_sellers.SellerCarouselItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: RecommendationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$attachView$1$1", f = "RecommendationItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class k extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i f155674q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f155674q = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f155674q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((k) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.subscriptions_settings.d dVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        i iVar = this.f155674q;
        SellerCarouselItem sellerCarouselItem = iVar.f155664o;
        if (sellerCarouselItem != null && (dVar = iVar.f155662m) != null) {
            if (iVar.f155654e.b()) {
                if (sellerCarouselItem.f155475m != null) {
                    C43259k.d(iVar.f155667r, null, null, new t(dVar, iVar, sellerCarouselItem.f155466d, !r0.booleanValue(), sellerCarouselItem, null), 3);
                }
            } else {
                s sVar = new s(iVar);
                dVar.getClass();
                ru.avito.component.dialog.c.f430348a.getClass();
                ru.avito.component.dialog.c.a(dVar.f291500b, sVar);
            }
        }
        return G0.f406611a;
    }
}
