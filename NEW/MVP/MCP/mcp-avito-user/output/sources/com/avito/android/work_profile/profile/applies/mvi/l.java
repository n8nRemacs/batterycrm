package com.avito.android.work_profile.profile.applies.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.work_profile.profile.applies.mvi.entity.AppliesToVacancyInternalAction;
import com.avito.android.work_profile.profile.applies.mvi.entity.Loader;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AppliesToVacancyReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "LjQ0/b;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<AppliesToVacancyInternalAction, jQ0.b> {
    @Inject
    public l() {
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final jQ0.b a(AppliesToVacancyInternalAction appliesToVacancyInternalAction, jQ0.b bVar) {
        AppliesToVacancyInternalAction appliesToVacancyInternalAction2 = appliesToVacancyInternalAction;
        jQ0.b bVar2 = bVar;
        if (appliesToVacancyInternalAction2 instanceof AppliesToVacancyInternalAction.AppliesDataLoaded) {
            return new jQ0.b(null, ((AppliesToVacancyInternalAction.AppliesDataLoaded) appliesToVacancyInternalAction2).f330890b, false, false);
        }
        if (appliesToVacancyInternalAction2 instanceof AppliesToVacancyInternalAction.LoadedListFailedResult) {
            return jQ0.b.a(bVar2, ((AppliesToVacancyInternalAction.LoadedListFailedResult) appliesToVacancyInternalAction2).f330891b.getMessage(), false, false);
        }
        if (!(appliesToVacancyInternalAction2 instanceof AppliesToVacancyInternalAction.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
        Loader loader = Loader.f330894b;
        Loader loader2 = ((AppliesToVacancyInternalAction.Loading) appliesToVacancyInternalAction2).f330893d;
        return jQ0.b.a(bVar2, null, loader2 == loader, loader2 == Loader.f330895c);
    }
}
