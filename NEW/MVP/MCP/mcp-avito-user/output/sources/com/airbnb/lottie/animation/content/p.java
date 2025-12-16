package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.ArrayList;

/* compiled from: RectangleContent.java */
/* loaded from: classes10.dex */
public class p implements a.b, k, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f59267c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59268d;

    /* renamed from: e, reason: collision with root package name */
    public final B f59269e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.a<?, PointF> f59270f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.a<?, PointF> f59271g;

    /* renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59272h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59275k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f59265a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f59266b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final b f59273i = new b();

    /* renamed from: j, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.a<Float, Float> f59274j = null;

    public p(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.g gVar) {
        this.f59267c = gVar.f59747a;
        this.f59268d = gVar.f59751e;
        this.f59269e = b12;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC = gVar.f59748b.c();
        this.f59270f = aVarC;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC2 = gVar.f59749c.c();
        this.f59271g = aVarC2;
        com.airbnb.lottie.animation.keyframe.d dVarC = gVar.f59750d.c();
        this.f59272h = dVarC;
        bVar.f(aVarC);
        bVar.f(aVarC2);
        bVar.f(dVarC);
        aVarC.a(this);
        aVarC2.a(this);
        dVarC.a(this);
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        if (colorFilter == H.f59088g) {
            this.f59271g.k(jVar);
        } else if (colorFilter == H.f59090i) {
            this.f59270f.k(jVar);
        } else if (colorFilter == H.f59089h) {
            this.f59272h.k(jVar);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // com.airbnb.lottie.animation.content.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List<com.airbnb.lottie.animation.content.c> r5, java.util.List<com.airbnb.lottie.animation.content.c> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            com.airbnb.lottie.animation.content.c r0 = (com.airbnb.lottie.animation.content.c) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.v
            if (r1 == 0) goto L28
            r1 = r0
            com.airbnb.lottie.animation.content.v r1 = (com.airbnb.lottie.animation.content.v) r1
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r2 = r1.f59303c
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.f59712b
            if (r2 != r3) goto L28
            com.airbnb.lottie.animation.content.b r0 = r4.f59273i
            java.util.ArrayList r0 = r0.f59176a
            r0.add(r1)
            r1.a(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.r
            if (r1 == 0) goto L32
            com.airbnb.lottie.animation.content.r r0 = (com.airbnb.lottie.animation.content.r) r0
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r0 = r0.f59287b
            r4.f59274j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.p.c(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59275k = false;
        this.f59269e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59267c;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar;
        boolean z12 = this.f59275k;
        Path path = this.f59265a;
        if (z12) {
            return path;
        }
        path.reset();
        if (this.f59268d) {
            this.f59275k = true;
            return path;
        }
        PointF pointFF = this.f59271g.f();
        float f12 = pointFF.x / 2.0f;
        float f13 = pointFF.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.d dVar = this.f59272h;
        float fM2 = dVar == null ? 0.0f : dVar.m();
        if (fM2 == 0.0f && (aVar = this.f59274j) != null) {
            fM2 = Math.min(aVar.f().floatValue(), Math.min(f12, f13));
        }
        float fMin = Math.min(f12, f13);
        if (fM2 > fMin) {
            fM2 = fMin;
        }
        PointF pointFF2 = this.f59270f.f();
        path.moveTo(pointFF2.x + f12, (pointFF2.y - f13) + fM2);
        path.lineTo(pointFF2.x + f12, (pointFF2.y + f13) - fM2);
        RectF rectF = this.f59266b;
        if (fM2 > 0.0f) {
            float f14 = pointFF2.x + f12;
            float f15 = fM2 * 2.0f;
            float f16 = pointFF2.y + f13;
            rectF.set(f14 - f15, f16 - f15, f14, f16);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointFF2.x - f12) + fM2, pointFF2.y + f13);
        if (fM2 > 0.0f) {
            float f17 = pointFF2.x - f12;
            float f18 = pointFF2.y + f13;
            float f19 = fM2 * 2.0f;
            rectF.set(f17, f18 - f19, f19 + f17, f18);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointFF2.x - f12, (pointFF2.y - f13) + fM2);
        if (fM2 > 0.0f) {
            float f22 = pointFF2.x - f12;
            float f23 = pointFF2.y - f13;
            float f24 = fM2 * 2.0f;
            rectF.set(f22, f23, f22 + f24, f24 + f23);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointFF2.x + f12) - fM2, pointFF2.y - f13);
        if (fM2 > 0.0f) {
            float f25 = pointFF2.x + f12;
            float f26 = fM2 * 2.0f;
            float f27 = pointFF2.y - f13;
            rectF.set(f25 - f26, f27, f25, f26 + f27);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f59273i.a(path);
        this.f59275k = true;
        return path;
    }
}
