package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ForwardingDrawable.java */
@Nullsafe
/* loaded from: classes10.dex */
public class i extends Drawable implements Drawable.Callback, u, t, e {

    /* renamed from: e, reason: collision with root package name */
    public static final Matrix f340068e = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public Drawable f340069b;

    /* renamed from: c, reason: collision with root package name */
    public final f f340070c = new f();

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public Drawable f340071d;

    public i(@I41.h Drawable drawable) {
        this.f340069b = drawable;
        g.c(drawable, this, this);
    }

    @Override // com.facebook.drawee.drawable.e
    @I41.h
    public final Drawable a() {
        return this.f340069b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.drawable.t
    public final void e(u uVar) {
        this.f340071d = (Drawable) uVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, com.facebook.drawee.drawable.u] */
    @Override // com.facebook.drawee.drawable.u
    public final void f(RectF rectF) {
        ?? r02 = this.f340071d;
        if (r02 != 0) {
            r02.f(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.e
    @I41.h
    public final Drawable g(@I41.h Drawable drawable) {
        return n(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    @I41.h
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f340069b;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    @I41.h
    public final Drawable getCurrent() {
        return this.f340069b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f340069b;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f340069b;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f340069b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f340069b;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f340069b;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // com.facebook.drawee.drawable.u
    public void k(Matrix matrix) {
        m(matrix);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, com.facebook.drawee.drawable.u] */
    public final void m(Matrix matrix) {
        ?? r02 = this.f340071d;
        if (r02 != 0) {
            r02.k(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @I41.h
    public Drawable n(@I41.h Drawable drawable) {
        Drawable drawable2 = this.f340069b;
        g.c(drawable2, null, null);
        g.c(drawable, null, null);
        g.d(drawable, this.f340070c);
        g.a(drawable, this);
        g.c(drawable, this, this);
        this.f340069b = drawable;
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        Drawable drawable = this.f340069b;
        return drawable == null ? super.onLevelChange(i12) : drawable.setLevel(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f340069b;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j12) {
        scheduleSelf(runnable, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f340070c.f340051a = i12;
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.setAlpha(i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@I41.h ColorFilter colorFilter) {
        f fVar = this.f340070c;
        fVar.f340053c = colorFilter;
        fVar.f340052b = colorFilter != null;
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z12) {
        this.f340070c.f340054d = z12 ? 1 : 0;
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.setDither(z12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z12) {
        this.f340070c.f340055e = z12 ? 1 : 0;
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.setFilterBitmap(z12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void setHotspot(float f12, float f13) {
        Drawable drawable = this.f340069b;
        if (drawable != null) {
            drawable.setHotspot(f12, f13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z12, boolean z13) {
        boolean visible = super.setVisible(z12, z13);
        Drawable drawable = this.f340069b;
        return drawable == null ? visible : drawable.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
