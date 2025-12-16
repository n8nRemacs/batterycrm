package ii;

import PK0.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTextAppearanceSpan.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lii/d;", "Landroid/text/style/MetricAffectingSpan;", "LPK0/k;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41408d extends MetricAffectingSpan implements k {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Typeface f398683b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ColorStateList f398684c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ColorStateList f398685d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f398686e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Typeface f398687f;

    public C41408d() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // PK0.k
    @l
    /* renamed from: a, reason: from getter */
    public final Typeface getF398687f() {
        return this.f398687f;
    }

    @Override // PK0.k
    @l
    /* renamed from: c, reason: from getter */
    public final ColorStateList getF398684c() {
        return this.f398684c;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        updateMeasureState(textPaint);
        ColorStateList colorStateList = this.f398684c;
        if (colorStateList != null) {
            textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
        }
        ColorStateList colorStateList2 = this.f398685d;
        if (colorStateList2 != null) {
            textPaint.linkColor = colorStateList2.getColorForState(textPaint.drawableState, 0);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@Y61.k TextPaint textPaint) {
        Typeface typeface = this.f398683b;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Float f12 = this.f398686e;
        if (f12 != null) {
            textPaint.setTextSize(f12.floatValue());
        }
    }

    public /* synthetic */ C41408d(Typeface typeface, ColorStateList colorStateList, ColorStateList colorStateList2, Float f12, Typeface typeface2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : typeface, (i12 & 2) != 0 ? null : colorStateList, (i12 & 4) != 0 ? null : colorStateList2, (i12 & 8) != 0 ? null : f12, (i12 & 16) != 0 ? null : typeface2);
    }

    public C41408d(@l Typeface typeface, @l ColorStateList colorStateList, @l ColorStateList colorStateList2, @U @l Float f12, @l Typeface typeface2) {
        this.f398683b = typeface;
        this.f398684c = colorStateList;
        this.f398685d = colorStateList2;
        this.f398686e = f12;
        this.f398687f = typeface2;
    }
}
