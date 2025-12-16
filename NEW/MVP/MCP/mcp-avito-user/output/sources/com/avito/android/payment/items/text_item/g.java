package com.avito.android.payment.items.text_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/items/text_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/payment/items/text_item/h;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f214514b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text_include);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f214514b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.payment.items.text_item.h
    public final void g0(@k CharSequence charSequence) {
        this.f214514b.setText(charSequence);
    }
}
