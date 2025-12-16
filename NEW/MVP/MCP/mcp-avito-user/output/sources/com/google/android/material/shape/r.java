package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.X;
import j.j0;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes6.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final t[] f357105a = new t[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f357106b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f357107c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f357108d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f357109e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f357110f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final t f357111g = new t();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f357112h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f357113i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f357114j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f357115k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f357116l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f357117a = new r();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    @RestrictTo
    public interface b {
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final q f357118a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final Path f357119b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final RectF f357120c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final b f357121d;

        /* renamed from: e, reason: collision with root package name */
        public final float f357122e;

        public c(@N q qVar, float f12, RectF rectF, @P b bVar, Path path) {
            this.f357121d = bVar;
            this.f357118a = qVar;
            this.f357122e = f12;
            this.f357120c = rectF;
            this.f357119b = path;
        }
    }

    public r() {
        for (int i12 = 0; i12 < 4; i12++) {
            this.f357105a[i12] = new t();
            this.f357106b[i12] = new Matrix();
            this.f357107c[i12] = new Matrix();
        }
    }

    @j0
    @N
    @RestrictTo
    public static r b() {
        return a.f357117a;
    }

    @RestrictTo
    public final void a(q qVar, float f12, RectF rectF, b bVar, @N Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        char c12;
        int i12;
        float[] fArr;
        float f13;
        RectF rectF2;
        q qVar2;
        c cVar;
        Path path2;
        b bVar2;
        Path path3;
        Path path4;
        int i13;
        r rVar = this;
        path.rewind();
        Path path5 = rVar.f357109e;
        path5.rewind();
        Path path6 = rVar.f357110f;
        path6.rewind();
        path6.addRect(rectF, Path.Direction.CW);
        c cVar2 = new c(qVar, f12, rectF, bVar, path);
        int i14 = 0;
        while (true) {
            matrixArr = rVar.f357107c;
            matrixArr2 = rVar.f357106b;
            tVarArr = rVar.f357105a;
            c12 = 1;
            fArr = rVar.f357112h;
            f13 = cVar2.f357122e;
            rectF2 = cVar2.f357120c;
            qVar2 = cVar2.f357118a;
            if (i14 >= 4) {
                break;
            }
            e eVar = i14 != 1 ? i14 != 2 ? i14 != 3 ? qVar2.f357086f : qVar2.f357085e : qVar2.f357088h : qVar2.f357087g;
            f fVar = i14 != 1 ? i14 != 2 ? i14 != 3 ? qVar2.f357082b : qVar2.f357081a : qVar2.f357084d : qVar2.f357083c;
            t tVar = tVarArr[i14];
            fVar.getClass();
            fVar.a(tVar, f13, eVar.a(rectF2));
            int i15 = i14 + 1;
            float f14 = (i15 % 4) * 90;
            matrixArr2[i14].reset();
            PointF pointF = rVar.f357108d;
            if (i14 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i14 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i14 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i14].setTranslate(pointF.x, pointF.y);
            matrixArr2[i14].preRotate(f14);
            t tVar2 = tVarArr[i14];
            fArr[0] = tVar2.f357127c;
            fArr[1] = tVar2.f357128d;
            matrixArr2[i14].mapPoints(fArr);
            matrixArr[i14].reset();
            matrixArr[i14].setTranslate(fArr[0], fArr[1]);
            matrixArr[i14].preRotate(f14);
            i14 = i15;
        }
        int i16 = 0;
        for (i12 = 4; i16 < i12; i12 = 4) {
            t tVar3 = tVarArr[i16];
            fArr[0] = tVar3.f357125a;
            fArr[c12] = tVar3.f357126b;
            matrixArr2[i16].mapPoints(fArr);
            Path path7 = cVar2.f357119b;
            if (i16 == 0) {
                path7.moveTo(fArr[0], fArr[c12]);
            } else {
                path7.lineTo(fArr[0], fArr[c12]);
            }
            tVarArr[i16].c(matrixArr2[i16], path7);
            b bVar3 = cVar2.f357121d;
            if (bVar3 != null) {
                t tVar4 = tVarArr[i16];
                Matrix matrix = matrixArr2[i16];
                cVar = cVar2;
                k kVar = k.this;
                bVar2 = bVar3;
                BitSet bitSet = kVar.f357037e;
                tVar4.getClass();
                path2 = path7;
                bitSet.set(i16, false);
                tVar4.b(tVar4.f357130f);
                kVar.f357035c[i16] = new s(new ArrayList(tVar4.f357132h), new Matrix(matrix));
            } else {
                cVar = cVar2;
                path2 = path7;
                bVar2 = bVar3;
            }
            int i17 = i16 + 1;
            int i18 = i17 % 4;
            t tVar5 = tVarArr[i16];
            fArr[0] = tVar5.f357127c;
            fArr[1] = tVar5.f357128d;
            matrixArr2[i16].mapPoints(fArr);
            t tVar6 = tVarArr[i18];
            float f15 = tVar6.f357125a;
            float[] fArr2 = rVar.f357113i;
            fArr2[0] = f15;
            fArr2[1] = tVar6.f357126b;
            matrixArr2[i18].mapPoints(fArr2);
            Path path8 = path5;
            Path path9 = path6;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i16];
            fArr[0] = tVar7.f357127c;
            fArr[1] = tVar7.f357128d;
            matrixArr2[i16].mapPoints(fArr);
            float fAbs = (i16 == 1 || i16 == 3) ? Math.abs(rectF2.centerX() - fArr[0]) : Math.abs(rectF2.centerY() - fArr[1]);
            t tVar8 = rVar.f357111g;
            tVar8.f(0.0f, 0.0f, 270.0f, 0.0f);
            h hVar = i16 != 1 ? i16 != 2 ? i16 != 3 ? qVar2.f357090j : qVar2.f357089i : qVar2.f357092l : qVar2.f357091k;
            hVar.b(fMax, fAbs, f13, tVar8);
            Path path10 = rVar.f357114j;
            path10.reset();
            tVar8.c(matrixArr[i16], path10);
            if (rVar.f357116l && (hVar.a() || rVar.c(path10, i16) || rVar.c(path10, i18))) {
                path4 = path9;
                path10.op(path10, path4, Path.Op.DIFFERENCE);
                fArr[0] = tVar8.f357125a;
                fArr[1] = tVar8.f357126b;
                matrixArr[i16].mapPoints(fArr);
                path3 = path8;
                path3.moveTo(fArr[0], fArr[1]);
                tVar8.c(matrixArr[i16], path3);
            } else {
                path3 = path8;
                path4 = path9;
                tVar8.c(matrixArr[i16], path2);
            }
            if (bVar2 != null) {
                Matrix matrix2 = matrixArr[i16];
                k kVar2 = k.this;
                i13 = i17;
                kVar2.f357037e.set(i16 + 4, false);
                tVar8.b(tVar8.f357130f);
                kVar2.f357036d[i16] = new s(new ArrayList(tVar8.f357132h), new Matrix(matrix2));
            } else {
                i13 = i17;
            }
            rVar = this;
            path6 = path4;
            path5 = path3;
            cVar2 = cVar;
            i16 = i13;
            c12 = 1;
        }
        Path path11 = path5;
        path.close();
        path11.close();
        if (path11.isEmpty()) {
            return;
        }
        path.op(path11, Path.Op.UNION);
    }

    @X
    public final boolean c(Path path, int i12) {
        Path path2 = this.f357115k;
        path2.reset();
        this.f357105a[i12].c(this.f357106b[i12], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
