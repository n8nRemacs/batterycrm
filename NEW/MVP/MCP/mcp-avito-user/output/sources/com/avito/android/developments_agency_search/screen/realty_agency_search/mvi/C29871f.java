package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$13", f = "RealtyAgencySearchActor.kt", i = {0, 1}, l = {313, 314, 316}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29871f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138894q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138895r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29866a f138896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138897t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29871f(InterfaceC14443a interfaceC14443a, Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138896s = c29866a;
        this.f138897t = cVar;
        this.f138898u = interfaceC14443a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29871f c29871f = new C29871f(this.f138898u, this.f138897t, this.f138896s, continuation);
        c29871f.f138895r = obj;
        return c29871f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29871f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
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
            int r1 = r13.f138894q
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.a r2 = r13.f138896s
            r3 = 3
            r4 = 2
            r5 = 1
            Lw.a r6 = r13.f138898u
            if (r1 == 0) goto L31
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            kotlin.C42729a0.b(r14)
            goto L89
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f138895r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L73
        L29:
            java.lang.Object r1 = r13.f138895r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L66
        L31:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f138895r
            kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
            Kw.e r1 = r2.f138786c
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$AnalyticsEvent$MapPinClicked r7 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$AnalyticsEvent$MapPinClicked
            Lw.c r8 = r13.f138897t
            com.avito.android.remote.model.SearchParams r9 = r8.f10238b
            r10 = r6
            Lw.a$f$c r10 = (Lw.InterfaceC14443a.f.c) r10
            java.lang.String r11 = r10.f10198a
            long r11 = java.lang.Long.parseLong(r11)
            Lw.c$a r8 = r8.f10242f
            boolean r8 = r8.f10252c
            r7.<init>(r9, r11, r8)
            r1.a(r7)
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$Map$UpdateSelectedMarker r1 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$Map$UpdateSelectedMarker
            java.lang.String r7 = r10.f10198a
            r1.<init>(r7)
            r13.f138895r = r14
            r13.f138894q = r5
            java.lang.Object r1 = r14.emit(r1, r13)
            if (r1 != r0) goto L65
            return r0
        L65:
            r1 = r14
        L66:
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$ContentBottomSheet$Collapse r14 = com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction.ContentBottomSheet.Collapse.f138834b
            r13.f138895r = r1
            r13.f138894q = r4
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L73
            return r0
        L73:
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E r14 = r2.f138784a
            Lw.a$f$c r6 = (Lw.InterfaceC14443a.f.c) r6
            java.lang.String r2 = r6.f10198a
            kotlinx.coroutines.flow.i r14 = r14.a(r2)
            r2 = 0
            r13.f138895r = r2
            r13.f138894q = r3
            java.lang.Object r14 = kotlinx.coroutines.flow.C43175k.u(r13, r14, r1)
            if (r14 != r0) goto L89
            return r0
        L89:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.C29871f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
