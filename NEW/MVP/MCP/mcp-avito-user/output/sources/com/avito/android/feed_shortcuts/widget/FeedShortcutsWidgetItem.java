package com.avito.android.feed_shortcuts.widget;

import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FeedShortcutsWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_bx-content_widget_feed-shortcuts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FeedShortcutsWidgetItem extends PersistableSerpItem {

    /* compiled from: FeedShortcutsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    List<FeedShortcutsWidgetElementItem> getItems();
}
