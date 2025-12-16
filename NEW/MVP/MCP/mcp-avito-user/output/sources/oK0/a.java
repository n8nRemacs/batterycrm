package OK0;

import PK0.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.avito.android.util.F5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: AvitoTextAppearanceSpan.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LOK0/a;", "Landroid/text/style/MetricAffectingSpan;", "LPK0/l;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends MetricAffectingSpan implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Typeface f12187b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f12188c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f12189d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Float f12190e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f12191f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f12192g;

    public a() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // PK0.l
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Integer getF12192g() {
        return this.f12192g;
    }

    @Override // PK0.l
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getF12191f() {
        return this.f12191f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        updateMeasureState(textPaint);
        ColorStateList colorStateList = this.f12188c;
        if (colorStateList != null) {
            textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
        }
        ColorStateList colorStateList2 = this.f12189d;
        if (colorStateList2 != null) {
            textPaint.linkColor = colorStateList2.getColorForState(textPaint.drawableState, 0);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@k TextPaint textPaint) {
        Typeface typeface = this.f12187b;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Float f12 = this.f12190e;
        if (f12 != null) {
            textPaint.setTextSize(f12.floatValue());
        }
    }

    public /* synthetic */ a(Typeface typeface, ColorStateList colorStateList, ColorStateList colorStateList2, Float f12, Integer num, Integer num2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : typeface, (i12 & 2) != 0 ? null : colorStateList, (i12 & 4) != 0 ? null : colorStateList2, (i12 & 8) != 0 ? null : f12, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2);
    }

    public a(@Y61.l Typeface typeface, @Y61.l ColorStateList colorStateList, @Y61.l ColorStateList colorStateList2, @Y61.l Float f12, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f12187b = typeface;
        this.f12188c = colorStateList;
        this.f12189d = colorStateList2;
        this.f12190e = f12;
        this.f12191f = num;
        this.f12192g = num2;
    }

    public a(@k Context context, int i12) {
        this(null, null, null, null, null, null, 63, null);
        F5 f5F = C48065c.f(i12, context);
        this.f12187b = f5F.f318604a;
        this.f12188c = f5F.f318605b;
        this.f12189d = f5F.f318606c;
        this.f12190e = f5F.f318607d;
        this.f12191f = f5F.f318608e;
        this.f12192g = f5F.f318609f;
    }
}
