package com.avito.android.advert_collection_list;

import Q7.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertCollectionListStateRenderer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListStateRenderer$init$1$6", f = "AdvertCollectionListStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class q extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Q7.a, G0> f82303q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Y41.l<? super Q7.a, G0> lVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f82303q = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f82303q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((q) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f82303q.invoke(a.f.f13513a);
        return G0.f406611a;
    }
}
