package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LocationSuggestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.location_suggest.mvi.LocationSuggestInteractor$loadLocations$1", f = "LocationSuggestInteractor.kt", i = {0, 1}, l = {16, 20, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationSuggestInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251717q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251718r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f251719s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f251720t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f251719s = lVar;
        this.f251720t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f251719s, this.f251720t, continuation);
        kVar.f251718r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LocationSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f251717q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            kotlin.C42729a0.b(r14)
            goto La4
        L23:
            java.lang.Object r1 = r13.f251718r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L64
        L2b:
            java.lang.Object r1 = r13.f251718r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L4b
        L33:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f251718r
            kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
            com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction$LocationsLoading$StartLoading r1 = new com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction$LocationsLoading$StartLoading
            r1.<init>(r5, r6, r5)
            r13.f251718r = r14
            r13.f251717q = r6
            java.lang.Object r1 = r14.emit(r1, r13)
            if (r1 != r0) goto L4a
            return r0
        L4a:
            r1 = r14
        L4b:
            com.avito.android.realty_agency.inline_filters.location_suggest.mvi.l r14 = r13.f251719s
            ni0.a r7 = r14.f251721a
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            com.avito.android.realty_agency.inline_filters_public.generated.api.api_1_nd_trx_suggest_location_post.Mode r10 = com.avito.android.realty_agency.inline_filters_public.generated.api.api_1_nd_trx_suggest_location_post.Mode.Lots
            r13.f251718r = r1
            r13.f251717q = r4
            r8 = 0
            java.lang.String r11 = r13.f251720t
            r12 = r13
            java.lang.Object r14 = r7.b(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L64
            return r0
        L64:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            boolean r4 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto L82
            com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
            java.lang.Object r14 = r14.getResult()
            oi0.a r14 = (oi0.C44782a) r14
            com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction$LocationsLoading$Loaded r2 = new com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction$LocationsLoading$Loaded
            r2.<init>(r14)
            r13.f251718r = r5
            r13.f251717q = r3
            java.lang.Object r14 = r1.emit(r2, r13)
            if (r14 != r0) goto La4
            return r0
        L82:
            boolean r3 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto La7
            com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
            com.avito.android.remote.error.ApiError r3 = r14.getError()
            java.lang.Throwable r14 = r14.getCause()
            com.avito.android.util.ApiException r14 = com.avito.android.util.C35936s.a(r3, r14)
            com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction$LocationsLoading$LoadingError r3 = new com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction$LocationsLoading$LoadingError
            r3.<init>(r14)
            r13.f251718r = r5
            r13.f251717q = r2
            java.lang.Object r14 = r1.emit(r3, r13)
            if (r14 != r0) goto La4
            return r0
        La4:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        La7:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.inline_filters.location_suggest.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
