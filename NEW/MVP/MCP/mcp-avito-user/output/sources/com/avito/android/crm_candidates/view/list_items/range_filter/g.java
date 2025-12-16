package com.avito.android.crm_candidates.view.list_items.range_filter;

import Y41.p;
import Y61.k;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;

/* compiled from: RangeFilterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/range_filter/g;", "Lcom/avito/android/crm_candidates/view/list_items/range_filter/e;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<String, Q<Long, Long>, G0> f130194b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k p<? super String, ? super Q<Long, Long>, G0> pVar) {
        this.f130194b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Q<Long, Long> q12;
        i iVar = (i) eVar;
        FilterItem filterItem = (FilterItem) aVar;
        iVar.setTitle(filterItem.f129566d);
        JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) C42745f0.G(filterItem.f129567e);
        if (jobCrmListFilterItem == null || (q12 = jobCrmListFilterItem.f130143i) == null) {
            q12 = new Q<>(null, null);
        }
        iVar.I9(q12);
        iVar.Z6(new f(this, filterItem));
    }
}
