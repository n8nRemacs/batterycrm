package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class hcg extends Drawable implements u6g {
    public final Paint X;
    public final cm6 a;
    public final int b;
    public final int c;
    public final ShapeDrawable d;
    public final Path o;

    public hcg(cm6 cm6Var, int i, int i2) {
        this.a = cm6Var;
        this.b = i;
        this.c = i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = vw4.d().getDisplayMetrics().density * 12.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.d = shapeDrawable;
        this.o = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.X = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.d.draw(canvas);
        canvas.drawPath(this.o, this.X);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fD;
        float fD2;
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        int i = this.b;
        int iV = az1.v(i);
        if (iV == 0) {
            rect2.top = u45.c(8, vw4.d().getDisplayMetrics().density, rect.top);
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            rect2.bottom = u45.q(8, vw4.d().getDisplayMetrics().density, rect.bottom);
        }
        this.d.setBounds(rect2);
        Path path = this.o;
        path.reset();
        int iV2 = az1.v(i);
        int i2 = this.c;
        if (iV2 == 0) {
            int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
            int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
            int iV3 = az1.v(i2);
            if (iV3 == 0) {
                fD = (iD / 2.0f) + kti.d(10 * vw4.d().getDisplayMetrics().density);
            } else if (iV3 == 1) {
                fD = rect.width() / 2.0f;
            } else {
                if (iV3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fD = (rect.width() - (iD / 2.0f)) - kti.d(10 * vw4.d().getDisplayMetrics().density);
            }
            float f = fD;
            float f2 = iD / 2.0f;
            float f3 = rect.top + iD2;
            path.moveTo(f + f2, f3);
            float f4 = rect.top;
            path.cubicTo(f, f4, f, f4, f - f2, f3);
            return;
        }
        if (iV2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        int iD4 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        int iV4 = az1.v(i2);
        if (iV4 == 0) {
            fD2 = (iD3 / 2.0f) + kti.d(10 * vw4.d().getDisplayMetrics().density);
        } else if (iV4 == 1) {
            fD2 = rect.width() / 2.0f;
        } else {
            if (iV4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fD2 = (rect.width() - (iD3 / 2.0f)) - kti.d(10 * vw4.d().getDisplayMetrics().density);
        }
        float f5 = fD2;
        float f6 = iD3 / 2.0f;
        float f7 = rect.bottom - iD4;
        path.moveTo(f5 - f6, f7);
        float f8 = rect.bottom;
        path.cubicTo(f5, f8, f5, f8, f5 + f6, f7);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Paint paint = this.d.getPaint();
        cm6 cm6Var = this.a;
        paint.setColor(((Number) cm6Var.invoke()).intValue());
        this.X.setColor(((Number) cm6Var.invoke()).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
