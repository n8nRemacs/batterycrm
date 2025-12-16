package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.model.content.ShapeStroke;
import j.P;

/* compiled from: StrokeContent.java */
/* loaded from: classes10.dex */
public class u extends a {

    /* renamed from: q, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59296q;

    /* renamed from: r, reason: collision with root package name */
    public final String f59297r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f59298s;

    /* renamed from: t, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.b f59299t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.q f59300u;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(B b12, com.airbnb.lottie.model.layer.b bVar, ShapeStroke shapeStroke) {
        int iOrdinal = shapeStroke.f59699g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = shapeStroke.f59700h.ordinal();
        super(b12, bVar, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, shapeStroke.f59701i, shapeStroke.f59697e, shapeStroke.f59698f, shapeStroke.f59695c, shapeStroke.f59694b);
        this.f59296q = bVar;
        this.f59297r = shapeStroke.f59693a;
        this.f59298s = shapeStroke.f59702j;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarC = shapeStroke.f59696d.c();
        this.f59299t = (com.airbnb.lottie.animation.keyframe.b) aVarC;
        aVarC.a(this);
        bVar.f(aVarC);
    }

    @Override // com.airbnb.lottie.animation.content.a, O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        super.a(colorFilter, jVar);
        PointF pointF = H.f59082a;
        com.airbnb.lottie.animation.keyframe.b bVar = this.f59299t;
        if (colorFilter == 2) {
            bVar.k(jVar);
            return;
        }
        if (colorFilter == H.f59076F) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.f59300u;
            com.airbnb.lottie.model.layer.b bVar2 = this.f59296q;
            if (qVar != null) {
                bVar2.p(qVar);
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59300u = qVar2;
            qVar2.a(this);
            bVar2.f(bVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public final void d(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        if (this.f59298s) {
            return;
        }
        com.airbnb.lottie.animation.a aVar = this.f59166i;
        com.airbnb.lottie.animation.keyframe.b bVar2 = this.f59299t;
        aVar.setColor(bVar2.m(bVar2.b(), bVar2.d()));
        com.airbnb.lottie.animation.keyframe.q qVar = this.f59300u;
        if (qVar != null) {
            aVar.setColorFilter((ColorFilter) qVar.f());
        }
        super.d(canvas, matrix, i12, bVar);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59297r;
    }
}
