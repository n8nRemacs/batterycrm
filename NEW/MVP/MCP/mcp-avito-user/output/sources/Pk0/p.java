package PK0;

import PK0.d;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextStyleDataSpan.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"LPK0/p;", "Landroid/text/style/MetricAffectingSpan;", "LPK0/l;", "LPK0/k;", "Landroid/text/style/LineHeightSpan;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p extends MetricAffectingSpan implements l, k, LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f13000b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final d.a f13001c;

    public p(@Y61.k n nVar) {
        this.f13000b = nVar;
        Integer num = nVar.f12991e;
        this.f13001c = num != null ? new d.a(num.intValue()) : null;
    }

    @Override // PK0.k
    @Y61.l
    /* renamed from: a */
    public final Typeface getF398687f() {
        return this.f13000b.f12995i;
    }

    @Override // PK0.l
    @Y61.l
    /* renamed from: b */
    public final Integer getF12192g() {
        return this.f13000b.f12992f;
    }

    @Override // PK0.k
    @Y61.l
    /* renamed from: c */
    public final ColorStateList getF398684c() {
        C35763c0 c35763c0 = this.f13000b.f12994h;
        if (c35763c0 != null) {
            return c35763c0.b();
        }
        return null;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@Y61.l CharSequence charSequence, int i12, int i13, int i14, int i15, @Y61.l Paint.FontMetricsInt fontMetricsInt) {
        d.a aVar = this.f13001c;
        if (aVar != null) {
            aVar.chooseHeight(charSequence, i12, i13, i14, i15, fontMetricsInt);
        }
    }

    @Override // PK0.l
    @Y61.l
    /* renamed from: d */
    public final Integer getF12191f() {
        return this.f13000b.f12991e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        ColorStateList colorStateListB;
        updateMeasureState(textPaint);
        C35763c0 c35763c0 = this.f13000b.f12988b;
        if (c35763c0 == null || (colorStateListB = c35763c0.b()) == null) {
            return;
        }
        textPaint.setColor(colorStateListB.getColorForState(textPaint.drawableState, 0));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@Y61.k TextPaint textPaint) {
        n nVar = this.f13000b;
        Typeface typeface = nVar.f12989c;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Float f12 = nVar.f12987a;
        if (f12 != null) {
            textPaint.setTextSize(f12.floatValue());
        }
    }
}
