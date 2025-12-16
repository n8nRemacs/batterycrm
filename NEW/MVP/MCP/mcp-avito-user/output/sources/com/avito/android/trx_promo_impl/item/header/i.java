package com.avito.android.trx_promo_impl.item.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: TrxPromoHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_impl/item/header/h;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f304311b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f304312c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f304313d;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f304311b = aVar;
        this.f304312c = (TextView) view.findViewById(R.id.trx_promo_header_title);
        this.f304313d = (TextView) view.findViewById(R.id.trx_promo_header_description);
    }

    @Override // com.avito.android.trx_promo_impl.item.header.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f304313d, attributedText, this.f304311b);
    }

    @Override // com.avito.android.trx_promo_impl.item.header.h
    public final void setTitle(@k String str) {
        this.f304312c.setText(str);
    }
}
