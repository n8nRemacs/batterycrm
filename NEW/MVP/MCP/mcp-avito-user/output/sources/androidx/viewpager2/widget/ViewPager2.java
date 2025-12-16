package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.h;
import i2.C41212a;
import j.F;
import j.N;
import j.P;
import j.U;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f55094b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f55095c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.viewpager2.widget.c f55096d;

    /* renamed from: e, reason: collision with root package name */
    public int f55097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f55098f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView.g f55099g;

    /* renamed from: h, reason: collision with root package name */
    public LinearLayoutManager f55100h;

    /* renamed from: i, reason: collision with root package name */
    public int f55101i;

    /* renamed from: j, reason: collision with root package name */
    public Parcelable f55102j;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f55103k;

    /* renamed from: l, reason: collision with root package name */
    public J f55104l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.h f55105m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.viewpager2.widget.c f55106n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.e f55107o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.viewpager2.widget.g f55108p;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView.j f55109q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f55110r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f55111s;

    /* renamed from: t, reason: collision with root package name */
    public int f55112t;

    /* renamed from: u, reason: collision with root package name */
    public k f55113u;

    public class a extends f {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.f, androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f55098f = true;
            viewPager2.f55105m.f55156m = true;
        }
    }

    public class b extends i {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrollStateChanged(int i12) {
            if (i12 == 0) {
                ViewPager2.this.j();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f55097e != i12) {
                viewPager2.f55097e = i12;
                viewPager2.f55113u.a();
            }
        }
    }

    public class c extends i {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.f55103k.requestFocus(2);
            }
        }
    }

    public abstract class d {
        public d(ViewPager2 viewPager2, a aVar) {
        }
    }

    public class e extends d {
    }

    public static abstract class f extends RecyclerView.g {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, @P Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            a();
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public class g extends LinearLayoutManager {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void L0(@N RecyclerView.u uVar, @N RecyclerView.z zVar, @N androidx.core.view.accessibility.f fVar) {
            super.L0(uVar, zVar, fVar);
            ViewPager2.this.f55113u.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean a1(@N RecyclerView.u uVar, @N RecyclerView.z zVar, int i12, @P Bundle bundle) {
            ViewPager2.this.f55113u.getClass();
            return super.a1(uVar, zVar, i12, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean h1(@N RecyclerView recyclerView, @N View view, @N Rect rect, boolean z12, boolean z13) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void z1(@N RecyclerView.z zVar, @N int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.z1(zVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    @F
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface j {
    }

    public class k extends d {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.core.view.accessibility.i f55121a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.core.view.accessibility.i f55122b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.g f55123c;

        public class a implements androidx.core.view.accessibility.i {
            public a() {
            }

            @Override // androidx.core.view.accessibility.i
            public final boolean c(@N View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f55111s) {
                    viewPager2.h(currentItem, true);
                }
                return true;
            }
        }

        public class b implements androidx.core.view.accessibility.i {
            public b() {
            }

            @Override // androidx.core.view.accessibility.i
            public final boolean c(@N View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f55111s) {
                    viewPager2.h(currentItem, true);
                }
                return true;
            }
        }

        public k() {
            super(ViewPager2.this, null);
            this.f55121a = new a();
            this.f55122b = new b();
        }

        public final void a() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i12 = R.id.accessibilityActionPageLeft;
            C22823h0.x(viewPager2, R.id.accessibilityActionPageLeft);
            C22823h0.y(viewPager2, R.id.accessibilityActionPageRight);
            C22823h0.u(viewPager2, 0);
            C22823h0.y(viewPager2, R.id.accessibilityActionPageUp);
            C22823h0.u(viewPager2, 0);
            C22823h0.y(viewPager2, R.id.accessibilityActionPageDown);
            C22823h0.u(viewPager2, 0);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f55111s) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            androidx.core.view.accessibility.i iVar = this.f55122b;
            androidx.core.view.accessibility.i iVar2 = this.f55121a;
            if (orientation != 0) {
                if (viewPager2.f55097e < itemCount - 1) {
                    C22823h0.z(viewPager2, new f.a(R.id.accessibilityActionPageDown, (String) null), iVar2);
                }
                if (viewPager2.f55097e > 0) {
                    C22823h0.z(viewPager2, new f.a(R.id.accessibilityActionPageUp, (String) null), iVar);
                    return;
                }
                return;
            }
            boolean z12 = viewPager2.f55100h.q0() == 1;
            int i13 = z12 ? 16908360 : 16908361;
            if (z12) {
                i12 = 16908361;
            }
            if (viewPager2.f55097e < itemCount - 1) {
                C22823h0.z(viewPager2, new f.a(i13, (String) null), iVar2);
            }
            if (viewPager2.f55097e > 0) {
                C22823h0.z(viewPager2, new f.a(i12, (String) null), iVar);
            }
        }
    }

    public interface l {
        void a(@N View view, float f12);
    }

    public class m extends J {
        public m() {
        }

        @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
        @P
        public final View f(RecyclerView.m mVar) {
            if (ViewPager2.this.f55107o.f55135b.f55157n) {
                return null;
            }
            return super.f(mVar);
        }
    }

    public class n extends RecyclerView {
        public n(@N Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @X
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f55113u.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f55097e);
            accessibilityEvent.setToIndex(viewPager2.f55097e);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f55111s && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f55111s && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface o {
    }

    public static class p implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f55129b;

        /* renamed from: c, reason: collision with root package name */
        public final RecyclerView f55130c;

        public p(int i12, RecyclerView recyclerView) {
            this.f55129b = i12;
            this.f55130c = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f55130c.F0(this.f55129b);
        }
    }

    public ViewPager2(@N Context context) {
        super(context);
        this.f55094b = new Rect();
        this.f55095c = new Rect();
        this.f55096d = new androidx.viewpager2.widget.c();
        this.f55098f = false;
        this.f55099g = new a();
        this.f55101i = -1;
        this.f55109q = null;
        this.f55110r = false;
        this.f55111s = true;
        this.f55112t = -1;
        d(context, null);
    }

    public final void a() {
        androidx.viewpager2.widget.e eVar = this.f55107o;
        androidx.viewpager2.widget.h hVar = eVar.f55135b;
        if (hVar.f55150g == 1) {
            return;
        }
        eVar.f55140g = 0;
        eVar.f55139f = 0;
        eVar.f55141h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = eVar.f55137d;
        if (velocityTracker == null) {
            eVar.f55137d = VelocityTracker.obtain();
            eVar.f55138e = ViewConfiguration.get(eVar.f55134a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        hVar.f55149f = 4;
        hVar.o(true);
        if (hVar.f55150g != 0) {
            eVar.f55136c.J0();
        }
        long j12 = eVar.f55141h;
        MotionEvent motionEventObtain = MotionEvent.obtain(j12, j12, 0, 0.0f, 0.0f, 0);
        eVar.f55137d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final void b() {
        androidx.viewpager2.widget.e eVar = this.f55107o;
        androidx.viewpager2.widget.h hVar = eVar.f55135b;
        boolean z12 = hVar.f55157n;
        if (z12) {
            if (hVar.f55150g != 1 || z12) {
                hVar.f55157n = false;
                hVar.p();
                h.a aVar = hVar.f55151h;
                if (aVar.f55160c == 0) {
                    int i12 = aVar.f55158a;
                    if (i12 != hVar.f55152i) {
                        hVar.l(i12);
                    }
                    hVar.m(0);
                    hVar.n();
                } else {
                    hVar.m(2);
                }
            }
            VelocityTracker velocityTracker = eVar.f55137d;
            velocityTracker.computeCurrentVelocity(1000, eVar.f55138e);
            if (eVar.f55136c.R((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return;
            }
            ViewPager2 viewPager2 = eVar.f55134a;
            View viewF = viewPager2.f55104l.f(viewPager2.f55100h);
            if (viewF == null) {
                return;
            }
            int[] iArrC = viewPager2.f55104l.c(viewPager2.f55100h, viewF);
            int i13 = iArrC[0];
            if (i13 == 0 && iArrC[1] == 0) {
                return;
            }
            viewPager2.f55103k.D0(i13, iArrC[1], null);
        }
    }

    public final void c(@U @SuppressLint({"SupportAnnotationUsage"}) float f12) {
        androidx.viewpager2.widget.e eVar = this.f55107o;
        if (eVar.f55135b.f55157n) {
            float f13 = eVar.f55139f - f12;
            eVar.f55139f = f13;
            int iRound = Math.round(f13 - eVar.f55140g);
            eVar.f55140g += iRound;
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z12 = eVar.f55134a.getOrientation() == 0;
            int i12 = z12 ? iRound : 0;
            if (z12) {
                iRound = 0;
            }
            float f14 = z12 ? eVar.f55139f : 0.0f;
            float f15 = z12 ? 0.0f : eVar.f55139f;
            eVar.f55136c.scrollBy(i12, iRound);
            MotionEvent motionEventObtain = MotionEvent.obtain(eVar.f55141h, jUptimeMillis, 2, f14, f15, 0);
            eVar.f55137d.addMovement(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i12) {
        return this.f55103k.canScrollHorizontally(i12);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i12) {
        return this.f55103k.canScrollVertically(i12);
    }

    public final void d(Context context, AttributeSet attributeSet) {
        this.f55113u = new k();
        n nVar = new n(context);
        this.f55103k = nVar;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        nVar.setId(View.generateViewId());
        this.f55103k.setDescendantFocusability(131072);
        g gVar = new g();
        this.f55100h = gVar;
        this.f55103k.setLayoutManager(gVar);
        this.f55103k.setScrollingTouchSlop(1);
        int[] iArr = C41212a.j.f398348a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f55103k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f55103k.m(new androidx.viewpager2.widget.i());
            androidx.viewpager2.widget.h hVar = new androidx.viewpager2.widget.h(this);
            this.f55105m = hVar;
            this.f55107o = new androidx.viewpager2.widget.e(this, hVar, this.f55103k);
            m mVar = new m();
            this.f55104l = mVar;
            mVar.b(this.f55103k);
            this.f55103k.o(this.f55105m);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c();
            this.f55106n = cVar;
            this.f55105m.f55145b = cVar;
            b bVar = new b();
            c cVar2 = new c();
            this.f55106n.f55132d.add(bVar);
            this.f55106n.f55132d.add(cVar2);
            k kVar = this.f55113u;
            RecyclerView recyclerView = this.f55103k;
            kVar.getClass();
            recyclerView.setImportantForAccessibility(2);
            kVar.f55123c = new androidx.viewpager2.widget.j(kVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            androidx.viewpager2.widget.c cVar3 = this.f55106n;
            cVar3.f55132d.add(this.f55096d);
            androidx.viewpager2.widget.g gVar2 = new androidx.viewpager2.widget.g(this.f55100h);
            this.f55108p = gVar2;
            this.f55106n.f55132d.add(gVar2);
            RecyclerView recyclerView2 = this.f55103k;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i12 = ((SavedState) parcelable).f55114b;
            sparseArray.put(this.f55103k.getId(), sparseArray.get(i12));
            sparseArray.remove(i12);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        f();
    }

    public final void e(@N i iVar) {
        this.f55096d.f55132d.add(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        RecyclerView.Adapter adapter;
        if (this.f55101i == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f55102j;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.j) {
                ((androidx.viewpager2.adapter.j) adapter).a(parcelable);
            }
            this.f55102j = null;
        }
        int iMax = Math.max(0, Math.min(this.f55101i, adapter.getItemCount() - 1));
        this.f55097e = iMax;
        this.f55101i = -1;
        this.f55103k.A0(iMax);
        this.f55113u.a();
    }

    public final void g(int i12, boolean z12) {
        if (this.f55107o.f55135b.f55157n) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        h(i12, z12);
    }

    @Override // android.view.ViewGroup, android.view.View
    @X
    public CharSequence getAccessibilityClassName() {
        this.f55113u.getClass();
        this.f55113u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @P
    public RecyclerView.Adapter getAdapter() {
        return this.f55103k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f55097e;
    }

    public int getItemDecorationCount() {
        return this.f55103k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f55112t;
    }

    public int getOrientation() {
        return this.f55100h.f53690r;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f55103k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f55105m.f55150g;
    }

    public final void h(int i12, boolean z12) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f55101i != -1) {
                this.f55101i = Math.max(i12, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i12, 0), adapter.getItemCount() - 1);
        int i13 = this.f55097e;
        if (iMin == i13 && this.f55105m.f55150g == 0) {
            return;
        }
        if (iMin == i13 && z12) {
            return;
        }
        double d12 = i13;
        this.f55097e = iMin;
        this.f55113u.a();
        androidx.viewpager2.widget.h hVar = this.f55105m;
        if (hVar.f55150g != 0) {
            hVar.p();
            h.a aVar = hVar.f55151h;
            d12 = aVar.f55158a + aVar.f55159b;
        }
        androidx.viewpager2.widget.h hVar2 = this.f55105m;
        hVar2.getClass();
        hVar2.f55149f = z12 ? 2 : 3;
        hVar2.f55157n = false;
        boolean z13 = hVar2.f55153j != iMin;
        hVar2.f55153j = iMin;
        hVar2.m(2);
        if (z13) {
            hVar2.l(iMin);
        }
        if (!z12) {
            this.f55103k.A0(iMin);
            return;
        }
        double d13 = iMin;
        if (Math.abs(d13 - d12) <= 3.0d) {
            this.f55103k.F0(iMin);
            return;
        }
        this.f55103k.A0(d13 > d12 ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f55103k;
        recyclerView.post(new p(iMin, recyclerView));
    }

    public final void i(@N i iVar) {
        this.f55096d.f55132d.remove(iVar);
    }

    public final void j() {
        J j12 = this.f55104l;
        if (j12 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = j12.f(this.f55100h);
        if (viewF == null) {
            return;
        }
        this.f55100h.getClass();
        int iT02 = RecyclerView.m.t0(viewF);
        if (iT02 != this.f55097e && getScrollState() == 0) {
            this.f55106n.onPageSelected(iT02);
        }
        this.f55098f = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 0;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 0;
        }
        new androidx.core.view.accessibility.f(accessibilityNodeInfo).m(f.C1754f.a(itemCount, itemCount2, 0));
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.f55111s) {
            return;
        }
        if (viewPager2.f55097e > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f55097e < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredWidth = this.f55103k.getMeasuredWidth();
        int measuredHeight = this.f55103k.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f55094b;
        rect.left = paddingLeft;
        rect.right = (i14 - i12) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i15 - i13) - getPaddingBottom();
        Rect rect2 = this.f55095c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f55103k.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f55098f) {
            j();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        measureChild(this.f55103k, i12, i13);
        int measuredWidth = this.f55103k.getMeasuredWidth();
        int measuredHeight = this.f55103k.getMeasuredHeight();
        int measuredState = this.f55103k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i12, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i13, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f55101i = savedState.f55115c;
        this.f55102j = savedState.f55116d;
    }

    @Override // android.view.View
    @P
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f55114b = this.f55103k.getId();
        int i12 = this.f55101i;
        if (i12 == -1) {
            i12 = this.f55097e;
        }
        savedState.f55115c = i12;
        Parcelable parcelable = this.f55102j;
        if (parcelable != null) {
            savedState.f55116d = parcelable;
        } else {
            Object adapter = this.f55103k.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.j) {
                savedState.f55116d = ((androidx.viewpager2.adapter.j) adapter).H();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    @X
    public final boolean performAccessibilityAction(int i12, Bundle bundle) {
        this.f55113u.getClass();
        if (i12 != 8192 && i12 != 4096) {
            return super.performAccessibilityAction(i12, bundle);
        }
        k kVar = this.f55113u;
        kVar.getClass();
        if (i12 != 8192 && i12 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i12 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f55111s) {
            viewPager2.h(currentItem, true);
        }
        return true;
    }

    public void setAdapter(@P RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f55103k.getAdapter();
        k kVar = this.f55113u;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(kVar.f55123c);
        } else {
            kVar.getClass();
        }
        RecyclerView.g gVar = this.f55099g;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(gVar);
        }
        this.f55103k.setAdapter(adapter);
        this.f55097e = 0;
        f();
        k kVar2 = this.f55113u;
        kVar2.a();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(kVar2.f55123c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(gVar);
        }
    }

    public void setCurrentItem(int i12) {
        g(i12, true);
    }

    @Override // android.view.View
    @X
    public void setLayoutDirection(int i12) {
        super.setLayoutDirection(i12);
        this.f55113u.a();
    }

    public void setOffscreenPageLimit(int i12) {
        if (i12 < 1 && i12 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f55112t = i12;
        this.f55103k.requestLayout();
    }

    public void setOrientation(int i12) {
        this.f55100h.c2(i12);
        this.f55113u.a();
    }

    public void setPageTransformer(@P l lVar) {
        if (lVar != null) {
            if (!this.f55110r) {
                this.f55109q = this.f55103k.getItemAnimator();
                this.f55110r = true;
            }
            this.f55103k.setItemAnimator(null);
        } else if (this.f55110r) {
            this.f55103k.setItemAnimator(this.f55109q);
            this.f55109q = null;
            this.f55110r = false;
        }
        androidx.viewpager2.widget.g gVar = this.f55108p;
        if (lVar == gVar.f55144e) {
            return;
        }
        gVar.f55144e = lVar;
        if (lVar == null) {
            return;
        }
        androidx.viewpager2.widget.h hVar = this.f55105m;
        hVar.p();
        h.a aVar = hVar.f55151h;
        double d12 = aVar.f55158a + aVar.f55159b;
        int i12 = (int) d12;
        float f12 = (float) (d12 - i12);
        this.f55108p.onPageScrolled(i12, f12, Math.round(getPageSize() * f12));
    }

    public void setUserInputEnabled(boolean z12) {
        this.f55111s = z12;
        this.f55113u.a();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f55114b;

        /* renamed from: c, reason: collision with root package name */
        public int f55115c;

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f55116d;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f55114b);
            parcel.writeInt(this.f55115c);
            parcel.writeParcelable(this.f55116d, i12);
        }

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.f55114b = parcel.readInt();
                savedState.f55115c = parcel.readInt();
                savedState.f55116d = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.f55114b = parcel.readInt();
                savedState.f55115c = parcel.readInt();
                savedState.f55116d = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }

    public ViewPager2(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55094b = new Rect();
        this.f55095c = new Rect();
        this.f55096d = new androidx.viewpager2.widget.c();
        this.f55098f = false;
        this.f55099g = new a();
        this.f55101i = -1;
        this.f55109q = null;
        this.f55110r = false;
        this.f55111s = true;
        this.f55112t = -1;
        d(context, attributeSet);
    }

    public static abstract class i {
        public void onPageScrollStateChanged(int i12) {
        }

        public void onPageSelected(int i12) {
        }

        public void onPageScrolled(int i12, float f12, @U int i13) {
        }
    }
}
