package com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order;

import Y61.k;
import bz0.C25738a;
import bz0.InterfaceC25739b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: OrderItemRangePresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/ui/items/order/e;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/ui/items/order/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f290356b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f290357c;

    @Inject
    public e() {
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f290356b = e2VarB;
        this.f290357c = e2VarB;
    }

    @Override // com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.c
    @k
    /* renamed from: F, reason: from getter */
    public final e2 getF290357c() {
        return this.f290357c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC25739b interfaceC25739b = (InterfaceC25739b) eVar;
        C25738a c25738a = (C25738a) aVar;
        interfaceC25739b.setTitle(c25738a.f57580c);
        interfaceC25739b.j(c25738a.f57581d);
        interfaceC25739b.Yt(c25738a.f57582e);
        interfaceC25739b.B0(c25738a.f57583f);
        interfaceC25739b.mO(c25738a.f57585h);
        interfaceC25739b.q20(c25738a.f57586i);
        if (c25738a.f57587j != null) {
            interfaceC25739b.a(new d(this, c25738a));
        } else {
            interfaceC25739b.V2();
        }
    }
}
