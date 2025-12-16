package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class o8f extends Drawable {
    public static final Paint d;
    public final p8f a;
    public final Rect b;
    public final Paint c;

    static {
        Paint paint = new Paint();
        paint.setColor(0);
        d = paint;
    }

    public o8f(p8f p8fVar) {
        this.a = p8fVar;
        this.b = new Rect();
        this.c = new Paint(2);
        int i = p8fVar.b;
        setBounds(0, 0, i, i);
        a();
    }

    public final void a() {
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        int i = this.a.b / 2;
        this.b.set(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        p8f p8fVar = this.a;
        Bitmap bitmapO = p8fVar.c.o(p8fVar.a);
        Rect rect = this.b;
        if (bitmapO == null) {
            canvas.drawRect(rect, d);
        } else {
            Rect rect2 = dc5.c;
            canvas.drawBitmap(bitmapO, dc5.c, rect, this.c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8f) && fni.a(this.a, ((o8f) obj).a);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
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
    public final int getMinimumHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.b = i4;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final String toString() {
        return "SpriteEmojiDrawable(state=" + this.a + ")";
    }

    public o8f(nc5 nc5Var, int i, ka5 ka5Var) {
        this(new p8f(new nb5(nc5Var.b, nc5Var.c, nc5Var.d), i, ka5Var));
    }
}
