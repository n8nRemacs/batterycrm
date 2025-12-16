package com.avito.android.service_order_widget.item.delegate;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: ServiceOrderWidgetDelegateItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/a;", "Lcom/avito/android/serp/adapter/l1;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a extends l1 {

    /* compiled from: ServiceOrderWidgetDelegateItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/a$a;", "", "<init>", "()V", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_order_widget.item.delegate.a$a, reason: collision with other inner class name */
    public static final class C8293a {
        static {
            new C8293a();
        }
    }

    /* compiled from: ServiceOrderWidgetDelegateItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @l
    /* renamed from: K1 */
    DeepLink getF278894i();

    @l
    DeepLink M0();

    @l
    /* renamed from: getAnalyticParams */
    ServiceOrderWidget.AnalyticsParams getF278895j();

    @l
    /* renamed from: getAnalytics */
    Analytics getF278896k();
}
