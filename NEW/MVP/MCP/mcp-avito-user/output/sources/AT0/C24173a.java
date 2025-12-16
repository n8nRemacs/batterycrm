package at0;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: RoundedTiledDrawable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lat0/a;", "Landroid/graphics/drawable/Drawable;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: at0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C24173a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final float[] f56767a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f56768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f56769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Path f56770d;

    public C24173a(@k Bitmap bitmap, @k float[] fArr) {
        this.f56767a = fArr;
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        this.f56768b = paint;
        this.f56769c = new RectF();
        this.f56770d = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        Path path = this.f56770d;
        path.reset();
        RectF rectF = this.f56769c;
        rectF.set(0.0f, 0.0f, fWidth, fHeight);
        path.addRoundRect(rectF, this.f56767a, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawRect(0.0f, 0.0f, fWidth, fHeight, this.f56768b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f56768b.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
        this.f56768b.setColorFilter(colorFilter);
    }
}
