package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import oB.z;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_widgets.adapter.search.search_bar.SearchBarItemPresenterImpl$bindView$1$3", f = "SearchBarItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class g extends SuspendLambda implements p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SearchBarItem f154752q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f154753r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SearchBarItem searchBarItem, d dVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f154752q = searchBarItem;
        this.f154753r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f154752q, this.f154753r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((g) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (this.f154752q.f154738f) {
            this.f154753r.f154745b.invoke(z.b.c.f419545b);
        }
        return G0.f406611a;
    }
}
