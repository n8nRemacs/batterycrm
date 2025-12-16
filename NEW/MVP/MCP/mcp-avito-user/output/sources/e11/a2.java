package e11;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes7.dex */
public class a2 {
    @j.N
    public static void a(float f12, int i12, @j.N Paint paint, @j.N Canvas canvas) {
        float f13 = 3.0f * f12;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-2013265920);
        float f14 = i12;
        canvas.drawOval(new RectF(0.0f, 0.0f, f14, f14), paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(f13);
        paint3.setColor(-1);
        float f15 = f14 / 2.0f;
        canvas.drawCircle(f15, f15, f15 - (f13 / 2.0f), paint3);
        paint.setStrokeWidth(f13);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f16 = 23.0f * f12;
        float f17 = 38.0f * f12;
        path.moveTo(f16, f17);
        float f18 = 60.0f * f12;
        path.lineTo(f16, f18);
        path.lineTo(f17, f18);
        path.lineTo(f17, f17);
        float f19 = 56.0f * f12;
        path.lineTo(f19, 27.0f * f12);
        path.lineTo(f19, f12 * 71.0f);
        path.lineTo(f17, f18);
        path.moveTo(f17, f17);
        path.lineTo(f16, f17);
        path.close();
        canvas.drawPath(path, paint);
    }
}
