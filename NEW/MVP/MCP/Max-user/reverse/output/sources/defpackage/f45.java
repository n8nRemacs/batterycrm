package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f45 extends Drawable implements Animatable {
    public static final r72 u0 = new r72(Float.class, "growFraction", 7);
    public ArrayList X;
    public boolean Y;
    public float Z;
    public final Context a;
    public final rk0 b;
    public ObjectAnimator d;
    public ObjectAnimator o;
    public int t0;
    public final Paint s0 = new Paint();
    public jh c = new jh();

    public f45(Context context, rk0 rk0Var) {
        this.a = context;
        this.b = rk0Var;
        setAlpha(255);
    }

    public final float b() {
        rk0 rk0Var = this.b;
        if (rk0Var.e == 0 && rk0Var.f == 0) {
            return 1.0f;
        }
        return this.Z;
    }

    public final boolean c(boolean z, boolean z2, boolean z3) {
        jh jhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        jhVar.getClass();
        return d(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.d;
        int i = 0;
        r72 r72Var = u0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, r72Var, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.d.setInterpolator(rg.b);
            ObjectAnimator objectAnimator2 = this.d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.d = objectAnimator2;
            objectAnimator2.addListener(new e45(this, i));
        }
        int i2 = 1;
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, r72Var, 1.0f, 0.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.o.setInterpolator(rg.b);
            ObjectAnimator objectAnimator3 = this.o;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.o = objectAnimator3;
            objectAnimator3.addListener(new e45(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.d : this.o;
            ObjectAnimator objectAnimator5 = z ? this.o : this.d;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.Y;
                    this.Y = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.Y = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.Y;
                    this.Y = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.Y = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                rk0 rk0Var = this.b;
                if (!z ? rk0Var.f != 0 : rk0Var.e != 0) {
                    boolean z7 = this.Y;
                    this.Y = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.Y = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void e(pk0 pk0Var) {
        ArrayList arrayList = this.X;
        if (arrayList == null || !arrayList.contains(pk0Var)) {
            return;
        }
        this.X.remove(pk0Var);
        if (this.X.isEmpty()) {
            this.X = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.o;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.t0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.s0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return c(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
