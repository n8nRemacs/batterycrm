package com.avito.android.profile_settings;

import Eb0.C13470a;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import com.avito.android.util.O2;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: ProfileSettingsMviView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/p;", "Lcom/avito/android/profile_settings/l;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f228497a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProfileSettingsMviFragment f228498b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.c<TabItem> f228499c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C13470a f228500d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> f228501e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f228502f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f228503g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f228504h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AvitoTabLayout f228505i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ViewPager2 f228506j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f228507k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f228508l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final o f228509m;

    public p(@Y61.k View view, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k q qVar, @Y61.k ProfileSettingsMviFragment profileSettingsMviFragment, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.c cVar, @Y61.k C13470a c13470a, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j jVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f228497a = qVar;
        this.f228498b = profileSettingsMviFragment;
        this.f228499c = cVar;
        this.f228500d = c13470a;
        this.f228501e = jVar;
        this.f228502f = screenPerformanceTracker;
        View viewFindViewById = view.findViewById(R.id.settings_appbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        this.f228503g = (AppBarLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.settings_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228504h = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.settings_tabs);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.AvitoTabLayout");
        }
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) viewFindViewById3;
        this.f228505i = avitoTabLayout;
        View viewFindViewById4 = view.findViewById(R.id.settings_viewpager);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById4;
        this.f228506j = viewPager2;
        View viewFindViewById5 = view.findViewById(R.id.toolbar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.toolbar_link);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228507k = (TextView) viewFindViewById6;
        this.f228508l = new com.avito.android.extended_profile_ui_components.l(new n(this), view);
        this.f228509m = new o(this);
        viewPager2.setAdapter(c13470a);
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, cVar);
        com.avito.android.lib.design.tab_layout.util.b.b(viewPager2, avitoTabLayout);
        ProfileSettingsState.Data data = qVar.getState().getValue().f228468b;
        List<TabItem> list = data != null ? data.f228473c : null;
        if (O2.a(list)) {
            jVar.E5(list);
        }
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setUserInputEnabled(false);
        toolbar.setNavigationOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 5));
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new m(this, null), 3);
    }
}
