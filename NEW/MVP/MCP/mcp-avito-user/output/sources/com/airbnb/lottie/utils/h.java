package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.C27291k;
import j.InterfaceC42167x;
import j.K;
import j.P;
import j.k0;
import java.util.Iterator;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes10.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* renamed from: m, reason: collision with root package name */
    @P
    public C27291k f60118m;

    /* renamed from: e, reason: collision with root package name */
    public float f60110e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60111f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f60112g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f60113h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f60114i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f60115j = 0;

    /* renamed from: k, reason: collision with root package name */
    public float f60116k = -2.1474836E9f;

    /* renamed from: l, reason: collision with root package name */
    public float f60117l = 2.1474836E9f;

    /* renamed from: n, reason: collision with root package name */
    @k0
    public boolean f60119n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f60120o = false;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @K
    public final void cancel() {
        Iterator it = this.f60093c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(l());
        m(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j12) {
        boolean z12 = false;
        if (this.f60119n) {
            m(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        if (this.f60118m == null || !this.f60119n) {
            return;
        }
        if (C27285e.f59567a) {
            C27285e.a("LottieValueAnimator#doFrame");
        }
        long j13 = this.f60112g;
        long j14 = j13 != 0 ? j12 - j13 : 0L;
        C27291k c27291k = this.f60118m;
        float fAbs = j14 / (c27291k == null ? Float.MAX_VALUE : (1.0E9f / c27291k.f59595n) / Math.abs(this.f60110e));
        float f12 = this.f60113h;
        if (l()) {
            fAbs = -fAbs;
        }
        float f13 = f12 + fAbs;
        float fK2 = k();
        float fJ2 = j();
        PointF pointF = j.f60122a;
        if (f13 >= fK2 && f13 <= fJ2) {
            z12 = true;
        }
        float f14 = this.f60113h;
        float fB2 = j.b(f13, k(), j());
        this.f60113h = fB2;
        if (this.f60120o) {
            fB2 = (float) Math.floor(fB2);
        }
        this.f60114i = fB2;
        this.f60112g = j12;
        if (z12) {
            if (!this.f60120o || this.f60113h != f14) {
                e();
            }
        } else if (getRepeatCount() == -1 || this.f60115j < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f60111f = !this.f60111f;
                this.f60110e = -this.f60110e;
            } else {
                float fJ3 = l() ? j() : k();
                this.f60113h = fJ3;
                this.f60114i = fJ3;
            }
            this.f60112g = j12;
            if (!this.f60120o || this.f60113h != f14) {
                e();
            }
            Iterator it = this.f60093c.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f60115j++;
        } else {
            float fK3 = this.f60110e < 0.0f ? k() : j();
            this.f60113h = fK3;
            this.f60114i = fK3;
            m(true);
            if (!this.f60120o || this.f60113h != f14) {
                e();
            }
            a(l());
        }
        if (this.f60118m != null) {
            float f15 = this.f60114i;
            if (f15 < this.f60116k || f15 > this.f60117l) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f60116k), Float.valueOf(this.f60117l), Float.valueOf(this.f60114i)));
            }
        }
        if (C27285e.f59567a) {
            C27285e.b("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    @InterfaceC42167x
    public final float getAnimatedFraction() {
        float fK2;
        float fJ2;
        float fK3;
        if (this.f60118m == null) {
            return 0.0f;
        }
        if (l()) {
            fK2 = j() - this.f60114i;
            fJ2 = j();
            fK3 = k();
        } else {
            fK2 = this.f60114i - k();
            fJ2 = j();
            fK3 = k();
        }
        return fK2 / (fJ2 - fK3);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C27291k c27291k = this.f60118m;
        if (c27291k == null) {
            return 0L;
        }
        return (long) c27291k.b();
    }

    @InterfaceC42167x
    public final float i() {
        C27291k c27291k = this.f60118m;
        if (c27291k == null) {
            return 0.0f;
        }
        float f12 = this.f60114i;
        float f13 = c27291k.f59593l;
        return (f12 - f13) / (c27291k.f59594m - f13);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f60119n;
    }

    public final float j() {
        C27291k c27291k = this.f60118m;
        if (c27291k == null) {
            return 0.0f;
        }
        float f12 = this.f60117l;
        return f12 == 2.1474836E9f ? c27291k.f59594m : f12;
    }

    public final float k() {
        C27291k c27291k = this.f60118m;
        if (c27291k == null) {
            return 0.0f;
        }
        float f12 = this.f60116k;
        return f12 == -2.1474836E9f ? c27291k.f59593l : f12;
    }

    public final boolean l() {
        return this.f60110e < 0.0f;
    }

    @K
    public final void m(boolean z12) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z12) {
            this.f60119n = false;
        }
    }

    public final void n(float f12) {
        if (this.f60113h == f12) {
            return;
        }
        float fB2 = j.b(f12, k(), j());
        this.f60113h = fB2;
        if (this.f60120o) {
            fB2 = (float) Math.floor(fB2);
        }
        this.f60114i = fB2;
        this.f60112g = 0L;
        e();
    }

    public final void o(float f12, float f13) {
        if (f12 > f13) {
            throw new IllegalArgumentException("minFrame (" + f12 + ") must be <= maxFrame (" + f13 + ")");
        }
        C27291k c27291k = this.f60118m;
        float f14 = c27291k == null ? -3.4028235E38f : c27291k.f59593l;
        float f15 = c27291k == null ? Float.MAX_VALUE : c27291k.f59594m;
        float fB2 = j.b(f12, f14, f15);
        float fB3 = j.b(f13, f14, f15);
        if (fB2 == this.f60116k && fB3 == this.f60117l) {
            return;
        }
        this.f60116k = fB2;
        this.f60117l = fB3;
        n((int) j.b(this.f60114i, fB2, fB3));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i12) {
        super.setRepeatMode(i12);
        if (i12 == 2 || !this.f60111f) {
            return;
        }
        this.f60111f = false;
        this.f60110e = -this.f60110e;
    }
}
