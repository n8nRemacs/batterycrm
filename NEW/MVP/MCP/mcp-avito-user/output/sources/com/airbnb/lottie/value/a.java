package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C27291k;
import j.P;

/* compiled from: Keyframe.java */
/* loaded from: classes10.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final C27291k f60133a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final T f60134b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public T f60135c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Interpolator f60136d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final Interpolator f60137e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final Interpolator f60138f;

    /* renamed from: g, reason: collision with root package name */
    public final float f60139g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Float f60140h;

    /* renamed from: i, reason: collision with root package name */
    public float f60141i;

    /* renamed from: j, reason: collision with root package name */
    public float f60142j;

    /* renamed from: k, reason: collision with root package name */
    public int f60143k;

    /* renamed from: l, reason: collision with root package name */
    public int f60144l;

    /* renamed from: m, reason: collision with root package name */
    public float f60145m;

    /* renamed from: n, reason: collision with root package name */
    public float f60146n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f60147o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f60148p;

    public a(C27291k c27291k, @P T t12, @P T t13, @P Interpolator interpolator, float f12, @P Float f13) {
        this.f60141i = -3987645.8f;
        this.f60142j = -3987645.8f;
        this.f60143k = 784923401;
        this.f60144l = 784923401;
        this.f60145m = Float.MIN_VALUE;
        this.f60146n = Float.MIN_VALUE;
        this.f60147o = null;
        this.f60148p = null;
        this.f60133a = c27291k;
        this.f60134b = t12;
        this.f60135c = t13;
        this.f60136d = interpolator;
        this.f60137e = null;
        this.f60138f = null;
        this.f60139g = f12;
        this.f60140h = f13;
    }

    public final float a() {
        if (this.f60133a == null) {
            return 1.0f;
        }
        if (this.f60146n == Float.MIN_VALUE) {
            if (this.f60140h == null) {
                this.f60146n = 1.0f;
            } else {
                this.f60146n = (float) (b() + ((this.f60140h.floatValue() - this.f60139g) / (r1.f59594m - r1.f59593l)));
            }
        }
        return this.f60146n;
    }

    public final float b() {
        C27291k c27291k = this.f60133a;
        if (c27291k == null) {
            return 0.0f;
        }
        if (this.f60145m == Float.MIN_VALUE) {
            float f12 = c27291k.f59593l;
            this.f60145m = (this.f60139g - f12) / (c27291k.f59594m - f12);
        }
        return this.f60145m;
    }

    public final boolean c() {
        return this.f60136d == null && this.f60137e == null && this.f60138f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f60134b + ", endValue=" + this.f60135c + ", startFrame=" + this.f60139g + ", endFrame=" + this.f60140h + ", interpolator=" + this.f60136d + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(C27291k c27291k, @P Object obj, @P Object obj2, @P Interpolator interpolator, @P Interpolator interpolator2, float f12) {
        this.f60141i = -3987645.8f;
        this.f60142j = -3987645.8f;
        this.f60143k = 784923401;
        this.f60144l = 784923401;
        this.f60145m = Float.MIN_VALUE;
        this.f60146n = Float.MIN_VALUE;
        this.f60147o = null;
        this.f60148p = null;
        this.f60133a = c27291k;
        this.f60134b = obj;
        this.f60135c = obj2;
        this.f60136d = null;
        this.f60137e = interpolator;
        this.f60138f = interpolator2;
        this.f60139g = f12;
        this.f60140h = null;
    }

    public a(C27291k c27291k, @P T t12, @P T t13, @P Interpolator interpolator, @P Interpolator interpolator2, @P Interpolator interpolator3, float f12, @P Float f13) {
        this.f60141i = -3987645.8f;
        this.f60142j = -3987645.8f;
        this.f60143k = 784923401;
        this.f60144l = 784923401;
        this.f60145m = Float.MIN_VALUE;
        this.f60146n = Float.MIN_VALUE;
        this.f60147o = null;
        this.f60148p = null;
        this.f60133a = c27291k;
        this.f60134b = t12;
        this.f60135c = t13;
        this.f60136d = interpolator;
        this.f60137e = interpolator2;
        this.f60138f = interpolator3;
        this.f60139g = f12;
        this.f60140h = f13;
    }

    public a(T t12) {
        this.f60141i = -3987645.8f;
        this.f60142j = -3987645.8f;
        this.f60143k = 784923401;
        this.f60144l = 784923401;
        this.f60145m = Float.MIN_VALUE;
        this.f60146n = Float.MIN_VALUE;
        this.f60147o = null;
        this.f60148p = null;
        this.f60133a = null;
        this.f60134b = t12;
        this.f60135c = t12;
        this.f60136d = null;
        this.f60137e = null;
        this.f60138f = null;
        this.f60139g = Float.MIN_VALUE;
        this.f60140h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.airbnb.lottie.model.content.d dVar, com.airbnb.lottie.model.content.d dVar2) {
        this.f60141i = -3987645.8f;
        this.f60142j = -3987645.8f;
        this.f60143k = 784923401;
        this.f60144l = 784923401;
        this.f60145m = Float.MIN_VALUE;
        this.f60146n = Float.MIN_VALUE;
        this.f60147o = null;
        this.f60148p = null;
        this.f60133a = null;
        this.f60134b = dVar;
        this.f60135c = dVar2;
        this.f60136d = null;
        this.f60137e = null;
        this.f60138f = null;
        this.f60139g = Float.MIN_VALUE;
        this.f60140h = Float.valueOf(Float.MAX_VALUE);
    }
}
