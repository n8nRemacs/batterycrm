package com.avito.android.checkout.ui.items.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CheckoutHeaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/ui/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/checkout/ui/items/header/g;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f118404b;

    public h(@k View view) {
        super(view);
        this.f118404b = (TextView) view.findViewById(R.id.checkout_header_title);
    }

    @Override // com.avito.android.checkout.ui.items.header.g
    public final void setTitle(@k String str) {
        this.f118404b.setText(str);
    }
}
