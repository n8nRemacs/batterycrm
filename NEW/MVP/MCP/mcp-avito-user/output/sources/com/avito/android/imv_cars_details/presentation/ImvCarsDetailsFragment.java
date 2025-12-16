package com.avito.android.imv_cars_details.presentation;

import Cd.C13243a;
import WM.a;
import WM.b;
import WM.c;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.DifferenceImvAvgPriceItem;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import com.avito.android.util.P5;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: ImvCarsDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsDetailsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.imv_cars_details.presentation.k f170014n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f170015o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f170016p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f170017q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.c<WM.a> f170018r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f170019s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f170020t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f170021u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.imv_cars_details.presentation.i f170022v0;

    /* renamed from: w0, reason: collision with root package name */
    public Toolbar f170023w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f170013y0 = {m0.f406844a.e(new Y(ImvCarsDetailsFragment.class, "openParams", "getOpenParams()Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsParams;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f170012x0 = new a(null);

    /* compiled from: ImvCarsDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/ImvCarsDetailsFragment$a;", "", "<init>", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvCarsDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<WM.b, G0> {
        @Override // Y41.l
        public final G0 invoke(WM.b bVar) {
            com.avito.android.imv_cars_details.presentation.i iVar;
            WM.b bVar2 = bVar;
            ImvCarsDetailsFragment imvCarsDetailsFragment = (ImvCarsDetailsFragment) this.receiver;
            a aVar = ImvCarsDetailsFragment.f170012x0;
            imvCarsDetailsFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = imvCarsDetailsFragment.f170017q0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a aVar3 = (b.a) bVar2;
                b.a.a(aVar2, aVar3.f17880a, aVar3.f17881b, null, 4);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, imvCarsDetailsFragment, com.avito.android.printable_text.b.f(((b.c) bVar2).f17882a), null, null, null, 0, null, 1022);
            } else if ((bVar2 instanceof b.C1267b) && (iVar = imvCarsDetailsFragment.f170022v0) != null) {
                b.C1267b c1267b = (b.C1267b) bVar2;
                Iterator<? extends com.avito.conveyor_item.a> it = iVar.f170046f.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    com.avito.conveyor_item.a next = it.next();
                    c1267b.getClass();
                    if (DifferenceImvAvgPriceItem.class.isInstance(next)) {
                        break;
                    }
                    i12++;
                }
                if (i12 >= 0) {
                    iVar.f170045e.F0(i12);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImvCarsDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWM/c;", "it", "Lkotlin/G0;", "invoke", "(LWM/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<WM.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(WM.c cVar) {
            WM.c cVar2 = cVar;
            com.avito.android.imv_cars_details.presentation.i iVar = ImvCarsDetailsFragment.this.f170022v0;
            if (iVar != null) {
                com.avito.android.progress_overlay.l lVar = iVar.f170044d;
                String str = null;
                if (cVar2.f17885b) {
                    lVar.k(null);
                } else {
                    String str2 = cVar2.f17886c;
                    if (str2 == null || str2.length() == 0) {
                        c.b bVar = cVar2.f17887d;
                        if (bVar != null) {
                            lVar.j();
                            List<com.avito.conveyor_item.a> list = bVar.f17889b;
                            iVar.f170046f = list;
                            iVar.f170043c.c(new UV0.c(list));
                            iVar.f170042b.notifyDataSetChanged();
                            str = bVar.f17888a;
                        }
                    } else {
                        lVar.a(str2);
                    }
                }
                I5.a(iVar.f170041a, str, false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImvCarsDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ImvCarsDetailsFragment imvCarsDetailsFragment = ImvCarsDetailsFragment.this;
            com.jakewharton.rxrelay3.c<WM.a> cVar = imvCarsDetailsFragment.f170018r0;
            if (cVar == null) {
                cVar = null;
            }
            cVar.accept(new a.C1266a((ImvCarsDetailsParams) imvCarsDetailsFragment.f170020t0.getValue(imvCarsDetailsFragment, ImvCarsDetailsFragment.f170013y0[0])));
        }
    }

    /* compiled from: ImvCarsDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWM/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(LWM/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = ImvCarsDetailsFragment.f170012x0;
            ((com.avito.android.imv_cars_details.presentation.j) ImvCarsDetailsFragment.this.f170019s0.getValue()).accept((WM.a) obj);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f170027l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f170027l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f170027l);
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
            return ImvCarsDetailsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f170029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f170029l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f170029l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170030l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f170030l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170031l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f170031l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ImvCarsDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/imv_cars_details/presentation/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.imv_cars_details.presentation.j> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.imv_cars_details.presentation.j invoke() {
            com.avito.android.imv_cars_details.presentation.k kVar = ImvCarsDetailsFragment.this.f170014n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.imv_cars_details.presentation.j) kVar.get();
        }
    }

    public ImvCarsDetailsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f170019s0 = new O0(m0.f406844a.b(com.avito.android.imv_cars_details.presentation.j.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f170020t0 = new C35968w3(this);
        this.f170021u0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        com.avito.android.arch.mvi.android.f.a((com.avito.android.imv_cars_details.presentation.j) this.f170019s0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new b(1, this, ImvCarsDetailsFragment.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.imv_cars_details_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f170022v0 = null;
        this.f170021u0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f170023w0 = toolbar;
        o5(toolbar);
        C35966w1.c(this).t();
        Toolbar toolbar2 = this.f170023w0;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        P5.b(toolbar2);
        toolbar2.setNavigationOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 26));
        Toolbar toolbar3 = this.f170023w0;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        View viewFindViewById = toolbar3.findViewById(R.id.toolbar_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        com.avito.konveyor.adapter.j jVar = this.f170015o0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f170016p0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.imv_cars_details.presentation.i iVar = new com.avito.android.imv_cars_details.presentation.i(view, textView, jVar, aVar);
        io.reactivex.rxjava3.disposables.d dVarT0 = iVar.f170044d.e().t0(new d());
        io.reactivex.rxjava3.disposables.c cVar = this.f170021u0;
        cVar.b(dVarT0);
        this.f170022v0 = iVar;
        com.jakewharton.rxrelay3.c<WM.a> cVar2 = this.f170018r0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar.b(cVar2.t0(new e()));
        com.jakewharton.rxrelay3.c<WM.a> cVar3 = this.f170018r0;
        (cVar3 != null ? cVar3 : null).accept(new a.C1266a((ImvCarsDetailsParams) this.f170020t0.getValue(this, f170013y0[0])));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.imv_cars_details.di.b.a().a((com.avito.android.imv_cars_details.di.g) C29972i.a(C29972i.b(this), com.avito.android.imv_cars_details.di.g.class), cv.c.b(this), (ImvCarsDetailsParams) this.f170020t0.getValue(this, f170013y0[0]), getResources()).a(this);
    }
}
