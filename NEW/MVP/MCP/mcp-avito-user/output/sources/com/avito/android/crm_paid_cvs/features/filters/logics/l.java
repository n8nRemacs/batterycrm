package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.arch.mvi.u;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersInternalAction;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: FiltersReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/logics/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersState;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<FiltersInternalAction, FiltersState> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final FiltersState a(FiltersInternalAction filtersInternalAction, FiltersState filtersState) {
        FiltersInternalAction filtersInternalAction2 = filtersInternalAction;
        FiltersState filtersState2 = filtersState;
        if (filtersInternalAction2 instanceof FiltersInternalAction.ApplyFilters) {
            return filtersState2;
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.ShowFilters) {
            return new FiltersState(((FiltersInternalAction.ShowFilters) filtersInternalAction2).f130627b);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.DropFilters) {
            List<FilterItem> list = filtersState2.f130629b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (FilterItem filterItem : list) {
                List<OptionItem> list2 = filterItem.f130360e;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(OptionItem.a((OptionItem) it.next(), false, null, 45));
                }
                arrayList.add(FilterItem.a(filterItem, arrayList2));
            }
            return new FiltersState(arrayList);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.DropSelectFilterOptions) {
            return r.a(filtersState2, ((FiltersInternalAction.DropSelectFilterOptions) filtersInternalAction2).f130622b, m.f130649l);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.ToggleSwitch) {
            return r.a(filtersState2, ((FiltersInternalAction.ToggleSwitch) filtersInternalAction2).f130628b, q.f130653l);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.OptionsSelected) {
            FiltersInternalAction.OptionsSelected optionsSelected = (FiltersInternalAction.OptionsSelected) filtersInternalAction2;
            return r.a(filtersState2, optionsSelected.f130623b, new o(C42745f0.P0(optionsSelected.f130624c)));
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.ChipsClicked) {
            FiltersInternalAction.ChipsClicked chipsClicked = (FiltersInternalAction.ChipsClicked) filtersInternalAction2;
            return r.a(filtersState2, chipsClicked.f130619b, new n(chipsClicked.f130620c));
        }
        if (!(filtersInternalAction2 instanceof FiltersInternalAction.RangeChanged)) {
            throw new NoWhenBranchMatchedException();
        }
        FiltersInternalAction.RangeChanged rangeChanged = (FiltersInternalAction.RangeChanged) filtersInternalAction2;
        return r.a(filtersState2, rangeChanged.f130625b, new p(rangeChanged.f130626c));
    }
}
