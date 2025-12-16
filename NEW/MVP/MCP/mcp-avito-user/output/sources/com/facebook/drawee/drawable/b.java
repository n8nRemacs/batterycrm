package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: ArrayDrawable.java */
/* loaded from: classes10.dex */
public class b extends Drawable implements Drawable.Callback, u, t {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public Drawable f340039b;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable[] f340041d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f340042e;

    /* renamed from: c, reason: collision with root package name */
    public final f f340040c = new f();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f340043f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public boolean f340044g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f340045h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f340046i = false;

    public b(Drawable[] drawableArr) {
        int i12 = 0;
        this.f340041d = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f340041d;
            if (i12 >= drawableArr2.length) {
                this.f340042e = new e[drawableArr2.length];
                return;
            } else {
                g.c(drawableArr2[i12], this, this);
                i12++;
            }
        }
    }

    @I41.h
    public final Drawable a(int i12) {
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 >= 0));
        Drawable[] drawableArr = this.f340041d;
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 < drawableArr.length));
        return drawableArr[i12];
    }

    public final e b(int i12) {
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException();
        }
        e[] eVarArr = this.f340042e;
        if (!(i12 < eVarArr.length)) {
            throw new IllegalArgumentException();
        }
        if (eVarArr[i12] == null) {
            eVarArr[i12] = new a(this, i12);
        }
        return eVarArr[i12];
    }

    @I41.h
    public final Drawable c(@I41.h Drawable drawable, int i12) {
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException();
        }
        Drawable[] drawableArr = this.f340041d;
        if (!(i12 < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[i12];
        if (drawable != drawable2) {
            if (drawable != null && this.f340046i) {
                drawable.mutate();
            }
            g.c(drawableArr[i12], null, null);
            g.c(drawable, null, null);
            g.d(drawable, this.f340040c);
            g.a(drawable, this);
            g.c(drawable, this, this);
            this.f340045h = false;
            drawableArr[i12] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.drawable.t
    public final void e(u uVar) {
        this.f340039b = (Drawable) uVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, com.facebook.drawee.drawable.u] */
    @Override // com.facebook.drawee.drawable.u
    public final void f(RectF rectF) {
        ?? r02 = this.f340039b;
        if (r02 != 0) {
            r02.f(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i12 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i12++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i12 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i12++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.f340041d;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i12 = 1; i12 < drawableArr.length; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i12 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                Rect rect2 = this.f340043f;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.f340045h) {
            this.f340044g = false;
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr = this.f340041d;
                boolean z12 = true;
                if (i12 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i12];
                boolean z13 = this.f340044g;
                if (drawable == null || !drawable.isStateful()) {
                    z12 = false;
                }
                this.f340044g = z13 | z12;
                i12++;
            }
            this.f340045h = true;
        }
        return this.f340044g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, com.facebook.drawee.drawable.u] */
    @Override // com.facebook.drawee.drawable.u
    public final void k(Matrix matrix) {
        ?? r02 = this.f340039b;
        if (r02 != 0) {
            r02.k(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                this.f340046i = true;
                return this;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.mutate();
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i13 >= drawableArr.length) {
                return z12;
            }
            Drawable drawable = drawableArr[i13];
            if (drawable != null && drawable.setLevel(i12)) {
                z12 = true;
            }
            i13++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return z12;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null && drawable.setState(iArr)) {
                z12 = true;
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j12) {
        scheduleSelf(runnable, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i12) {
        this.f340040c.f340051a = i12;
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i13 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                drawable.setAlpha(i12);
            }
            i13++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        f fVar = this.f340040c;
        fVar.f340053c = colorFilter;
        int i12 = 0;
        fVar.f340052b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z12) {
        this.f340040c.f340054d = z12 ? 1 : 0;
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setDither(z12);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z12) {
        this.f340040c.f340055e = z12 ? 1 : 0;
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setFilterBitmap(z12);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void setHotspot(float f12, float f13) {
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setHotspot(f12, f13);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        boolean visible = super.setVisible(z12, z13);
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f340041d;
            if (i12 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setVisible(z12, z13);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
