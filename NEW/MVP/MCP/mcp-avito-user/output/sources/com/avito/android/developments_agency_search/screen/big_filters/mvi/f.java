package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ww.InterfaceC49690a;

/* compiled from: BigFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.big_filters.mvi.BigFiltersActor$process$6", f = "BigFiltersActor.kt", i = {0, 1}, l = {106, 108, 112}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BigFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f136713q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f136714r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49690a f136715s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f136716t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC49690a interfaceC49690a, j jVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f136715s = interfaceC49690a;
        this.f136716t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f136715s, this.f136716t, continuation);
        fVar.f136714r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BigFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f136713q
            ww.a r2 = r7.f136715s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r8)
            goto L71
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.f136714r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L63
        L27:
            java.lang.Object r1 = r7.f136714r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L4c
        L2f:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f136714r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$UpdateLastSearchParams r1 = new com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$UpdateLastSearchParams
            r6 = r2
            ww.a$k r6 = (ww.InterfaceC49690a.k) r6
            com.avito.android.remote.model.SearchParams r6 = r6.f441868a
            r1.<init>(r6)
            r7.f136714r = r8
            r7.f136713q = r5
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            r1 = r8
        L4c:
            com.avito.android.developments_agency_search.screen.big_filters.mvi.j r8 = r7.f136716t
            com.avito.android.developments_agency_search.screen.big_filters.f r8 = r8.f136728a
            ww.a$k r2 = (ww.InterfaceC49690a.k) r2
            com.avito.android.remote.model.SearchParams r2 = r2.f441868a
            kotlinx.coroutines.flow.i r8 = r8.b(r2)
            r7.f136714r = r1
            r7.f136713q = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
            if (r8 != r0) goto L63
            return r0
        L63:
            com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$RefreshSearchResultCount r8 = com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction.RefreshSearchResultCount.f136702b
            r2 = 0
            r7.f136714r = r2
            r7.f136713q = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L71
            return r0
        L71:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
