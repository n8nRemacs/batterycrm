package com.avito.android.crm_candidates.features.full_filters.logics;

import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "option", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class q extends N implements Y41.l<JobCrmListFilterItem, JobCrmListFilterItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<JobCrmListFilterItem> f129623l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Set<JobCrmListFilterItem> set) {
        super(1);
        this.f129623l = set;
    }

    @Override // Y41.l
    public final JobCrmListFilterItem invoke(JobCrmListFilterItem jobCrmListFilterItem) {
        JobCrmListFilterItem jobCrmListFilterItem2 = jobCrmListFilterItem;
        Set<JobCrmListFilterItem> set = this.f129623l;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((JobCrmListFilterItem) it.next()).f130144j);
        }
        return JobCrmListFilterItem.a(jobCrmListFilterItem2, arrayList.contains(jobCrmListFilterItem2.f130144j), null, null, 503);
    }
}
