package com.avito.android.lib.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BaselineAlignedImageSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/a;", "Landroid/text/style/ImageSpan;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends ImageSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f181330b;

    public /* synthetic */ a(Drawable drawable, int i12, int i13, C42822w c42822w) {
        this(drawable, (i13 & 2) != 0 ? y6.b(2) : i12);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@Y61.k Canvas canvas, @Y61.k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @Y61.k Paint paint) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        canvas.save();
        canvas.translate(f12, (i16 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent - this.f181330b));
        drawable.draw(canvas);
        canvas.restore();
    }

    public a(@Y61.k Drawable drawable, int i12) {
        super(drawable);
        this.f181330b = i12;
    }
}
