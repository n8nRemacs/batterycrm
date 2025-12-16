package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Path;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.ArrayList;

/* compiled from: ShapeContent.java */
/* loaded from: classes10.dex */
public class s implements n, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f59290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59291c;

    /* renamed from: d, reason: collision with root package name */
    public final B f59292d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.m f59293e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59294f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f59289a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f59295g = new b();

    public s(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.f59290b = mVar.f59770a;
        this.f59291c = mVar.f59773d;
        this.f59292d = b12;
        com.airbnb.lottie.animation.keyframe.m mVarC = mVar.f59772c.c();
        this.f59293e = mVarC;
        bVar.f(mVarC);
        mVarC.a(this);
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        if (colorFilter == H.f59081K) {
            this.f59293e.k(jVar);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // com.airbnb.lottie.animation.content.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List<com.airbnb.lottie.animation.content.c> r6, java.util.List<com.airbnb.lottie.animation.content.c> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L3f
            java.lang.Object r1 = r1.get(r0)
            com.airbnb.lottie.animation.content.c r1 = (com.airbnb.lottie.animation.content.c) r1
            boolean r2 = r1 instanceof com.airbnb.lottie.animation.content.v
            if (r2 == 0) goto L29
            r2 = r1
            com.airbnb.lottie.animation.content.v r2 = (com.airbnb.lottie.animation.content.v) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = r2.f59303c
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r4 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.f59712b
            if (r3 != r4) goto L29
            com.airbnb.lottie.animation.content.b r1 = r5.f59295g
            java.util.ArrayList r1 = r1.f59176a
            r1.add(r2)
            r2.a(r5)
            goto L3c
        L29:
            boolean r2 = r1 instanceof com.airbnb.lottie.animation.content.t
            if (r2 == 0) goto L3c
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            com.airbnb.lottie.animation.content.t r1 = (com.airbnb.lottie.animation.content.t) r1
            r1.i(r5)
            r7.add(r1)
        L3c:
            int r0 = r0 + 1
            goto L2
        L3f:
            com.airbnb.lottie.animation.keyframe.m r6 = r5.f59293e
            r6.f59347m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.s.c(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59294f = false;
        this.f59292d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59290b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        boolean z12 = this.f59294f;
        Path path = this.f59289a;
        com.airbnb.lottie.animation.keyframe.m mVar = this.f59293e;
        if (z12 && mVar.f59311e == null) {
            return path;
        }
        path.reset();
        if (this.f59291c) {
            this.f59294f = true;
            return path;
        }
        Path pathF = mVar.f();
        if (pathF == null) {
            return path;
        }
        path.set(pathF);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f59295g.a(path);
        this.f59294f = true;
        return path;
    }
}
