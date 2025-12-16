package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class vv2 extends FrameLayout {
    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getId() != m1b.b) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        int measuredHeight = findViewById(m1b.o).getMeasuredHeight();
        int measuredHeight2 = findViewById(m1b.l).getMeasuredHeight();
        Integer numH = dqi.h(this);
        int iIntValue = numH != null ? numH.intValue() : 0;
        Integer numN = dqi.n(this);
        super.measureChildWithMargins(view, i, i2, iMakeMeasureSpec, Math.max(i4, measuredHeight + measuredHeight2 + iIntValue + (numN != null ? numN.intValue() : 0)));
    }
}
