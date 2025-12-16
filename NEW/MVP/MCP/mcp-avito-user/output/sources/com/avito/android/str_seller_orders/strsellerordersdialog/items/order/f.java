package com.avito.android.str_seller_orders.strsellerordersdialog.items.order;

import Bz0.InterfaceC13208a;
import Y41.l;
import Y61.k;
import bz0.C25738a;
import bz0.InterfaceC25739b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: OrderDialogItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/items/order/f;", "LTV0/d;", "Lbz0/b;", "Lbz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<InterfaceC25739b, C25738a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13208a, G0> f290139b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13208a, G0> lVar) {
        this.f290139b = lVar;
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
            interfaceC25739b.a(new c(this, c25738a));
        } else {
            interfaceC25739b.V2();
        }
        List<Button> list = c25738a.f57588k;
        Button button = (Button) C42745f0.G(list);
        boolean z12 = button != null;
        String title = button != null ? button.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String preset = button != null ? button.getPreset() : null;
        if (preset == null) {
            preset = "";
        }
        interfaceC25739b.BT(new InterfaceC25739b.a(z12, title, preset), new d(button, this, c25738a));
        Button button2 = (Button) C42745f0.K(1, list);
        boolean z13 = button2 != null;
        String title2 = button2 != null ? button2.getTitle() : null;
        if (title2 == null) {
            title2 = "";
        }
        String preset2 = button2 != null ? button2.getPreset() : null;
        interfaceC25739b.gN(new InterfaceC25739b.a(z13, title2, preset2 != null ? preset2 : ""), new e(button2, this, c25738a));
    }
}
