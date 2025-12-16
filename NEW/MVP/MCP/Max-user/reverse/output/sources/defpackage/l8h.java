package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l8h extends dtf implements sm6 {
    public final /* synthetic */ Size o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8h(Size size, Continuation continuation) {
        super(2, continuation);
        this.o = size;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l8h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l8h(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int width = this.o.getWidth();
        Path pathF = ve3.f("M328 164c0 90.446-73.554 164-164 164S0 254.446 0 164S73.554 0 164 0s164 73.554 164 164Z");
        RectF rectF = new RectF();
        pathF.computeBounds(rectF, true);
        float fMax = (2 + width) / Math.max(rectF.width(), rectF.height());
        Matrix matrix = new Matrix();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.postScale(fMax, fMax);
        float f = width;
        float f2 = 2;
        matrix.postTranslate((f - (rectF.width() * fMax)) / f2, (f - (rectF.height() * fMax)) / f2);
        pathF.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setFlags(6);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        pathF.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.drawPath(pathF, paint);
        return bitmapCreateBitmap;
    }
}
