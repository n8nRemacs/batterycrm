package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.J;
import androidx.core.view.K;
import androidx.core.view.L;
import androidx.swiperefreshlayout.widget.d;
import c2.C26923a;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.N;
import j.P;
import j.U;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class SwipeRefreshLayout extends ViewGroup implements J, I, F, E, K, G {

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f54549Q = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    public int f54550A;

    /* renamed from: B, reason: collision with root package name */
    public int f54551B;

    /* renamed from: C, reason: collision with root package name */
    public final androidx.swiperefreshlayout.widget.d f54552C;

    /* renamed from: D, reason: collision with root package name */
    public Animation f54553D;

    /* renamed from: E, reason: collision with root package name */
    public Animation f54554E;

    /* renamed from: F, reason: collision with root package name */
    public Animation f54555F;

    /* renamed from: G, reason: collision with root package name */
    public Animation f54556G;

    /* renamed from: H, reason: collision with root package name */
    public Animation f54557H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f54558I;

    /* renamed from: J, reason: collision with root package name */
    public int f54559J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f54560K;

    /* renamed from: L, reason: collision with root package name */
    public e f54561L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f54562M;

    /* renamed from: N, reason: collision with root package name */
    public final Animation.AnimationListener f54563N;

    /* renamed from: O, reason: collision with root package name */
    public final Animation f54564O;

    /* renamed from: P, reason: collision with root package name */
    public final Animation f54565P;

    /* renamed from: b, reason: collision with root package name */
    public View f54566b;

    /* renamed from: c, reason: collision with root package name */
    public f f54567c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54568d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54569e;

    /* renamed from: f, reason: collision with root package name */
    public float f54570f;

    /* renamed from: g, reason: collision with root package name */
    public float f54571g;

    /* renamed from: h, reason: collision with root package name */
    public final L f54572h;

    /* renamed from: i, reason: collision with root package name */
    public final H f54573i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f54574j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f54575k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f54576l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f54577m;

    /* renamed from: n, reason: collision with root package name */
    public final int f54578n;

    /* renamed from: o, reason: collision with root package name */
    public int f54579o;

    /* renamed from: p, reason: collision with root package name */
    public float f54580p;

    /* renamed from: q, reason: collision with root package name */
    public float f54581q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f54582r;

    /* renamed from: s, reason: collision with root package name */
    public int f54583s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f54584t;

    /* renamed from: u, reason: collision with root package name */
    public final DecelerateInterpolator f54585u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.swiperefreshlayout.widget.a f54586v;

    /* renamed from: w, reason: collision with root package name */
    public int f54587w;

    /* renamed from: x, reason: collision with root package name */
    public int f54588x;

    /* renamed from: y, reason: collision with root package name */
    public float f54589y;

    /* renamed from: z, reason: collision with root package name */
    public int f54590z;

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f12, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f54560K ? swipeRefreshLayout.f54550A - Math.abs(swipeRefreshLayout.f54590z) : swipeRefreshLayout.f54550A;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f54588x + ((int) ((iAbs - r1) * f12))) - swipeRefreshLayout.f54586v.getTop());
            androidx.swiperefreshlayout.widget.d dVar = swipeRefreshLayout.f54552C;
            float f13 = 1.0f - f12;
            d.b bVar = dVar.f54605b;
            if (f13 != bVar.f54626p) {
                bVar.f54626p = f13;
            }
            dVar.invalidateSelf();
        }
    }

    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f12, Transformation transformation) {
            SwipeRefreshLayout.this.e(f12);
        }
    }

    public interface e {
        boolean b();
    }

    public interface f {
        void j0();
    }

    public SwipeRefreshLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54568d = false;
        this.f54570f = -1.0f;
        this.f54574j = new int[2];
        this.f54575k = new int[2];
        this.f54576l = new int[2];
        this.f54583s = -1;
        this.f54587w = -1;
        this.f54563N = new a();
        this.f54564O = new c();
        this.f54565P = new d();
        this.f54569e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f54578n = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f54585u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f54559J = (int) (displayMetrics.density * 40.0f);
        androidx.swiperefreshlayout.widget.a aVar = new androidx.swiperefreshlayout.widget.a(getContext());
        float f12 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(C26923a.j.f57622a);
        aVar.f54597c = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C22823h0.H(aVar, f12 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f54597c);
        aVar.setBackground(shapeDrawable);
        this.f54586v = aVar;
        androidx.swiperefreshlayout.widget.d dVar = new androidx.swiperefreshlayout.widget.d(getContext());
        this.f54552C = dVar;
        dVar.g(1);
        this.f54586v.setImageDrawable(this.f54552C);
        this.f54586v.setVisibility(8);
        addView(this.f54586v);
        setChildrenDrawingOrderEnabled(true);
        int i12 = (int) (displayMetrics.density * 64.0f);
        this.f54550A = i12;
        this.f54570f = i12;
        this.f54572h = new L();
        this.f54573i = new H(this);
        setNestedScrollingEnabled(true);
        int i13 = -this.f54559J;
        this.f54579o = i13;
        this.f54590z = i13;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f54549Q);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i12) {
        this.f54586v.getBackground().setAlpha(i12);
        this.f54552C.setAlpha(i12);
    }

    public final boolean a() {
        e eVar = this.f54561L;
        if (eVar != null) {
            return eVar.b();
        }
        View view = this.f54566b;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f54566b == null) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (!childAt.equals(this.f54586v)) {
                    this.f54566b = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f12) {
        if (f12 > this.f54570f) {
            h(true, true);
            return;
        }
        this.f54568d = false;
        this.f54552C.e(0.0f);
        boolean z12 = this.f54584t;
        b bVar = !z12 ? new b() : null;
        int i12 = this.f54579o;
        if (z12) {
            this.f54588x = i12;
            this.f54589y = this.f54586v.getScaleX();
            h hVar = new h(this);
            this.f54557H = hVar;
            hVar.setDuration(150L);
            if (bVar != null) {
                this.f54586v.f54596b = bVar;
            }
            this.f54586v.clearAnimation();
            this.f54586v.startAnimation(this.f54557H);
        } else {
            this.f54588x = i12;
            Animation animation = this.f54565P;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f54585u);
            if (bVar != null) {
                this.f54586v.f54596b = bVar;
            }
            this.f54586v.clearAnimation();
            this.f54586v.startAnimation(animation);
        }
        androidx.swiperefreshlayout.widget.d dVar = this.f54552C;
        d.b bVar2 = dVar.f54605b;
        if (bVar2.f54624n) {
            bVar2.f54624n = false;
        }
        dVar.invalidateSelf();
    }

    public final void d(float f12) {
        Animation animation;
        Animation animation2;
        androidx.swiperefreshlayout.widget.d dVar = this.f54552C;
        d.b bVar = dVar.f54605b;
        if (!bVar.f54624n) {
            bVar.f54624n = true;
        }
        dVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f12 / this.f54570f));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f12) - this.f54570f;
        int i12 = this.f54551B;
        if (i12 <= 0) {
            i12 = this.f54560K ? this.f54550A - this.f54590z : this.f54550A;
        }
        float f13 = i12;
        double dMax = Math.max(0.0f, Math.min(fAbs, f13 * 2.0f) / f13) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i13 = this.f54590z + ((int) ((f13 * fMin) + (f13 * fPow * 2.0f)));
        if (this.f54586v.getVisibility() != 0) {
            this.f54586v.setVisibility(0);
        }
        if (!this.f54584t) {
            this.f54586v.setScaleX(1.0f);
            this.f54586v.setScaleY(1.0f);
        }
        if (this.f54584t) {
            setAnimationProgress(Math.min(1.0f, f12 / this.f54570f));
        }
        if (f12 < this.f54570f) {
            if (this.f54552C.f54605b.f54630t > 76 && ((animation2 = this.f54555F) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                g gVar = new g(this, this.f54552C.f54605b.f54630t, 76);
                gVar.setDuration(300L);
                androidx.swiperefreshlayout.widget.a aVar = this.f54586v;
                aVar.f54596b = null;
                aVar.clearAnimation();
                this.f54586v.startAnimation(gVar);
                this.f54555F = gVar;
            }
        } else if (this.f54552C.f54605b.f54630t < 255 && ((animation = this.f54556G) == null || !animation.hasStarted() || animation.hasEnded())) {
            g gVar2 = new g(this, this.f54552C.f54605b.f54630t, 255);
            gVar2.setDuration(300L);
            androidx.swiperefreshlayout.widget.a aVar2 = this.f54586v;
            aVar2.f54596b = null;
            aVar2.clearAnimation();
            this.f54586v.startAnimation(gVar2);
            this.f54556G = gVar2;
        }
        this.f54552C.e(Math.min(0.8f, fMax * 0.8f));
        androidx.swiperefreshlayout.widget.d dVar2 = this.f54552C;
        float fMin2 = Math.min(1.0f, fMax);
        d.b bVar2 = dVar2.f54605b;
        if (fMin2 != bVar2.f54626p) {
            bVar2.f54626p = fMin2;
        }
        dVar2.invalidateSelf();
        this.f54552C.c(((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f);
        setTargetOffsetTopAndBottom(i13 - this.f54579o);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f12, float f13, boolean z12) {
        return this.f54573i.a(f12, f13, z12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f12, float f13) {
        return this.f54573i.b(f12, f13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i12, int i13, int[] iArr, int[] iArr2) {
        return this.f54573i.c(i12, i13, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i12, int i13, int i14, int i15, int[] iArr) {
        return this.f54573i.d(i12, i13, i14, i15, iArr, 0, null);
    }

    public final void e(float f12) {
        setTargetOffsetTopAndBottom((this.f54588x + ((int) ((this.f54590z - r0) * f12))) - this.f54586v.getTop());
    }

    public final void f() {
        this.f54586v.clearAnimation();
        this.f54552C.stop();
        this.f54586v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f54584t) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f54590z - this.f54579o);
        }
        this.f54579o = this.f54586v.getTop();
    }

    public final void g(int i12, int i13, boolean z12) {
        this.f54584t = z12;
        this.f54590z = i12;
        this.f54550A = i13;
        this.f54560K = true;
        f();
        this.f54568d = false;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i12, int i13) {
        int i14 = this.f54587w;
        return i14 < 0 ? i13 : i13 == i12 + (-1) ? i14 : i13 >= i14 ? i13 + 1 : i13;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f54572h.a();
    }

    public int getProgressCircleDiameter() {
        return this.f54559J;
    }

    public int getProgressViewEndOffset() {
        return this.f54550A;
    }

    public int getProgressViewStartOffset() {
        return this.f54590z;
    }

    public final void h(boolean z12, boolean z13) {
        if (this.f54568d != z12) {
            this.f54558I = z13;
            b();
            this.f54568d = z12;
            Animation.AnimationListener animationListener = this.f54563N;
            if (!z12) {
                androidx.swiperefreshlayout.widget.f fVar = new androidx.swiperefreshlayout.widget.f(this);
                this.f54554E = fVar;
                fVar.setDuration(150L);
                androidx.swiperefreshlayout.widget.a aVar = this.f54586v;
                aVar.f54596b = animationListener;
                aVar.clearAnimation();
                this.f54586v.startAnimation(this.f54554E);
                return;
            }
            this.f54588x = this.f54579o;
            Animation animation = this.f54564O;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f54585u);
            if (animationListener != null) {
                this.f54586v.f54596b = animationListener;
            }
            this.f54586v.clearAnimation();
            this.f54586v.startAnimation(animation);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f54573i.f(0);
    }

    public final void i(float f12) {
        float f13 = this.f54581q;
        float f14 = f12 - f13;
        float f15 = this.f54569e;
        if (f14 <= f15 || this.f54582r) {
            return;
        }
        this.f54580p = f13 + f15;
        this.f54582r = true;
        this.f54552C.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f54573i.f44937d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L80
            boolean r1 = r5.a()
            if (r1 != 0) goto L80
            boolean r1 = r5.f54568d
            if (r1 != 0) goto L80
            boolean r1 = r5.f54577m
            if (r1 == 0) goto L1d
            goto L80
        L1d:
            if (r0 == 0) goto L5c
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L57
            r4 = 2
            if (r0 == r4) goto L43
            r4 = 3
            if (r0 == r4) goto L57
            r3 = 6
            if (r0 == r3) goto L2d
            goto L7d
        L2d:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.f54583s
            if (r3 != r4) goto L7d
            if (r0 != 0) goto L3c
            r2 = r1
        L3c:
            int r6 = r6.getPointerId(r2)
            r5.f54583s = r6
            goto L7d
        L43:
            int r0 = r5.f54583s
            if (r0 != r3) goto L48
            return r2
        L48:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L4f
            return r2
        L4f:
            float r6 = r6.getY(r0)
            r5.i(r6)
            goto L7d
        L57:
            r5.f54582r = r2
            r5.f54583s = r3
            goto L7d
        L5c:
            int r0 = r5.f54590z
            androidx.swiperefreshlayout.widget.a r1 = r5.f54586v
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setTargetOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r2)
            r5.f54583s = r0
            r5.f54582r = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L77
            return r2
        L77:
            float r6 = r6.getY(r0)
            r5.f54581q = r6
        L7d:
            boolean r6 = r5.f54582r
            return r6
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f54566b == null) {
            b();
        }
        View view = this.f54566b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f54586v.getMeasuredWidth();
        int measuredHeight2 = this.f54586v.getMeasuredHeight();
        int i16 = measuredWidth / 2;
        int i17 = measuredWidth2 / 2;
        int i18 = this.f54579o;
        this.f54586v.layout(i16 - i17, i18, i16 + i17, measuredHeight2 + i18);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (this.f54566b == null) {
            b();
        }
        View view = this.f54566b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f54586v.measure(View.MeasureSpec.makeMeasureSpec(this.f54559J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f54559J, 1073741824));
        this.f54587w = -1;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if (getChildAt(i14) == this.f54586v) {
                this.f54587w = i14;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f12, float f13, boolean z12) {
        return this.f54573i.a(f12, f13, z12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f12, float f13) {
        return this.f54573i.b(f12, f13);
    }

    @Override // androidx.core.view.I
    public final void onNestedPreScroll(View view, int i12, int i13, int[] iArr, int i14) {
        if (i14 == 0) {
            onNestedPreScroll(view, i12, i13, iArr);
        }
    }

    @Override // androidx.core.view.J
    public final void onNestedScroll(@N View view, int i12, int i13, int i14, int i15, int i16, @N int[] iArr) {
        if (i16 != 0) {
            return;
        }
        int i17 = iArr[1];
        if (i16 == 0) {
            this.f54573i.d(i12, i13, i14, i15, this.f54575k, i16, iArr);
        }
        int i18 = i15 - (iArr[1] - i17);
        if ((i18 == 0 ? i15 + this.f54575k[1] : i18) >= 0 || a()) {
            return;
        }
        float fAbs = this.f54571g + Math.abs(r3);
        this.f54571g = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i18;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i12) {
        this.f54572h.f44968a = i12;
        startNestedScroll(i12 & 2);
        this.f54571g = 0.0f;
        this.f54577m = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f54591b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.f54568d, super.onSaveInstanceState());
    }

    @Override // androidx.core.view.I
    public final boolean onStartNestedScroll(View view, View view2, int i12, int i13) {
        if (i13 == 0) {
            return onStartNestedScroll(view, view2, i12);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f54572h.f44968a = 0;
        this.f54577m = false;
        float f12 = this.f54571g;
        if (f12 > 0.0f) {
            c(f12);
            this.f54571g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f54568d || this.f54577m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f54583s = motionEvent.getPointerId(0);
            this.f54582r = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f54583s);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.f54582r) {
                    float y12 = (motionEvent.getY(iFindPointerIndex) - this.f54580p) * 0.5f;
                    this.f54582r = false;
                    c(y12);
                }
                this.f54583s = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f54583s);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y13 = motionEvent.getY(iFindPointerIndex2);
                i(y13);
                if (this.f54582r) {
                    float f12 = (y13 - this.f54580p) * 0.5f;
                    if (f12 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    d(f12);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f54583s = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f54583s) {
                        this.f54583s = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z12) {
        ViewParent parent;
        View view = this.f54566b;
        if (view == null || C22823h0.t(view)) {
            super.requestDisallowInterceptTouchEvent(z12);
        } else {
            if (this.f54562M || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z12);
        }
    }

    public void setAnimationProgress(float f12) {
        this.f54586v.setScaleX(f12);
        this.f54586v.setScaleY(f12);
    }

    @Deprecated
    public void setColorScheme(@InterfaceC42158n int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@InterfaceC42156l int... iArr) {
        b();
        androidx.swiperefreshlayout.widget.d dVar = this.f54552C;
        d.b bVar = dVar.f54605b;
        bVar.f54619i = iArr;
        bVar.a(0);
        bVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(@InterfaceC42158n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr2[i12] = androidx.core.content.d.getColor(context, iArr[i12]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i12) {
        this.f54570f = i12;
    }

    @Override // android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        if (z12) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z12) {
        this.f54562M = z12;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z12) {
        this.f54573i.g(z12);
    }

    public void setOnChildScrollUpCallback(@P e eVar) {
        this.f54561L = eVar;
    }

    public void setOnRefreshListener(@P f fVar) {
        this.f54567c = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i12) {
        setProgressBackgroundColorSchemeResource(i12);
    }

    public void setProgressBackgroundColorSchemeColor(@InterfaceC42156l int i12) {
        this.f54586v.setBackgroundColor(i12);
    }

    public void setProgressBackgroundColorSchemeResource(@InterfaceC42158n int i12) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.d.getColor(getContext(), i12));
    }

    public void setRefreshing(boolean z12) {
        if (!z12 || this.f54568d == z12) {
            h(z12, false);
            return;
        }
        this.f54568d = z12;
        setTargetOffsetTopAndBottom((!this.f54560K ? this.f54550A + this.f54590z : this.f54550A) - this.f54579o);
        this.f54558I = false;
        Animation.AnimationListener animationListener = this.f54563N;
        this.f54586v.setVisibility(0);
        this.f54552C.setAlpha(255);
        androidx.swiperefreshlayout.widget.e eVar = new androidx.swiperefreshlayout.widget.e(this);
        this.f54553D = eVar;
        eVar.setDuration(this.f54578n);
        if (animationListener != null) {
            this.f54586v.f54596b = animationListener;
        }
        this.f54586v.clearAnimation();
        this.f54586v.startAnimation(this.f54553D);
    }

    public void setSize(int i12) {
        if (i12 == 0 || i12 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i12 == 0) {
                this.f54559J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f54559J = (int) (displayMetrics.density * 40.0f);
            }
            this.f54586v.setImageDrawable(null);
            this.f54552C.g(i12);
            this.f54586v.setImageDrawable(this.f54552C);
        }
    }

    public void setSlingshotDistance(@U int i12) {
        this.f54551B = i12;
    }

    public void setTargetOffsetTopAndBottom(int i12) {
        androidx.swiperefreshlayout.widget.a aVar = this.f54586v;
        aVar.bringToFront();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        aVar.offsetTopAndBottom(i12);
        this.f54579o = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i12) {
        return this.f54573i.h(i12, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f54573i.i(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f54591b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(boolean z12, Parcelable parcelable) {
            super(parcelable);
            this.f54591b = z12;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeByte(this.f54591b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f54591b = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i12, int i13, int[] iArr) {
        if (i13 > 0) {
            float f12 = this.f54571g;
            if (f12 > 0.0f) {
                float f13 = i13;
                if (f13 > f12) {
                    iArr[1] = (int) f12;
                    this.f54571g = 0.0f;
                } else {
                    this.f54571g = f12 - f13;
                    iArr[1] = i13;
                }
                d(this.f54571g);
            }
        }
        if (this.f54560K && i13 > 0 && this.f54571g == 0.0f && Math.abs(i13 - iArr[1]) > 0) {
            this.f54586v.setVisibility(8);
        }
        int i14 = i12 - iArr[0];
        int i15 = i13 - iArr[1];
        int[] iArr2 = this.f54574j;
        if (dispatchNestedPreScroll(i14, i15, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i12) {
        return (!isEnabled() || this.f54568d || (i12 & 2) == 0) ? false : true;
    }

    @Override // androidx.core.view.I
    public final void onNestedScrollAccepted(View view, View view2, int i12, int i13) {
        if (i13 == 0) {
            onNestedScrollAccepted(view, view2, i12);
        }
    }

    @Override // androidx.core.view.I
    public final void onStopNestedScroll(View view, int i12) {
        if (i12 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.I
    public final void onNestedScroll(View view, int i12, int i13, int i14, int i15, int i16) {
        onNestedScroll(view, i12, i13, i14, i15, i16, this.f54576l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i12, i13, i14, i15, 0, this.f54576l);
    }

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f54568d) {
                swipeRefreshLayout.f();
                return;
            }
            swipeRefreshLayout.f54552C.setAlpha(255);
            swipeRefreshLayout.f54552C.start();
            if (swipeRefreshLayout.f54558I && (fVar = swipeRefreshLayout.f54567c) != null) {
                fVar.j0();
            }
            swipeRefreshLayout.f54579o = swipeRefreshLayout.f54586v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f54584t) {
                return;
            }
            androidx.swiperefreshlayout.widget.f fVar = new androidx.swiperefreshlayout.widget.f(swipeRefreshLayout);
            swipeRefreshLayout.f54554E = fVar;
            fVar.setDuration(150L);
            androidx.swiperefreshlayout.widget.a aVar = swipeRefreshLayout.f54586v;
            aVar.f54596b = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f54586v.startAnimation(swipeRefreshLayout.f54554E);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
