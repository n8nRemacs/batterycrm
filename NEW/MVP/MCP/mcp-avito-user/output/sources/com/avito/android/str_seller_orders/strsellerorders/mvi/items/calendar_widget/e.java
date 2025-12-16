package com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import yz0.InterfaceC50328b;

/* compiled from: CalendarWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/calendar_widget/e;", "LTV0/d;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/calendar_widget/g;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/calendar_widget/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC50328b, G0> f289953b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC50328b, G0> lVar) {
        this.f289953b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.D(aVar2.f289944b);
        gVar.k(aVar2.f289945c);
        gVar.a(new d(this, aVar2));
    }
}
