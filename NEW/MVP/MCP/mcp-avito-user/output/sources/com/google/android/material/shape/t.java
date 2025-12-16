package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import j.N;
import java.util.ArrayList;

/* compiled from: ShapePath.java */
/* loaded from: classes6.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f357125a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f357126b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f357127c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f357128d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f357129e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f357130f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f357131g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f357132h = new ArrayList();

    /* compiled from: ShapePath.java */
    public static class a extends i {

        /* renamed from: c, reason: collision with root package name */
        public final d f357133c;

        public a(d dVar) {
            this.f357133c = dVar;
        }

        @Override // com.google.android.material.shape.t.i
        public final void a(Matrix matrix, @N yY0.b bVar, int i12, @N Canvas canvas) {
            d dVar = this.f357133c;
            bVar.a(canvas, matrix, new RectF(dVar.f357142b, dVar.f357143c, dVar.f357144d, dVar.f357145e), i12, dVar.f357146f, dVar.f357147g);
        }
    }

    /* compiled from: ShapePath.java */
    public static class b extends i {

        /* renamed from: c, reason: collision with root package name */
        public final f f357134c;

        /* renamed from: d, reason: collision with root package name */
        public final f f357135d;

        /* renamed from: e, reason: collision with root package name */
        public final float f357136e;

        /* renamed from: f, reason: collision with root package name */
        public final float f357137f;

        public b(f fVar, f fVar2, float f12, float f13) {
            this.f357134c = fVar;
            this.f357135d = fVar2;
            this.f357136e = f12;
            this.f357137f = f13;
        }

        @Override // com.google.android.material.shape.t.i
        public final void a(Matrix matrix, yY0.b bVar, int i12, Canvas canvas) {
            float f12;
            float f13;
            float f14;
            float fB2 = ((b() - c()) + 360.0f) % 360.0f;
            if (fB2 > 180.0f) {
                fB2 -= 360.0f;
            }
            if (fB2 > 0.0f) {
                return;
            }
            f fVar = this.f357134c;
            float f15 = fVar.f357148b;
            float f16 = this.f357136e;
            double d12 = f15 - f16;
            float f17 = fVar.f357149c;
            float f18 = this.f357137f;
            double dHypot = Math.hypot(d12, f17 - f18);
            f fVar2 = this.f357135d;
            double dHypot2 = Math.hypot(fVar2.f357148b - fVar.f357148b, fVar2.f357149c - fVar.f357149c);
            float fMin = (float) Math.min(i12, Math.min(dHypot, dHypot2));
            double d13 = fMin;
            float f19 = -fB2;
            double dTan = Math.tan(Math.toRadians(f19 / 2.0f)) * d13;
            Matrix matrix2 = this.f357152a;
            if (dHypot > dTan) {
                f12 = 0.0f;
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(f16, f18);
                matrix2.preRotate(c());
                bVar.b(canvas, matrix2, rectF, i12);
            } else {
                f12 = 0.0f;
            }
            float f22 = fMin * 2.0f;
            RectF rectF2 = new RectF(f12, f12, f22, f22);
            matrix2.set(matrix);
            matrix2.preTranslate(fVar.f357148b, fVar.f357149c);
            matrix2.preRotate(c());
            matrix2.preTranslate((float) ((-dTan) - d13), (-2.0f) * fMin);
            int i13 = (int) fMin;
            float[] fArr = {(float) (d13 + dTan), f22};
            bVar.getClass();
            if (fB2 > 0.0f) {
                f14 = 450.0f + fB2;
                f13 = f19;
            } else {
                f13 = fB2;
                f14 = 450.0f;
            }
            float f23 = f14;
            bVar.a(canvas, matrix2, rectF2, i13, f23, f13);
            Path path = bVar.f443181g;
            path.rewind();
            path.moveTo(fArr[0], fArr[1]);
            path.arcTo(rectF2, f23, f13);
            path.close();
            canvas.save();
            canvas.concat(matrix2);
            canvas.scale(1.0f, rectF2.height() / rectF2.width());
            canvas.drawPath(path, bVar.f443182h);
            canvas.drawPath(path, bVar.f443175a);
            canvas.restore();
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(fVar.f357148b, fVar.f357149c);
                matrix2.preRotate(b());
                matrix2.preTranslate((float) dTan, 0.0f);
                bVar.b(canvas, matrix2, rectF3, i12);
            }
        }

        public final float b() {
            float f12 = this.f357135d.f357149c;
            f fVar = this.f357134c;
            return (float) Math.toDegrees(Math.atan((f12 - fVar.f357149c) / (r0.f357148b - fVar.f357148b)));
        }

        public final float c() {
            f fVar = this.f357134c;
            return (float) Math.toDegrees(Math.atan((fVar.f357149c - this.f357137f) / (fVar.f357148b - this.f357136e)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class c extends i {

        /* renamed from: c, reason: collision with root package name */
        public final f f357138c;

        /* renamed from: d, reason: collision with root package name */
        public final float f357139d;

        /* renamed from: e, reason: collision with root package name */
        public final float f357140e;

        public c(f fVar, float f12, float f13) {
            this.f357138c = fVar;
            this.f357139d = f12;
            this.f357140e = f13;
        }

        @Override // com.google.android.material.shape.t.i
        public final void a(Matrix matrix, @N yY0.b bVar, int i12, @N Canvas canvas) {
            f fVar = this.f357138c;
            float f12 = fVar.f357149c;
            float f13 = this.f357140e;
            float f14 = fVar.f357148b;
            float f15 = this.f357139d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f12 - f13, f14 - f15), 0.0f);
            Matrix matrix2 = this.f357152a;
            matrix2.set(matrix);
            matrix2.preTranslate(f15, f13);
            matrix2.preRotate(b());
            bVar.b(canvas, matrix2, rectF, i12);
        }

        public final float b() {
            f fVar = this.f357138c;
            return (float) Math.toDegrees(Math.atan((fVar.f357149c - this.f357140e) / (fVar.f357148b - this.f357139d)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class d extends g {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f357141h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final float f357142b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public final float f357143c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final float f357144d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final float f357145e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f357146f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f357147g;

        public d(float f12, float f13, float f14, float f15) {
            this.f357142b = f12;
            this.f357143c = f13;
            this.f357144d = f14;
            this.f357145e = f15;
        }

        @Override // com.google.android.material.shape.t.g
        public final void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f357150a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f357141h;
            rectF.set(this.f357142b, this.f357143c, this.f357144d, this.f357145e);
            path.arcTo(rectF, this.f357146f, this.f357147g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class e extends g {
        @Override // com.google.android.material.shape.t.g
        public final void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f357150a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        public float f357148b;

        /* renamed from: c, reason: collision with root package name */
        public float f357149c;

        @Override // com.google.android.material.shape.t.g
        public final void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f357150a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f357148b, this.f357149c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f357150a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    public static class h extends g {
        @Override // com.google.android.material.shape.t.g
        public final void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f357150a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(0.0f, 0.0f, 0.0f, 0.0f);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class i {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f357151b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f357152a = new Matrix();

        public abstract void a(Matrix matrix, yY0.b bVar, int i12, Canvas canvas);
    }

    public t() {
        f(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f12, float f13, float f14, float f15, float f16, float f17) {
        d dVar = new d(f12, f13, f14, f15);
        dVar.f357146f = f16;
        dVar.f357147g = f17;
        this.f357131g.add(dVar);
        a aVar = new a(dVar);
        float f18 = f16 + f17;
        boolean z12 = f17 < 0.0f;
        if (z12) {
            f16 = (f16 + 180.0f) % 360.0f;
        }
        float f19 = z12 ? (180.0f + f18) % 360.0f : f18;
        b(f16);
        this.f357132h.add(aVar);
        this.f357129e = f19;
        double d12 = f18;
        this.f357127c = (((f14 - f12) / 2.0f) * ((float) Math.cos(Math.toRadians(d12)))) + ((f12 + f14) * 0.5f);
        this.f357128d = (((f15 - f13) / 2.0f) * ((float) Math.sin(Math.toRadians(d12)))) + ((f13 + f15) * 0.5f);
    }

    public final void b(float f12) {
        float f13 = this.f357129e;
        if (f13 == f12) {
            return;
        }
        float f14 = ((f12 - f13) + 360.0f) % 360.0f;
        if (f14 > 180.0f) {
            return;
        }
        float f15 = this.f357127c;
        float f16 = this.f357128d;
        d dVar = new d(f15, f16, f15, f16);
        dVar.f357146f = this.f357129e;
        dVar.f357147g = f14;
        this.f357132h.add(new a(dVar));
        this.f357129e = f12;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f357131g;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((g) arrayList.get(i12)).a(matrix, path);
        }
    }

    public final void d(float f12, float f13) {
        f fVar = new f();
        fVar.f357148b = f12;
        fVar.f357149c = f13;
        this.f357131g.add(fVar);
        c cVar = new c(fVar, this.f357127c, this.f357128d);
        float fB2 = cVar.b() + 270.0f;
        float fB3 = cVar.b() + 270.0f;
        b(fB2);
        this.f357132h.add(cVar);
        this.f357129e = fB3;
        this.f357127c = f12;
        this.f357128d = f13;
    }

    public final void e(float f12, float f13, float f14) {
        if ((Math.abs(f12 - this.f357127c) < 0.001f && Math.abs(0.0f - this.f357128d) < 0.001f) || (Math.abs(f12 - f13) < 0.001f && Math.abs(0.0f - f14) < 0.001f)) {
            d(f13, f14);
            return;
        }
        f fVar = new f();
        fVar.f357148b = f12;
        fVar.f357149c = 0.0f;
        ArrayList arrayList = this.f357131g;
        arrayList.add(fVar);
        f fVar2 = new f();
        fVar2.f357148b = f13;
        fVar2.f357149c = f14;
        arrayList.add(fVar2);
        b bVar = new b(fVar, fVar2, this.f357127c, this.f357128d);
        float fB2 = ((bVar.b() - bVar.c()) + 360.0f) % 360.0f;
        if (fB2 > 180.0f) {
            fB2 -= 360.0f;
        }
        if (fB2 > 0.0f) {
            d(f12, 0.0f);
            d(f13, f14);
            return;
        }
        float fC2 = bVar.c() + 270.0f;
        float fB3 = bVar.b() + 270.0f;
        b(fC2);
        this.f357132h.add(bVar);
        this.f357129e = fB3;
        this.f357127c = f13;
        this.f357128d = f14;
    }

    public final void f(float f12, float f13, float f14, float f15) {
        this.f357125a = f12;
        this.f357126b = f13;
        this.f357127c = f12;
        this.f357128d = f13;
        this.f357129e = f14;
        this.f357130f = (f14 + f15) % 360.0f;
        this.f357131g.clear();
        this.f357132h.clear();
    }
}
