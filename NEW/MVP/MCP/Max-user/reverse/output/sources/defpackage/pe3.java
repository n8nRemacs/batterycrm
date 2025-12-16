package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pe3 implements hn {
    public final /* synthetic */ re3 a;

    public pe3(re3 re3Var) {
        this.a = re3Var;
    }

    @Override // defpackage.fn
    public final void c0(in inVar, int i) {
        re3 re3Var = this.a;
        ne3 ne3Var = re3Var.x0;
        re3Var.L0 = i;
        g4i g4iVar = re3Var.N0;
        int iD = g4iVar != null ? g4iVar.d() : 0;
        int childCount = re3Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = re3Var.getChildAt(i2);
            oe3 oe3Var = (oe3) childAt.getLayoutParams();
            mgh mghVarB = re3.b(childAt);
            int i3 = oe3Var.a;
            if (i3 == 1) {
                mghVarB.b(dui.e(-i, 0, ((re3Var.getHeight() - re3.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((oe3) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                mghVarB.b(Math.round((-i) * oe3Var.b));
            }
        }
        re3Var.d();
        if (re3Var.C0 != null && iD > 0) {
            WeakHashMap weakHashMap = hfh.a;
            re3Var.postInvalidateOnAnimation();
        }
        int height = re3Var.getHeight();
        WeakHashMap weakHashMap2 = hfh.a;
        int minimumHeight = (height - re3Var.getMinimumHeight()) - iD;
        float scrimVisibleHeightTrigger = height - re3Var.getScrimVisibleHeightTrigger();
        float f = minimumHeight;
        float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
        ne3Var.d = fMin;
        ne3Var.e = utb.i(1.0f, fMin, 0.5f, fMin);
        ne3Var.f = re3Var.L0 + minimumHeight;
        ne3Var.p(Math.abs(i) / f);
    }
}
