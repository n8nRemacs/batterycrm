package com.avito.android.recent_query_search.item;

import Y61.k;
import Y61.l;
import com.avito.android.recent_query_search.SearchActionImpl;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.InterfaceC34742k0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import is0.h;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: RecentQuerySearchItem.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recent_query_search/item/RecentQuerySearchItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/k0;", "Lqs0/a;", "Lis0/h;", "a", "_avito_bx-content_widget_recent-query-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RecentQuerySearchItem extends PersistableSerpItem, InterfaceC34742k0, InterfaceC47435a, h {

    /* compiled from: RecentQuerySearchItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recent_query_search/item/RecentQuerySearchItem$a;", "", "<init>", "()V", "_avito_bx-content_widget_recent-query-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: RecentQuerySearchItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @l
    Analytics getAnalytics();

    @k
    String getDescription();

    @k
    String getQuery();

    @l
    String getTitle();

    @k
    SearchActionImpl k1();
}
