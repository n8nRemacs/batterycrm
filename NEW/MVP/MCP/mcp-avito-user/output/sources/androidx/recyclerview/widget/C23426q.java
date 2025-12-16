package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import j.k0;
import java.util.WeakHashMap;

/* compiled from: FastScroller.java */
@k0
/* renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23426q extends RecyclerView.l implements RecyclerView.q {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f54095D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f54096E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public final ValueAnimator f54097A;

    /* renamed from: B, reason: collision with root package name */
    public int f54098B;

    /* renamed from: C, reason: collision with root package name */
    public final Runnable f54099C;

    /* renamed from: b, reason: collision with root package name */
    public final int f54100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54101c;

    /* renamed from: d, reason: collision with root package name */
    public final StateListDrawable f54102d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f54103e;

    /* renamed from: f, reason: collision with root package name */
    public final int f54104f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54105g;

    /* renamed from: h, reason: collision with root package name */
    public final StateListDrawable f54106h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f54107i;

    /* renamed from: j, reason: collision with root package name */
    public final int f54108j;

    /* renamed from: k, reason: collision with root package name */
    public final int f54109k;

    /* renamed from: l, reason: collision with root package name */
    @k0
    public int f54110l;

    /* renamed from: m, reason: collision with root package name */
    @k0
    public int f54111m;

    /* renamed from: n, reason: collision with root package name */
    @k0
    public float f54112n;

    /* renamed from: o, reason: collision with root package name */
    @k0
    public int f54113o;

    /* renamed from: p, reason: collision with root package name */
    @k0
    public int f54114p;

    /* renamed from: q, reason: collision with root package name */
    @k0
    public float f54115q;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f54118t;

    /* renamed from: r, reason: collision with root package name */
    public int f54116r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f54117s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f54119u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f54120v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f54121w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f54122x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f54123y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public final int[] f54124z = new int[2];

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.q$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23426q c23426q = C23426q.this;
            int i12 = c23426q.f54098B;
            ValueAnimator valueAnimator = c23426q.f54097A;
            if (i12 == 1) {
                valueAnimator.cancel();
            } else if (i12 != 2) {
                return;
            }
            c23426q.f54098B = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.q$b */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(RecyclerView recyclerView, int i12, int i13) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            C23426q c23426q = C23426q.this;
            int iComputeVerticalScrollRange = c23426q.f54118t.computeVerticalScrollRange();
            int i14 = c23426q.f54117s;
            int i15 = iComputeVerticalScrollRange - i14;
            int i16 = c23426q.f54100b;
            c23426q.f54119u = i15 > 0 && i14 >= i16;
            int iComputeHorizontalScrollRange = c23426q.f54118t.computeHorizontalScrollRange();
            int i17 = c23426q.f54116r;
            boolean z12 = iComputeHorizontalScrollRange - i17 > 0 && i17 >= i16;
            c23426q.f54120v = z12;
            boolean z13 = c23426q.f54119u;
            if (!z13 && !z12) {
                if (c23426q.f54121w != 0) {
                    c23426q.g(0);
                    return;
                }
                return;
            }
            if (z13) {
                float f12 = i14;
                c23426q.f54111m = (int) ((((f12 / 2.0f) + iComputeVerticalScrollOffset) * f12) / iComputeVerticalScrollRange);
                c23426q.f54110l = Math.min(i14, (i14 * i14) / iComputeVerticalScrollRange);
            }
            if (c23426q.f54120v) {
                float f13 = iComputeHorizontalScrollOffset;
                float f14 = i17;
                c23426q.f54114p = (int) ((((f14 / 2.0f) + f13) * f14) / iComputeHorizontalScrollRange);
                c23426q.f54113o = Math.min(i17, (i17 * i17) / iComputeHorizontalScrollRange);
            }
            int i18 = c23426q.f54121w;
            if (i18 == 0 || i18 == 1) {
                c23426q.g(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.q$c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f54127a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f54127a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f54127a) {
                this.f54127a = false;
                return;
            }
            C23426q c23426q = C23426q.this;
            if (((Float) c23426q.f54097A.getAnimatedValue()).floatValue() == 0.0f) {
                c23426q.f54098B = 0;
                c23426q.g(0);
            } else {
                c23426q.f54098B = 2;
                c23426q.f54118t.invalidate();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.q$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C23426q c23426q = C23426q.this;
            c23426q.f54102d.setAlpha(iFloatValue);
            c23426q.f54103e.setAlpha(iFloatValue);
            c23426q.f54118t.invalidate();
        }
    }

    public C23426q(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i12, int i13, int i14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f54097A = valueAnimatorOfFloat;
        this.f54098B = 0;
        a aVar = new a();
        this.f54099C = aVar;
        b bVar = new b();
        this.f54102d = stateListDrawable;
        this.f54103e = drawable;
        this.f54106h = stateListDrawable2;
        this.f54107i = drawable2;
        this.f54104f = Math.max(i12, stateListDrawable.getIntrinsicWidth());
        this.f54105g = Math.max(i12, drawable.getIntrinsicWidth());
        this.f54108j = Math.max(i12, stateListDrawable2.getIntrinsicWidth());
        this.f54109k = Math.max(i12, drawable2.getIntrinsicWidth());
        this.f54100b = i13;
        this.f54101c = i14;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f54118t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.r0(this);
            this.f54118t.u0(this);
            this.f54118t.v0(bVar);
            this.f54118t.removeCallbacks(aVar);
        }
        this.f54118t = recyclerView;
        if (recyclerView != null) {
            recyclerView.l(this, -1);
            this.f54118t.n(this);
            this.f54118t.o(bVar);
        }
    }

    public static int f(float f12, float f13, int[] iArr, int i12, int i13, int i14) {
        int i15 = iArr[1] - iArr[0];
        if (i15 == 0) {
            return 0;
        }
        int i16 = i12 - i14;
        int i17 = (int) (((f13 - f12) / i15) * i16);
        int i18 = i13 + i17;
        if (i18 >= i16 || i18 < 0) {
            return 0;
        }
        return i17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean b(@j.N RecyclerView recyclerView, @j.N MotionEvent motionEvent) {
        int i12 = this.f54121w;
        if (i12 == 1) {
            boolean zE2 = e(motionEvent.getX(), motionEvent.getY());
            boolean zC2 = c(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zE2 && !zC2) {
                return false;
            }
            if (zC2) {
                this.f54122x = 1;
                this.f54115q = (int) motionEvent.getX();
            } else if (zE2) {
                this.f54122x = 2;
                this.f54112n = (int) motionEvent.getY();
            }
            g(2);
        } else if (i12 != 2) {
            return false;
        }
        return true;
    }

    @k0
    public final boolean c(float f12, float f13) {
        if (f13 >= this.f54117s - this.f54108j) {
            int i12 = this.f54114p;
            int i13 = this.f54113o;
            if (f12 >= i12 - (i13 / 2) && f12 <= (i13 / 2) + i12) {
                return true;
            }
        }
        return false;
    }

    @k0
    public final boolean e(float f12, float f13) {
        RecyclerView recyclerView = this.f54118t;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z12 = recyclerView.getLayoutDirection() == 1;
        int i12 = this.f54104f;
        if (z12) {
            if (f12 > i12) {
                return false;
            }
        } else if (f12 < this.f54116r - i12) {
            return false;
        }
        int i13 = this.f54111m;
        int i14 = this.f54110l / 2;
        return f13 >= ((float) (i13 - i14)) && f13 <= ((float) (i14 + i13));
    }

    public final void g(int i12) {
        Runnable runnable = this.f54099C;
        StateListDrawable stateListDrawable = this.f54102d;
        if (i12 == 2 && this.f54121w != 2) {
            stateListDrawable.setState(f54095D);
            this.f54118t.removeCallbacks(runnable);
        }
        if (i12 == 0) {
            this.f54118t.invalidate();
        } else {
            h();
        }
        if (this.f54121w == 2 && i12 != 2) {
            stateListDrawable.setState(f54096E);
            this.f54118t.removeCallbacks(runnable);
            this.f54118t.postDelayed(runnable, 1200);
        } else if (i12 == 1) {
            this.f54118t.removeCallbacks(runnable);
            this.f54118t.postDelayed(runnable, 1500);
        }
        this.f54121w = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g2(@j.N MotionEvent motionEvent) {
        if (this.f54121w == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zE2 = e(motionEvent.getX(), motionEvent.getY());
            boolean zC2 = c(motionEvent.getX(), motionEvent.getY());
            if (zE2 || zC2) {
                if (zC2) {
                    this.f54122x = 1;
                    this.f54115q = (int) motionEvent.getX();
                } else if (zE2) {
                    this.f54122x = 2;
                    this.f54112n = (int) motionEvent.getY();
                }
                g(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f54121w == 2) {
            this.f54112n = 0.0f;
            this.f54115q = 0.0f;
            g(1);
            this.f54122x = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f54121w == 2) {
            h();
            int i12 = this.f54122x;
            int i13 = this.f54101c;
            if (i12 == 1) {
                float x12 = motionEvent.getX();
                int[] iArr = this.f54124z;
                iArr[0] = i13;
                int i14 = this.f54116r - i13;
                iArr[1] = i14;
                float fMax = Math.max(i13, Math.min(i14, x12));
                if (Math.abs(this.f54114p - fMax) >= 2.0f) {
                    int iF2 = f(this.f54115q, fMax, iArr, this.f54118t.computeHorizontalScrollRange(), this.f54118t.computeHorizontalScrollOffset(), this.f54116r);
                    if (iF2 != 0) {
                        this.f54118t.scrollBy(iF2, 0);
                    }
                    this.f54115q = fMax;
                }
            }
            if (this.f54122x == 2) {
                float y12 = motionEvent.getY();
                int[] iArr2 = this.f54123y;
                iArr2[0] = i13;
                int i15 = this.f54117s - i13;
                iArr2[1] = i15;
                float fMax2 = Math.max(i13, Math.min(i15, y12));
                if (Math.abs(this.f54111m - fMax2) < 2.0f) {
                    return;
                }
                int iF3 = f(this.f54112n, fMax2, iArr2, this.f54118t.computeVerticalScrollRange(), this.f54118t.computeVerticalScrollOffset(), this.f54117s);
                if (iF3 != 0) {
                    this.f54118t.scrollBy(0, iF3);
                }
                this.f54112n = fMax2;
            }
        }
    }

    public final void h() {
        int i12 = this.f54098B;
        ValueAnimator valueAnimator = this.f54097A;
        if (i12 != 0) {
            if (i12 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f54098B = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i12 = this.f54116r;
        RecyclerView recyclerView2 = this.f54118t;
        if (i12 != recyclerView2.getWidth() || this.f54117s != recyclerView2.getHeight()) {
            this.f54116r = recyclerView2.getWidth();
            this.f54117s = recyclerView2.getHeight();
            g(0);
            return;
        }
        if (this.f54098B != 0) {
            if (this.f54119u) {
                int i13 = this.f54116r;
                int i14 = this.f54104f;
                int i15 = i13 - i14;
                int i16 = this.f54111m;
                int i17 = this.f54110l;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable = this.f54102d;
                stateListDrawable.setBounds(0, 0, i14, i17);
                int i19 = this.f54117s;
                int i22 = this.f54105g;
                Drawable drawable = this.f54103e;
                drawable.setBounds(0, 0, i22, i19);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i14, i18);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i14, -i18);
                } else {
                    canvas.translate(i15, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i18);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i15, -i18);
                }
            }
            if (this.f54120v) {
                int i23 = this.f54117s;
                int i24 = this.f54108j;
                int i25 = i23 - i24;
                int i26 = this.f54114p;
                int i27 = this.f54113o;
                int i28 = i26 - (i27 / 2);
                StateListDrawable stateListDrawable2 = this.f54106h;
                stateListDrawable2.setBounds(0, 0, i27, i24);
                int i29 = this.f54116r;
                int i32 = this.f54109k;
                Drawable drawable2 = this.f54107i;
                drawable2.setBounds(0, 0, i29, i32);
                canvas.translate(0.0f, i25);
                drawable2.draw(canvas);
                canvas.translate(i28, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i28, -i25);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(boolean z12) {
    }
}
