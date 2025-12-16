package com.avito.android.services_transportation_widget.item;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: ServiceTransportationWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/l;", "", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l {
    void d1(@Y61.k DeepLink deepLink);

    void f1(@Y61.k ServiceTransportationWidget.Field<?> field);

    void i1(@Y61.k ServiceTransportationWidget.SwitchGroupField switchGroupField, @Y61.k ServiceTransportationWidget.SwitchGroupField.SwitchValue switchValue, boolean z12);
}
