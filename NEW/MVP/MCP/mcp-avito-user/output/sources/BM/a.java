package BM;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: RoundedColorDrawable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBM/a;", "Landroid/graphics/drawable/Drawable;", "_avito_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f1355a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1356b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f1357c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    @k
    public RectF f1358d = new RectF();

    public a(@InterfaceC42156l int i12, float f12) {
        this.f1355a = i12;
        this.f1356b = f12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        Paint paint = this.f1357c;
        paint.setColor(this.f1355a);
        RectF rectF = this.f1358d;
        float f12 = this.f1356b;
        canvas.drawRoundRect(rectF, f12, f12, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i12 = this.f1355a >>> 24;
        if (i12 != 0) {
            return i12 != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        super.onBoundsChange(rect);
        this.f1358d = new RectF(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f1357c.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
        this.f1357c.setColorFilter(colorFilter);
    }
}
