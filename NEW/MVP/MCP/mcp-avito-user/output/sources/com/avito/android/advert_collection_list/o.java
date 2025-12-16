package com.avito.android.advert_collection_list;

import Q7.a;
import com.avito.android.advert_collection_list.AdvertCollectionListFragment;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertCollectionListStateRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert_collection_list/adapter/advert_collection/AdvertCollectionItem;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection_list.AdvertCollectionListStateRenderer$init$1$4", f = "AdvertCollectionListStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class o extends SuspendLambda implements Y41.p<AdvertCollectionItem, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f82300q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Q7.a, G0> f82301r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Y41.l<? super Q7.a, G0> lVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f82301r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f82301r, continuation);
        oVar.f82300q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(AdvertCollectionItem advertCollectionItem, Continuation<? super G0> continuation) {
        return ((o) create(advertCollectionItem, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((AdvertCollectionListFragment.a) this.f82301r).invoke(new a.h((AdvertCollectionItem) this.f82300q));
        return G0.f406611a;
    }
}
