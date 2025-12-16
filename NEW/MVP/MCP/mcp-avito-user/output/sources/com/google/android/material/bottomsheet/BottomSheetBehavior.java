package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.internal.O;
import com.google.android.material.shape.q;
import j.InterfaceC42167x;
import j.N;
import j.P;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: f0, reason: collision with root package name */
    public static final int f355963f0 = R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A, reason: collision with root package name */
    public final BottomSheetBehavior<V>.g f355964A;

    /* renamed from: B, reason: collision with root package name */
    @P
    public final ValueAnimator f355965B;

    /* renamed from: C, reason: collision with root package name */
    public int f355966C;

    /* renamed from: D, reason: collision with root package name */
    public int f355967D;

    /* renamed from: E, reason: collision with root package name */
    public int f355968E;

    /* renamed from: F, reason: collision with root package name */
    public float f355969F;

    /* renamed from: G, reason: collision with root package name */
    public int f355970G;

    /* renamed from: H, reason: collision with root package name */
    public final float f355971H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f355972I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f355973J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f355974K;

    /* renamed from: L, reason: collision with root package name */
    public int f355975L;

    /* renamed from: M, reason: collision with root package name */
    @P
    public androidx.customview.widget.d f355976M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f355977N;

    /* renamed from: O, reason: collision with root package name */
    public int f355978O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f355979P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f355980Q;

    /* renamed from: R, reason: collision with root package name */
    public int f355981R;

    /* renamed from: S, reason: collision with root package name */
    public int f355982S;

    /* renamed from: T, reason: collision with root package name */
    public int f355983T;

    /* renamed from: U, reason: collision with root package name */
    @P
    public WeakReference<V> f355984U;

    /* renamed from: V, reason: collision with root package name */
    @P
    public WeakReference<View> f355985V;

    /* renamed from: W, reason: collision with root package name */
    @P
    public WeakReference<View> f355986W;

    /* renamed from: X, reason: collision with root package name */
    @N
    public final ArrayList<c> f355987X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    public VelocityTracker f355988Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f355989Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f355990a;

    /* renamed from: a0, reason: collision with root package name */
    public int f355991a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f355992b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f355993b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f355994c;

    /* renamed from: c0, reason: collision with root package name */
    @P
    public HashMap f355995c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f355996d;

    /* renamed from: d0, reason: collision with root package name */
    @k0
    public final SparseIntArray f355997d0;

    /* renamed from: e, reason: collision with root package name */
    public int f355998e;

    /* renamed from: e0, reason: collision with root package name */
    public final d.c f355999e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356000f;

    /* renamed from: g, reason: collision with root package name */
    public int f356001g;

    /* renamed from: h, reason: collision with root package name */
    public final int f356002h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.material.shape.k f356003i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final ColorStateList f356004j;

    /* renamed from: k, reason: collision with root package name */
    public final int f356005k;

    /* renamed from: l, reason: collision with root package name */
    public int f356006l;

    /* renamed from: m, reason: collision with root package name */
    public int f356007m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f356008n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f356009o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f356010p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f356011q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f356012r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f356013s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f356014t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f356015u;

    /* renamed from: v, reason: collision with root package name */
    public int f356016v;

    /* renamed from: w, reason: collision with root package name */
    public int f356017w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f356018x;

    /* renamed from: y, reason: collision with root package name */
    public final q f356019y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f356020z;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f356026b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f356027c;

        public a(View view, int i12) {
            this.f356026b = view;
            this.f356027c = i12;
        }

        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            int i12 = BottomSheetBehavior.f355963f0;
            BottomSheetBehavior.this.Q(this.f356026b, this.f356027c, false);
        }
    }

    public class b extends d.c {
        public b() {
        }

        @Override // androidx.customview.widget.d.c
        public final int a(@N View view, int i12, int i13) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.d.c
        public final int b(@N View view, int i12) {
            return M0.a.b(i12, BottomSheetBehavior.this.D(), d());
        }

        @Override // androidx.customview.widget.d.c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f355972I ? bottomSheetBehavior.f355983T : bottomSheetBehavior.f355970G;
        }

        @Override // androidx.customview.widget.d.c
        public final void h(int i12) throws Resources.NotFoundException {
            if (i12 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f355974K) {
                    bottomSheetBehavior.O(1);
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public final void i(int i12, int i13, int i14, @N View view) {
            BottomSheetBehavior.this.z(i13);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // androidx.customview.widget.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void j(@j.N android.view.View r6, float r7, float r8) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.j(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(@N View view, int i12) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i13 = bottomSheetBehavior.f355975L;
            if (i13 == 1 || bottomSheetBehavior.f355993b0) {
                return false;
            }
            if (i13 == 3 && bottomSheetBehavior.f355989Z == i12) {
                WeakReference<View> weakReference = bottomSheetBehavior.f355986W;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f355984U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface f {
    }

    public class g {

        /* renamed from: a, reason: collision with root package name */
        public int f356030a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f356031b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f356032c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                g gVar = g.this;
                gVar.f356031b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                androidx.customview.widget.d dVar = bottomSheetBehavior.f355976M;
                if (dVar != null && dVar.h()) {
                    gVar.a(gVar.f356030a);
                } else if (bottomSheetBehavior.f355975L == 2) {
                    bottomSheetBehavior.O(gVar.f356030a);
                }
            }
        }

        public g(a aVar) {
        }

        public final void a(int i12) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f355984U;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f356030a = i12;
            if (this.f356031b) {
                return;
            }
            V v12 = bottomSheetBehavior.f355984U.get();
            Runnable runnable = this.f356032c;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            v12.postOnAnimation(runnable);
            this.f356031b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f355990a = 0;
        this.f355992b = true;
        this.f356005k = -1;
        this.f356006l = -1;
        this.f355964A = new g(null);
        this.f355969F = 0.5f;
        this.f355971H = -1.0f;
        this.f355974K = true;
        this.f355975L = 4;
        this.f355980Q = 0.1f;
        this.f355987X = new ArrayList<>();
        this.f355997d0 = new SparseIntArray();
        this.f355999e0 = new b();
    }

    @k0
    @P
    static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C22823h0.t(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View viewA = A(viewGroup.getChildAt(i12));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        return null;
    }

    @N
    public static <V extends View> BottomSheetBehavior<V> B(@N V v12) {
        ViewGroup.LayoutParams layoutParams = v12.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.g) layoutParams).f44447a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int C(int i12, int i13, int i14, int i15) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i13, i15);
        if (i14 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i14), 1073741824);
        }
        if (size != 0) {
            i14 = Math.min(size, i14);
        }
        return View.MeasureSpec.makeMeasureSpec(i14, BeduinInputModel.MIN_TEXT_VERSION);
    }

    public final int D() {
        if (this.f355992b) {
            return this.f355967D;
        }
        return Math.max(this.f355966C, this.f356012r ? 0 : this.f356017w);
    }

    public final int E() {
        if (this.f356000f) {
            return -1;
        }
        return this.f355998e;
    }

    public final int F(int i12) {
        if (i12 == 3) {
            return D();
        }
        if (i12 == 4) {
            return this.f355970G;
        }
        if (i12 == 5) {
            return this.f355983T;
        }
        if (i12 == 6) {
            return this.f355968E;
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Invalid state to get top offset: "));
    }

    public final void G(@N c cVar) {
        this.f355987X.remove(cVar);
    }

    public final void H(@P i iVar) throws Resources.NotFoundException {
        WeakReference<View> weakReference;
        if (iVar != null || (weakReference = this.f355985V) == null) {
            this.f355985V = new WeakReference<>(iVar);
            R(iVar, 1);
        } else {
            y(weakReference.get(), 1);
            this.f355985V = null;
        }
    }

    @Deprecated
    public final void I(c cVar) {
        ArrayList<c> arrayList = this.f355987X;
        arrayList.clear();
        arrayList.add(cVar);
    }

    public final void J(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f355966C = i12;
        T(this.f355975L, true);
    }

    public final void K(boolean z12) {
        if (this.f355992b == z12) {
            return;
        }
        this.f355992b = z12;
        if (this.f355984U != null) {
            w();
        }
        O((this.f355992b && this.f355975L == 6) ? 3 : this.f355975L);
        T(this.f355975L, true);
        S();
    }

    public final void L(@InterfaceC42167x float f12) {
        if (f12 <= 0.0f || f12 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f355969F = f12;
        if (this.f355984U != null) {
            this.f355968E = (int) ((1.0f - f12) * this.f355983T);
        }
    }

    public final void M(boolean z12) {
        if (this.f355972I != z12) {
            this.f355972I = z12;
            if (!z12 && this.f355975L == 5) {
                b(4);
            }
            S();
        }
    }

    public final void N(int i12, boolean z12) {
        if (i12 == -1) {
            if (this.f356000f) {
                return;
            } else {
                this.f356000f = true;
            }
        } else {
            if (!this.f356000f && this.f355998e == i12) {
                return;
            }
            this.f356000f = false;
            this.f355998e = Math.max(0, i12);
        }
        V(z12);
    }

    public final void O(int i12) throws Resources.NotFoundException {
        V v12;
        if (this.f355975L == i12) {
            return;
        }
        this.f355975L = i12;
        if (i12 != 4 && i12 != 3 && i12 != 6) {
            boolean z12 = this.f355972I;
        }
        WeakReference<V> weakReference = this.f355984U;
        if (weakReference == null || (v12 = weakReference.get()) == null) {
            return;
        }
        int i13 = 0;
        if (i12 == 3) {
            U(true);
        } else if (i12 == 6 || i12 == 5 || i12 == 4) {
            U(false);
        }
        T(i12, true);
        while (true) {
            ArrayList<c> arrayList = this.f355987X;
            if (i13 >= arrayList.size()) {
                S();
                return;
            } else {
                arrayList.get(i13).onStateChanged(v12, i12);
                i13++;
            }
        }
    }

    public final boolean P(@N View view, float f12) {
        if (this.f355973J) {
            return true;
        }
        if (view.getTop() < this.f355970G) {
            return false;
        }
        return Math.abs(((f12 * this.f355980Q) + ((float) view.getTop())) - ((float) this.f355970G)) / ((float) x()) > 0.5f;
    }

    public final void Q(View view, int i12, boolean z12) throws Resources.NotFoundException {
        int iF2 = F(i12);
        androidx.customview.widget.d dVar = this.f355976M;
        if (dVar == null || (!z12 ? dVar.t(view, view.getLeft(), iF2) : dVar.r(view.getLeft(), iF2))) {
            O(i12);
            return;
        }
        O(2);
        T(i12, true);
        this.f355964A.a(i12);
    }

    public final void R(View view, int i12) throws Resources.NotFoundException {
        int iA2;
        if (view == null) {
            return;
        }
        y(view, i12);
        if (!this.f355992b && this.f355975L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            com.google.android.material.bottomsheet.c cVar = new com.google.android.material.bottomsheet.c(this, 6);
            ArrayList arrayListI = C22823h0.i(view);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayListI.size()) {
                    int i14 = -1;
                    for (int i15 = 0; i15 < 32 && i14 == -1; i15++) {
                        int i16 = C22823h0.f45058d[i15];
                        boolean z12 = true;
                        for (int i17 = 0; i17 < arrayListI.size(); i17++) {
                            z12 &= ((f.a) arrayListI.get(i17)).a() != i16;
                        }
                        if (z12) {
                            i14 = i16;
                        }
                    }
                    iA2 = i14;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f.a) arrayListI.get(i13)).f45017a).getLabel())) {
                        iA2 = ((f.a) arrayListI.get(i13)).a();
                        break;
                    }
                    i13++;
                }
            }
            if (iA2 != -1) {
                f.a aVar = new f.a(null, iA2, string, cVar, null);
                C22808a c22808aF = C22823h0.f(view);
                if (c22808aF == null) {
                    c22808aF = new C22808a();
                }
                C22823h0.C(view, c22808aF);
                C22823h0.y(view, aVar.a());
                C22823h0.i(view).add(aVar);
                C22823h0.u(view, 0);
            }
            this.f355997d0.put(i12, iA2);
        }
        if (this.f355972I && this.f355975L != 5) {
            C22823h0.z(view, f.a.f45011n, new com.google.android.material.bottomsheet.c(this, 5));
        }
        int i18 = this.f355975L;
        if (i18 == 3) {
            C22823h0.z(view, f.a.f45010m, new com.google.android.material.bottomsheet.c(this, this.f355992b ? 4 : 6));
            return;
        }
        if (i18 == 4) {
            C22823h0.z(view, f.a.f45009l, new com.google.android.material.bottomsheet.c(this, this.f355992b ? 3 : 6));
        } else {
            if (i18 != 6) {
                return;
            }
            C22823h0.z(view, f.a.f45010m, new com.google.android.material.bottomsheet.c(this, 4));
            C22823h0.z(view, f.a.f45009l, new com.google.android.material.bottomsheet.c(this, 3));
        }
    }

    public final void S() throws Resources.NotFoundException {
        WeakReference<V> weakReference = this.f355984U;
        if (weakReference != null) {
            R(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f355985V;
        if (weakReference2 != null) {
            R(weakReference2.get(), 1);
        }
    }

    public final void T(int i12, boolean z12) {
        com.google.android.material.shape.k kVar = this.f356003i;
        ValueAnimator valueAnimator = this.f355965B;
        if (i12 == 2) {
            return;
        }
        boolean z13 = this.f355975L == 3 && (this.f356018x || D() == 0);
        if (this.f356020z == z13 || kVar == null) {
            return;
        }
        this.f356020z = z13;
        if (!z12 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            kVar.o(this.f356020z ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
            return;
        }
        float f12 = z13 ? 0.0f : 1.0f;
        valueAnimator.setFloatValues(1.0f - f12, f12);
        valueAnimator.start();
    }

    public final void U(boolean z12) {
        WeakReference<V> weakReference = this.f355984U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z12) {
                if (this.f355995c0 != null) {
                    return;
                } else {
                    this.f355995c0 = new HashMap(childCount);
                }
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = coordinatorLayout.getChildAt(i12);
                if (childAt != this.f355984U.get() && z12) {
                    this.f355995c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z12) {
                return;
            }
            this.f355995c0 = null;
        }
    }

    public final void V(boolean z12) {
        V v12;
        if (this.f355984U != null) {
            w();
            if (this.f355975L != 4 || (v12 = this.f355984U.get()) == null) {
                return;
            }
            if (z12) {
                b(4);
            } else {
                v12.requestLayout();
            }
        }
    }

    public final void b(int i12) {
        if (i12 == 1 || i12 == 2) {
            throw new IllegalArgumentException(AK.c.s(new StringBuilder("STATE_"), i12 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.f355972I || i12 != 5) {
            int i13 = (i12 == 6 && this.f355992b && F(i12) <= this.f355967D) ? 3 : i12;
            WeakReference<V> weakReference = this.f355984U;
            if (weakReference == null || weakReference.get() == null) {
                O(i12);
                return;
            }
            V v12 = this.f355984U.get();
            a aVar = new a(v12, i13);
            ViewParent parent = v12.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (v12.isAttachedToWindow()) {
                    v12.post(aVar);
                    return;
                }
            }
            aVar.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void e(@N CoordinatorLayout.g gVar) {
        this.f355984U = null;
        this.f355976M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void h() {
        this.f355984U = null;
        this.f355976M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!v12.isShown() || !this.f355974K) {
            this.f355977N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f355989Z = -1;
            VelocityTracker velocityTracker = this.f355988Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f355988Y = null;
            }
        }
        if (this.f355988Y == null) {
            this.f355988Y = VelocityTracker.obtain();
        }
        this.f355988Y.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x12 = (int) motionEvent.getX();
            this.f355991a0 = (int) motionEvent.getY();
            if (this.f355975L != 2) {
                WeakReference<View> weakReference = this.f355986W;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x12, this.f355991a0)) {
                    this.f355989Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f355993b0 = true;
                }
            }
            this.f355977N = this.f355989Z == -1 && !coordinatorLayout.isPointInChildBounds(v12, x12, this.f355991a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f355993b0 = false;
            this.f355989Z = -1;
            if (this.f355977N) {
                this.f355977N = false;
                return false;
            }
        }
        if (!this.f355977N && (dVar = this.f355976M) != null && dVar.s(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f355986W;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f355977N || this.f355975L == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f355976M == null || Math.abs(((float) this.f355991a0) - motionEvent.getY()) <= ((float) this.f355976M.f45376b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) throws Resources.NotFoundException {
        com.google.android.material.shape.k kVar = this.f356003i;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (coordinatorLayout.getFitsSystemWindows() && !v12.getFitsSystemWindows()) {
            v12.setFitsSystemWindows(true);
        }
        int i13 = 0;
        if (this.f355984U == null) {
            this.f356001g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z12 = (Build.VERSION.SDK_INT < 29 || this.f356008n || this.f356000f) ? false : true;
            if (this.f356009o || this.f356010p || this.f356011q || this.f356013s || this.f356014t || this.f356015u || z12) {
                O.a(v12, new com.google.android.material.bottomsheet.b(this, z12));
            }
            C22823h0.R(v12, new k(v12));
            this.f355984U = new WeakReference<>(v12);
            if (kVar != null) {
                v12.setBackground(kVar);
                float fL2 = this.f355971H;
                if (fL2 == -1.0f) {
                    fL2 = C22823h0.l(v12);
                }
                kVar.m(fL2);
            } else {
                ColorStateList colorStateList = this.f356004j;
                if (colorStateList != null) {
                    C22823h0.F(v12, colorStateList);
                }
            }
            S();
            if (v12.getImportantForAccessibility() == 0) {
                v12.setImportantForAccessibility(1);
            }
        }
        if (this.f355976M == null) {
            this.f355976M = new androidx.customview.widget.d(coordinatorLayout.getContext(), coordinatorLayout, this.f355999e0);
        }
        int top = v12.getTop();
        coordinatorLayout.onLayoutChild(v12, i12);
        this.f355982S = coordinatorLayout.getWidth();
        this.f355983T = coordinatorLayout.getHeight();
        int height = v12.getHeight();
        this.f355981R = height;
        int i14 = this.f355983T;
        int i15 = i14 - height;
        int i16 = this.f356017w;
        if (i15 < i16) {
            if (this.f356012r) {
                this.f355981R = i14;
            } else {
                this.f355981R = i14 - i16;
            }
        }
        this.f355967D = Math.max(0, i14 - this.f355981R);
        this.f355968E = (int) ((1.0f - this.f355969F) * this.f355983T);
        w();
        int i17 = this.f355975L;
        if (i17 == 3) {
            v12.offsetTopAndBottom(D());
        } else if (i17 == 6) {
            v12.offsetTopAndBottom(this.f355968E);
        } else if (this.f355972I && i17 == 5) {
            v12.offsetTopAndBottom(this.f355983T);
        } else if (i17 == 4) {
            v12.offsetTopAndBottom(this.f355970G);
        } else if (i17 == 1 || i17 == 2) {
            v12.offsetTopAndBottom(top - v12.getTop());
        }
        T(this.f355975L, false);
        this.f355986W = new WeakReference<>(A(v12));
        while (true) {
            ArrayList<c> arrayList = this.f355987X;
            if (i13 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i13).onLayout(v12);
            i13++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(@N CoordinatorLayout coordinatorLayout, @N View view, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i12, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i13, this.f356005k, marginLayoutParams.width), C(i14, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f356006l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(@N View view, @N View view2, float f12) {
        WeakReference<View> weakReference = this.f355986W;
        return (weakReference == null || view2 != weakReference.get() || this.f355975L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, int i12, int i13, @N int[] iArr, int i14) throws Resources.NotFoundException {
        if (i14 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f355986W;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v12.getTop();
        int i15 = top - i13;
        if (i13 > 0) {
            if (i15 < D()) {
                int iD2 = top - D();
                iArr[1] = iD2;
                int i16 = -iD2;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                v12.offsetTopAndBottom(i16);
                O(3);
            } else {
                if (!this.f355974K) {
                    return;
                }
                iArr[1] = i13;
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                v12.offsetTopAndBottom(-i13);
                O(1);
            }
        } else if (i13 < 0 && !view.canScrollVertically(-1)) {
            int i17 = this.f355970G;
            if (i15 > i17 && !this.f355972I) {
                int i18 = top - i17;
                iArr[1] = i18;
                int i19 = -i18;
                WeakHashMap<View, A0> weakHashMap3 = C22823h0.f45055a;
                v12.offsetTopAndBottom(i19);
                O(4);
            } else {
                if (!this.f355974K) {
                    return;
                }
                iArr[1] = i13;
                WeakHashMap<View, A0> weakHashMap4 = C22823h0.f45055a;
                v12.offsetTopAndBottom(-i13);
                O(1);
            }
        }
        z(v12.getTop());
        this.f355978O = i13;
        this.f355979P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(@N View view, @N Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i12 = this.f355990a;
        if (i12 != 0) {
            if (i12 == -1 || (i12 & 1) == 1) {
                this.f355998e = savedState.f356022e;
            }
            if (i12 == -1 || (i12 & 2) == 2) {
                this.f355992b = savedState.f356023f;
            }
            if (i12 == -1 || (i12 & 4) == 4) {
                this.f355972I = savedState.f356024g;
            }
            if (i12 == -1 || (i12 & 8) == 8) {
                this.f355973J = savedState.f356025h;
            }
        }
        int i13 = savedState.f356021d;
        if (i13 == 1 || i13 == 2) {
            this.f355975L = 4;
        } else {
            this.f355975L = i13;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @N
    public final Parcelable r(@N View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, @N View view2, int i12, int i13) {
        this.f355978O = 0;
        this.f355979P = false;
        return (i12 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(@j.N androidx.coordinatorlayout.widget.CoordinatorLayout r3, @j.N V r4, @j.N android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.O(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f355986W
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f355979P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f355978O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f355992b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.f355968E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f355972I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f355988Y
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f355994c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f355988Y
            int r6 = r2.f355989Z
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.P(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f355978O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f355992b
            if (r1 == 0) goto L74
            int r5 = r2.f355967D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f355970G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.f355968E
            if (r3 >= r1) goto L83
            int r6 = r2.f355970G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f355970G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f355992b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.f355968E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f355970G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.Q(r4, r0, r3)
            r2.f355979P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@N CoordinatorLayout coordinatorLayout, @N V v12, @N MotionEvent motionEvent) {
        if (!v12.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i12 = this.f355975L;
        if (i12 == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.d dVar = this.f355976M;
        if (dVar != null && (this.f355974K || i12 == 1)) {
            dVar.l(motionEvent);
        }
        if (actionMasked == 0) {
            this.f355989Z = -1;
            VelocityTracker velocityTracker = this.f355988Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f355988Y = null;
            }
        }
        if (this.f355988Y == null) {
            this.f355988Y = VelocityTracker.obtain();
        }
        this.f355988Y.addMovement(motionEvent);
        if (this.f355976M != null && ((this.f355974K || this.f355975L == 1) && actionMasked == 2 && !this.f355977N)) {
            float fAbs = Math.abs(this.f355991a0 - motionEvent.getY());
            androidx.customview.widget.d dVar2 = this.f355976M;
            if (fAbs > dVar2.f45376b) {
                dVar2.c(v12, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f355977N;
    }

    public final void v(@N c cVar) {
        ArrayList<c> arrayList = this.f355987X;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public final void w() {
        int iX2 = x();
        if (this.f355992b) {
            this.f355970G = Math.max(this.f355983T - iX2, this.f355967D);
        } else {
            this.f355970G = this.f355983T - iX2;
        }
    }

    public final int x() {
        int i12;
        return this.f356000f ? Math.min(Math.max(this.f356001g, this.f355983T - ((this.f355982S * 9) / 16)), this.f355981R) + this.f356016v : (this.f356008n || this.f356009o || (i12 = this.f356007m) <= 0) ? this.f355998e + this.f356016v : Math.max(this.f355998e, i12 + this.f356002h);
    }

    public final void y(View view, int i12) {
        if (view == null) {
            return;
        }
        C22823h0.y(view, 524288);
        C22823h0.u(view, 0);
        C22823h0.y(view, 262144);
        C22823h0.u(view, 0);
        C22823h0.y(view, 1048576);
        C22823h0.u(view, 0);
        SparseIntArray sparseIntArray = this.f355997d0;
        int i13 = sparseIntArray.get(i12, -1);
        if (i13 != -1) {
            C22823h0.y(view, i13);
            C22823h0.u(view, 0);
            sparseIntArray.delete(i12);
        }
    }

    public final void z(int i12) {
        float f12;
        float fD2;
        V v12 = this.f355984U.get();
        if (v12 != null) {
            ArrayList<c> arrayList = this.f355987X;
            if (arrayList.isEmpty()) {
                return;
            }
            int i13 = this.f355970G;
            if (i12 > i13 || i13 == D()) {
                int i14 = this.f355970G;
                f12 = i14 - i12;
                fD2 = this.f355983T - i14;
            } else {
                int i15 = this.f355970G;
                f12 = i15 - i12;
                fD2 = i15 - D();
            }
            float f13 = f12 / fD2;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                arrayList.get(i16).onSlide(v12, f13);
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final int f356021d;

        /* renamed from: e, reason: collision with root package name */
        public final int f356022e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f356023f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f356024g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f356025h;

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
            this.f356021d = parcel.readInt();
            this.f356022e = parcel.readInt();
            this.f356023f = parcel.readInt() == 1;
            this.f356024g = parcel.readInt() == 1;
            this.f356025h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f356021d);
            parcel.writeInt(this.f356022e);
            parcel.writeInt(this.f356023f ? 1 : 0);
            parcel.writeInt(this.f356024g ? 1 : 0);
            parcel.writeInt(this.f356025h ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, @N BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f356021d = bottomSheetBehavior.f355975L;
            this.f356022e = bottomSheetBehavior.f355998e;
            this.f356023f = bottomSheetBehavior.f355992b;
            this.f356024g = bottomSheetBehavior.f355972I;
            this.f356025h = bottomSheetBehavior.f355973J;
        }
    }

    public BottomSheetBehavior(@N Context context, @P AttributeSet attributeSet) {
        int i12;
        super(context, attributeSet);
        this.f355990a = 0;
        this.f355992b = true;
        this.f356005k = -1;
        this.f356006l = -1;
        this.f355964A = new g(null);
        this.f355969F = 0.5f;
        this.f355971H = -1.0f;
        this.f355974K = true;
        this.f355975L = 4;
        this.f355980Q = 0.1f;
        this.f355987X = new ArrayList<>();
        this.f355997d0 = new SparseIntArray();
        this.f355999e0 = new b();
        this.f356002h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f356004j = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f356019y = q.c(context, attributeSet, R.attr.bottomSheetStyle, f355963f0).a();
        }
        q qVar = this.f356019y;
        if (qVar != null) {
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVar);
            this.f356003i = kVar;
            kVar.j(context);
            ColorStateList colorStateList = this.f356004j;
            if (colorStateList != null) {
                this.f356003i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f356003i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f355965B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f355965B.addUpdateListener(new com.google.android.material.bottomsheet.a(this));
        this.f355971H = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.f356005k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.f356006l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i12 = typedValuePeekValue.data) == -1) {
            N(i12, false);
        } else {
            N(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1), false);
        }
        M(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f356008n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        K(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.f355973J = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f355974K = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f355990a = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        L(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            J(typedValuePeekValue2.data);
        } else {
            J(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        this.f355996d = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.f356009o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f356010p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f356011q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f356012r = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f356013s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f356014t = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f356015u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f356018x = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f355994c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class c {
        public abstract void onSlide(@N View view, float f12);

        public abstract void onStateChanged(@N View view, int i12);

        public void onLayout(@N View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, int i12, int i13, int i14, int i15, int i16, @N int[] iArr) {
    }
}
