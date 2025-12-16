package com.avito.android.crm_candidates.features.full_filters.logics;

import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: FiltersReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "option", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r extends N implements Y41.l<JobCrmListFilterItem, JobCrmListFilterItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q<Long, Long> f129624l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Q<Long, Long> q12) {
        super(1);
        this.f129624l = q12;
    }

    @Override // Y41.l
    public final JobCrmListFilterItem invoke(JobCrmListFilterItem jobCrmListFilterItem) {
        JobCrmListFilterItem jobCrmListFilterItem2 = jobCrmListFilterItem;
        Q<Long, Long> q12 = this.f129624l;
        return JobCrmListFilterItem.a(jobCrmListFilterItem2, (q12.f406619b == null && q12.f406620c == null) ? false : true, null, q12, 375);
    }
}
