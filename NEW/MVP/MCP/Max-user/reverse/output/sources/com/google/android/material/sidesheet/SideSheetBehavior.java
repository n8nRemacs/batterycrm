package com.google.android.material.sidesheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a74;
import defpackage.ad0;
import defpackage.bq8;
import defpackage.br8;
import defpackage.cr8;
import defpackage.ctd;
import defpackage.d74;
import defpackage.f0;
import defpackage.g0;
import defpackage.g5;
import defpackage.gti;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.l30;
import defpackage.lfh;
import defpackage.m5d;
import defpackage.ps0;
import defpackage.rg;
import defpackage.rs0;
import defpackage.s2d;
import defpackage.s5i;
import defpackage.s6;
import defpackage.te0;
import defpackage.veh;
import defpackage.wq8;
import defpackage.wy1;
import defpackage.xse;
import defpackage.yq5;
import defpackage.z18;
import defpackage.z5d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a74 implements bq8 {
    public static final int x = s2d.side_sheet_accessibility_pane_title;
    public static final int y = m5d.Widget_Material3_SideSheet;
    public z18 a;
    public final wq8 b;
    public final ColorStateList c;
    public final xse d;
    public final rs0 e;
    public final float f;
    public final boolean g;
    public int h;
    public lfh i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public cr8 t;
    public int u;
    public final LinkedHashSet v;
    public final ps0 w;

    public static class a extends f0 {
        public static final Parcelable.Creator<a> CREATOR = new com.google.android.material.sidesheet.a();
        public final int c;

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // defpackage.f0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        public a(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior() {
        this.e = new rs0(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new ps0(2, this);
    }

    public final void A(int i, View view, boolean z) {
        int iA;
        if (i == 3) {
            iA = this.a.a();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(ho7.f(i, "Invalid state to get outer edge offset: "));
            }
            iA = this.a.b();
        }
        lfh lfhVar = this.i;
        if (lfhVar == null || (!z ? lfhVar.q(view, iA, view.getTop()) : lfhVar.o(iA, view.getTop()))) {
            y(i);
        } else {
            y(2);
            this.e.f(i);
        }
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        hfh.k(view, 262144);
        hfh.h(view, 0);
        hfh.k(view, 1048576);
        hfh.h(view, 0);
        int i = 5;
        if (this.h != 5) {
            hfh.l(view, g5.j, new ad0(this, i, 13));
        }
        int i2 = 3;
        if (this.h != 3) {
            hfh.l(view, g5.h, new ad0(this, i2, 13));
        }
    }

    @Override // defpackage.bq8
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        cr8 cr8Var = this.t;
        if (cr8Var == null) {
            return;
        }
        te0 te0Var = cr8Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        cr8Var.f = null;
        int i3 = 5;
        if (te0Var == null || Build.VERSION.SDK_INT < 34) {
            x(5);
            return;
        }
        z18 z18Var = this.a;
        if (z18Var != null && z18Var.d() != 0) {
            i3 = 3;
        }
        s6 s6Var = new s6(8, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.a.a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ize
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.a.g(marginLayoutParams, rg.c(i2, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = cr8Var.b;
        boolean z = te0Var.d == 0;
        WeakHashMap weakHashMap = hfh.a;
        boolean z2 = (Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new yq5());
        objectAnimatorOfFloat.setDuration(rg.c(cr8Var.c, te0Var.c, cr8Var.d));
        objectAnimatorOfFloat.addListener(new br8(cr8Var, z, i3));
        objectAnimatorOfFloat.addListener(s6Var);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.bq8
    public final void b(te0 te0Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        cr8 cr8Var = this.t;
        if (cr8Var == null) {
            return;
        }
        z18 z18Var = this.a;
        int i = (z18Var == null || z18Var.d() == 0) ? 5 : 3;
        if (cr8Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        te0 te0Var2 = cr8Var.f;
        cr8Var.f = te0Var;
        if (te0Var2 != null) {
            cr8Var.a(te0Var.c, te0Var.d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.g(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.bq8
    public final void c(te0 te0Var) {
        cr8 cr8Var = this.t;
        if (cr8Var == null) {
            return;
        }
        cr8Var.f = te0Var;
    }

    @Override // defpackage.bq8
    public final void d() {
        cr8 cr8Var = this.t;
        if (cr8Var == null) {
            return;
        }
        View view = cr8Var.b;
        if (cr8Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        te0 te0Var = cr8Var.f;
        cr8Var.f = null;
        if (te0Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(cr8Var.e);
        animatorSet.start();
    }

    @Override // defpackage.a74
    public final void g(d74 d74Var) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.a74
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.a74
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        lfh lfhVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && hfh.e(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (lfhVar = this.i) == null || !lfhVar.p(motionEvent)) ? false : true;
    }

    @Override // defpackage.a74
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int left;
        int i2;
        int i3;
        View viewFindViewById;
        WeakHashMap weakHashMap = hfh.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        wq8 wq8Var = this.b;
        int iC = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new cr8(view);
            if (wq8Var != null) {
                view.setBackground(wq8Var);
                float fI = this.f;
                if (fI == -1.0f) {
                    fI = veh.i(view);
                }
                wq8Var.j(fI);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    veh.q(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            B();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (hfh.e(view) == null) {
                hfh.o(view, view.getResources().getString(x));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((d74) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        z18 z18Var = this.a;
        if (z18Var == null || z18Var.d() != i5) {
            d74 d74Var = null;
            xse xseVar = this.d;
            if (i5 == 0) {
                this.a = new z18(this, 1);
                if (xseVar != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof d74)) {
                        d74Var = (d74) view3.getLayoutParams();
                    }
                    if (d74Var == null || ((ViewGroup.MarginLayoutParams) d74Var).rightMargin <= 0) {
                        s5i s5iVarE = xseVar.e();
                        s5iVarE.f = new g0(0.0f);
                        s5iVarE.g = new g0(0.0f);
                        xse xseVarG = s5iVarE.g();
                        if (wq8Var != null) {
                            wq8Var.setShapeAppearanceModel(xseVarG);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(wy1.e(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.a = new z18(this, 0);
                if (xseVar != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof d74)) {
                        d74Var = (d74) view2.getLayoutParams();
                    }
                    if (d74Var == null || ((ViewGroup.MarginLayoutParams) d74Var).leftMargin <= 0) {
                        s5i s5iVarE2 = xseVar.e();
                        s5iVarE2.e = new g0(0.0f);
                        s5iVarE2.h = new g0(0.0f);
                        xse xseVarG2 = s5iVarE2.g();
                        if (wq8Var != null) {
                            wq8Var.setShapeAppearanceModel(xseVarG2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new lfh(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iC2 = this.a.c(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        switch (this.a.a) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.n = left;
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.a.a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.o = i2;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iC = iC2 - this.a.c(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iC = this.a.b();
        }
        view.offsetLeftAndRight(iC);
        if (this.q == null && (i3 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // defpackage.a74
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.a74
    public final void r(View view, Parcelable parcelable) {
        int i = ((a) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.a74
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a(this);
    }

    @Override // defpackage.a74
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.j && z()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            lfh lfhVar = this.i;
            if (fAbs > lfhVar.b) {
                lfhVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void x(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(ho7.l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            y(i);
            return;
        }
        View view = (View) this.p.get();
        l30 l30Var = new l30(this, i, 17);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = hfh.a;
            if (view.isAttachedToWindow()) {
                view.post(l30Var);
                return;
            }
        }
        l30Var.run();
    }

    public final void y(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
        B();
    }

    public final boolean z() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new rs0(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new ps0(2, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.SideSheetBehavior_Layout_backgroundTint)) {
            this.c = gti.c(context, typedArrayObtainStyledAttributes, z5d.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.SideSheetBehavior_Layout_shapeAppearance)) {
            this.d = xse.b(context, attributeSet, 0, y).g();
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(z5d.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = hfh.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        xse xseVar = this.d;
        if (xseVar != null) {
            wq8 wq8Var = new wq8(xseVar);
            this.b = wq8Var;
            wq8Var.i(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(z5d.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(z5d.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
