package com.avito.android.str_seller_orders.strsellerorders.mvi.items.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: HeaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/header/f;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f289971b;

    public g(@k View view) {
        super(view);
        this.f289971b = (TextView) view.findViewById(R.id.header_tv);
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.header.f
    public final void D(@k PrintableText printableText) {
        com.avito.android.printable_text.a.c(this.f289971b, printableText);
    }
}
