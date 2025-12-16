package com.avito.android.crm_candidates.view.base;

import Cd.C13243a;
import Ps.InterfaceC14833a;
import Ts.InterfaceC15401a;
import Vs.InterfaceC15712a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22977J;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.JobEmployerCandidatesListScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.error_item.JobCrmErrorItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.JobCrmLoadingItem;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.di.C29972i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import z1.AbstractC50339a;

/* compiled from: JobCrmCandidatesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmCandidatesFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JobCrmCandidatesFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final a f129791O0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.account.E f129792A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.calendar_select.b f129793B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f129794C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public R0 f129795D0;

    /* renamed from: E0, reason: collision with root package name */
    public RecyclerView f129796E0;

    /* renamed from: F0, reason: collision with root package name */
    public RecyclerView f129797F0;

    /* renamed from: G0, reason: collision with root package name */
    public SwipeRefreshLayout f129798G0;

    /* renamed from: H0, reason: collision with root package name */
    public View f129799H0;

    /* renamed from: I0, reason: collision with root package name */
    public View f129800I0;

    /* renamed from: J0, reason: collision with root package name */
    public C42670a f129801J0;

    /* renamed from: K0, reason: collision with root package name */
    public View f129802K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.l
    public N0 f129803L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.crm_candidates.view.dialogs.b f129804M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public C43238h f129805N0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.features.applications_list.logics.s f129806n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f129807o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.features.inline_filters.logics.q f129808p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f129809q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.features.list_filter.logics.m f129810r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f129811s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f129812t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f129813u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f129814v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f129815w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.view.ui.counter_view.b f129816x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f129817y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f129818z0;

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmCandidatesFragment$a;", "", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[JobCrmApplicationsListState.ListState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JobCrmApplicationsListState.ListState listState = JobCrmApplicationsListState.ListState.f129502b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JobCrmApplicationsListState.ListState listState2 = JobCrmApplicationsListState.ListState.f129502b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/logics/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/crm_candidates/features/inline_filters/logics/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.crm_candidates.features.inline_filters.logics.p> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.crm_candidates.features.inline_filters.logics.p invoke() {
            com.avito.android.crm_candidates.features.inline_filters.logics.q qVar = JobCrmCandidatesFragment.this.f129808p0;
            if (qVar == null) {
                qVar = null;
            }
            return (com.avito.android.crm_candidates.features.inline_filters.logics.p) qVar.get();
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/list_filter/logics/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/crm_candidates/features/list_filter/logics/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.crm_candidates.features.list_filter.logics.l> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.crm_candidates.features.list_filter.logics.l invoke() {
            com.avito.android.crm_candidates.features.list_filter.logics.m mVar = JobCrmCandidatesFragment.this.f129810r0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.crm_candidates.features.list_filter.logics.l) mVar.get();
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/logics/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/crm_candidates/features/applications_list/logics/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.crm_candidates.features.applications_list.logics.r> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.crm_candidates.features.applications_list.logics.r invoke() {
            com.avito.android.crm_candidates.features.applications_list.logics.s sVar = JobCrmCandidatesFragment.this.f129806n0;
            if (sVar == null) {
                sVar = null;
            }
            return (com.avito.android.crm_candidates.features.applications_list.logics.r) sVar.get();
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/JobCrmApplicationItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/JobCrmApplicationItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<JobCrmApplicationItem, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmApplicationItem jobCrmApplicationItem) {
            a aVar = JobCrmCandidatesFragment.f129791O0;
            JobCrmCandidatesFragment.this.s5().accept(new InterfaceC14833a.h(jobCrmApplicationItem));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/loading_item/JobCrmLoadingItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/applications_list/loading_item/JobCrmLoadingItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<JobCrmLoadingItem, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmLoadingItem jobCrmLoadingItem) {
            a aVar = JobCrmCandidatesFragment.f129791O0;
            JobCrmCandidatesFragment.this.s5().accept(new InterfaceC14833a.c(jobCrmLoadingItem.f130081b));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/JobCrmErrorItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/JobCrmErrorItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<JobCrmErrorItem, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmErrorItem jobCrmErrorItem) {
            a aVar = JobCrmCandidatesFragment.f129791O0;
            JobCrmCandidatesFragment.this.s5().accept(new InterfaceC14833a.c(jobCrmErrorItem.f130069b));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/JobCrmBannerItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/JobCrmBannerItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<JobCrmBannerItem, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmBannerItem jobCrmBannerItem) {
            a aVar = JobCrmCandidatesFragment.f129791O0;
            JobCrmCandidatesFragment.this.s5().accept(new InterfaceC14833a.C0872a(jobCrmBannerItem));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/inline_filters/JobCrmInlineFilterItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/inline_filters/JobCrmInlineFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<JobCrmInlineFilterItem, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmInlineFilterItem jobCrmInlineFilterItem) {
            a aVar = JobCrmCandidatesFragment.f129791O0;
            JobCrmCandidatesFragment.this.r5().accept(new InterfaceC15401a.c(jobCrmInlineFilterItem));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<JobCrmListFilterItem, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmListFilterItem jobCrmListFilterItem) {
            JobCrmCandidatesFragment.q5(JobCrmCandidatesFragment.this).accept(new InterfaceC15712a.d(jobCrmListFilterItem));
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129828l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129828l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f129828l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f129829l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f129829l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f129829l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JobCrmCandidatesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f129831l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f129831l = nVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f129831l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129832l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129832l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f129832l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129833l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129833l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f129833l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f129834l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Y41.a aVar) {
            super(0);
            this.f129834l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f129834l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JobCrmCandidatesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f129836l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(s sVar) {
            super(0);
            this.f129836l = sVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f129836l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129837l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129837l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f129837l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129838l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f129838l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f129839l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Y41.a aVar) {
            super(0);
            this.f129839l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f129839l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public x() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JobCrmCandidatesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x f129841l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(x xVar) {
            super(0);
            this.f129841l = xVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f129841l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129842l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f129842l.getValue()).getF42820b();
        }
    }

    public JobCrmCandidatesFragment() {
        super(R.layout.job_employers_crm_candidates_fragment);
        r rVar = new r(new e());
        s sVar = new s();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new t(sVar));
        n0 n0Var = m0.f406844a;
        this.f129807o0 = new O0(n0Var.b(com.avito.android.crm_candidates.features.applications_list.logics.r.class), new u(interfaceC42726CB), rVar, new v(interfaceC42726CB));
        w wVar = new w(new c());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new y(new x()));
        this.f129809q0 = new O0(n0Var.b(com.avito.android.crm_candidates.features.inline_filters.logics.p.class), new z(interfaceC42726CB2), wVar, new l(interfaceC42726CB2));
        m mVar = new m(new d());
        InterfaceC42726C interfaceC42726CB3 = C42727D.b(lazyThreadSafetyMode, new o(new n()));
        this.f129811s0 = new O0(n0Var.b(com.avito.android.crm_candidates.features.list_filter.logics.l.class), new p(interfaceC42726CB3), mVar, new q(interfaceC42726CB3));
    }

    public static final com.avito.android.crm_candidates.features.list_filter.logics.l q5(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
        return (com.avito.android.crm_candidates.features.list_filter.logics.l) jobCrmCandidatesFragment.f129811s0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f129817y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        com.avito.android.crm_candidates.view.dialogs.b bVar = this.f129804M0;
        if (bVar != null) {
            bVar.dismiss();
        }
        N0 n02 = this.f129803L0;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        C43238h c43238h = this.f129805N0;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        super.onDetach();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.avito.android.crm_candidates.view.ui.counter_view.b bVar = this.f129816x0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.f130274d = null;
        bVar.f130275e.e();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.crm_candidates.view.ui.counter_view.b bVar = this.f129816x0;
        if (bVar == null) {
            bVar = null;
        }
        C22977J c22977jA = C22984Q.a(getViewLifecycleOwner());
        View viewFindViewById = requireView().findViewById(R.id.counter_blue);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = requireView().findViewById(R.id.counter_red);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        bVar.f130274d = c22977jA;
        bVar.f130272b = textView;
        bVar.f130273c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.filters_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f129796E0 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = requireView().findViewById(R.id.response_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f129797F0 = recyclerView;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.f129797F0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        com.avito.konveyor.adapter.d dVar = this.f129812t0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView2.setAdapter(dVar);
        RecyclerView recyclerView3 = this.f129796E0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView4 = this.f129796E0;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        com.avito.konveyor.adapter.d dVar2 = this.f129813u0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        recyclerView4.setAdapter(dVar2);
        View viewFindViewById3 = requireView().findViewById(R.id.pull_to_refresh_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        this.f129798G0 = (SwipeRefreshLayout) viewFindViewById3;
        View viewFindViewById4 = requireView().findViewById(R.id.empty_list_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f129799H0 = viewFindViewById4;
        View viewFindViewById5 = requireView().findViewById(R.id.drop_filters_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f129800I0 = viewFindViewById5;
        View viewFindViewById6 = requireView().findViewById(R.id.progress_root);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f129801J0 = new C42670a((ViewGroup) viewFindViewById6, new C29633k(this), 0, 4, null);
        View viewFindViewById7 = requireView().findViewById(R.id.back_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f129802K0 = viewFindViewById7;
        SwipeRefreshLayout swipeRefreshLayout = this.f129798G0;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 8));
        View view2 = this.f129802K0;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnClickListener(new ViewOnClickListenerC29632j(this, 0));
        View view3 = this.f129800I0;
        if (view3 == null) {
            view3 = null;
        }
        view3.setOnClickListener(new ViewOnClickListenerC29632j(this, 1));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new A(this, null), 3);
        R0 r02 = this.f129795D0;
        if (r02 == null) {
            r02 = null;
        }
        C43238h c43238hA = U.a(r02.b());
        this.f129805N0 = c43238hA;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f129794C0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new B(this, null), new C(kotlinx.coroutines.rx3.y.a(aVar.d9()))), c43238hA);
        ScreenPerformanceTracker screenPerformanceTracker = this.f129817y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        RecyclerView recyclerView5 = this.f129797F0;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        screenPerformanceTracker.b(recyclerView5);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f129817y0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        com.avito.android.crm_candidates.di.candidates.a.a().a((com.avito.android.crm_candidates.di.candidates.c) C29972i.a(C29972i.b(this), com.avito.android.crm_candidates.di.candidates.c.class), cv.c.b(this), new C28478k(JobEmployerCandidatesListScreen.f90390d, com.avito.android.analytics.screens.s.c(this), null, 4, null), getResources(), new f(), new g(), new h(), new i(), new j(), new k()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f129817y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f129817y0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.crm_candidates.features.inline_filters.logics.p r5() {
        return (com.avito.android.crm_candidates.features.inline_filters.logics.p) this.f129809q0.getValue();
    }

    public final com.avito.android.crm_candidates.features.applications_list.logics.r s5() {
        return (com.avito.android.crm_candidates.features.applications_list.logics.r) this.f129807o0.getValue();
    }

    public final void t5() {
        RecyclerView recyclerView = this.f129797F0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.J0();
        RecyclerView recyclerView2 = this.f129797F0;
        (recyclerView2 != null ? recyclerView2 : null).A0(0);
        s5().accept(InterfaceC14833a.l.f13356a);
        r5().accept(InterfaceC15401a.d.f15958a);
    }

    public final void u5() {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(requireContext().getString(R.string.crm_error));
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.c(cVar, this, printableTextF, null, null, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
    }
}
