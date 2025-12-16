package com.avito.android.category.widget;

import com.avito.android.category.element.CategoryWidgetElementItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.PersistableSerpItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CategoryWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/widget/CategoryWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CategoryWidgetItem extends PersistableSerpItem {

    /* compiled from: CategoryWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    DeepLink M5();

    @Y61.l
    Map<String, String> b0();

    @Y61.l
    Analytics getAnalytics();

    @Y61.k
    List<CategoryWidgetElementItem> getItems();

    @Y61.l
    String getTitle();
}
