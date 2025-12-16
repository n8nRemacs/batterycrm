package com.avito.android.service_order_widget.item.delegate;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_order_widget.item.delegate.a;
import com.avito.android.service_order_widget.item.delegate.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceOrderWidgetPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/c;", "Lcom/avito/android/service_order_widget/item/delegate/b;", "IV", "Lcom/avito/android/service_order_widget/item/delegate/a;", "I", "LTV0/d;", "a", "b", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c<IV extends com.avito.android.service_order_widget.item.delegate.b<I>, I extends com.avito.android.service_order_widget.item.delegate.a> extends TV0.d<IV, I> {

    /* compiled from: ServiceOrderWidgetPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/c$a;", "", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void k(@k DeepLink deepLink, @k String str);
    }

    /* compiled from: ServiceOrderWidgetPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/c$b;", "Lcom/avito/android/service_order_widget/item/delegate/a;", "I", "", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b<I extends com.avito.android.service_order_widget.item.delegate.a> {
        void k(@k I i12, @k l<? super String, G0> lVar);
    }

    void b4(@Y61.l b<I> bVar);
}
