package com.avito.android.comfortable_deal.select_agent.mvi;

import Y41.p;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
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
@DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.mvi.SelectAgentActor$process$2", f = "SelectAgentActor.kt", i = {0, 0, 1}, l = {37, 38, 40, 41}, m = "invokeSuspend", n = {"$this$flow", "selectedAgentId", "$this$flow"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super SelectAgentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f122740q;

    /* renamed from: r, reason: collision with root package name */
    public int f122741r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f122742s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dq.c f122743t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f122744u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dq.c cVar, c cVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f122743t = cVar;
        this.f122744u = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f122743t, this.f122744u, continuation);
        bVar.f122742s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectAgentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f122741r
            dq.c r2 = r10.f122743t
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L25
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.C42729a0.b(r11)
            goto Lb0
        L25:
            java.lang.Object r1 = r10.f122742s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L72
        L2d:
            java.lang.String r1 = r10.f122740q
            java.lang.Object r6 = r10.f122742s
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            kotlin.C42729a0.b(r11)
            r11 = r6
            goto L5c
        L38:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f122742s
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            boolean r1 = r2.f394087g
            if (r1 == 0) goto L46
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L46:
            java.lang.String r1 = r2.f394083c
            if (r1 != 0) goto L4d
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L4d:
            com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$SubmitStarted r8 = com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction.SubmitStarted.f122763b
            r10.f122742s = r11
            r10.f122740q = r1
            r10.f122741r = r6
            java.lang.Object r6 = r11.emit(r8, r10)
            if (r6 != r0) goto L5c
            return r0
        L5c:
            com.avito.android.comfortable_deal.select_agent.mvi.c r6 = r10.f122744u
            com.avito.android.comfortable_deal.repository.a r6 = r6.f122748a
            java.lang.String r2 = r2.f394084d
            r10.f122742s = r11
            r10.f122740q = r7
            r10.f122741r = r5
            java.lang.Object r1 = r6.e(r2, r1, r10)
            if (r1 != r0) goto L6f
            return r0
        L6f:
            r9 = r1
            r1 = r11
            r11 = r9
        L72:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto L8a
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            r11.getResult()
            com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$SubmitSuccess r11 = com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction.SubmitSuccess.f122764b
            r10.f122742s = r7
            r10.f122741r = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lb0
            return r0
        L8a:
            boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Lb3
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r2 = r11.getError()
            java.lang.Throwable r11 = r11.getCause()
            com.avito.android.util.ApiException r11 = com.avito.android.util.C35936s.a(r2, r11)
            com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$SubmitError r2 = new com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction$SubmitError
            com.avito.android.remote.error.ApiError r11 = com.avito.android.error.z.n(r11)
            r2.<init>(r11)
            r10.f122742s = r7
            r10.f122741r = r3
            java.lang.Object r11 = r1.emit(r2, r10)
            if (r11 != r0) goto Lb0
            return r0
        Lb0:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        Lb3:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.select_agent.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
