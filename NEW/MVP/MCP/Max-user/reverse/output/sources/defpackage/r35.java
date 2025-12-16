package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class r35 extends View implements u6g {
    public final Paint a;
    public final RectF b;
    public float c;
    public yeb d;

    public r35(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new RectF();
        onThemeChanged(a93.s0.y(this));
        setClickable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 49));
    }

    public final yeb getCustomTheme() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.c;
        canvas.drawRoundRect(this.b, f, f, this.a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = vw4.d().getDisplayMetrics().density * 40.0f;
        float f2 = vw4.d().getDisplayMetrics().density * 4.0f;
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, f, f2);
        this.c = rectF.centerY();
        setMeasuredDimension((int) rectF.width(), (int) rectF.height());
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        yeb yebVar2 = this.d;
        if (yebVar2 != null) {
            yebVar = yebVar2;
        }
        this.a.setColor(yebVar.getIcon().h);
        invalidate();
    }

    public final void setCustomTheme(yeb yebVar) {
        if (yebVar != null) {
            onThemeChanged(yebVar);
        }
        this.d = yebVar;
    }
}
