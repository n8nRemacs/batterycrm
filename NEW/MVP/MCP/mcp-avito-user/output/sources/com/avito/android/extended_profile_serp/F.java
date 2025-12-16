package com.avito.android.extended_profile_serp;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import bB.InterfaceC25487a;
import cE.C27025b;
import cU0.C27106d;
import com.avito.android.C0;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.HeaderSubtitle;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.TabsConfig;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.shortcut_navigation_bar.z0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import iw.C42120a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.d2;
import lE.C43624b;

/* compiled from: ExtendedProfileSerpView.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_serp/F;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/advert/viewed/j;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class F implements com.avito.android.favorite.s, com.avito.android.advert.viewed.j, FloatingViewsPresenter.Subscriber, InterfaceC34996m, InlineFilterDialogOpener {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f152516A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final View f152517B;

    /* renamed from: C, reason: collision with root package name */
    public final int f152518C;

    /* renamed from: D, reason: collision with root package name */
    public final int f152519D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f152520E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f152521F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.floating_views.h f152522G;

    /* renamed from: H, reason: collision with root package name */
    public final H f152523H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public SearchParams f152524I;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f152525b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC25487a, G0> f152526c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f152527d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<ExtendedProfileSerpState> f152528e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f152529f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> f152530g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f152531h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f152532i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.f f152533j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f152534k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final FloatingViewsPresenter f152535l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h1 f152536m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y0 f152537n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_phone_dialog.c f152538o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30999b f152539p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.i f152540q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f152541r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f152542s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34999p f152543t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.j f152544u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Context f152545v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f152546w;

    /* renamed from: x, reason: collision with root package name */
    public final ProfileSearchInputView f152547x;

    /* renamed from: y, reason: collision with root package name */
    public final View f152548y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f152549z;

    /* compiled from: ExtendedProfileSerpView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ExtendedProfileSerpState.ErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExtendedProfileSerpState.ErrorType errorType = ExtendedProfileSerpState.ErrorType.f152972b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public F(@Y61.k View view, @Y61.k Y41.l lVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Y41.a aVar, int i12, @Y61.k GridLayoutManager.c cVar, @Y61.k com.avito.android.recycler.data_aware.c cVar2, @Y61.k com.avito.android.ui.adapter.h hVar, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert.viewed.f fVar, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k FloatingViewsPresenter floatingViewsPresenter, @Y61.k FloatingViewsPresenter floatingViewsPresenter2, @Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig, @Y61.k h1 h1Var, @Y61.k Y0 y02, @Y61.k ExtendedProfileSerpFragment extendedProfileSerpFragment, @Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.extended_profile_phone_dialog.c cVar3, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k com.avito.android.util.text.a aVar3, @Y61.k com.avito.android.inline_filters.dialog.z zVar, @Y61.k com.avito.android.select.i iVar, @Y61.k com.avito.android.onboarding_manager.a aVar4, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k com.avito.konveyor.a aVar5, @Y61.k com.avito.beduin.v2.engine.component.x xVar, @Y61.k C27106d c27106d, @Y61.k com.avito.android.onboarding_manager.f fVar2, @Y61.k C36135w2 c36135w2) throws Resources.NotFoundException {
        this.f152525b = view;
        this.f152526c = lVar;
        this.f152527d = interfaceC22983P;
        this.f152528e = aVar;
        this.f152529f = cVar2;
        this.f152530g = hVar;
        this.f152531h = aVar2;
        this.f152532i = nVar;
        this.f152533j = fVar;
        this.f152534k = interfaceC31062w;
        this.f152535l = floatingViewsPresenter;
        this.f152536m = h1Var;
        this.f152537n = y02;
        this.f152538o = cVar3;
        this.f152539p = interfaceC30999b;
        this.f152540q = iVar;
        this.f152541r = screenPerformanceTracker;
        this.f152542s = fVar2;
        View viewFindViewById = view.findViewById(R.id.shortcuts_scroll_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C34999p c34999p = new C34999p(viewFindViewById, aVar3, aVar4, fragmentManager, null, fVar2, null, bVar, screen, screenPerformanceTracker, interfaceC13094a, false, null, null, xVar, c27106d, c36135w2, 14416, null);
        this.f152543t = c34999p;
        this.f152544u = new com.avito.android.inline_filters.dialog.j(extendedProfileSerpFragment, fragmentManager, interfaceC30999b, zVar, iVar);
        Context context = view.getContext();
        this.f152545v = context;
        Resources resources = view.getResources();
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_serp_pull_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        this.f152546w = swipeRefreshLayout;
        ProfileSearchInputView profileSearchInputView = (ProfileSearchInputView) view.findViewById(R.id.extended_profile_serp_search_bar);
        this.f152547x = profileSearchInputView;
        this.f152548y = view.findViewById(R.id.items_loading_progress_bar);
        this.f152549z = new com.avito.android.extended_profile_ui_components.l(new G(this), view);
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_serp_recycler_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f152516A = recyclerView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12, 1);
        View viewFindViewById4 = view.findViewById(R.id.shortcuts_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152517B = viewFindViewById4;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.redesign_toolbar_search_view_height);
        this.f152518C = dimensionPixelSize;
        this.f152519D = resources.getDimensionPixelSize(R.dimen.extended_profile_serp_top_padding);
        y6.b(22);
        y6.b(112);
        com.avito.android.floating_views.h hVar2 = new com.avito.android.floating_views.h(floatingViewsPresenter2, gridLayoutManager);
        this.f152522G = hVar2;
        swipeRefreshLayout.g((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_start), (int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_end), true);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.avito.android.extended_profile_serp.C
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void j0() {
                ((ExtendedProfileSerpFragment.e) this.f152439b.f152526c).invoke(new InterfaceC25487a.l(true));
            }
        });
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(null);
        gridLayoutManager.o2(i12);
        gridLayoutManager.f53667M = cVar;
        recyclerView.setAdapter(hVar);
        recyclerView.o(hVar2);
        D6.f(recyclerView, 0, dimensionPixelSize, 0, 0, 13);
        recyclerView.l(new TA.a(i12, y6.b(16), aVar5), -1);
        String query = extendedProfileSerpConfig.f152444d.getQuery();
        profileSearchInputView.setQuery(query == null ? "" : query);
        profileSearchInputView.setNavigationIcon(R.drawable.ic_back_24_black);
        profileSearchInputView.setAdapter(jVar);
        if (!profileSearchInputView.f153406x) {
            profileSearchInputView.d();
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new T(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153401s)));
        C43175k.K(new C43197r1(new U(this, null), new S(kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153400r))), C22981N.a(interfaceC22983P.getLifecycle()));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new V(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.g())));
        C43175k.K(new C43197r1(new W(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153402t)), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new X(this, null), C43175k.r(kotlinx.coroutines.rx3.y.a(profileSearchInputView.h()))), C22981N.a(interfaceC22983P.getLifecycle()));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new Y(this, null), C43175k.n(C43175k.r(kotlinx.coroutines.rx3.y.a(profileSearchInputView.h())), 1000L)));
        C43175k.K(new C43197r1(new Z(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153404v)), C22981N.a(interfaceC22983P.getLifecycle()));
        this.f152543t.i(C35835l0.d(R.attr.white, view.getContext()));
        C43175k.K(new C43197r1(new J(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283480e0)), C22981N.a(interfaceC22983P.getLifecycle()));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new K(this, null), kotlinx.coroutines.rx3.y.a(c34999p.s60())));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new L(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283503t.f283399m)));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new M(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283476c0)));
        C43175k.K(new C43197r1(new N(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283504u.f283430i)), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new O(this, null), kotlinx.coroutines.rx3.y.a(interfaceC31062w.getF172393J())), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new P(this, null), kotlinx.coroutines.rx3.y.a(interfaceC31062w.getF172392I())), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new Q(this, null), kotlinx.coroutines.rx3.y.a(interfaceC31062w.getF172395L())), C22981N.a(interfaceC22983P.getLifecycle()));
        this.f152523H = new H(this);
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new I(this, null), C43175k.r(kotlinx.coroutines.rx3.y.a(c34999p.f283482f0))));
    }

    public static void a(F f12, int i12) {
        View view = f12.f152525b;
        int width = view.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : C35835l0.i(view.getContext()).widthPixels, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View view2 = f12.f152517B;
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = view2.getMeasuredHeight();
        int i13 = measuredHeight - i12;
        f12.c(measuredHeight);
        if (i13 != 0) {
            f12.e(i13);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f152543t.Aq();
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f152516A);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.Df(onboarding, view, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f152543t.EH(onboarding, onboardingType, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.HQ(onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        this.f152543t.J50(inlineActions);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.JY(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.Ml(onboarding);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        this.f152543t.OM(true);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final d2<kotlin.Q<String, SectionTagPayload>> QZ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void R00(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l com.avito.android.inline_filters.W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l com.avito.android.location.r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k Y41.p pVar, @Y61.l Y41.l lVar, @Y61.k Y41.p pVar2, @Y61.k Y41.p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b) {
        this.f152544u.RA(filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, pVar, lVar, pVar2, pVar3, aVar2, lVar2, lVar3, source, metroResponseBody, str, str2, filter2, filter3, lVar4, interfaceC14024a, dVar, c27025b, c02, c43624b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<z0> list2, @Y61.l Boolean bool, boolean z12) {
        this.f152543t.RS(topWidget, tabsConfig, entryPoint, aVar, aVar2, str, deepLink, num, headerSubtitle, num2, list, list2, bool, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f152543t.TP(shortcutNavigationItem);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.VA(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFiltersGeo> Vl() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void WC(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Xk(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.Xk(str, onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        this.f152543t.bM(true);
    }

    public final void c(int i12) {
        RecyclerView recyclerView = this.f152516A;
        boolean z12 = i12 <= recyclerView.getPaddingTop() && i12 != this.f152518C;
        if (i12 == recyclerView.getPaddingTop() || z12) {
            return;
        }
        Integer numValueOf = recyclerView.getPaddingTop() < i12 ? Integer.valueOf(recyclerView.computeVerticalScrollOffset()) : null;
        D6.f(this.f152516A, 0, i12, 0, 0, 13);
        if (recyclerView.isLaidOut() && numValueOf != null && numValueOf.intValue() == 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > 0) {
                recyclerView.A0(0);
            }
        }
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        return this.f152544u.d0();
    }

    public final void e(int i12) {
        SwipeRefreshLayout swipeRefreshLayout = this.f152546w;
        swipeRefreshLayout.g(((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_start)) + i12, ((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_end)) + i12, true);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        this.f152544u.f2();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f152543t.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar) {
        this.f152543t.fk(bool, aVar);
    }

    public final void g(boolean z12) throws Resources.NotFoundException {
        int i12 = z12 ? R.dimen.redesign_23_search_view_padding_bottom_visible_inlines : R.dimen.redesign_23_search_view_padding_bottom_hidden_inlines;
        ProfileSearchInputView profileSearchInputView = this.f152547x;
        int dimensionPixelSize = profileSearchInputView.getResources().getDimensionPixelSize(i12);
        View view = profileSearchInputView.f153386d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> hY() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        this.f152543t.kF();
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void l(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) throws Resources.NotFoundException {
        boolean z12 = bVar instanceof FloatingViewsPresenter.Subscriber.b.C4630b;
        C34999p c34999p = this.f152543t;
        if (z12) {
            if (((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158446a == FloatingViewsPresenter.Subscriber.DisplayMode.f158441b) {
                boolean z13 = c34999p.f283466U;
                boolean z14 = ((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158449d;
                if (!z13) {
                    c34999p.a(true, z14);
                }
                H h12 = this.f152523H;
                if (h12 == null) {
                    h12 = null;
                }
                if (h12.f152551b) {
                    FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, z14);
                    H h13 = this.f152523H;
                    (h13 != null ? h13 : null).l(c4630b);
                    bM(true);
                    g(true);
                    return;
                }
                return;
            }
        }
        if (z12) {
            if (((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158446a == FloatingViewsPresenter.Subscriber.DisplayMode.f158442c) {
                boolean z15 = c34999p.f283466U;
                boolean z16 = ((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158449d;
                if (!z15) {
                    c34999p.a(true, z16);
                }
                H h14 = this.f152523H;
                if (h14 == null) {
                    h14 = null;
                }
                if (h14.f152551b) {
                    FloatingViewsPresenter.Subscriber.b.a aVar = new FloatingViewsPresenter.Subscriber.b.a(z16);
                    H h15 = this.f152523H;
                    (h15 != null ? h15 : null).l(aVar);
                    nV(true);
                    g(true);
                }
                a(this, this.f152519D);
                return;
            }
        }
        if (bVar instanceof FloatingViewsPresenter.Subscriber.b.a) {
            boolean z17 = c34999p.f283466U;
            boolean z18 = ((FloatingViewsPresenter.Subscriber.b.a) bVar).f158445a;
            if (!z17) {
                c34999p.a(false, z18);
            }
            H h16 = this.f152523H;
            if (h16 == null) {
                h16 = null;
            }
            if (h16.f152551b) {
                FloatingViewsPresenter.Subscriber.b.C4630b c4630b2 = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, true, z18);
                H h17 = this.f152523H;
                (h17 != null ? h17 : null).l(c4630b2);
                bM(true);
                g(false);
            }
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        this.f152543t.nV(true);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
        this.f152544u.getClass();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
        this.f152544u.getClass();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f152543t.q00(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> s60() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> sA() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void w50(@Y61.l PinnedItem pinnedItem) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xL(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.xU(navigationIconOnboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152543t.zw(onboarding, aVar, aVar2, aVar3, str, i12);
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void i(boolean z12) {
    }
}
