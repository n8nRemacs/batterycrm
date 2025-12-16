package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getContent$topSheet$1", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class J extends SuspendLambda implements Y41.p<BxContentInternalAction, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111368q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.h<SearchParams> f111369r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(l0.h<SearchParams> hVar, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f111369r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J j12 = new J(this.f111369r, continuation);
        j12.f111368q = obj;
        return j12;
    }

    @Override // Y41.p
    public final Object invoke(BxContentInternalAction bxContentInternalAction, Continuation<? super kotlin.G0> continuation) {
        return ((J) create(bxContentInternalAction, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.avito.android.remote.model.SearchParams] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        BxContentInternalAction bxContentInternalAction = (BxContentInternalAction) this.f111368q;
        if (bxContentInternalAction instanceof BxContentInternalAction.InlinesLoaded) {
            this.f111369r.f406842b = ((BxContentInternalAction.InlinesLoaded) bxContentInternalAction).f111908c;
        }
        return kotlin.G0.f406611a;
    }
}
