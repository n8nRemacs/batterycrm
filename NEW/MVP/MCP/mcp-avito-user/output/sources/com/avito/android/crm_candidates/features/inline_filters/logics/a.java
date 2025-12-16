package com.avito.android.crm_candidates.features.inline_filters.logics;

import Ts.InterfaceC15401a;
import com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmInlineFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.inline_filters.logics.JobCrmInlineFiltersActor$process$1", f = "JobCrmInlineFiltersActor.kt", i = {4}, l = {40, 37, 46, 53, 55, 56}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super JobCrmInlineFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public JobCrmInlineFilterItem f129632q;

    /* renamed from: r, reason: collision with root package name */
    public int f129633r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f129634s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15401a f129635t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f129636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC15401a interfaceC15401a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f129635t = interfaceC15401a;
        this.f129636u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f129635t, this.f129636u, continuation);
        aVar.f129634s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JobCrmInlineFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f129633r
            r2 = 0
            com.avito.android.crm_candidates.features.inline_filters.logics.b r3 = r9.f129636u
            switch(r1) {
                case 0: goto L2c;
                case 1: goto L22;
                case 2: goto L1d;
                case 3: goto L1d;
                case 4: goto L1d;
                case 5: goto L14;
                case 6: goto L1d;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L14:
            java.lang.Object r1 = r9.f129634s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto Lbc
        L1d:
            kotlin.C42729a0.b(r10)
            goto Lcc
        L22:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem r1 = r9.f129632q
            java.lang.Object r3 = r9.f129634s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r10)
            goto L66
        L2c:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f129634s
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            Ts.a r10 = r9.f129635t
            boolean r4 = r10 instanceof Ts.InterfaceC15401a.c
            if (r4 == 0) goto L7b
            com.avito.android.analytics.a r4 = r3.f129638b
            Ls.i r5 = new Ls.i
            com.avito.android.account.E r6 = r3.f129639c
            java.lang.String r6 = r6.a()
            Ts.a$c r10 = (Ts.InterfaceC15401a.c) r10
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem r7 = r10.f15957a
            java.lang.String r7 = r7.f130103b
            r5.<init>(r6, r7)
            r4.c(r5)
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem r10 = r10.f15957a
            r9.f129634s = r1
            r9.f129632q = r10
            r4 = 1
            r9.f129633r = r4
            Ss.a r3 = r3.f129637a
            java.util.List r3 = r3.e()
            if (r3 != r0) goto L62
            return r0
        L62:
            r8 = r1
            r1 = r10
            r10 = r3
            r3 = r8
        L66:
            java.util.List r10 = (java.util.List) r10
            com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$OpenFilterInput r4 = new com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$OpenFilterInput
            r4.<init>(r1, r10)
            r9.f129634s = r2
            r9.f129632q = r2
            r10 = 2
            r9.f129633r = r10
            java.lang.Object r10 = r3.emit(r4, r9)
            if (r10 != r0) goto Lcc
            return r0
        L7b:
            boolean r4 = r10 instanceof Ts.InterfaceC15401a.C1085a
            if (r4 == 0) goto L98
            com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowFilters r2 = new com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction$ShowFilters
            Ss.a r3 = r3.f129637a
            Ts.a$a r10 = (Ts.InterfaceC15401a.C1085a) r10
            java.util.ArrayList r10 = r10.f15955a
            java.util.List r10 = r3.p(r10)
            r2.<init>(r10)
            r10 = 3
            r9.f129633r = r10
            java.lang.Object r10 = r1.emit(r2, r9)
            if (r10 != r0) goto Lcc
            return r0
        L98:
            boolean r4 = r10 instanceof Ts.InterfaceC15401a.d
            if (r4 == 0) goto Laa
            com.avito.android.crm_candidates.features.inline_filters.logics.j r10 = com.avito.android.crm_candidates.features.inline_filters.logics.j.f129663a
            Ss.a r2 = r3.f129637a
            r3 = 4
            r9.f129633r = r3
            java.lang.Object r10 = r10.a(r1, r2, r9)
            if (r10 != r0) goto Lcc
            return r0
        Laa:
            boolean r10 = r10 instanceof Ts.InterfaceC15401a.b
            if (r10 == 0) goto Lcc
            Ss.a r10 = r3.f129637a
            r9.f129634s = r1
            r4 = 5
            r9.f129633r = r4
            kotlin.G0 r10 = r10.i()
            if (r10 != r0) goto Lbc
            return r0
        Lbc:
            com.avito.android.crm_candidates.features.inline_filters.logics.j r10 = com.avito.android.crm_candidates.features.inline_filters.logics.j.f129663a
            Ss.a r3 = r3.f129637a
            r9.f129634s = r2
            r2 = 6
            r9.f129633r = r2
            java.lang.Object r10 = r10.a(r1, r3, r9)
            if (r10 != r0) goto Lcc
            return r0
        Lcc:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.inline_filters.logics.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
