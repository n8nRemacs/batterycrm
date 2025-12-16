package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class g5f extends Drawable implements Animatable, u6g {
    public int X;
    public int Y;
    public final Context a;
    public final gf1 b;
    public boolean s0;
    public float t0;
    public final Integer[] c = {3, 1, 2};
    public final Paint d = new Paint(1);
    public final RectF o = new RectF();
    public final r98 Z = new r98(23, this);

    public g5f(Context context, yeb yebVar, gf1 gf1Var) {
        this.a = context;
        this.b = gf1Var;
        onThemeChanged(yebVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fWidth = bounds.width() / 2.0f;
        float fHeight = bounds.height() / 2.0f;
        int i = this.X;
        Integer[] numArr = this.c;
        float f = 2;
        float length = fWidth - ((((numArr.length - 1) * kti.d(vw4.d().getDisplayMetrics().density * f)) + (i * numArr.length)) / 2);
        int length2 = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            int i4 = i3 + 1;
            int iIntValue = numArr[i2].intValue();
            float fD = ((kti.d(vw4.d().getDisplayMetrics().density * f) + this.X) * i3) + length;
            RectF rectF = this.o;
            rectF.left = fD;
            int i5 = this.Y;
            rectF.top = fHeight - (i5 / 2);
            rectF.right = fD + this.X;
            rectF.bottom = (i5 / 2) + fHeight;
            float fHeight2 = rectF.height() * Math.max(0.3f, (((float) Math.sin(this.t0 + ((numArr.length - iIntValue) + 1))) + 1) / f);
            canvas.drawRoundRect(rectF.left, fHeight - fHeight2, rectF.right, fHeight + fHeight2, vw4.d().getDisplayMetrics().density * 4.0f, vw4.d().getDisplayMetrics().density * 4.0f, this.d);
            i2++;
            i3 = i4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iWidth = getBounds().width();
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        Integer[] numArr = this.c;
        this.X = (int) (((iWidth - ((numArr.length - 1) * iD)) / numArr.length) * 0.5f);
        this.Y = (int) (r5.height() * 0.3f);
        invalidateSelf();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d.setColor(((Number) this.b.invoke(a93.s0.z(this.a).c)).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        scheduleSelf(this.Z, SystemClock.uptimeMillis() + 3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.s0) {
            this.s0 = false;
            unscheduleSelf(this.Z);
        }
    }
}
