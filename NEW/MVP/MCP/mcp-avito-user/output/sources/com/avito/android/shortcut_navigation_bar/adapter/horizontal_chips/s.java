package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: HorizontalChipsShortcutPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/s;", "LTV0/d;", "Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/t;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements TV0.d<t, ShortcutNavigationItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C34999p f283323b;

    public s(@Y61.k C34999p c34999p) {
        this.f283323b = c34999p;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Filter.MultiThemeIcon multiThemeIcon;
        t tVar = (t) eVar;
        ShortcutNavigationItem shortcutNavigationItem = (ShortcutNavigationItem) aVar;
        tVar.U7(shortcutNavigationItem.getF283244c(), false);
        tVar.c(new q(this, i12));
        ShortcutNavigationItemImpl shortcutNavigationItemImpl = shortcutNavigationItem instanceof ShortcutNavigationItemImpl ? (ShortcutNavigationItemImpl) shortcutNavigationItem : null;
        if (shortcutNavigationItemImpl == null || (multiThemeIcon = shortcutNavigationItemImpl.f283250i) == null) {
            new r(tVar);
        } else {
            tVar.Uq(multiThemeIcon.getNormal(), multiThemeIcon.getSize(), C43066x.K(shortcutNavigationItem.getF283244c()));
            G0 g02 = G0.f406611a;
        }
    }
}
