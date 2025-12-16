package com.avito.android.service_orders.list.blueprints.calendar_button_item;

import Y61.l;
import com.avito.android.service_booking_calendar.link.ServiceBookingCalendarMonthLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrdersListCalendarButtonPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/calendar_button_item/e;", "Lcom/avito/android/service_orders/list/blueprints/calendar_button_item/c;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ju0.e f279283b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.service_orders.list.l f279284c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public g f279285d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279286e;

    @Inject
    public e(@Y61.k Ju0.e eVar) {
        this.f279283b = eVar;
    }

    @Override // com.avito.android.service_orders.list.blueprints.calendar_button_item.c
    public final void K1(@Y61.k com.avito.android.service_orders.list.l lVar) {
        this.f279284c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        com.avito.android.service_orders.list.blueprints.a aVar2 = (com.avito.android.service_orders.list.blueprints.a) aVar;
        this.f279285d = gVar;
        gVar.setTitle(aVar2.f279256c);
        this.f279286e = !(aVar2.f279257d instanceof ServiceBookingCalendarMonthLink);
        gVar.c(new d(this, aVar2));
    }

    @Override // com.avito.android.service_orders.list.blueprints.calendar_button_item.c
    public final void S5() {
        if (this.f279286e) {
            Ju0.e eVar = this.f279283b;
            if (eVar.a()) {
                return;
            }
            g gVar = this.f279285d;
            if (gVar != null) {
                gVar.ta();
            }
            eVar.b();
        }
    }

    @Override // com.avito.android.service_orders.list.blueprints.calendar_button_item.c
    public final void e() {
        this.f279284c = null;
    }
}
