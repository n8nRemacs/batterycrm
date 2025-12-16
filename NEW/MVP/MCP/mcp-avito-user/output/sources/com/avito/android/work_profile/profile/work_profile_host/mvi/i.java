package com.avito.android.work_profile.profile.work_profile_host.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.work_profile.profile.work_profile_host.mvi.entity.WorkProfileHostInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import rQ0.C47587b;

/* compiled from: WorkProfileHostReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "LrQ0/b;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements u<WorkProfileHostInternalAction, C47587b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47587b a(WorkProfileHostInternalAction workProfileHostInternalAction, C47587b c47587b) {
        C47587b c47587b2;
        WorkProfileHostInternalAction workProfileHostInternalAction2 = workProfileHostInternalAction;
        C47587b c47587b3 = c47587b;
        if (workProfileHostInternalAction2 instanceof WorkProfileHostInternalAction.Loading) {
            return new C47587b(C42784z0.f406748b, null, true, null);
        }
        if (workProfileHostInternalAction2 instanceof WorkProfileHostInternalAction.LoadedWithSuccess) {
            WorkProfileHostInternalAction.LoadedWithSuccess loadedWithSuccess = (WorkProfileHostInternalAction.LoadedWithSuccess) workProfileHostInternalAction2;
            return new C47587b(loadedWithSuccess.f331279b, loadedWithSuccess.f331280c, false, null);
        }
        if (workProfileHostInternalAction2 instanceof WorkProfileHostInternalAction.LoadedWithError) {
            c47587b2 = new C47587b(C42784z0.f406748b, null, false, ((WorkProfileHostInternalAction.LoadedWithError) workProfileHostInternalAction2).f331277b);
        } else {
            if (!(workProfileHostInternalAction2 instanceof WorkProfileHostInternalAction.NewTabSelected)) {
                throw new NoWhenBranchMatchedException();
            }
            c47587b2 = new C47587b(c47587b3.f429810b, ((WorkProfileHostInternalAction.NewTabSelected) workProfileHostInternalAction2).f331281b, c47587b3.f429812d, c47587b3.f429813e);
        }
        return c47587b2;
    }
}
