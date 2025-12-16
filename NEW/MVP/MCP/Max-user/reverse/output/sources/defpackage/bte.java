package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class bte extends fte {
    public final dte c;
    public final float d;
    public final float e;

    public bte(dte dteVar, float f, float f2) {
        this.c = dteVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.fte
    public final void a(Matrix matrix, vse vseVar, int i, Canvas canvas) {
        dte dteVar = this.c;
        float f = dteVar.c;
        float f2 = this.e;
        float f3 = dteVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        vseVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = vseVar.f;
        int[] iArr = vse.i;
        iArr[0] = i2;
        iArr[1] = vseVar.e;
        iArr[2] = vseVar.d;
        Paint paint = vseVar.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, vse.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        dte dteVar = this.c;
        return (float) Math.toDegrees(Math.atan((dteVar.c - this.e) / (dteVar.b - this.d)));
    }
}
