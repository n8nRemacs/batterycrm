package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RenderScript;

/* loaded from: classes2.dex */
public final class z0g implements tq0 {
    public final Paint a;
    public final Object b;

    public z0g(Context context) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = ipi.b(2, new p2f(context, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.tq0
    public final void a() {
        bwf bwfVar = ((ae7) this.b.getValue()).a;
        if (bwfVar.e()) {
            ((RenderScript) bwfVar.getValue()).destroy();
        }
    }

    @Override // defpackage.tq0
    public final void e(int i) {
        this.a.setAlpha(i);
    }

    @Override // defpackage.tq0
    public final void g(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.tq0
    public final void j(Bitmap bitmap, float f) {
        ((ae7) this.b.getValue()).a(bitmap, kti.d(f), true);
    }
}
