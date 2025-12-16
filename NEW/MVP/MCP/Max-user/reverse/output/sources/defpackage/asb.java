package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class asb extends FrameLayout implements u6g {
    public final Paint a;
    public final RectF b;
    public final float c;

    public asb(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setColor(zob.b(a93.s0.y(this).b().a.n, 0.16f));
        this.a = paint;
        this.b = new RectF();
        this.c = kti.d(38 * vw4.d().getDisplayMetrics().density);
        setWillNotDraw(false);
        float f = 80;
        setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, width, height);
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setColor(zob.b(yebVar.b().a.n, 0.16f));
    }
}
