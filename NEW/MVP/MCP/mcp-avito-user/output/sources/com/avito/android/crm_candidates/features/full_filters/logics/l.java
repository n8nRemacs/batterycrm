package com.avito.android.crm_candidates.features.full_filters.logics;

import Rs.InterfaceC15077b;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/logics/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "LRs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements com.avito.android.arch.mvi.t<FiltersInternalAction, InterfaceC15077b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15077b b(FiltersInternalAction filtersInternalAction) {
        FiltersInternalAction filtersInternalAction2 = filtersInternalAction;
        if (filtersInternalAction2 instanceof FiltersInternalAction.ApplyFilters) {
            return new InterfaceC15077b.a(((FiltersInternalAction.ApplyFilters) filtersInternalAction2).f129575b);
        }
        if (filtersInternalAction2 instanceof FiltersInternalAction.OptionsSelected) {
            return new InterfaceC15077b.C0988b(((FiltersInternalAction.OptionsSelected) filtersInternalAction2).f129582d);
        }
        return null;
    }
}
