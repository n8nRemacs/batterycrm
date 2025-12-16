package com.avito.android.recent_query_search;

import com.avito.android.J0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.recent_query_search.widget.RecentQuerySearchAction;
import com.avito.android.recent_query_search.widget.RecentQuerySearchWidget;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: RecentQuerySearchConverter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recent_query_search/a;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/recent_query_search/widget/RecentQuerySearchWidget;", "Lcom/avito/android/recent_query_search/item/RecentQuerySearchItem;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.serp.b<RecentQuerySearchWidget, RecentQuerySearchItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f252246a;

    public a(@Y61.k J0 j02) {
        this.f252246a = j02;
    }

    @Override // com.avito.android.serp.b
    @Y61.k
    public final Class<? extends RecentQuerySearchWidget> a() {
        return RecentQuerySearchWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        String description;
        RecentQuerySearchAction action;
        DeepLink link;
        String title;
        RecentQuerySearchWidget recentQuerySearchWidget = (RecentQuerySearchWidget) serpElement;
        String title2 = recentQuerySearchWidget.getTitle();
        String query = recentQuerySearchWidget.getQuery();
        if (query == null || C43066x.K(query) || query.length() == 0 || (description = recentQuerySearchWidget.getDescription()) == null || C43066x.K(description) || description.length() == 0 || (action = recentQuerySearchWidget.getAction()) == null || (link = action.getLink()) == null || (title = action.getTitle()) == null || C43066x.K(title) || title.length() == 0) {
            return null;
        }
        return new RecentQuerySearchItemImpl(com.avito.android.bxcontent.mvi.entity.f.k(this.f252246a, new StringBuilder("recentQuerySearchWidget")), title2, query, description, new SearchActionImpl(link, title), false, false, recentQuerySearchWidget.getAnalytics(), recentQuerySearchWidget.getSettings(), 96, null);
    }
}
