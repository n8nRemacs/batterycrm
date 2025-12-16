package com.avito.android.service_order_widget.item;

import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.service_order_widget.item.delegate.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrderWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_order_widget/item/g;", "Lcom/avito/android/service_order_widget/item/f;", "Lcom/avito/android/service_order_widget/item/delegate/c;", "Lcom/avito/android/service_order_widget/item/j;", "Lcom/avito/android/service_order_widget/item/a;", "Lcom/avito/android/service_order_widget/item/WidgetItemPresenterDelegate;", "Lcom/avito/android/service_order_widget/item/delegate/c$b;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f, com.avito.android.service_order_widget.item.delegate.c<j, a>, c.b<a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.service_order_widget.item.delegate.c<j, a> f278922b;

    @Inject
    public g(@Y61.k com.avito.android.service_order_widget.item.delegate.c<j, a> cVar) {
        this.f278922b = cVar;
        cVar.b4(this);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f278922b.O5((j) eVar, (a) aVar, i12);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.c
    public final void b4(@Y61.l c.b<a> bVar) {
        this.f278922b.b4(bVar);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.c.b
    public final void k(com.avito.android.service_order_widget.item.delegate.a aVar, Y41.l lVar) {
        a aVar2 = (a) aVar;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = aVar2.f278845d;
        if (serviceOrderWidgetAction != null) {
            lVar.invoke(serviceOrderWidgetAction.getTitle());
        }
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2 = aVar2.f278846e;
        if (serviceOrderWidgetAction2 != null) {
            lVar.invoke(serviceOrderWidgetAction2.getTitle());
        }
    }
}
