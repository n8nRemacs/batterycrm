package defpackage;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class in extends LinearLayout implements z64 {
    public static final int M0 = m5d.Widget_Design_AppBarLayout;
    public WeakReference A0;
    public final boolean B0;
    public ValueAnimator C0;
    public final ValueAnimator.AnimatorUpdateListener D0;
    public final ArrayList E0;
    public final long F0;
    public final TimeInterpolator G0;
    public int[] H0;
    public Drawable I0;
    public Integer J0;
    public final float K0;
    public AppBarLayout$Behavior L0;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean o;
    public int s0;
    public g4i t0;
    public ArrayList u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public int z0;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    public in(Context context) {
        Integer numValueOf;
        int i = dvc.appBarLayoutStyle;
        int i2 = M0;
        super(er8.a(context, null, i, i2), null, i);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.s0 = 0;
        this.E0 = new ArrayList();
        Context context2 = getContext();
        int i3 = 1;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = d7g.d(context3, null, wni.a, i, i2, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = d7g.d(context2, null, z5d.AppBarLayout, i, i2, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(z5d.AppBarLayout_android_background);
            WeakHashMap weakHashMap = hfh.a;
            setBackground(drawable);
            final ColorStateList colorStateListC = gti.c(context2, typedArrayD2, z5d.AppBarLayout_liftOnScrollColor);
            this.B0 = colorStateListC != null;
            final ColorStateList colorStateListB = r9j.b(getBackground());
            if (colorStateListB != null) {
                final wq8 wq8Var = new wq8();
                wq8Var.k(colorStateListB);
                if (colorStateListC != null) {
                    Context context4 = getContext();
                    TypedValue typedValueE = wsi.e(context4, dvc.colorSurface);
                    if (typedValueE != null) {
                        int i4 = typedValueE.resourceId;
                        numValueOf = Integer.valueOf(i4 != 0 ? s34.a(context4, i4) : typedValueE.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.D0 = new ValueAnimator.AnimatorUpdateListener() { // from class: bn
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            in inVar = this.a;
                            ArrayList arrayList = inVar.E0;
                            int iJ = eti.j(colorStateListB.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListC.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
                            wq8 wq8Var2 = wq8Var;
                            wq8Var2.k(colorStateListValueOf);
                            if (inVar.I0 != null && (num2 = inVar.J0) != null && num2.equals(num)) {
                                t35.g(inVar.I0, iJ);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (wq8Var2.a.c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(wq8Var);
                } else {
                    wq8Var.i(context2);
                    this.D0 = new sg(this, i3, wq8Var);
                    setBackground(wq8Var);
                }
            }
            this.F0 = exi.c(dvc.motionDurationMedium2, getResources().getInteger(a1d.app_bar_elevation_anim_duration), context2);
            this.G0 = exi.d(context2, dvc.motionEasingStandardInterpolator, rg.a);
            if (typedArrayD2.hasValue(z5d.AppBarLayout_expanded)) {
                f(typedArrayD2.getBoolean(z5d.AppBarLayout_expanded, false), false, false);
            }
            if (typedArrayD2.hasValue(z5d.AppBarLayout_elevation)) {
                wni.b(this, typedArrayD2.getDimensionPixelSize(z5d.AppBarLayout_elevation, 0));
            }
            if (typedArrayD2.hasValue(z5d.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayD2.getBoolean(z5d.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayD2.hasValue(z5d.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayD2.getBoolean(z5d.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
            this.K0 = getResources().getDimension(dwc.design_appbar_elevation);
            this.y0 = typedArrayD2.getBoolean(z5d.AppBarLayout_liftOnScroll, false);
            this.z0 = typedArrayD2.getResourceId(z5d.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(z5d.AppBarLayout_statusBarForeground));
            typedArrayD2.recycle();
            veh.u(this, new r5j(2, this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static gn c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            gn gnVar = new gn((LinearLayout.LayoutParams) layoutParams);
            gnVar.a = 1;
            return gnVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            gn gnVar2 = new gn((ViewGroup.MarginLayoutParams) layoutParams);
            gnVar2.a = 1;
            return gnVar2;
        }
        gn gnVar3 = new gn(layoutParams);
        gnVar3.a = 1;
        return gnVar3;
    }

    public final void a(fn fnVar) {
        if (this.u0 == null) {
            this.u0 = new ArrayList();
        }
        if (fnVar == null || this.u0.contains(fnVar)) {
            return;
        }
        this.u0.add(fnVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gn generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        gn gnVar = new gn(context, attributeSet);
        gnVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.AppBarLayout_Layout);
        gnVar.a = typedArrayObtainStyledAttributes.getInt(z5d.AppBarLayout_Layout_layout_scrollFlags, 0);
        gnVar.b = typedArrayObtainStyledAttributes.getInt(z5d.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new py0(1);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.AppBarLayout_Layout_layout_scrollInterpolator)) {
            gnVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(z5d.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return gnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gn;
    }

    public final void d() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.L0;
        en enVarI = (appBarLayout$Behavior == null || this.b == -1 || this.s0 != 0) ? null : appBarLayout$Behavior.I(f0.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (enVarI != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.L0;
            if (appBarLayout$Behavior2.m != null) {
                return;
            }
            appBarLayout$Behavior2.m = enVarI;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.I0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.I0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.I0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = hfh.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                fn fnVar = (fn) this.u0.get(i2);
                if (fnVar != null) {
                    fnVar.c0(this, i);
                }
            }
        }
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        this.s0 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean g(boolean z) {
        if (this.v0 || this.x0 == z) {
            return false;
        }
        this.x0 = z;
        refreshDrawableState();
        if (!(getBackground() instanceof wq8)) {
            return true;
        }
        if (this.B0) {
            i(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.y0) {
            return true;
        }
        float f = this.K0;
        i(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gn();
    }

    public a74 getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.L0 = appBarLayout$Behavior;
        return appBarLayout$Behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            gn r4 = (defpackage.gn) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = defpackage.hfh.a
            int r4 = r3.getMinimumHeight()
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = defpackage.hfh.a
            int r4 = r3.getMinimumHeight()
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = defpackage.hfh.a
            boolean r3 = r3.getFitsSystemWindows()
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                gn gnVar = (gn) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) gnVar).topMargin + ((LinearLayout.LayoutParams) gnVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = gnVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = hfh.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.z0;
    }

    public wq8 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof wq8) {
            return (wq8) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = hfh.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.s0;
    }

    public Drawable getStatusBarForeground() {
        return this.I0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        g4i g4iVar = this.t0;
        if (g4iVar != null) {
            return g4iVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                gn gnVar = (gn) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = gnVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) gnVar).topMargin + ((LinearLayout.LayoutParams) gnVar).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = hfh.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = hfh.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(View view) {
        int i;
        if (this.A0 == null && (i = this.z0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.z0);
            }
            if (viewFindViewById != null) {
                this.A0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.A0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void i(float f, float f2) {
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.C0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.F0);
        this.C0.setInterpolator(this.G0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.D0;
        if (animatorUpdateListener != null) {
            this.C0.addUpdateListener(animatorUpdateListener);
        }
        this.C0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof wq8) {
            iti.c(this, (wq8) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.H0 == null) {
            this.H0 = new int[4];
        }
        int[] iArr = this.H0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.w0;
        int i2 = dvc.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.x0) ? dvc.state_lifted : -dvc.state_lifted;
        int i3 = dvc.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.x0) ? dvc.state_collapsed : -dvc.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = hfh.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.o = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((gn) getChildAt(i5).getLayoutParams()).c != null) {
                this.o = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.I0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.v0) {
            return;
        }
        if (!this.y0) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((gn) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.w0 != z2) {
            this.w0 = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = hfh.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = dui.e(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof wq8) {
            ((wq8) background).j(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = hfh.a;
        f(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.y0 = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.z0 = -1;
        if (view != null) {
            this.A0 = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.A0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A0 = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.z0 = i;
        WeakReference weakReference = this.A0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.v0 = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.I0;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.I0 = drawableMutate;
            if (drawableMutate instanceof wq8) {
                numValueOf = Integer.valueOf(((wq8) drawableMutate).E0);
            } else {
                ColorStateList colorStateListB = r9j.b(drawableMutate);
                if (colorStateListB != null) {
                    numValueOf = Integer.valueOf(colorStateListB.getDefaultColor());
                }
            }
            this.J0 = numValueOf;
            Drawable drawable3 = this.I0;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.I0.setState(getDrawableState());
                }
                Drawable drawable4 = this.I0;
                WeakHashMap weakHashMap = hfh.a;
                u35.b(drawable4, getLayoutDirection());
                this.I0.setVisible(getVisibility() == 0, false);
                this.I0.setCallback(this);
            }
            if (this.I0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(eri.a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        wni.b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.I0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new gn();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
