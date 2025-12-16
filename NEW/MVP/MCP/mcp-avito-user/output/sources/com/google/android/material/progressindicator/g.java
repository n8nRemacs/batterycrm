package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.b;
import j.N;
import lY0.C43709d;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes6.dex */
final class g extends n<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f356919l = {0, 1350, 2700, 4050};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f356920m = {667, 2017, 3367, 4717};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f356921n = {1000, 2350, 3700, 5050};

    /* renamed from: o, reason: collision with root package name */
    public static final Property<g, Float> f356922o = new a(Float.class, "animationFraction");

    /* renamed from: p, reason: collision with root package name */
    public static final Property<g, Float> f356923p = new b(Float.class, "completeEndFraction");

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f356924d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f356925e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.interpolator.view.animation.b f356926f;

    /* renamed from: g, reason: collision with root package name */
    public final h f356927g;

    /* renamed from: h, reason: collision with root package name */
    public int f356928h;

    /* renamed from: i, reason: collision with root package name */
    public float f356929i;

    /* renamed from: j, reason: collision with root package name */
    public float f356930j;

    /* renamed from: k, reason: collision with root package name */
    public b.a f356931k;

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class a extends Property<g, Float> {
        @Override // android.util.Property
        public final Float get(g gVar) {
            return Float.valueOf(gVar.f356929i);
        }

        @Override // android.util.Property
        public final void set(g gVar, Float f12) {
            androidx.interpolator.view.animation.b bVar;
            g gVar2 = gVar;
            float fFloatValue = f12.floatValue();
            gVar2.f356929i = fFloatValue;
            int i12 = (int) (5400.0f * fFloatValue);
            float f13 = fFloatValue * 1520.0f;
            float[] fArr = gVar2.f356957b;
            fArr[0] = (-20.0f) + f13;
            fArr[1] = f13;
            int i13 = 0;
            while (true) {
                bVar = gVar2.f356926f;
                if (i13 >= 4) {
                    break;
                }
                float f14 = 667;
                fArr[1] = (bVar.getInterpolation((i12 - g.f356919l[i13]) / f14) * 250.0f) + fArr[1];
                fArr[0] = (bVar.getInterpolation((i12 - g.f356920m[i13]) / f14) * 250.0f) + fArr[0];
                i13++;
            }
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = ((f16 - f15) * gVar2.f356930j) + f15;
            fArr[0] = f17;
            fArr[0] = f17 / 360.0f;
            fArr[1] = f16 / 360.0f;
            int i14 = 0;
            while (true) {
                if (i14 >= 4) {
                    break;
                }
                float f18 = (i12 - g.f356921n[i14]) / 333;
                if (f18 >= 0.0f && f18 <= 1.0f) {
                    int i15 = i14 + gVar2.f356928h;
                    h hVar = gVar2.f356927g;
                    int[] iArr = hVar.f356909c;
                    int length = i15 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int iA2 = com.google.android.material.color.k.a(iArr[length], gVar2.f356956a.f356953k);
                    int iA3 = com.google.android.material.color.k.a(hVar.f356909c[length2], gVar2.f356956a.f356953k);
                    float interpolation = bVar.getInterpolation(f18);
                    C43709d c43709d = C43709d.f413884a;
                    Integer numValueOf = Integer.valueOf(iA2);
                    Integer numValueOf2 = Integer.valueOf(iA3);
                    c43709d.getClass();
                    gVar2.f356958c[0] = C43709d.a(interpolation, numValueOf, numValueOf2).intValue();
                    break;
                }
                i14++;
            }
            gVar2.f356956a.invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class b extends Property<g, Float> {
        @Override // android.util.Property
        public final Float get(g gVar) {
            return Float.valueOf(gVar.f356930j);
        }

        @Override // android.util.Property
        public final void set(g gVar, Float f12) {
            gVar.f356930j = f12.floatValue();
        }
    }

    public g(@N h hVar) {
        super(1);
        this.f356928h = 0;
        this.f356931k = null;
        this.f356927g = hVar;
        this.f356926f = new androidx.interpolator.view.animation.b();
    }

    @Override // com.google.android.material.progressindicator.n
    public final void a() {
        ObjectAnimator objectAnimator = this.f356924d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.n
    public final void b() {
        this.f356928h = 0;
        this.f356958c[0] = com.google.android.material.color.k.a(this.f356927g.f356909c[0], this.f356956a.f356953k);
        this.f356930j = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.n
    public final void c(@N b.a aVar) {
        this.f356931k = aVar;
    }

    @Override // com.google.android.material.progressindicator.n
    public final void d() {
        ObjectAnimator objectAnimator = this.f356925e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f356956a.isVisible()) {
            this.f356925e.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.n
    public final void e() {
        if (this.f356924d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f356922o, 0.0f, 1.0f);
            this.f356924d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f356924d.setInterpolator(null);
            this.f356924d.setRepeatCount(-1);
            this.f356924d.addListener(new e(this));
        }
        if (this.f356925e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f356923p, 0.0f, 1.0f);
            this.f356925e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f356925e.setInterpolator(this.f356926f);
            this.f356925e.addListener(new f(this));
        }
        this.f356928h = 0;
        this.f356958c[0] = com.google.android.material.color.k.a(this.f356927g.f356909c[0], this.f356956a.f356953k);
        this.f356930j = 0.0f;
        this.f356924d.start();
    }

    @Override // com.google.android.material.progressindicator.n
    public final void f() {
        this.f356931k = null;
    }
}
