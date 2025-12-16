package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes10.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f59197a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59198b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59199c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59200d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59201e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f59202f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.b f59203g;

    /* renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.f f59204h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.q f59205i;

    /* renamed from: j, reason: collision with root package name */
    public final B f59206j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.a<Float, Float> f59207k;

    /* renamed from: l, reason: collision with root package name */
    public float f59208l;

    public g(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        Path path = new Path();
        this.f59197a = path;
        this.f59198b = new com.airbnb.lottie.animation.a(1);
        this.f59202f = new ArrayList();
        this.f59199c = bVar;
        this.f59200d = kVar.f59763c;
        this.f59201e = kVar.f59766f;
        this.f59206j = b12;
        if (bVar.m() != null) {
            com.airbnb.lottie.animation.keyframe.d dVarC = bVar.m().f59718a.c();
            this.f59207k = dVarC;
            dVarC.a(this);
            bVar.f(this.f59207k);
        }
        com.airbnb.lottie.model.animatable.a aVar = kVar.f59764d;
        if (aVar == null) {
            this.f59203g = null;
            this.f59204h = null;
            return;
        }
        com.airbnb.lottie.model.animatable.d dVar = kVar.f59765e;
        path.setFillType(kVar.f59762b);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarC = aVar.c();
        this.f59203g = (com.airbnb.lottie.animation.keyframe.b) aVarC;
        aVarC.a(this);
        bVar.f(aVarC);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarC2 = dVar.c();
        this.f59204h = (com.airbnb.lottie.animation.keyframe.f) aVarC2;
        aVarC2.a(this);
        bVar.f(aVarC2);
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        PointF pointF = H.f59082a;
        if (colorFilter == 1) {
            this.f59203g.k(jVar);
            return;
        }
        if (colorFilter == 4) {
            this.f59204h.k(jVar);
            return;
        }
        ColorFilter colorFilter2 = H.f59076F;
        com.airbnb.lottie.model.layer.b bVar = this.f59199c;
        if (colorFilter == colorFilter2) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.f59205i;
            if (qVar != null) {
                bVar.p(qVar);
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59205i = qVar2;
            qVar2.a(this);
            bVar.f(this.f59205i);
            return;
        }
        if (colorFilter == H.f59086e) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f59207k;
            if (aVar != null) {
                aVar.k(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59207k = qVar3;
            qVar3.a(this);
            bVar.f(this.f59207k);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        for (int i12 = 0; i12 < list2.size(); i12++) {
            c cVar = list2.get(i12);
            if (cVar instanceof n) {
                this.f59202f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void d(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.f59201e) {
            return;
        }
        if (C27285e.f59567a) {
            C27285e.a("FillContent#draw");
        }
        com.airbnb.lottie.animation.keyframe.b bVar2 = this.f59203g;
        int iM2 = bVar2.m(bVar2.b(), bVar2.d());
        float fIntValue = this.f59204h.f().intValue() / 100.0f;
        int iC2 = com.airbnb.lottie.utils.j.c((int) (i12 * fIntValue));
        com.airbnb.lottie.animation.a aVar = this.f59198b;
        aVar.setColor((iC2 << 24) | (iM2 & 16777215));
        com.airbnb.lottie.animation.keyframe.q qVar = this.f59205i;
        if (qVar != null) {
            aVar.setColorFilter((ColorFilter) qVar.f());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f59207k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.f().floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f59208l) {
                com.airbnb.lottie.model.layer.b bVar3 = this.f59199c;
                if (bVar3.f59808B == fFloatValue) {
                    blurMaskFilter = bVar3.f59809C;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar3.f59809C = blurMaskFilter2;
                    bVar3.f59808B = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f59208l = fFloatValue;
        }
        if (bVar != null) {
            bVar.a((int) (fIntValue * 255.0f), aVar);
        } else {
            aVar.clearShadowLayer();
        }
        Path path = this.f59197a;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f59202f;
            if (i13 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i13)).getPath(), matrix);
            i13++;
        }
        canvas.drawPath(path, aVar);
        if (C27285e.f59567a) {
            C27285e.b("FillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        Path path = this.f59197a;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59202f;
            if (i12 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i12)).getPath(), matrix);
                i12++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59206j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59200d;
    }
}
