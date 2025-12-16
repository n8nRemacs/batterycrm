package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.e7;
import defpackage.g7;
import defpackage.h7;
import defpackage.i7;
import defpackage.j7;
import defpackage.k7;
import defpackage.lg9;
import defpackage.mni;
import defpackage.og9;
import defpackage.os0;
import defpackage.tf9;
import defpackage.uf9;
import defpackage.usd;
import defpackage.v48;
import defpackage.vf9;
import defpackage.w48;
import defpackage.whh;
import defpackage.zf9;

/* loaded from: classes.dex */
public class ActionMenuView extends w48 implements uf9, og9 {
    public vf9 a;
    public Context b;
    public int c;
    public boolean d;
    public h7 o;
    public os0 s0;
    public tf9 t0;
    public boolean u0;
    public int v0;
    public final int w0;
    public final int x0;
    public k7 y0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.w0 = (int) (56.0f * f);
        this.x0 = (int) (f * 4.0f);
        this.b = context;
        this.c = 0;
    }

    public static j7 d() {
        j7 j7Var = new j7(-2, -2);
        j7Var.a = false;
        ((LinearLayout.LayoutParams) j7Var).gravity = 16;
        return j7Var;
    }

    public static j7 e(ViewGroup.LayoutParams layoutParams) {
        j7 j7Var;
        if (layoutParams == null) {
            return d();
        }
        if (layoutParams instanceof j7) {
            j7 j7Var2 = (j7) layoutParams;
            j7Var = new j7(j7Var2);
            j7Var.a = j7Var2.a;
        } else {
            j7Var = new j7(layoutParams);
        }
        if (((LinearLayout.LayoutParams) j7Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) j7Var).gravity = 16;
        }
        return j7Var;
    }

    @Override // defpackage.uf9
    public final boolean a(zf9 zf9Var) {
        return this.a.q(zf9Var, null, 0);
    }

    @Override // defpackage.og9
    public final void b(vf9 vf9Var) {
        this.a = vf9Var;
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j7;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int i) {
        boolean zD = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof i7)) {
            zD = ((i7) childAt).d();
        }
        return (i <= 0 || !(childAt2 instanceof i7)) ? zD : ((i7) childAt2).e() | zD;
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ v48 generateDefaultLayoutParams() {
        return d();
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ v48 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    public Menu getMenu() {
        if (this.a == null) {
            Context context = getContext();
            vf9 vf9Var = new vf9(context);
            this.a = vf9Var;
            vf9Var.o = new usd(1, this);
            h7 h7Var = new h7(context);
            this.o = h7Var;
            h7Var.v0 = true;
            h7Var.w0 = true;
            lg9 mniVar = this.s0;
            if (mniVar == null) {
                mniVar = new mni();
            }
            h7Var.o = mniVar;
            this.a.b(h7Var, this.b);
            h7 h7Var2 = this.o;
            h7Var2.Z = this;
            this.a = h7Var2.c;
        }
        return this.a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        h7 h7Var = this.o;
        g7 g7Var = h7Var.s0;
        if (g7Var != null) {
            return g7Var.getDrawable();
        }
        if (h7Var.u0) {
            return h7Var.t0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h7 h7Var = this.o;
        if (h7Var != null) {
            h7Var.i();
            if (this.o.j()) {
                this.o.g();
                this.o.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h7 h7Var = this.o;
        if (h7Var != null) {
            h7Var.g();
            e7 e7Var = h7Var.D0;
            if (e7Var == null || !e7Var.b()) {
                return;
            }
            e7Var.i.dismiss();
        }
    }

    @Override // defpackage.w48, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.u0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = whh.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                j7 j7Var = (j7) childAt.getLayoutParams();
                if (j7Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) j7Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) j7Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) j7Var).leftMargin) + ((LinearLayout.LayoutParams) j7Var).rightMargin;
                    f(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                j7 j7Var2 = (j7) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !j7Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) j7Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) j7Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            j7 j7Var3 = (j7) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !j7Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) j7Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) j7Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.w48, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        vf9 vf9Var;
        boolean z = this.u0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.u0 = z2;
        if (z != z2) {
            this.v0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.u0 && (vf9Var = this.a) != null && size != this.v0) {
            this.v0 = size;
            vf9Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.u0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                j7 j7Var = (j7) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) j7Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) j7Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.w0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.x0;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                j7 j7Var2 = (j7) childAt.getLayoutParams();
                j7Var2.f = false;
                j7Var2.c = 0;
                j7Var2.b = 0;
                j7Var2.d = false;
                ((LinearLayout.LayoutParams) j7Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) j7Var2).rightMargin = 0;
                j7Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = j7Var2.a ? 1 : i10;
                j7 j7Var3 = (j7) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                j7Var3.d = !j7Var3.a && z6;
                j7Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (j7Var2.d) {
                    i15++;
                }
                if (j7Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i14;
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                j7 j7Var4 = (j7) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (j7Var4.d) {
                    int i28 = j7Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                j7 j7Var5 = (j7) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && j7Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    j7Var5.b += r11;
                    j7Var5.f = r11;
                    i23--;
                } else if (j7Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((j7) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & (1 << i31)) != 0 && !((j7) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    j7 j7Var6 = (j7) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        j7Var6.c = i32;
                        j7Var6.f = true;
                        if (i33 == 0 && !j7Var6.e) {
                            ((LinearLayout.LayoutParams) j7Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (j7Var6.a) {
                        j7Var6.c = i32;
                        j7Var6.f = true;
                        ((LinearLayout.LayoutParams) j7Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) j7Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) j7Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                j7 j7Var7 = (j7) childAt4.getLayoutParams();
                if (j7Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((j7Var7.b * i22) + j7Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.o.A0 = z;
    }

    public void setOnMenuItemClickListener(k7 k7Var) {
        this.y0 = k7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        h7 h7Var = this.o;
        g7 g7Var = h7Var.s0;
        if (g7Var != null) {
            g7Var.setImageDrawable(drawable);
        } else {
            h7Var.u0 = true;
            h7Var.t0 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.d = z;
    }

    public void setPopupTheme(int i) {
        if (this.c != i) {
            this.c = i;
            if (i == 0) {
                this.b = getContext();
            } else {
                this.b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(h7 h7Var) {
        this.o = h7Var;
        h7Var.Z = this;
        this.a = h7Var.c;
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final v48 generateLayoutParams(AttributeSet attributeSet) {
        return new j7(getContext(), attributeSet);
    }

    @Override // defpackage.w48, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j7(getContext(), attributeSet);
    }
}
