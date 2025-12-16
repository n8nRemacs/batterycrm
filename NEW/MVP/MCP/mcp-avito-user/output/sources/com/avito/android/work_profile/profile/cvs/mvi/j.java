package com.avito.android.work_profile.profile.cvs.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.work_profile.profile.cvs.mvi.entity.CvsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import mQ0.C44003b;

/* compiled from: CvsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "LmQ0/b;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements u<CvsInternalAction, C44003b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44003b a(CvsInternalAction cvsInternalAction, C44003b c44003b) {
        CvsInternalAction cvsInternalAction2 = cvsInternalAction;
        if (cvsInternalAction2 instanceof CvsInternalAction.Loading) {
            return new C44003b(C42784z0.f406748b, null, ((CvsInternalAction.Loading) cvsInternalAction2).f331054d, null);
        }
        if (cvsInternalAction2 instanceof CvsInternalAction.LoadedWithSuccess) {
            CvsInternalAction.LoadedWithSuccess loadedWithSuccess = (CvsInternalAction.LoadedWithSuccess) cvsInternalAction2;
            return new C44003b(loadedWithSuccess.f331052b, loadedWithSuccess.f331053c, false, null);
        }
        if (cvsInternalAction2 instanceof CvsInternalAction.LoadedWithError) {
            return new C44003b(C42784z0.f406748b, null, false, ((CvsInternalAction.LoadedWithError) cvsInternalAction2).f331050b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
