package bG0;

import com.avito.android.trx_promo_impl.ui.TrxPromoSlider;
import com.google.android.material.slider.Slider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Slider.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrxPromoSlider f57022b;

    public /* synthetic */ d(TrxPromoSlider trxPromoSlider, int i12) {
        this.f57021a = i12;
        this.f57022b = trxPromoSlider;
    }

    @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
    public final /* bridge */ /* synthetic */ void a(Slider slider, float f12, boolean z12) {
        int i12 = this.f57021a;
        b(f12, z12);
    }

    @Override // com.google.android.material.slider.Slider.a
    public final void b(float f12, boolean z12) {
        switch (this.f57021a) {
            case 0:
                TrxPromoSlider trxPromoSlider = this.f57022b;
                trxPromoSlider.f304481f.setText(trxPromoSlider.g(f12));
                break;
            default:
                TrxPromoSlider trxPromoSlider2 = this.f57022b;
                trxPromoSlider2.f304481f.setText(trxPromoSlider2.g(f12));
                break;
        }
    }
}
