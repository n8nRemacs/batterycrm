package NF0;

import com.avito.android.trx_promo_goods.screens.configure.ui.TrxPromoGoodsSlider;
import com.google.android.material.slider.Slider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Slider.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrxPromoGoodsSlider f11352b;

    public /* synthetic */ d(TrxPromoGoodsSlider trxPromoGoodsSlider, int i12) {
        this.f11351a = i12;
        this.f11352b = trxPromoGoodsSlider;
    }

    @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
    public final /* bridge */ /* synthetic */ void a(Slider slider, float f12, boolean z12) {
        int i12 = this.f11351a;
        b(f12, z12);
    }

    @Override // com.google.android.material.slider.Slider.a
    public final void b(float f12, boolean z12) {
        switch (this.f11351a) {
            case 0:
                TrxPromoGoodsSlider trxPromoGoodsSlider = this.f11352b;
                trxPromoGoodsSlider.f303621d.setText(trxPromoGoodsSlider.f303623f.format(Float.valueOf(f12)));
                break;
            default:
                TrxPromoGoodsSlider trxPromoGoodsSlider2 = this.f11352b;
                trxPromoGoodsSlider2.f303621d.setText(trxPromoGoodsSlider2.f303623f.format(Float.valueOf(f12)));
                break;
        }
    }
}
