package com.avito.android.job.cv_packages.mvi;

import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import com.avito.android.job.cv_packages.mvi.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvPackagesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/job/cv_packages/mvi/r;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements com.avito.android.arch.mvi.t<CvPackageInternalAction, r> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final r b(CvPackageInternalAction cvPackageInternalAction) {
        CvPackageInternalAction cvPackageInternalAction2 = cvPackageInternalAction;
        if (cvPackageInternalAction2 instanceof CvPackageInternalAction.ExitFromFlowWithSomeResult) {
            return new r.b(((CvPackageInternalAction.ExitFromFlowWithSomeResult) cvPackageInternalAction2).f174457b);
        }
        if (cvPackageInternalAction2.equals(CvPackageInternalAction.Exit.f174456b)) {
            return r.a.f174504a;
        }
        return null;
    }
}
