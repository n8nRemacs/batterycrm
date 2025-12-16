package com.avito.android.comfortable_deal.stages_transition.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import fq.InterfaceC40464b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StagesTransitionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lfq/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.stages_transition.mvi.StagesTransitionActor$process$1", f = "StagesTransitionActor.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 31, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40464b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122964q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122965r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ fq.d f122966s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f122967t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fq.d dVar, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f122966s = dVar;
        this.f122967t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f122966s, this.f122967t, continuation);
        aVar.f122965r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40464b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
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
            int r1 = r8.f122964q
            fq.d r2 = r8.f122966s
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.C42729a0.b(r9)
            goto Lb4
        L24:
            java.lang.Object r1 = r8.f122965r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L67
        L2c:
            java.lang.Object r1 = r8.f122965r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L50
        L34:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f122965r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            boolean r1 = r2.f396155d
            if (r1 == 0) goto L42
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L42:
            fq.b$e r1 = fq.InterfaceC40464b.e.f396142a
            r8.f122965r = r9
            r8.f122964q = r6
            java.lang.Object r1 = r9.emit(r1, r8)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r1 = r9
        L50:
            com.avito.android.comfortable_deal.stages_transition.mvi.b r9 = r8.f122967t
            com.avito.android.comfortable_deal.repository.a r9 = r9.f122968a
            java.lang.String r6 = r2.f396153b
            com.avito.android.comfortable_deal.api.model.ActionTransition r7 = r2.f396154c
            java.lang.String r7 = r7.f119756b
            r8.f122965r = r1
            r8.f122964q = r5
            java.util.Map<java.lang.String, com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField> r2 = r2.f396156e
            java.lang.Object r9 = r9.g(r6, r7, r2, r8)
            if (r9 != r0) goto L67
            return r0
        L67:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r2 == 0) goto L8e
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            r9.getResult()
            fq.b$f r9 = new fq.b$f
            com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult r2 = new com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult
            com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy r3 = com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy.f122959b
            java.util.Map r6 = kotlin.collections.P0.c()
            r2.<init>(r3, r5, r6)
            r9.<init>(r2)
            r8.f122965r = r5
            r8.f122964q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto Lb4
            return r0
        L8e:
            boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Lb7
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r2 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r2, r9)
            fq.b$d r2 = new fq.b$d
            com.avito.android.remote.error.ApiError r9 = com.avito.android.error.z.n(r9)
            r2.<init>(r9)
            r8.f122965r = r5
            r8.f122964q = r3
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lb4
            return r0
        Lb4:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lb7:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.stages_transition.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
