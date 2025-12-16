package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.C22832m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import j.k0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: ItemTouchHelper.java */
/* renamed from: androidx.recyclerview.widget.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23427s extends RecyclerView.l implements RecyclerView.o {

    /* renamed from: B, reason: collision with root package name */
    public Rect f54146B;

    /* renamed from: C, reason: collision with root package name */
    public long f54147C;

    /* renamed from: e, reason: collision with root package name */
    public float f54151e;

    /* renamed from: f, reason: collision with root package name */
    public float f54152f;

    /* renamed from: g, reason: collision with root package name */
    public float f54153g;

    /* renamed from: h, reason: collision with root package name */
    public float f54154h;

    /* renamed from: i, reason: collision with root package name */
    public float f54155i;

    /* renamed from: j, reason: collision with root package name */
    public float f54156j;

    /* renamed from: k, reason: collision with root package name */
    public float f54157k;

    /* renamed from: l, reason: collision with root package name */
    public float f54158l;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    public final d f54160n;

    /* renamed from: p, reason: collision with root package name */
    public int f54162p;

    /* renamed from: r, reason: collision with root package name */
    public int f54164r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f54165s;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f54167u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f54168v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f54169w;

    /* renamed from: y, reason: collision with root package name */
    public C22832m f54171y;

    /* renamed from: z, reason: collision with root package name */
    public e f54172z;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f54148b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final float[] f54149c = new float[2];

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView.C f54150d = null;

    /* renamed from: m, reason: collision with root package name */
    public int f54159m = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f54161o = 0;

    /* renamed from: q, reason: collision with root package name */
    @k0
    public final ArrayList f54163q = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final Runnable f54166t = new a();

    /* renamed from: x, reason: collision with root package name */
    public View f54170x = null;

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView.q f54145A = new b();

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C23427s.a.run():void");
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$b */
    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(boolean z12) {
            if (z12) {
                C23427s.this.o(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean b(@j.N RecyclerView recyclerView, @j.N MotionEvent motionEvent) {
            int iFindPointerIndex;
            C23427s c23427s = C23427s.this;
            c23427s.f54171y.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                c23427s.f54159m = motionEvent.getPointerId(0);
                c23427s.f54151e = motionEvent.getX();
                c23427s.f54152f = motionEvent.getY();
                VelocityTracker velocityTracker = c23427s.f54167u;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c23427s.f54167u = VelocityTracker.obtain();
                if (c23427s.f54150d == null) {
                    ArrayList arrayList = c23427s.f54163q;
                    if (!arrayList.isEmpty()) {
                        View viewI = c23427s.i(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f54187e.itemView == viewI) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        c23427s.f54151e -= fVar.f54191i;
                        c23427s.f54152f -= fVar.f54192j;
                        RecyclerView.C c12 = fVar.f54187e;
                        c23427s.h(c12, true);
                        if (c23427s.f54148b.remove(c12.itemView)) {
                            c23427s.f54160n.c(c23427s.f54165s, c12);
                        }
                        c23427s.o(c12, fVar.f54188f);
                        c23427s.p(c23427s.f54162p, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                c23427s.f54159m = -1;
                c23427s.o(null, 0);
            } else {
                int i12 = c23427s.f54159m;
                if (i12 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i12)) >= 0) {
                    c23427s.f(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = c23427s.f54167u;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return c23427s.f54150d != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void g2(@j.N MotionEvent motionEvent) {
            C23427s c23427s = C23427s.this;
            c23427s.f54171y.a(motionEvent);
            VelocityTracker velocityTracker = c23427s.f54167u;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (c23427s.f54159m == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(c23427s.f54159m);
            if (iFindPointerIndex >= 0) {
                c23427s.f(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.C c12 = c23427s.f54150d;
            if (c12 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c23427s.p(c23427s.f54162p, iFindPointerIndex, motionEvent);
                        c23427s.m(c12);
                        RecyclerView recyclerView = c23427s.f54165s;
                        Runnable runnable = c23427s.f54166t;
                        recyclerView.removeCallbacks(runnable);
                        ((a) runnable).run();
                        c23427s.f54165s.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == c23427s.f54159m) {
                        c23427s.f54159m = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        c23427s.p(c23427s.f54162p, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c23427s.f54167u;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            c23427s.o(null, 0);
            c23427s.f54159m = -1;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$c */
    public class c extends f {

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f54175n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f54176o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.C c12, int i12, float f12, float f13, float f14, float f15, int i13, RecyclerView.C c13) {
            super(c12, i12, f12, f13, f14, f15);
            this.f54175n = i13;
            this.f54176o = c13;
        }

        @Override // androidx.recyclerview.widget.C23427s.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f54193k) {
                return;
            }
            int i12 = this.f54175n;
            RecyclerView.C c12 = this.f54176o;
            C23427s c23427s = C23427s.this;
            if (i12 <= 0) {
                c23427s.f54160n.c(c23427s.f54165s, c12);
            } else {
                c23427s.f54148b.add(c12.itemView);
                this.f54190h = true;
                if (i12 > 0) {
                    c23427s.f54165s.post(new RunnableC23428t(c23427s, this, i12));
                }
            }
            View view = c23427s.f54170x;
            View view2 = c12.itemView;
            if (view == view2) {
                c23427s.n(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$d */
    public static abstract class d {

        /* renamed from: b, reason: collision with root package name */
        public static final Interpolator f54178b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final Interpolator f54179c = new b();

        /* renamed from: a, reason: collision with root package name */
        public int f54180a = -1;

        /* compiled from: ItemTouchHelper.java */
        /* renamed from: androidx.recyclerview.widget.s$d$a */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f12) {
                return f12 * f12 * f12 * f12 * f12;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* renamed from: androidx.recyclerview.widget.s$d$b */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f12) {
                float f13 = f12 - 1.0f;
                return (f13 * f13 * f13 * f13 * f13) + 1.0f;
            }
        }

        public static int d(int i12, int i13) {
            int i14;
            int i15 = i12 & 3158064;
            if (i15 == 0) {
                return i12;
            }
            int i16 = i12 & (~i15);
            if (i13 == 0) {
                i14 = i15 >> 2;
            } else {
                int i17 = i15 >> 1;
                i16 |= (-3158065) & i17;
                i14 = (i17 & 3158064) >> 2;
            }
            return i16 | i14;
        }

        public static int e(int i12, int i13) {
            int i14;
            int i15 = i12 & 789516;
            if (i15 == 0) {
                return i12;
            }
            int i16 = i12 & (~i15);
            if (i13 == 0) {
                i14 = i15 << 2;
            } else {
                int i17 = i15 << 1;
                i16 |= (-789517) & i17;
                i14 = (i17 & 789516) << 2;
            }
            return i16 | i14;
        }

        public static int j(int i12) {
            return i12 | (i12 << 16);
        }

        public static void k(@j.N RecyclerView recyclerView, @j.N RecyclerView.C c12, float f12, float f13, boolean z12) {
            InterfaceC23431w interfaceC23431w = C23432x.f54199a;
            View view = c12.itemView;
            ((C23432x) interfaceC23431w).getClass();
            if (z12 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float fValueOf = Float.valueOf(C22823h0.l(view));
                int childCount = recyclerView.getChildCount();
                float f14 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = recyclerView.getChildAt(i12);
                    if (childAt != view) {
                        float fL2 = C22823h0.l(childAt);
                        if (fL2 > f14) {
                            f14 = fL2;
                        }
                    }
                }
                C22823h0.H(view, f14 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f12);
            view.setTranslationY(f13);
        }

        public boolean a(@j.N RecyclerView.C c12, @j.N RecyclerView.C c13) {
            return true;
        }

        public RecyclerView.C b(@j.N RecyclerView.C c12, @j.N ArrayList arrayList, int i12, int i13) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = c12.itemView.getWidth() + i12;
            int height = c12.itemView.getHeight() + i13;
            int left2 = i12 - c12.itemView.getLeft();
            int top2 = i13 - c12.itemView.getTop();
            int size = arrayList.size();
            RecyclerView.C c13 = null;
            int i14 = -1;
            for (int i15 = 0; i15 < size; i15++) {
                RecyclerView.C c14 = (RecyclerView.C) arrayList.get(i15);
                if (left2 > 0 && (right = c14.itemView.getRight() - width) < 0 && c14.itemView.getRight() > c12.itemView.getRight() && (iAbs4 = Math.abs(right)) > i14) {
                    c13 = c14;
                    i14 = iAbs4;
                }
                if (left2 < 0 && (left = c14.itemView.getLeft() - i12) > 0 && c14.itemView.getLeft() < c12.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i14) {
                    c13 = c14;
                    i14 = iAbs3;
                }
                if (top2 < 0 && (top = c14.itemView.getTop() - i13) > 0 && c14.itemView.getTop() < c12.itemView.getTop() && (iAbs2 = Math.abs(top)) > i14) {
                    c13 = c14;
                    i14 = iAbs2;
                }
                if (top2 > 0 && (bottom = c14.itemView.getBottom() - height) < 0 && c14.itemView.getBottom() > c12.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i14) {
                    c13 = c14;
                    i14 = iAbs;
                }
            }
            return c13;
        }

        public void c(@j.N RecyclerView recyclerView, @j.N RecyclerView.C c12) {
            InterfaceC23431w interfaceC23431w = C23432x.f54199a;
            View view = c12.itemView;
            ((C23432x) interfaceC23431w).getClass();
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                C22823h0.H(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public long f(int i12, @j.N RecyclerView recyclerView) {
            RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i12 == 8 ? 200L : 250L : i12 == 8 ? itemAnimator.f53831e : itemAnimator.f53830d;
        }

        public abstract int g(@j.N RecyclerView.C c12);

        public final int h(@j.N RecyclerView recyclerView, int i12, int i13, long j12) {
            if (this.f54180a == -1) {
                this.f54180a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int iSignum = (int) (((int) (((int) Math.signum(i13)) * this.f54180a * ((b) f54179c).getInterpolation(Math.min(1.0f, (Math.abs(i13) * 1.0f) / i12)))) * ((a) f54178b).getInterpolation(j12 <= 2000 ? j12 / 2000.0f : 1.0f));
            return iSignum == 0 ? i13 > 0 ? 1 : -1 : iSignum;
        }

        public boolean i() {
            return true;
        }

        public abstract boolean l(@j.N RecyclerView.C c12, @j.N RecyclerView.C c13);

        /* JADX WARN: Multi-variable type inference failed */
        public void m(@j.N RecyclerView recyclerView, @j.N RecyclerView.C c12, @j.N RecyclerView.C c13, int i12, int i13, int i14) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).c(c12.itemView, c13.itemView);
                return;
            }
            if (layoutManager.I()) {
                if (RecyclerView.m.j0(c13.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.A0(i12);
                }
                if (RecyclerView.m.m0(c13.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.A0(i12);
                }
            }
            if (layoutManager.J()) {
                if (RecyclerView.m.n0(c13.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.A0(i12);
                }
                if (RecyclerView.m.h0(c13.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.A0(i12);
                }
            }
        }

        public void n(@j.P RecyclerView.C c12, int i12) {
            if (c12 != null) {
                C23432x.f54199a.getClass();
            }
        }

        public abstract void o();
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$e */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        public boolean f54181b = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            C23427s c23427s;
            View viewI;
            RecyclerView.C cW2;
            if (!this.f54181b || (viewI = (c23427s = C23427s.this).i(motionEvent)) == null || (cW2 = c23427s.f54165s.W(viewI)) == null) {
                return;
            }
            d dVar = c23427s.f54160n;
            RecyclerView recyclerView = c23427s.f54165s;
            int iG2 = dVar.g(cW2);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if ((d.d(iG2, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i12 = c23427s.f54159m;
                if (pointerId == i12) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    c23427s.f54151e = x12;
                    c23427s.f54152f = y12;
                    c23427s.f54156j = 0.0f;
                    c23427s.f54155i = 0.0f;
                    if (c23427s.f54160n.i()) {
                        c23427s.o(cW2, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$g */
    public static abstract class g extends d {
        @Override // androidx.recyclerview.widget.C23427s.d
        public final int g(@j.N RecyclerView.C c12) {
            return d.j(0);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.s$h */
    public interface h {
        void c(@j.N View view, @j.N View view2);
    }

    public C23427s(@j.N d dVar) {
        this.f54160n = dVar;
    }

    public static boolean l(View view, float f12, float f13, float f14, float f15) {
        return f12 >= f14 && f12 <= f14 + ((float) view.getWidth()) && f13 >= f15 && f13 <= f15 + ((float) view.getHeight());
    }

    public final void c(@j.P RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f54165s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        RecyclerView.q qVar = this.f54145A;
        if (recyclerView2 != null) {
            recyclerView2.r0(this);
            this.f54165s.u0(qVar);
            this.f54165s.t0(this);
            ArrayList arrayList = this.f54163q;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList.get(0);
                fVar.f54189g.cancel();
                this.f54160n.c(this.f54165s, fVar.f54187e);
            }
            arrayList.clear();
            this.f54170x = null;
            VelocityTracker velocityTracker = this.f54167u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f54167u = null;
            }
            e eVar = this.f54172z;
            if (eVar != null) {
                eVar.f54181b = false;
                this.f54172z = null;
            }
            if (this.f54171y != null) {
                this.f54171y = null;
            }
        }
        this.f54165s = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f54153g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f54154h = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f54164r = ViewConfiguration.get(this.f54165s.getContext()).getScaledTouchSlop();
            this.f54165s.l(this, -1);
            this.f54165s.n(qVar);
            this.f54165s.m(this);
            this.f54172z = new e();
            this.f54171y = new C22832m(this.f54165s.getContext(), this.f54172z, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@j.N View view) {
        n(view);
        RecyclerView.C cW2 = this.f54165s.W(view);
        if (cW2 == null) {
            return;
        }
        RecyclerView.C c12 = this.f54150d;
        if (c12 != null && cW2 == c12) {
            o(null, 0);
            return;
        }
        h(cW2, false);
        if (this.f54148b.remove(cW2.itemView)) {
            this.f54160n.c(this.f54165s, cW2);
        }
    }

    public final int e(int i12) {
        if ((i12 & 12) == 0) {
            return 0;
        }
        int i13 = this.f54155i > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f54167u;
        d dVar = this.f54160n;
        if (velocityTracker != null && this.f54159m > -1) {
            float f12 = this.f54154h;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f12);
            float xVelocity = this.f54167u.getXVelocity(this.f54159m);
            float yVelocity = this.f54167u.getYVelocity(this.f54159m);
            int i14 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i14 & i12) != 0 && i13 == i14 && fAbs >= this.f54153g && fAbs > Math.abs(yVelocity)) {
                return i14;
            }
        }
        float width = this.f54165s.getWidth();
        dVar.getClass();
        float f13 = width * 0.5f;
        if ((i12 & i13) == 0 || Math.abs(this.f54155i) <= f13) {
            return 0;
        }
        return i13;
    }

    public final void f(int i12, int i13, MotionEvent motionEvent) {
        View viewI;
        if (this.f54150d == null && i12 == 2 && this.f54161o != 2) {
            d dVar = this.f54160n;
            dVar.getClass();
            if (this.f54165s.getScrollState() == 1) {
                return;
            }
            RecyclerView.m layoutManager = this.f54165s.getLayoutManager();
            int i14 = this.f54159m;
            RecyclerView.C cW2 = null;
            if (i14 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                float x12 = motionEvent.getX(iFindPointerIndex) - this.f54151e;
                float y12 = motionEvent.getY(iFindPointerIndex) - this.f54152f;
                float fAbs = Math.abs(x12);
                float fAbs2 = Math.abs(y12);
                float f12 = this.f54164r;
                if ((fAbs >= f12 || fAbs2 >= f12) && ((fAbs <= fAbs2 || !layoutManager.I()) && ((fAbs2 <= fAbs || !layoutManager.J()) && (viewI = i(motionEvent)) != null))) {
                    cW2 = this.f54165s.W(viewI);
                }
            }
            if (cW2 == null) {
                return;
            }
            RecyclerView recyclerView = this.f54165s;
            int iG2 = dVar.g(cW2);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            int iD2 = (d.d(iG2, recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (iD2 == 0) {
                return;
            }
            float x13 = motionEvent.getX(i13);
            float y13 = motionEvent.getY(i13);
            float f13 = x13 - this.f54151e;
            float f14 = y13 - this.f54152f;
            float fAbs3 = Math.abs(f13);
            float fAbs4 = Math.abs(f14);
            float f15 = this.f54164r;
            if (fAbs3 >= f15 || fAbs4 >= f15) {
                if (fAbs3 > fAbs4) {
                    if (f13 < 0.0f && (iD2 & 4) == 0) {
                        return;
                    }
                    if (f13 > 0.0f && (iD2 & 8) == 0) {
                        return;
                    }
                } else {
                    if (f14 < 0.0f && (iD2 & 1) == 0) {
                        return;
                    }
                    if (f14 > 0.0f && (iD2 & 2) == 0) {
                        return;
                    }
                }
                this.f54156j = 0.0f;
                this.f54155i = 0.0f;
                this.f54159m = motionEvent.getPointerId(0);
                o(cW2, 1);
            }
        }
    }

    public final int g(int i12) {
        if ((i12 & 3) == 0) {
            return 0;
        }
        int i13 = this.f54156j > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f54167u;
        d dVar = this.f54160n;
        if (velocityTracker != null && this.f54159m > -1) {
            float f12 = this.f54154h;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f12);
            float xVelocity = this.f54167u.getXVelocity(this.f54159m);
            float yVelocity = this.f54167u.getYVelocity(this.f54159m);
            int i14 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i14 & i12) != 0 && i14 == i13 && fAbs >= this.f54153g && fAbs > Math.abs(xVelocity)) {
                return i14;
            }
        }
        float height = this.f54165s.getHeight();
        dVar.getClass();
        float f13 = height * 0.5f;
        if ((i12 & i13) == 0 || Math.abs(this.f54156j) <= f13) {
            return 0;
        }
        return i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.setEmpty();
    }

    public final void h(RecyclerView.C c12, boolean z12) {
        ArrayList arrayList = this.f54163q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.f54187e == c12) {
                fVar.f54193k |= z12;
                if (!fVar.f54194l) {
                    fVar.f54189g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View i(MotionEvent motionEvent) {
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        RecyclerView.C c12 = this.f54150d;
        if (c12 != null) {
            View view = c12.itemView;
            if (l(view, x12, y12, this.f54157k + this.f54155i, this.f54158l + this.f54156j)) {
                return view;
            }
        }
        ArrayList arrayList = this.f54163q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view2 = fVar.f54187e.itemView;
            if (l(view2, x12, y12, fVar.f54191i, fVar.f54192j)) {
                return view2;
            }
        }
        return this.f54165s.J(x12, y12);
    }

    public final void k(float[] fArr) {
        if ((this.f54162p & 12) != 0) {
            fArr[0] = (this.f54157k + this.f54155i) - this.f54150d.itemView.getLeft();
        } else {
            fArr[0] = this.f54150d.itemView.getTranslationX();
        }
        if ((this.f54162p & 3) != 0) {
            fArr[1] = (this.f54158l + this.f54156j) - this.f54150d.itemView.getTop();
        } else {
            fArr[1] = this.f54150d.itemView.getTranslationY();
        }
    }

    public final void m(RecyclerView.C c12) {
        int i12;
        int i13;
        int i14;
        if (!this.f54165s.isLayoutRequested() && this.f54161o == 2) {
            d dVar = this.f54160n;
            dVar.getClass();
            int i15 = (int) (this.f54157k + this.f54155i);
            int i16 = (int) (this.f54158l + this.f54156j);
            if (Math.abs(i16 - c12.itemView.getTop()) >= c12.itemView.getHeight() * 0.5f || Math.abs(i15 - c12.itemView.getLeft()) >= c12.itemView.getWidth() * 0.5f) {
                ArrayList arrayList = this.f54168v;
                if (arrayList == null) {
                    this.f54168v = new ArrayList();
                    this.f54169w = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f54169w.clear();
                }
                int iRound = Math.round(this.f54157k + this.f54155i);
                int iRound2 = Math.round(this.f54158l + this.f54156j);
                int width = c12.itemView.getWidth() + iRound;
                int height = c12.itemView.getHeight() + iRound2;
                int i17 = (iRound + width) / 2;
                int i18 = (iRound2 + height) / 2;
                RecyclerView.m layoutManager = this.f54165s.getLayoutManager();
                int iE02 = layoutManager.e0();
                int i19 = 0;
                while (i19 < iE02) {
                    View viewD0 = layoutManager.d0(i19);
                    if (viewD0 != c12.itemView && viewD0.getBottom() >= iRound2 && viewD0.getTop() <= height && viewD0.getRight() >= iRound && viewD0.getLeft() <= width) {
                        RecyclerView.C cW2 = this.f54165s.W(viewD0);
                        i12 = iRound;
                        if (dVar.a(this.f54150d, cW2)) {
                            int iAbs = Math.abs(i17 - ((viewD0.getRight() + viewD0.getLeft()) / 2));
                            int iAbs2 = Math.abs(i18 - ((viewD0.getBottom() + viewD0.getTop()) / 2));
                            int i22 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                            int size = this.f54168v.size();
                            i13 = iRound2;
                            i14 = width;
                            int i23 = 0;
                            int i24 = 0;
                            while (i23 < size) {
                                int i25 = size;
                                if (i22 <= ((Integer) this.f54169w.get(i23)).intValue()) {
                                    break;
                                }
                                i24++;
                                i23++;
                                size = i25;
                            }
                            this.f54168v.add(i24, cW2);
                            this.f54169w.add(i24, Integer.valueOf(i22));
                        }
                        i19++;
                        iRound = i12;
                        iRound2 = i13;
                        width = i14;
                    } else {
                        i12 = iRound;
                    }
                    i13 = iRound2;
                    i14 = width;
                    i19++;
                    iRound = i12;
                    iRound2 = i13;
                    width = i14;
                }
                ArrayList arrayList2 = this.f54168v;
                if (arrayList2.size() == 0) {
                    return;
                }
                RecyclerView.C cB2 = dVar.b(c12, arrayList2, i15, i16);
                if (cB2 == null) {
                    this.f54168v.clear();
                    this.f54169w.clear();
                    return;
                }
                int absoluteAdapterPosition = cB2.getAbsoluteAdapterPosition();
                c12.getAbsoluteAdapterPosition();
                if (dVar.l(c12, cB2)) {
                    this.f54160n.m(this.f54165s, c12, cB2, absoluteAdapterPosition, i15, i16);
                }
            }
        }
    }

    public final void n(View view) {
        if (view == this.f54170x) {
            this.f54170x = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(@j.P androidx.recyclerview.widget.RecyclerView.C r22, int r23) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C23427s.o(androidx.recyclerview.widget.RecyclerView$C, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f12;
        float f13;
        if (this.f54150d != null) {
            float[] fArr = this.f54149c;
            k(fArr);
            f12 = fArr[0];
            f13 = fArr[1];
        } else {
            f12 = 0.0f;
            f13 = 0.0f;
        }
        RecyclerView.C c12 = this.f54150d;
        ArrayList arrayList = this.f54163q;
        this.f54160n.getClass();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = (f) arrayList.get(i12);
            float f14 = fVar.f54183a;
            float f15 = fVar.f54185c;
            RecyclerView.C c13 = fVar.f54187e;
            if (f14 == f15) {
                fVar.f54191i = c13.itemView.getTranslationX();
            } else {
                fVar.f54191i = androidx.appcompat.app.r.c(f15, f14, fVar.f54195m, f14);
            }
            float f16 = fVar.f54184b;
            float f17 = fVar.f54186d;
            if (f16 == f17) {
                fVar.f54192j = c13.itemView.getTranslationY();
            } else {
                fVar.f54192j = androidx.appcompat.app.r.c(f17, f16, fVar.f54195m, f16);
            }
            int iSave = canvas.save();
            d.k(recyclerView, c13, fVar.f54191i, fVar.f54192j, false);
            canvas.restoreToCount(iSave);
        }
        if (c12 != null) {
            int iSave2 = canvas.save();
            d.k(recyclerView, c12, f12, f13, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        boolean z12 = false;
        if (this.f54150d != null) {
            float[] fArr = this.f54149c;
            k(fArr);
            float f12 = fArr[0];
            float f13 = fArr[1];
        }
        RecyclerView.C c12 = this.f54150d;
        ArrayList arrayList = this.f54163q;
        this.f54160n.getClass();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = (f) arrayList.get(i12);
            int iSave = canvas.save();
            RecyclerView.C c13 = fVar.f54187e;
            InterfaceC23431w interfaceC23431w = C23432x.f54199a;
            View view = c13.itemView;
            interfaceC23431w.getClass();
            canvas.restoreToCount(iSave);
        }
        if (c12 != null) {
            int iSave2 = canvas.save();
            C23432x.f54199a.getClass();
            canvas.restoreToCount(iSave2);
        }
        for (int i13 = size - 1; i13 >= 0; i13--) {
            f fVar2 = (f) arrayList.get(i13);
            boolean z13 = fVar2.f54194l;
            if (z13 && !fVar2.f54190h) {
                arrayList.remove(i13);
            } else if (!z13) {
                z12 = true;
            }
        }
        if (z12) {
            recyclerView.invalidate();
        }
    }

    public final void p(int i12, int i13, MotionEvent motionEvent) {
        float x12 = motionEvent.getX(i13);
        float y12 = motionEvent.getY(i13);
        float f12 = x12 - this.f54151e;
        this.f54155i = f12;
        this.f54156j = y12 - this.f54152f;
        if ((i12 & 4) == 0) {
            this.f54155i = Math.max(0.0f, f12);
        }
        if ((i12 & 8) == 0) {
            this.f54155i = Math.min(0.0f, this.f54155i);
        }
        if ((i12 & 1) == 0) {
            this.f54156j = Math.max(0.0f, this.f54156j);
        }
        if ((i12 & 2) == 0) {
            this.f54156j = Math.min(0.0f, this.f54156j);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    @k0
    /* renamed from: androidx.recyclerview.widget.s$f */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final float f54183a;

        /* renamed from: b, reason: collision with root package name */
        public final float f54184b;

        /* renamed from: c, reason: collision with root package name */
        public final float f54185c;

        /* renamed from: d, reason: collision with root package name */
        public final float f54186d;

        /* renamed from: e, reason: collision with root package name */
        public final RecyclerView.C f54187e;

        /* renamed from: f, reason: collision with root package name */
        public final int f54188f;

        /* renamed from: g, reason: collision with root package name */
        @k0
        public final ValueAnimator f54189g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f54190h;

        /* renamed from: i, reason: collision with root package name */
        public float f54191i;

        /* renamed from: j, reason: collision with root package name */
        public float f54192j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f54193k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f54194l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f54195m;

        public f(RecyclerView.C c12, int i12, float f12, float f13, float f14, float f15) {
            this.f54188f = i12;
            this.f54187e = c12;
            this.f54183a = f12;
            this.f54184b = f13;
            this.f54185c = f14;
            this.f54186d = f15;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f54189g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C23430v(this));
            valueAnimatorOfFloat.setTarget(c12.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f54195m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f54195m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f54194l) {
                this.f54187e.setIsRecyclable(true);
            }
            this.f54194l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@j.N View view) {
    }
}
