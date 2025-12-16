package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class j extends l {
    @Override // androidx.constraintlayout.core.widgets.l
    public final void W(int i12, int i13, int i14, int i15) {
        int iU2 = this.f43650A0 + this.f43651B0;
        int iO2 = this.f43657w0 + this.f43658x0;
        if (this.f43648v0 > 0) {
            iU2 += this.f43647u0[0].u();
            iO2 += this.f43647u0[0].o();
        }
        int iMax = Math.max(this.f43436d0, iU2);
        int iMax2 = Math.max(this.f43438e0, iO2);
        if (i12 != 1073741824) {
            i13 = i12 == Integer.MIN_VALUE ? Math.min(iMax, i13) : i12 == 0 ? iMax : 0;
        }
        if (i14 != 1073741824) {
            i15 = i14 == Integer.MIN_VALUE ? Math.min(iMax2, i15) : i14 == 0 ? iMax2 : 0;
        }
        this.f43653D0 = i13;
        this.f43654E0 = i15;
        S(i13);
        P(i15);
        this.f43652C0 = this.f43648v0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.e eVar, boolean z12) {
        super.e(eVar, z12);
        if (this.f43648v0 > 0) {
            ConstraintWidget constraintWidget = this.f43647u0[0];
            constraintWidget.H();
            constraintWidget.f43442g0 = 0.5f;
            constraintWidget.f43440f0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.f43393b;
            constraintWidget.h(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f43395d;
            constraintWidget.h(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f43394c;
            constraintWidget.h(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f43396e;
            constraintWidget.h(type4, this, type4, 0);
        }
    }
}
