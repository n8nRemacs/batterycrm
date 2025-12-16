package com.avito.android.feed_shortcuts.element;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.PersistableSerpItem;
import kotlin.Metadata;

/* compiled from: FeedShortcutsWidgetElementItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feed_shortcuts/element/FeedShortcutsWidgetElementItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_bx-content_widget_feed-shortcuts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FeedShortcutsWidgetElementItem extends PersistableSerpItem {

    /* compiled from: FeedShortcutsWidgetElementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    int f0();

    @k
    DeepLink getAction();

    @l
    Analytics getAnalytics();

    @l
    UniversalImage getImage();

    @l
    Integer getMicroCategoryId();

    @k
    String getSubtitle();

    @k
    String getTitle();
}
