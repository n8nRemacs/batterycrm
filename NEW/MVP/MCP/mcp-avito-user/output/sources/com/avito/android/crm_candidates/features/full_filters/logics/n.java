package com.avito.android.crm_candidates.features.full_filters.logics;

import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersInternalAction;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersState;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.remote.model.ProfileTab;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: FiltersReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/logics/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersState;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements com.avito.android.arch.mvi.u<FiltersInternalAction, FiltersState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final FiltersState a(FiltersInternalAction filtersInternalAction, FiltersState filtersState) {
        FiltersInternalAction filtersInternalAction2 = filtersInternalAction;
        FiltersState filtersState2 = filtersState;
        if (filtersInternalAction2 instanceof FiltersInternalAction.ApplyFilters) {
            return filtersState2;
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.ShowFilters) {
            return new FiltersState(((FiltersInternalAction.ShowFilters) filtersInternalAction2).f129585b);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.DropFilters) {
            List<FilterItem> list = filtersState2.f129586b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (FilterItem filterItem : list) {
                List<JobCrmListFilterItem> list2 = filterItem.f129567e;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (JobCrmListFilterItem jobCrmListFilterItem : list2) {
                    arrayList2.add(filterItem.f129565c == FilterItem.FilterType.f129568b ? JobCrmListFilterItem.a(jobCrmListFilterItem, L.f(jobCrmListFilterItem.f130144j, "day30"), null, null, 503) : L.f(filterItem.f129564b, "statuses") ? JobCrmListFilterItem.a(jobCrmListFilterItem, L.f(jobCrmListFilterItem.f130144j, ProfileTab.ALL), null, null, 503) : JobCrmListFilterItem.a(jobCrmListFilterItem, false, null, null, 375));
                }
                arrayList.add(FilterItem.a(filterItem, arrayList2));
            }
            return new FiltersState(arrayList);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.DropSelectFilterOptions) {
            String str = ((FiltersInternalAction.DropSelectFilterOptions) filtersInternalAction2).f129579b;
            return s.a(filtersState2, str, new o(str));
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.OptionsSelected) {
            FiltersInternalAction.OptionsSelected optionsSelected = (FiltersInternalAction.OptionsSelected) filtersInternalAction2;
            return s.a(filtersState2, optionsSelected.f129580b, new q(C42745f0.P0(optionsSelected.f129581c)));
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.ChipsClicked) {
            FiltersInternalAction.ChipsClicked chipsClicked = (FiltersInternalAction.ChipsClicked) filtersInternalAction2;
            return s.a(filtersState2, chipsClicked.f129576b, new p(chipsClicked.f129577c));
        }
        if (!(filtersInternalAction2 instanceof FiltersInternalAction.RangeChanged)) {
            throw new NoWhenBranchMatchedException();
        }
        FiltersInternalAction.RangeChanged rangeChanged = (FiltersInternalAction.RangeChanged) filtersInternalAction2;
        return s.a(filtersState2, rangeChanged.f129583b, new r(rangeChanged.f129584c));
    }
}
