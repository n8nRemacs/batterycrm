package com.avito.android.job.cv_packages.mvi;

import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CvPackagesBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/n;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements com.avito.android.arch.mvi.b<CvPackageInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.job.cv_packages.b f174485a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f174486b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f174487c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f174488d;

    @Inject
    public n(@Y61.k com.avito.android.job.cv_packages.b bVar, @Y61.k @com.avito.android.job.cv_packages.di.j String str, @Y61.l @com.avito.android.job.cv_packages.di.k String str2, boolean z12) {
        this.f174485a = bVar;
        this.f174486b = str;
        this.f174487c = str2;
        this.f174488d = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CvPackageInternalAction> a() {
        if (this.f174488d) {
            return C43175k.w();
        }
        return this.f174485a.a(this.f174486b, this.f174487c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
