package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C27291k;
import j.P;

/* compiled from: PathKeyframe.java */
/* loaded from: classes10.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    @P
    public Path f59334q;

    /* renamed from: r, reason: collision with root package name */
    public final com.airbnb.lottie.value.a<PointF> f59335r;

    public i(C27291k c27291k, com.airbnb.lottie.value.a<PointF> aVar) {
        super(c27291k, aVar.f60134b, aVar.f60135c, aVar.f60136d, aVar.f60137e, aVar.f60138f, aVar.f60139g, aVar.f60140h);
        this.f59335r = aVar;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        T t12;
        T t13 = this.f60135c;
        T t14 = this.f60134b;
        boolean z12 = (t13 == 0 || t14 == 0 || !((PointF) t14).equals(((PointF) t13).x, ((PointF) t13).y)) ? false : true;
        if (t14 == 0 || (t12 = this.f60135c) == 0 || z12) {
            return;
        }
        PointF pointF = (PointF) t14;
        PointF pointF2 = (PointF) t12;
        com.airbnb.lottie.value.a<PointF> aVar = this.f59335r;
        PointF pointF3 = aVar.f60147o;
        PointF pointF4 = aVar.f60148p;
        Matrix matrix = com.airbnb.lottie.utils.k.f60123a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f12 = pointF3.x + pointF.x;
            float f13 = pointF.y + pointF3.y;
            float f14 = pointF2.x;
            float f15 = f14 + pointF4.x;
            float f16 = pointF2.y;
            path.cubicTo(f12, f13, f15, f16 + pointF4.y, f14, f16);
        }
        this.f59334q = path;
    }
}
