package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import j.N;

/* compiled from: MaterialArcMotion.java */
/* loaded from: classes6.dex */
public final class o extends androidx.transition.B {
    @Override // androidx.transition.B
    @N
    public final Path a(float f12, float f13, float f14, float f15) {
        Path path = new Path();
        path.moveTo(f12, f13);
        PointF pointF = f13 > f15 ? new PointF(f14, f13) : new PointF(f12, f15);
        path.quadTo(pointF.x, pointF.y, f14, f15);
        return path;
    }
}
