package com.avito.android.travel_search.ui;

import Aw0.InterfaceC13094a;
import Cd.C13243a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.Arguments;
import com.avito.android.serp.adapter.constructor.A;
import com.avito.android.travel_search.TravelSearchOpenParams;
import com.avito.android.travel_search.analytics.TravelSearchScreen;
import com.avito.android.travel_search.di.b;
import com.avito.android.travel_search.ui.n;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.Kundle;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import oW.InterfaceC44697a;
import qK0.C47311a;
import vF0.InterfaceC49206a;
import vF0.InterfaceC49208c;
import vF0.f;
import z1.AbstractC50339a;

/* compiled from: TravelSearchFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/travel_search/ui/TravelSearchFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelSearchFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f303202F0;

    /* renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f303203G0;

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public Zp0.d f303204A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public n.a f303205B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47311a f303206C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f303207D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final j f303208E0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public pF0.i f303209n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f303210o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f303211p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.feature.item.b f303212q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.rich_snippets.j f303213r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f303214s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f303215t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public A f303216u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f303217v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f303218w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC13094a f303219x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.f f303220y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f303221z0;

    /* compiled from: TravelSearchFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_search/ui/TravelSearchFragment$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TravelSearchFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<vF0.f, G0> {
        @Override // Y41.l
        public final G0 invoke(vF0.f fVar) {
            vF0.f fVar2 = fVar;
            TravelSearchFragment travelSearchFragment = (TravelSearchFragment) this.receiver;
            a aVar = TravelSearchFragment.f303202F0;
            travelSearchFragment.getClass();
            if (fVar2 instanceof f.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = travelSearchFragment.f303214s0;
                f.b bVar = (f.b) fVar2;
                (aVar2 != null ? aVar2 : null).r6(bVar.f440600b, bVar.f440599a, bVar.f440601c);
            } else if (fVar2 instanceof f.d) {
                InterfaceC31062w interfaceC31062w = travelSearchFragment.f303217v0;
                if (interfaceC31062w == null) {
                    interfaceC31062w = null;
                }
                f.d dVar = (f.d) fVar2;
                interfaceC31062w.y1(dVar.f440603a, dVar.f440604b, null, null);
            } else if (fVar2 instanceof f.c) {
                InterfaceC31062w interfaceC31062w2 = travelSearchFragment.f303217v0;
                if (interfaceC31062w2 == null) {
                    interfaceC31062w2 = null;
                }
                interfaceC31062w2.z1(((f.c) fVar2).f440602a, null);
            } else if (fVar2 instanceof f.a) {
                travelSearchFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TravelSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvF0/g;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LvF0/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<vF0.g, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(vF0.g gVar) {
            vF0.g gVar2 = gVar;
            j jVar = TravelSearchFragment.this.f303208E0;
            vF0.g gVar3 = jVar.f303229a;
            a aVar = TravelSearchFragment.f303202F0;
            TravelSearchFragment travelSearchFragment = TravelSearchFragment.this;
            vF0.h hVar = gVar3 != null ? gVar3.f440618m : null;
            vF0.h hVar2 = gVar2.f440618m;
            if (!L.f(hVar, hVar2)) {
                travelSearchFragment.q5().rl(hVar2);
            }
            InterfaceC49208c interfaceC49208c = gVar3 != null ? gVar3.f440612g : null;
            InterfaceC49208c interfaceC49208c2 = gVar2.f440612g;
            if (!L.f(interfaceC49208c, interfaceC49208c2)) {
                travelSearchFragment.q5().kl(interfaceC49208c2);
            }
            vF0.e eVar = gVar3 != null ? gVar3.f440616k : null;
            vF0.e eVar2 = gVar2.f440616k;
            if (!L.f(eVar, eVar2)) {
                travelSearchFragment.q5().AM(eVar2);
            }
            jVar.f303229a = gVar2;
            return G0.f406611a;
        }
    }

    /* compiled from: TravelSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvF0/a;", "it", "Lkotlin/G0;", "invoke", "(LvF0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC49206a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC49206a interfaceC49206a) {
            a aVar = TravelSearchFragment.f303202F0;
            TravelSearchFragment.this.r5().accept(interfaceC49206a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303224l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f303224l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f303224l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TravelSearchFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f303226l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f303226l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f303226l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303227l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303227l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f303227l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303228l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f303228l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TravelSearchRenderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"pF0/f", "LpF0/e;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements pF0.e<vF0.g> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public vF0.g f303229a;

        public j() {
        }
    }

    /* compiled from: TravelSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LpF0/h;", "kotlin.jvm.PlatformType", "invoke", "()LpF0/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<pF0.h> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final pF0.h invoke() {
            pF0.i iVar = TravelSearchFragment.this.f303209n0;
            if (iVar == null) {
                iVar = null;
            }
            return (pF0.h) iVar.get();
        }
    }

    static {
        Y y12 = new Y(TravelSearchFragment.class, "travelSearchView", "getTravelSearchView()Lcom/avito/android/travel_search/ui/TravelSearchView;", 0);
        n0 n0Var = m0.f406844a;
        f303203G0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TravelSearchFragment.class, "openParams", "getOpenParams()Lcom/avito/android/travel_search/TravelSearchOpenParams;", 0, n0Var)};
        f303202F0 = new a(null);
    }

    public TravelSearchFragment() {
        super(0, 1, null);
        e eVar = new e(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f303210o0 = new O0(m0.f406844a.b(pF0.h.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f303206C0 = new C47311a(null, 1, null);
        this.f303207D0 = new C35968w3(this);
        this.f303208E0 = new j();
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f303204A0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC31062w interfaceC31062w = this.f303217v0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.q(list);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303211p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303211p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new b(1, this, TravelSearchFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/travel_search/mvi/entity/TravelSearchOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.travel_search_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f303208E0.f303229a = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC31062w interfaceC31062w = this.f303217v0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC31062w interfaceC31062w = this.f303217v0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A a12 = this.f303216u0;
        if (a12 == null) {
            a12 = null;
        }
        bundle.putParcelable("key_constructor_advert_state", a12.d0());
        com.avito.android.serp.adapter.rich_snippets.j jVar = this.f303213r0;
        if (jVar == null) {
            jVar = null;
        }
        bundle.putParcelable("key_rich_snippets_state", jVar.d0());
        InterfaceC31062w interfaceC31062w = this.f303217v0;
        bundle.putParcelable("inline_filters_state", (interfaceC31062w != null ? interfaceC31062w : null).d0());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        n.a aVar = this.f303205B0;
        n nVarA = (aVar != null ? aVar : null).a(view, this, getParentFragmentManager(), r5().f428283N.f398526b, r5().f428283N.f398527c);
        nVarA.f303254g.s4(nVarA);
        nVarA.f303256i.w1(nVarA, nVarA, null, null, null);
        kotlin.reflect.n<Object> nVar = f303203G0[0];
        this.f303206C0.b(this, nVarA);
        InterfaceC31062w interfaceC31062w = this.f303217v0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        InterfaceC43160i interfaceC43160iA = y.a(interfaceC31062w.l1());
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.f46682e;
        C43175k.K(new C43197r1(new com.avito.android.travel_search.ui.a(this, null), C23069w.a(interfaceC43160iA, lifecycle, state)), C22984Q.a(getViewLifecycleOwner()));
        InterfaceC31062w interfaceC31062w2 = this.f303217v0;
        if (interfaceC31062w2 == null) {
            interfaceC31062w2 = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.travel_search.ui.b(this, null), C23069w.a(y.a(interfaceC31062w2.b1()), getViewLifecycleOwner().getLifecycle(), state)), C22984Q.a(getViewLifecycleOwner()));
        InterfaceC31062w interfaceC31062w3 = this.f303217v0;
        if (interfaceC31062w3 == null) {
            interfaceC31062w3 = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.travel_search.ui.c(this, null), C23069w.a(y.a(interfaceC31062w3.p1()), getViewLifecycleOwner().getLifecycle(), state)), C22984Q.a(getViewLifecycleOwner()));
        InterfaceC31062w interfaceC31062w4 = this.f303217v0;
        if (interfaceC31062w4 == null) {
            interfaceC31062w4 = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.travel_search.ui.d(this, null), C23069w.a(y.a(interfaceC31062w4.V0()), getViewLifecycleOwner().getLifecycle(), state)), C22984Q.a(getViewLifecycleOwner()));
        InterfaceC31062w interfaceC31062w5 = this.f303217v0;
        if (interfaceC31062w5 == null) {
            interfaceC31062w5 = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.travel_search.ui.e(this, null), C23069w.a(y.a(interfaceC31062w5.b1()), getViewLifecycleOwner().getLifecycle(), state)), C22984Q.a(getViewLifecycleOwner()));
        C43175k.K(new C43197r1(new com.avito.android.travel_search.ui.f(this, null), C23069w.a(y.a(q5().pu()), getViewLifecycleOwner().getLifecycle(), state)), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f303211p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Kundle kundle;
        Kundle kundle2;
        Kundle kundle3;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        if (bundle != null) {
            kundle = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("key_constructor_advert_state", Kundle.class) : bundle.getParcelable("key_constructor_advert_state"));
        } else {
            kundle = null;
        }
        if (bundle != null) {
            kundle2 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("key_rich_snippets_state", Kundle.class) : bundle.getParcelable("key_rich_snippets_state"));
        } else {
            kundle2 = null;
        }
        if (bundle != null) {
            kundle3 = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("inline_filters_state", Kundle.class) : bundle.getParcelable("inline_filters_state"));
        } else {
            kundle3 = null;
        }
        b.a aVarA = com.avito.android.travel_search.di.a.a();
        ActivityC22955m activityC22955mL1 = l1();
        TravelSearchScreen travelSearchScreen = TravelSearchScreen.f302767d;
        r rVarC = s.c(this);
        kotlin.reflect.n<Object>[] nVarArr = f303203G0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        C35968w3 c35968w3 = this.f303207D0;
        TravelSearchOpenParams travelSearchOpenParams = (TravelSearchOpenParams) c35968w3.getValue(this, nVar);
        aVarA.a(activityC22955mL1, travelSearchScreen, rVarC, travelSearchOpenParams.f302764b, getResources(), (TravelSearchOpenParams) c35968w3.getValue(this, nVarArr[1]), new d(), kundle, kundle2, kundle3, new RecyclerView.t(), (com.avito.android.travel_search.di.c) C29972i.a(C29972i.b(this), com.avito.android.travel_search.di.c.class), (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303211p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final l q5() {
        kotlin.reflect.n<Object> nVar = f303203G0[0];
        return (l) this.f303206C0.a();
    }

    public final pF0.h r5() {
        return (pF0.h) this.f303210o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
