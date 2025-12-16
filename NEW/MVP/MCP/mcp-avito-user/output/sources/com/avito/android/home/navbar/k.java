package com.avito.android.home.navbar;

import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: RoundedTiledDrawable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/navbar/k;", "Landroid/graphics/drawable/Drawable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final float[] f162469a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Paint f162470b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RectF f162471c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Path f162472d;

    public k(@InterfaceC42156l int i12, @Y61.k float[] fArr) {
        this.f162469a = fArr;
        Paint paint = new Paint(1);
        paint.setColor(i12);
        this.f162470b = paint;
        this.f162471c = new RectF();
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f162472d = path;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@Y61.k Canvas canvas) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        Path path = this.f162472d;
        path.reset();
        RectF rectF = this.f162471c;
        rectF.set(0.0f, 0.0f, fWidth, fHeight);
        Path.Direction direction = Path.Direction.CW;
        path.addRect(rectF, direction);
        path.addRoundRect(rectF, this.f162469a, direction);
        canvas.clipPath(path);
        canvas.drawRect(0.0f, 0.0f, rectF.width(), rectF.height(), this.f162470b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f162470b.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
        this.f162470b.setColorFilter(colorFilter);
    }
}
