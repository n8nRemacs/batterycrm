package com.avito.android.mandatory_verification.domain;

import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RetrieveDataUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.domain.RetrieveDataUseCase$invoke$1", f = "RetrieveDataUseCase.kt", i = {0, 1}, l = {16, 18, 19, 20}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MandatoryVerificationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184497q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184498r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f184499s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f184500t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, long j12, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f184499s = gVar;
        this.f184500t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f184499s, this.f184500t, continuation);
        eVar.f184498r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MandatoryVerificationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
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
            int r1 = r6.f184497q
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
            goto L99
        L22:
            java.lang.Object r1 = r6.f184498r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L58
        L2a:
            java.lang.Object r1 = r6.f184498r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L47
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f184498r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowLoading r1 = com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction.ShowLoading.f184794b
            r6.f184498r = r7
            r6.f184497q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r7
        L47:
            com.avito.android.mandatory_verification.domain.g r7 = r6.f184499s
            com.avito.android.mandatory_verification.data.d r7 = r7.f184578a
            r6.f184498r = r1
            r6.f184497q = r4
            long r4 = r6.f184500t
            java.lang.Object r7 = r7.e(r4, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L77
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            com.avito.android.mandatory_verification.data.model.MandatoryVerificationData r7 = (com.avito.android.mandatory_verification.data.model.MandatoryVerificationData) r7
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildInitial r2 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildInitial
            r2.<init>(r7)
            r6.f184498r = r5
            r6.f184497q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L99
            return r0
        L77:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto L9c
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r3 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowError r3 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowError
            r3.<init>(r7)
            r6.f184498r = r5
            r6.f184497q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L99
            return r0
        L99:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L9c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.domain.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
