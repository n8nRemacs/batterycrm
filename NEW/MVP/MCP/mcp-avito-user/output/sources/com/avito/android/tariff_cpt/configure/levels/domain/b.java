package com.avito.android.tariff_cpt.configure.levels.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TariffCptConfigureLevelsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff_cpt.configure.levels.domain.TariffCptConfigureLevelsUseCaseImpl$invoke$1", f = "TariffCptConfigureLevelsUseCase.kt", i = {0, 1}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f297861q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f297862r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f297863s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f297863s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f297863s, continuation);
        bVar.f297862r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
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
            int r1 = r6.f297861q
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
            goto L9c
        L22:
            java.lang.Object r1 = r6.f297862r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L5b
        L2a:
            java.lang.Object r1 = r6.f297862r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L4a
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f297862r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction$Loading$ScreenLoading r1 = new com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction$Loading$ScreenLoading
            r1.<init>()
            r6.f297862r = r7
            r6.f297861q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L49
            return r0
        L49:
            r1 = r7
        L4a:
            com.avito.android.tariff_cpt.configure.levels.domain.c r7 = r6.f297863s
            r6.f297862r = r1
            r6.f297861q = r4
            uC0.a r4 = r7.f297865c
            java.lang.String r7 = r7.f297864b
            java.lang.Object r7 = r4.c(r7, r6)
            if (r7 != r0) goto L5b
            return r0
        L5b:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L7a
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            vC0.g r7 = (vC0.g) r7
            com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction$Content r2 = new com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction$Content
            r2.<init>(r7)
            r6.f297862r = r5
            r6.f297861q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L9c
            return r0
        L7a:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto L9f
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r3 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
            com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction$Error r3 = new com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction$Error
            r3.<init>(r7)
            r6.f297862r = r5
            r6.f297861q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L9c
            return r0
        L9c:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L9f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_cpt.configure.levels.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
