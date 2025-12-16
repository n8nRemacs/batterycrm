package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider;

import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.y0;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentSliderHighlightTextSpan.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/n;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends CharacterStyle implements UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f78999d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f79000e = new a(Float.TYPE, "HIGHLIGHT_TEXT_SPAN_FLOAT_PROPERTY");

    /* renamed from: b, reason: collision with root package name */
    public float f79001b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final int[] f79002c;

    /* compiled from: PaymentSliderHighlightTextSpan.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/n$a", "Landroid/util/Property;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/n;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Property<n, Float> {
        public a() {
            throw null;
        }

        @Override // android.util.Property
        public final Float get(n nVar) {
            return Float.valueOf(nVar.f79001b);
        }

        @Override // android.util.Property
        public final void set(n nVar, Float f12) {
            nVar.f79001b = f12.floatValue();
        }
    }

    /* compiled from: PaymentSliderHighlightTextSpan.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/n$b;", "", "<init>", "()V", "Landroid/util/Property;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/n;", "", "spanFloatProperty", "Landroid/util/Property;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ObjectAnimator a(@Y61.k TextView textView) {
            CharSequence text = textView.getText();
            n nVar = new n(textView.getContext());
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(nVar, 0, text.length(), 0);
            float fMeasureText = textView.getPaint().measureText(text.toString());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nVar, n.f79000e, -fMeasureText, fMeasureText);
            objectAnimatorOfFloat.setEvaluator(new FloatEvaluator());
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setDuration(2000L);
            objectAnimatorOfFloat.addUpdateListener(new y0(1, textView, spannableString));
            return objectAnimatorOfFloat;
        }

        public b() {
        }
    }

    public n(@Y61.k Context context) {
        int color = androidx.core.content.d.getColor(context, R.color.safedeal_payment_slider_gradient_side);
        int color2 = androidx.core.content.d.getColor(context, R.color.safedeal_payment_slider_gradient_center);
        this.f79002c = new int[]{color, color2, color2, color};
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.l TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setStyle(Paint.Style.FILL);
        float textSize = textPaint.getTextSize() * this.f79002c.length;
        Shader shader = textPaint.getShader();
        if (textPaint.getShader() == null) {
            shader = new LinearGradient(0.0f, 0.0f, textSize, 0.0f, this.f79002c, (float[]) null, Shader.TileMode.CLAMP);
        }
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        matrix.reset();
        matrix.postTranslate(this.f79001b, 0.0f);
        shader.setLocalMatrix(matrix);
        textPaint.setShader(shader);
    }
}
