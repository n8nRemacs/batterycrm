package com.avito.android.tariff.cpx.levels.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxLevelsUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.levels.domain.CpxLevelsUseCaseImpl$invoke$1", f = "CpxLevelsUseCase.kt", i = {0, 1}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f297091q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f297092r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f297093s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f297093s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f297093s, continuation);
        bVar.f297092r = obj;
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
            int r1 = r6.f297091q
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
            goto L94
        L22:
            java.lang.Object r1 = r6.f297092r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L5b
        L2a:
            java.lang.Object r1 = r6.f297092r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L4a
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f297092r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction$Loading r1 = new com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction$Loading
            r1.<init>()
            r6.f297092r = r7
            r6.f297091q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L49
            return r0
        L49:
            r1 = r7
        L4a:
            com.avito.android.tariff.cpx.levels.domain.c r7 = r6.f297093s
            r6.f297092r = r1
            r6.f297091q = r4
            WB0.a r4 = r7.f297095c
            java.lang.String r7 = r7.f297094b
            java.lang.Object r7 = r4.s(r7, r6)
            if (r7 != r0) goto L5b
            return r0
        L5b:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L7a
            com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction$Content r2 = new com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction$Content
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            eC0.l r7 = (eC0.l) r7
            r2.<init>(r7)
            r6.f297092r = r5
            r6.f297091q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L94
            return r0
        L7a:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto L94
            com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction$Error r3 = new com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction$Error
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            r3.<init>(r7)
            r6.f297092r = r5
            r6.f297091q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L94
            return r0
        L94:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.levels.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
