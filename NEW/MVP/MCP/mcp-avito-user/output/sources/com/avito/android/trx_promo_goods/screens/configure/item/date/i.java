package com.avito.android.trx_promo_goods.screens.configure.item.date;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsConfigureDateView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/date/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/date/h;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f303515d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f303516b;

    /* renamed from: c, reason: collision with root package name */
    public final BaseSelect f303517c;

    public i(@k View view) {
        super(view);
        this.f303516b = (TextView) view.findViewById(R.id.trx_promo_goods_configure_date_title);
        this.f303517c = (BaseSelect) view.findViewById(R.id.trx_promo_goods_configure_date_select);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.date.h
    public final void C9(@k String str) {
        Input.t(this.f303517c, str, false, 6);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.date.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f303517c.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(2, aVar));
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.date.h
    public final void setTitle(@k String str) {
        this.f303516b.setText(str);
    }
}
