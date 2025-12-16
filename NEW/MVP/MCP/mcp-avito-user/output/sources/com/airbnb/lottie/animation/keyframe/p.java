package com.airbnb.lottie.animation.keyframe;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f59357a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f59358b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f59359c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f59360d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f59361e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public a<PointF, PointF> f59362f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public a<?, PointF> f59363g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f59364h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public a<Float, Float> f59365i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public a<Integer, Integer> f59366j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public d f59367k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public d f59368l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public a<?, Float> f59369m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public a<?, Float> f59370n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f59371o;

    public p(com.airbnb.lottie.model.animatable.n nVar) {
        com.airbnb.lottie.model.animatable.e eVar = nVar.f59645a;
        this.f59362f = eVar == null ? null : eVar.c();
        com.airbnb.lottie.model.animatable.o<PointF, PointF> oVar = nVar.f59646b;
        this.f59363g = oVar == null ? null : oVar.c();
        com.airbnb.lottie.model.animatable.g gVar = nVar.f59647c;
        this.f59364h = gVar == null ? null : gVar.c();
        com.airbnb.lottie.model.animatable.b bVar = nVar.f59648d;
        this.f59365i = bVar == null ? null : bVar.c();
        com.airbnb.lottie.model.animatable.b bVar2 = nVar.f59650f;
        d dVarC = bVar2 == null ? null : bVar2.c();
        this.f59367k = dVarC;
        this.f59371o = nVar.f59654j;
        if (dVarC != null) {
            this.f59358b = new Matrix();
            this.f59359c = new Matrix();
            this.f59360d = new Matrix();
            this.f59361e = new float[9];
        } else {
            this.f59358b = null;
            this.f59359c = null;
            this.f59360d = null;
            this.f59361e = null;
        }
        com.airbnb.lottie.model.animatable.b bVar3 = nVar.f59651g;
        this.f59368l = bVar3 == null ? null : bVar3.c();
        com.airbnb.lottie.model.animatable.d dVar = nVar.f59649e;
        if (dVar != null) {
            this.f59366j = dVar.c();
        }
        com.airbnb.lottie.model.animatable.b bVar4 = nVar.f59652h;
        if (bVar4 != null) {
            this.f59369m = bVar4.c();
        } else {
            this.f59369m = null;
        }
        com.airbnb.lottie.model.animatable.b bVar5 = nVar.f59653i;
        if (bVar5 != null) {
            this.f59370n = bVar5.c();
        } else {
            this.f59370n = null;
        }
    }

    public final void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.f(this.f59366j);
        bVar.f(this.f59369m);
        bVar.f(this.f59370n);
        bVar.f(this.f59362f);
        bVar.f(this.f59363g);
        bVar.f(this.f59364h);
        bVar.f(this.f59365i);
        bVar.f(this.f59367k);
        bVar.f(this.f59368l);
    }

    public final void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f59366j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f59369m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f59370n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f59362f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f59363g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f59364h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f59365i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f59367k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f59368l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public final boolean c(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        if (colorFilter == H.f59082a) {
            a<PointF, PointF> aVar = this.f59362f;
            if (aVar == null) {
                this.f59362f = new q(jVar, new PointF());
                return true;
            }
            aVar.k(jVar);
            return true;
        }
        if (colorFilter == H.f59083b) {
            a<?, PointF> aVar2 = this.f59363g;
            if (aVar2 == null) {
                this.f59363g = new q(jVar, new PointF());
                return true;
            }
            aVar2.k(jVar);
            return true;
        }
        if (colorFilter == H.f59084c) {
            a<?, PointF> aVar3 = this.f59363g;
            if (aVar3 instanceof n) {
                n nVar = (n) aVar3;
                com.airbnb.lottie.value.j<Float> jVar2 = nVar.f59352m;
                nVar.f59352m = jVar;
                return true;
            }
        }
        if (colorFilter == H.f59085d) {
            a<?, PointF> aVar4 = this.f59363g;
            if (aVar4 instanceof n) {
                n nVar2 = (n) aVar4;
                com.airbnb.lottie.value.j<Float> jVar3 = nVar2.f59353n;
                nVar2.f59353n = jVar;
                return true;
            }
        }
        if (colorFilter == H.f59091j) {
            a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar5 = this.f59364h;
            if (aVar5 == null) {
                this.f59364h = new q(jVar, new com.airbnb.lottie.value.k());
                return true;
            }
            aVar5.k(jVar);
            return true;
        }
        if (colorFilter == H.f59092k) {
            a<Float, Float> aVar6 = this.f59365i;
            if (aVar6 == null) {
                this.f59365i = new q(jVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.k(jVar);
            return true;
        }
        if (colorFilter == 3) {
            a<Integer, Integer> aVar7 = this.f59366j;
            if (aVar7 == null) {
                this.f59366j = new q(jVar, 100);
                return true;
            }
            aVar7.k(jVar);
            return true;
        }
        if (colorFilter == H.f59105x) {
            a<?, Float> aVar8 = this.f59369m;
            if (aVar8 == null) {
                this.f59369m = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.k(jVar);
            return true;
        }
        if (colorFilter == H.f59106y) {
            a<?, Float> aVar9 = this.f59370n;
            if (aVar9 == null) {
                this.f59370n = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.k(jVar);
            return true;
        }
        if (colorFilter == H.f59093l) {
            if (this.f59367k == null) {
                this.f59367k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f59367k.k(jVar);
            return true;
        }
        if (colorFilter != H.f59094m) {
            return false;
        }
        if (this.f59368l == null) {
            this.f59368l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
        }
        this.f59368l.k(jVar);
        return true;
    }

    public final void d() {
        for (int i12 = 0; i12 < 9; i12++) {
            this.f59361e[i12] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointFF;
        com.airbnb.lottie.value.k kVarF;
        PointF pointFF2;
        Matrix matrix = this.f59357a;
        matrix.reset();
        a<?, PointF> aVar = this.f59363g;
        if (aVar != null && (pointFF2 = aVar.f()) != null) {
            float f12 = pointFF2.x;
            if (f12 != 0.0f || pointFF2.y != 0.0f) {
                matrix.preTranslate(f12, pointFF2.y);
            }
        }
        if (!this.f59371o) {
            a<Float, Float> aVar2 = this.f59365i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? aVar2.f().floatValue() : ((d) aVar2).m();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f13 = aVar.f59310d;
            PointF pointFF3 = aVar.f();
            float f14 = pointFF3.x;
            float f15 = pointFF3.y;
            aVar.j(1.0E-4f + f13);
            PointF pointFF4 = aVar.f();
            aVar.j(f13);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointFF4.y - f15, pointFF4.x - f14)));
        }
        if (this.f59367k != null) {
            float fCos = this.f59368l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.m()) + 90.0f));
            float fSin = this.f59368l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.m()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.m()));
            d();
            float[] fArr = this.f59361e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f16 = -fSin;
            fArr[3] = f16;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f59358b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f59359c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f16;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f59360d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f59364h;
        if (aVar3 != null && (kVarF = aVar3.f()) != null) {
            float f17 = kVarF.f60159a;
            if (f17 != 1.0f || kVarF.f60160b != 1.0f) {
                matrix.preScale(f17, kVarF.f60160b);
            }
        }
        a<PointF, PointF> aVar4 = this.f59362f;
        if (aVar4 != null && (pointFF = aVar4.f()) != null) {
            float f18 = pointFF.x;
            if (f18 != 0.0f || pointFF.y != 0.0f) {
                matrix.preTranslate(-f18, -pointFF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f12) {
        a<?, PointF> aVar = this.f59363g;
        PointF pointFF = aVar == null ? null : aVar.f();
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f59364h;
        com.airbnb.lottie.value.k kVarF = aVar2 == null ? null : aVar2.f();
        Matrix matrix = this.f59357a;
        matrix.reset();
        if (pointFF != null) {
            matrix.preTranslate(pointFF.x * f12, pointFF.y * f12);
        }
        if (kVarF != null) {
            double d12 = f12;
            matrix.preScale((float) Math.pow(kVarF.f60159a, d12), (float) Math.pow(kVarF.f60160b, d12));
        }
        a<Float, Float> aVar3 = this.f59365i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f59362f;
            PointF pointFF2 = aVar4 != null ? aVar4.f() : null;
            matrix.preRotate(fFloatValue * f12, pointFF2 == null ? 0.0f : pointFF2.x, pointFF2 != null ? pointFF2.y : 0.0f);
        }
        return matrix;
    }
}
