package com.avito.android.crm_candidates.features.list_filter.logics;

import com.avito.android.crm_candidates.domain.DateInterval;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmListFilterExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-candidates_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    public static final ArrayList a(List list, JobCrmListFilterItem jobCrmListFilterItem) {
        List<JobCrmListFilterItem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (JobCrmListFilterItem jobCrmListFilterItem2 : list2) {
            boolean zF2 = L.f(jobCrmListFilterItem2.f130144j, jobCrmListFilterItem.f130144j);
            DateInterval dateInterval = jobCrmListFilterItem2.f130142h;
            boolean z12 = dateInterval instanceof DateInterval.Calendar;
            boolean z13 = jobCrmListFilterItem2.f130139e;
            boolean z14 = jobCrmListFilterItem2.f130140f;
            if (z14 && zF2) {
                zF2 = !z13;
            } else if (z14) {
                zF2 = z13;
            }
            if (z12) {
                dateInterval = DateInterval.EmptyCalendar.f129343b;
            }
            arrayList.add(JobCrmListFilterItem.a(jobCrmListFilterItem2, zF2, dateInterval, null, 439));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(JobCrmListFilterItem.a((JobCrmListFilterItem) it.next(), false, null, null, 503));
        }
        return arrayList;
    }
}
