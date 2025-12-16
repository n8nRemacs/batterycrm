package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import Y41.p;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import cE.C27025b;
import cU0.InterfaceC27108f;
import com.avito.android.C0;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.z;
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
import com.avito.android.util.y6;
import iw.C42120a;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.d2;
import lE.C43624b;

/* compiled from: InlineFiltersItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/m;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n extends com.avito.konveyor.adapter.b implements m, InterfaceC34996m, InlineFilterDialogOpener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34999p f154673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.j f154674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f154675d;

    /* compiled from: InlineFiltersItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/search/inline_filters/n$a", "Lcom/avito/android/shortcut_navigation_bar/p$b;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements C34999p.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f154676a = y6.b(0);

        /* renamed from: b, reason: collision with root package name */
        public final int f154677b = y6.b(9);

        /* renamed from: c, reason: collision with root package name */
        public final int f154678c = y6.b(6);

        /* renamed from: d, reason: collision with root package name */
        public final int f154679d = y6.b(18);

        /* renamed from: e, reason: collision with root package name */
        public final int f154680e = y6.b(24);

        /* renamed from: f, reason: collision with root package name */
        public final int f154681f = y6.b(24);

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer a() {
            return Integer.valueOf(this.f154681f);
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer b() {
            return Integer.valueOf(this.f154679d);
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer c() {
            return Integer.valueOf(this.f154680e);
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer d() {
            return Integer.valueOf(this.f154677b);
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer e() {
            return Integer.valueOf(this.f154678c);
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer m() {
            return Integer.valueOf(this.f154676a);
        }
    }

    public n(@Y61.k View view, @Y61.k Fragment fragment, @Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.onboarding_manager.a aVar2, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k z zVar, @Y61.k com.avito.android.select.i iVar, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k com.avito.beduin.v2.engine.component.z zVar2, @Y61.k InterfaceC27108f interfaceC27108f, @Y61.k C36135w2 c36135w2) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.shortcuts_scroll_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C34999p c34999p = new C34999p(viewFindViewById, aVar, aVar2, fragmentManager, null, fVar, new a(), bVar, screen, screenPerformanceTracker, interfaceC13094a, false, null, null, zVar2, interfaceC27108f, c36135w2, 14352, null);
        this.f154673b = c34999p;
        this.f154674c = new com.avito.android.inline_filters.dialog.j(fragment, fragmentManager, interfaceC30999b, zVar, iVar);
        this.f154673b.i(C35835l0.d(R.attr.white, view.getContext()));
        D6.H(c34999p.f283473b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f154673b.Aq();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        return this.f154673b.f283504u.f283430i;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.Df(onboarding, view, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f154673b.EH(onboarding, onboardingType, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.HQ(onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        this.f154673b.J50(inlineActions);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.JY(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.Ml(onboarding);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        this.f154673b.OM(true);
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
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k p pVar, @Y61.l Y41.l lVar, @Y61.k p pVar2, @Y61.k p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b) {
        this.f154674c.RA(filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, pVar, lVar, pVar2, pVar3, aVar2, lVar2, lVar3, source, metroResponseBody, str, str2, filter2, filter3, lVar4, interfaceC14024a, dVar, c27025b, c02, c43624b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<z0> list2, @Y61.l Boolean bool, boolean z12) {
        this.f154673b.RS(topWidget, tabsConfig, entryPoint, aVar, aVar2, str, deepLink, num, headerSubtitle, num2, list, list2, bool, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        return this.f154673b.f283503t.f283399m;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f154673b.TP(shortcutNavigationItem);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.VA(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFiltersGeo> Vl() {
        return this.f154673b.f283480e0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void WC(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Xk(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.Xk(str, onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.inline_filters.m
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f154675d = aVar;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        return this.f154674c.d0();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        this.f154674c.f2();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f154673b.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar) {
        this.f154673b.fk(bool, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> hY() {
        throw null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f154675d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        this.f154673b.kF();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
        this.f154674c.getClass();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
        this.f154674c.getClass();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        return this.f154673b.f283476c0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f154673b.q00(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> s60() {
        return this.f154673b.s60();
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
        this.f154673b.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.xU(navigationIconOnboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f154673b.zw(onboarding, aVar, aVar2, aVar3, str, i12);
    }
}
