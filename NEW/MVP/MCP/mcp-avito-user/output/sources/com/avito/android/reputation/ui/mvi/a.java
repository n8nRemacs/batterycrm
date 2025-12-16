package com.avito.android.reputation.ui.mvi;

import Y41.p;
import com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReputationActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.reputation.ui.mvi.ReputationActor$process$1", f = "ReputationActor.kt", i = {0, 1}, l = {32, 33, 35, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ReputationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f255048q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f255049r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f255050s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f255050s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f255050s, continuation);
        aVar.f255049r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ReputationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
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
            int r1 = r8.f255048q
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
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.C42729a0.b(r9)
            goto Lb1
        L22:
            java.lang.Object r1 = r8.f255049r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L70
        L2a:
            java.lang.Object r1 = r8.f255049r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L47
        L32:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f255049r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction$ScreenLoading r1 = com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction.ScreenLoading.f255066b
            r8.f255049r = r9
            r8.f255048q = r5
            java.lang.Object r1 = r9.emit(r1, r8)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r9
        L47:
            com.avito.android.reputation.ui.mvi.b r9 = r8.f255050s
            com.avito.android.reputation.ui.e r9 = r9.f255051a
            r8.f255049r = r1
            r8.f255048q = r4
            com.avito.android.reputation.ui.ReputationArgs r4 = r9.f254810b
            java.util.LinkedHashMap r5 = r4.f254765c
            java.lang.String r6 = "source"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.util.LinkedHashMap r6 = r4.f254765c
            java.lang.String r7 = "id"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            Im0.a r9 = r9.f254809a
            java.lang.String r4 = r4.f254764b
            java.lang.Object r9 = r9.a(r5, r4, r6, r8)
            if (r9 != r0) goto L70
            return r0
        L70:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L93
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            com.avito.android.remote.model.BeduinV2 r9 = (com.avito.android.remote.model.BeduinV2) r9
            com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction$ScreenLoaded r2 = new com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction$ScreenLoaded
            java.lang.String r9 = r9.getJson()
            r2.<init>(r9)
            r8.f255049r = r5
            r8.f255048q = r3
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lb1
            return r0
        L93:
            boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto Lb4
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r3 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.C35936s.a(r3, r9)
            com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction$ScreenLoadedError r9 = com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction.ScreenLoadedError.f255065b
            r8.f255049r = r5
            r8.f255048q = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto Lb1
            return r0
        Lb1:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lb4:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
