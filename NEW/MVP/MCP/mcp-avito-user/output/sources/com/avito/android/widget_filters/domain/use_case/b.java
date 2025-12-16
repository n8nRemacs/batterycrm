package com.avito.android.widget_filters.domain.use_case;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetSuggestedLocationsUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.domain.use_case.GetSuggestedLocationsUseCaseImpl$invoke$1", f = "GetSuggestedLocationsUseCase.kt", i = {0, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction.UpdateLocation>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329909q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329910r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f329911s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f329912t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f329911s = cVar;
        this.f329912t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f329911s, this.f329912t, continuation);
        bVar.f329910r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction.UpdateLocation> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
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
            int r1 = r6.f329909q
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
            goto L9e
        L22:
            java.lang.Object r1 = r6.f329910r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L5d
        L2a:
            java.lang.Object r1 = r6.f329910r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L47
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f329910r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateLocation$StartSuggestedLocationsLoading r1 = com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction.UpdateLocation.StartSuggestedLocationsLoading.f330046b
            r6.f329910r = r7
            r6.f329909q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r7
        L47:
            com.avito.android.widget_filters.domain.use_case.c r7 = r6.f329911s
            com.avito.android.geo_common.interactor.g r7 = r7.f329913a
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            r6.f329910r = r1
            r6.f329909q = r4
            java.lang.String r4 = r6.f329912t
            java.lang.Object r7 = r7.n(r4, r5, r6)
            if (r7 != r0) goto L5d
            return r0
        L5d:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L7c
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsContent r2 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsContent
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            tF.e$c r7 = (tF.e.c) r7
            r2.<init>(r7)
            r6.f329910r = r5
            r6.f329909q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L9e
            return r0
        L7c:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto L9e
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsError r3 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsError
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            java.lang.String r7 = r7.getF244063c()
            com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.f(r7)
            r3.<init>(r7)
            r6.f329910r = r5
            r6.f329909q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L9e
            return r0
        L9e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.domain.use_case.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
