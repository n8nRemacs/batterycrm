package com.avito.android.str_seller_orders.strsellerorders.mvi.items.order;

import Y41.l;
import Y61.k;
import bz0.C25738a;
import bz0.InterfaceC25739b;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yz0.InterfaceC50328b;

/* compiled from: OrderItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/order/e;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/order/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC50328b, G0> f290016b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC50328b, G0> lVar) {
        this.f290016b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC25739b interfaceC25739b = (InterfaceC25739b) eVar;
        C25738a c25738a = (C25738a) aVar;
        interfaceC25739b.setTitle(c25738a.f57580c);
        interfaceC25739b.j(c25738a.f57581d);
        interfaceC25739b.Yt(c25738a.f57582e);
        AttributedText attributedText = c25738a.f57584g;
        if (attributedText != null) {
            interfaceC25739b.q(attributedText);
        } else {
            interfaceC25739b.B0(c25738a.f57583f);
        }
        interfaceC25739b.mO(c25738a.f57585h);
        interfaceC25739b.q20(c25738a.f57586i);
        if (c25738a.f57587j != null) {
            interfaceC25739b.a(new d(this, c25738a));
        } else {
            interfaceC25739b.V2();
        }
        interfaceC25739b.BT(new InterfaceC25739b.a(false, "", ""), null);
        interfaceC25739b.gN(new InterfaceC25739b.a(false, "", ""), null);
    }
}
