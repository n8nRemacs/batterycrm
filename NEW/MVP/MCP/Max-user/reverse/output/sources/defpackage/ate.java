package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class ate extends fte {
    public final cte c;

    public ate(cte cteVar) {
        this.c = cteVar;
    }

    @Override // defpackage.fte
    public final void a(Matrix matrix, vse vseVar, int i, Canvas canvas) {
        float f;
        cte cteVar = this.c;
        float f2 = cteVar.f;
        float f3 = cteVar.g;
        RectF rectF = new RectF(cteVar.b, cteVar.c, cteVar.d, cteVar.e);
        Paint paint = vseVar.b;
        boolean z = f3 < 0.0f;
        Path path = vseVar.g;
        int[] iArr = vse.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = vseVar.f;
            iArr[2] = vseVar.e;
            iArr[3] = vseVar.d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = vseVar.d;
            iArr[2] = vseVar.e;
            iArr[3] = vseVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = vse.l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, vseVar.h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
