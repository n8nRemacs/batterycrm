package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C20204c0;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.model.content.GradientType;
import j.P;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes10.dex */
public class i extends a {

    /* renamed from: A, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.q f59229A;

    /* renamed from: q, reason: collision with root package name */
    public final String f59230q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f59231r;

    /* renamed from: s, reason: collision with root package name */
    public final C20204c0<LinearGradient> f59232s;

    /* renamed from: t, reason: collision with root package name */
    public final C20204c0<RadialGradient> f59233t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f59234u;

    /* renamed from: v, reason: collision with root package name */
    public final GradientType f59235v;

    /* renamed from: w, reason: collision with root package name */
    public final int f59236w;

    /* renamed from: x, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f59237x;

    /* renamed from: y, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.k f59238y;

    /* renamed from: z, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.k f59239z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        int iOrdinal = fVar.f59741h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = fVar.f59742i.ordinal();
        super(b12, bVar, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, fVar.f59743j, fVar.f59737d, fVar.f59740g, fVar.f59744k, fVar.f59745l);
        this.f59232s = new C20204c0<>();
        this.f59233t = new C20204c0<>();
        this.f59234u = new RectF();
        this.f59230q = fVar.f59734a;
        this.f59235v = fVar.f59735b;
        this.f59231r = fVar.f59746m;
        this.f59236w = (int) (b12.f59035b.b() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> aVarC = fVar.f59736c.c();
        this.f59237x = (com.airbnb.lottie.animation.keyframe.e) aVarC;
        aVarC.a(this);
        bVar.f(aVarC);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC2 = fVar.f59738e.c();
        this.f59238y = (com.airbnb.lottie.animation.keyframe.k) aVarC2;
        aVarC2.a(this);
        bVar.f(aVarC2);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC3 = fVar.f59739f.c();
        this.f59239z = (com.airbnb.lottie.animation.keyframe.k) aVarC3;
        aVarC3.a(this);
        bVar.f(aVarC3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        super.a(colorFilter, jVar);
        if (colorFilter == H.f59077G) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.f59229A;
            com.airbnb.lottie.model.layer.b bVar = this.f59163f;
            if (qVar != null) {
                bVar.p(qVar);
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59229A = qVar2;
            qVar2.a(this);
            bVar.f(this.f59229A);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public final void d(Canvas canvas, Matrix matrix, int i12, com.airbnb.lottie.utils.b bVar) {
        RadialGradient radialGradientF;
        if (this.f59231r) {
            return;
        }
        e(this.f59234u, matrix, false);
        GradientType gradientType = GradientType.f59656b;
        com.airbnb.lottie.animation.keyframe.e eVar = this.f59237x;
        com.airbnb.lottie.animation.keyframe.k kVar = this.f59239z;
        com.airbnb.lottie.animation.keyframe.k kVar2 = this.f59238y;
        if (this.f59235v == gradientType) {
            long j12 = j();
            C20204c0<LinearGradient> c20204c0 = this.f59232s;
            radialGradientF = (LinearGradient) c20204c0.f(j12);
            if (radialGradientF == null) {
                PointF pointFF = kVar2.f();
                PointF pointFF2 = kVar.f();
                com.airbnb.lottie.model.content.d dVarF = eVar.f();
                radialGradientF = new LinearGradient(pointFF.x, pointFF.y, pointFF2.x, pointFF2.y, f(dVarF.f59725b), dVarF.f59724a, Shader.TileMode.CLAMP);
                c20204c0.l(j12, radialGradientF);
            }
        } else {
            long j13 = j();
            C20204c0<RadialGradient> c20204c02 = this.f59233t;
            radialGradientF = c20204c02.f(j13);
            if (radialGradientF == null) {
                PointF pointFF3 = kVar2.f();
                PointF pointFF4 = kVar.f();
                com.airbnb.lottie.model.content.d dVarF2 = eVar.f();
                int[] iArrF = f(dVarF2.f59725b);
                RadialGradient radialGradient = new RadialGradient(pointFF3.x, pointFF3.y, (float) Math.hypot(pointFF4.x - r10, pointFF4.y - r11), iArrF, dVarF2.f59724a, Shader.TileMode.CLAMP);
                c20204c02.l(j13, radialGradient);
                radialGradientF = radialGradient;
            }
        }
        this.f59166i.setShader(radialGradientF);
        super.d(canvas, matrix, i12, bVar);
    }

    public final int[] f(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f59229A;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.f();
            int i12 = 0;
            if (iArr.length == numArr.length) {
                while (i12 < iArr.length) {
                    iArr[i12] = numArr[i12].intValue();
                    i12++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i12 < numArr.length) {
                    iArr[i12] = numArr[i12].intValue();
                    i12++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59230q;
    }

    public final int j() {
        float f12 = this.f59238y.f59310d;
        float f13 = this.f59236w;
        int iRound = Math.round(f12 * f13);
        int iRound2 = Math.round(this.f59239z.f59310d * f13);
        int iRound3 = Math.round(this.f59237x.f59310d * f13);
        int i12 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i12 = i12 * 31 * iRound2;
        }
        return iRound3 != 0 ? i12 * 31 * iRound3 : i12;
    }
}
