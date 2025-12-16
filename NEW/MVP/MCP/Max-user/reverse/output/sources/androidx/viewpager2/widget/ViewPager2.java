package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a;
import defpackage.adf;
import defpackage.ahh;
import defpackage.cv4;
import defpackage.fq5;
import defpackage.g3e;
import defpackage.h3e;
import defpackage.hfh;
import defpackage.k5;
import defpackage.ki0;
import defpackage.phd;
import defpackage.sgh;
import defpackage.tgh;
import defpackage.ugh;
import defpackage.uhd;
import defpackage.v5d;
import defpackage.vgh;
import defpackage.wgh;
import defpackage.xgh;
import defpackage.xk0;
import defpackage.ygh;
import defpackage.zgh;
import defpackage.zva;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public fq5 A0;
    public cv4 B0;
    public uhd C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public zva G0;
    public final Rect a;
    public final Rect b;
    public final ki0 c;
    public int d;
    public boolean o;
    public final sgh s0;
    public vgh t0;
    public int u0;
    public Parcelable v0;
    public zgh w0;
    public ygh x0;
    public h3e y0;
    public ki0 z0;

    public ViewPager2(Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new ki0();
        this.o = false;
        this.s0 = new sgh(0, this);
        this.u0 = -1;
        this.C0 = null;
        this.D0 = false;
        this.E0 = true;
        this.F0 = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.G0 = new zva(this);
        zgh zghVar = new zgh(this, context);
        this.w0 = zghVar;
        zghVar.setId(View.generateViewId());
        this.w0.setDescendantFocusability(131072);
        vgh vghVar = new vgh(this);
        this.t0 = vghVar;
        this.w0.setLayoutManager(vghVar);
        this.w0.setScrollingTouchSlop(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v5d.ViewPager2);
        hfh.m(this, context, v5d.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(v5d.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.w0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.w0.k(new ugh());
            h3e h3eVar = new h3e(this);
            this.y0 = h3eVar;
            this.A0 = new fq5(this, h3eVar, this.w0);
            ygh yghVar = new ygh(this);
            this.x0 = yghVar;
            yghVar.a(this.w0);
            this.w0.m(this.y0);
            ki0 ki0Var = new ki0();
            this.z0 = ki0Var;
            this.y0.a = ki0Var;
            tgh tghVar = new tgh(this, 0);
            tgh tghVar2 = new tgh(this, 1);
            ((ArrayList) ki0Var.b).add(tghVar);
            ((ArrayList) this.z0.b).add(tghVar2);
            zva zvaVar = this.G0;
            zgh zghVar2 = this.w0;
            zvaVar.getClass();
            zghVar2.setImportantForAccessibility(2);
            zvaVar.d = new sgh(1, zvaVar);
            ViewPager2 viewPager2 = (ViewPager2) zvaVar.o;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.z0.b).add(this.c);
            cv4 cv4Var = new cv4(this.t0);
            this.B0 = cv4Var;
            ((ArrayList) this.z0.b).add(cv4Var);
            zgh zghVar3 = this.w0;
            attachViewToParent(zghVar3, 0, zghVar3.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(wgh wghVar) {
        ((ArrayList) this.c.b).add(wghVar);
    }

    public final void c() {
        if (((xgh) this.B0.c) == null) {
            return;
        }
        h3e h3eVar = this.y0;
        h3eVar.g();
        g3e g3eVar = h3eVar.g;
        double d = g3eVar.b + g3eVar.a;
        int i = (int) d;
        float f = (float) (d - i);
        this.B0.b(i, f, Math.round(getPageSize() * f));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.w0.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.w0.canScrollVertically(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        phd adapter;
        if (this.u0 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.v0;
        if (parcelable != null) {
            if (adapter instanceof adf) {
                ((adf) adapter).c(parcelable);
            }
            this.v0 = null;
        }
        int iMax = Math.max(0, Math.min(this.u0, adapter.j() - 1));
        this.d = iMax;
        this.u0 = -1;
        this.w0.x0(iMax);
        this.G0.n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof ahh) {
            int i = ((ahh) parcelable).a;
            sparseArray.put(this.w0.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        if (this.A0.b.m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        f(i, z);
    }

    public final void f(int i, boolean z) {
        phd adapter = getAdapter();
        if (adapter == null) {
            if (this.u0 != -1) {
                this.u0 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.j() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.j() - 1);
        int i2 = this.d;
        if (iMin == i2 && this.y0.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.d = iMin;
        this.G0.n();
        h3e h3eVar = this.y0;
        if (h3eVar.f != 0) {
            h3eVar.g();
            g3e g3eVar = h3eVar.g;
            d = g3eVar.b + g3eVar.a;
        }
        h3e h3eVar2 = this.y0;
        h3eVar2.getClass();
        h3eVar2.e = z ? 2 : 3;
        h3eVar2.m = false;
        boolean z2 = h3eVar2.i != iMin;
        h3eVar2.i = iMin;
        h3eVar2.d(2);
        if (z2) {
            h3eVar2.c(iMin);
        }
        if (!z) {
            this.w0.x0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.w0.B0(iMin);
            return;
        }
        this.w0.x0(d2 > d ? iMin - 3 : iMin + 3);
        zgh zghVar = this.w0;
        zghVar.post(new xk0(iMin, zghVar));
    }

    public final void g(wgh wghVar) {
        ((ArrayList) this.c.b).remove(wghVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.G0.getClass();
        this.G0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public phd getAdapter() {
        return this.w0.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.w0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.F0;
    }

    public int getOrientation() {
        return this.t0.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        zgh zghVar = this.w0;
        if (getOrientation() == 0) {
            height = zghVar.getWidth() - zghVar.getPaddingLeft();
            paddingBottom = zghVar.getPaddingRight();
        } else {
            height = zghVar.getHeight() - zghVar.getPaddingTop();
            paddingBottom = zghVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.y0.f;
    }

    public final void h() {
        ygh yghVar = this.x0;
        if (yghVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewG = yghVar.g(this.t0);
        if (viewG == null) {
            return;
        }
        this.t0.getClass();
        int iN = a.N(viewG);
        if (iN != this.d && getScrollState() == 0) {
            this.z0.c(iN);
        }
        this.o = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iJ;
        int iJ2;
        int iJ3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.G0.o;
        if (viewPager2.getAdapter() == null) {
            iJ = 0;
            iJ2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iJ = viewPager2.getAdapter().j();
            iJ2 = 1;
        } else {
            iJ2 = viewPager2.getAdapter().j();
            iJ = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k5.a(iJ, iJ2, 0).a);
        phd adapter = viewPager2.getAdapter();
        if (adapter == null || (iJ3 = adapter.j()) == 0 || !viewPager2.E0) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.d < iJ3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.w0.getMeasuredWidth();
        int measuredHeight = this.w0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.w0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.o) {
            h();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.w0, i, i2);
        int measuredWidth = this.w0.getMeasuredWidth();
        int measuredHeight = this.w0.getMeasuredHeight();
        int measuredState = this.w0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ahh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ahh ahhVar = (ahh) parcelable;
        super.onRestoreInstanceState(ahhVar.getSuperState());
        this.u0 = ahhVar.b;
        this.v0 = ahhVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ahh ahhVar = new ahh(super.onSaveInstanceState());
        ahhVar.a = this.w0.getId();
        int i = this.u0;
        if (i == -1) {
            i = this.d;
        }
        ahhVar.b = i;
        Parcelable parcelable = this.v0;
        if (parcelable != null) {
            ahhVar.c = parcelable;
            return ahhVar;
        }
        Object adapter = this.w0.getAdapter();
        if (adapter instanceof adf) {
            ahhVar.c = ((adf) adapter).a();
        }
        return ahhVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.G0.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        zva zvaVar = this.G0;
        ViewPager2 viewPager2 = (ViewPager2) zvaVar.o;
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = (ViewPager2) zvaVar.o;
        if (viewPager22.E0) {
            viewPager22.f(currentItem, true);
        }
        return true;
    }

    public void setAdapter(phd phdVar) {
        phd adapter = this.w0.getAdapter();
        zva zvaVar = this.G0;
        if (adapter != null) {
            adapter.B((sgh) zvaVar.d);
        } else {
            zvaVar.getClass();
        }
        sgh sghVar = this.s0;
        if (adapter != null) {
            adapter.B(sghVar);
        }
        this.w0.setAdapter(phdVar);
        this.d = 0;
        d();
        zva zvaVar2 = this.G0;
        zvaVar2.n();
        if (phdVar != null) {
            phdVar.z((sgh) zvaVar2.d);
        }
        if (phdVar != null) {
            phdVar.z(sghVar);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.G0.n();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.F0 = i;
        this.w0.requestLayout();
    }

    public void setOrientation(int i) {
        this.t0.p1(i);
        this.G0.n();
    }

    public void setPageTransformer(xgh xghVar) {
        if (xghVar != null) {
            if (!this.D0) {
                this.C0 = this.w0.getItemAnimator();
                this.D0 = true;
            }
            this.w0.setItemAnimator(null);
        } else if (this.D0) {
            this.w0.setItemAnimator(this.C0);
            this.C0 = null;
            this.D0 = false;
        }
        cv4 cv4Var = this.B0;
        if (xghVar == ((xgh) cv4Var.c)) {
            return;
        }
        cv4Var.c = xghVar;
        c();
    }

    public void setUserInputEnabled(boolean z) {
        this.E0 = z;
        this.G0.n();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new ki0();
        this.o = false;
        this.s0 = new sgh(0, this);
        this.u0 = -1;
        this.C0 = null;
        this.D0 = false;
        this.E0 = true;
        this.F0 = -1;
        a(context, attributeSet);
    }
}
