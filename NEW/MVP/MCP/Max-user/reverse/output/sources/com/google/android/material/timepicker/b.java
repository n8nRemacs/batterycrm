package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.I0.d) - clockFaceView.Q0;
        if (height != clockFaceView.G0) {
            clockFaceView.G0 = height;
            clockFaceView.v();
            ClockHandView clockHandView = clockFaceView.I0;
            clockHandView.y0 = clockFaceView.G0;
            clockHandView.invalidate();
        }
        return true;
    }
}
