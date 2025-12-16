package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import j.N;
import j.X;

/* compiled from: MaterialArcMotion.java */
@X
/* loaded from: classes6.dex */
public final class o extends PathMotion {
    @Override // android.transition.PathMotion
    @N
    public final Path getPath(float f12, float f13, float f14, float f15) {
        Path path = new Path();
        path.moveTo(f12, f13);
        PointF pointF = f13 > f15 ? new PointF(f14, f13) : new PointF(f12, f15);
        path.quadTo(pointF.x, pointF.y, f14, f15);
        return path;
    }
}
