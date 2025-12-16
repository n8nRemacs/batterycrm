package com.avito.android.serp.adapter.vertical_main;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.vertical_main.FilterFormWidget;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.remote.model.vertical_main.PublishFormWidget;
import com.avito.android.remote.model.vertical_main.SearchFormWidget;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/j;", "Lcom/avito/android/serp/adapter/vertical_main/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f272971a;

    @Inject
    public j(@Y61.k c cVar) {
        this.f272971a = cVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.i
    @Y61.l
    public final VerticalPromoBlockItem a(@Y61.k FilterFormWidget filterFormWidget, @Y61.l String str) {
        SearchFormWidgetAction action = filterFormWidget.getAction();
        if (!filterFormWidget.getFilters().isEmpty() && action != null) {
            boolean z12 = filterFormWidget instanceof SearchFormWidget;
            c cVar = this.f272971a;
            if (z12) {
                SearchFormWidget searchFormWidget = (SearchFormWidget) filterFormWidget;
                return new VerticalPromoBlockItem.VerticalFilterItem("vertical_filter_search", filterFormWidget.getTitle(), filterFormWidget.getFilters(), action, filterFormWidget.getSubmitParams(), searchFormWidget.getAnalyticParams(), searchFormWidget.getSelectedFiltersCount(), filterFormWidget.getStyleBlock(), searchFormWidget.getBottomContent(), cVar.b(filterFormWidget.getStyleBlock()), filterFormWidget.getAnalytics(), filterFormWidget.getSettings(), str != null ? Collections.singletonMap("mcid", str) : null);
            }
            if (filterFormWidget instanceof PublishFormWidget) {
                String title = filterFormWidget.getTitle();
                List<Filter> filters = filterFormWidget.getFilters();
                String title2 = action.getTitle();
                List<SearchFormWidgetSubmitParam> submitParams = filterFormWidget.getSubmitParams();
                PublishFormWidget publishFormWidget = (PublishFormWidget) filterFormWidget;
                PromoStyle style = publishFormWidget.getStyle();
                return new VerticalPromoBlockItem.VerticalPublishItem("vertical_filter_publish", title, filters, title2, submitParams, style != null ? cVar.a(style) : R.attr.bannerBlue, publishFormWidget.getActiveFieldId(), publishFormWidget.getCategoryId(), filterFormWidget.getAnalytics(), filterFormWidget.getSettings());
            }
        }
        return null;
    }
}
