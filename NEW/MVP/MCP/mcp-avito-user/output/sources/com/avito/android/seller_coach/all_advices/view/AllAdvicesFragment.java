package com.avito.android.seller_coach.all_advices.view;

import Cd.C13243a;
import Y61.l;
import android.annotation.SuppressLint;
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
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.Advice;
import com.avito.android.remote.model.Advices;
import com.avito.android.seller_coach.all_advices.provider.a;
import com.avito.android.seller_coach.all_advices.provider.z;
import com.avito.android.seller_coach.all_advices.view.c;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.ui.fragments.TabBaseFragment;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import wq0.C49672a;
import z1.AbstractC50339a;

/* compiled from: AllAdvicesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/view/AllAdvicesFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes3.dex */
public final class AllAdvicesFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f267395F0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final O0 f267396A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f267397B0;

    /* renamed from: C0, reason: collision with root package name */
    public com.avito.android.seller_coach.all_advices.view.e f267398C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f267399D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final e f267400E0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f267401t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.seller_coach.all_advices.vm.c f267402u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f267403v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f267404w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f267405x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f267406y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public h.b f267407z0;

    /* compiled from: AllAdvicesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/view/AllAdvicesFragment$a;", "", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AllAdvicesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AllAdvicesFragment.this.requireActivity().onBackPressed();
        }
    }

    /* compiled from: AllAdvicesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = AllAdvicesFragment.f267395F0;
            AllAdvicesFragment.this.D5().me(false);
        }
    }

    /* compiled from: AllAdvicesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = AllAdvicesFragment.f267395F0;
            AllAdvicesFragment.this.D5().me(true);
        }
    }

    /* compiled from: AllAdvicesFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/seller_coach/all_advices/view/AllAdvicesFragment$e", "Lcom/avito/android/seller_coach/all_advices/view/f;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements com.avito.android.seller_coach.all_advices.view.f {
        public e() {
        }

        @Override // com.avito.android.seller_coach.all_advices.view.f
        public final void a(int i12, int i13) {
            List<Advice> advices;
            a aVar = AllAdvicesFragment.f267395F0;
            com.avito.android.seller_coach.all_advices.vm.b bVarD5 = AllAdvicesFragment.this.D5();
            Advices advices2 = bVarD5.f267444O;
            if (advices2 == null || (advices = advices2.getAdvices()) == null || i12 > i13) {
                return;
            }
            while (true) {
                if (i12 >= 0) {
                    ArrayList arrayList = bVarD5.f267445P;
                    if (!arrayList.contains(Integer.valueOf(i12))) {
                        String adviceId = advices.get(i12).getAdviceId();
                        String title = advices.get(i12).getTitle();
                        List<String> itemsIds = advices.get(i12).getItemsIds();
                        if (itemsIds == null) {
                            itemsIds = C42784z0.f406748b;
                        }
                        bVarD5.f267440K.c(new C49672a(title, adviceId, itemsIds, "from_list"));
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
                if (i12 == i13) {
                    return;
                } else {
                    i12++;
                }
            }
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f267412l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f267412l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f267412l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AllAdvicesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f267414l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f267414l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f267414l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267415l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267415l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f267415l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267416l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267416l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f267416l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AllAdvicesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/seller_coach/all_advices/vm/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.seller_coach.all_advices.vm.b> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.seller_coach.all_advices.vm.b invoke() {
            com.avito.android.seller_coach.all_advices.vm.c cVar = AllAdvicesFragment.this.f267402u0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.seller_coach.all_advices.vm.b) cVar.get();
        }
    }

    public AllAdvicesFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f267396A0 = new O0(m0.f406844a.b(com.avito.android.seller_coach.all_advices.vm.b.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f267397B0 = new NavigationState(false, null, 2, null);
        this.f267399D0 = new io.reactivex.rxjava3.disposables.c();
        this.f267400E0 = new e();
    }

    public final com.avito.android.seller_coach.all_advices.vm.b D5() {
        return (com.avito.android.seller_coach.all_advices.vm.b) this.f267396A0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f267406y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.seller_coach_fragment_all_advices, viewGroup, false);
        com.avito.konveyor.adapter.j jVar = this.f267403v0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        InterfaceC28373a interfaceC28373a = this.f267401t0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.konveyor.adapter.a aVar = this.f267404w0;
        com.avito.android.seller_coach.all_advices.view.e eVar = new com.avito.android.seller_coach.all_advices.view.e(viewInflate, jVar2, interfaceC28373a2, aVar != null ? aVar : null, this.f267400E0);
        io.reactivex.rxjava3.disposables.d dVarT0 = eVar.f267432k.t0(new b());
        io.reactivex.rxjava3.disposables.c cVar = this.f267399D0;
        cVar.b(dVarT0);
        cVar.b(eVar.f267433l.t0(new c()));
        cVar.b(eVar.f267434m.t0(new d()));
        this.f267398C0 = eVar;
        Set<TV0.d<?, ?>> set = this.f267405x0;
        if (set == null) {
            set = null;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.seller_coach.all_advices.item.c) {
                D5().ke(((com.avito.android.seller_coach.all_advices.item.c) dVar).getF267346b());
            }
        }
        com.avito.android.seller_coach.all_advices.vm.b bVarD5 = D5();
        bVarD5.f267448S.observe(getViewLifecycleOwner(), new c.a(new com.avito.android.seller_coach.all_advices.view.a(this)));
        bVarD5.f267449T.observe(getViewLifecycleOwner(), new c.a(new com.avito.android.seller_coach.all_advices.view.b(this, bVarD5)));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f267406y0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f267399D0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.seller_coach.all_advices.vm.b bVarD5 = D5();
        if (bVarD5.f267447R) {
            bVarD5.me(true);
            bVarD5.f267447R = false;
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC7986a interfaceC7986aA = z.a();
        com.avito.android.seller_coach.all_advices.provider.d dVar = (com.avito.android.seller_coach.all_advices.provider.d) C29972i.a(C29972i.b(this), com.avito.android.seller_coach.all_advices.provider.b.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        interfaceC7986aA.a(interfaceC39417aB, dVar, dVar.s2().a(dVar, interfaceC39417aB), this, s.c(this), this).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f267406y0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f267406y0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF182160B0() {
        return this.f267397B0;
    }
}
