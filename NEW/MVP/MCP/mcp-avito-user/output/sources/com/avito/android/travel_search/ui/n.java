package com.avito.android.travel_search.ui;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cE.C27025b;
import cU0.C27106d;
import com.avito.android.C0;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.location.r;
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
import com.avito.android.serp.adapter.l1;
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
import com.avito.android.util.I5;
import com.avito.android.util.RunnableC35962v4;
import com.avito.android.util.y6;
import com.avito.beduin.v2.engine.component.x;
import i31.InterfaceC41220a;
import iw.C42120a;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.d2;
import lE.C43624b;
import vF0.InterfaceC49206a;
import vF0.InterfaceC49208c;
import vF0.e;
import vF0.h;

/* compiled from: TravelSearchView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/ui/n;", "Lcom/avito/android/travel_search/ui/l;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "a", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements l, InterfaceC34996m, InlineFilterDialogOpener {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f303246A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final View f303247B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final View f303248C;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f303249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49206a, G0> f303250c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f303251d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f303252e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.item.b f303253f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f303254g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13094a f303255h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f303256i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30999b f303257j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f303258k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f303259l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34999p f303260m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.j f303261n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f303262o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final View f303263p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ImageView f303264q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f303265r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f303266s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final View f303267t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f303268u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final View f303269v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final View f303270w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final View f303271x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final View f303272y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final TextView f303273z;

    /* compiled from: TravelSearchView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/ui/n$a;", "", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        n a(@Y61.k View view, @Y61.k TravelSearchFragment travelSearchFragment, @Y61.k FragmentManager fragmentManager, @Y61.k x xVar, @Y61.k C27106d c27106d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i31.c
    public n(@InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k TravelSearchFragment travelSearchFragment, @InterfaceC41220a @Y61.k FragmentManager fragmentManager, @InterfaceC41220a @Y61.k x xVar, @InterfaceC41220a @Y61.k C27106d c27106d, @Y61.k Y41.l lVar, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k com.avito.android.onboarding_manager.a aVar, @Y61.k z zVar, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k C36135w2 c36135w2) {
        this.f303249b = view;
        this.f303250c = lVar;
        this.f303251d = screenPerformanceTracker;
        this.f303252e = dVar;
        this.f303253f = bVar;
        this.f303254g = nVar;
        this.f303255h = interfaceC13094a;
        this.f303256i = interfaceC31062w;
        this.f303257j = interfaceC30999b;
        this.f303258k = fVar;
        this.f303259l = aVar2;
        View viewFindViewById = view.findViewById(R.id.shortcuts_scroll_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f303260m = new C34999p(viewFindViewById, aVar2, aVar, fragmentManager, null, fVar, null, bVar, screen, screenPerformanceTracker, interfaceC13094a, false, null, null, xVar, c27106d, c36135w2, 14416, null);
        this.f303261n = new com.avito.android.inline_filters.dialog.j(travelSearchFragment, fragmentManager, interfaceC30999b, zVar, 0 == true ? 1 : 0, 16, 0 == true ? 1 : 0);
        this.f303262o = view.getContext();
        this.f303263p = view.findViewById(R.id.error_container);
        this.f303264q = (ImageView) view.findViewById(R.id.error_image);
        this.f303265r = (TextView) view.findViewById(R.id.error_title);
        this.f303266s = (TextView) view.findViewById(R.id.error_subtitle);
        Button button = (Button) view.findViewById(R.id.error_retry_btn);
        this.f303267t = view.findViewById(R.id.content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_recycler_view);
        this.f303268u = recyclerView;
        this.f303269v = view.findViewById(R.id.content_skeleton);
        this.f303270w = view.findViewById(R.id.filters_container);
        this.f303271x = view.findViewById(R.id.filters_skeleton);
        View viewFindViewById2 = view.findViewById(R.id.shortcuts_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById2.setBackgroundColor(C35835l0.d(R.attr.white, viewFindViewById2.getContext()));
        com.akita.view.foundation.util.e.b(viewFindViewById2, y6.b(2), 0, y6.b(2), 0, 8);
        this.f303272y = viewFindViewById2;
        this.f303273z = (TextView) view.findViewById(R.id.toolbar_title);
        this.f303246A = (TextView) view.findViewById(R.id.toolbar_subtitle);
        this.f303247B = view.findViewById(R.id.toolbar_title_skeleton);
        this.f303248C = view.findViewById(R.id.toolbar_subtitle_skeleton);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.toolbar_nav_button);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator(null);
        recyclerView.l(new com.avito.android.serp.adapter.attributed_header_widget.f(recyclerView.getResources(), true), -1);
        final int i12 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.travel_search.ui.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f303245c;

            {
                this.f303245c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f303245c.f303250c.invoke(InterfaceC49206a.e.f440566a);
                        break;
                    default:
                        this.f303245c.f303250c.invoke(InterfaceC49206a.f.f440567a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.travel_search.ui.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f303245c;

            {
                this.f303245c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f303245c.f303250c.invoke(InterfaceC49206a.e.f440566a);
                        break;
                    default:
                        this.f303245c.f303250c.invoke(InterfaceC49206a.f.f440567a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.travel_search.ui.l
    public final void AM(@Y61.k vF0.e eVar) {
        C34999p c34999p = this.f303260m;
        c34999p.f283462Q.setVisibility(8);
        View view = c34999p.f283473b;
        Group group = (Group) view.findViewById(R.id.filters_group);
        if (group != null) {
            D6.w(group);
        }
        bM(false);
        boolean z12 = eVar instanceof e.c;
        View view2 = this.f303271x;
        View view3 = this.f303270w;
        if (z12) {
            D6.w(view3);
            D6.w(view2);
            D6.w(c34999p.f283473b);
            return;
        }
        if (eVar instanceof e.d) {
            this.f303256i.s1();
            D6.H(view3);
            D6.w(view2);
            D6.H(view);
            return;
        }
        if (eVar instanceof e.b) {
            D6.w(view3);
            D6.w(view2);
            D6.w(c34999p.f283473b);
        } else if (eVar instanceof e.C12757e) {
            D6.H(view3);
            view2.setVisibility(((e.C12757e) eVar).f440597b ? 0 : 8);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f303260m.Aq();
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        RecyclerView recyclerView = this.f303268u;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            if (recyclerView.d0()) {
                recyclerView.post(new RunnableC35962v4(adapter, i12, "favorite_status_changed_payload"));
            } else {
                adapter.notifyItemChanged(i12, "favorite_status_changed_payload");
            }
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.Df(onboarding, view, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f303260m.EH(onboarding, onboardingType, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.HQ(onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        this.f303260m.J50(inlineActions);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.JY(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.Ml(onboarding);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        this.f303260m.OM(true);
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
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k Y41.p pVar, @Y61.l Y41.l lVar, @Y61.k Y41.p pVar2, @Y61.k Y41.p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b) {
        this.f303261n.RA(filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, pVar, lVar, pVar2, pVar3, aVar2, lVar2, lVar3, source, metroResponseBody, str, str2, filter2, filter3, lVar4, interfaceC14024a, dVar, c27025b, c02, c43624b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<z0> list2, @Y61.l Boolean bool, boolean z12) {
        this.f303260m.RS(topWidget, tabsConfig, entryPoint, aVar, aVar2, str, deepLink, num, headerSubtitle, num2, list, list2, bool, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f303260m.TP(shortcutNavigationItem);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.VA(onboarding, aVar, aVar2);
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
        this.f303260m.Xk(str, onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        this.f303260m.bM(false);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        return this.f303261n.d0();
    }

    @Override // qK0.d
    public final void destroy() {
        RecyclerView recyclerView = this.f303268u;
        recyclerView.setAdapter(null);
        C35976x4.a(recyclerView);
        this.f303254g.I();
        this.f303256i.I();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        this.f303261n.f2();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f303260m.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar) {
        this.f303260m.fk(bool, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> hY() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        this.f303260m.kF();
    }

    @Override // com.avito.android.travel_search.ui.l
    public final void kl(@Y61.k InterfaceC49208c interfaceC49208c) {
        boolean z12 = interfaceC49208c instanceof InterfaceC49208c.b;
        View view = this.f303263p;
        View view2 = this.f303269v;
        RecyclerView recyclerView = this.f303268u;
        View view3 = this.f303267t;
        if (z12) {
            List<l1> list = ((InterfaceC49208c.b) interfaceC49208c).f440580b;
            this.f303254g.c(new UV0.c(list));
            this.f303252e.l(list, null);
            D6.H(view3);
            D6.H(recyclerView);
            D6.w(view2);
            D6.w(view);
            return;
        }
        if (!(interfaceC49208c instanceof InterfaceC49208c.C12755c)) {
            if (interfaceC49208c instanceof InterfaceC49208c.d) {
                D6.H(view3);
                D6.w(recyclerView);
                D6.H(view2);
                D6.w(view);
                return;
            }
            return;
        }
        D6.w(recyclerView);
        D6.w(view2);
        D6.H(view);
        D6.w(view3);
        InterfaceC49208c.C12755c c12755c = (InterfaceC49208c.C12755c) interfaceC49208c;
        int i12 = c12755c.f440581b;
        Context context = this.f303262o;
        this.f303264q.setImageDrawable(androidx.core.content.d.getDrawable(context, i12));
        I5.a(this.f303265r, c12755c.f440582c.k0(context), false);
        I5.a(this.f303266s, c12755c.f440583d.k0(context), false);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
        this.f303261n.getClass();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
        this.f303261n.getClass();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        return this.f303260m.f283476c0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f303260m.q00(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.travel_search.ui.l
    public final void rl(@Y61.k vF0.h hVar) {
        boolean z12 = hVar instanceof h.d;
        View view = this.f303248C;
        View view2 = this.f303247B;
        TextView textView = this.f303246A;
        TextView textView2 = this.f303273z;
        if (z12) {
            h.d dVar = (h.d) hVar;
            I5.a(textView2, dVar.f440624b, false);
            I5.a(textView, dVar.f440625c, false);
            D6.w(view2);
            D6.w(view);
            return;
        }
        if (hVar instanceof h.c) {
            boolean z13 = ((h.c) hVar).f440623b;
            view2.setVisibility(z13 ? 0 : 8);
            view.setVisibility(z13 ? 0 : 8);
            textView2.setVisibility(!z13 ? 0 : 8);
            textView.setVisibility(z13 ? 8 : 0);
            return;
        }
        if (hVar instanceof h.b) {
            D6.w(view2);
            D6.w(view);
            D6.w(textView2);
            D6.w(textView);
        }
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
        this.f303260m.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.xU(navigationIconOnboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f303260m.zw(onboarding, aVar, aVar2, aVar3, str, i12);
    }
}
