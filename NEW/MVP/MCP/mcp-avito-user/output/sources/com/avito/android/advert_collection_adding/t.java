package com.avito.android.advert_collection_adding;

import L7.a;
import com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog;
import com.avito.android.advert_collection_adding.adapter.advert_collection.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertCollectionAddingStateRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/adapter/advert_collection/c$a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert_collection_adding/adapter/advert_collection/c$a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingStateRenderer$init$1$1", f = "AdvertCollectionAddingStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class t extends SuspendLambda implements Y41.p<c.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f81946q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<L7.a, G0> f81947r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Y41.l<? super L7.a, G0> lVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f81947r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f81947r, continuation);
        tVar.f81946q = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(c.a aVar, Continuation<? super G0> continuation) {
        return ((t) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        c.a aVar = (c.a) this.f81946q;
        ((AdvertCollectionAddingDialog.c) this.f81947r).invoke(new a.c(aVar.f81761a, aVar.f81762b));
        return G0.f406611a;
    }
}
