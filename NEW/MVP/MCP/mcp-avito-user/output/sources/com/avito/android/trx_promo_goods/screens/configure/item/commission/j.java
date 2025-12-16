package com.avito.android.trx_promo_goods.screens.configure.item.commission;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_goods.screens.configure.ui.TrxPromoGoodsSlider;
import com.google.android.material.slider.Slider;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsConfigureCommissionView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/commission/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/commission/i;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f303502b;

    /* renamed from: c, reason: collision with root package name */
    public final TrxPromoGoodsSlider f303503c;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f303502b = aVar;
        this.f303503c = (TrxPromoGoodsSlider) view.findViewById(R.id.trx_promo_goods_configure_commission_item);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void A9(@k String str) {
        this.f303503c.setValueSuffix(str);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void Q8(@k l<? super Float, G0> lVar) {
        this.f303503c.setValueChangeListener(lVar);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void R6(float f12) {
        this.f303503c.setValue(f12);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void RE(@Y61.l KF0.a aVar) {
        com.avito.android.util.text.j.a(this.f303503c.f303620c, aVar != null ? aVar.f9378b : null, this.f303502b);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void WP(float f12, float f13, float f14) {
        TrxPromoGoodsSlider trxPromoGoodsSlider = this.f303503c;
        trxPromoGoodsSlider.setStep(f12);
        trxPromoGoodsSlider.setMinValue(f13);
        trxPromoGoodsSlider.setMaxValue(f14);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void Y5() {
        TrxPromoGoodsSlider trxPromoGoodsSlider = this.f303503c;
        Slider slider = trxPromoGoodsSlider.f303622e;
        slider.A();
        slider.y(new NF0.d(trxPromoGoodsSlider, 0));
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.commission.i
    public final void e(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f303503c.f303619b, attributedText, this.f303502b);
    }
}
