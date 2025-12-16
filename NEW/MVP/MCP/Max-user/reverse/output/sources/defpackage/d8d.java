package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class d8d extends ViewGroup implements u6g {
    public c8d a;

    public static void a(x7d x7dVar, yeb yebVar) {
        x7dVar.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{yebVar.getText().a, yebVar.getText().e}));
        x7dVar.setBackgroundColors(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{yebVar.b().a.g, yebVar.b().a.h}));
    }

    public final void b(x7d x7dVar, boolean z, int i) {
        if (z) {
            c8d c8dVar = this.a;
            if (c8dVar != null) {
                tcf tcfVar = ((CallRateBottomSheet) c8dVar).P0().Y;
                i8a i8aVar = ((rk1) tcfVar.getValue()).b;
                i8a i8aVar2 = new i8a();
                i8aVar2.b(i8aVar);
                i8aVar2.a(i);
                tcfVar.m(null, rk1.a((rk1) tcfVar.getValue(), null, i8aVar2, 5));
                return;
            }
            return;
        }
        c8d c8dVar2 = this.a;
        if (c8dVar2 != null) {
            tcf tcfVar2 = ((CallRateBottomSheet) c8dVar2).P0().Y;
            i8a i8aVar3 = ((rk1) tcfVar2.getValue()).b;
            i8a i8aVar4 = new i8a();
            i8aVar4.b(i8aVar3);
            i8aVar4.i(i);
            tcfVar2.m(null, rk1.a((rk1) tcfVar2.getValue(), null, i8aVar4, 5));
        }
        x7dVar.setOnTouchListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int iJ = 0;
        int i5 = 0;
        int iJ2 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getMeasuredWidth() + iJ > measuredWidth) {
                float f = 10;
                int iD = (measuredWidth - (iJ - kti.d(vw4.d().getDisplayMetrics().density * f))) / 2;
                while (i5 < i6) {
                    getChildAt(i5).offsetLeftAndRight(iD);
                    i5++;
                }
                iJ2 = utb.j(f, vw4.d().getDisplayMetrics().density, iMax, iJ2);
                iJ = 0;
                iMax = 0;
                i5 = i6;
            }
            childAt.layout(iJ, iJ2, childAt.getMeasuredWidth() + iJ, childAt.getMeasuredHeight() + iJ2);
            iJ = utb.j(10, vw4.d().getDisplayMetrics().density, childAt.getMeasuredWidth(), iJ);
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        int iD2 = (measuredWidth - (iJ - kti.d(10 * vw4.d().getDisplayMetrics().density))) / 2;
        int childCount2 = getChildCount();
        while (i5 < childCount2) {
            getChildAt(i5).offsetLeftAndRight(iD2);
            i5++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount();
        int iMax = 0;
        int measuredWidth = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            int iD = measuredWidth != 0 ? kti.d(10 * vw4.d().getDisplayMetrics().density) : 0;
            if (childAt.getMeasuredWidth() + measuredWidth + iD > size) {
                paddingBottom = utb.j(10, vw4.d().getDisplayMetrics().density, iMax, paddingBottom);
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + iD + childAt.getMeasuredWidth();
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(size, paddingBottom + iMax);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof x7d) {
                a((x7d) childAt, yebVar);
            }
        }
    }

    public final void setListener(c8d c8dVar) {
        this.a = c8dVar;
    }
}
