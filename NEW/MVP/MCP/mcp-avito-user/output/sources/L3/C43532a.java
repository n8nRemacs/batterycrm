package l3;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoTypefaceSpan.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll3/a;", "Landroid/text/style/MetricAffectingSpan;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C43532a extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Typeface f413415b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f413416c;

    public C43532a(@Y61.k Typeface typeface, @Y61.l ColorStateList colorStateList) {
        this.f413415b = typeface;
        this.f413416c = colorStateList;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setTypeface(this.f413415b);
        ColorStateList colorStateList = this.f413416c;
        if (colorStateList != null) {
            textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@Y61.k TextPaint textPaint) {
        textPaint.setTypeface(this.f413415b);
        ColorStateList colorStateList = this.f413416c;
        if (colorStateList != null) {
            textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
        }
    }
}
