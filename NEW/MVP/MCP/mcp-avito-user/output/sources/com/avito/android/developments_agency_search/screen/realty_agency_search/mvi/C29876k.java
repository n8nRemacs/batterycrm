package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$1", f = "RealtyAgencySearchActor.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29876k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138915q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138916r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29866a f138917s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138918t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29876k(Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138917s = c29866a;
        this.f138918t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29876k c29876k = new C29876k(this.f138918t, this.f138917s, continuation);
        c29876k.f138916r = obj;
        return c29876k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29876k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f138915q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r13)
            goto L96
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f138916r
            kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.a r1 = r12.f138917s
            r1.getClass()
            Lw.c r4 = r12.f138918t
            boolean r3 = r4.f10245i
            if (r3 == 0) goto L2b
            goto L96
        L2b:
            com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab r3 = r4.f10248l
            int r3 = r3.ordinal()
            if (r3 == 0) goto L5c
            if (r3 != r2) goto L56
            Lw.c$e r3 = r4.f10244h
            com.avito.android.util.P2<ex.a> r5 = r3.f10261a
            boolean r5 = r5 instanceof com.avito.android.util.P2.b
            if (r5 != 0) goto L3e
            goto L96
        L3e:
            java.util.ArrayList r5 = r3.f10264d
            int r5 = r5.size()
            com.avito.android.util.P2<ex.a> r3 = r3.f10261a
            com.avito.android.util.P2$b r3 = (com.avito.android.util.P2.b) r3
            T r3 = r3.f318720a
            ex.a r3 = (ex.C40174a) r3
            long r6 = r3.getLotsCount()
            long r8 = (long) r5
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 >= 0) goto L96
            goto L7c
        L56:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L5c:
            Lw.c$c r3 = r4.f10243g
            com.avito.android.util.P2<dx.a> r5 = r3.f10253a
            boolean r5 = r5 instanceof com.avito.android.util.P2.b
            if (r5 != 0) goto L65
            goto L96
        L65:
            java.util.ArrayList r5 = r3.f10255c
            int r5 = r5.size()
            com.avito.android.util.P2<dx.a> r3 = r3.f10253a
            com.avito.android.util.P2$b r3 = (com.avito.android.util.P2.b) r3
            T r3 = r3.f318720a
            dx.a r3 = (dx.C39813a) r3
            long r6 = r3.getDevelopmentsCount()
            long r8 = (long) r5
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 >= 0) goto L96
        L7c:
            int r3 = r4.f10249m
            int r10 = r3 + 1
            r8 = 0
            r9 = 0
            com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E r3 = r1.f138784a
            r5 = 0
            r6 = 0
            r7 = 0
            r11 = 62
            kotlinx.coroutines.flow.i r1 = com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f138915q = r2
            java.lang.Object r13 = kotlinx.coroutines.flow.C43175k.u(r12, r1, r13)
            if (r13 != r0) goto L96
            return r0
        L96:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.C29876k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
