package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import j.N;
import j.P;
import j.X;

/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
class k extends Drawable implements Drawable.Callback, j, i {

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f44761h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public int f44762b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f44763c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44764d;

    /* renamed from: e, reason: collision with root package name */
    public m f44765e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44766f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f44767g;

    @Override // androidx.core.graphics.drawable.j
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f44767g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f44767g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            m mVar = this.f44765e;
            if (mVar != null) {
                mVar.f44770b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.j
    public final Drawable b() {
        return this.f44767g;
    }

    public final boolean c(int[] iArr) {
        if (this instanceof l) {
            return false;
        }
        m mVar = this.f44765e;
        ColorStateList colorStateList = mVar.f44771c;
        PorterDuff.Mode mode = mVar.f44772d;
        if (colorStateList == null || mode == null) {
            this.f44764d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f44764d || colorForState != this.f44762b || mode != this.f44763c) {
                setColorFilter(colorForState, mode);
                this.f44762b = colorForState;
                this.f44763c = mode;
                this.f44764d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        this.f44767g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        m mVar = this.f44765e;
        return changingConfigurations | (mVar != null ? mVar.getChangingConfigurations() : 0) | this.f44767g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final Drawable.ConstantState getConstantState() {
        m mVar = this.f44765e;
        if (mVar == null || mVar.f44770b == null) {
            return null;
        }
        mVar.f44769a = getChangingConfigurations();
        return this.f44765e;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public final Drawable getCurrent() {
        return this.f44767g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f44767g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f44767g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @X
    public final int getLayoutDirection() {
        return this.f44767g.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f44767g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f44767g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f44767g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@N Rect rect) {
        return this.f44767g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public final int[] getState() {
        return this.f44767g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f44767g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@N Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f44767g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        m mVar;
        ColorStateList colorStateList = ((this instanceof l) || (mVar = this.f44765e) == null) ? null : mVar.f44771c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f44767g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f44767g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public final Drawable mutate() {
        if (!this.f44766f && super.mutate() == this) {
            m mVar = this.f44765e;
            m mVar2 = new m();
            mVar2.f44771c = null;
            mVar2.f44772d = f44761h;
            if (mVar != null) {
                mVar2.f44769a = mVar.f44769a;
                mVar2.f44770b = mVar.f44770b;
                mVar2.f44771c = mVar.f44771c;
                mVar2.f44772d = mVar.f44772d;
            }
            this.f44765e = mVar2;
            Drawable drawable = this.f44767g;
            if (drawable != null) {
                drawable.mutate();
            }
            m mVar3 = this.f44765e;
            if (mVar3 != null) {
                Drawable drawable2 = this.f44767g;
                mVar3.f44770b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f44766f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f44767g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @X
    public final boolean onLayoutDirectionChanged(int i12) {
        return this.f44767g.setLayoutDirection(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        return this.f44767g.setLevel(i12);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j12) {
        scheduleSelf(runnable, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f44767g.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z12) {
        this.f44767g.setAutoMirrored(z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i12) {
        this.f44767g.setChangingConfigurations(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44767g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z12) {
        this.f44767g.setDither(z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z12) {
        this.f44767g.setFilterBitmap(z12);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@N int[] iArr) {
        return c(iArr) || this.f44767g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i12) {
        setTintList(ColorStateList.valueOf(i12));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f44765e.f44771c = colorStateList;
        c(this.f44767g.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@N PorterDuff.Mode mode) {
        this.f44765e.f44772d = mode;
        c(this.f44767g.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        return super.setVisible(z12, z13) || this.f44767g.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
