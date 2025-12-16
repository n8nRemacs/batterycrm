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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$processTabSelectedAction$1", f = "RealtyAgencySearchActor.kt", i = {0, 1}, l = {395, 398, 399}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29884t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138958q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138959r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a.u f138960s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138961t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29866a f138962u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29884t(InterfaceC14443a.u uVar, Lw.c cVar, C29866a c29866a, Continuation<? super C29884t> continuation) {
        super(2, continuation);
        this.f138960s = uVar;
        this.f138961t = cVar;
        this.f138962u = c29866a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29884t c29884t = new C29884t(this.f138960s, this.f138961t, this.f138962u, continuation);
        c29884t.f138959r = obj;
        return c29884t;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29884t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f138958q
            r3 = 3
            r4 = 2
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.a r5 = r0.f138962u
            r6 = 1
            Lw.a$u r7 = r0.f138960s
            if (r2 == 0) goto L34
            if (r2 == r6) goto L2c
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            kotlin.C42729a0.b(r18)
            goto L95
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.Object r2 = r0.f138959r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r18)
            goto L78
        L2c:
            java.lang.Object r2 = r0.f138959r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r18)
            goto L66
        L34:
            kotlin.C42729a0.b(r18)
            java.lang.Object r2 = r0.f138959r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r8 = r7.f10216a
            Lw.c r9 = r0.f138961t
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r9 = r9.f10248l
            if (r8 != r9) goto L46
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        L46:
            ri0.a r8 = r5.f138785b
            boolean r8 = r8.b()
            if (r8 != 0) goto L66
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r8 = com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab.f138451d
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r9 = r7.f10216a
            if (r9 != r8) goto L66
            ri0.a r8 = r5.f138785b
            r8.d()
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$ShowSelectionsOnboardingBottomSheet r8 = com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction.ShowSelectionsOnboardingBottomSheet.f138886b
            r0.f138959r = r2
            r0.f138958q = r6
            java.lang.Object r6 = r2.emit(r8, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$UpdateSelectedTab r6 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$UpdateSelectedTab
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r8 = r7.f10216a
            r6.<init>(r8)
            r0.f138959r = r2
            r0.f138958q = r4
            java.lang.Object r4 = r2.emit(r6, r0)
            if (r4 != r1) goto L78
            return r1
        L78:
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E r8 = r5.f138784a
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r10 = r7.f10216a
            r14 = 0
            r15 = 0
            Lw.c r9 = r0.f138961t
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 124(0x7c, float:1.74E-43)
            kotlinx.coroutines.flow.i r4 = com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            r0.f138959r = r5
            r0.f138958q = r3
            java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.u(r0, r4, r2)
            if (r2 != r1) goto L95
            return r1
        L95:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.C29884t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
