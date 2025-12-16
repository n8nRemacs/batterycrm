package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import j.InterfaceC42153i;
import j.P;
import java.util.ArrayList;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes10.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final B f59162e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59163f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f59165h;

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59166i;

    /* renamed from: j, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59167j;

    /* renamed from: k, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.f f59168k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f59169l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.d f59170m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.q f59171n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.a<Float, Float> f59172o;

    /* renamed from: p, reason: collision with root package name */
    public float f59173p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f59158a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f59159b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f59160c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f59161d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f59164g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f59174a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @P
        public final v f59175b;

        public b(v vVar, C2075a c2075a) {
            this.f59175b = vVar;
        }
    }

    public a(B b12, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f12, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, ArrayList arrayList, com.airbnb.lottie.model.animatable.b bVar3) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f59166i = aVar;
        this.f59173p = 0.0f;
        this.f59162e = b12;
        this.f59163f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f12);
        this.f59168k = (com.airbnb.lottie.animation.keyframe.f) dVar.c();
        this.f59167j = bVar2.c();
        if (bVar3 == null) {
            this.f59170m = null;
        } else {
            this.f59170m = bVar3.c();
        }
        this.f59169l = new ArrayList(arrayList.size());
        this.f59165h = new float[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f59169l.add(((com.airbnb.lottie.model.animatable.b) arrayList.get(i12)).c());
        }
        bVar.f(this.f59168k);
        bVar.f(this.f59167j);
        for (int i13 = 0; i13 < this.f59169l.size(); i13++) {
            bVar.f((com.airbnb.lottie.animation.keyframe.a) this.f59169l.get(i13));
        }
        com.airbnb.lottie.animation.keyframe.d dVar2 = this.f59170m;
        if (dVar2 != null) {
            bVar.f(dVar2);
        }
        this.f59168k.a(this);
        this.f59167j.a(this);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((com.airbnb.lottie.animation.keyframe.a) this.f59169l.get(i14)).a(this);
        }
        com.airbnb.lottie.animation.keyframe.d dVar3 = this.f59170m;
        if (dVar3 != null) {
            dVar3.a(this);
        }
        if (bVar.m() != null) {
            com.airbnb.lottie.animation.keyframe.d dVarC = bVar.m().f59718a.c();
            this.f59172o = dVarC;
            dVarC.a(this);
            bVar.f(this.f59172o);
        }
    }

    @Override // O2.e
    @InterfaceC42153i
    public void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        PointF pointF = H.f59082a;
        if (colorFilter == 4) {
            this.f59168k.k(jVar);
            return;
        }
        if (colorFilter == H.f59095n) {
            this.f59167j.k(jVar);
            return;
        }
        ColorFilter colorFilter2 = H.f59076F;
        com.airbnb.lottie.model.layer.b bVar = this.f59163f;
        if (colorFilter == colorFilter2) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.f59171n;
            if (qVar != null) {
                bVar.p(qVar);
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59171n = qVar2;
            qVar2.a(this);
            bVar.f(this.f59171n);
            return;
        }
        if (colorFilter == H.f59086e) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f59172o;
            if (aVar != null) {
                aVar.k(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59172o = qVar3;
            qVar3.a(this);
            bVar.f(this.f59172o);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // com.airbnb.lottie.animation.content.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List<com.airbnb.lottie.animation.content.c> r9, java.util.List<com.airbnb.lottie.animation.content.c> r10) {
        /*
            r8 = this;
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r0 = r9.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.f59713c
            if (r0 < 0) goto L22
            java.lang.Object r4 = r9.get(r0)
            com.airbnb.lottie.animation.content.c r4 = (com.airbnb.lottie.animation.content.c) r4
            boolean r5 = r4 instanceof com.airbnb.lottie.animation.content.v
            if (r5 == 0) goto L1f
            com.airbnb.lottie.animation.content.v r4 = (com.airbnb.lottie.animation.content.v) r4
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r5 = r4.f59303c
            if (r5 != r3) goto L1f
            r2 = r4
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.a(r8)
        L27:
            int r9 = r10.size()
            int r9 = r9 + (-1)
            r0 = r1
        L2e:
            java.util.ArrayList r4 = r8.f59164g
            if (r9 < 0) goto L66
            java.lang.Object r5 = r10.get(r9)
            com.airbnb.lottie.animation.content.c r5 = (com.airbnb.lottie.animation.content.c) r5
            boolean r6 = r5 instanceof com.airbnb.lottie.animation.content.v
            if (r6 == 0) goto L51
            r6 = r5
            com.airbnb.lottie.animation.content.v r6 = (com.airbnb.lottie.animation.content.v) r6
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r7 = r6.f59303c
            if (r7 != r3) goto L51
            if (r0 == 0) goto L48
            r4.add(r0)
        L48:
            com.airbnb.lottie.animation.content.a$b r0 = new com.airbnb.lottie.animation.content.a$b
            r0.<init>(r6, r1)
            r6.a(r8)
            goto L63
        L51:
            boolean r4 = r5 instanceof com.airbnb.lottie.animation.content.n
            if (r4 == 0) goto L63
            if (r0 != 0) goto L5c
            com.airbnb.lottie.animation.content.a$b r0 = new com.airbnb.lottie.animation.content.a$b
            r0.<init>(r2, r1)
        L5c:
            java.util.ArrayList r4 = r0.f59174a
            com.airbnb.lottie.animation.content.n r5 = (com.airbnb.lottie.animation.content.n) r5
            r4.add(r5)
        L63:
            int r9 = r9 + (-1)
            goto L2e
        L66:
            if (r0 == 0) goto L6b
            r4.add(r0)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.a.c(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0234  */
    @Override // com.airbnb.lottie.animation.content.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, @j.P com.airbnb.lottie.utils.b r24) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.a.d(android.graphics.Canvas, android.graphics.Matrix, int, com.airbnb.lottie.utils.b):void");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        if (C27285e.f59567a) {
            C27285e.a("StrokeContent#getBounds");
        }
        Path path = this.f59159b;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59164g;
            if (i12 >= arrayList.size()) {
                break;
            }
            b bVar = (b) arrayList.get(i12);
            for (int i13 = 0; i13 < bVar.f59174a.size(); i13++) {
                path.addPath(((n) bVar.f59174a.get(i13)).getPath(), matrix);
            }
            i12++;
        }
        RectF rectF2 = this.f59161d;
        path.computeBounds(rectF2, false);
        float fM2 = this.f59167j.m() / 2.0f;
        rectF2.set(rectF2.left - fM2, rectF2.top - fM2, rectF2.right + fM2, rectF2.bottom + fM2);
        rectF.set(rectF2);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C27285e.f59567a) {
            C27285e.b("StrokeContent#getBounds");
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59162e.invalidateSelf();
    }
}
