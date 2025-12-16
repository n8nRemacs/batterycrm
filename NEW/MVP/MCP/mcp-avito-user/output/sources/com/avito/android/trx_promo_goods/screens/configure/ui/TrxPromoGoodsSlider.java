package com.avito.android.trx_promo_goods.screens.configure.ui;

import NF0.d;
import NF0.e;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.google.android.material.slider.Slider;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TrxPromoGoodsSlider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\bJ!\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/ui/TrxPromoGoodsSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "getValue", "()F", "value", "Lkotlin/G0;", "setValue", "(F)V", "", "suffix", "setValueSuffix", "(Ljava/lang/String;)V", "minValue", "setMinValue", "maxValue", "setMaxValue", "step", "setStep", "Lkotlin/Function1;", "listener", "setValueChangeListener", "(LY41/l;)V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoGoodsSlider extends ConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f303618g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f303619b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f303620c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f303621d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Slider f303622e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DecimalFormat f303623f;

    @j
    public TrxPromoGoodsSlider(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final float getValue() {
        return this.f303622e.getValue();
    }

    public final void setMaxValue(float maxValue) {
        this.f303622e.setValueTo(maxValue);
    }

    public final void setMinValue(float minValue) {
        this.f303622e.setValueFrom(minValue);
    }

    public final void setStep(float step) {
        Slider slider = this.f303622e;
        try {
            slider.setStepSize(step);
        } catch (IllegalArgumentException unused) {
            slider.setStepSize(1.0f);
        }
    }

    public final void setValue(float value) {
        Slider slider = this.f303622e;
        if (value < slider.getValueFrom()) {
            slider.setValue(slider.getValueFrom());
        } else if (value > slider.getValueTo()) {
            slider.setValue(slider.getValueTo());
        } else {
            slider.setValue(value);
        }
        this.f303621d.setText(this.f303623f.format(Float.valueOf(value)));
    }

    public final void setValueChangeListener(@k Y41.l<? super Float, G0> listener) {
        this.f303622e.y(new e(0, listener));
    }

    public final void setValueSuffix(@k String suffix) {
        this.f303623f.setPositiveSuffix(suffix);
    }

    public TrxPromoGoodsSlider(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(new Locale("ru", "RU")));
        this.f303623f = decimalFormat;
        LayoutInflater.from(context).inflate(R.layout.trx_promo_goods_slider, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.trx_promo_goods_slider_title);
        this.f303619b = textView;
        TextView textView2 = (TextView) findViewById(R.id.trx_promo_goods_slider_subtitle);
        this.f303620c = textView2;
        this.f303621d = (TextView) findViewById(R.id.trx_promo_goods_slider_value);
        Slider slider = (Slider) findViewById(R.id.trx_promo_goods_slider_input);
        this.f303622e = slider;
        slider.y(new d(this, 1));
        slider.setValueFrom(0.0f);
        slider.setValueTo(1.0f);
        slider.setStepSize(1.0f);
        slider.setThumbElevation(0.0f);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
