package com.avito.android.crm_candidates.features.inline_filters.logics;

import com.avito.android.arch.mvi.u;
import com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmInlineFiltersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/logics/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "LTs/c;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<JobCrmInlineFiltersInternalAction, Ts.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ts.c a(JobCrmInlineFiltersInternalAction jobCrmInlineFiltersInternalAction, Ts.c cVar) {
        JobCrmInlineFiltersInternalAction jobCrmInlineFiltersInternalAction2 = jobCrmInlineFiltersInternalAction;
        Ts.c cVar2 = cVar;
        if (!(jobCrmInlineFiltersInternalAction2 instanceof JobCrmInlineFiltersInternalAction.ShowFilters)) {
            return cVar2;
        }
        List<JobCrmInlineFilterItem> list = new Ts.c(((JobCrmInlineFiltersInternalAction.ShowFilters) jobCrmInlineFiltersInternalAction2).f129631b).f15962b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (n.f129669a.contains(((JobCrmInlineFilterItem) obj).f130103b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(new JobCrmInlineFilterItem("ALL_FILTERS_ID", JobCrmInlineFilterItem.FilterType.f130116k, "Фильтры", false, ""));
        return new Ts.c(arrayList2);
    }
}
