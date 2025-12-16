package com.avito.android.str_seller_orders_calendar.monthselector.items.month;

import Mz0.InterfaceC14549a;
import Y41.l;
import Y61.k;
import android.widget.ImageView;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MonthItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/items/month/e;", "LTV0/d;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/items/month/g;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/items/month/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14549a, G0> f290427b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC14549a, G0> lVar) {
        this.f290427b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.f290430b.setText(aVar2.f290417c);
        gVar.itemView.setTag(aVar2.f290419e);
        boolean z12 = aVar2.f290418d;
        ImageView imageView = gVar.f290431c;
        if (z12) {
            D6.H(imageView);
        } else {
            D6.w(imageView);
        }
        gVar.itemView.setOnClickListener(new h(19, new d(this, aVar2)));
    }
}
