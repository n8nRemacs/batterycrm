package com.avito.android.serp.adapter.vertical_main.category_vertical_filter;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.vertical_main.FilterFormWidget;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item.CategoryVerticalFilterItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryVerticalFilterItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/f;", "Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/e;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.category_vertical_filter.e
    @l
    public final CategoryVerticalFilterItem a(@k FilterFormWidget filterFormWidget, @l VerticalPromoBlockItem verticalPromoBlockItem) {
        SearchFormWidgetAction action = filterFormWidget.getAction();
        if (filterFormWidget.getFilters().isEmpty() || action == null || verticalPromoBlockItem == null || !(verticalPromoBlockItem instanceof VerticalPromoBlockItem.VerticalFilterItem)) {
            return null;
        }
        return new CategoryVerticalFilterItem("category_vertical_filter", filterFormWidget.getTitle(), filterFormWidget.getFilters(), action, filterFormWidget.getAnalytics(), (VerticalPromoBlockItem.VerticalFilterItem) verticalPromoBlockItem, filterFormWidget.getSettings());
    }
}
