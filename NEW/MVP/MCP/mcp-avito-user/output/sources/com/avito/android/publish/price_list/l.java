package com.avito.android.publish.price_list;

import com.avito.android.publish.price_list.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectPriceListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/publish/price_list/items/selectable/d;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeItemPresenterClicks$1$4", f = "SelectPriceListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements Y41.p<com.avito.android.publish.price_list.items.selectable.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f238766q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SelectPriceListFragment f238767r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SelectPriceListFragment selectPriceListFragment, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f238767r = selectPriceListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f238767r, continuation);
        lVar.f238766q = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.publish.price_list.items.selectable.d dVar, Continuation<? super G0> continuation) {
        return ((l) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        SelectPriceListFragment.q5(this.f238767r).accept(new a.h((com.avito.android.publish.price_list.items.selectable.d) this.f238766q));
        return G0.f406611a;
    }
}
