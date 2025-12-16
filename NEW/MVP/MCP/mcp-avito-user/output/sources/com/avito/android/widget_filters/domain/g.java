package com.avito.android.widget_filters.domain;

import com.avito.android.widget_filters.mvi.entity.LoadingType;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WidgetFiltersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/g;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g {
    @Y61.k
    C0 a(@Y61.k Map map, @Y61.k LoadingType loadingType);

    @Y61.k
    InterfaceC43160i<WidgetFiltersInternalAction> b(@Y61.k Map<String, String> map);
}
