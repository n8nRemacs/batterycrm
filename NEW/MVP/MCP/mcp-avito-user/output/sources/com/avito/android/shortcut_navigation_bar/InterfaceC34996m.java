package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.HeaderSubtitle;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.TabsConfig;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import iw.C42120a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.d2;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/m;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34996m {

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.m$a */
    public static final class a {
    }

    @Y61.l
    View Aq();

    @Y61.k
    io.reactivex.rxjava3.core.z<DeepLink> Ct();

    void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2);

    void E30(@Y61.k C42120a c42120a);

    void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3);

    void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar);

    void J50(@Y61.l InlineActions inlineActions);

    void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2);

    void MR(@Y61.k List list, boolean z12);

    void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding);

    void OM(boolean z12);

    @Y61.k
    d2<kotlin.Q<String, SectionTagPayload>> QZ();

    void R00(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<z0> list2, @Y61.l Boolean bool, boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.z<DeepLink> TJ();

    void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem);

    void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2);

    @Y61.k
    io.reactivex.rxjava3.core.z<InlineFiltersGeo> Vl();

    void WC(boolean z12);

    void Xk(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k Y41.a aVar);

    void ZN(@Y61.l InlineActions inlineActions);

    void bM(boolean z12);

    @Y61.k
    /* renamed from: ff */
    com.jakewharton.rxrelay3.c getF283478d0();

    void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> hY();

    void kF();

    void nV(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu();

    void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3);

    @Y61.k
    io.reactivex.rxjava3.core.z<String> s60();

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> sA();

    void w50(@Y61.l PinnedItem pinnedItem);

    void xL(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a aVar);

    void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2);

    void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12);
}
