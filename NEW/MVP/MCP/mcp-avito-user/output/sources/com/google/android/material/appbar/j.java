package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.search.SearchBar;
import j.N;
import j.P;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes6.dex */
abstract class j extends k<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f355832c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f355833d;

    /* renamed from: e, reason: collision with root package name */
    public int f355834e;

    /* renamed from: f, reason: collision with root package name */
    public int f355835f;

    public j() {
        this.f355832c = new Rect();
        this.f355833d = new Rect();
        this.f355834e = 0;
    }

    public float A(View view) {
        return 1.0f;
    }

    public int B(@N View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(@N CoordinatorLayout coordinatorLayout, @N View view, int i12, int i13, int i14) {
        AppBarLayout appBarLayoutZ;
        J0 lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 != -1 && i15 != -2) || (appBarLayoutZ = z(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i14);
        if (size > 0) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (appBarLayoutZ.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.h() + lastWindowInsets.k();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iB2 = size + B(appBarLayoutZ);
        int measuredHeight = appBarLayoutZ.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iB2 -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i12, i13, View.MeasureSpec.makeMeasureSpec(iB2, i15 == -1 ? 1073741824 : BeduinInputModel.MIN_TEXT_VERSION), 0);
        return true;
    }

    @Override // com.google.android.material.appbar.k
    public final void x(@N CoordinatorLayout coordinatorLayout, @N View view, int i12) {
        AppBarLayout appBarLayoutZ = z(coordinatorLayout.getDependencies(view));
        int iB2 = 0;
        if (appBarLayoutZ == null) {
            coordinatorLayout.onLayoutChild(view, i12);
            this.f355834e = 0;
            return;
        }
        CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
        Rect rect = this.f355832c;
        rect.set(paddingLeft, bottom, width, bottom2);
        J0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.i() + rect.left;
                rect.right -= lastWindowInsets.j();
            }
        }
        int i13 = gVar.f44449c;
        if (i13 == 0) {
            i13 = 8388659;
        }
        int i14 = i13;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f355833d;
        Gravity.apply(i14, measuredWidth, measuredHeight, rect, rect2, i12);
        if (this.f355835f != 0) {
            float fA2 = A(appBarLayoutZ);
            int i15 = this.f355835f;
            iB2 = M0.a.b((int) (fA2 * i15), 0, i15);
        }
        view.layout(rect2.left, rect2.top - iB2, rect2.right, rect2.bottom - iB2);
        this.f355834e = rect2.top - appBarLayoutZ.getBottom();
    }

    @P
    public abstract AppBarLayout z(List list);

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f355832c = new Rect();
        this.f355833d = new Rect();
        this.f355834e = 0;
    }
}
