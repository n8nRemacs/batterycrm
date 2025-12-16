package com.avito.android.advert_stats;

import Cd.C13243a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert_stats.di.InterfaceC28316a;
import com.avito.android.advert_stats.item.InterfaceC28337p;
import com.avito.android.advert_stats.j;
import com.avito.android.advert_stats.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import ib.C41375b;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import nb.InterfaceC44368a;
import z1.AbstractC50339a;

/* compiled from: AdvertStatsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/AdvertStatsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertStatsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f85994z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public r.a f85995n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f85996o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f85997p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    @Named("STATS_ITEM_BINDER")
    public com.avito.konveyor.a f85998q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    @Named("STATS_ADAPTER_PRESENTER")
    public com.avito.konveyor.adapter.a f85999r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28337p f86000s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC44368a f86001t0;

    /* renamed from: u0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f86002u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f86003v0;

    /* renamed from: w0, reason: collision with root package name */
    public C41375b f86004w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C28318e f86005x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final b f86006y0;

    /* compiled from: AdvertStatsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/AdvertStatsFragment$a;", "", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_stats/AdvertStatsFragment$b", "Landroid/content/BroadcastReceiver;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            int intExtra = intent.getIntExtra("size", 0);
            AdvertStatsFragment advertStatsFragment = AdvertStatsFragment.this;
            advertStatsFragment.f86004w0 = new C41375b(advertStatsFragment.getResources(), intExtra);
            RecyclerView recyclerView = advertStatsFragment.f86003v0;
            if (recyclerView == null) {
                recyclerView = null;
            }
            C41375b c41375b = advertStatsFragment.f86004w0;
            recyclerView.l(c41375b != null ? c41375b : null, -1);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f86008l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f86008l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f86008l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertStatsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f86010l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f86010l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f86010l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86011l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86011l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f86011l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86012l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86012l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f86012l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertStatsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advert_stats/r;", "invoke", "()Lcom/avito/android/advert_stats/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<r> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            AdvertStatsFragment advertStatsFragment = AdvertStatsFragment.this;
            String string = advertStatsFragment.requireArguments().getString("item_id");
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            r.a aVar = advertStatsFragment.f85995n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(string);
        }
    }

    public AdvertStatsFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f85996o0 = new O0(m0.f406844a.b(r.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f86005x0 = new C28318e(this, 3);
        this.f86006y0 = new b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        r rVarQ5 = q5();
        if (i13 == -1 && i12 == 3) {
            rVarQ5.me();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        InterfaceC44368a interfaceC44368a = this.f86001t0;
        if (interfaceC44368a == null) {
            interfaceC44368a = null;
        }
        interfaceC44368a.e();
        return layoutInflater.inflate(R.layout.advert_stats_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.unregisterReceiver(this.f86006y0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r5v5, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r5v9, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86003v0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView = this.f86003v0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f86003v0;
        RecyclerView recyclerView3 = recyclerView2 == null ? null : recyclerView2;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView3.l(new ib.d(recyclerView2.getResources()), -1);
        C41375b c41375b = new C41375b(getResources(), getResources().getDimensionPixelSize(R.dimen.bottom_margin));
        this.f86004w0 = c41375b;
        RecyclerView recyclerView4 = this.f86003v0;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.l(c41375b, -1);
        RecyclerView recyclerView5 = this.f86003v0;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        ViewGroup viewGroup = (ViewGroup) recyclerView5.getParent();
        InterfaceC28373a interfaceC28373a = this.f85997p0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        this.f86002u0 = lVar;
        lVar.f231600j = new i(this);
        q5().f86866e0.observe(getViewLifecycleOwner(), new j.a(new C28320g(this)));
        q5().f86867f0.observe(getViewLifecycleOwner(), new C28318e(this, 1));
        q5().f86868g0.observe(getViewLifecycleOwner(), new C28318e(this, 0));
        q5().f86869h0.observe(getViewLifecycleOwner(), new C28318e(this, 2));
        r rVarQ5 = q5();
        InterfaceC28337p interfaceC28337p = this.f86000s0;
        if (interfaceC28337p == null) {
            interfaceC28337p = null;
        }
        com.jakewharton.rxrelay3.c f86801j = interfaceC28337p.getF86801j();
        rVarQ5.f86859X.dispose();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        I0 i0J0 = f86801j.C0(100L, timeUnit, h12).j0(rVarQ5.f86845J.e());
        s sVar = new s(rVarQ5);
        l41.g<? super Throwable> gVar = t.f86880b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        rVarQ5.f86859X = (AtomicReference) i0J0.v0(sVar, gVar, interfaceC43543a);
        r rVarQ52 = q5();
        InterfaceC28337p interfaceC28337p2 = this.f86000s0;
        if (interfaceC28337p2 == null) {
            interfaceC28337p2 = null;
        }
        com.jakewharton.rxrelay3.b f86800i = interfaceC28337p2.getF86800i();
        rVarQ52.f86858W.dispose();
        rVarQ52.f86858W = (AtomicReference) f86800i.C0(100L, timeUnit, h12).j0(rVarQ52.f86845J.e()).v0(new z(rVarQ52), A.f85976b, interfaceC43543a);
        r rVarQ53 = q5();
        InterfaceC28337p interfaceC28337p3 = this.f86000s0;
        if (interfaceC28337p3 == null) {
            interfaceC28337p3 = null;
        }
        com.jakewharton.rxrelay3.c f86802k = interfaceC28337p3.getF86802k();
        rVarQ53.f86860Y.dispose();
        rVarQ53.f86860Y = (AtomicReference) f86802k.C0(100L, timeUnit, h12).j0(rVarQ53.f86845J.e()).v0(new x(rVarQ53), y.f86883b, interfaceC43543a);
        q5().f86865d0.observe(getViewLifecycleOwner(), this.f86005x0);
        InterfaceC44368a interfaceC44368a = this.f86001t0;
        (interfaceC44368a != null ? interfaceC44368a : null).d();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            androidx.core.content.d.registerReceiver(activityC22955mL1, this.f86006y0, new IntentFilter("com.avito.android.advert_stats.button_update"), 4);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        boolean z12 = bundle == null;
        InterfaceC28316a.InterfaceC2584a interfaceC2584aA = com.avito.android.advert_stats.di.y.a();
        interfaceC2584aA.a(cv.c.b(this));
        interfaceC2584aA.d((com.avito.android.advert_stats.di.c) C29972i.a(C29972i.b(this), com.avito.android.advert_stats.di.c.class));
        interfaceC2584aA.g(this);
        interfaceC2584aA.b(getResources());
        interfaceC2584aA.c(com.avito.android.analytics.screens.s.c(this));
        String string = requireArguments().getString("item_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        interfaceC2584aA.e(string);
        interfaceC2584aA.f(z12);
        interfaceC2584aA.build().a(this);
        InterfaceC44368a interfaceC44368a = this.f86001t0;
        if (interfaceC44368a == null) {
            interfaceC44368a = null;
        }
        interfaceC44368a.a(fA2.b());
        InterfaceC44368a interfaceC44368a2 = this.f86001t0;
        (interfaceC44368a2 != null ? interfaceC44368a2 : null).j(g5(), this);
    }

    public final r q5() {
        return (r) this.f85996o0.getValue();
    }
}
