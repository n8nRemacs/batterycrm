package com.avito.android.favorites;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bD.InterfaceC25497b;
import cU.s;
import cU0.InterfaceC27108f;
import com.avito.android.R;
import com.avito.android.advert.item.C28156p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.bottom_navigation.C28899v;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.favorites.C30677n0;
import com.avito.android.favorites.InterfaceC30683q0;
import com.avito.android.favorites.di.C30612a;
import com.avito.android.favorites.di.InterfaceC30645c;
import com.avito.android.favorites.di.InterfaceC30646d;
import com.avito.android.favorites.tracker.FavoritesScreen;
import com.avito.android.favorites.x1;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.ownership.Owners;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.user_favorites.InterfaceC35724i;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import com.avito.android.util.L4;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.engine.exception.AbstractBeduinException;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import cv.InterfaceC39417a;
import iE.InterfaceC41272a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ob.C44742f;
import ur.InterfaceC49101b;

/* compiled from: FavoritesFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/favorites/FavoritesFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/favorites/q0$c;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/permissions/d$b;", "LKC/b;", "Lcom/avito/android/favorites/adapter/avito_for_business_exit/c;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "Lcom/avito/android/ui/a;", "<init>", "()V", "a", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesFragment extends TabBaseFragment implements InterfaceC30683q0.c, com.avito.android.bottom_navigation.ui.fragment.g, InterfaceC28477j.b, com.avito.android.select.p, InterfaceC33034d.c, InterfaceC33034d.b, KC.b, com.avito.android.favorites.adapter.avito_for_business_exit.c, FV0.c, com.avito.beduin.v2.interaction.detached.flow.b, com.avito.android.ui.a {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f156219A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public W f156220B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public AD.a f156221C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC25497b f156222D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f156223E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f156224F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f156225G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC41272a f156226H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.rich_snippets.j f156227I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.component.toast.util.c f156228J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.constructor.A f156229K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f156230L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f156231M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public Yo.p f156232N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.async_phone.A f156233O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public ProgressInfoToastBar.a f156234P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public ProgressInfoToastBarPresenter f156235Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public L4 f156236R0;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f156237S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public com.avito.android.L f156238T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f156239U0;

    /* renamed from: V0, reason: collision with root package name */
    public com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L f156240V0;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.l
    public x1 f156241W0;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.l
    public G1 f156242X0;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f156243Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.l
    public cU.s f156244Z0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC30683q0 f156245t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f156246u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.buzzoola.premium.r f156247v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f156248w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.o f156249x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f156250y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f156251z0;

    /* renamed from: b1, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f156218b1 = {kotlin.jvm.internal.m0.f406844a.e(new kotlin.jvm.internal.Y(FavoritesFragment.class, "openParams", "getOpenParams()Lcom/avito/android/favorites/FavoritesFragmentParams;", 0))};

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public static final a f156217a1 = new a(null);

    /* compiled from: FavoritesFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/FavoritesFragment$a;", "", "<init>", "()V", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/favorites/FavoritesFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            View view = FavoritesFragment.this.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Bundle, kotlin.G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            InterfaceC30683q0 interfaceC30683q0 = FavoritesFragment.this.f156245t0;
            if (interfaceC30683q0 == null) {
                interfaceC30683q0 = null;
            }
            com.avito.android.util.G.c(bundle2, "presenter_state", interfaceC30683q0.d0());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31171n, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC31171n interfaceC31171n) {
            MenuItem menuItemA;
            InterfaceC31171n interfaceC31171n2 = interfaceC31171n;
            x1 x1Var = FavoritesFragment.this.f156241W0;
            if (x1Var != null && (menuItemA = x1Var.f157599c.a()) != null) {
                com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.b(x1Var.f157603g, menuItemA, interfaceC31171n2);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC30683q0 interfaceC30683q0 = FavoritesFragment.this.f156245t0;
            if (interfaceC30683q0 == null) {
                interfaceC30683q0 = null;
            }
            interfaceC30683q0.j4();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/H;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/di/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.di.H> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C28478k f156257m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC39417a f156258n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C28478k c28478k, InterfaceC39417a interfaceC39417a) {
            super(0);
            this.f156257m = c28478k;
            this.f156258n = interfaceC39417a;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.di.H invoke() {
            FavoritesFragment favoritesFragment = FavoritesFragment.this;
            H.a aVarEd = ((H.b) C29972i.a(C29972i.b(favoritesFragment), H.b.class)).ed();
            ScreenPerformanceTracker screenPerformanceTracker = favoritesFragment.f156223E0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            ZS.b bVar = new ZS.b(this.f156257m.f90636a, Owners.f210488g, (String) null, 4, (C42822w) null);
            cv.d dVar = new cv.d(this.f156258n);
            InterfaceC30683q0 interfaceC30683q0 = favoritesFragment.f156245t0;
            if (interfaceC30683q0 == null) {
                interfaceC30683q0 = null;
            }
            InterfaceC27108f interfaceC27108fEd = interfaceC30683q0.Ed();
            InterfaceC30683q0 interfaceC30683q02 = favoritesFragment.f156245t0;
            return com.avito.android.lib.beduin_v2.feature.di.K.a(aVarEd, screenPerformanceTracker, bVar, dVar, interfaceC27108fEd, (interfaceC30683q02 != null ? interfaceC30683q02 : null).H4(), null, 32);
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "reason", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f156260m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.f156260m = str;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            FavoritesFragment.this.U4(this.f156260m, str);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f156261l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    public FavoritesFragment() {
        super(0, 1, null);
        this.f156239U0 = new C35968w3(this);
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.user_favorites.i] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final InterfaceC35724i D5() {
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                androidx.core.content.j jVarL1 = l1();
                if (!(jVarL1 instanceof InterfaceC35724i)) {
                    jVarL1 = null;
                }
                parentFragment = (InterfaceC35724i) jVarL1;
            } else {
                if (parentFragment instanceof InterfaceC35724i) {
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            }
        }
        return (InterfaceC35724i) parentFragment;
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    public final cU.s E5() {
        cU.s sVar = this.f156244Z0;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (sVar != null) {
            return sVar;
        }
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(context), s.b.class)).fd();
        ScreenPerformanceTracker screenPerformanceTracker = this.f156223E0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        cU.t tVarA = aVarFd.a(context, screenPerformanceTracker, new aU0.b() { // from class: com.avito.android.favorites.m0
            @Override // aU0.b
            public final void a(AbstractBeduinException abstractBeduinException, String str) {
                InterfaceC30683q0 interfaceC30683q02 = this.f157414b.f156245t0;
                if (interfaceC30683q02 == null) {
                    interfaceC30683q02 = null;
                }
                interfaceC30683q02.getClass();
            }
        }, cU.v.f57891a, (interfaceC30683q0 != null ? interfaceC30683q0 : null).H4().a());
        this.f156244Z0 = tVarA;
        return tVarA;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.b0(requireActivity());
    }

    public final void F5() {
        W w12 = this.f156220B0;
        if (w12 == null) {
            w12 = null;
        }
        w12.a(0L);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        x1 x1Var = this.f156241W0;
        if (x1Var != null) {
            x1Var.f157609m.A0(0);
        }
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f156225G0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // KC.b
    public final void U4(@Y61.k String str, @Y61.k String str2) {
        Yo.p pVar = this.f156232N0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.c(str2, str);
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        (interfaceC30683q0 != null ? interfaceC30683q0 : null).mb("pp_closed_state", str, true);
    }

    @Override // KC.b
    public final void V(@Y61.k String str, @Y61.k List<String> list) {
        x1 x1Var = this.f156241W0;
        if (x1Var != null) {
            g gVar = new g(str);
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(x1Var.f157607k, 0, 2, null);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
            dVar.setCancelable(true);
            dVar.setCanceledOnTouchOutside(true);
            dVar.C(R.layout.favorites_promo_bottom_sheet_layout, new A1(dVar, list, gVar));
            com.avito.android.lib.util.g.a(dVar);
        }
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<kotlin.G0> aVar3) {
        com.avito.beduin.v2.theme.k kVarA;
        cU.s sVarE5 = E5();
        if (sVarE5 == null || (kVarA = sVarE5.a()) == null) {
            return new C28156p(3);
        }
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        aVar4.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new C30671k0(aVarA, 0);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.e1(str);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        a.g gVarE5 = super.e5();
        com.avito.android.async_phone.A a12 = this.f156233O0;
        if (a12 == null) {
            a12 = null;
        }
        return new com.avito.android.deeplink_handler.view.impl.c((com.avito.android.deeplink_handler.view.impl.i) gVarE5, Collections.singletonList(a12));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new b(requireActivity());
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0.c
    public final void g(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f156224F0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.r6(bundle, deepLink, str);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.S();
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        Object objG = C42745f0.G(list);
        interfaceC30683q0.Ic(objG instanceof OrderEntity ? (OrderEntity) objG : null);
    }

    @Override // com.avito.android.favorites.adapter.avito_for_business_exit.c
    public final void l2() {
        com.avito.android.bottom_navigation.A a12 = com.avito.android.bottom_navigation.C.a(requireActivity());
        if (a12 != null) {
            Parcelable.Creator<NavigationTab> creator = NavigationTab.CREATOR;
            ((BottomNavigationFragment) a12).s5(new C28899v(new C28899v.a.C3201a()));
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
            if (interfaceC30683q0 == null) {
                interfaceC30683q0 = null;
            }
            interfaceC30683q0.V3();
        }
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@Y61.k Menu menu, @Y61.k MenuInflater menuInflater) {
        MenuItem menuItemA;
        super.onCreateOptionsMenu(menu, menuInflater);
        G1 g12 = this.f156242X0;
        if (g12 != null) {
            g12.f156278d = menu;
            Y41.p<? super Menu, ? super MenuInflater, kotlin.G0> pVar = g12.f156277c;
            if (pVar != null) {
                ((x1.a) pVar).invoke(menu, menuInflater);
            }
        }
        G1 g13 = this.f156242X0;
        if (g13 != null && (menuItemA = g13.a()) != null) {
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = this.f156240V0;
            if (l12 == null) {
                l12 = null;
            }
            l12.getClass();
            View actionView = menuItemA.getActionView();
            if (actionView != null) {
                View viewFindViewById = actionView.findViewById(R.id.cart_button);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ((ImageView) viewFindViewById).setImageTintList(C35835l0.e(R.attr.black, actionView.getContext()));
            }
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l13 = this.f156240V0;
            if (l13 == null) {
                l13 = null;
            }
            menuItemA.setVisible(l13.d());
        }
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        (interfaceC30683q0 != null ? interfaceC30683q0 : null).X1();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    @Override // androidx.fragment.app.Fragment
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r20, @Y61.l android.view.ViewGroup r21, @Y61.l android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.FavoritesFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.onCleared();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.e0();
        G1 g12 = this.f156242X0;
        if (g12 != null) {
            g12.f156278d = null;
            g12.f156276b = null;
            g12.f156277c = null;
        }
        this.f156242X0 = null;
        this.f156241W0 = null;
        InterfaceC33034d interfaceC33034d = this.f156248w0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        com.avito.android.component.toast.util.c cVar = this.f156228J0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.clear();
        com.avito.android.advert_collection_toast.a aVar = this.f156230L0;
        (aVar != null ? aVar : null).a();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        Y41.l<? super MenuItem, kotlin.G0> lVar;
        G1 g12 = this.f156242X0;
        if (g12 != null && (lVar = g12.f156276b) != null) {
            ((k1) lVar).invoke(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.onPause();
        InterfaceC30683q0 interfaceC30683q02 = this.f156245t0;
        if (interfaceC30683q02 == null) {
            interfaceC30683q02 = null;
        }
        interfaceC30683q02.w(false);
        com.avito.android.location.find.o oVar = this.f156249x0;
        (oVar != null ? oVar : null).c(requireContext());
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.onResume();
        InterfaceC30683q0 interfaceC30683q02 = this.f156245t0;
        if (interfaceC30683q02 == null) {
            interfaceC30683q02 = null;
        }
        interfaceC30683q02.w(true);
        com.avito.android.location.find.o oVar = this.f156249x0;
        (oVar != null ? oVar : null).a(requireContext());
        super.onResume();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new c());
        com.avito.android.serp.adapter.constructor.A a12 = this.f156229K0;
        if (a12 == null) {
            a12 = null;
        }
        com.avito.android.util.G.c(bundle, "constructor_advert_state", a12.d0());
        com.avito.android.serp.adapter.rich_snippets.j jVar = this.f156227I0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.android.util.G.c(bundle, "rich_gallery_state", jVar.d0());
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f156246u0;
        if (bVar == null) {
            bVar = null;
        }
        bundle.putBundle("key_item_visibility_tracker_state", bVar.d0());
        com.avito.android.advertising.adapter.items.buzzoola.premium.r rVar = this.f156247v0;
        bundle.putParcelable("commercial_state", (rVar != null ? rVar : null).d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.T3(this);
        InterfaceC33034d interfaceC33034d = this.f156248w0;
        (interfaceC33034d != null ? interfaceC33034d : null).f(this, this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC30683q0 interfaceC30683q0 = this.f156245t0;
        if (interfaceC30683q0 == null) {
            interfaceC30683q0 = null;
        }
        interfaceC30683q0.c0();
        InterfaceC33034d interfaceC33034d = this.f156248w0;
        (interfaceC33034d != null ? interfaceC33034d : null).a();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12 = this.f156231M0;
        if (n12 == null) {
            n12 = null;
        }
        n12.f176464O.observe(getViewLifecycleOwner(), new C30677n0.a(new d()));
        getLifecycle().a(new com.avito.android.lib.beduin_v2.repository.domain.cart_items.r(new e()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Kundle kundle;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle bundleT5 = t5(bundle);
        Kundle kundleA = bundleT5 != null ? com.avito.android.util.G.a(bundleT5, "presenter_state") : null;
        FavoritesScreen favoritesScreen = FavoritesScreen.f157546d;
        C28478k c28478k = new C28478k(favoritesScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        this.f156223E0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        ZS.b bVar = new ZS.b(favoritesScreen, Owners.f210473c0, (String) null, 4, (C42822w) null);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        InterfaceC30645c.a aVarA = C30612a.a();
        aVarA.v((InterfaceC30646d) C29972i.a(C29972i.b(this), InterfaceC30646d.class));
        aVarA.l(this);
        aVarA.z(this);
        aVarA.a(interfaceC39417aB);
        aVarA.o(c28478k.f90636a);
        aVarA.c(com.avito.android.analytics.screens.s.c(this));
        aVarA.b(getResources());
        aVarA.u(requireContext());
        aVarA.f(kundleA);
        aVarA.i(this);
        aVarA.x(this);
        aVarA.w(this);
        aVarA.d(requireActivity());
        aVarA.g(getF42820b());
        aVarA.n(D5());
        aVarA.m(bundle != null ? com.avito.android.util.G.a(bundle, "constructor_advert_state") : null);
        aVarA.q(new RecyclerView.t());
        aVarA.s(bundle != null ? com.avito.android.util.G.a(bundle, "rich_gallery_state") : null);
        kotlin.reflect.n<Object>[] nVarArr = f156218b1;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f156239U0;
        aVarA.r(((FavoritesFragmentParams) c35968w3.getValue(this, nVar)).f156262b);
        aVarA.y(((FavoritesFragmentParams) c35968w3.getValue(this, nVarArr[0])).f156263c);
        ScreenPerformanceTracker screenPerformanceTracker = this.f156223E0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        aVarA.h(screenPerformanceTracker);
        aVarA.k(bundle != null ? bundle.getBundle("key_item_visibility_tracker_state") : null);
        if (bundle != null) {
            kundle = (Kundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("commercial_state", Kundle.class) : bundle.getParcelable("commercial_state"));
        } else {
            kundle = null;
        }
        aVarA.p(kundle);
        aVarA.j(new C44742f(true, null, new f(c28478k, interfaceC39417aB), 2, null));
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f156223E0;
        aVarA.t(new C31138n0(com.avito.android.lib.beduin_v2.feature.di.K.a(aVarEd, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, bVar, cv.c.d(this), null, null, null, 56)));
        aVarA.build().a(this);
        InterfaceC25497b interfaceC25497b = this.f156222D0;
        if (interfaceC25497b == null) {
            interfaceC25497b = null;
        }
        interfaceC25497b.a(fA2.b());
        InterfaceC25497b interfaceC25497b2 = this.f156222D0;
        (interfaceC25497b2 != null ? interfaceC25497b2 : null).l(g5(), this);
    }

    @Override // KC.b
    public final void s(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f156224F0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, bundle, 2);
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        cU.s sVarE5 = E5();
        if (sVarE5 == null) {
            return new C28156p(3);
        }
        BaseBeduinHostFragment.DetachedBottomSheet.f104752l0.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVarE5, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        return new C30671k0(detachedBottomSheetA, 1);
    }

    @Override // FV0.d
    public final void close() {
    }

    @Override // FV0.c
    @Y61.k
    public final Fragment j1() {
        return this;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
