package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EvidenceDetailsBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$loadAndConvertValidationData$1", f = "EvidenceDetailsBootstrap.kt", i = {0, 1, 1, 2}, l = {105, 107, 108}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes13.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.evidence_request.mvi.domain.evidence_details.l f149075q;

    /* renamed from: r, reason: collision with root package name */
    public int f149076r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f149077s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f149078t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f149078t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f149078t, continuation);
        mVar.f149077s = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f149076r
            r2 = 3
            r3 = 2
            r4 = 1
            com.avito.android.evidence_request.mvi.evidence_details.mvi.e r5 = r8.f149078t
            if (r1 == 0) goto L36
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r8.f149077s
            com.avito.android.evidence_request.mvi.domain.evidence_details.l r0 = (com.avito.android.evidence_request.mvi.domain.evidence_details.l) r0
            kotlin.C42729a0.b(r9)
            goto L7d
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            com.avito.android.evidence_request.mvi.domain.evidence_details.l r1 = r8.f149075q
            java.lang.Object r3 = r8.f149077s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r9)
            r9 = r1
            goto L6c
        L2e:
            java.lang.Object r1 = r8.f149077s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L55
        L36:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f149077s
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.evidence_request.mvi.domain.evidence_details.z r1 = r5.f149026g
            com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent r6 = r5.f149021b
            java.util.List<com.avito.android.remote.model.category_parameters.base.ParameterSlot> r6 = r6.f148732f
            io.reactivex.rxjava3.internal.operators.single.S r1 = r1.a(r6)
            r8.f149077s = r9
            r8.f149076r = r4
            java.lang.Object r1 = kotlinx.coroutines.rx3.C43292o.b(r1, r8)
            if (r1 != r0) goto L52
            return r0
        L52:
            r7 = r1
            r1 = r9
            r9 = r7
        L55:
            com.avito.android.evidence_request.mvi.domain.evidence_details.l r9 = (com.avito.android.evidence_request.mvi.domain.evidence_details.l) r9
            com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$FormParametersSlots r4 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$FormParametersSlots
            java.util.List<com.avito.android.remote.model.category_parameters.base.ParameterSlot> r6 = r9.f148707a
            r4.<init>(r6)
            r8.f149077s = r1
            r8.f149075q = r9
            r8.f149076r = r3
            java.lang.Object r3 = r1.emit(r4, r8)
            if (r3 != r0) goto L6b
            return r0
        L6b:
            r3 = r1
        L6c:
            com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$ShowItems r1 = com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction.ShowItems.f149042b
            r8.f149077s = r9
            r4 = 0
            r8.f149075q = r4
            r8.f149076r = r2
            java.lang.Object r1 = r3.emit(r1, r8)
            if (r1 != r0) goto L7c
            return r0
        L7c:
            r0 = r9
        L7d:
            com.avito.android.evidence_request.mvi.domain.evidence_details.a r9 = r5.f149024e
            com.avito.android.evidence_request.mvi.domain.evidence_details.i r1 = r0.f148708b
            java.lang.String[] r1 = r1.f148704b
            r9.c(r1)
            com.avito.android.evidence_request.mvi.domain.evidence_details.i r9 = r0.f148708b
            long r0 = r9.f148703a
            com.avito.android.evidence_request.mvi.domain.evidence_details.a r9 = r5.f149024e
            r9.a(r0)
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.mvi.evidence_details.mvi.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
