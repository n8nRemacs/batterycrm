package com.avito.android.work_profile.profile.applies.ui;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.event.r;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import iQ0.C41334b;
import iQ0.C41335c;
import iQ0.InterfaceC41333a;
import jQ0.AbstractC42297a;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: AppliesToVacancyFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/AppliesToVacancyFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LiQ0/a;", "<init>", "()V", "a", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppliesToVacancyFragment extends BaseFragment implements InterfaceC28477j.b, InterfaceC41333a {

    /* renamed from: u0, reason: collision with root package name */
    @k
    public static final a f330911u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public C41335c f330912n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f330913o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f330914p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f330915q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C29640d f330916r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.avito.android.work_profile.profile.applies.ui.b f330917s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final O0 f330918t0;

    /* compiled from: AppliesToVacancyFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/AppliesToVacancyFragment$a;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AppliesToVacancyFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<AbstractC42297a, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC42297a abstractC42297a) {
            ((C41334b) this.receiver).accept(abstractC42297a);
            return G0.f406611a;
        }
    }

    /* compiled from: AppliesToVacancyFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<jQ0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(jQ0.b bVar) {
            G0 g02;
            jQ0.b bVar2 = bVar;
            com.avito.android.work_profile.profile.applies.ui.b bVar3 = (com.avito.android.work_profile.profile.applies.ui.b) this.receiver;
            com.avito.android.progress_overlay.l lVar = bVar3.f330926b;
            if (bVar2.f405610d) {
                lVar.k(null);
            } else {
                if (bVar2.f405609c != null) {
                    lVar.a("");
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    lVar.j();
                }
            }
            bVar3.f330927c.setRefreshing(bVar2.f405611e);
            bVar3.f330925a.l(bVar2.f405608b, null);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f330919l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f330919l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f330919l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AppliesToVacancyFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f330921l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f330921l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f330921l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f330922l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f330922l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f330922l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f330923l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f330923l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f330923l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AppliesToVacancyFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LiQ0/b;", "kotlin.jvm.PlatformType", "invoke", "()LiQ0/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<C41334b> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final C41334b invoke() {
            C41335c c41335c = AppliesToVacancyFragment.this.f330912n0;
            if (c41335c == null) {
                c41335c = null;
            }
            return (C41334b) c41335c.get();
        }
    }

    public AppliesToVacancyFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f330918t0 = new O0(m0.f406844a.b(C41334b.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // iQ0.InterfaceC41333a
    public final void G3(@k DeepLink deepLink, @k String str) {
        InterfaceC28373a interfaceC28373a = this.f330914p0;
        C42822w c42822w = null;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        r.f90128e.getClass();
        r rVar = new r(c42822w);
        LinkedHashMap linkedHashMap = rVar.f90131d;
        linkedHashMap.put("iid", str);
        linkedHashMap.put("from_page", "job_my_applies");
        interfaceC28373a.c(rVar);
        q5().accept(new AbstractC42297a.C11564a(deepLink, null, 2, null));
    }

    @Override // iQ0.InterfaceC41333a
    public final void H1(@k DeepLink deepLink) {
        q5().accept(new AbstractC42297a.C11564a(deepLink, null, 2, null));
    }

    @Override // iQ0.InterfaceC41333a
    public final void N4(@k DeepLink deepLink, @k String str) {
        InterfaceC28373a interfaceC28373a = this.f330914p0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C29640d c29640d = this.f330916r0;
        C29640d c29640d2 = c29640d != null ? c29640d : null;
        InterfaceC28373a interfaceC28373a2 = this.f330914p0;
        interfaceC28373a.c(new i1(c29640d2, interfaceC28373a2 != null ? interfaceC28373a2 : null, 0L, (TreeClickStreamParent) null, str, "job_applies", (Integer) null, "job_my_applies", (String) null, (String) null, 512, (C42822w) null));
        q5().accept(new AbstractC42297a.C11564a(deepLink, null, 2, null));
    }

    @Override // iQ0.InterfaceC41333a
    public final void V3(@k DeepLink deepLink) {
        q5().accept(new AbstractC42297a.C11564a(deepLink, null, 2, null));
    }

    @Override // iQ0.InterfaceC41333a
    public final void Y4(@k DeepLink deepLink) {
        q5().accept(new AbstractC42297a.C11564a(deepLink, null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f330915q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.applies_job_layout, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f330915q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.konveyor.adapter.d dVar = this.f330913o0;
        if (dVar == null) {
            dVar = null;
        }
        this.f330917s0 = new com.avito.android.work_profile.profile.applies.ui.b(new b(1, q5(), C41334b.class, "accept", "accept(Ljava/lang/Object;)V", 0), view, dVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f330915q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        C41334b c41334bQ5 = q5();
        com.avito.android.work_profile.profile.applies.ui.b bVar = this.f330917s0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, c41334bQ5, com.avito.android.analytics.screens.mvi.k.f90658l, new c(1, bVar == null ? null : bVar, com.avito.android.work_profile.profile.applies.ui.b.class, "render", "render(Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyState;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.work_profile.profile.applies.di.i.a().a(bundle != null, getResources(), this, s.c(this), (com.avito.android.work_profile.profile.applies.di.b) C29972i.a(C29972i.b(this), com.avito.android.work_profile.profile.applies.di.b.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f330915q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final C41334b q5() {
        return (C41334b) this.f330918t0.getValue();
    }
}
