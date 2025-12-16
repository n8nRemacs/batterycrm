package com.avito.android.job.cv_packages.mvi;

import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: CvPackageActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LcQ/b;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "a", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<cQ.b, CvPackageInternalAction, com.avito.android.job.cv_packages.mvi.entity.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f174425a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.job.cv_packages.b f174426b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f174427c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f174428d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f174429e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f174430f;

    /* compiled from: CvPackageActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/a$a;", "", "a", "b", "Lcom/avito/android/job/cv_packages/mvi/a$a$a;", "Lcom/avito/android/job/cv_packages/mvi/a$a$b;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.job.cv_packages.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC5142a {

        /* compiled from: CvPackageActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/a$a$a;", "Lcom/avito/android/job/cv_packages/mvi/a$a;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.job.cv_packages.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C5143a implements InterfaceC5142a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5143a f174431a = new C5143a();
        }

        /* compiled from: CvPackageActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/a$a$b;", "Lcom/avito/android/job/cv_packages/mvi/a$a;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.job.cv_packages.mvi.a$a$b */
        public static final class b implements InterfaceC5142a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f174432a = new b();
        }
    }

    @Inject
    public a(@Y61.k h hVar, @Y61.k com.avito.android.job.cv_packages.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02, @Y61.k @com.avito.android.job.cv_packages.di.j String str, @Y61.l @com.avito.android.job.cv_packages.di.k String str2) {
        this.f174425a = hVar;
        this.f174426b = bVar;
        this.f174427c = aVar;
        this.f174428d = r02;
        this.f174429e = str;
        this.f174430f = str2;
    }

    @Override // com.avito.android.arch.mvi.a
    @B0
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        h hVar = this.f174425a;
        return C43175k.I(this.f174428d.c(), C43175k.C(new c(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(C43175k.N(c43197r1, C43175k.I(hVar.f174475b.c(), new C43152f0(C43175k.G(new g(y.a(hVar.f174474a.d9()), null, hVar)), new f(3, null)))), b.f174433l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CvPackageInternalAction> b(cQ.b bVar, com.avito.android.job.cv_packages.mvi.entity.a aVar) {
        return C43175k.G(new e(bVar, this, null));
    }
}
