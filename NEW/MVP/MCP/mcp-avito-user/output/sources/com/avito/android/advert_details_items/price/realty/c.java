package com.avito.android.advert_details_items.price.realty;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.favorite.AbstractC30569c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/favorite/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_details_items.price.realty.AdvertDetailsNormalizedAndHistoryPricesPresenter$bindPriceHistory$1", f = "AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class c extends SuspendLambda implements p<AbstractC30569c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f85235q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f85236r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f85236r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f85236r, continuation);
        cVar.f85235q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC30569c abstractC30569c, Continuation<? super G0> continuation) {
        return ((c) create(abstractC30569c, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f85236r.f85243e = ((AbstractC30569c) this.f85235q) instanceof AbstractC30569c.a;
        return G0.f406611a;
    }
}
