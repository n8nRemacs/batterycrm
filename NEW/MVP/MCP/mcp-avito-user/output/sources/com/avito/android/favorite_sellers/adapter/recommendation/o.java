package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.InterfaceC32897n0;
import com.avito.android.favorite_sellers.RecommendationItem;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationItemPresenterImpl$attachView$3", f = "RecommendationItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class o extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i f155679q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f155679q = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f155679q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((o) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        i iVar = this.f155679q;
        Map<String, InterfaceC32897n0> mapM = iVar.f155652c.m();
        Collection<RecommendationItem> collectionValues = iVar.f155661l.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            C42745f0.h(((RecommendationItem) it.next()).f155460c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof SellerCarouselItem) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SellerCarouselItem sellerCarouselItem = (SellerCarouselItem) it3.next();
            InterfaceC32897n0 interfaceC32897n0 = mapM.get(sellerCarouselItem.f155466d);
            if (interfaceC32897n0 != null) {
                sellerCarouselItem.f155473k = interfaceC32897n0.getF155497f();
                sellerCarouselItem.f155475m = interfaceC32897n0.getF155498g();
                iVar.V(sellerCarouselItem);
            }
        }
        return G0.f406611a;
    }
}
