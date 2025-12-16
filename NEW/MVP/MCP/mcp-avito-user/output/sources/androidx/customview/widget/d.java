package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import j.N;
import j.P;
import j.U;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: x, reason: collision with root package name */
    public static final Interpolator f45374x = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f45375a;

    /* renamed from: b, reason: collision with root package name */
    public int f45376b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f45378d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f45379e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f45380f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f45381g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f45382h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f45383i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f45384j;

    /* renamed from: k, reason: collision with root package name */
    public int f45385k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f45386l;

    /* renamed from: m, reason: collision with root package name */
    public final float f45387m;

    /* renamed from: n, reason: collision with root package name */
    public float f45388n;

    /* renamed from: o, reason: collision with root package name */
    public int f45389o;

    /* renamed from: p, reason: collision with root package name */
    public final int f45390p;

    /* renamed from: q, reason: collision with root package name */
    public int f45391q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f45392r;

    /* renamed from: s, reason: collision with root package name */
    public final c f45393s;

    /* renamed from: t, reason: collision with root package name */
    public View f45394t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f45395u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f45396v;

    /* renamed from: c, reason: collision with root package name */
    public int f45377c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f45397w = new b();

    /* compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f12) {
            float f13 = f12 - 1.0f;
            return (f13 * f13 * f13 * f13 * f13) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.q(0);
        }
    }

    public d(@N Context context, @N ViewGroup viewGroup, @N c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f45396v = viewGroup;
        this.f45393s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i12 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f45390p = i12;
        this.f45389o = i12;
        this.f45376b = viewConfiguration.getScaledTouchSlop();
        this.f45387m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f45388n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f45392r = new OverScroller(context, f45374x);
    }

    public static boolean k(@P View view, int i12, int i13) {
        return view != null && i12 >= view.getLeft() && i12 < view.getRight() && i13 >= view.getTop() && i13 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f45375a == 2) {
            OverScroller overScroller = this.f45392r;
            int currX = overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            View view = this.f45394t;
            this.f45393s.i(currX2, currY, currX2 - currX, view);
        }
        q(0);
    }

    public final void b() {
        this.f45377c = -1;
        float[] fArr = this.f45378d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f45379e, 0.0f);
            Arrays.fill(this.f45380f, 0.0f);
            Arrays.fill(this.f45381g, 0.0f);
            Arrays.fill(this.f45382h, 0);
            Arrays.fill(this.f45383i, 0);
            Arrays.fill(this.f45384j, 0);
            this.f45385k = 0;
        }
        VelocityTracker velocityTracker = this.f45386l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f45386l = null;
        }
    }

    public final void c(@N View view, int i12) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f45396v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f45394t = view;
        this.f45377c = i12;
        this.f45393s.g(view, i12);
        q(1);
    }

    public final boolean d(float f12, float f13, int i12, int i13) {
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        if ((this.f45382h[i12] & i13) != i13 || (this.f45391q & i13) == 0 || (this.f45384j[i12] & i13) == i13 || (this.f45383i[i12] & i13) == i13) {
            return false;
        }
        float f14 = this.f45376b;
        if (fAbs <= f14 && fAbs2 <= f14) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f45393s.getClass();
        }
        return (this.f45383i[i12] & i13) == 0 && fAbs > ((float) this.f45376b);
    }

    public final boolean e(View view, float f12, float f13) {
        if (view == null) {
            return false;
        }
        c cVar = this.f45393s;
        boolean z12 = cVar.c(view) > 0;
        boolean z13 = cVar.d() > 0;
        if (!z12 || !z13) {
            return z12 ? Math.abs(f12) > ((float) this.f45376b) : z13 && Math.abs(f13) > ((float) this.f45376b);
        }
        float f14 = (f13 * f13) + (f12 * f12);
        int i12 = this.f45376b;
        return f14 > ((float) (i12 * i12));
    }

    public final void f(int i12) {
        float[] fArr = this.f45378d;
        if (fArr != null) {
            int i13 = this.f45385k;
            int i14 = 1 << i12;
            if ((i13 & i14) != 0) {
                fArr[i12] = 0.0f;
                this.f45379e[i12] = 0.0f;
                this.f45380f[i12] = 0.0f;
                this.f45381g[i12] = 0.0f;
                this.f45382h[i12] = 0;
                this.f45383i[i12] = 0;
                this.f45384j[i12] = 0;
                this.f45385k = (~i14) & i13;
            }
        }
    }

    public final int g(int i12, int i13, int i14) {
        if (i12 == 0) {
            return 0;
        }
        float width = this.f45396v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i12) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i13);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i12) / i14) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f45375a == 2) {
            OverScroller overScroller = this.f45392r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f45394t.getLeft();
            int top = currY - this.f45394t.getTop();
            if (left != 0) {
                View view = this.f45394t;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f45394t;
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f45393s.i(currX, currY, left, this.f45394t);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f45396v.post(this.f45397w);
            }
        }
        return this.f45375a == 2;
    }

    @P
    public final View i(int i12, int i13) {
        ViewGroup viewGroup = this.f45396v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f45393s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && i13 >= childAt.getTop() && i13 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i12, int i13, int i14, int i15) {
        float f12;
        float f13;
        float f14;
        float f15;
        int left = this.f45394t.getLeft();
        int top = this.f45394t.getTop();
        int i16 = i12 - left;
        int i17 = i13 - top;
        OverScroller overScroller = this.f45392r;
        int i18 = 0;
        if (i16 == 0 && i17 == 0) {
            overScroller.abortAnimation();
            q(0);
            return false;
        }
        View view = this.f45394t;
        int i19 = (int) this.f45388n;
        int i22 = (int) this.f45387m;
        int iAbs = Math.abs(i14);
        if (iAbs < i19) {
            i14 = 0;
        } else if (iAbs > i22) {
            i14 = i14 > 0 ? i22 : -i22;
        }
        int i23 = (int) this.f45388n;
        int iAbs2 = Math.abs(i15);
        if (iAbs2 < i23) {
            i15 = i18;
        } else if (iAbs2 > i22) {
            if (i15 > 0) {
                i15 = i22;
            } else {
                i18 = -i22;
                i15 = i18;
            }
        }
        int iAbs3 = Math.abs(i16);
        int iAbs4 = Math.abs(i17);
        int iAbs5 = Math.abs(i14);
        int iAbs6 = Math.abs(i15);
        int i24 = iAbs5 + iAbs6;
        int i25 = iAbs3 + iAbs4;
        if (i14 != 0) {
            f12 = iAbs5;
            f13 = i24;
        } else {
            f12 = iAbs3;
            f13 = i25;
        }
        float f16 = f12 / f13;
        if (i15 != 0) {
            f14 = iAbs6;
            f15 = i24;
        } else {
            f14 = iAbs4;
            f15 = i25;
        }
        float f17 = f14 / f15;
        c cVar = this.f45393s;
        overScroller.startScroll(left, top, i16, i17, (int) ((g(i17, i15, cVar.d()) * f17) + (g(i16, i14, cVar.c(view)) * f16)));
        q(2);
        return true;
    }

    public final void l(@N MotionEvent motionEvent) {
        int i12;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f45386l == null) {
            this.f45386l = VelocityTracker.obtain();
        }
        this.f45386l.addMovement(motionEvent);
        c cVar = this.f45393s;
        int i13 = 0;
        if (actionMasked == 0) {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewI = i((int) x12, (int) y12);
            o(x12, y12, pointerId);
            u(viewI, pointerId);
            if ((this.f45382h[pointerId] & this.f45391q) != 0) {
                cVar.f(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f45375a == 1) {
                m();
            }
            b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f45375a == 1) {
                    this.f45395u = true;
                    cVar.j(this.f45394t, 0.0f, 0.0f);
                    this.f45395u = false;
                    if (this.f45375a == 1) {
                        q(0);
                    }
                }
                b();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x13 = motionEvent.getX(actionIndex);
                float y13 = motionEvent.getY(actionIndex);
                o(x13, y13, pointerId2);
                if (this.f45375a != 0) {
                    if (k(this.f45394t, (int) x13, (int) y13)) {
                        u(this.f45394t, pointerId2);
                        return;
                    }
                    return;
                } else {
                    u(i((int) x13, (int) y13), pointerId2);
                    if ((this.f45382h[pointerId2] & this.f45391q) != 0) {
                        cVar.f(pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f45375a == 1 && pointerId3 == this.f45377c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i13 >= pointerCount) {
                        i12 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i13);
                    if (pointerId4 != this.f45377c) {
                        View viewI2 = i((int) motionEvent.getX(i13), (int) motionEvent.getY(i13));
                        View view = this.f45394t;
                        if (viewI2 == view && u(view, pointerId4)) {
                            i12 = this.f45377c;
                            break;
                        }
                    }
                    i13++;
                }
                if (i12 == -1) {
                    m();
                }
            }
            f(pointerId3);
            return;
        }
        if (this.f45375a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i14 = 0; i14 < pointerCount2; i14++) {
                int pointerId5 = motionEvent.getPointerId(i14);
                if ((this.f45385k & (1 << pointerId5)) != 0) {
                    float x14 = motionEvent.getX(i14);
                    float y14 = motionEvent.getY(i14);
                    float f12 = x14 - this.f45378d[pointerId5];
                    float f13 = y14 - this.f45379e[pointerId5];
                    n(f12, f13, pointerId5);
                    if (this.f45375a == 1) {
                        break;
                    }
                    View viewI3 = i((int) x14, (int) y14);
                    if (e(viewI3, f12, f13) && u(viewI3, pointerId5)) {
                        break;
                    }
                }
            }
            p(motionEvent);
            return;
        }
        int i15 = this.f45377c;
        if ((this.f45385k & (1 << i15)) != 0) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i15);
            float x15 = motionEvent.getX(iFindPointerIndex);
            float y15 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f45380f;
            int i16 = this.f45377c;
            int i17 = (int) (x15 - fArr[i16]);
            int i18 = (int) (y15 - this.f45381g[i16]);
            int left = this.f45394t.getLeft() + i17;
            int top = this.f45394t.getTop() + i18;
            int left2 = this.f45394t.getLeft();
            int top2 = this.f45394t.getTop();
            if (i17 != 0) {
                left = cVar.a(this.f45394t, left, i17);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                this.f45394t.offsetLeftAndRight(left - left2);
            }
            if (i18 != 0) {
                top = cVar.b(this.f45394t, top);
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                this.f45394t.offsetTopAndBottom(top - top2);
            }
            if (i17 != 0 || i18 != 0) {
                cVar.i(left, top, left - left2, this.f45394t);
            }
            p(motionEvent);
        }
    }

    public final void m() {
        VelocityTracker velocityTracker = this.f45386l;
        float f12 = this.f45387m;
        velocityTracker.computeCurrentVelocity(1000, f12);
        float xVelocity = this.f45386l.getXVelocity(this.f45377c);
        float f13 = this.f45388n;
        float fAbs = Math.abs(xVelocity);
        float f14 = 0.0f;
        if (fAbs < f13) {
            xVelocity = 0.0f;
        } else if (fAbs > f12) {
            xVelocity = xVelocity > 0.0f ? f12 : -f12;
        }
        float yVelocity = this.f45386l.getYVelocity(this.f45377c);
        float f15 = this.f45388n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f15) {
            if (fAbs2 > f12) {
                if (yVelocity <= 0.0f) {
                    f12 = -f12;
                }
                f14 = f12;
            } else {
                f14 = yVelocity;
            }
        }
        this.f45395u = true;
        this.f45393s.j(this.f45394t, xVelocity, f14);
        this.f45395u = false;
        if (this.f45375a == 1) {
            q(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.d$c] */
    public final void n(float f12, float f13, int i12) {
        boolean zD2 = d(f12, f13, i12, 1);
        boolean z12 = zD2;
        if (d(f13, f12, i12, 4)) {
            z12 = (zD2 ? 1 : 0) | 4;
        }
        boolean z13 = z12;
        if (d(f12, f13, i12, 2)) {
            z13 = (z12 ? 1 : 0) | 2;
        }
        ?? r02 = z13;
        if (d(f13, f12, i12, 8)) {
            r02 = (z13 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f45383i;
            iArr[i12] = iArr[i12] | r02;
            this.f45393s.e(r02, i12);
        }
    }

    public final void o(float f12, float f13, int i12) {
        float[] fArr = this.f45378d;
        if (fArr == null || fArr.length <= i12) {
            int i13 = i12 + 1;
            float[] fArr2 = new float[i13];
            float[] fArr3 = new float[i13];
            float[] fArr4 = new float[i13];
            float[] fArr5 = new float[i13];
            int[] iArr = new int[i13];
            int[] iArr2 = new int[i13];
            int[] iArr3 = new int[i13];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f45379e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f45380f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f45381g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f45382h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f45383i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f45384j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f45378d = fArr2;
            this.f45379e = fArr3;
            this.f45380f = fArr4;
            this.f45381g = fArr5;
            this.f45382h = iArr;
            this.f45383i = iArr2;
            this.f45384j = iArr3;
        }
        float[] fArr9 = this.f45378d;
        this.f45380f[i12] = f12;
        fArr9[i12] = f12;
        float[] fArr10 = this.f45379e;
        this.f45381g[i12] = f13;
        fArr10[i12] = f13;
        int[] iArr7 = this.f45382h;
        int i14 = (int) f12;
        int i15 = (int) f13;
        ViewGroup viewGroup = this.f45396v;
        int i16 = i14 < viewGroup.getLeft() + this.f45389o ? 1 : 0;
        if (i15 < viewGroup.getTop() + this.f45389o) {
            i16 |= 4;
        }
        if (i14 > viewGroup.getRight() - this.f45389o) {
            i16 |= 2;
        }
        if (i15 > viewGroup.getBottom() - this.f45389o) {
            i16 |= 8;
        }
        iArr7[i12] = i16;
        this.f45385k |= 1 << i12;
    }

    public final void p(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i12 = 0; i12 < pointerCount; i12++) {
            int pointerId = motionEvent.getPointerId(i12);
            if ((this.f45385k & (1 << pointerId)) != 0) {
                float x12 = motionEvent.getX(i12);
                float y12 = motionEvent.getY(i12);
                this.f45380f[pointerId] = x12;
                this.f45381g[pointerId] = y12;
            }
        }
    }

    public final void q(int i12) {
        this.f45396v.removeCallbacks(this.f45397w);
        if (this.f45375a != i12) {
            this.f45375a = i12;
            this.f45393s.h(i12);
            if (this.f45375a == 0) {
                this.f45394t = null;
            }
        }
    }

    public final boolean r(int i12, int i13) {
        if (this.f45395u) {
            return j(i12, i13, (int) this.f45386l.getXVelocity(this.f45377c), (int) this.f45386l.getYVelocity(this.f45377c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(@j.N android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.s(android.view.MotionEvent):boolean");
    }

    public final boolean t(@N View view, int i12, int i13) {
        this.f45394t = view;
        this.f45377c = -1;
        boolean zJ2 = j(i12, i13, 0, 0);
        if (!zJ2 && this.f45375a == 0 && this.f45394t != null) {
            this.f45394t = null;
        }
        return zJ2;
    }

    public final boolean u(View view, int i12) {
        if (view == this.f45394t && this.f45377c == i12) {
            return true;
        }
        if (view == null || !this.f45393s.k(view, i12)) {
            return false;
        }
        this.f45377c = i12;
        c(view, i12);
        return true;
    }

    /* compiled from: ViewDragHelper.java */
    public static abstract class c {
        public int a(@N View view, int i12, int i13) {
            return 0;
        }

        public int b(@N View view, int i12) {
            return 0;
        }

        public int c(@N View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract boolean k(@N View view, int i12);

        public void f(int i12) {
        }

        public void h(int i12) {
        }

        public void e(int i12, int i13) {
        }

        public void g(@N View view, int i12) {
        }

        public void j(@N View view, float f12, float f13) {
        }

        public void i(int i12, int i13, @U int i14, @N View view) {
        }
    }
}
