package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.favorite_sellers.SellerCarouselItem;
import jc.C42353b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import vC.e;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvC/b;", "action", "Lkotlin/G0;", "<anonymous>", "(LvC/b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$attachView$2", f = "RecommendationItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class n extends SuspendLambda implements Y41.p<vC.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f155677q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f155678r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f155678r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f155678r, continuation);
        nVar.f155677q = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(vC.b bVar, Continuation<? super G0> continuation) {
        return ((n) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        vC.b bVar = (vC.b) this.f155677q;
        boolean z12 = bVar instanceof e.b;
        i iVar = this.f155678r;
        if (z12) {
            e.b bVar2 = (e.b) bVar;
            iVar.f155656g.c(new C42353b(bVar2.f440541a.f155466d, iVar.f155657h));
            SellerCarouselItem sellerCarouselItem = bVar2.f440541a;
            C43259k.d(iVar.f155667r, null, null, new w(sellerCarouselItem, iVar, sellerCarouselItem.f155466d, null), 3);
        } else if (bVar instanceof e.a) {
            SellerCarouselItem sellerCarouselItem2 = ((e.a) bVar).f440540a;
            int i12 = i.f155650t;
            iVar.f155664o = sellerCarouselItem2;
            com.avito.android.subscriptions_settings.d dVar = iVar.f155662m;
            if (dVar != null) {
                Boolean bool = sellerCarouselItem2.f155475m;
                dVar.d(bool != null ? bool.booleanValue() : false);
                dVar.c();
            }
        }
        iVar.f3();
        return G0.f406611a;
    }
}
