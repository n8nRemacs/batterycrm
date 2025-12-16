package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* compiled from: ProgressBarDrawable.java */
/* loaded from: classes10.dex */
public class m extends Drawable implements d {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f340079b = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    public final Path f340080c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f340081d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    public final int f340082e = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: f, reason: collision with root package name */
    public final int f340083f = -2147450625;

    /* renamed from: g, reason: collision with root package name */
    public final int f340084g = 10;

    /* renamed from: h, reason: collision with root package name */
    public final int f340085h = 20;

    /* renamed from: i, reason: collision with root package name */
    public int f340086i = 0;

    public final void a(Canvas canvas, int i12, int i13) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int i14 = this.f340084g;
        int i15 = ((iWidth - (i14 * 2)) * i12) / 10000;
        int i16 = bounds.left + i14;
        int i17 = (bounds.bottom - i14) - this.f340085h;
        RectF rectF = this.f340081d;
        rectF.set(i16, i17, i16 + i15, i17 + r2);
        Paint paint = this.f340079b;
        paint.setColor(i13);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Path path = this.f340080c;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i18 = this.f340085h / 2;
        path.addRoundRect(rectF, Math.min(0, i18), Math.min(0, i18), Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, 10000, this.f340082e);
        a(canvas, this.f340086i, this.f340083f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int color = this.f340079b.getColor() >>> 24;
        if (color == 255) {
            return -1;
        }
        return color == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i12 = this.f340084g;
        rect.set(i12, i12, i12, i12);
        return i12 != 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        this.f340086i = i12;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f340079b.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f340079b.setColorFilter(colorFilter);
    }
}
