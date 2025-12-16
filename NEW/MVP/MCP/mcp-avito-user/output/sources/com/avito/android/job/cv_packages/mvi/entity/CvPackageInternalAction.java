package com.avito.android.job.cv_packages.mvi.entity;

import Y61.k;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.job.cv_packages.mvi.entity.a;
import kotlin.Metadata;

/* compiled from: CvPackageInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Exit", "ExitFromFlowWithSomeResult", "PackagesResult", "StartLoading", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$Exit;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$ExitFromFlowWithSomeResult;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$PackagesResult;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$StartLoading;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CvPackageInternalAction extends n {

    /* compiled from: CvPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$Exit;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Exit implements CvPackageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Exit f174456b = new Exit();

        private Exit() {
        }
    }

    /* compiled from: CvPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$ExitFromFlowWithSomeResult;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExitFromFlowWithSomeResult implements CvPackageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f174457b;

        public ExitFromFlowWithSomeResult(boolean z12) {
            this.f174457b = z12;
        }
    }

    /* compiled from: CvPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$PackagesResult;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PackagesResult implements CvPackageInternalAction, TrackableContent, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f174458b;

        public PackagesResult(@k a aVar) {
            this.f174458b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF261005e() {
            return "contactPackageList";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e */
        public final String getF303160d() {
            return "contactPackageList";
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF212545c() {
            a aVar = this.f174458b;
            if (aVar instanceof a.b) {
                J.a.f90383b.getClass();
                return J.a.C2676a.b(((a.b) aVar).f174462b);
            }
            J.a.f90383b.getClass();
            return J.a.C2676a.d();
        }
    }

    /* compiled from: CvPackageInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction$StartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements CvPackageInternalAction {
    }
}
