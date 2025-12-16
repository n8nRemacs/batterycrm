package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.b;
import j.N;
import j.P;
import java.util.ArrayList;
import lY0.C43707b;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes6.dex */
abstract class l extends Drawable implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: l, reason: collision with root package name */
    public static final Property<l, Float> f356943l = new a(Float.class, "growFraction");

    /* renamed from: b, reason: collision with root package name */
    public final Context f356944b;

    /* renamed from: c, reason: collision with root package name */
    public final c f356945c;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f356947e;

    /* renamed from: f, reason: collision with root package name */
    public ObjectAnimator f356948f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f356949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356950h;

    /* renamed from: i, reason: collision with root package name */
    public float f356951i;

    /* renamed from: k, reason: collision with root package name */
    public int f356953k;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f356952j = new Paint();

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.progressindicator.a f356946d = new com.google.android.material.progressindicator.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class a extends Property<l, Float> {
        @Override // android.util.Property
        public final Float get(l lVar) {
            return Float.valueOf(lVar.b());
        }

        @Override // android.util.Property
        public final void set(l lVar, Float f12) {
            l lVar2 = lVar;
            float fFloatValue = f12.floatValue();
            if (lVar2.f356951i != fFloatValue) {
                lVar2.f356951i = fFloatValue;
                lVar2.invalidateSelf();
            }
        }
    }

    public l(@N Context context, @N c cVar) {
        this.f356944b = context;
        this.f356945c = cVar;
        setAlpha(255);
    }

    public final float b() {
        c cVar = this.f356945c;
        if (cVar.f356911e == 0 && cVar.f356912f == 0) {
            return 1.0f;
        }
        return this.f356951i;
    }

    public void c() {
        f(false, false, false);
    }

    public boolean d() {
        ObjectAnimator objectAnimator = this.f356948f;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean e() {
        ObjectAnimator objectAnimator = this.f356947e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean f(boolean z12, boolean z13, boolean z14) {
        com.google.android.material.progressindicator.a aVar = this.f356946d;
        ContentResolver contentResolver = this.f356944b.getContentResolver();
        aVar.getClass();
        return g(z12, z13, z14 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean g(boolean z12, boolean z13, boolean z14) {
        ObjectAnimator objectAnimator = this.f356947e;
        Property<l, Float> property = f356943l;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
            this.f356947e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f356947e.setInterpolator(C43707b.f413880b);
            ObjectAnimator objectAnimator2 = this.f356947e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f356947e = objectAnimator2;
            objectAnimator2.addListener(new j(this));
        }
        if (this.f356948f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f);
            this.f356948f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f356948f.setInterpolator(C43707b.f413880b);
            ObjectAnimator objectAnimator3 = this.f356948f;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f356948f = objectAnimator3;
            objectAnimator3.addListener(new k(this));
        }
        if (!isVisible() && !z12) {
            return false;
        }
        ObjectAnimator objectAnimator4 = z12 ? this.f356947e : this.f356948f;
        ObjectAnimator objectAnimator5 = z12 ? this.f356948f : this.f356947e;
        if (!z14) {
            if (objectAnimator5.isRunning()) {
                boolean z15 = this.f356950h;
                this.f356950h = true;
                new ValueAnimator[]{objectAnimator5}[0].cancel();
                this.f356950h = z15;
            }
            if (objectAnimator4.isRunning()) {
                objectAnimator4.end();
            } else {
                boolean z16 = this.f356950h;
                this.f356950h = true;
                new ValueAnimator[]{objectAnimator4}[0].end();
                this.f356950h = z16;
            }
            return super.setVisible(z12, false);
        }
        if (z14 && objectAnimator4.isRunning()) {
            return false;
        }
        boolean z17 = !z12 || super.setVisible(z12, false);
        c cVar = this.f356945c;
        if (!z12 ? cVar.f356912f != 0 : cVar.f356911e != 0) {
            boolean z18 = this.f356950h;
            this.f356950h = true;
            new ValueAnimator[]{objectAnimator4}[0].end();
            this.f356950h = z18;
            return z17;
        }
        if (z13 || !objectAnimator4.isPaused()) {
            objectAnimator4.start();
        } else {
            objectAnimator4.resume();
        }
        return z17;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f356953k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h(@N b.a aVar) {
        ArrayList arrayList = this.f356949g;
        if (arrayList == null || !arrayList.contains(aVar)) {
            return false;
        }
        this.f356949g.remove(aVar);
        if (!this.f356949g.isEmpty()) {
            return true;
        }
        this.f356949g = null;
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return e() || d();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i12) {
        this.f356953k = i12;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f356952j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z12, boolean z13) {
        return f(z12, z13, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        g(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        g(false, true, false);
    }
}
