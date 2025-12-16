package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vbb extends AppCompatImageView {
    public float d;
    public Path o;
    public int s0;
    public final Paint t0;

    public vbb(Context context) {
        super(context, null);
        a93.s0.y(this).f();
        this.s0 = 687865856;
        Paint paint = new Paint();
        paint.setColor(0);
        this.t0 = paint;
        tqi.c(new kga(3, (Continuation) null, 3), this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.o;
        if (path != null) {
            canvas.save();
            float width = (getWidth() / this.d) * vw4.d().getDisplayMetrics().density;
            canvas.scale(width, width);
            float f = vw4.d().getDisplayMetrics().density * 1.0f;
            float f2 = vw4.d().getDisplayMetrics().density * 0.0f;
            float f3 = vw4.d().getDisplayMetrics().density * 0.0f;
            int i = this.s0;
            Paint paint = this.t0;
            paint.setShadowLayer(f, f2, f3, i);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            canvas.restore();
        }
        super.onDraw(canvas);
    }
}
