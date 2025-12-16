package e11;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: e11.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39896p0 extends View {

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f394728b;

    /* renamed from: c, reason: collision with root package name */
    public static final Path f394729c;

    static {
        Paint paint = new Paint();
        f394728b = paint;
        f394729c = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredHeight == 0.0f) {
            return;
        }
        Path path = f394729c;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f12 = 0.45f * measuredHeight;
        double d12 = measuredHeight;
        float f13 = measuredHeight * 2.0f;
        path.moveTo((float) androidx.appcompat.app.r.b(0.0d, d12, d12), f13 - ((float) ((Math.cos(0.0d) * d12) + d12)));
        double d13 = f12;
        path.lineTo((float) androidx.appcompat.app.r.b(0.6283185307179586d, d13, d12), f13 - ((float) ((Math.cos(0.6283185307179586d) * d13) + d12)));
        for (int i12 = 1; i12 < 5; i12++) {
            double d14 = i12 * 1.2566370614359172d;
            path.lineTo((float) androidx.appcompat.app.r.b(d14, d12, d12), f13 - ((float) ((Math.cos(d14) * d12) + d12)));
            double d15 = d14 + 0.6283185307179586d;
            path.lineTo((float) androidx.appcompat.app.r.b(d15, d13, d12), f13 - ((float) ((Math.cos(d15) * d13) + d12)));
        }
        path.close();
        canvas.drawPath(path, f394728b);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iMin = Math.min(View.MeasureSpec.getSize(i12), View.MeasureSpec.getSize(i12));
        setMeasuredDimension(iMin, iMin);
    }

    public void setColor(int i12) {
        f394728b.setColor(i12);
        invalidate();
    }
}
