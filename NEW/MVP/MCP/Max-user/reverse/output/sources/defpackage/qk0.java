package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class qk0 extends ProgressBar {
    public static final int y0 = m5d.Widget_MaterialComponents_ProgressIndicator;
    public final rk0 a;
    public int b;
    public final boolean c;
    public final int d;
    public jh o;
    public boolean s0;
    public int t0;
    public final ok0 u0;
    public final ok0 v0;
    public final pk0 w0;
    public final pk0 x0;

    public qk0(int i, int i2, Context context) {
        super(er8.a(context, null, i, y0), null, i);
        this.s0 = false;
        this.t0 = 4;
        this.u0 = new ok0(this, 0);
        this.v0 = new ok0(this, 1);
        this.w0 = new pk0(this, 0);
        this.x0 = new pk0(this, 1);
        Context context2 = getContext();
        this.a = a(context2);
        int[] iArr = z5d.BaseProgressIndicator;
        d7g.a(context2, null, i, i2);
        d7g.b(context2, null, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i, i2);
        typedArrayObtainStyledAttributes.getInt(z5d.BaseProgressIndicator_showDelay, -1);
        this.d = Math.min(typedArrayObtainStyledAttributes.getInt(z5d.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.o = new jh();
        this.c = true;
    }

    private q45 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v0;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().v0;
    }

    public abstract rk0 a(Context context);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.s0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                jh jhVar = this.o;
                ContentResolver contentResolver = getContext().getContentResolver();
                jhVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().w0.f0();
                    return;
                }
            }
            this.w0.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = hfh.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().w0.e0(this.w0);
        }
        ou4 progressDrawable = getProgressDrawable();
        pk0 pk0Var = this.x0;
        if (progressDrawable != null) {
            ou4 progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.X == null) {
                progressDrawable2.X = new ArrayList();
            }
            if (!progressDrawable2.X.contains(pk0Var)) {
                progressDrawable2.X.add(pk0Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            pj7 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.X == null) {
                indeterminateDrawable.X = new ArrayList();
            }
            if (!indeterminateDrawable.X.contains(pk0Var)) {
                indeterminateDrawable.X.add(pk0Var);
            }
        }
        if (c()) {
            if (this.d > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.v0);
        removeCallbacks(this.u0);
        ((f45) getCurrentDrawable()).c(false, false, false);
        pj7 indeterminateDrawable = getIndeterminateDrawable();
        pk0 pk0Var = this.x0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(pk0Var);
            getIndeterminateDrawable().w0.i0();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(pk0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            q45 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((f45) getCurrentDrawable()).c(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((f45) getCurrentDrawable()).c(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(jh jhVar) {
        this.o = jhVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = jhVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = jhVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            f45 f45Var = (f45) getCurrentDrawable();
            if (f45Var != null) {
                f45Var.c(false, false, false);
            }
            super.setIndeterminate(z);
            f45 f45Var2 = (f45) getCurrentDrawable();
            if (f45Var2 != null) {
                f45Var2.c(c(), false, false);
            }
            if ((f45Var2 instanceof pj7) && c()) {
                ((pj7) f45Var2).w0.h0();
            }
            this.s0 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof pj7)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((f45) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{eti.d(dvc.colorPrimary, -1, getContext())};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.c = iArr;
        getIndeterminateDrawable().w0.V();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        rk0 rk0Var = this.a;
        if (rk0Var.g != i) {
            rk0Var.g = i;
            rk0Var.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof ou4)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            ou4 ou4Var = (ou4) drawable;
            ou4Var.c(false, false, false);
            super.setProgressDrawable(ou4Var);
            ou4Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        rk0 rk0Var = this.a;
        if (rk0Var.d != i) {
            rk0Var.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        rk0 rk0Var = this.a;
        if (rk0Var.b != i) {
            rk0Var.b = Math.min(i, rk0Var.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        rk0 rk0Var = this.a;
        if (rk0Var.a != i) {
            rk0Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.t0 = i;
    }

    @Override // android.widget.ProgressBar
    public pj7 getIndeterminateDrawable() {
        return (pj7) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public ou4 getProgressDrawable() {
        return (ou4) super.getProgressDrawable();
    }
}
