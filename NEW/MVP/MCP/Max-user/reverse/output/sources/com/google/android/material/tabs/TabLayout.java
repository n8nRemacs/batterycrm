package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import defpackage.cyf;
import defpackage.d6c;
import defpackage.d7g;
import defpackage.dvc;
import defpackage.dwc;
import defpackage.e6c;
import defpackage.emb;
import defpackage.er8;
import defpackage.eri;
import defpackage.exi;
import defpackage.eyf;
import defpackage.fyf;
import defpackage.gti;
import defpackage.gyf;
import defpackage.hfh;
import defpackage.hyf;
import defpackage.iti;
import defpackage.iyf;
import defpackage.jyf;
import defpackage.k5;
import defpackage.kyf;
import defpackage.m5d;
import defpackage.nd6;
import defpackage.ngh;
import defpackage.o6d;
import defpackage.r9j;
import defpackage.rg;
import defpackage.t35;
import defpackage.veh;
import defpackage.wk0;
import defpackage.wq8;
import defpackage.wsi;
import defpackage.y95;
import defpackage.yqi;
import defpackage.z5d;
import defpackage.z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.apache.http.HttpStatus;

@ngh
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int g1 = m5d.Widget_Design_TabLayout;
    public static final e6c h1 = new e6c(16);
    public ColorStateList A0;
    public Drawable B0;
    public int C0;
    public final float D0;
    public final float E0;
    public final int F0;
    public int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public int L0;
    public final int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public cyf U0;
    public final TimeInterpolator V0;
    public fyf W0;
    public final ArrayList X0;
    public nd6 Y0;
    public ValueAnimator Z0;
    public int a;
    public ViewPager a1;
    public final ArrayList b;
    public jyf b1;
    public iyf c;
    public eyf c1;
    public final hyf d;
    public boolean d1;
    public int e1;
    public final d6c f1;
    public final int o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public ColorStateList y0;
    public ColorStateList z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = dvc.tabStyle;
        int i2 = g1;
        super(er8.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = -1;
        this.b = new ArrayList();
        this.x0 = -1;
        this.C0 = 0;
        this.G0 = Integer.MAX_VALUE;
        this.R0 = -1;
        this.X0 = new ArrayList();
        this.f1 = new d6c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        hyf hyfVar = new hyf(this, context2);
        this.d = hyfVar;
        super.addView(hyfVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = d7g.d(context2, attributeSet, z5d.TabLayout, i, i2, z5d.TabLayout_tabTextAppearance);
        ColorStateList colorStateListB = r9j.b(getBackground());
        if (colorStateListB != null) {
            wq8 wq8Var = new wq8();
            wq8Var.k(colorStateListB);
            wq8Var.i(context2);
            WeakHashMap weakHashMap = hfh.a;
            wq8Var.j(veh.i(this));
            setBackground(wq8Var);
        }
        setSelectedTabIndicator(gti.e(context2, typedArrayD, z5d.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayD.getColor(z5d.TabLayout_tabIndicatorColor, 0));
        hyfVar.b(typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(z5d.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(z5d.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(z5d.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabPadding, 0);
        this.u0 = dimensionPixelSize;
        this.t0 = dimensionPixelSize;
        this.s0 = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.o = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.s0 = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.t0 = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.u0 = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (wsi.f(dvc.isMaterial3Theme, context2, false)) {
            this.v0 = dvc.textAppearanceTitleSmall;
        } else {
            this.v0 = dvc.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(z5d.TabLayout_tabTextAppearance, m5d.TextAppearance_Design_Tab);
        this.w0 = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, o6d.TextAppearance);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.TextAppearance_android_textSize, 0);
            this.D0 = dimensionPixelSize2;
            this.y0 = gti.c(context2, typedArrayObtainStyledAttributes, o6d.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(z5d.TabLayout_tabSelectedTextAppearance)) {
                this.x0 = typedArrayD.getResourceId(z5d.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i3 = this.x0;
            if (i3 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i3, o6d.TextAppearance);
                try {
                    typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.TextAppearance_android_textSize, (int) dimensionPixelSize2);
                    ColorStateList colorStateListC = gti.c(context2, typedArrayObtainStyledAttributes, o6d.TextAppearance_android_textColor);
                    if (colorStateListC != null) {
                        this.y0 = f(this.y0.getDefaultColor(), colorStateListC.getColorForState(new int[]{R.attr.state_selected}, colorStateListC.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayD.hasValue(z5d.TabLayout_tabTextColor)) {
                this.y0 = gti.c(context2, typedArrayD, z5d.TabLayout_tabTextColor);
            }
            if (typedArrayD.hasValue(z5d.TabLayout_tabSelectedTextColor)) {
                this.y0 = f(this.y0.getDefaultColor(), typedArrayD.getColor(z5d.TabLayout_tabSelectedTextColor, 0));
            }
            this.z0 = gti.c(context2, typedArrayD, z5d.TabLayout_tabIconTint);
            yqi.f(typedArrayD.getInt(z5d.TabLayout_tabIconTintMode, -1), null);
            this.A0 = gti.c(context2, typedArrayD, z5d.TabLayout_tabRippleColor);
            this.M0 = typedArrayD.getInt(z5d.TabLayout_tabIndicatorAnimationDuration, HttpStatus.SC_MULTIPLE_CHOICES);
            this.V0 = exi.d(context2, dvc.motionEasingEmphasizedInterpolator, rg.b);
            this.H0 = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabMinWidth, -1);
            this.I0 = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabMaxWidth, -1);
            this.F0 = typedArrayD.getResourceId(z5d.TabLayout_tabBackground, 0);
            this.K0 = typedArrayD.getDimensionPixelSize(z5d.TabLayout_tabContentStart, 0);
            this.O0 = typedArrayD.getInt(z5d.TabLayout_tabMode, 1);
            this.L0 = typedArrayD.getInt(z5d.TabLayout_tabGravity, 0);
            this.P0 = typedArrayD.getBoolean(z5d.TabLayout_tabInlineLabel, false);
            this.T0 = typedArrayD.getBoolean(z5d.TabLayout_tabUnboundedRipple, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.E0 = resources.getDimensionPixelSize(dwc.design_tab_text_size_2line);
            this.J0 = resources.getDimensionPixelSize(dwc.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.H0;
        if (i != -1) {
            return i;
        }
        int i2 = this.O0;
        if (i2 == 0 || i2 == 2) {
            return this.J0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        hyf hyfVar = this.d;
        int childCount = hyfVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = hyfVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof kyf) {
                        ((kyf) childAt).f();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(fyf fyfVar) {
        ArrayList arrayList = this.X0;
        if (arrayList.contains(fyfVar)) {
            return;
        }
        arrayList.add(fyfVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(iyf iyfVar, int i, boolean z) {
        if (iyfVar.c != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        iyfVar.a = i;
        ArrayList arrayList = this.b;
        arrayList.add(i, iyfVar);
        int size = arrayList.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((iyf) arrayList.get(i3)).a == this.a) {
                i2 = i3;
            }
            ((iyf) arrayList.get(i3)).a = i3;
        }
        this.a = i2;
        kyf kyfVar = iyfVar.d;
        kyfVar.setSelected(false);
        kyfVar.setActivated(false);
        int i4 = iyfVar.a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.O0 == 1 && this.L0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.d.addView(kyfVar, i4, layoutParams);
        if (z) {
            iyfVar.a();
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = hfh.a;
            if (isLaidOut()) {
                hyf hyfVar = this.d;
                int childCount = hyfVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (hyfVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iE = e(i, 0.0f);
                if (scrollX != iE) {
                    g();
                    this.Z0.setIntValues(scrollX, iE);
                    this.Z0.start();
                }
                ValueAnimator valueAnimator = hyfVar.a;
                if (valueAnimator != null && valueAnimator.isRunning() && hyfVar.b.a != i) {
                    hyfVar.a.cancel();
                }
                hyfVar.d(i, this.M0, true);
                return;
            }
        }
        o(i, 0.0f, true, true, true);
    }

    public final void d() {
        int i = this.O0;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.K0 - this.o) : 0;
        WeakHashMap weakHashMap = hfh.a;
        hyf hyfVar = this.d;
        hyfVar.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.O0;
        if (i2 == 0) {
            int i3 = this.L0;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                hyfVar.setGravity(1);
            } else if (i3 == 2) {
            }
            hyfVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.L0 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            hyfVar.setGravity(1);
        }
        q(true);
    }

    public final int e(int i, float f) {
        hyf hyfVar;
        View childAt;
        int i2 = this.O0;
        if ((i2 != 0 && i2 != 2) || (childAt = (hyfVar = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < hyfVar.getChildCount() ? hyfVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = hfh.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void g() {
        if (this.Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Z0 = valueAnimator;
            valueAnimator.setInterpolator(this.V0);
            this.Z0.setDuration(this.M0);
            this.Z0.addUpdateListener(new wk0(6, this));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        iyf iyfVar = this.c;
        if (iyfVar != null) {
            return iyfVar.a;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.L0;
    }

    public ColorStateList getTabIconTint() {
        return this.z0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.S0;
    }

    public int getTabIndicatorGravity() {
        return this.N0;
    }

    public int getTabMaxWidth() {
        return this.G0;
    }

    public int getTabMode() {
        return this.O0;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.B0;
    }

    public ColorStateList getTabTextColors() {
        return this.y0;
    }

    public final iyf h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (iyf) this.b.get(i);
    }

    public final iyf i() {
        iyf iyfVar = (iyf) h1.a();
        if (iyfVar == null) {
            iyfVar = new iyf();
            iyfVar.a = -1;
        }
        iyfVar.c = this;
        d6c d6cVar = this.f1;
        kyf kyfVar = d6cVar != null ? (kyf) d6cVar.a() : null;
        if (kyfVar == null) {
            kyfVar = new kyf(this, getContext());
        }
        kyfVar.setTab(iyfVar);
        kyfVar.setFocusable(true);
        kyfVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            kyfVar.setContentDescription(null);
        } else {
            kyfVar.setContentDescription(null);
        }
        iyfVar.d = kyfVar;
        return iyfVar;
    }

    public final void j() {
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            m(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            iyf iyfVar = (iyf) it.next();
            it.remove();
            iyfVar.c = null;
            iyfVar.d = null;
            iyfVar.a = -1;
            iyfVar.b = null;
            h1.b(iyfVar);
        }
        this.c = null;
    }

    public final void k(fyf fyfVar) {
        this.X0.remove(fyfVar);
    }

    public final void l(int i) {
        iyf iyfVar = this.c;
        int i2 = iyfVar != null ? iyfVar.a : 0;
        m(i);
        ArrayList arrayList = this.b;
        iyf iyfVar2 = (iyf) arrayList.remove(i);
        int i3 = -1;
        if (iyfVar2 != null) {
            iyfVar2.c = null;
            iyfVar2.d = null;
            iyfVar2.a = -1;
            iyfVar2.b = null;
            h1.b(iyfVar2);
        }
        int size = arrayList.size();
        for (int i4 = i; i4 < size; i4++) {
            if (((iyf) arrayList.get(i4)).a == this.a) {
                i3 = i4;
            }
            ((iyf) arrayList.get(i4)).a = i4;
        }
        this.a = i3;
        if (i2 == i) {
            n(arrayList.isEmpty() ? null : (iyf) arrayList.get(Math.max(0, i - 1)), true);
        }
    }

    public final void m(int i) {
        hyf hyfVar = this.d;
        kyf kyfVar = (kyf) hyfVar.getChildAt(i);
        hyfVar.removeViewAt(i);
        if (kyfVar != null) {
            kyfVar.setTab(null);
            kyfVar.setSelected(false);
            this.f1.b(kyfVar);
        }
        requestLayout();
    }

    public final void n(iyf iyfVar, boolean z) {
        TabLayout tabLayout;
        iyf iyfVar2 = this.c;
        ArrayList arrayList = this.X0;
        if (iyfVar2 == iyfVar) {
            if (iyfVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((fyf) arrayList.get(size)).getClass();
                }
                c(iyfVar.a);
                return;
            }
            return;
        }
        int i = iyfVar != null ? iyfVar.a : -1;
        if (z) {
            if ((iyfVar2 == null || iyfVar2.a == -1) && i != -1) {
                tabLayout = this;
                tabLayout.o(i, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.c = iyfVar;
        if (iyfVar2 != null && iyfVar2.c != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((fyf) arrayList.get(size2)).getClass();
            }
        }
        if (iyfVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((fyf) arrayList.get(size3)).a(iyfVar);
            }
        }
    }

    public final void o(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            hyf hyfVar = this.d;
            if (iRound >= hyfVar.getChildCount()) {
                return;
            }
            if (z2) {
                hyfVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = hyfVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    hyfVar.a.cancel();
                }
                hyfVar.c(hyfVar.getChildAt(i), hyfVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.Z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Z0.cancel();
            }
            int iE = e(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iE >= scrollX) || (i > getSelectedTabPosition() && iE <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = hfh.a;
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iE <= scrollX) || (i > getSelectedTabPosition() && iE >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.e1 == 1 || z3) {
                if (i < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof wq8) {
            iti.c(this, (wq8) background);
        }
        if (this.a1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                p((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d1) {
            setupWithViewPager(null);
            this.d1 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kyf kyfVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            hyf hyfVar = this.d;
            if (i >= hyfVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = hyfVar.getChildAt(i);
            if ((childAt instanceof kyf) && (drawable = (kyfVar = (kyf) childAt).v0) != null) {
                drawable.setBounds(kyfVar.getLeft(), kyfVar.getTop(), kyfVar.getRight(), kyfVar.getBottom());
                kyfVar.v0.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k5.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = defpackage.yqi.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.I0
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.yqi.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.G0 = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.O0
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(ViewPager viewPager, boolean z) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.a1;
        if (viewPager2 != null) {
            jyf jyfVar = this.b1;
            if (jyfVar != null && (arrayList2 = viewPager2.Q0) != null) {
                arrayList2.remove(jyfVar);
            }
            eyf eyfVar = this.c1;
            if (eyfVar != null && (arrayList = this.a1.S0) != null) {
                arrayList.remove(eyfVar);
            }
        }
        fyf fyfVar = this.Y0;
        if (fyfVar != null) {
            k(fyfVar);
            this.Y0 = null;
        }
        if (viewPager != null) {
            this.a1 = viewPager;
            if (this.b1 == null) {
                this.b1 = new jyf(this);
            }
            jyf jyfVar2 = this.b1;
            jyfVar2.c = 0;
            jyfVar2.b = 0;
            if (viewPager.Q0 == null) {
                viewPager.Q0 = new ArrayList();
            }
            viewPager.Q0.add(jyfVar2);
            nd6 nd6Var = new nd6(3, viewPager);
            this.Y0 = nd6Var;
            a(nd6Var);
            viewPager.getAdapter();
            if (this.c1 == null) {
                this.c1 = new eyf(this);
            }
            eyf eyfVar2 = this.c1;
            eyfVar2.getClass();
            if (viewPager.S0 == null) {
                viewPager.S0 = new ArrayList();
            }
            viewPager.S0.add(eyfVar2);
            tabLayout = this;
            tabLayout.o(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.a1 = null;
            j();
        }
        tabLayout.d1 = z;
    }

    public final void q(boolean z) {
        int i = 0;
        while (true) {
            hyf hyfVar = this.d;
            if (i >= hyfVar.getChildCount()) {
                return;
            }
            View childAt = hyfVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.O0 == 1 && this.L0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof wq8) {
            ((wq8) background).j(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.P0 == z) {
            return;
        }
        this.P0 = z;
        int i = 0;
        while (true) {
            hyf hyfVar = this.d;
            if (i >= hyfVar.getChildCount()) {
                d();
                return;
            }
            View childAt = hyfVar.getChildAt(i);
            if (childAt instanceof kyf) {
                kyf kyfVar = (kyf) childAt;
                kyfVar.setOrientation(!kyfVar.x0.P0 ? 1 : 0);
                TextView textView = kyfVar.t0;
                if (textView == null && kyfVar.u0 == null) {
                    kyfVar.g(kyfVar.b, kyfVar.c, true);
                } else {
                    kyfVar.g(textView, kyfVar.u0, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(gyf gyfVar) {
        setOnTabSelectedListener((fyf) gyfVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.Z0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.B0 = drawableMutate;
        int i = this.C0;
        if (i != 0) {
            t35.g(drawableMutate, i);
        } else {
            t35.h(drawableMutate, null);
        }
        int intrinsicHeight = this.R0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.B0.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.C0 = i;
        Drawable drawable = this.B0;
        if (i != 0) {
            t35.g(drawable, i);
        } else {
            t35.h(drawable, null);
        }
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            WeakHashMap weakHashMap = hfh.a;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.R0 = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.L0 != i) {
            this.L0 = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                kyf kyfVar = ((iyf) arrayList.get(i)).d;
                if (kyfVar != null) {
                    kyfVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(z7.c(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.S0 = i;
        if (i == 0) {
            this.U0 = new cyf();
            return;
        }
        if (i == 1) {
            this.U0 = new y95(0);
        } else {
            if (i == 2) {
                this.U0 = new y95(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.Q0 = z;
        int i = hyf.c;
        hyf hyfVar = this.d;
        hyfVar.a(hyfVar.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = hfh.a;
        hyfVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.O0) {
            this.O0 = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0 == colorStateList) {
            return;
        }
        this.A0 = colorStateList;
        int i = 0;
        while (true) {
            hyf hyfVar = this.d;
            if (i >= hyfVar.getChildCount()) {
                return;
            }
            View childAt = hyfVar.getChildAt(i);
            if (childAt instanceof kyf) {
                Context context = getContext();
                int i2 = kyf.y0;
                ((kyf) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(z7.c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                kyf kyfVar = ((iyf) arrayList.get(i)).d;
                if (kyfVar != null) {
                    kyfVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(emb embVar) {
        j();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.T0 == z) {
            return;
        }
        this.T0 = z;
        int i = 0;
        while (true) {
            hyf hyfVar = this.d;
            if (i >= hyfVar.getChildCount()) {
                return;
            }
            View childAt = hyfVar.getChildAt(i);
            if (childAt instanceof kyf) {
                Context context = getContext();
                int i2 = kyf.y0;
                ((kyf) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        p(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(fyf fyfVar) {
        fyf fyfVar2 = this.W0;
        if (fyfVar2 != null) {
            k(fyfVar2);
        }
        this.W0 = fyfVar;
        if (fyfVar != null) {
            a(fyfVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(eri.a(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
