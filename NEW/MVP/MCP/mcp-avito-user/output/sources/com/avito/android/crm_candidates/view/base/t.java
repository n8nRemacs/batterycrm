package com.avito.android.crm_candidates.view.base;

import Ps.InterfaceC14833a;
import Ps.InterfaceC14834b;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class t extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14834b.c f129939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(JobCrmCandidatesFragment jobCrmCandidatesFragment, InterfaceC14834b.c cVar) {
        super(0);
        this.f129938l = jobCrmCandidatesFragment;
        this.f129939m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
        this.f129938l.s5().accept(new InterfaceC14833a.j(this.f129939m.f13360a, false));
        return G0.f406611a;
    }
}
