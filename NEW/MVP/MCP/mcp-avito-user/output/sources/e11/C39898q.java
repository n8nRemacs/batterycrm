package e11;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: e11.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39898q {
    @j.P
    public static Bitmap a(int i12) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        float f12 = i12;
        float f13 = f12 / 100.0f;
        Paint paint = new Paint();
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f14 = 3.0f * f13;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-2013265920);
        canvas.drawOval(new RectF(0.0f, 0.0f, f12, f12), paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f14);
        paint3.setColor(-1);
        float f15 = i12 / 2;
        canvas.drawCircle(f15, f15, f15 - (f14 / 2.0f), paint3);
        paint.setStrokeWidth(f14);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f16 = 33.0f * f13;
        path.moveTo(f16, f16);
        float f17 = 66.0f * f13;
        path.lineTo(f17, f17);
        path.moveTo(f16, f17);
        float f18 = 50.0f * f13;
        path.lineTo(f18, f18);
        path.moveTo(55.0f * f13, f13 * 45.0f);
        path.lineTo(f17, f16);
        path.close();
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }
}
