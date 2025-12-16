package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class osd extends CoordinatorLayout implements u6g {
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(yebVar.b().l);
        a93.h(a93.s0.x(getContext()), this);
    }
}
