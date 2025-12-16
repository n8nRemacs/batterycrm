package com.avito.android.job.cv_info_actualization.mvi.action_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxCvInfoActualizationLoadInitialInfoActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.cv_info_actualization.mvi.action_handler.JsxCvInfoActualizationLoadInitialInfoActionHandler$handle$1", f = "JsxCvInfoActualizationLoadInitialInfoActionHandler.kt", i = {0, 1}, l = {20, 21, 22, 23}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f174090q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174091r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f174092s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f174092s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f174092s, continuation);
        aVar.f174091r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws java.lang.NumberFormatException {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f174090q
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
            goto L97
        L22:
            java.lang.Object r1 = r6.f174091r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L59
        L2a:
            java.lang.Object r1 = r6.f174091r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L4a
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f174091r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction$LoadingInitialInfo r1 = new com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction$LoadingInitialInfo
            r1.<init>()
            r6.f174091r = r7
            r6.f174090q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L49
            return r0
        L49:
            r1 = r7
        L4a:
            com.avito.android.job.cv_info_actualization.mvi.action_handler.c r7 = r6.f174092s
            com.avito.android.job.cv_info_actualization.mvi.domain.g r7 = r7.f174096a
            r6.f174091r = r1
            r6.f174090q = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L59
            return r0
        L59:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            r5 = 0
            if (r4 == 0) goto L7b
            com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction$InitialInfoLoadedFailure r2 = new com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction$InitialInfoLoadedFailure
            com.avito.android.analytics.screens.J$a r4 = new com.avito.android.analytics.screens.J$a
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            r4.<init>(r7)
            r2.<init>(r4)
            r6.f174091r = r5
            r6.f174090q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L97
            return r0
        L7b:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r3 == 0) goto L97
            com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction$InitialInfoLoadedSuccess r3 = new com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction$InitialInfoLoadedSuccess
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            com.avito.android.job.cv_info_actualization.mvi.domain.a r7 = (com.avito.android.job.cv_info_actualization.mvi.domain.a) r7
            r3.<init>(r7)
            r6.f174091r = r5
            r6.f174090q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L97
            return r0
        L97:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_info_actualization.mvi.action_handler.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
