package com.google.android.material.bottomsheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a74;
import defpackage.bj;
import defpackage.bq8;
import defpackage.d74;
import defpackage.do7;
import defpackage.dvc;
import defpackage.dwc;
import defpackage.f0;
import defpackage.fq8;
import defpackage.g5;
import defpackage.gti;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.hp;
import defpackage.lfh;
import defpackage.m5d;
import defpackage.os0;
import defpackage.ps0;
import defpackage.qs0;
import defpackage.rg;
import defpackage.rs0;
import defpackage.s2d;
import defpackage.s6;
import defpackage.te0;
import defpackage.teh;
import defpackage.thh;
import defpackage.u70;
import defpackage.veh;
import defpackage.vhb;
import defpackage.vq8;
import defpackage.wk0;
import defpackage.wq8;
import defpackage.xse;
import defpackage.y4;
import defpackage.yq5;
import defpackage.z4;
import defpackage.z5d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a74 implements bq8 {
    public static final int f0 = m5d.Widget_Design_BottomSheet_Modal;
    public final rs0 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public lfh M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public fq8 Y;
    public int Z;
    public final int a;
    public int a0;
    public boolean b;
    public boolean b0;
    public final float c;
    public HashMap c0;
    public final int d;
    public final SparseIntArray d0;
    public int e;
    public final ps0 e0;
    public boolean f;
    public int g;
    public final int h;
    public final wq8 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final xse y;
    public boolean z;

    public static class a extends f0 {
        public static final Parcelable.Creator<a> CREATOR = new com.google.android.material.bottomsheet.a();
        public final boolean X;
        public final boolean Y;
        public final int c;
        public final int d;
        public final boolean o;

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // defpackage.f0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.X ? 1 : 0);
            parcel.writeInt(this.Y ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.o = parcel.readInt() == 1;
            this.X = parcel.readInt() == 1;
            this.Y = parcel.readInt() == 1;
        }

        public a(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.L;
            this.d = bottomSheetBehavior.e;
            this.o = bottomSheetBehavior.b;
            this.X = bottomSheetBehavior.I;
            this.Y = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new rs0(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.a0 = -1;
        this.d0 = new SparseIntArray();
        this.e0 = new ps0(0, this);
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = hfh.a;
        if (veh.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = B(viewGroup.getChildAt(i));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d74)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        a74 a74Var = ((d74) layoutParams).a;
        if (a74Var instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) a74Var;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != E()) {
                E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((qs0) arrayList.get(i3)).b(view);
            }
        }
    }

    public final int E() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(ho7.f(i, "Invalid state to get top offset: "));
    }

    public final boolean G() {
        WeakReference weakReference = this.U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void H(boolean z) throws Resources.NotFoundException {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.U != null) {
            x();
        }
        L((this.b && this.L == 6) ? 3 : this.L);
        P(this.L, true);
        O();
    }

    public final void I(boolean z) throws Resources.NotFoundException {
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                K(4);
            }
            O();
        }
    }

    public final void J(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        R();
    }

    public final void K(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(ho7.l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && F(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            L(i);
            return;
        }
        View view = (View) this.U.get();
        hp hpVar = new hp(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = hfh.a;
            if (view.isAttachedToWindow()) {
                view.post(hpVar);
                return;
            }
        }
        hpVar.run();
    }

    public final void L(int i) {
        View view;
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            Q(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Q(false);
        }
        P(i, true);
        while (true) {
            ArrayList arrayList = this.W;
            if (i2 >= arrayList.size()) {
                O();
                return;
            } else {
                ((qs0) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean M(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) z()) > 0.5f;
    }

    public final void N(int i, View view, boolean z) {
        int iF = F(i);
        lfh lfhVar = this.M;
        if (lfhVar == null || (!z ? lfhVar.q(view, view.getLeft(), iF) : lfhVar.o(view.getLeft(), iF))) {
            L(i);
            return;
        }
        L(2);
        P(i, true);
        this.A.f(i);
    }

    public final void O() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        hfh.k(view, 524288);
        hfh.h(view, 0);
        hfh.k(view, 262144);
        hfh.h(view, 0);
        hfh.k(view, 1048576);
        hfh.h(view, 0);
        SparseIntArray sparseIntArray = this.d0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            hfh.k(view, i);
            hfh.h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.L != 6) {
            String string = view.getResources().getString(s2d.bottomsheet_action_expand_halfway);
            bj bjVar = new bj(this, i, 2);
            ArrayList arrayListF = hfh.f(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListF.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = hfh.d;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListF.size(); i6++) {
                            z &= ((g5) arrayListF.get(i6)).a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iA = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((g5) arrayListF.get(i2)).a).getLabel())) {
                        iA = ((g5) arrayListF.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                g5 g5Var = new g5(null, iA, string, bjVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = hfh.d(view);
                z4 z4Var = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof y4 ? ((y4) accessibilityDelegateD).a : new z4(accessibilityDelegateD);
                if (z4Var == null) {
                    z4Var = new z4();
                }
                hfh.n(view, z4Var);
                hfh.k(view, g5Var.a());
                hfh.f(view).add(g5Var);
                hfh.h(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i7 = 5;
            if (this.L != 5) {
                hfh.l(view, g5.j, new bj(this, i7, 2));
            }
        }
        int i8 = this.L;
        int i9 = 4;
        int i10 = 3;
        if (i8 == 3) {
            hfh.l(view, g5.i, new bj(this, this.b ? 4 : 6, 2));
            return;
        }
        if (i8 == 4) {
            hfh.l(view, g5.h, new bj(this, this.b ? 3 : 6, 2));
        } else {
            if (i8 != 6) {
                return;
            }
            hfh.l(view, g5.i, new bj(this, i9, 2));
            hfh.l(view, g5.h, new bj(this, i10, 2));
        }
    }

    public final void P(int i, boolean z) {
        wq8 wq8Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || G());
        if (this.z == z2 || (wq8Var = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(wq8Var.a.i, z2 ? y() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fY = this.z ? y() : 1.0f;
        vq8 vq8Var = wq8Var.a;
        if (vq8Var.i != fY) {
            vq8Var.i = fY;
            wq8Var.o = true;
            wq8Var.invalidateSelf();
        }
    }

    public final void Q(boolean z) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.c0 != null) {
                    return;
                } else {
                    this.c0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.c0 = null;
        }
    }

    public final void R() {
        View view;
        if (this.U != null) {
            x();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.bq8
    public final void a() {
        fq8 fq8Var = this.Y;
        if (fq8Var == null) {
            return;
        }
        int i = fq8Var.d;
        int i2 = fq8Var.c;
        te0 te0Var = fq8Var.f;
        fq8Var.f = null;
        if (te0Var != null) {
            float f = te0Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.I) {
                    AnimatorSet animatorSetA = fq8Var.a();
                    animatorSetA.setDuration(rg.c(i2, f, i));
                    animatorSetA.start();
                    K(4);
                    return;
                }
                s6 s6Var = new s6(3, this);
                View view = fq8Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new yq5());
                objectAnimatorOfFloat.setDuration(rg.c(i2, f, i));
                objectAnimatorOfFloat.addListener(new s6(7, fq8Var));
                objectAnimatorOfFloat.addListener(s6Var);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        K(this.I ? 5 : 4);
    }

    @Override // defpackage.bq8
    public final void b(te0 te0Var) {
        fq8 fq8Var = this.Y;
        if (fq8Var == null) {
            return;
        }
        if (fq8Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        te0 te0Var2 = fq8Var.f;
        fq8Var.f = te0Var;
        if (te0Var2 == null) {
            return;
        }
        fq8Var.b(te0Var.c);
    }

    @Override // defpackage.bq8
    public final void c(te0 te0Var) {
        fq8 fq8Var = this.Y;
        if (fq8Var == null) {
            return;
        }
        fq8Var.f = te0Var;
    }

    @Override // defpackage.bq8
    public final void d() {
        fq8 fq8Var = this.Y;
        if (fq8Var == null) {
            return;
        }
        if (fq8Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        te0 te0Var = fq8Var.f;
        fq8Var.f = null;
        if (te0Var == null) {
            return;
        }
        AnimatorSet animatorSetA = fq8Var.a();
        animatorSetA.setDuration(fq8Var.e);
        animatorSetA.start();
    }

    @Override // defpackage.a74
    public final void g(d74 d74Var) {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    @Override // defpackage.a74
    public final void j() {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    @Override // defpackage.a74
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        lfh lfhVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.a0 = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x, this.a0)) {
                    this.Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.b0 = true;
                }
            }
            this.N = this.Z == -1 && !coordinatorLayout.o(view, x, this.a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b0 = false;
            this.Z = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (this.N || (lfhVar = this.M) == null || !lfhVar.p(motionEvent)) {
            WeakReference weakReference2 = this.V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.a0) == -1 || Math.abs(i - motionEvent.getY()) <= this.M.b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a74
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        WeakHashMap weakHashMap = hfh.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        Object[] objArr = 0;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(dwc.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                os0 os0Var = new os0(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                u70 u70Var = new u70(9);
                u70Var.b = paddingStart;
                u70Var.c = paddingEnd;
                u70Var.d = paddingBottom;
                veh.u(view, new vhb(os0Var, u70Var, objArr == true ? 1 : 0, 18));
                if (view.isAttachedToWindow()) {
                    teh.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new thh());
                }
            }
            hfh.p(view, new do7(view));
            this.U = new WeakReference(view);
            this.Y = new fq8(view);
            wq8 wq8Var = this.i;
            if (wq8Var != null) {
                view.setBackground(wq8Var);
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = veh.i(view);
                }
                wq8Var.j(fI);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    veh.q(view, colorStateList);
                }
            }
            O();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new lfh(coordinatorLayout.getContext(), coordinatorLayout, this.e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i3 = iMin - height;
        int i4 = this.w;
        if (i3 < i4) {
            boolean z2 = this.r;
            int i5 = this.l;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        x();
        int i6 = this.L;
        if (i6 == 3) {
            view.offsetTopAndBottom(E());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i6 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        P(this.L, false);
        this.V = new WeakReference(B(view));
        while (true) {
            ArrayList arrayList = this.W;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((qs0) arrayList.get(i2)).a(view);
            i2++;
        }
    }

    @Override // defpackage.a74
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.a74
    public final boolean n(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // defpackage.a74
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < E()) {
                int iE = top - E();
                iArr[1] = iE;
                int i5 = -iE;
                WeakHashMap weakHashMap = hfh.a;
                view.offsetTopAndBottom(i5);
                L(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = hfh.a;
                view.offsetTopAndBottom(-i2);
                L(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.G;
            if (i4 > i6 && !this.I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = hfh.a;
                view.offsetTopAndBottom(i8);
                L(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = hfh.a;
                view.offsetTopAndBottom(-i2);
                L(1);
            }
        }
        A(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // defpackage.a74
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // defpackage.a74
    public final void r(View view, Parcelable parcelable) {
        a aVar = (a) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = aVar.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = aVar.o;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = aVar.X;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = aVar.Y;
            }
        }
        int i2 = aVar.c;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // defpackage.a74
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a(this);
    }

    @Override // defpackage.a74
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // defpackage.a74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.E()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.L(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.Z
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.M(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.N(r0, r4, r3)
            r2.P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.a74
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        lfh lfhVar = this.M;
        if (lfhVar != null && (this.K || i == 1)) {
            lfhVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.a0 - motionEvent.getY());
            lfh lfhVar2 = this.M;
            if (fAbs > lfhVar2.b) {
                lfhVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void x() {
        int iZ = z();
        if (this.b) {
            this.G = Math.max(this.T - iZ, this.D);
        } else {
            this.G = this.T - iZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float y() {
        /*
            r5 = this;
            wq8 r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.G()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            wq8 r2 = r5.i
            vq8 r3 = r2.a
            xse r3 = r3.a
            t74 r3 = r3.e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = defpackage.q20.l(r0)
            if (r3 == 0) goto L4e
            int r3 = defpackage.q20.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            wq8 r2 = r5.i
            vq8 r4 = r2.a
            xse r4 = r4.a
            t74 r4 = r4.f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = defpackage.q20.A(r0)
            if (r0 == 0) goto L74
            int r0 = defpackage.q20.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.y():float");
    }

    public final int z() {
        int i;
        return this.f ? Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v : (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        this.a = 0;
        int i2 = 1;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new rs0(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.a0 = -1;
        this.d0 = new SparseIntArray();
        this.e0 = new ps0(0, this);
        this.h = context.getResources().getDimensionPixelSize(dwc.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.BottomSheetBehavior_Layout_backgroundTint)) {
            this.j = gti.c(context, typedArrayObtainStyledAttributes, z5d.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.y = xse.b(context, attributeSet, dvc.bottomSheetStyle, f0).g();
        }
        xse xseVar = this.y;
        if (xseVar != null) {
            wq8 wq8Var = new wq8(xseVar);
            this.i = wq8Var;
            wq8Var.i(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new wk0(i2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(z5d.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(z5d.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            J(i);
        } else {
            J(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        I(typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        H(typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.J = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.a = typedArrayObtainStyledAttributes.getInt(z5d.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(z5d.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(z5d.BottomSheetBehavior_Layout_behavior_expandedOffset);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    P(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5d.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    P(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(z5d.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
            this.o = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(z5d.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
