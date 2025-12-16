package com.avito.android.extended_profile_selection_create.select;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import RA.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import cE.C27025b;
import cU0.C27106d;
import com.avito.android.C0;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.lib.design.button.Button;
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
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.shortcut_navigation_bar.z0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import iw.C42120a;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.d2;
import lE.C43624b;

/* compiled from: ExtendedProfileSelectionCreateView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/H;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H implements FloatingViewsPresenter.Subscriber, InterfaceC34996m, InlineFilterDialogOpener {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f151997A;

    /* renamed from: B, reason: collision with root package name */
    public final int f151998B;

    /* renamed from: C, reason: collision with root package name */
    public final int f151999C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final QA.c f152000D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.floating_views.h f152001E;

    /* renamed from: F, reason: collision with root package name */
    public final q f152002F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public SearchParams f152003G;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f152004b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<RA.a, G0> f152005c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f152006d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<ExtendedProfileSelectionCreateState> f152007e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f152008f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final QH.b f152009g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f152010h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FloatingViewsPresenter f152011i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30999b f152012j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.i f152013k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f152014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34999p f152015m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.j f152016n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Context f152017o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f152018p;

    /* renamed from: q, reason: collision with root package name */
    public final ProfileSearchInputView f152019q;

    /* renamed from: r, reason: collision with root package name */
    public final View f152020r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f152021s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Button f152022t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final View f152023u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f152024v;

    /* renamed from: w, reason: collision with root package name */
    public final View f152025w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f152026x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f152027y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f152028z;

    public H(@Y61.k View view, @Y61.k Y41.l lVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Y41.a aVar, int i12, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k QH.b bVar, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k FloatingViewsPresenter floatingViewsPresenter, @Y61.k FloatingViewsPresenter floatingViewsPresenter2, @Y61.k ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment, @Y61.k FragmentManager fragmentManager, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k com.avito.android.inline_filters.dialog.z zVar, @Y61.k com.avito.android.select.i iVar, @Y61.k com.avito.android.onboarding_manager.a aVar3, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar2, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k com.avito.beduin.v2.engine.component.x xVar, @Y61.k C27106d c27106d, @Y61.k C36135w2 c36135w2) throws Resources.NotFoundException {
        this.f152004b = view;
        this.f152005c = lVar;
        this.f152006d = interfaceC22983P;
        this.f152007e = aVar;
        this.f152008f = dVar;
        this.f152009g = bVar;
        this.f152010h = interfaceC31062w;
        this.f152011i = floatingViewsPresenter;
        this.f152012j = interfaceC30999b;
        this.f152013k = iVar;
        this.f152014l = screenPerformanceTracker;
        View viewFindViewById = view.findViewById(R.id.shortcuts_scroll_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C34999p c34999p = new C34999p(viewFindViewById, aVar2, aVar3, fragmentManager, null, fVar, null, bVar2, screen, screenPerformanceTracker, interfaceC13094a, false, null, null, xVar, c27106d, c36135w2, 14416, null);
        this.f152015m = c34999p;
        this.f152016n = new com.avito.android.inline_filters.dialog.j(extendedProfileSelectionCreateFragment, fragmentManager, interfaceC30999b, zVar, iVar);
        Context context = view.getContext();
        this.f152017o = context;
        Resources resources = view.getResources();
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_selection_create_pull_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        this.f152018p = swipeRefreshLayout;
        ProfileSearchInputView profileSearchInputView = (ProfileSearchInputView) view.findViewById(R.id.extended_profile_selection_create_search_bar);
        this.f152019q = profileSearchInputView;
        this.f152020r = view.findViewById(R.id.items_loading_progress_bar);
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_selection_create_continue_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152021s = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_selection_create_continue_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f152022t = button;
        View viewFindViewById5 = view.findViewById(R.id.extended_profile_selection_create_inactive_fill);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152023u = viewFindViewById5;
        this.f152026x = new DecimalFormat("###,###,###");
        this.f152027y = new com.avito.android.extended_profile_ui_components.l(new p(this), view);
        View viewFindViewById6 = view.findViewById(R.id.extended_profile_selection_create_recycler_view);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.f152028z = recyclerView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12, 1);
        View viewFindViewById7 = view.findViewById(R.id.shortcuts_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById7;
        this.f151997A = viewGroup;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.redesign_toolbar_search_view_height);
        this.f151998B = dimensionPixelSize;
        this.f151999C = resources.getDimensionPixelSize(R.dimen.extended_profile_selection_create_top_padding);
        this.f152000D = new QA.c(view.getContext(), new G(this));
        com.avito.android.floating_views.h hVar = new com.avito.android.floating_views.h(floatingViewsPresenter2, gridLayoutManager);
        this.f152001E = hVar;
        swipeRefreshLayout.g((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_start), (int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_end), true);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.avito.android.extended_profile_selection_create.select.o
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void j0() {
                ((ExtendedProfileSelectionCreateFragment.d) this.f152407b.f152005c).invoke(new a.i(true));
            }
        });
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(null);
        gridLayoutManager.o2(i12);
        gridLayoutManager.f53667M = bVar;
        recyclerView.setAdapter(dVar);
        recyclerView.o(hVar);
        D6.f(recyclerView, 0, dimensionPixelSize, 0, 0, 13);
        recyclerView.l(new LA.a(i12, y6.b(10), y6.b(5)), -1);
        profileSearchInputView.setShareEnabled(false);
        profileSearchInputView.setNavigationIcon(R.drawable.ic_close_24_black);
        if (!profileSearchInputView.f153406x) {
            profileSearchInputView.d();
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new B(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153401s)));
        C43175k.K(new C43197r1(new C(this, null), new A(kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153400r))), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new D(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.g())), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new E(this, null), C43175k.n(C43175k.r(kotlinx.coroutines.rx3.y.a(profileSearchInputView.h())), 1000L)), C22981N.a(interfaceC22983P.getLifecycle()));
        this.f152015m.i(C35835l0.d(R.attr.white, view.getContext()));
        View viewInflate = View.inflate(context, R.layout.extended_profile_selection_create_search_header, viewGroup);
        View viewFindViewById8 = viewInflate.findViewById(R.id.extended_profile_selection_create_search_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152024v = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.extended_profile_selection_create_search_title_more_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152025w = viewFindViewById9;
        C43175k.K(new C43197r1(new s(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283480e0)), C22981N.a(interfaceC22983P.getLifecycle()));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new t(this, null), kotlinx.coroutines.rx3.y.a(c34999p.s60())));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new u(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283503t.f283399m)));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new v(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283476c0)));
        C43175k.K(new C43197r1(new w(this, null), kotlinx.coroutines.rx3.y.a(c34999p.f283504u.f283430i)), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new x(this, null), kotlinx.coroutines.rx3.y.a(interfaceC31062w.l1())), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new y(this, null), kotlinx.coroutines.rx3.y.a(interfaceC31062w.b1())), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new z(this, null), kotlinx.coroutines.rx3.y.a(interfaceC31062w.V0())), C22981N.a(interfaceC22983P.getLifecycle()));
        this.f152002F = new q(this);
        C43175k.K(new C43197r1(new r(this, null), C43175k.r(kotlinx.coroutines.rx3.y.a(c34999p.f283482f0))), C22981N.a(interfaceC22983P.getLifecycle()));
        String string = context.getString(R.string.extended_profile_selection_create_select_title);
        int iJ2 = C35835l0.j(R.attr.textH20, context);
        int iB2 = y6.b(8);
        TextView textView = c34999p.f283505v;
        if (textView != null) {
            I5.a(textView, string, false);
            textView.setTextAppearance(iJ2);
            D6.c(textView, Integer.valueOf(iB2), null, Integer.valueOf(iB2), null, 10);
        }
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.select.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ H f152406c;

            {
                this.f152406c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f152406c.f152005c.invoke(a.f.f14168a);
                        break;
                    default:
                        this.f152406c.f152005c.invoke(a.o.f14177a);
                        break;
                }
            }
        });
        View view2 = this.f152025w;
        final int i14 = 1;
        (view2 != null ? view2 : null).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.select.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ H f152406c;

            {
                this.f152406c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i14) {
                    case 0:
                        this.f152406c.f152005c.invoke(a.f.f14168a);
                        break;
                    default:
                        this.f152406c.f152005c.invoke(a.o.f14177a);
                        break;
                }
            }
        });
    }

    public static void a(H h12, int i12) {
        View view = h12.f152004b;
        int width = view.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : C35835l0.i(view.getContext()).widthPixels, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = h12.f151997A;
        viewGroup.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = viewGroup.getMeasuredHeight();
        int i13 = measuredHeight - i12;
        h12.b(measuredHeight);
        if (i13 != 0) {
            h12.c(i13);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f152015m.Aq();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.Df(onboarding, view, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f152015m.EH(onboarding, onboardingType, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.HQ(onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        this.f152015m.J50(inlineActions);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.JY(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.Ml(onboarding);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        this.f152015m.OM(true);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final d2<Q<String, SectionTagPayload>> QZ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void R00(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l com.avito.android.location.r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k Y41.p pVar, @Y61.l Y41.l lVar, @Y61.k Y41.p pVar2, @Y61.k Y41.p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b) {
        this.f152016n.RA(filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, pVar, lVar, pVar2, pVar3, aVar2, lVar2, lVar3, source, metroResponseBody, str, str2, filter2, filter3, lVar4, interfaceC14024a, dVar, c27025b, c02, c43624b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<z0> list2, @Y61.l Boolean bool, boolean z12) {
        this.f152015m.RS(topWidget, tabsConfig, entryPoint, aVar, aVar2, str, deepLink, num, headerSubtitle, num2, list, list2, bool, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f152015m.TP(shortcutNavigationItem);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.VA(onboarding, aVar, aVar2);
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
        this.f152015m.Xk(str, onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        throw null;
    }

    public final void b(int i12) {
        RecyclerView recyclerView = this.f152028z;
        boolean z12 = i12 <= recyclerView.getPaddingTop() && i12 != this.f151998B;
        if (i12 == recyclerView.getPaddingTop() || z12) {
            return;
        }
        Integer numValueOf = recyclerView.getPaddingTop() < i12 ? Integer.valueOf(recyclerView.computeVerticalScrollOffset()) : null;
        D6.f(this.f152028z, 0, i12, 0, 0, 13);
        if (numValueOf != null && numValueOf.intValue() == 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > 0) {
                recyclerView.A0(0);
            }
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        this.f152015m.bM(true);
    }

    public final void c(int i12) {
        SwipeRefreshLayout swipeRefreshLayout = this.f152018p;
        swipeRefreshLayout.g(((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_start)) + i12, ((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_end)) + i12, true);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        return this.f152016n.d0();
    }

    public final void e(boolean z12) throws Resources.NotFoundException {
        int i12 = z12 ? R.dimen.redesign_23_search_view_padding_bottom_visible_inlines : R.dimen.redesign_23_search_view_padding_bottom_hidden_inlines;
        ProfileSearchInputView profileSearchInputView = this.f152019q;
        int dimensionPixelSize = profileSearchInputView.getResources().getDimensionPixelSize(i12);
        View view = profileSearchInputView.f153386d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        this.f152016n.f2();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f152015m.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar) {
        this.f152015m.fk(bool, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> hY() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        this.f152015m.kF();
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void l(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) throws Resources.NotFoundException {
        boolean z12 = bVar instanceof FloatingViewsPresenter.Subscriber.b.C4630b;
        C34999p c34999p = this.f152015m;
        if (z12) {
            if (((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158446a == FloatingViewsPresenter.Subscriber.DisplayMode.f158441b) {
                boolean z13 = c34999p.f283466U;
                boolean z14 = ((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158449d;
                if (!z13) {
                    c34999p.a(true, z14);
                }
                q qVar = this.f152002F;
                if (qVar == null) {
                    qVar = null;
                }
                if (qVar.f152409b) {
                    FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, z14);
                    q qVar2 = this.f152002F;
                    (qVar2 != null ? qVar2 : null).l(c4630b);
                    bM(true);
                    e(true);
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
                q qVar3 = this.f152002F;
                if (qVar3 == null) {
                    qVar3 = null;
                }
                if (qVar3.f152409b) {
                    FloatingViewsPresenter.Subscriber.b.a aVar = new FloatingViewsPresenter.Subscriber.b.a(z16);
                    q qVar4 = this.f152002F;
                    (qVar4 != null ? qVar4 : null).l(aVar);
                    nV(true);
                    e(true);
                }
                a(this, this.f151999C);
                return;
            }
        }
        if (bVar instanceof FloatingViewsPresenter.Subscriber.b.a) {
            boolean z17 = c34999p.f283466U;
            boolean z18 = ((FloatingViewsPresenter.Subscriber.b.a) bVar).f158445a;
            if (!z17) {
                c34999p.a(false, z18);
            }
            q qVar5 = this.f152002F;
            if (qVar5 == null) {
                qVar5 = null;
            }
            if (qVar5.f152409b) {
                FloatingViewsPresenter.Subscriber.b.C4630b c4630b2 = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, true, z18);
                q qVar6 = this.f152002F;
                (qVar6 != null ? qVar6 : null).l(c4630b2);
                bM(true);
                e(false);
            }
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        this.f152015m.nV(true);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
        this.f152016n.getClass();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
        this.f152016n.getClass();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f152015m.q00(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3);
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
        this.f152015m.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.xU(navigationIconOnboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f152015m.zw(onboarding, aVar, aVar2, aVar3, str, i12);
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void i(boolean z12) {
    }
}
