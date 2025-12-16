package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cga extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ((fwe) childAt).b.d();
            i = i2;
        }
    }

    public final void setTabs(int i) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            View fweVar = new fwe(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(kti.d(86 * vw4.d().getDisplayMetrics().density), kti.d(40 * vw4.d().getDisplayMetrics().density));
            float f = 4;
            marginLayoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
            marginLayoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
            fweVar.setLayoutParams(marginLayoutParams);
            fweVar.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 8.0f));
            fweVar.setBackgroundColor(a93.s0.y(fweVar).b().l);
            tqi.c(new ld0(3, (Continuation) null, 29), fweVar);
            addView(fweVar, i2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (!(i2 < getChildCount())) {
                    return;
                }
                int i3 = i2 + 1;
                View childAt = getChildAt(i2);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                ((fwe) childAt).b.c();
                i2 = i3;
            }
        } else {
            int i4 = 0;
            while (true) {
                if (!(i4 < getChildCount())) {
                    return;
                }
                int i5 = i4 + 1;
                View childAt2 = getChildAt(i4);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                ((fwe) childAt2).b.d();
                i4 = i5;
            }
        }
    }
}
