package com.avito.android.trx_promo_impl.ui;

import NF0.e;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bG0.d;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.google.android.material.slider.Slider;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoSlider.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0016¢\u0006\u0004\b$\u0010\u0019J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b&\u0010\u0019J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u0019J!\u0010+\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040)¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/trx_promo_impl/ui/TrxPromoSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/G0;", "setTitleText", "(Ljava/lang/CharSequence;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "setTitleAttributedText", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "subtitle", "setSubtitleText", "setSubtitleAttributedText", "", "isVisible", "setSubtitleBannerVisible", "(Z)V", "setSubtitleBannerText", "Landroid/content/res/ColorStateList;", "color", "setSubtitleBannerBackgroundTint", "(Landroid/content/res/ColorStateList;)V", "", "value", "setValue", "(I)V", "getValue", "()I", "setSliderTint", "", "prefix", "setValuePrefix", "(Ljava/lang/String;)V", "suffix", "setValueSuffix", "minValue", "setMinValue", "maxValue", "setMaxValue", "step", "setStep", "Lkotlin/Function1;", "listener", "setValueChangeListener", "(LY41/l;)V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoSlider extends ConstraintLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f304476j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f304477b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f304478c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f304479d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f304480e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f304481f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Slider f304482g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public String f304483h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public String f304484i;

    @j
    public TrxPromoSlider(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final String g(float f12) {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f304483h;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append((int) f12);
        String str2 = this.f304484i;
        sb2.append(str2 != null ? str2 : "");
        return sb2.toString();
    }

    public final int getValue() {
        return (int) this.f304482g.getValue();
    }

    public final void setMaxValue(int maxValue) {
        this.f304482g.setValueTo(maxValue);
    }

    public final void setMinValue(int minValue) {
        this.f304482g.setValueFrom(minValue);
    }

    public final void setSliderTint(@k ColorStateList color) {
        Slider slider = this.f304482g;
        slider.setTrackActiveTintList(color);
        slider.setThumbTintList(color);
    }

    public final void setStep(int step) {
        Slider slider = this.f304482g;
        try {
            slider.setStepSize(step);
        } catch (IllegalArgumentException unused) {
            slider.setStepSize(1.0f);
        }
    }

    public final void setSubtitleAttributedText(@l AttributedText subtitle) {
        String text = subtitle != null ? subtitle.getText() : null;
        TextView textView = this.f304478c;
        if (text == null || text.length() == 0) {
            textView.setVisibility(4);
        } else {
            com.avito.android.util.text.j.a(textView, subtitle, null);
            textView.setVisibility(0);
        }
    }

    public final void setSubtitleBannerBackgroundTint(@k ColorStateList color) {
        this.f304479d.setBackgroundTintList(color);
    }

    public final void setSubtitleBannerText(@l AttributedText subtitle) {
        com.avito.android.util.text.j.a(this.f304480e, subtitle, null);
    }

    public final void setSubtitleBannerVisible(boolean isVisible) {
        this.f304478c.setVisibility(!isVisible ? 0 : 8);
        this.f304479d.setVisibility(isVisible ? 0 : 8);
    }

    public final void setSubtitleText(@l CharSequence subtitle) {
        I5.a(this.f304478c, subtitle, false);
    }

    public final void setTitleAttributedText(@l AttributedText title) {
        com.avito.android.util.text.j.a(this.f304477b, title, null);
    }

    public final void setTitleText(@l CharSequence title) {
        I5.a(this.f304477b, title, false);
    }

    public final void setValue(int value) {
        float f12 = value;
        Slider slider = this.f304482g;
        if (f12 < slider.getValueFrom()) {
            slider.setValue(slider.getValueFrom());
        } else if (f12 > slider.getValueTo()) {
            slider.setValue(slider.getValueTo());
        } else {
            slider.setValue(f12);
        }
        this.f304481f.setText(g(f12));
    }

    public final void setValueChangeListener(@k Y41.l<? super Integer, G0> listener) {
        this.f304482g.y(new e(1, listener));
    }

    public final void setValuePrefix(@l String prefix) {
        this.f304483h = prefix;
    }

    public final void setValueSuffix(@k String suffix) {
        this.f304484i = suffix;
    }

    public TrxPromoSlider(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.trx_promo_slider, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.trx_promo_slider_title);
        this.f304477b = textView;
        TextView textView2 = (TextView) findViewById(R.id.trx_promo_slider_subtitle);
        this.f304478c = textView2;
        this.f304479d = findViewById(R.id.trx_promo_slider_subtitle_banner);
        this.f304480e = (TextView) findViewById(R.id.trx_promo_slider_subtitle_banner_text);
        this.f304481f = (TextView) findViewById(R.id.trx_promo_slider_value);
        Slider slider = (Slider) findViewById(R.id.trx_promo_slider_input);
        this.f304482g = slider;
        slider.y(new d(this, 1));
        slider.setValueFrom(0.0f);
        slider.setValueTo(1.0f);
        slider.setStepSize(1.0f);
        slider.setThumbElevation(0.0f);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
