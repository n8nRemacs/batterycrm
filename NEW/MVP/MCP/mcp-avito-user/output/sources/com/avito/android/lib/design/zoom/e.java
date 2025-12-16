package com.avito.android.lib.design.zoom;

import MV.b;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.avito.android.lib.design.zoom.k;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import uW0.C48986a;

/* compiled from: DefaultZoomableController.java */
/* loaded from: classes14.dex */
public class e implements k, b.a {

    /* renamed from: a, reason: collision with root package name */
    public final MV.b f181312a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public k.a f181313b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f181314c = false;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f181315d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f181316e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f181317f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f181318g = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f181319h = new Matrix();

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f181320i = new Matrix();

    /* renamed from: j, reason: collision with root package name */
    public final float[] f181321j = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public final RectF f181322k = new RectF();

    /* compiled from: DefaultZoomableController.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public e(MV.b bVar) {
        this.f181312a = bVar;
        bVar.f10704b = this;
    }

    public static float o(float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13 - f12;
        float f18 = f15 - f14;
        if (f17 < Math.min(f16 - f14, f15 - f16) * 2.0f) {
            return f16 - ((f13 + f12) / 2.0f);
        }
        if (f17 < f18) {
            return f16 < (f14 + f15) / 2.0f ? f14 - f12 : f15 - f13;
        }
        if (f12 > f14) {
            return f14 - f12;
        }
        if (f13 < f15) {
            return f15 - f13;
        }
        return 0.0f;
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final Matrix a() {
        return this.f181319h;
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final void b(RectF rectF) {
        this.f181315d.set(rectF);
    }

    public void c(MV.b bVar) {
        float fHypot;
        C48986a.d(e.class, "onGestureUpdate");
        Matrix matrix = this.f181319h;
        matrix.set(this.f181318g);
        MV.b bVar2 = this.f181312a;
        MV.a aVar = bVar2.f10703a;
        if (aVar.f10696b < 2) {
            fHypot = 1.0f;
        } else {
            float[] fArr = aVar.f10698d;
            float f12 = fArr[1] - fArr[0];
            float[] fArr2 = aVar.f10699e;
            float f13 = fArr2[1] - fArr2[0];
            float[] fArr3 = aVar.f10700f;
            float f14 = fArr3[1] - fArr3[0];
            float[] fArr4 = aVar.f10701g;
            fHypot = ((float) Math.hypot(f14, fArr4[1] - fArr4[0])) / ((float) Math.hypot(f12, f13));
        }
        MV.a aVar2 = bVar2.f10703a;
        matrix.postScale(fHypot, fHypot, MV.b.a(aVar2.f10696b, aVar2.f10698d), MV.b.a(aVar2.f10696b, aVar2.f10699e));
        boolean zP2 = p(matrix, MV.b.a(aVar2.f10696b, aVar2.f10698d), MV.b.a(aVar2.f10696b, aVar2.f10699e));
        matrix.postTranslate(MV.b.a(aVar2.f10696b, aVar2.f10700f) - MV.b.a(aVar2.f10696b, aVar2.f10698d), MV.b.a(aVar2.f10696b, aVar2.f10701g) - MV.b.a(aVar2.f10696b, aVar2.f10699e));
        boolean zQ2 = q(matrix) | zP2;
        t();
        if (zQ2) {
            bVar2.b();
        }
    }

    @Override // com.avito.android.lib.design.zoom.k
    public boolean d() {
        Matrix matrix = this.f181319h;
        float[] fArr = this.f181321j;
        matrix.getValues(fArr);
        fArr[0] = fArr[0] - 1.0f;
        fArr[4] = fArr[4] - 1.0f;
        fArr[8] = fArr[8] - 1.0f;
        for (int i12 = 0; i12 < 9; i12++) {
            if (Math.abs(fArr[i12]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final int e() {
        return (int) this.f181315d.height();
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final int f() {
        return (int) this.f181315d.width();
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final void g(k.a aVar) {
        this.f181313b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    @Override // com.avito.android.lib.design.zoom.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g2(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.zoom.e.g2(android.view.MotionEvent):boolean");
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final float getScaleFactor() {
        return n(this.f181319h);
    }

    public void h(MV.b bVar) {
        C48986a.d(e.class, "onGestureBegin");
        this.f181318g.set(this.f181319h);
        float f12 = this.f181317f.left;
        float f13 = this.f181315d.left;
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final int i() {
        return (int) (this.f181315d.left - this.f181317f.left);
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final boolean isEnabled() {
        return this.f181314c;
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final int j() {
        return (int) (this.f181315d.top - this.f181317f.top);
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final int k() {
        return (int) this.f181317f.height();
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final int l() {
        return (int) this.f181317f.width();
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final void m(RectF rectF) {
        RectF rectF2 = this.f181316e;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        t();
    }

    public final float n(Matrix matrix) {
        float[] fArr = this.f181321j;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public final boolean p(Matrix matrix, float f12, float f13) {
        float fN2 = n(matrix);
        float fMin = Math.min(Math.max(1.0f, fN2), 8.0f);
        if (fMin == fN2) {
            return false;
        }
        float f14 = fMin / fN2;
        matrix.postScale(f14, f14, f12, f13);
        return true;
    }

    public final boolean q(Matrix matrix) {
        RectF rectF = this.f181322k;
        RectF rectF2 = this.f181316e;
        rectF.set(rectF2);
        matrix.mapRect(rectF);
        RectF rectF3 = this.f181315d;
        float fO2 = o(rectF.left, rectF.right, rectF3.left, rectF3.right, rectF2.centerX());
        float fO3 = o(rectF.top, rectF.bottom, rectF3.top, rectF3.bottom, rectF2.centerY());
        if (fO2 == 0.0f && fO3 == 0.0f) {
            return false;
        }
        matrix.postTranslate(fO2, fO3);
        return true;
    }

    public final PointF r(PointF pointF) {
        float f12 = pointF.x;
        float[] fArr = this.f181321j;
        fArr[0] = f12;
        fArr[1] = pointF.y;
        Matrix matrix = this.f181319h;
        Matrix matrix2 = this.f181320i;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr, 0, fArr, 0, 1);
        float f13 = fArr[0];
        RectF rectF = this.f181316e;
        fArr[0] = (f13 - rectF.left) / rectF.width();
        fArr[1] = (fArr[1] - rectF.top) / rectF.height();
        return new PointF(fArr[0], fArr[1]);
    }

    public final void s() {
        j jVar;
        C48986a.d(e.class, "onGestureEnd");
        k.a aVar = this.f181313b;
        if (aVar == null || !this.f181314c || (jVar = ZoomableDraweeView.this.f181294n) == null) {
            return;
        }
        jVar.a();
    }

    @Override // com.avito.android.lib.design.zoom.k
    public final void setEnabled(boolean z12) {
        this.f181314c = z12;
        if (z12) {
            return;
        }
        u();
    }

    public final void t() {
        Matrix matrix = this.f181319h;
        matrix.mapRect(this.f181317f, this.f181316e);
        k.a aVar = this.f181313b;
        if (aVar == null || !this.f181314c) {
            return;
        }
        ZoomableDraweeView zoomableDraweeView = ZoomableDraweeView.this;
        C48986a.e(zoomableDraweeView.getLogTag(), "onTransformChanged: view %x, transform: %s", Integer.valueOf(zoomableDraweeView.hashCode()), matrix);
        zoomableDraweeView.invalidate();
    }

    public void u() {
        C48986a.d(e.class, "reset");
        this.f181312a.f10703a.a();
        this.f181318g.reset();
        this.f181319h.reset();
        t();
    }
}
