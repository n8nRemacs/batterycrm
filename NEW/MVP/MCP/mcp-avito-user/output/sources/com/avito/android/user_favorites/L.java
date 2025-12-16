package com.avito.android.user_favorites;

import android.view.View;
import android.widget.FrameLayout;
import cU0.C27106d;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.ui.SafeViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserFavoritesView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/L;", "Lcom/avito/android/user_favorites/J;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class L implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_favorites.adapter.a f316789a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TabPagerAdapter f316790b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f316791c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AvitoTabLayout f316792d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SafeViewPager f316793e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f316794f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.beduin_v2.feature.item.a f316795g;

    public L(@Y61.k View view, @Y61.k com.avito.android.user_favorites.adapter.a aVar, @Y61.k TabPagerAdapter tabPagerAdapter, @Y61.k H h12) {
        this.f316789a = aVar;
        this.f316790b = tabPagerAdapter;
        this.f316791c = h12;
        View viewFindViewById = view.findViewById(R.id.tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.AvitoTabLayout");
        }
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) viewFindViewById;
        this.f316792d = avitoTabLayout;
        View viewFindViewById2 = view.findViewById(R.id.view_pager);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.ui.SafeViewPager");
        }
        SafeViewPager safeViewPager = (SafeViewPager) viewFindViewById2;
        this.f316793e = safeViewPager;
        View viewFindViewById3 = view.findViewById(R.id.top_widget_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f316794f = (FrameLayout) viewFindViewById3;
        safeViewPager.setPagingEnabled(false);
        com.avito.android.lib.design.tab_layout.util.b.a(safeViewPager, avitoTabLayout);
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, aVar);
        safeViewPager.setAdapter(tabPagerAdapter);
    }

    @Override // com.avito.android.user_favorites.J
    public final void a(@Y61.l BeduinV2 beduinV2) {
        com.avito.android.lib.beduin_v2.feature.item.a aVar = this.f316795g;
        if (aVar != null) {
            aVar.a();
        }
        if (beduinV2 == null) {
            return;
        }
        if (this.f316795g == null) {
            H h12 = this.f316791c;
            com.avito.android.lib.beduin_v2.feature.item.b bVar = h12.f316785a;
            ZS.b bVar2 = new ZS.b(h12.f316786b, Owners.f210550w, "UserFavoritesTopWidget");
            com.avito.beduin.v2.engine.component.x xVar = new com.avito.beduin.v2.engine.component.x();
            this.f316795g = bVar.a(bVar2, this.f316794f, new C27106d(), h12.f316787c, xVar, true);
        }
        com.avito.android.lib.beduin_v2.feature.item.a aVar2 = this.f316795g;
        if (aVar2 != null) {
            aVar2.T3(beduinV2.getJson());
        }
    }

    public final void b() {
        this.f316789a.d();
    }

    public final void c() {
        b();
        this.f316790b.h();
    }

    public final void d(int i12) {
        this.f316793e.setCurrentItem(i12);
    }
}
