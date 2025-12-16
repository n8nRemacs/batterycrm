package NF0;

import Y41.l;
import com.avito.android.trx_promo_goods.screens.configure.ui.TrxPromoGoodsSlider;
import com.avito.android.trx_promo_impl.ui.TrxPromoSlider;
import com.google.android.material.slider.Slider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Slider.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11354b;

    public /* synthetic */ e(int i12, l lVar) {
        this.f11353a = i12;
        this.f11354b = lVar;
    }

    @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
    public final /* bridge */ /* synthetic */ void a(Slider slider, float f12, boolean z12) {
        int i12 = this.f11353a;
        b(f12, z12);
    }

    @Override // com.google.android.material.slider.Slider.a
    public final void b(float f12, boolean z12) {
        l lVar = this.f11354b;
        switch (this.f11353a) {
            case 0:
                int i12 = TrxPromoGoodsSlider.f303618g;
                lVar.invoke(Float.valueOf(f12));
                break;
            default:
                int i13 = TrxPromoSlider.f304476j;
                lVar.invoke(Integer.valueOf((int) f12));
                break;
        }
    }
}
