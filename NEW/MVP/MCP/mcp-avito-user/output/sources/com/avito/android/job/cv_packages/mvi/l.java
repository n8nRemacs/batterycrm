package com.avito.android.job.cv_packages.mvi;

import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import com.avito.android.job.cv_packages.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvPackageReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements com.avito.android.arch.mvi.u<CvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.job.cv_packages.mvi.entity.a a(CvPackageInternalAction cvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a aVar) {
        CvPackageInternalAction cvPackageInternalAction2 = cvPackageInternalAction;
        com.avito.android.job.cv_packages.mvi.entity.a aVar2 = aVar;
        if (cvPackageInternalAction2 instanceof CvPackageInternalAction.StartLoading) {
            return a.c.f174463b;
        }
        if (!(cvPackageInternalAction2 instanceof CvPackageInternalAction.PackagesResult)) {
            return aVar2;
        }
        com.avito.android.job.cv_packages.mvi.entity.a aVar3 = ((CvPackageInternalAction.PackagesResult) cvPackageInternalAction2).f174458b;
        if (!(aVar3 instanceof a.b) && !(aVar3 instanceof a.C5146a)) {
            aVar3 = null;
        }
        return aVar3 == null ? aVar2 : aVar3;
    }
}
