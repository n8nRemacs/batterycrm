package com.avito.android.feed_shortcuts.widget;

import androidx.compose.foundation.H;
import com.avito.android.J0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.feed_shortcuts.element.FeedShortcut;
import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItemImpl;
import com.avito.android.feed_shortcuts.element.ShortcutAction;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FeedShortcutsWidgetConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/b;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidget;", "Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidgetItem;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.serp.b<FeedShortcutsWidget, FeedShortcutsWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f157705a;

    public b(@Y61.k J0 j02) {
        this.f157705a = j02;
    }

    @Override // com.avito.android.serp.b
    @Y61.k
    public final Class<FeedShortcutsWidget> a() {
        return FeedShortcutsWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        J0 j02;
        String subtitle;
        ShortcutAction action;
        DeepLink link;
        FeedShortcutsWidget feedShortcutsWidget = serpElement instanceof FeedShortcutsWidget ? (FeedShortcutsWidget) serpElement : null;
        if (feedShortcutsWidget != null) {
            ArrayList arrayList = new ArrayList();
            List<FeedShortcut> listC = feedShortcutsWidget.c();
            if (listC != null) {
                Iterator<T> it = listC.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    j02 = this.f157705a;
                    if (!zHasNext) {
                        break;
                    }
                    FeedShortcut feedShortcut = (FeedShortcut) it.next();
                    Analytics analytics = feedShortcutsWidget.getAnalytics();
                    String title = feedShortcut.getTitle();
                    arrayList.add((title == null || (subtitle = feedShortcut.getSubtitle()) == null || (action = feedShortcut.getAction()) == null || (link = action.getLink()) == null) ? null : new FeedShortcutsWidgetElementItemImpl(com.avito.android.bxcontent.mvi.entity.f.k(j02, H.r(title)), link, title, subtitle, feedShortcut.getMicroCategoryId(), feedShortcut.getImage(), analytics, i12));
                }
                ArrayList arrayListC = C42745f0.C(arrayList);
                if (arrayListC.isEmpty()) {
                    return null;
                }
                return new FeedShortcutsWidgetItemImpl(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("feedShortcutsWidget")), arrayListC, feedShortcutsWidget.getAnalytics(), feedShortcutsWidget.getF157695e());
            }
        }
        return null;
    }
}
