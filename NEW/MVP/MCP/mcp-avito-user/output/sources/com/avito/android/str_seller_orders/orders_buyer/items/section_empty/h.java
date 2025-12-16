package com.avito.android.str_seller_orders.orders_buyer.items.section_empty;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionEmptyView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/section_empty/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_buyer/items/section_empty/g;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f289063d = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TextView f289064b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Button f289065c;

    public h(@k View view) {
        super(view);
        this.f289064b = (TextView) view.findViewById(R.id.description);
        this.f289065c = (Button) view.findViewById(R.id.button);
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.section_empty.g
    public final void V0(@l String str) {
        Button button = this.f289065c;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.section_empty.g
    public final void lS(@k Y41.a<G0> aVar) {
        Button button = this.f289065c;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(15, aVar));
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.section_empty.g
    public final void n(@l String str) {
        TextView textView = this.f289064b;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }
}
