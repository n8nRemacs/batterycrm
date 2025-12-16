package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import j.N;
import java.util.WeakHashMap;

/* compiled from: AutoScrollHelper.java */
/* renamed from: androidx.core.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC22847a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f45133r = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public final C1760a f45134b;

    /* renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f45135c;

    /* renamed from: d, reason: collision with root package name */
    public final ListView f45136d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f45137e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f45138f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f45139g;

    /* renamed from: h, reason: collision with root package name */
    public final int f45140h;

    /* renamed from: i, reason: collision with root package name */
    public final int f45141i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f45142j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f45143k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f45144l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45145m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45146n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f45147o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45148p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45149q;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    public static class C1760a {

        /* renamed from: a, reason: collision with root package name */
        public int f45150a;

        /* renamed from: b, reason: collision with root package name */
        public int f45151b;

        /* renamed from: c, reason: collision with root package name */
        public float f45152c;

        /* renamed from: d, reason: collision with root package name */
        public float f45153d;

        /* renamed from: h, reason: collision with root package name */
        public float f45157h;

        /* renamed from: i, reason: collision with root package name */
        public int f45158i;

        /* renamed from: e, reason: collision with root package name */
        public long f45154e = Long.MIN_VALUE;

        /* renamed from: g, reason: collision with root package name */
        public long f45156g = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f45155f = 0;

        public final float a(long j12) {
            if (j12 < this.f45154e) {
                return 0.0f;
            }
            long j13 = this.f45156g;
            if (j13 < 0 || j12 < j13) {
                return AbstractViewOnTouchListenerC22847a.c((j12 - r0) / this.f45150a, 0.0f, 1.0f) * 0.5f;
            }
            float f12 = this.f45157h;
            return (AbstractViewOnTouchListenerC22847a.c((j12 - j13) / this.f45158i, 0.0f, 1.0f) * f12) + (1.0f - f12);
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC22847a abstractViewOnTouchListenerC22847a = AbstractViewOnTouchListenerC22847a.this;
            if (abstractViewOnTouchListenerC22847a.f45148p) {
                boolean z12 = abstractViewOnTouchListenerC22847a.f45146n;
                C1760a c1760a = abstractViewOnTouchListenerC22847a.f45134b;
                if (z12) {
                    abstractViewOnTouchListenerC22847a.f45146n = false;
                    c1760a.getClass();
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c1760a.f45154e = jCurrentAnimationTimeMillis;
                    c1760a.f45156g = -1L;
                    c1760a.f45155f = jCurrentAnimationTimeMillis;
                    c1760a.f45157h = 0.5f;
                }
                if ((c1760a.f45156g > 0 && AnimationUtils.currentAnimationTimeMillis() > c1760a.f45156g + c1760a.f45158i) || !abstractViewOnTouchListenerC22847a.g()) {
                    abstractViewOnTouchListenerC22847a.f45148p = false;
                    return;
                }
                boolean z13 = abstractViewOnTouchListenerC22847a.f45147o;
                ListView listView = abstractViewOnTouchListenerC22847a.f45136d;
                if (z13) {
                    abstractViewOnTouchListenerC22847a.f45147o = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c1760a.f45155f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA2 = c1760a.a(jCurrentAnimationTimeMillis2);
                long j12 = jCurrentAnimationTimeMillis2 - c1760a.f45155f;
                c1760a.f45155f = jCurrentAnimationTimeMillis2;
                abstractViewOnTouchListenerC22847a.f((int) (j12 * ((fA2 * 4.0f) + ((-4.0f) * fA2 * fA2)) * c1760a.f45153d));
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                listView.postOnAnimation(this);
            }
        }
    }

    public AbstractViewOnTouchListenerC22847a(@N ListView listView) {
        C1760a c1760a = new C1760a();
        this.f45134b = c1760a;
        this.f45135c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f45138f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f45139g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f45142j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f45143k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f45144l = fArr5;
        this.f45136d = listView;
        float f12 = Resources.getSystem().getDisplayMetrics().density;
        float f13 = ((int) ((1575.0f * f12) + 0.5f)) / 1000.0f;
        fArr5[0] = f13;
        fArr5[1] = f13;
        float f14 = ((int) ((f12 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f14;
        fArr4[1] = f14;
        this.f45140h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f45141i = f45133r;
        c1760a.f45150a = 500;
        c1760a.f45151b = 500;
    }

    public static float c(float f12, float f13, float f14) {
        return f12 > f14 ? f14 : f12 < f13 ? f13 : f12;
    }

    public abstract boolean a(int i12);

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f45138f
            r0 = r0[r7]
            float[] r1 = r3.f45139g
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = c(r0, r2, r1)
            float r1 = r3.d(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.d(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f45135c
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = c(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f45142j
            r0 = r0[r7]
            float[] r1 = r3.f45143k
            r1 = r1[r7]
            float[] r2 = r3.f45144l
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = c(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = c(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC22847a.b(float, float, float, int):float");
    }

    public final float d(float f12, float f13) {
        if (f13 == 0.0f) {
            return 0.0f;
        }
        int i12 = this.f45140h;
        if (i12 == 0 || i12 == 1) {
            if (f12 < f13) {
                if (f12 >= 0.0f) {
                    return 1.0f - (f12 / f13);
                }
                if (this.f45148p && i12 == 1) {
                    return 1.0f;
                }
            }
        } else if (i12 == 2 && f12 < 0.0f) {
            return f12 / (-f13);
        }
        return 0.0f;
    }

    public final void e() {
        int i12 = 0;
        if (this.f45146n) {
            this.f45148p = false;
            return;
        }
        C1760a c1760a = this.f45134b;
        c1760a.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i13 = (int) (jCurrentAnimationTimeMillis - c1760a.f45154e);
        int i14 = c1760a.f45151b;
        if (i13 > i14) {
            i12 = i14;
        } else if (i13 >= 0) {
            i12 = i13;
        }
        c1760a.f45158i = i12;
        c1760a.f45157h = c1760a.a(jCurrentAnimationTimeMillis);
        c1760a.f45156g = jCurrentAnimationTimeMillis;
    }

    public abstract void f(int i12);

    public final boolean g() {
        C1760a c1760a = this.f45134b;
        float f12 = c1760a.f45153d;
        int iAbs = (int) (f12 / Math.abs(f12));
        Math.abs(c1760a.f45152c);
        return iAbs != 0 && a(iAbs);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f45149q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7d
        L16:
            r7.e()
            goto L7d
        L1a:
            r7.f45147o = r2
            r7.f45145m = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f45136d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.b(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.b(r9, r8, r3, r2)
            androidx.core.widget.a$a r9 = r7.f45134b
            r9.f45152c = r0
            r9.f45153d = r8
            boolean r8 = r7.f45148p
            if (r8 != 0) goto L7d
            boolean r8 = r7.g()
            if (r8 == 0) goto L7d
            java.lang.Runnable r8 = r7.f45137e
            if (r8 != 0) goto L5f
            androidx.core.widget.a$b r8 = new androidx.core.widget.a$b
            r8.<init>()
            r7.f45137e = r8
        L5f:
            r7.f45148p = r2
            r7.f45146n = r2
            boolean r8 = r7.f45145m
            if (r8 != 0) goto L74
            int r8 = r7.f45141i
            if (r8 <= 0) goto L74
            java.lang.Runnable r9 = r7.f45137e
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r8 = androidx.core.view.C22823h0.f45055a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L74:
            java.lang.Runnable r8 = r7.f45137e
            androidx.core.widget.a$b r8 = (androidx.core.widget.AbstractViewOnTouchListenerC22847a.b) r8
            r8.run()
        L7b:
            r7.f45145m = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC22847a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
