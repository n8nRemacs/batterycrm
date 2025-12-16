package com.avito.android.str_seller_orders.orders_buyer.items.button_pagination;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonPaginationView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/button_pagination/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_buyer/items/button_pagination/g;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f289012d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f289013b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Button f289014c;

    public h(@k View view) {
        super(view);
        this.f289013b = view.getContext();
        this.f289014c = view instanceof Button ? (Button) view : null;
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.button_pagination.g
    public final void Y2(@k PrintableText printableText) {
        Button button = this.f289014c;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, printableText.k0(this.f289013b), false);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.button_pagination.g
    public final void j6(@k Y41.a<G0> aVar) {
        Button button = this.f289014c;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(13, aVar));
        }
    }
}
