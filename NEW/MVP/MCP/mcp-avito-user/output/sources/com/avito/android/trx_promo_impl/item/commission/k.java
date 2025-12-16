package com.avito.android.trx_promo_impl.item.commission;

import RF0.n;
import RF0.o;
import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.ui.TrxPromoSlider;
import com.avito.android.util.C35835l0;
import com.google.android.material.slider.Slider;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoCommissionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/commission/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_impl/item/commission/j;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final TrxPromoSlider f304243b;

    public k(@Y61.k View view) {
        super(view);
        this.f304243b = (TrxPromoSlider) view.findViewById(R.id.trx_promo_commission_item);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void A9(@Y61.k String str) {
        this.f304243b.setValueSuffix(str);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void K3(int i12) {
        this.f304243b.setValue(i12);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void Q8(@Y61.k l<? super Integer, G0> lVar) {
        this.f304243b.setValueChangeListener(lVar);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void RW(@Y61.k n nVar) {
        Integer numA;
        Integer numA2;
        int iIntValue = R.attr.warmGray4;
        int iIntValue2 = R.attr.gray92;
        TrxPromoSlider trxPromoSlider = this.f304243b;
        AttributedText attributedText = nVar.f14252b;
        o oVar = nVar.f14253c;
        if (oVar == null) {
            trxPromoSlider.setSliderTint(C35835l0.e(R.attr.gray92, trxPromoSlider.getContext()));
            trxPromoSlider.setSubtitleBannerBackgroundTint(C35835l0.e(R.attr.warmGray4, trxPromoSlider.getContext()));
            trxPromoSlider.setSubtitleAttributedText(attributedText);
            trxPromoSlider.setSubtitleBannerVisible(false);
            return;
        }
        String str = oVar.f14254a;
        if (str != null && (numA2 = com.avito.android.lib.util.e.a(str)) != null) {
            iIntValue2 = numA2.intValue();
        }
        trxPromoSlider.setSliderTint(C35835l0.e(iIntValue2, trxPromoSlider.getContext()));
        String str2 = oVar.f14255b;
        if (str2 != null && (numA = com.avito.android.lib.util.e.a(str2)) != null) {
            iIntValue = numA.intValue();
        }
        trxPromoSlider.setSubtitleBannerBackgroundTint(C35835l0.e(iIntValue, trxPromoSlider.getContext()));
        trxPromoSlider.setSubtitleBannerText(attributedText);
        trxPromoSlider.setSubtitleBannerVisible(true);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void TN(@Y61.l String str) {
        this.f304243b.setValuePrefix(str);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void Y5() {
        TrxPromoSlider trxPromoSlider = this.f304243b;
        Slider slider = trxPromoSlider.f304482g;
        slider.A();
        slider.y(new bG0.d(trxPromoSlider, 0));
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void e(@Y61.k AttributedText attributedText) {
        this.f304243b.setTitleAttributedText(attributedText);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.j
    public final void ii(int i12, int i13, int i14) {
        TrxPromoSlider trxPromoSlider = this.f304243b;
        trxPromoSlider.setStep(i12);
        trxPromoSlider.setMinValue(i13);
        trxPromoSlider.setMaxValue(i14);
    }
}
