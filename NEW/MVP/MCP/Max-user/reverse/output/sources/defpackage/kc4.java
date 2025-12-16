package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class kc4 extends wq8 {
    public static final /* synthetic */ int J0 = 0;
    public jc4 I0;

    @Override // defpackage.wq8
    public final void f(Canvas canvas) {
        if (this.I0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.I0.r);
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I0 = new jc4(this.I0);
        return this;
    }

    public final void q(float f, float f2, float f3, float f4) {
        RectF rectF = this.I0.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
