package com.avito.android.crm_candidates.features.applications_list.logics;

import androidx.compose.runtime.C22026a;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.JobCrmLoadingItem;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmApplicationsListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-candidates_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p {
    public static final JobCrmApplicationsListState a(JobCrmApplicationsListState jobCrmApplicationsListState, List list) {
        ArrayList arrayList = new ArrayList(jobCrmApplicationsListState.f129501f);
        if (!arrayList.isEmpty() && (C42745f0.Q(arrayList) instanceof JobCrmLoadingItem)) {
            C22026a.e(1, arrayList);
        }
        C42745f0.h(list, arrayList);
        if (!list.isEmpty()) {
            arrayList.add(new JobCrmLoadingItem(((ParcelableItem) C42745f0.Q(list)).getF79990c(), false, null, 4, null));
        }
        G0 g02 = G0.f406611a;
        return JobCrmApplicationsListState.a(jobCrmApplicationsListState, false, arrayList, 15);
    }

    public static final JobCrmApplicationsListState b(JobCrmApplicationsListState jobCrmApplicationsListState, ParcelableItem parcelableItem) {
        ArrayList arrayList = new ArrayList(jobCrmApplicationsListState.f129501f);
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((ParcelableItem) it.next()).getF79990c(), parcelableItem.getF79990c())) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            arrayList.set(i12, parcelableItem);
        }
        G0 g02 = G0.f406611a;
        return JobCrmApplicationsListState.a(jobCrmApplicationsListState, false, arrayList, 15);
    }

    public static JobCrmApplicationsListState c(JobCrmApplicationsListState.ListState listState, int i12) {
        if ((i12 & 1) != 0) {
            listState = JobCrmApplicationsListState.ListState.f129504d;
        }
        return new JobCrmApplicationsListState(listState, (i12 & 2) == 0, false, (i12 & 8) == 0, C42784z0.f406748b);
    }
}
