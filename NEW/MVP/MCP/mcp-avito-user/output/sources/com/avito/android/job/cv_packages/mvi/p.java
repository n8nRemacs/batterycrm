package com.avito.android.job.cv_packages.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import com.avito.android.job.cv_packages.mvi.entity.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CvPackagesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/p;", "Lcom/avito/android/arch/mvi/q;", "LcQ/b;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "Lcom/avito/android/job/cv_packages/mvi/r;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p extends com.avito.android.arch.mvi.q<cQ.b, CvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a, r> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f174493k;

    /* compiled from: CvPackagesFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LcQ/b;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "Lcom/avito/android/job/cv_packages/mvi/r;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<cQ.b, CvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a, r>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f174494l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f174495m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.job.cv_packages.mvi.a f174496n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ s f174497o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ n f174498p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.job.cv_packages.mvi.a aVar, l lVar, n nVar, s sVar) {
            super(1);
            this.f174494l = screenPerformanceTracker;
            this.f174495m = lVar;
            this.f174496n = aVar;
            this.f174497o = sVar;
            this.f174498p = nVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<cQ.b, CvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a, r> qVar) {
            com.avito.android.arch.mvi.q<cQ.b, CvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a, r> qVar2 = qVar;
            qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f174494l, this.f174495m);
            qVar2.f92009e = this.f174496n;
            qVar2.f92010f = this.f174497o;
            qVar2.f92008d = this.f174498p;
            return G0.f406611a;
        }
    }

    @Inject
    public p(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.job.cv_packages.mvi.a aVar, @Y61.k l lVar, @Y61.k n nVar, @Y61.k s sVar) {
        super("cvPackages", a.c.f174463b, new a(screenPerformanceTracker, aVar, lVar, nVar, sVar));
        this.f174493k = screenPerformanceTracker;
    }
}
