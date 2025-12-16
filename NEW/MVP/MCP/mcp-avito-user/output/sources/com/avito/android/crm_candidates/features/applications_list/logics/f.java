package com.avito.android.crm_candidates.features.applications_list.logics;

import Ps.InterfaceC14833a;
import Ps.InterfaceC14834b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobCrmApplicationsListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPs/a;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState;", "LPs/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14833a, JobCrmApplicationsListInternalAction, JobCrmApplicationsListState, InterfaceC14834b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f129526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f129527m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f129528n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f129529o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f129530p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f129526l = dVar;
        this.f129527m = aVar;
        this.f129528n = screenPerformanceTracker;
        this.f129529o = oVar;
        this.f129530p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14833a, JobCrmApplicationsListInternalAction, JobCrmApplicationsListState, InterfaceC14834b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14833a, JobCrmApplicationsListInternalAction, JobCrmApplicationsListState, InterfaceC14834b> qVar2 = qVar;
        qVar2.f92008d = this.f129526l;
        qVar2.f92009e = this.f129527m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f129528n, this.f129529o);
        qVar2.f92010f = this.f129530p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
