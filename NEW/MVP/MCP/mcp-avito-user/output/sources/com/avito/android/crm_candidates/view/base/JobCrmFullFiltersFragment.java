package com.avito.android.crm_candidates.view.base;

import Cd.C13243a;
import Rs.InterfaceC15076a;
import Rs.InterfaceC15077b;
import Vs.InterfaceC15712a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.JobPaidCvsFiltersScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.di.full_filters.b;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersState;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import z1.AbstractC50339a;

/* compiled from: JobCrmFullFiltersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmFullFiltersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JobCrmFullFiltersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f129843x0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f129844n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f129845o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.features.full_filters.logics.v f129846p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f129847q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f129848r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.crm_candidates.view.dialogs.b f129849s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public N0 f129850t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public C29624b f129851u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.features.list_filter.logics.m f129852v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f129853w0;

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmFullFiltersFragment$a;", "", "<init>", "()V", "", "FILTER_ARG", "Ljava/lang/String;", "FILTER_RESULT", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/list_filter/logics/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/crm_candidates/features/list_filter/logics/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.crm_candidates.features.list_filter.logics.l> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.crm_candidates.features.list_filter.logics.l invoke() {
            com.avito.android.crm_candidates.features.list_filter.logics.m mVar = JobCrmFullFiltersFragment.this.f129852v0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.crm_candidates.features.list_filter.logics.l) mVar.get();
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            JobCrmFullFiltersFragment.this.getParentFragmentManager().Y();
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment.this.r5().accept(InterfaceC15076a.C0987a.f14699a);
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment.this.r5().accept(InterfaceC15076a.c.f14702a);
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRs/b;", "event", "Lkotlin/G0;", "invoke", "(LRs/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<InterfaceC15077b, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15077b interfaceC15077b) {
            C29624b c29624b;
            InterfaceC15077b interfaceC15077b2 = interfaceC15077b;
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment jobCrmFullFiltersFragment = JobCrmFullFiltersFragment.this;
            if (interfaceC15077b2 instanceof InterfaceC15077b.a) {
                jobCrmFullFiltersFragment.getParentFragmentManager().o0(C22777e.b(new kotlin.Q("FILTER_ARG", ((InterfaceC15077b.a) interfaceC15077b2).f14707a)), "FILTER_RESULT");
                jobCrmFullFiltersFragment.getParentFragmentManager().Y();
            } else if ((interfaceC15077b2 instanceof InterfaceC15077b.C0988b) && (c29624b = jobCrmFullFiltersFragment.f129851u0) != null) {
                c29624b.a(((InterfaceC15077b.C0988b) interfaceC15077b2).f14708a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<FiltersState, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(FiltersState filtersState) {
            FiltersState filtersState2 = filtersState;
            C29624b c29624b = JobCrmFullFiltersFragment.this.f129851u0;
            if (c29624b != null) {
                List<FilterItem> list = filtersState2.f129586b;
                D6.G(c29624b.f129904b, !list.isEmpty());
                c29624b.a(list);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "filterId", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "option", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.p<String, JobCrmListFilterItem, G0> {
        public h() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, JobCrmListFilterItem jobCrmListFilterItem) {
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment.this.r5().accept(new InterfaceC15076a.b(str, jobCrmListFilterItem));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "filterId", "Lkotlin/Q;", "", "range", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.p<String, kotlin.Q<? extends Long, ? extends Long>, G0> {
        public i() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, kotlin.Q<? extends Long, ? extends Long> q12) {
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment.this.r5().accept(new InterfaceC15076a.f(str, q12));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FilterItem;", "filter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/features/full_filters/entity/FilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<FilterItem, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(FilterItem filterItem) {
            FilterItem filterItem2 = filterItem;
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment jobCrmFullFiltersFragment = JobCrmFullFiltersFragment.this;
            Context contextRequireContext = jobCrmFullFiltersFragment.requireContext();
            com.avito.konveyor.a aVar2 = jobCrmFullFiltersFragment.f129845o0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            com.avito.konveyor.a aVar3 = aVar2;
            String str = filterItem2.f129564b;
            com.avito.android.crm_candidates.view.dialogs.b bVar = new com.avito.android.crm_candidates.view.dialogs.b(filterItem2.f129566d, contextRequireContext, aVar3, new G(jobCrmFullFiltersFragment, str), new H(jobCrmFullFiltersFragment), new I(jobCrmFullFiltersFragment), new K(jobCrmFullFiltersFragment, str));
            jobCrmFullFiltersFragment.f129849s0 = bVar;
            com.avito.android.lib.util.g.a(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<JobCrmListFilterItem, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmListFilterItem jobCrmListFilterItem) {
            JobCrmFullFiltersFragment.q5(JobCrmFullFiltersFragment.this).accept(new InterfaceC15712a.d(jobCrmListFilterItem));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "filterId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<String, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = JobCrmFullFiltersFragment.f129843x0;
            JobCrmFullFiltersFragment jobCrmFullFiltersFragment = JobCrmFullFiltersFragment.this;
            jobCrmFullFiltersFragment.r5().accept(new InterfaceC15076a.d(str));
            View view = jobCrmFullFiltersFragment.getView();
            if (view != null) {
                view.postDelayed(new F(jobCrmFullFiltersFragment), 300L);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129865l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f129865l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f129866l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Y41.a aVar) {
            super(0);
            this.f129866l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f129866l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JobCrmFullFiltersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f129868l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f129868l = oVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f129868l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129869l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129869l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f129869l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129870l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129870l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f129870l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f129871l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Y41.a aVar) {
            super(0);
            this.f129871l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f129871l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public t() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JobCrmFullFiltersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ t f129873l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(t tVar) {
            super(0);
            this.f129873l = tVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f129873l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129874l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129874l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f129874l.getValue()).getF42820b();
        }
    }

    /* compiled from: JobCrmFullFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/logics/u;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/crm_candidates/features/full_filters/logics/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.crm_candidates.features.full_filters.logics.u> {
        public w() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.crm_candidates.features.full_filters.logics.u invoke() {
            com.avito.android.crm_candidates.features.full_filters.logics.v vVar = JobCrmFullFiltersFragment.this.f129846p0;
            if (vVar == null) {
                vVar = null;
            }
            return (com.avito.android.crm_candidates.features.full_filters.logics.u) vVar.get();
        }
    }

    public JobCrmFullFiltersFragment() {
        super(R.layout.job_crm_candidates_filters_fragment);
        n nVar = new n(new w());
        o oVar = new o();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new p(oVar));
        n0 n0Var = m0.f406844a;
        this.f129847q0 = new O0(n0Var.b(com.avito.android.crm_candidates.features.full_filters.logics.u.class), new q(interfaceC42726CB), nVar, new r(interfaceC42726CB));
        s sVar = new s(new b());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new u(new t()));
        this.f129853w0 = new O0(n0Var.b(com.avito.android.crm_candidates.features.list_filter.logics.l.class), new v(interfaceC42726CB2), sVar, new m(interfaceC42726CB2));
    }

    public static final com.avito.android.crm_candidates.features.list_filter.logics.l q5(JobCrmFullFiltersFragment jobCrmFullFiltersFragment) {
        return (com.avito.android.crm_candidates.features.list_filter.logics.l) jobCrmFullFiltersFragment.f129853w0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f129848r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.crm_candidates.view.dialogs.b bVar = this.f129849s0;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f129849s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f129844n0;
        this.f129851u0 = new C29624b(view, dVar != null ? dVar : null, new c(), new d(), new e());
        ScreenPerformanceTracker screenPerformanceTracker = this.f129848r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, r5(), new f(), new g());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f129848r0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        View viewFindViewById = view.findViewById(R.id.filter_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        screenPerformanceTracker2.b((RecyclerView) viewFindViewById);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f129848r0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        C28478k c28478k = new C28478k(JobPaidCvsFiltersScreen.f90391d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.crm_candidates.di.full_filters.a.a();
        com.avito.android.crm_candidates.di.full_filters.d dVar = (com.avito.android.crm_candidates.di.full_filters.d) C29972i.a(C29972i.b(this), com.avito.android.crm_candidates.di.full_filters.d.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Resources resources = getResources();
        C22977J c22977jA = C22981N.a(getLifecycle());
        List parcelableArrayList = requireArguments().getParcelableArrayList("FILTER_ARG");
        if (parcelableArrayList == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        aVarA.a(dVar, interfaceC39417aB, c28478k, resources, c22977jA, parcelableArrayList, new h(), new i(), new j(), new k(), new l()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f129848r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f129848r0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.crm_candidates.features.full_filters.logics.u r5() {
        return (com.avito.android.crm_candidates.features.full_filters.logics.u) this.f129847q0.getValue();
    }
}
