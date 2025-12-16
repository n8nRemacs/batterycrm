package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes10.dex */
public class q implements e, n, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f59276a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f59277b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final B f59278c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59279d;

    /* renamed from: e, reason: collision with root package name */
    public final String f59280e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f59281f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59282g;

    /* renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59283h;

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.p f59284i;

    /* renamed from: j, reason: collision with root package name */
    public d f59285j;

    public q(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.h hVar) {
        this.f59278c = b12;
        this.f59279d = bVar;
        this.f59280e = hVar.f59752a;
        this.f59281f = hVar.f59756e;
        com.airbnb.lottie.animation.keyframe.d dVarC = hVar.f59753b.c();
        this.f59282g = dVarC;
        bVar.f(dVarC);
        dVarC.a(this);
        com.airbnb.lottie.animation.keyframe.d dVarC2 = hVar.f59754c.c();
        this.f59283h = dVarC2;
        bVar.f(dVarC2);
        dVarC2.a(this);
        com.airbnb.lottie.model.animatable.n nVar = hVar.f59755d;
        nVar.getClass();
        com.airbnb.lottie.animation.keyframe.p pVar = new com.airbnb.lottie.animation.keyframe.p(nVar);
        this.f59284i = pVar;
        pVar.a(bVar);
        pVar.b(this);
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        if (this.f59284i.c(colorFilter, jVar)) {
            return;
        }
        if (colorFilter == H.f59097p) {
            this.f59282g.k(jVar);
        } else if (colorFilter == H.f59098q) {
            this.f59283h.k(jVar);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
        for (int i13 = 0; i13 < this.f59285j.f59185i.size(); i13++) {
            c cVar = (c) this.f59285j.f59185i.get(i13);
            if (cVar instanceof k) {
                com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, (k) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        this.f59285j.c(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void d(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        float fFloatValue = this.f59282g.f().floatValue();
        float fFloatValue2 = this.f59283h.f().floatValue();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f59284i;
        float fFloatValue3 = pVar.f59369m.f().floatValue() / 100.0f;
        float fFloatValue4 = pVar.f59370n.f().floatValue() / 100.0f;
        for (int i13 = ((int) fFloatValue) - 1; i13 >= 0; i13--) {
            Matrix matrix2 = this.f59276a;
            matrix2.set(matrix);
            float f12 = i13;
            matrix2.preConcat(pVar.f(f12 + fFloatValue2));
            this.f59285j.d(canvas, matrix2, (int) (com.airbnb.lottie.utils.j.f(fFloatValue3, fFloatValue4, f12 / fFloatValue) * i12), bVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        this.f59285j.e(rectF, matrix, z12);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public final void f(ListIterator<c> listIterator) {
        if (this.f59285j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f59285j = new d(this.f59278c, this.f59279d, "Repeater", this.f59281f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59278c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59280e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        Path path = this.f59285j.getPath();
        Path path2 = this.f59277b;
        path2.reset();
        float fFloatValue = this.f59282g.f().floatValue();
        float fFloatValue2 = this.f59283h.f().floatValue();
        for (int i12 = ((int) fFloatValue) - 1; i12 >= 0; i12--) {
            Matrix matrix = this.f59276a;
            matrix.set(this.f59284i.f(i12 + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
