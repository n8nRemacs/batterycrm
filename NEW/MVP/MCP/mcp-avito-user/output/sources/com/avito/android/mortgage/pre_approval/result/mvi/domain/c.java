package com.avito.android.mortgage.pre_approval.result.mvi.domain;

import MZ.l;
import Y41.p;
import Y61.k;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import g00.InterfaceC40507d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetScoreInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.pre_approval.result.mvi.domain.GetScoreInteractor$getScore$1", f = "GetScoreInteractor.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.HMS_IS_SPOOF, 30, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalResultInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f202108q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f202109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f202110s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f202111t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40507d.b f202112u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, d dVar, InterfaceC40507d.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f202110s = lVar;
        this.f202111t = dVar;
        this.f202112u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f202110s, this.f202111t, this.f202112u, continuation);
        cVar.f202109r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PreApprovalResultInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
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
            int r1 = r8.f202108q
            MZ.l r2 = r8.f202110s
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.mortgage.pre_approval.result.mvi.domain.d r7 = r8.f202111t
            if (r1 == 0) goto L36
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L26
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlin.C42729a0.b(r9)
            goto Lc6
        L26:
            java.lang.Object r1 = r8.f202109r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L78
        L2e:
            java.lang.Object r1 = r8.f202109r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L53
        L36:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f202109r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            if (r2 != 0) goto L42
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L42:
            com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction$ScoreLoadingStarted r1 = new com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction$ScoreLoadingStarted
            r1.<init>()
            r8.f202109r = r9
            r8.f202108q = r6
            java.lang.Object r1 = r9.emit(r1, r8)
            if (r1 != r0) goto L52
            return r0
        L52:
            r1 = r9
        L53:
            com.avito.android.mortgage.pre_approval.result.mvi.domain.f r9 = r7.f202114b
            g00.d$b r6 = r8.f202112u
            r9.b(r6)
            com.avito.android.util.A4 r9 = com.avito.android.util.A4.f318516a
            r9.getClass()
            java.lang.String r9 = "mortgageInfo"
            java.util.Map r9 = com.avito.android.util.A4.h(r2, r9)
            h31.e<IZ.a> r2 = r7.f202113a
            java.lang.Object r2 = r2.get()
            IZ.a r2 = (IZ.a) r2
            r8.f202109r = r1
            r8.f202108q = r5
            java.lang.Object r9 = r2.x(r9, r8)
            if (r9 != r0) goto L78
            return r0
        L78:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r2 == 0) goto L97
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            JZ.o r9 = (JZ.o) r9
            com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction$ScoreLoadingCompleted r2 = new com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction$ScoreLoadingCompleted
            r2.<init>(r9)
            r8.f202109r = r5
            r8.f202108q = r4
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lc6
            return r0
        L97:
            boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Lc9
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r2 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r2, r9)
            com.avito.android.mortgage.pre_approval.result.mvi.domain.f r2 = r7.f202114b
            g00.a r2 = r2.f396212b
            if (r2 == 0) goto Lb2
            r2.cancel()
        Lb2:
            com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction$ScoreLoadingFailed r2 = new com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction$ScoreLoadingFailed
            com.avito.android.remote.error.ApiError r9 = com.avito.android.error.z.n(r9)
            r2.<init>(r9)
            r8.f202109r = r5
            r8.f202108q = r3
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lc6
            return r0
        Lc6:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lc9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.pre_approval.result.mvi.domain.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
