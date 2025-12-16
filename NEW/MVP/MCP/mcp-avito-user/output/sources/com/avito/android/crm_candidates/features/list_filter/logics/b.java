package com.avito.android.crm_candidates.features.list_filter.logics;

import Us.InterfaceC15563a;
import Vs.InterfaceC15712a;
import Vs.InterfaceC15713b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.crm_candidates.features.list_filter.entity.JobCrmListFilterState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JobCrmListFilterActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_candidates/features/list_filter/logics/b;", "Lcom/avito/android/arch/mvi/a;", "LVs/a;", "LVs/b;", "Lcom/avito/android/crm_candidates/features/list_filter/entity/JobCrmListFilterState;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC15712a, InterfaceC15713b, JobCrmListFilterState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15563a f129687a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f129688b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f129689c;

    @Inject
    public b(@Y61.k InterfaceC15563a interfaceC15563a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f129687a = interfaceC15563a;
        this.f129688b = interfaceC28373a;
        this.f129689c = e12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC15713b> b(InterfaceC15712a interfaceC15712a, JobCrmListFilterState jobCrmListFilterState) {
        return C43175k.G(new a(interfaceC15712a, this, jobCrmListFilterState, null));
    }
}
