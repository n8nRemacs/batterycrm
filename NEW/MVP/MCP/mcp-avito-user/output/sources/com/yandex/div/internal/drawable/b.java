package com.yandex.div.internal.drawable;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LinearGradientDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/drawable/b;", "Landroid/graphics/drawable/Drawable;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends Drawable {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f370102e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f370103a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f370104b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f370105c = new Paint();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f370106d = new RectF();

    /* compiled from: LinearGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/drawable/b$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static LinearGradient a(float f12, @k int[] iArr, int i12, int i13) {
            float f13 = i12 / 2;
            double d12 = (float) ((f12 * 3.141592653589793d) / 180.0f);
            float fCos = ((float) Math.cos(d12)) * f13;
            float f14 = i13 / 2;
            float fSin = ((float) Math.sin(d12)) * f14;
            return new LinearGradient(f13 - fCos, f14 + fSin, f13 + fCos, f14 - fSin, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }

        public a() {
        }
    }

    public b(float f12, @k int[] iArr) {
        this.f370103a = f12;
        this.f370104b = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        canvas.drawRect(this.f370106d, this.f370105c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f370105c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        super.onBoundsChange(rect);
        Paint paint = this.f370105c;
        int iWidth = rect.width();
        int iHeight = rect.height();
        f370102e.getClass();
        paint.setShader(a.a(this.f370103a, this.f370104b, iWidth, iHeight));
        this.f370106d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f370105c.setAlpha(i12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
