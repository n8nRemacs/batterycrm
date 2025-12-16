package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* loaded from: classes.dex */
public abstract class hy6 extends ViewGroup {
    public static final wx6 F0;
    public static final wx6 G0;
    public static final wx6 H0;
    public static final wx6 I0;
    public static final xx6 J0;
    public static final xx6 K0;
    public static final wx6 L0;
    public static final wx6 M0;
    public static final wx6 N0;
    public final by6 a;
    public final by6 b;
    public int c;
    public boolean d;
    public int o;
    public final int s0;
    public int t0;
    public Printer u0;
    public static final LogPrinter v0 = new LogPrinter(3, hy6.class.getName());
    public static final vx6 w0 = new vx6();
    public static final int x0 = m6d.GridLayout_orientation;
    public static final int y0 = m6d.GridLayout_rowCount;
    public static final int z0 = m6d.GridLayout_columnCount;
    public static final int A0 = m6d.GridLayout_useDefaultMargins;
    public static final int B0 = m6d.GridLayout_alignmentMode;
    public static final int C0 = m6d.GridLayout_rowOrderPreserved;
    public static final int D0 = m6d.GridLayout_columnOrderPreserved;
    public static final wx6 E0 = new wx6(0);

    static {
        wx6 wx6Var = new wx6(1);
        wx6 wx6Var2 = new wx6(2);
        F0 = wx6Var;
        G0 = wx6Var2;
        H0 = wx6Var;
        I0 = wx6Var2;
        J0 = new xx6(wx6Var, wx6Var2);
        K0 = new xx6(wx6Var2, wx6Var);
        L0 = new wx6(3);
        M0 = new wx6(4);
        N0 = new wx6(5);
    }

