package com.avito.android.crm_candidates.features.list_filter.logics;

import Vs.InterfaceC15712a;
import Vs.InterfaceC15713b;
import Y41.p;
import com.avito.android.crm_candidates.features.list_filter.entity.JobCrmListFilterState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmListFilterActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVs/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.list_filter.logics.JobCrmListFilterActor$process$1", f = "JobCrmListFilterActor.kt", i = {2}, l = {AvailableCode.ERROR_NO_ACTIVITY, 34, 49, 53, 56, 60}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC15713b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129682q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129683r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15712a f129684s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f129685t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JobCrmListFilterState f129686u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC15712a interfaceC15712a, b bVar, JobCrmListFilterState jobCrmListFilterState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f129684s = interfaceC15712a;
        this.f129685t = bVar;
        this.f129686u = jobCrmListFilterState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f129684s, this.f129685t, this.f129686u, continuation);
        aVar.f129683r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC15713b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.list_filter.logics.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
