package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.b;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes6.dex */
final class r extends n<ObjectAnimator> {

    /* renamed from: j, reason: collision with root package name */
    public static final Property<r, Float> f356962j = new a(Float.class, "animationFraction");

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f356963d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.interpolator.view.animation.b f356964e;

    /* renamed from: f, reason: collision with root package name */
    public final w f356965f;

    /* renamed from: g, reason: collision with root package name */
    public int f356966g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356967h;

    /* renamed from: i, reason: collision with root package name */
    public float f356968i;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class a extends Property<r, Float> {
        @Override // android.util.Property
        public final Float get(r rVar) {
            return Float.valueOf(rVar.f356968i);
        }

        @Override // android.util.Property
        public final void set(r rVar, Float f12) {
            r rVar2 = rVar;
            rVar2.f356968i = f12.floatValue();
            float[] fArr = rVar2.f356957b;
            fArr[0] = 0.0f;
            float f13 = ((int) (r8 * 333.0f)) / 667;
            androidx.interpolator.view.animation.b bVar = rVar2.f356964e;
            float interpolation = bVar.getInterpolation(f13);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float interpolation2 = bVar.getInterpolation(f13 + 0.49925038f);
            fArr[4] = interpolation2;
            fArr[3] = interpolation2;
            fArr[5] = 1.0f;
            if (rVar2.f356967h && interpolation2 < 1.0f) {
                int[] iArr = rVar2.f356958c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = com.google.android.material.color.k.a(rVar2.f356965f.f356909c[rVar2.f356966g], rVar2.f356956a.f356953k);
                rVar2.f356967h = false;
            }
            rVar2.f356956a.invalidateSelf();
        }
    }

    public r(@N w wVar) {
        super(3);
        this.f356966g = 1;
        this.f356965f = wVar;
        this.f356964e = new androidx.interpolator.view.animation.b();
    }

    @Override // com.google.android.material.progressindicator.n
    public final void a() {
        ObjectAnimator objectAnimator = this.f356963d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.n
    public final void b() {
        this.f356967h = true;
        this.f356966g = 1;
        Arrays.fill(this.f356958c, com.google.android.material.color.k.a(this.f356965f.f356909c[0], this.f356956a.f356953k));
    }

    @Override // com.google.android.material.progressindicator.n
    public final void e() {
        if (this.f356963d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f356962j, 0.0f, 1.0f);
            this.f356963d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f356963d.setInterpolator(null);
            this.f356963d.setRepeatCount(-1);
            this.f356963d.addListener(new q(this));
        }
        this.f356967h = true;
        this.f356966g = 1;
        Arrays.fill(this.f356958c, com.google.android.material.color.k.a(this.f356965f.f356909c[0], this.f356956a.f356953k));
        this.f356963d.start();
    }

    @Override // com.google.android.material.progressindicator.n
    public final void d() {
    }

    @Override // com.google.android.material.progressindicator.n
    public final void f() {
    }

    @Override // com.google.android.material.progressindicator.n
    public final void c(@P b.a aVar) {
    }
}
