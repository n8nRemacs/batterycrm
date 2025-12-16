package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchInteractorImpl$initialize$1", f = "RealtyAgencySearchInteractor.kt", i = {0, 1}, l = {94, 97, UpdateStatusCode.DialogButton.CONFIRM, 110}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class F extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f138708s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchArguments.CommissionPromoBanner f138709t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchArguments.MapArguments f138710u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I i12, RealtyAgencySearchArguments.CommissionPromoBanner commissionPromoBanner, RealtyAgencySearchArguments.MapArguments mapArguments, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f138708s = i12;
        this.f138709t = commissionPromoBanner;
        this.f138710u = mapArguments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F f12 = new F(this.f138708s, this.f138709t, this.f138710u, continuation);
        f12.f138707r = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((F) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
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
            int r1 = r8.f138706q
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
            goto L9a
        L22:
            java.lang.Object r1 = r8.f138707r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L65
        L2a:
            java.lang.Object r1 = r8.f138707r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L58
        L32:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f138707r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.I r9 = r8.f138708s
            ri0.a r9 = r9.f138731g
            boolean r9 = r9.e()
            if (r9 != 0) goto L58
            com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments$CommissionPromoBanner r9 = r8.f138709t
            if (r9 == 0) goto L58
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$UpdateCommissionPromoBanner r6 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$UpdateCommissionPromoBanner
            r6.<init>(r9)
            r8.f138707r = r1
            r8.f138706q = r5
            java.lang.Object r9 = r1.emit(r6, r8)
            if (r9 != r0) goto L58
            return r0
        L58:
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$RefreshInlineFilter r9 = com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction.RefreshInlineFilter.f138860b
            r8.f138707r = r1
            r8.f138706q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments$MapArguments r9 = r8.f138710u
            boolean r4 = r9 instanceof com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments.MapArguments.StartPoint
            r5 = 0
            if (r4 == 0) goto L82
            com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments$MapArguments$StartPoint r9 = (com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments.MapArguments.StartPoint) r9
            long r6 = r9.f138679c
            com.avito.android.avito_map.AvitoMapPoint r9 = r9.f138678b
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$Map$MoveToPoint r2 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$Map$MoveToPoint
            r2.<init>(r9, r6)
            r8.f138707r = r5
            r8.f138706q = r3
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto L9a
            return r0
        L82:
            boolean r3 = r9 instanceof com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments.MapArguments.StartBounds
            if (r3 == 0) goto L9a
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$Map$MoveToBounds r3 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$Map$MoveToBounds
            com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments$MapArguments$StartBounds r9 = (com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments.MapArguments.StartBounds) r9
            com.avito.android.avito_map.AvitoMapBounds r9 = r9.f138677b
            r3.<init>(r9)
            r8.f138707r = r5
            r8.f138706q = r2
            java.lang.Object r9 = r1.emit(r3, r8)
            if (r9 != r0) goto L9a
            return r0
        L9a:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
