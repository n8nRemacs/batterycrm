package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class ttd extends std {
    @Override // defpackage.std, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ml6.i();
        if (!this.b && !this.c && this.d <= 0.0f) {
            super.draw(canvas);
            ml6.i();
            return;
        }
        e();
        d();
        canvas.clipPath(this.o);
        super.draw(canvas);
        ml6.i();
    }
}
