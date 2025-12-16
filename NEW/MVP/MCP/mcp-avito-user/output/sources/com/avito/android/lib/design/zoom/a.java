package com.avito.android.lib.design.zoom;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import uW0.C48986a;

/* compiled from: AbstractAnimatedZoomableController.java */
/* loaded from: classes14.dex */
public abstract class a extends e {

    /* renamed from: l, reason: collision with root package name */
    public boolean f181302l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f181303m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f181304n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f181305o;

    /* renamed from: p, reason: collision with root package name */
    public final Matrix f181306p;

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f181307q;

    public a(MV.b bVar) {
        super(bVar);
        this.f181303m = new float[9];
        this.f181304n = new float[9];
        this.f181305o = new float[9];
        this.f181306p = new Matrix();
        this.f181307q = new Matrix();
    }

    @Override // com.avito.android.lib.design.zoom.e, MV.b.a
    public final void c(MV.b bVar) {
        C48986a.g(this.f181302l ? "(ignored)" : "", d.class, "onGestureUpdate %s");
        if (this.f181302l) {
            return;
        }
        super.c(bVar);
    }

    @Override // com.avito.android.lib.design.zoom.e, com.avito.android.lib.design.zoom.k
    public final boolean d() {
        return !this.f181302l && super.d();
    }

    @Override // com.avito.android.lib.design.zoom.e, MV.b.a
    public final void h(MV.b bVar) {
        C48986a.d(d.class, "onGestureBegin");
        w();
        super.h(bVar);
    }

    @Override // com.avito.android.lib.design.zoom.e
    public final void u() {
        C48986a.d(d.class, "reset");
        w();
        this.f181307q.reset();
        this.f181306p.reset();
        super.u();
    }

    public abstract void v(Matrix matrix, long j12);

    public abstract void w();

    public final void x(float f12, PointF pointF, PointF pointF2, long j12) {
        C48986a.g(Long.valueOf(j12), d.class, "zoomToPoint: duration %d ms");
        Matrix matrix = this.f181306p;
        float f13 = pointF.x;
        float[] fArr = this.f181321j;
        fArr[0] = f13;
        fArr[1] = pointF.y;
        RectF rectF = this.f181316e;
        fArr[0] = (rectF.width() * f13) + rectF.left;
        float fHeight = (rectF.height() * fArr[1]) + rectF.top;
        fArr[1] = fHeight;
        float f14 = pointF2.x;
        float f15 = fArr[0];
        float f16 = pointF2.y - fHeight;
        matrix.setScale(f12, f12, f15, fHeight);
        p(matrix, fArr[0], fArr[1]);
        matrix.postTranslate(f14 - f15, f16);
        q(matrix);
        C48986a.g(Long.valueOf(j12), d.class, "setTransform: duration %d ms");
        if (j12 > 0) {
            v(matrix, j12);
            return;
        }
        C48986a.d(d.class, "setTransformImmediate");
        w();
        this.f181307q.set(matrix);
        C48986a.d(e.class, "setTransform");
        this.f181319h.set(matrix);
        t();
        this.f181312a.b();
    }
}
