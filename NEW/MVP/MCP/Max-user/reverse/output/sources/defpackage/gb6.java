package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class gb6 extends x3b {
    @Override // defpackage.x3b, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(u45.d(8, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i2)) - kti.d(128 * vw4.d().getDisplayMetrics().density), 1073741824));
    }
}
