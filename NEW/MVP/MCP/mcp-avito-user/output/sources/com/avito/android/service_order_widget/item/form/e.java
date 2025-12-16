package com.avito.android.service_order_widget.item.form;

import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.service_order_widget.item.delegate.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrderFormWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_order_widget/item/form/e;", "Lcom/avito/android/service_order_widget/item/form/d;", "Lcom/avito/android/service_order_widget/item/delegate/c;", "Lcom/avito/android/service_order_widget/item/form/h;", "Lcom/avito/android/service_order_widget/item/form/c;", "Lcom/avito/android/service_order_widget/item/form/FormWidgetPresenterDelegate;", "Lcom/avito/android/service_order_widget/item/delegate/c$b;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d, com.avito.android.service_order_widget.item.delegate.c<h, c>, c.b<c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.service_order_widget.item.delegate.c<h, c> f278903b;

    @Inject
    public e(@Y61.k com.avito.android.service_order_widget.item.delegate.c<h, c> cVar) {
        this.f278903b = cVar;
        cVar.b4(this);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f278903b.O5((h) eVar, (c) aVar, i12);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.c
    public final void b4(@Y61.l c.b<c> bVar) {
        this.f278903b.b4(bVar);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.c.b
    public final void k(com.avito.android.service_order_widget.item.delegate.a aVar, Y41.l lVar) {
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = ((c) aVar).f278892g;
        if (serviceOrderWidgetAction != null) {
            lVar.invoke(serviceOrderWidgetAction.getTitle());
        }
    }
}
