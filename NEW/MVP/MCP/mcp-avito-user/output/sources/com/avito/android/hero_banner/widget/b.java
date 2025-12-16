package com.avito.android.hero_banner.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: DiagonalSplitGradient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/b;", "Landroid/graphics/drawable/Drawable;", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Paint f161893a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Path f161894b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final float[] f161895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f161896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f161897e;

    public b(float f12, float f13, float f14, float f15, float f16, int i12, float f17, float f18) {
        this.f161896d = f17;
        this.f161897e = f18;
        Paint paint = new Paint(1);
        this.f161893a = paint;
        float fB2 = y6.b(2) + f12;
        this.f161894b = new Path();
        this.f161895c = new float[]{fB2, fB2, f12, f12, fB2, fB2, f12, f12};
        paint.setShader(new LinearGradient(f13, f14, f15, f16, new int[]{i12, 694961007}, new float[]{0.49f, 0.51f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@Y61.k Canvas canvas) {
        Path path = this.f161894b;
        path.reset();
        path.addRoundRect(new RectF(0.0f, 0.0f, this.f161896d, this.f161897e), this.f161895c, Path.Direction.CW);
        canvas.drawPath(path, this.f161893a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f161893a.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Y61.l ColorFilter colorFilter) {
        this.f161893a.setColorFilter(colorFilter);
    }
}
