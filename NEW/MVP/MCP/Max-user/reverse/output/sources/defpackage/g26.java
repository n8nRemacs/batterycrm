package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes.dex */
public final class g26 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public g26(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(g26 g26Var) {
        FlexboxLayoutManager flexboxLayoutManager = g26Var.h;
        if (flexboxLayoutManager.e1() || !flexboxLayoutManager.t) {
            g26Var.c = g26Var.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.B.m();
        } else {
            g26Var.c = g26Var.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.n - flexboxLayoutManager.B.m();
        }
    }

    public static void b(g26 g26Var) {
        g26Var.a = -1;
        g26Var.b = -1;
        g26Var.c = Integer.MIN_VALUE;
        g26Var.f = false;
        g26Var.g = false;
        FlexboxLayoutManager flexboxLayoutManager = g26Var.h;
        if (flexboxLayoutManager.e1()) {
            int i = flexboxLayoutManager.q;
            if (i == 0) {
                g26Var.e = flexboxLayoutManager.p == 1;
                return;
            } else {
                g26Var.e = i == 2;
                return;
            }
        }
        int i2 = flexboxLayoutManager.q;
        if (i2 == 0) {
            g26Var.e = flexboxLayoutManager.p == 3;
        } else {
            g26Var.e = i2 == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
