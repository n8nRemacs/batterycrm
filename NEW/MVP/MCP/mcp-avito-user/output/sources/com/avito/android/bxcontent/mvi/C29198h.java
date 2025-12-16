package com.avito.android.bxcontent.mvi;

import com.avito.android.analytics.statsd.y;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowLastSearchTooltip;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowLastSearchTooltip;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$1$4", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29198h extends SuspendLambda implements Y41.p<BxContentInternalAction.ShowLastSearchTooltip, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C29105a f112454q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29198h(C29105a c29105a, Continuation<? super C29198h> continuation) {
        super(2, continuation);
        this.f112454q = c29105a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29198h(this.f112454q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(BxContentInternalAction.ShowLastSearchTooltip showLastSearchTooltip, Continuation<? super kotlin.G0> continuation) {
        return ((C29198h) create(showLastSearchTooltip, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f112454q.f111520D.c(new y.a("lastSearch.tooltip", 0L, 2, null));
        return kotlin.G0.f406611a;
    }
}
