package com.avito.android.comfortable_deal.select_agent.mvi;

import Y41.p;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectAgentActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.mvi.SelectAgentActor$process$1", f = "SelectAgentActor.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectAgentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122736q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122737r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ dq.c f122738s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f122739t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dq.c cVar, c cVar2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f122738s = cVar;
        this.f122739t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f122738s, this.f122739t, continuation);
        aVar.f122737r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectAgentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f122736q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.C42729a0.b(r7)
            goto La7
        L22:
            java.lang.Object r1 = r6.f122737r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L62
        L2a:
            java.lang.Object r1 = r6.f122737r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L53
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f122737r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            dq.c r1 = r6.f122738s
            boolean r1 = r1.f394086f
            if (r1 == 0) goto L42
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L42:
            com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$StartLoading r1 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$StartLoading
            r1.<init>()
            r6.f122737r = r7
            r6.f122736q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L52
            return r0
        L52:
            r1 = r7
        L53:
            com.avito.android.comfortable_deal.select_agent.mvi.c r7 = r6.f122739t
            com.avito.android.comfortable_deal.repository.a r7 = r7.f122748a
            r6.f122737r = r1
            r6.f122736q = r4
            java.lang.Object r7 = r7.m(r6)
            if (r7 != r0) goto L62
            return r0
        L62:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            java.util.List r7 = (java.util.List) r7
            com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$AgentsLoaded r2 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$AgentsLoaded
            r2.<init>(r7)
            r6.f122737r = r5
            r6.f122736q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto La7
            return r0
        L81:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto Laa
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r3 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
            com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$LoadingError r3 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$LoadingError
            com.avito.android.remote.error.ApiError r7 = com.avito.android.error.z.n(r7)
            r3.<init>(r7)
            r6.f122737r = r5
            r6.f122736q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto La7
            return r0
        La7:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        Laa:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.select_agent.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
