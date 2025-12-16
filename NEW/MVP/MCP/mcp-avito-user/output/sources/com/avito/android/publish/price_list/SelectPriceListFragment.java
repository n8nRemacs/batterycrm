package com.avito.android.publish.price_list;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.SelectPriceListScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.publish.C0;
import com.avito.android.publish.objects.InterfaceC33971t;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import com.avito.android.publish.price_list.mvi.entity.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.google.common.collect.H1;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import z1.AbstractC50339a;

/* compiled from: SelectPriceListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/price_list/SelectPriceListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LId0/e;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectPriceListFragment extends BaseFragment implements InterfaceC28477j.b, Id0.e {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f238386A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.price_list.mvi.entity.d f238387n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public C0 f238388o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f238389p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f238390q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f238391r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f238392s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public H1 f238393t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC33971t f238394u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.objects.result.a f238395v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f238396w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f238397x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final b f238398y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public z f238399z0;

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/price_list/SelectPriceListFragment$a;", "", "<init>", "()V", "", "SELECT_PRICE_LIST_PARAM_KEY", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/price_list/SelectPriceListFragment$b", "Landroidx/activity/x;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends androidx.view.x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            ((com.avito.android.publish.price_list.mvi.entity.c) SelectPriceListFragment.this.f238389p0.getValue()).accept(a.c.f238822a);
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SelectPriceListFragment.q5(SelectPriceListFragment.this).accept(a.e.f238824a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<String, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            ((com.avito.android.publish.price_list.mvi.entity.c) SelectPriceListFragment.this.f238389p0.getValue()).accept(new a.C7174a(str));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SelectPriceListFragment.q5(SelectPriceListFragment.this).accept(a.j.f238829a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SelectPriceListFragment.q5(SelectPriceListFragment.this).accept(a.d.f238823a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SelectPriceListFragment.q5(SelectPriceListFragment.this).accept(a.c.f238822a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f238406l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f238406l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f238406l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectPriceListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f238408l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f238408l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f238408l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f238409l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f238409l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f238409l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f238410l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f238410l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f238410l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.a<Integer> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            Bundle bundleRequireArguments = SelectPriceListFragment.this.requireArguments();
            if (bundleRequireArguments.containsKey("step_index")) {
                return Integer.valueOf(bundleRequireArguments.getInt("step_index"));
            }
            return null;
        }
    }

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/price_list/mvi/entity/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.publish.price_list.mvi.entity.c> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.price_list.mvi.entity.c invoke() {
            com.avito.android.publish.price_list.mvi.entity.d dVar = SelectPriceListFragment.this.f238387n0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.publish.price_list.mvi.entity.c) dVar.get();
        }
    }

    public SelectPriceListFragment() {
        super(0, 1, null);
        h hVar = new h(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f238389p0 = new O0(m0.f406844a.b(com.avito.android.publish.price_list.mvi.entity.c.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f238390q0 = C42727D.c(new m());
        this.f238398y0 = new b();
    }

    public static final com.avito.android.publish.price_list.mvi.entity.c q5(SelectPriceListFragment selectPriceListFragment) {
        return (com.avito.android.publish.price_list.mvi.entity.c) selectPriceListFragment.f238389p0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        u3.l<SimpleTestGroupWithNone> lVar = this.f238397x0;
        if (lVar == null) {
            lVar = null;
        }
        return layoutInflater.inflate(lVar.f439745a.f439749b.b() ? R.layout.select_price_list_fragment_re23 : R.layout.select_price_list_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f238399z0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f238398y0);
        boolean z12 = ((Integer) this.f238390q0.getValue()) != null;
        com.avito.konveyor.adapter.j jVar = this.f238391r0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.android.recycler.data_aware.c cVar = this.f238392s0;
        com.avito.android.recycler.data_aware.c cVar2 = cVar != null ? cVar : null;
        c cVar3 = new c();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        g gVar = new g();
        u3.l<SimpleTestGroupWithNone> lVar = this.f238397x0;
        this.f238399z0 = new z(z12, view, jVar2, cVar2, cVar3, dVar, eVar, fVar, gVar, lVar != null ? lVar : null);
        u3.l<SimpleTestGroupWithNone> lVar2 = this.f238397x0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        if (lVar2.f439745a.f439749b.a()) {
            u3.l<SimpleTestGroupWithNone> lVar3 = this.f238397x0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.b();
        }
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new r(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.publish.price_list.d(this, null), 3);
        H1<TV0.d> h12 = this.f238393t0;
        if (h12 == null) {
            h12 = null;
        }
        for (TV0.d dVar2 : h12) {
            boolean z13 = dVar2 instanceof com.avito.android.publish.price_list.items.selectable.e;
            Lifecycle.State state = Lifecycle.State.f46682e;
            if (z13) {
                C43175k.K(new C43197r1(new com.avito.android.publish.price_list.j(this, null), new C43152f0(C23069w.a(((com.avito.android.publish.price_list.items.selectable.e) dVar2).getF238682c(), getViewLifecycleOwner().getLifecycle(), state), new com.avito.android.publish.price_list.i(3, null))), C22981N.a(getLifecycle()));
            } else if (dVar2 instanceof com.avito.android.publish.price_list.items.selectable.l) {
                C43175k.K(new C43197r1(new com.avito.android.publish.price_list.l(this, null), new C43152f0(C23069w.a(((com.avito.android.publish.price_list.items.selectable.l) dVar2).getF238695c(), getViewLifecycleOwner().getLifecycle(), state), new com.avito.android.publish.price_list.k(3, null))), C22981N.a(getLifecycle()));
            } else if (dVar2 instanceof com.avito.android.publish.price_list.items.selected.e) {
                C43175k.K(new C43197r1(new com.avito.android.publish.price_list.n(this, null), new C43152f0(C23069w.a(((com.avito.android.publish.price_list.items.selected.e) dVar2).getF238726c(), getViewLifecycleOwner().getLifecycle(), state), new com.avito.android.publish.price_list.m(3, null))), C22981N.a(getLifecycle()));
            } else if (dVar2 instanceof com.avito.android.publish.price_list.items.selected.l) {
                com.avito.android.publish.price_list.items.selected.l lVar4 = (com.avito.android.publish.price_list.items.selected.l) dVar2;
                C43175k.K(new C43197r1(new p(this, null), new C43152f0(C23069w.a(lVar4.getF238739c(), getViewLifecycleOwner().getLifecycle(), state), new o(3, null))), C22981N.a(getLifecycle()));
                C43175k.K(new C43197r1(new com.avito.android.publish.price_list.f(this, null), new C43152f0(C23069w.a(lVar4.getF238741e(), getViewLifecycleOwner().getLifecycle(), state), new q(3, null))), C22981N.a(getLifecycle()));
            } else if (dVar2 instanceof com.avito.android.publish.price_list.items.group.f) {
                C43175k.K(new C43197r1(new com.avito.android.publish.price_list.h(this, null), new C43152f0(C23069w.a(((com.avito.android.publish.price_list.items.group.f) dVar2).getF238644c(), getViewLifecycleOwner().getLifecycle(), state), new com.avito.android.publish.price_list.g(3, null))), C22981N.a(getLifecycle()));
            }
        }
        com.avito.android.publish.objects.result.a aVar = this.f238395v0;
        (aVar != null ? aVar : null).b(new com.avito.android.publish.price_list.e(this), Collections.singletonList(ObjectsFragmentResultImpl.ObjectsRequestKey.f238086c));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String string = requireArguments().getString("select_price_list_param_key");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.price_list.di.a.a().a(this, string, (Integer) this.f238390q0.getValue(), new C28478k(SelectPriceListScreen.f90480d, com.avito.android.analytics.screens.s.c(this), "servicesList"), (com.avito.android.publish.price_list.di.d) C29972i.a(C29972i.b(this), com.avito.android.publish.price_list.di.d.class)).a(this);
    }
}
