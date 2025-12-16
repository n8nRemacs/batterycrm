package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class rb9 extends View implements u6g {
    public final int a;
    public final int b;
    public final float c;
    public final Drawable d;
    public final Object o;

    public rb9(Context context) {
        super(context);
        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
        this.a = kti.d(2 * vw4.d().getDisplayMetrics().density);
        this.b = kti.d(6 * vw4.d().getDisplayMetrics().density);
        this.c = vw4.d().getDisplayMetrics().density * 16.0f;
        Drawable drawableMutate = r34.b(getContext(), yud.R).mutate();
        drawableMutate.setBounds(0, 0, iD, iD);
        drawableMutate.setTint(getDrawableColor());
        this.d = drawableMutate;
        this.o = ipi.b(3, new c38(22));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
    }

    private final int getBackgroundColor() {
        a93.s0.y(this).a();
        return 1543503872;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Paint getBackgroundPaint() {
        return (Paint) this.o.getValue();
    }

    private final int getDrawableColor() {
        a93.s0.y(this).a();
        return -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getBackgroundPaint().setColor(getBackgroundColor());
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, getBackgroundPaint());
        float f2 = this.b;
        float f3 = this.a;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            this.d.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.d;
        setMeasuredDimension((this.b * 2) + drawable.getBounds().width(), (this.a * 2) + drawable.getBounds().height());
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d.setTint(getDrawableColor());
    }
}
