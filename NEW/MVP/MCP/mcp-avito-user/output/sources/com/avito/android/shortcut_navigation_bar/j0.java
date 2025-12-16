package com.avito.android.shortcut_navigation_bar;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Shortcuts;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/j0;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface j0 {
    @Y61.k
    List<z0> a(@Y61.l List<Tab> list);

    @Y61.k
    List<ShortcutNavigationItem> b(@Y61.l Shortcuts shortcuts);

    @Y61.k
    ShortcutNavigationItem c(@Y61.k Filter filter, int i12, @Y61.k DeepLink deepLink);

    @Y61.k
    List<ShortcutNavigationItem> d(@Y61.l InlineFilters inlineFilters);
}
