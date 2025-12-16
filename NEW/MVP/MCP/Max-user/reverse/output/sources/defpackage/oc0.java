package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes2.dex */
public final class oc0 extends lk0 {
    @Override // defpackage.lk0, defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        vc3 vc3VarC = r2cVar.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = (Bitmap) vc3VarC.Z();
        hp0 hp0Var = hte.a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, hte.b, null);
        int iMin = Math.min(width, height) / 2;
        Path pathB = hte.b(iMin);
        Matrix matrix = new Matrix();
        float f = iMin;
        matrix.postTranslate((width / 2.0f) - f, (height / 2.0f) - f);
        pathB.transform(matrix);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        pathB.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(pathB, paint);
        return vc3VarC;
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        return new c1f("AvatarAsSquirclePostProcessor");
    }
}
