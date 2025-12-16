package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class up5 extends Drawable implements Drawable.Callback, ygg, xgg {
    public final boolean[] A0;
    public int B0;
    public boolean C0;
    public final boolean D0;
    public ygg a;
    public final Drawable[] c;
    public final w35[] d;
    public final Drawable[] s0;
    public final int t0;
    public int u0;
    public int v0;
    public long w0;
    public final int[] x0;
    public final int[] y0;
    public int z0;
    public final x35 b = new x35();
    public final Rect o = new Rect();
    public boolean X = false;
    public boolean Y = false;
    public boolean Z = false;

    public up5(Drawable[] drawableArr) {
        Drawable[] drawableArr2;
        this.c = drawableArr;
        int i = 0;
        while (true) {
            drawableArr2 = this.c;
            if (i >= drawableArr2.length) {
                break;
            }
            mee.d(drawableArr2[i], this, this);
            i++;
        }
        this.d = new w35[drawableArr2.length];
        this.D0 = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.s0 = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.x0 = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.y0 = iArr2;
        this.z0 = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.A0 = zArr;
        this.B0 = 0;
        this.t0 = 2;
        this.u0 = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void a() {
        this.B0--;
        invalidateSelf();
    }

    public final void b() {
        this.u0 = 2;
        for (int i = 0; i < this.s0.length; i++) {
            this.y0[i] = this.A0[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final Drawable c(int i) {
        l5j.a(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.c;
        l5j.a(Boolean.valueOf(i < drawableArr.length));
        return drawableArr[i];
    }

    @Override // defpackage.ygg
    public final void d(Matrix matrix) {
        ygg yggVar = this.a;
        if (yggVar != null) {
            yggVar.d(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zF;
        int i;
        int i2 = this.u0;
        Drawable[] drawableArr = this.s0;
        int[] iArr = this.y0;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.x0, 0, drawableArr.length);
            this.w0 = SystemClock.uptimeMillis();
            zF = f(this.v0 == 0 ? 1.0f : 0.0f);
            if (!this.C0 && (i = this.t0) >= 0) {
                boolean[] zArr = this.A0;
                if (i < zArr.length && zArr[i]) {
                    this.C0 = true;
                }
            }
            this.u0 = zF ? 2 : 1;
        } else if (i2 != 1) {
            zF = true;
        } else {
            l5j.f(this.v0 > 0);
            zF = f((SystemClock.uptimeMillis() - this.w0) / this.v0);
            this.u0 = zF ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int iCeil = (int) Math.ceil((iArr[i3] * this.z0) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.B0++;
                if (this.D0) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.B0--;
                drawable.draw(canvas);
            }
        }
        if (!zF) {
            invalidateSelf();
        } else if (this.C0) {
            this.C0 = false;
        }
    }

    public final Drawable e(Drawable drawable, int i) {
        x35 x35Var;
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        Drawable[] drawableArr = this.c;
        if (!(i < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[i];
        if (drawable != drawable2) {
            if (drawable != null && this.Z) {
                drawable.mutate();
            }
            mee.d(drawableArr[i], null, null);
            mee.d(drawable, null, null);
            if (drawable != null && (x35Var = this.b) != null) {
                x35Var.b(drawable);
            }
            mee.a(drawable, this);
            mee.d(drawable, this, this);
            this.Y = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public final boolean f(float f) {
        boolean z = true;
        for (int i = 0; i < this.s0.length; i++) {
            boolean z2 = this.A0[i];
            int i2 = (int) (((z2 ? 1 : -1) * 255 * f) + this.x0[i]);
            int[] iArr = this.y0;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ygg
    public final void g(RectF rectF) {
        ygg yggVar = this.a;
        if (yggVar != null) {
            yggVar.g(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.c;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i = 1; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                Rect rect2 = this.o;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.B0 == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.Y) {
            this.X = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.X;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.X = z2 | z;
                i++;
            }
            this.Y = true;
        }
        return this.X;
    }

    @Override // defpackage.xgg
    public final void l(ygg yggVar) {
        this.a = yggVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                this.Z = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        x35 x35Var = this.b;
        x35Var.e = colorFilter;
        int i = 0;
        x35Var.d = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.b.b = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.b.c = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
