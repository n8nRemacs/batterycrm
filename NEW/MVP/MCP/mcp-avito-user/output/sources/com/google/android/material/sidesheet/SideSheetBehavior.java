package com.google.android.material.sidesheet;

import Fc1.C13589d1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import com.google.android.material.R;
import com.google.android.material.shape.q;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.k;
import j.D;
import j.N;
import j.P;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements com.google.android.material.sidesheet.b<j> {

    /* renamed from: v, reason: collision with root package name */
    public static final int f357153v = R.string.side_sheet_accessibility_pane_title;

    /* renamed from: w, reason: collision with root package name */
    public static final int f357154w = R.style.Widget_Material3_SideSheet;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.sidesheet.a f357155a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final com.google.android.material.shape.k f357156b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final ColorStateList f357157c;

    /* renamed from: d, reason: collision with root package name */
    public final q f357158d;

    /* renamed from: e, reason: collision with root package name */
    public final SideSheetBehavior<V>.b f357159e;

    /* renamed from: f, reason: collision with root package name */
    public final float f357160f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f357161g;

    /* renamed from: h, reason: collision with root package name */
    public int f357162h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public androidx.customview.widget.d f357163i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f357164j;

    /* renamed from: k, reason: collision with root package name */
    public final float f357165k;

    /* renamed from: l, reason: collision with root package name */
    public int f357166l;

    /* renamed from: m, reason: collision with root package name */
    public int f357167m;

    /* renamed from: n, reason: collision with root package name */
    public int f357168n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public WeakReference<V> f357169o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public WeakReference<View> f357170p;

    /* renamed from: q, reason: collision with root package name */
    @D
    public final int f357171q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public VelocityTracker f357172r;

    /* renamed from: s, reason: collision with root package name */
    public int f357173s;

    /* renamed from: t, reason: collision with root package name */
    @N
    public final LinkedHashSet f357174t;

    /* renamed from: u, reason: collision with root package name */
    public final d.c f357175u;

    public class a extends d.c {
        public a() {
        }

        @Override // androidx.customview.widget.d.c
        public final int a(@N View view, int i12, int i13) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return M0.a.b(i12, sideSheetBehavior.f357155a.a(), sideSheetBehavior.f357167m);
        }

        @Override // androidx.customview.widget.d.c
        public final int b(@N View view, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public final int c(@N View view) {
            return SideSheetBehavior.this.f357167m;
        }

        @Override // androidx.customview.widget.d.c
        public final void h(int i12) {
            if (i12 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f357161g) {
                    sideSheetBehavior.v(1);
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void i(int i12, int i13, int i14, @N View view) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f357170p;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                com.google.android.material.sidesheet.a aVar = sideSheetBehavior.f357155a;
                int left = view.getLeft();
                view.getRight();
                int i15 = aVar.f357182a.f357167m;
                if (left <= i15) {
                    marginLayoutParams.rightMargin = i15 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f357174t;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            com.google.android.material.sidesheet.a aVar2 = sideSheetBehavior.f357155a;
            int i16 = aVar2.f357182a.f357167m;
            aVar2.a();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((c) it.next()).getClass();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
        @Override // androidx.customview.widget.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void j(@j.N android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                com.google.android.material.sidesheet.a r1 = r0.f357155a
                r1.getClass()
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                r4 = 3
                if (r3 >= 0) goto Le
                goto L71
            Le:
                int r3 = r8.getRight()
                float r3 = (float) r3
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r5 = r1.f357182a
                float r6 = r5.f357165k
                float r6 = r6 * r9
                float r6 = r6 + r3
                float r3 = java.lang.Math.abs(r6)
                r6 = 1056964608(0x3f000000, float:0.5)
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r6 = 5
                if (r3 <= 0) goto L49
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L38
                r9 = 500(0x1f4, float:7.0E-43)
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L38
                goto L47
            L38:
                int r9 = r8.getLeft()
                int r10 = r5.f357167m
                int r1 = r1.a()
                int r10 = r10 - r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L71
            L47:
                r4 = r6
                goto L71
            L49:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 == 0) goto L5a
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L5a
                goto L47
            L5a:
                int r9 = r8.getLeft()
                int r10 = r1.a()
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                int r1 = r5.f357167m
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L47
            L71:
                r9 = 1
                r0.x(r8, r4, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.j(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(@N View view, int i12) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f357162h == 1 || (weakReference = sideSheetBehavior.f357169o) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f357178a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f357179b;

        /* renamed from: c, reason: collision with root package name */
        public final i f357180c = new Runnable() { // from class: com.google.android.material.sidesheet.i
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.b bVar = this.f357192b;
                bVar.f357179b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                androidx.customview.widget.d dVar = sideSheetBehavior.f357163i;
                if (dVar != null && dVar.h()) {
                    bVar.a(bVar.f357178a);
                } else if (sideSheetBehavior.f357162h == 2) {
                    sideSheetBehavior.v(bVar.f357178a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.sidesheet.i] */
        public b() {
        }

        public final void a(int i12) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f357169o;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f357178a = i12;
            if (this.f357179b) {
                return;
            }
            V v12 = sideSheetBehavior.f357169o.get();
            i iVar = this.f357180c;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            v12.postOnAnimation(iVar);
            this.f357179b = true;
        }
    }

    public SideSheetBehavior() {
        this.f357159e = new b();
        this.f357161g = true;
        this.f357162h = 5;
        this.f357165k = 0.1f;
        this.f357171q = -1;
        this.f357174t = new LinkedHashSet();
        this.f357175u = new a();
    }

    @Override // com.google.android.material.sidesheet.b
    public final void a(@N k.a aVar) {
        this.f357174t.add(aVar);
    }

    @Override // com.google.android.material.sidesheet.b
    public final void b(int i12) {
        if (i12 == 1 || i12 == 2) {
            throw new IllegalArgumentException(AK.c.s(new StringBuilder("STATE_"), i12 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.f357169o;
        if (weakReference == null || weakReference.get() == null) {
            v(i12);
            return;
        }
        V v12 = this.f357169o.get();
        androidx.camera.video.internal.audio.q qVar = new androidx.camera.video.internal.audio.q(i12, 18, this);
        ViewParent parent = v12.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (v12.isAttachedToWindow()) {
                v12.post(qVar);
                return;
            }
        }
        qVar.run();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void e(@N CoordinatorLayout.g gVar) {
        this.f357169o = null;
        this.f357163i = null;
    }

    @Override // com.google.android.material.sidesheet.b
    public final int getState() {
        return this.f357162h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void h() {
        this.f357169o = null;
        this.f357163i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        VelocityTracker velocityTracker;
        if ((!v12.isShown() && C22823h0.h(v12) == null) || !this.f357161g) {
            this.f357164j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f357172r) != null) {
            velocityTracker.recycle();
            this.f357172r = null;
        }
        if (this.f357172r == null) {
            this.f357172r = VelocityTracker.obtain();
        }
        this.f357172r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f357173s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f357164j) {
            this.f357164j = false;
            return false;
        }
        return (this.f357164j || (dVar = this.f357163i) == null || !dVar.s(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) {
        int i13;
        int i14;
        View viewFindViewById;
        com.google.android.material.shape.k kVar = this.f357156b;
        com.google.android.material.sidesheet.a aVar = this.f357155a;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (coordinatorLayout.getFitsSystemWindows() && !v12.getFitsSystemWindows()) {
            v12.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f357169o == null) {
            this.f357169o = new WeakReference<>(v12);
            if (kVar != null) {
                v12.setBackground(kVar);
                float fL2 = this.f357160f;
                if (fL2 == -1.0f) {
                    fL2 = C22823h0.l(v12);
                }
                kVar.m(fL2);
            } else {
                ColorStateList colorStateList = this.f357157c;
                if (colorStateList != null) {
                    C22823h0.F(v12, colorStateList);
                }
            }
            int i15 = this.f357162h == 5 ? 4 : 0;
            if (v12.getVisibility() != i15) {
                v12.setVisibility(i15);
            }
            y();
            if (v12.getImportantForAccessibility() == 0) {
                v12.setImportantForAccessibility(1);
            }
            if (C22823h0.h(v12) == null) {
                C22823h0.E(v12, v12.getResources().getString(f357153v));
            }
        }
        if (this.f357163i == null) {
            this.f357163i = new androidx.customview.widget.d(coordinatorLayout.getContext(), coordinatorLayout, this.f357175u);
        }
        aVar.getClass();
        int left2 = v12.getLeft() - aVar.f357182a.f357168n;
        coordinatorLayout.onLayoutChild(v12, i12);
        this.f357167m = coordinatorLayout.getWidth();
        this.f357166l = v12.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v12.getLayoutParams();
        if (marginLayoutParams != null) {
            aVar.getClass();
            i13 = marginLayoutParams.rightMargin;
        } else {
            i13 = 0;
        }
        this.f357168n = i13;
        int i16 = this.f357162h;
        if (i16 == 1 || i16 == 2) {
            aVar.getClass();
            left = left2 - (v12.getLeft() - aVar.f357182a.f357168n);
        } else if (i16 != 3) {
            if (i16 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f357162h);
            }
            left = aVar.f357182a.f357167m;
        }
        v12.offsetLeftAndRight(left);
        if (this.f357170p == null && (i14 = this.f357171q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i14)) != null) {
            this.f357170p = new WeakReference<>(viewFindViewById);
        }
        for (c cVar : this.f357174t) {
            if (cVar instanceof j) {
                ((j) cVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(@N CoordinatorLayout coordinatorLayout, @N View view, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i13, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i14, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(@N View view, @N Parcelable parcelable) {
        int i12 = ((SavedState) parcelable).f357176d;
        if (i12 == 1 || i12 == 2) {
            i12 = 5;
        }
        this.f357162h = i12;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @N
    public final Parcelable r(@N View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean u(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v12.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f357162h == 1 && actionMasked == 0) {
            return true;
        }
        if (w()) {
            this.f357163i.l(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f357172r) != null) {
            velocityTracker.recycle();
            this.f357172r = null;
        }
        if (this.f357172r == null) {
            this.f357172r = VelocityTracker.obtain();
        }
        this.f357172r.addMovement(motionEvent);
        if (w() && actionMasked == 2 && !this.f357164j && w()) {
            float fAbs = Math.abs(this.f357173s - motionEvent.getX());
            androidx.customview.widget.d dVar = this.f357163i;
            if (fAbs > dVar.f45376b) {
                dVar.c(v12, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f357164j;
    }

    public final void v(int i12) {
        V v12;
        if (this.f357162h == i12) {
            return;
        }
        this.f357162h = i12;
        WeakReference<V> weakReference = this.f357169o;
        if (weakReference == null || (v12 = weakReference.get()) == null) {
            return;
        }
        int i13 = this.f357162h == 5 ? 4 : 0;
        if (v12.getVisibility() != i13) {
            v12.setVisibility(i13);
        }
        Iterator it = this.f357174t.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i12);
        }
        y();
    }

    public final boolean w() {
        return this.f357163i != null && (this.f357161g || this.f357162h == 1);
    }

    public final void x(View view, int i12, boolean z12) {
        int iA2;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f357155a.f357182a;
        if (i12 == 3) {
            iA2 = sideSheetBehavior.f357155a.a();
        } else {
            if (i12 != 5) {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(AK.c.g(i12, "Invalid state to get outer edge offset: "));
            }
            iA2 = sideSheetBehavior.f357155a.f357182a.f357167m;
        }
        androidx.customview.widget.d dVar = sideSheetBehavior.f357163i;
        if (dVar == null || (!z12 ? dVar.t(view, iA2, view.getTop()) : dVar.r(iA2, view.getTop()))) {
            v(i12);
        } else {
            v(2);
            this.f357159e.a(i12);
        }
    }

    public final void y() {
        V v12;
        WeakReference<V> weakReference = this.f357169o;
        if (weakReference == null || (v12 = weakReference.get()) == null) {
            return;
        }
        C22823h0.y(v12, 262144);
        C22823h0.u(v12, 0);
        C22823h0.y(v12, 1048576);
        C22823h0.u(v12, 0);
        int i12 = 5;
        if (this.f357162h != 5) {
            C22823h0.z(v12, f.a.f45011n, new C13589d1(this, i12));
        }
        int i13 = 3;
        if (this.f357162h != 3) {
            C22823h0.z(v12, f.a.f45009l, new C13589d1(this, i13));
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final int f357176d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            public final SavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            @P
            public final Object createFromParcel(@N Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f357176d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f357176d);
        }

        public SavedState(android.view.AbsSavedState absSavedState, @N SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f357176d = sideSheetBehavior.f357162h;
        }
    }

    public SideSheetBehavior(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f357159e = new b();
        this.f357161g = true;
        this.f357162h = 5;
        this.f357165k = 0.1f;
        this.f357171q = -1;
        this.f357174t = new LinkedHashSet();
        this.f357175u = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.f357157c = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f357158d = q.c(context, attributeSet, 0, f357154w).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.f357171q = resourceId;
            WeakReference<View> weakReference = this.f357170p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f357170p = null;
            WeakReference<V> weakReference2 = this.f357169o;
            if (weakReference2 != null) {
                V v12 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    if (v12.isLaidOut()) {
                        v12.requestLayout();
                    }
                }
            }
        }
        q qVar = this.f357158d;
        if (qVar != null) {
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVar);
            this.f357156b = kVar;
            kVar.j(context);
            ColorStateList colorStateList = this.f357157c;
            if (colorStateList != null) {
                this.f357156b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f357156b.setTint(typedValue.data);
            }
        }
        this.f357160f = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f357161g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f357155a == null) {
            this.f357155a = new com.google.android.material.sidesheet.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
