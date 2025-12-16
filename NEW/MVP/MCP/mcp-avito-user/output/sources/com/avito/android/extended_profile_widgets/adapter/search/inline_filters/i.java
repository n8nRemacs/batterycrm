package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InlineFiltersItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoB/k;", "it", "Lkotlin/G0;", "<anonymous>", "(LoB/k;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_widgets.adapter.search.inline_filters.InlineFiltersItemPresenterImpl$bindView$1$6", f = "InlineFiltersItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class i extends SuspendLambda implements p<oB.k, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f154663q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f154664r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f154664r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f154664r, continuation);
        iVar.f154663q = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(oB.k kVar, Continuation<? super G0> continuation) {
        return ((i) create(kVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f154664r.f154667b.invoke((oB.k) this.f154663q);
        return G0.f406611a;
    }
}
