package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/last_search_tooltip/a;", "it", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowLastSearchTooltip;", "<anonymous>", "(Lcom/avito/android/bxcontent/last_search_tooltip/a;)Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowLastSearchTooltip;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$1$2", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29196g extends SuspendLambda implements Y41.p<com.avito.android.bxcontent.last_search_tooltip.a, Continuation<? super BxContentInternalAction.ShowLastSearchTooltip>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112452q;

    public C29196g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29196g c29196g = new C29196g(2, continuation);
        c29196g.f112452q = obj;
        return c29196g;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.bxcontent.last_search_tooltip.a aVar, Continuation<? super BxContentInternalAction.ShowLastSearchTooltip> continuation) {
        return ((C29196g) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new BxContentInternalAction.ShowLastSearchTooltip((com.avito.android.bxcontent.last_search_tooltip.a) this.f112452q);
    }
}
