package com.avito.android.job.cv_packages;

import Cd.C13243a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.job.cv_packages.mvi.r;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: JobCvPackagesActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/cv_packages/JobCvPackagesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JobCvPackagesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f174316r = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l f174317m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f174318n = new O0(m0.f406844a.b(k.class), new e(), new d(new g()), new f());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f174319o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f174320p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f174321q;

    /* compiled from: JobCvPackagesActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<r, G0> {
        @Override // Y41.l
        public final G0 invoke(r rVar) {
            r rVar2 = rVar;
            JobCvPackagesActivity jobCvPackagesActivity = (JobCvPackagesActivity) this.receiver;
            int i12 = JobCvPackagesActivity.f174316r;
            jobCvPackagesActivity.getClass();
            if (rVar2 instanceof r.b) {
                Intent intent = new Intent();
                intent.putExtra("extra_single_cv_flag", ((r.b) rVar2).f174505a);
                G0 g02 = G0.f406611a;
                jobCvPackagesActivity.setResult(-1, intent);
                jobCvPackagesActivity.finish();
            } else if (rVar2 instanceof r.a) {
                jobCvPackagesActivity.getF21241d().c();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JobCvPackagesActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/a;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/job/cv_packages/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.android.job.cv_packages.mvi.entity.a, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f174323m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(1);
            this.f174323m = jVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.job.cv_packages.mvi.entity.a aVar) {
            com.avito.android.job.cv_packages.mvi.entity.a aVar2 = aVar;
            ScreenPerformanceTracker screenPerformanceTracker = JobCvPackagesActivity.this.f174321q;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(aVar2, screenPerformanceTracker, new com.avito.android.job.cv_packages.g(this.f174323m));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCvPackagesActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LcQ/b;", "it", "Lkotlin/G0;", "invoke", "(LcQ/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<cQ.b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(cQ.b bVar) {
            int i12 = JobCvPackagesActivity.f174316r;
            ((k) JobCvPackagesActivity.this.f174318n.getValue()).accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f174325l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f174325l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f174325l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return JobCvPackagesActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return JobCvPackagesActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: JobCvPackagesActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/job/cv_packages/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<k> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final k invoke() {
            l lVar = JobCvPackagesActivity.this.f174317m;
            if (lVar == null) {
                lVar = null;
            }
            return (k) lVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("extra_resume_id");
        String stringExtra2 = getIntent().getStringExtra("extra_vertical_type");
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.job.cv_packages.di.i.a().a((com.avito.android.job.cv_packages.di.b) C29972i.a(C29972i.b(this), com.avito.android.job.cv_packages.di.b.class), this, s.a(this), bundle != null, stringExtra, stringExtra2, cv.c.a(this), new com.avito.android.job.cv_packages.f(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f174321q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f174321q;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        super.onCreate(bundle);
        setContentView(R.layout.cv_packages_activity);
        View viewFindViewById = findViewById(R.id.packages_root);
        c cVar = new c();
        com.avito.konveyor.adapter.j jVar = this.f174319o;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f174320p;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.arch.mvi.android.f.b(this, (k) this.f174318n.getValue(), new a(1, this, JobCvPackagesActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/job/cv_packages/mvi/CvPackagesOneTimeEvent;)V", 0), new b(new j(cVar, viewFindViewById, aVar, jVar)));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f174321q;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
