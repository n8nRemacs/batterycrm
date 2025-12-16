package com.avito.android.car_navigator.presentation;

import Am.C13055e;
import Am.C13056f;
import Cd.C13243a;
import Dm.C13416c;
import Dm.InterfaceC13414a;
import Dm.InterfaceC13415b;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.car_navigator.di.a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: CarNavigatorFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/car_navigator/presentation/CarNavigatorFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CarNavigatorFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public y f115214A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.car_navigator.presentation.j f115215B0;

    /* renamed from: C0, reason: collision with root package name */
    public Toolbar f115216C0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C13056f f115217t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f115218u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f115219v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.car_navigator.presentation.d f115220w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f115221x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final O0 f115222y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f115223z0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f115213E0 = {m0.f406844a.e(new Y(CarNavigatorFragment.class, "openParams", "getOpenParams()Lcom/avito/android/car_navigator/presentation/CarNavigatorOpenParams;", 0))};

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f115212D0 = new a(null);

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/car_navigator/presentation/CarNavigatorFragment$a;", "", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC13415b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13415b interfaceC13415b) {
            InterfaceC13415b interfaceC13415b2 = interfaceC13415b;
            CarNavigatorFragment carNavigatorFragment = (CarNavigatorFragment) this.receiver;
            a aVar = CarNavigatorFragment.f115212D0;
            carNavigatorFragment.getClass();
            if (interfaceC13415b2 instanceof InterfaceC13415b.C0190b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = carNavigatorFragment.f115221x0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                InterfaceC13415b.C0190b c0190b = (InterfaceC13415b.C0190b) interfaceC13415b2;
                b.a.a(aVar2, c0190b.f3427a, c0190b.f3428b, null, 4);
            } else if (interfaceC13415b2 instanceof InterfaceC13415b.a) {
                ActivityC22955m activityC22955mL1 = carNavigatorFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (interfaceC13415b2 instanceof InterfaceC13415b.c) {
                C35966w1.f(carNavigatorFragment, new Intent("android.intent.action.VIEW", ((InterfaceC13415b.c) interfaceC13415b2).f3429a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDm/c;", "it", "Lkotlin/G0;", "invoke", "(LDm/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C13416c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C13416c c13416c) {
            C13416c c13416c2 = c13416c;
            com.avito.android.car_navigator.presentation.j jVar = CarNavigatorFragment.this.f115215B0;
            if (jVar != null) {
                com.avito.android.progress_overlay.l lVar = jVar.f115264c;
                if (c13416c2.f3432b) {
                    lVar.k(null);
                } else if (c13416c2.f3433c) {
                    lVar.a("");
                } else {
                    lVar.j();
                }
                I5.a(jVar.f115262a, c13416c2.f3434d, false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<x, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = CarNavigatorFragment.f115212D0;
            CarNavigatorFragment.this.E5().accept(InterfaceC13414a.c.f3420a);
            return G0.f406611a;
        }
    }

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = CarNavigatorFragment.f115212D0;
            CarNavigatorFragment carNavigatorFragment = CarNavigatorFragment.this;
            carNavigatorFragment.E5().accept(new InterfaceC13414a.b(carNavigatorFragment.D5().f115234b));
        }
    }

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDm/a;", "it", "Lkotlin/G0;", "invoke", "(LDm/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC13414a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13414a interfaceC13414a) {
            a aVar = CarNavigatorFragment.f115212D0;
            CarNavigatorFragment.this.E5().accept(interfaceC13414a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f115228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f115228l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f115228l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CarNavigatorFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f115230l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f115230l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f115230l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f115231l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f115231l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f115231l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f115232l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f115232l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f115232l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAm/e;", "kotlin.jvm.PlatformType", "invoke", "()LAm/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<C13055e> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final C13055e invoke() {
            C13056f c13056f = CarNavigatorFragment.this.f115217t0;
            if (c13056f == null) {
                c13056f = null;
            }
            return (C13055e) c13056f.get();
        }
    }

    public CarNavigatorFragment() {
        super(R.layout.car_navigator_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f115222y0 = new O0(m0.f406844a.b(C13055e.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f115223z0 = new C35968w3(this);
    }

    public final CarNavigatorOpenParams D5() {
        return (CarNavigatorOpenParams) this.f115223z0.getValue(this, f115213E0[0]);
    }

    public final C13055e E5() {
        return (C13055e) this.f115222y0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.arch.mvi.android.f.a(E5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new b(1, this, CarNavigatorFragment.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/car_navigator/mvi/entity/CarNavigatorOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.car_navigator_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f115215B0 = null;
        com.avito.android.car_navigator.presentation.d dVar = this.f115220w0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b();
        y yVar = this.f115214A0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f115214A0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C19918B.a(requireActivity().getF21241d(), this, new d(), 2);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f115216C0 = (Toolbar) viewFindViewById;
        if (D5().f115235c.f115191b) {
            Toolbar toolbar = this.f115216C0;
            if (toolbar == null) {
                toolbar = null;
            }
            toolbar.setVisibility(8);
        } else {
            Toolbar toolbar2 = this.f115216C0;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            toolbar2.setNavigationIcon(R.drawable.ic_close_24_blue);
            Toolbar toolbar3 = this.f115216C0;
            if (toolbar3 == null) {
                toolbar3 = null;
            }
            toolbar3.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 24));
        }
        com.avito.android.car_navigator.presentation.j jVar = new com.avito.android.car_navigator.presentation.j(view);
        y yVar = this.f115214A0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f115214A0 = (y) jVar.f115264c.e().t0(new e());
        com.avito.android.car_navigator.presentation.d dVar = this.f115220w0;
        (dVar != null ? dVar : null).Q7(jVar.f115263b);
        this.f115215B0 = jVar;
        E5().accept(new InterfaceC13414a.b(D5().f115234b));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        a.InterfaceC3356a interfaceC3356aA = com.avito.android.car_navigator.di.f.a();
        interfaceC3356aA.c((com.avito.android.car_navigator.di.b) C29972i.a(C29972i.b(this), com.avito.android.car_navigator.di.b.class));
        interfaceC3356aA.a(cv.c.b(this));
        interfaceC3356aA.w(new f());
        interfaceC3356aA.b(D5().f115235c);
        interfaceC3356aA.build().a(this);
    }
}
