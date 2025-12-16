package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j.N;
import j.X;

/* compiled from: FixedSizeDrawable.java */
/* loaded from: classes5.dex */
public class j extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f339603a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f339604b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f339605c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f339606d;

    /* renamed from: e, reason: collision with root package name */
    public a f339607e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f339608f;

    /* compiled from: FixedSizeDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f339609a;

        /* renamed from: b, reason: collision with root package name */
        public final int f339610b;

        /* renamed from: c, reason: collision with root package name */
        public final int f339611c;

        public a(Drawable.ConstantState constantState, int i12, int i13) {
            this.f339609a = constantState;
            this.f339610b = i12;
            this.f339611c = i13;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable() {
            return new j(this, this.f339609a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable(Resources resources) {
            return new j(this, this.f339609a.newDrawable(resources));
        }
    }

    public j(a aVar, Drawable drawable) {
        this.f339607e = aVar;
        com.bumptech.glide.util.k.c(drawable, "Argument must not be null");
        this.f339606d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f339603a = new Matrix();
        this.f339604b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f339605c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f339606d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        canvas.save();
        canvas.concat(this.f339603a);
        this.f339606d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @X
    public final int getAlpha() {
        return this.f339606d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.Callback getCallback() {
        return this.f339606d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f339606d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f339607e;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public final Drawable getCurrent() {
        return this.f339606d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f339607e.f339611c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f339607e.f339610b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f339606d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f339606d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f339606d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@N Rect rect) {
        return this.f339606d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f339606d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public final Drawable mutate() {
        if (!this.f339608f && super.mutate() == this) {
            this.f339606d = this.f339606d.mutate();
            a aVar = this.f339607e;
            this.f339607e = new a(aVar.f339609a, aVar.f339610b, aVar.f339611c);
            this.f339608f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(@N Runnable runnable, long j12) {
        super.scheduleSelf(runnable, j12);
        this.f339606d.scheduleSelf(runnable, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f339606d.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i12, int i13, int i14, int i15) {
        super.setBounds(i12, i13, i14, i15);
        RectF rectF = this.f339605c;
        rectF.set(i12, i13, i14, i15);
        this.f339603a.setRectToRect(this.f339604b, rectF, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i12) {
        this.f339606d.setChangingConfigurations(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i12, @N PorterDuff.Mode mode) {
        this.f339606d.setColorFilter(i12, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public final void setDither(boolean z12) {
        this.f339606d.setDither(z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z12) {
        this.f339606d.setFilterBitmap(z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        return this.f339606d.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(@N Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f339606d.unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f339606d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(@N Rect rect) {
        super.setBounds(rect);
        RectF rectF = this.f339605c;
        rectF.set(rect);
        this.f339603a.setRectToRect(this.f339604b, rectF, Matrix.ScaleToFit.CENTER);
    }
}
