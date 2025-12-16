package com.avito.android.lib.design.zoom;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;

/* compiled from: ZoomableController.java */
/* loaded from: classes14.dex */
public interface k {

    /* compiled from: ZoomableController.java */
    public interface a {
    }

    Matrix a();

    void b(RectF rectF);

    boolean d();

    int e();

    int f();

    void g(a aVar);

    boolean g2(MotionEvent motionEvent);

    float getScaleFactor();

    int i();

    boolean isEnabled();

    int j();

    int k();

    int l();

    void m(RectF rectF);

    void setEnabled(boolean z12);
}
