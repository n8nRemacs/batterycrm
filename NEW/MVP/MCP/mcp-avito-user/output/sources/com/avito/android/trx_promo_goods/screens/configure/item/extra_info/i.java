package com.avito.android.trx_promo_goods.screens.configure.item.extra_info;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoGoodsConfigureExtraInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/extra_info/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/extra_info/h;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f303549b;

    public i(@k View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.trx_promo_goods_configure_extra_info_item);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f303549b = textView;
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.extra_info.h
    public final void g4(@k AttributedText attributedText) {
        j.c(this.f303549b, attributedText, null);
    }
}