    public hy6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ContextMenuGridLayout contextMenuGridLayout = (ContextMenuGridLayout) this;
        this.a = new by6(contextMenuGridLayout, true);
        this.b = new by6(contextMenuGridLayout, false);
        this.c = 0;
        this.d = false;
        this.o = 1;
        this.t0 = 0;
        this.u0 = v0;
        this.s0 = context.getResources().getDimensionPixelOffset(awc.default_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m6d.GridLayout);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(y0, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(z0, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(x0, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(A0, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(B0, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(C0, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(D0, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static bxe d(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? E0 : I0 : H0 : N0 : z ? K0 : G0 : z ? J0 : F0 : L0;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(az1.i(str, ". "));
    }

    public static void k(ey6 ey6Var, int i, int i2, int i3, int i4) {
        dy6 dy6Var = new dy6(i, i2 + i);
        gy6 gy6Var = ey6Var.a;
        ey6Var.a = new gy6(gy6Var.a, dy6Var, gy6Var.c, gy6Var.d);
        dy6 dy6Var2 = new dy6(i3, i4 + i3);
        gy6 gy6Var2 = ey6Var.b;
        ey6Var.b = new gy6(gy6Var2.a, dy6Var2, gy6Var2.c, gy6Var2.d);
    }

    public static gy6 l(int i, int i2, bxe bxeVar, float f) {
        return new gy6(i != Integer.MIN_VALUE, new dy6(i, i2 + i), bxeVar, f);
    }

    public final void a(ey6 ey6Var, boolean z) {
        String str = z ? "column" : "row";
        dy6 dy6Var = (z ? ey6Var.b : ey6Var.a).b;
        int i = dy6Var.a;
        if (i != Integer.MIN_VALUE && i < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i2 = (z ? this.a : this.b).b;
        if (i2 != Integer.MIN_VALUE) {
            if (dy6Var.b > i2) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (dy6Var.a() <= i2) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((ey6) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i = this.t0;
        if (i != 0) {
            if (i != b()) {
                this.u0.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z = this.c == 0;
        int i2 = (z ? this.a : this.b).b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int[] iArr = new int[i2];
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            ey6 ey6Var = (ey6) getChildAt(i5).getLayoutParams();
            gy6 gy6Var = z ? ey6Var.a : ey6Var.b;
            dy6 dy6Var = gy6Var.b;
            boolean z2 = gy6Var.a;
            int iA = dy6Var.a();
            if (z2) {
                i3 = dy6Var.a;
            }
            gy6 gy6Var2 = z ? ey6Var.b : ey6Var.a;
            dy6 dy6Var2 = gy6Var2.b;
            boolean z3 = gy6Var2.a;
            int iA2 = dy6Var2.a();
            int i6 = dy6Var2.a;
            if (i2 != 0) {
                iA2 = Math.min(iA2, i2 - (z3 ? Math.min(i6, i2) : 0));
            }
            if (z3) {
                i4 = i6;
            }
            if (i2 != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i7 = i4 + iA2;
                        if (i7 <= i2) {
                            for (int i8 = i4; i8 < i7; i8++) {
                                if (iArr[i8] <= i3) {
                                }
                            }
                            break;
                        }
                        if (z3) {
                            i3++;
                        } else if (i7 <= i2) {
                            i4++;
                        } else {
                            i3++;
                            i4 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + iA2, i2), i3 + iA);
            }
            if (z) {
                k(ey6Var, i3, iA, i4, iA2);
            } else {
                k(ey6Var, i4, iA2, i3, iA);
            }
            i4 += iA2;
        }
        this.t0 = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof ey6)) {
            return false;
        }
        ey6 ey6Var = (ey6) layoutParams;
        a(ey6Var, true);
        a(ey6Var, false);
        return true;
    }

    public final int e(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.o == 1) {
            return f(view, z, z2);
        }
        by6 by6Var = z ? this.a : this.b;
        if (z2) {
            if (by6Var.j == null) {
                by6Var.j = new int[by6Var.f() + 1];
            }
            if (!by6Var.k) {
                by6Var.c(true);
                by6Var.k = true;
            }
            iArr = by6Var.j;
        } else {
            if (by6Var.l == null) {
                by6Var.l = new int[by6Var.f() + 1];
            }
            if (!by6Var.m) {
                by6Var.c(false);
                by6Var.m = true;
            }
            iArr = by6Var.l;
        }
        ey6 ey6Var = (ey6) view.getLayoutParams();
        dy6 dy6Var = (z ? ey6Var.b : ey6Var.a).b;
        return iArr[z2 ? dy6Var.a : dy6Var.b];
    }

    public final int f(View view, boolean z, boolean z2) {
        ey6 ey6Var = (ey6) view.getLayoutParams();
        int i = z ? z2 ? ((ViewGroup.MarginLayoutParams) ey6Var).leftMargin : ((ViewGroup.MarginLayoutParams) ey6Var).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) ey6Var).topMargin : ((ViewGroup.MarginLayoutParams) ey6Var).bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (this.d) {
            gy6 gy6Var = z ? ey6Var.b : ey6Var.a;
            by6 by6Var = z ? this.a : this.b;
            dy6 dy6Var = gy6Var.b;
            if (z) {
                WeakHashMap weakHashMap = hfh.a;
                if (getLayoutDirection() == 1) {
                    z2 = !z2;
                }
            }
            if (!z2) {
                by6Var.f();
            }
            if (view.getClass() != g7f.class && view.getClass() != Space.class) {
                return this.s0 / 2;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ey6();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ey6 ey6Var = new ey6(context, attributeSet);
        gy6 gy6Var = gy6.e;
        ey6Var.a = gy6Var;
        ey6Var.b = gy6Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m6d.GridLayout_Layout);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ey6.d, Integer.MIN_VALUE);
            ((ViewGroup.MarginLayoutParams) ey6Var).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(ey6.e, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) ey6Var).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(ey6.f, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) ey6Var).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(ey6.g, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) ey6Var).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(ey6.h, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m6d.GridLayout_Layout);
            try {
                int i = typedArrayObtainStyledAttributes.getInt(ey6.o, 0);
                int i2 = typedArrayObtainStyledAttributes.getInt(ey6.i, Integer.MIN_VALUE);
                int i3 = ey6.j;
                int i4 = ey6.c;
                ey6Var.b = l(i2, typedArrayObtainStyledAttributes.getInt(i3, i4), d(i, true), typedArrayObtainStyledAttributes.getFloat(ey6.k, 0.0f));
                ey6Var.a = l(typedArrayObtainStyledAttributes.getInt(ey6.l, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(ey6.m, i4), d(i, false), typedArrayObtainStyledAttributes.getFloat(ey6.n, 0.0f));
                return ey6Var;
            } finally {
            }
        } finally {
        }
    }

    public int getAlignmentMode() {
        return this.o;
    }

    public int getColumnCount() {
        return this.a.f();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.u0;
    }

    public int getRowCount() {
        return this.b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.d;
    }

    public final void h() {
        this.t0 = 0;
        by6 by6Var = this.a;
        if (by6Var != null) {
            by6Var.l();
        }
        by6 by6Var2 = this.b;
        if (by6Var2 != null) {
            by6Var2.l();
        }
        if (by6Var == null || by6Var2 == null) {
            return;
        }
        by6Var.m();
        by6Var2.m();
    }

    public final void i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));
    }

    public final void j(int i, int i2, boolean z) {
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                i3 = i;
                i4 = i2;
            } else {
                ey6 ey6Var = (ey6) childAt.getLayoutParams();
                if (z) {
                    i3 = i;
                    i4 = i2;
                    i(childAt, i3, i4, ((ViewGroup.MarginLayoutParams) ey6Var).width, ((ViewGroup.MarginLayoutParams) ey6Var).height);
                } else {
                    i3 = i;
                    i4 = i2;
                    boolean z2 = this.c == 0;
                    gy6 gy6Var = z2 ? ey6Var.b : ey6Var.a;
                    if (gy6Var.a(z2) == N0) {
                        dy6 dy6Var = gy6Var.b;
                        int[] iArrH = (z2 ? this.a : this.b).h();
                        int iE = (iArrH[dy6Var.b] - iArrH[dy6Var.a]) - (e(childAt, z2, false) + e(childAt, z2, true));
                        if (z2) {
                            i(childAt, i3, i4, iE, ((ViewGroup.MarginLayoutParams) ey6Var).height);
                        } else {
                            i(childAt, i3, i4, ((ViewGroup.MarginLayoutParams) ey6Var).width, iE);
                        }
                    }
                }
            }
            i5++;
            i = i3;
            i2 = i4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        hy6 hy6Var = this;
        hy6Var.c();
        int i9 = i3 - i;
        int paddingLeft = hy6Var.getPaddingLeft();
        int paddingTop = hy6Var.getPaddingTop();
        int paddingRight = hy6Var.getPaddingRight();
        int paddingBottom = hy6Var.getPaddingBottom();
        int i10 = (i9 - paddingLeft) - paddingRight;
        by6 by6Var = hy6Var.a;
        by6Var.v.a = i10;
        by6Var.w.a = -i10;
        boolean z3 = false;
        by6Var.q = false;
        by6Var.h();
        int i11 = ((i4 - i2) - paddingTop) - paddingBottom;
        by6 by6Var2 = hy6Var.b;
        by6Var2.v.a = i11;
        by6Var2.w.a = -i11;
        by6Var2.q = false;
        by6Var2.h();
        int[] iArrH = by6Var.h();
        int[] iArrH2 = by6Var2.h();
        int childCount = hy6Var.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = hy6Var.getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i6 = i12;
                i5 = i9;
                i7 = paddingLeft;
                i8 = paddingTop;
                z2 = z3;
            } else {
                ey6 ey6Var = (ey6) childAt.getLayoutParams();
                gy6 gy6Var = ey6Var.b;
                gy6 gy6Var2 = ey6Var.a;
                dy6 dy6Var = gy6Var.b;
                dy6 dy6Var2 = gy6Var2.b;
                int i13 = i12;
                int i14 = iArrH[dy6Var.a];
                int i15 = iArrH2[dy6Var2.a];
                int i16 = iArrH[dy6Var.b];
                int i17 = iArrH2[dy6Var2.b];
                int i18 = i16 - i14;
                int i19 = i17 - i15;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                bxe bxeVarA = gy6Var.a(true);
                bxe bxeVarA2 = gy6Var2.a(false);
                sa9 sa9VarG = by6Var.g();
                cy6 cy6Var = (cy6) ((Object[]) sa9VarG.c)[((int[]) sa9VarG.a)[i13]];
                sa9 sa9VarG2 = by6Var2.g();
                i5 = i9;
                cy6 cy6Var2 = (cy6) ((Object[]) sa9VarG2.c)[((int[]) sa9VarG2.a)[i13]];
                int iE = bxeVarA.e(childAt, i18 - cy6Var.d(true));
                int iE2 = bxeVarA2.e(childAt, i19 - cy6Var2.d(true));
                int iE3 = hy6Var.e(childAt, true, true);
                int iE4 = hy6Var.e(childAt, false, true);
                int iE5 = hy6Var.e(childAt, true, false);
                int i20 = iE3 + iE5;
                int iE6 = iE4 + hy6Var.e(childAt, false, false);
                i6 = i13;
                i7 = paddingLeft;
                i8 = paddingTop;
                z2 = false;
                int iA = cy6Var.a(hy6Var, childAt, bxeVarA, measuredWidth + i20, true);
                int iA2 = cy6Var2.a(this, childAt, bxeVarA2, measuredHeight + iE6, false);
                int iH = bxeVarA.h(measuredWidth, i18 - i20);
                int iH2 = bxeVarA2.h(measuredHeight, i19 - iE6);
                int i21 = i14 + iE + iA;
                WeakHashMap weakHashMap = hfh.a;
                int i22 = getLayoutDirection() == 1 ? (((i5 - iH) - paddingRight) - iE5) - i21 : i7 + iE3 + i21;
                int i23 = i8 + i15 + iE2 + iA2 + iE4;
                if (iH != childAt.getMeasuredWidth() || iH2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iH, 1073741824), View.MeasureSpec.makeMeasureSpec(iH2, 1073741824));
                }
                childAt.layout(i22, i23, iH + i22, iH2 + i23);
            }
            i12 = i6 + 1;
            hy6Var = this;
            paddingLeft = i7;
            paddingTop = i8;
            i9 = i5;
            z3 = z2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iJ;
        int iJ2;
        c();
        by6 by6Var = this.b;
        by6 by6Var2 = this.a;
        if (by6Var2 != null && by6Var != null) {
            by6Var2.m();
            by6Var.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.c == 0) {
            iJ2 = by6Var2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = by6Var.j(iMakeMeasureSpec2);
        } else {
            iJ = by6Var.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = by6Var2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i) {
        this.o = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.a.o(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        by6 by6Var = this.a;
        by6Var.u = z;
        by6Var.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.c != i) {
            this.c = i;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = w0;
        }
        this.u0 = printer;
    }

    public void setRowCount(int i) {
        this.b.o(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        by6 by6Var = this.b;
        by6Var.u = z;
        by6Var.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.d = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ey6) {
            ey6 ey6Var = (ey6) layoutParams;
            ey6 ey6Var2 = new ey6(ey6Var);
            gy6 gy6Var = gy6.e;
            ey6Var2.a = gy6Var;
            ey6Var2.b = gy6Var;
            ey6Var2.a = ey6Var.a;
            ey6Var2.b = ey6Var.b;
            return ey6Var2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ey6 ey6Var3 = new ey6((ViewGroup.MarginLayoutParams) layoutParams);
            gy6 gy6Var2 = gy6.e;
            ey6Var3.a = gy6Var2;
            ey6Var3.b = gy6Var2;
            return ey6Var3;
        }
        ey6 ey6Var4 = new ey6(layoutParams);
        gy6 gy6Var3 = gy6.e;
        ey6Var4.a = gy6Var3;
        ey6Var4.b = gy6Var3;
        return ey6Var4;
    }
}
