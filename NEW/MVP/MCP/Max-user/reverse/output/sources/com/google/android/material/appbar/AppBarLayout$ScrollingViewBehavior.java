package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import defpackage.a74;
import defpackage.d74;
import defpackage.dui;
import defpackage.g4i;
import defpackage.hfh;
import defpackage.in;
import defpackage.lgh;
import defpackage.z5d;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends lgh {
    public final Rect c;
    public final Rect d;
    public int e;
    public final int f;

    public AppBarLayout$ScrollingViewBehavior() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    public static in A(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof in) {
                return (in) view;
            }
        }
        return null;
    }

    public final int B(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof in) {
            in inVar = (in) view;
            int totalScrollRange = inVar.getTotalScrollRange();
            int downNestedPreScrollRange = inVar.getDownNestedPreScrollRange();
            a74 a74Var = ((d74) inVar.getLayoutParams()).a;
            int iD = a74Var instanceof AppBarLayout$BaseBehavior ? ((AppBarLayout$BaseBehavior) a74Var).D() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iD > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iD / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return dui.e((int) (f * i2), 0, i2);
    }

    @Override // defpackage.a74
    public final boolean f(View view, View view2) {
        return view2 instanceof in;
    }

    @Override // defpackage.a74
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a74 a74Var = ((d74) view2.getLayoutParams()).a;
        if (a74Var instanceof AppBarLayout$BaseBehavior) {
            int bottom = (((view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) a74Var).j) + this.e) - B(view2);
            WeakHashMap weakHashMap = hfh.a;
            view.offsetTopAndBottom(bottom);
        }
        if (!(view2 instanceof in)) {
            return false;
        }
        in inVar = (in) view2;
        if (!inVar.y0) {
            return false;
        }
        inVar.g(inVar.h(view));
        return false;
    }

    @Override // defpackage.a74
    public final void i(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof in) {
            hfh.n(coordinatorLayout, null);
        }
    }

    @Override // defpackage.a74
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        in inVarA;
        g4i lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (inVarA = A(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = hfh.a;
            if (inVarA.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = inVarA.getTotalScrollRange() + size;
        int measuredHeight = inVarA.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.a74
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        in inVarA = A(coordinatorLayout.d(view));
        if (inVarA != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            int width = coordinatorLayout.getWidth();
            int height = coordinatorLayout.getHeight();
            Rect rect3 = this.c;
            rect3.set(0, 0, width, height);
            if (!rect3.contains(rect2)) {
                inVarA.f(false, !z, true);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lgh
    public final void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        in inVarA = A(coordinatorLayout.d(view));
        if (inVarA == null) {
            coordinatorLayout.q(view, i);
            this.e = 0;
            return;
        }
        d74 d74Var = (d74) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) d74Var).leftMargin;
        int bottom = inVarA.getBottom() + ((ViewGroup.MarginLayoutParams) d74Var).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) d74Var).rightMargin;
        int bottom2 = ((inVarA.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        g4i lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = hfh.a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i2 = d74Var.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iB = B(inVarA);
        view.layout(rect2.left, rect2.top - iB, rect2.right, rect2.bottom - iB);
        this.e = rect2.top - inVarA.getBottom();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.ScrollingViewBehavior_Layout);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
