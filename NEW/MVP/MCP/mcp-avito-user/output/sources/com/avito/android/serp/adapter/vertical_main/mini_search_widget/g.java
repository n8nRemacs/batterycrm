package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.vertical_main.MiniSearchWidget;
import com.avito.android.remote.model.vertical_main.MiniSearchWidgetRecentSearchesDto;
import com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MiniSearchWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/g;", "Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/f;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {
    @Inject
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches] */
    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.f
    @Y61.k
    public final MiniSearchWidgetItem a(@Y61.k MiniSearchWidget miniSearchWidget) {
        ArrayList arrayList;
        ParametrizedEvent onShowEvent;
        DeepLink uri;
        MiniSearchWidgetRecentSearchesDto recentSearches = miniSearchWidget.getRecentSearches();
        MiniSearchWidgetRecentSearches.Analytics miniSearchWidgetRecentSearches = null;
        if (recentSearches != null) {
            List<MiniSearchWidgetRecentSearchesDto.ItemDto> items = recentSearches.getItems();
            if (items != null) {
                arrayList = new ArrayList();
                for (MiniSearchWidgetRecentSearchesDto.ItemDto itemDto : items) {
                    String title = itemDto.getTitle();
                    MiniSearchWidgetRecentSearches.Item item = (title == null || (uri = itemDto.getUri()) == null) ? null : new MiniSearchWidgetRecentSearches.Item(title, uri);
                    if (item != null) {
                        arrayList.add(item);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                MiniSearchWidgetRecentSearchesDto.AnalyticsDto analytics = recentSearches.getAnalytics();
                if (analytics != null && (onShowEvent = analytics.getOnShowEvent()) != null) {
                    miniSearchWidgetRecentSearches = new MiniSearchWidgetRecentSearches.Analytics(a0.a(onShowEvent));
                }
                miniSearchWidgetRecentSearches = new MiniSearchWidgetRecentSearches(arrayList, miniSearchWidgetRecentSearches);
            }
        }
        return new MiniSearchWidgetItem("mini_search_widget", miniSearchWidget.getTitle(), miniSearchWidget.getAction(), miniSearchWidget.getImage(), miniSearchWidgetRecentSearches, miniSearchWidget.getAnalytics(), miniSearchWidget.getSettings());
    }
}
