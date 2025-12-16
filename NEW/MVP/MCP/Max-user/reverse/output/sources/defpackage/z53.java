package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class z53 extends FrameLayout implements u6g {
    public final m9b a;

    public z53(Context context) {
        super(context);
        m9b m9bVar = new m9b(context);
        m9bVar.setAppearance(b9b.a);
        float f = 28;
        m9bVar.setIndicatorSize(kti.d(vw4.d().getDisplayMetrics().density * f));
        m9bVar.setIndicatorDirection(0);
        m9bVar.setTrackThickness(kti.d(3 * vw4.d().getDisplayMetrics().density));
        m9bVar.setIndicatorTrackGapSize(kti.d(2 * vw4.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams.gravity = 17;
        m9bVar.setLayoutParams(layoutParams);
        this.a = m9bVar;
        addView(m9bVar);
        float f2 = 10;
        setPadding(0, kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density));
        setLayoutParams(new FrameLayout.LayoutParams(-1, u45.c(f, vw4.d().getDisplayMetrics().density, getPaddingBottom() + getPaddingTop())));
    }

    public final m9b getProgress() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(a93.s0.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.onThemeChanged(yebVar);
    }
}
