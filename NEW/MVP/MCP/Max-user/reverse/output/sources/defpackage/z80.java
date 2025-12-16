package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class z80 extends ch6 implements Runnable {
    public boolean X;
    public float Y;
    public boolean Z;
    public int o;

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.Y;
        if (!this.X) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.Z) {
            return;
        }
        this.Z = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z = false;
        this.Y += (int) ((20.0f / this.o) * 360.0f);
        invalidateSelf();
    }
}
