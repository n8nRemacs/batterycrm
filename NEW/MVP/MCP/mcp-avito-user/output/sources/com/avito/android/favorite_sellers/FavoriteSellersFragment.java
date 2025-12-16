package com.avito.android.favorite_sellers;

import Cd.C13243a;
import Oi0.InterfaceC14698b;
import Pz.C14860a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.favorite_sellers.adapter.recommendation.h;
import com.avito.android.favorite_sellers.di.b;
import com.avito.android.favorite_sellers.tracker.FavoriteSellersScreen;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.d2;
import z1.AbstractC50339a;

/* compiled from: FavoriteSellersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/favorite_sellers/FavoriteSellersFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/h$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteSellersFragment extends TabBaseFragment implements com.avito.android.bottom_navigation.ui.fragment.g, h.a, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.component.toast.util.c f155398A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public d2<vC.b> f155399B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public d2<InterfaceC30574a> f155400C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC43160i<C14860a> f155401D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f155402E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f155403F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f155404G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f155405H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f155406I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f155407J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.b f155408K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public R0 f155409L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.common.a f155410M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public H f155411N0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public K f155412t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f155413u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f155414v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.responsive.e f155415w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC14698b f155416x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite_sellers.adapter.recommendation.h f155417y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite_sellers.adapter.advert_list.d f155418z0;

    /* compiled from: FavoriteSellersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.favorite_sellers.adapter.recommendation.h hVar = FavoriteSellersFragment.this.f155417y0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.f3();
            return G0.f406611a;
        }
    }

    /* compiled from: FavoriteSellersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            FavoriteSellersFragment favoriteSellersFragment = FavoriteSellersFragment.this;
            com.avito.android.favorite_sellers.adapter.advert_list.d dVar = favoriteSellersFragment.f155418z0;
            if (dVar == null) {
                dVar = null;
            }
            com.avito.android.util.G.c(bundle2, "advert_list_item_presenter_state", dVar.getF155541b());
            com.avito.android.favorite_sellers.adapter.recommendation.h hVar = favoriteSellersFragment.f155417y0;
            com.avito.android.util.G.c(bundle2, "recommendation_presenter_state", (hVar != null ? hVar : null).d0());
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f155421l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f155421l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f155421l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return FavoriteSellersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f155423l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f155423l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f155423l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f155424l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f155424l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f155424l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f155425l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f155425l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f155425l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FavoriteSellersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/J;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/favorite_sellers/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<J> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final J invoke() {
            K k12 = FavoriteSellersFragment.this.f155412t0;
            if (k12 == null) {
                k12 = null;
            }
            return (J) k12.get();
        }
    }

    public FavoriteSellersFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f155413u0 = new O0(m0.f406844a.b(J.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h.a
    public final void A0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f155414v0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.a());
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        H h12 = this.f155411N0;
        if (h12 != null) {
            h12.f155442p.A0(0);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle bundleT5 = t5(bundle);
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        b.a aVarA = com.avito.android.favorite_sellers.di.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("user_key") : null;
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        S0 f42820b = getF42820b();
        Resources resources = getResources();
        Kundle kundleA = bundleT5 != null ? com.avito.android.util.G.a(bundleT5, "advert_list_item_presenter_state") : null;
        Kundle kundleA2 = bundleT5 != null ? com.avito.android.util.G.a(bundleT5, "recommendation_presenter_state") : null;
        FavoriteSellersScreen favoriteSellersScreen = FavoriteSellersScreen.f156139d;
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        SubscriptionSource subscriptionSource = SubscriptionSource.f90035c;
        aVarA.a(string, activityC22955mRequireActivity, f42820b, resources, kundleA, kundleA2, favoriteSellersScreen, rVarC, (com.avito.android.favorite_sellers.di.c) C29972i.a(C29972i.b(this), com.avito.android.favorite_sellers.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f155406I0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f155406I0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.favorite_sellers, viewGroup, false);
        com.avito.android.subscriptions_settings.d dVar = new com.avito.android.subscriptions_settings.d(requireActivity(), null, 2, null);
        J j12 = (J) this.f155413u0.getValue();
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        d2<vC.b> d2Var = this.f155399B0;
        d2<vC.b> d2Var2 = d2Var != null ? d2Var : null;
        d2<InterfaceC30574a> d2Var3 = this.f155400C0;
        d2<InterfaceC30574a> d2Var4 = d2Var3 != null ? d2Var3 : null;
        InterfaceC14698b interfaceC14698b = this.f155416x0;
        InterfaceC14698b interfaceC14698b2 = interfaceC14698b != null ? interfaceC14698b : null;
        com.avito.android.recycler.responsive.e eVar = this.f155415w0;
        com.avito.android.recycler.responsive.e eVar2 = eVar != null ? eVar : null;
        com.avito.android.component.toast.util.c cVar = this.f155398A0;
        com.avito.android.component.toast.util.c cVar2 = cVar != null ? cVar : null;
        InterfaceC43160i<C14860a> interfaceC43160i = this.f155401D0;
        InterfaceC43160i<C14860a> interfaceC43160i2 = interfaceC43160i != null ? interfaceC43160i : null;
        com.avito.android.favorite.n nVar = this.f155407J0;
        com.avito.android.favorite.n nVar2 = nVar != null ? nVar : null;
        com.avito.android.advert_collection_toast.b bVar = this.f155408K0;
        com.avito.android.advert_collection_toast.b bVar2 = bVar != null ? bVar : null;
        com.avito.android.common.a aVar = this.f155410M0;
        com.avito.android.common.a aVar2 = aVar != null ? aVar : null;
        InterfaceC30274a interfaceC30274a = this.f155404G0;
        InterfaceC30274a interfaceC30274a2 = interfaceC30274a != null ? interfaceC30274a : null;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f155406I0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        R0 r02 = this.f155409L0;
        this.f155411N0 = new H(viewInflate, this, j12, viewLifecycleOwner, d2Var2, d2Var4, interfaceC14698b2, eVar2, cVar2, interfaceC43160i2, nVar2, bVar2, aVar2, interfaceC30274a2, screenPerformanceTracker3, r02 != null ? r02 : null);
        com.avito.android.component.toast.util.c cVar3 = this.f155398A0;
        if (cVar3 == null) {
            cVar3 = null;
        }
        cVar3.d(dVar);
        H h12 = this.f155411N0;
        if (h12 != null) {
            h12.f155442p.o(new F(new a()));
        }
        com.avito.android.subscriptions_settings.d dVar2 = new com.avito.android.subscriptions_settings.d(requireActivity(), null, 2, null);
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar = this.f155417y0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.y7(dVar2);
        com.avito.android.component.toast.util.c cVar4 = this.f155398A0;
        if (cVar4 == null) {
            cVar4 = null;
        }
        cVar4.d(dVar2);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC14698b interfaceC14698b = this.f155416x0;
        if (interfaceC14698b == null) {
            interfaceC14698b = null;
        }
        interfaceC14698b.destroy();
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar = this.f155417y0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.e0();
        com.avito.android.component.toast.util.c cVar = this.f155398A0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.clear();
        com.avito.android.advert_collection_toast.a aVar = this.f155402E0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        this.f155411N0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        H h12 = this.f155411N0;
        if (h12 != null) {
            h12.b(false);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        H h12 = this.f155411N0;
        if (h12 != null) {
            h12.b(true);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar = this.f155417y0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.b5(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar = this.f155417y0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f155406I0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.advert_collection_toast.a aVar = this.f155402E0;
        (aVar != null ? aVar : null).d(view, this);
    }
}
