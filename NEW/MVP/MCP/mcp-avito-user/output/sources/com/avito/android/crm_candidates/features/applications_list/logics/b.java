package com.avito.android.crm_candidates.features.applications_list.logics;

import Ps.InterfaceC14833a;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmApplicationsListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.applications_list.logics.JobCrmApplicationsListActor$process$1", f = "JobCrmApplicationsListActor.kt", i = {3, 8}, l = {61, 62, 63, 73, 74, 95, 136, 207, 214, JfifUtil.MARKER_RST7}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super JobCrmApplicationsListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129512q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129513r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14833a f129514s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f129515t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JobCrmApplicationsListState f129516u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC14833a interfaceC14833a, a aVar, JobCrmApplicationsListState jobCrmApplicationsListState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f129514s = interfaceC14833a;
        this.f129515t = aVar;
        this.f129516u = jobCrmApplicationsListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f129514s, this.f129515t, this.f129516u, continuation);
        bVar.f129513r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JobCrmApplicationsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0384 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.applications_list.logics.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
