package com.avito.android.mandatory_verification.domain;

import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StartVerificationUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.domain.StartVerificationUseCase$invoke$1", f = "StartVerificationUseCase.kt", i = {0, 1}, l = {21, 23, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MandatoryVerificationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184580q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184581r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f184582s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f184583t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f184584u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, long j12, String str, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f184582s = kVar;
        this.f184583t = j12;
        this.f184584u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f184582s, this.f184583t, this.f184584u, continuation);
        iVar.f184581r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MandatoryVerificationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f184580q
            com.avito.android.mandatory_verification.domain.k r2 = r9.f184582s
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 == r7) goto L2f
            if (r1 == r6) goto L27
            if (r1 == r5) goto L22
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            goto L22
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.C42729a0.b(r10)
            goto Lc9
        L27:
            java.lang.Object r1 = r9.f184581r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L5d
        L2f:
            java.lang.Object r1 = r9.f184581r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L4c
        L37:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f184581r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowLoading r1 = com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction.ShowLoading.f184794b
            r9.f184581r = r10
            r9.f184580q = r7
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            r1 = r10
        L4c:
            com.avito.android.mandatory_verification.data.d r10 = r2.f184589a
            r9.f184581r = r1
            r9.f184580q = r6
            long r6 = r9.f184583t
            java.lang.String r8 = r9.f184584u
            java.lang.Object r10 = r10.d(r6, r8, r9)
            if (r10 != r0) goto L5d
            return r0
        L5d:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            r7 = 0
            if (r6 == 0) goto L97
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            OX.a r10 = (OX.a) r10
            boolean r10 = r10.f12299a
            if (r10 == 0) goto L7d
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ProceedSuccess r10 = com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction.ProceedSuccess.f184792b
            r9.f184581r = r7
            r9.f184580q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lc9
            return r0
        L7d:
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowToast r10 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowToast
            r2 = 0
            java.io.Serializable[] r2 = new java.io.Serializable[r2]
            r3 = 2131958049(0x7f131921, float:1.95527E38)
            com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.c(r3, r2)
            r10.<init>(r2)
            r9.f184581r = r7
            r9.f184580q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lc9
            return r0
        L97:
            boolean r4 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto Lcc
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r4 = r10.getError()
            java.lang.Throwable r10 = r10.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r4, r10)
            r9.f184581r = r7
            r9.f184580q = r3
            com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowToast r3 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowToast
            com.avito.android.util.a1 r2 = r2.f184590b
            r4 = 6
            com.avito.android.printable_text.PrintableText r10 = com.avito.android.util.InterfaceC35741a1.a.a(r2, r10, r7, r7, r4)
            r3.<init>(r10)
            java.lang.Object r10 = r1.emit(r3, r9)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r1) goto Lc4
            goto Lc6
        Lc4:
            kotlin.G0 r10 = kotlin.G0.f406611a
        Lc6:
            if (r10 != r0) goto Lc9
            return r0
        Lc9:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        Lcc:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.domain.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
