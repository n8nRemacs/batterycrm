package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$1", f = "DealActor.kt", i = {0, 1}, l = {81, 99, 100}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121677q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121679s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121680t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC13517a interfaceC13517a, Ep.c cVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f121679s = interfaceC13517a;
        this.f121680t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f121679s, this.f121680t, continuation);
        jVar.f121678r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f121677q
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L32
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            kotlin.C42729a0.b(r20)
            goto Lae
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.Object r2 = r0.f121678r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r20)
            goto L9e
        L2a:
            java.lang.Object r2 = r0.f121678r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r20)
            goto L8a
        L32:
            kotlin.C42729a0.b(r20)
            java.lang.Object r2 = r0.f121678r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            Ep.a r7 = r0.f121679s
            Ep.a$v r7 = (Ep.InterfaceC13517a.v) r7
            boolean r7 = r7.f4294a
            if (r7 == 0) goto L8a
            Ep.c r7 = r0.f121680t
            Ep.d r8 = r7.f4331h
            com.avito.android.comfortable_deal.api.model.ActionTransition r9 = r8.f4336e
            if (r9 == 0) goto L8a
            java.util.Map<java.lang.String, com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField> r8 = r8.f4337f
            boolean r8 = r8.isEmpty()
            Ep.d r9 = r7.f4331h
            java.lang.String r10 = r7.f4325b
            java.lang.String r11 = ""
            if (r8 == 0) goto L73
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$OpenSoldTransitionDialog r8 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$OpenSoldTransitionDialog
            if (r10 != 0) goto L5d
            r13 = r11
            goto L5e
        L5d:
            r13 = r10
        L5e:
            com.avito.android.comfortable_deal.api.model.ActionTransition r10 = r9.f4336e
            java.lang.String r14 = r7.f4328e
            java.lang.String r15 = r7.f4327d
            java.lang.String r7 = r7.f4326c
            com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState r9 = r9.f4338g
            r12 = r8
            r16 = r7
            r17 = r10
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L7f
        L73:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$OpenTransitionDialog r8 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$OpenTransitionDialog
            if (r10 != 0) goto L78
            r10 = r11
        L78:
            com.avito.android.comfortable_deal.api.model.ActionTransition r7 = r9.f4336e
            java.util.Map<java.lang.String, com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField> r9 = r9.f4337f
            r8.<init>(r10, r7, r9)
        L7f:
            r0.f121678r = r2
            r0.f121677q = r5
            java.lang.Object r5 = r2.emit(r8, r0)
            if (r5 != r1) goto L8a
            return r1
        L8a:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateTransitionData r5 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateTransitionData
            java.util.Map r7 = kotlin.collections.P0.c()
            r5.<init>(r6, r7)
            r0.f121678r = r2
            r0.f121677q = r4
            java.lang.Object r4 = r2.emit(r5, r0)
            if (r4 != r1) goto L9e
            return r1
        L9e:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateEndDealData r4 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateEndDealData
            r4.<init>(r6, r6)
            r0.f121678r = r6
            r0.f121677q = r3
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto Lae
            return r1
        Lae:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.mvi.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
