package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.utils.OffscreenLayer;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes10.dex */
public class d implements e, n, a.b, O2.e {

    /* renamed from: a, reason: collision with root package name */
    public final OffscreenLayer.a f59177a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f59178b;

    /* renamed from: c, reason: collision with root package name */
    public final OffscreenLayer f59179c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f59180d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f59181e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f59182f;

    /* renamed from: g, reason: collision with root package name */
    public final String f59183g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59184h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f59185i;

    /* renamed from: j, reason: collision with root package name */
    public final B f59186j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public ArrayList f59187k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.p f59188l;

    public d(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar, C27291k c27291k) {
        com.airbnb.lottie.model.animatable.n nVar;
        String str = lVar.f59767a;
        List<com.airbnb.lottie.model.content.c> list = lVar.f59768b;
        ArrayList arrayList = new ArrayList(list.size());
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            c cVarA = list.get(i13).a(b12, c27291k, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i12 >= list.size()) {
                nVar = null;
                break;
            }
            com.airbnb.lottie.model.content.c cVar = list.get(i12);
            if (cVar instanceof com.airbnb.lottie.model.animatable.n) {
                nVar = (com.airbnb.lottie.model.animatable.n) cVar;
                break;
            }
            i12++;
        }
        this(b12, bVar, str, lVar.f59769c, arrayList, nVar);
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f59188l;
        if (pVar != null) {
            pVar.c(colorFilter, jVar);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        String str = this.f59183g;
        if (!dVar.c(i12, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            O2.d dVar3 = new O2.d(dVar2);
            dVar3.f11942a.add(str);
            if (dVar.a(i12, str)) {
                O2.d dVar4 = new O2.d(dVar3);
                dVar4.f11943b = this;
                arrayList.add(dVar4);
            }
            dVar2 = dVar3;
        }
        if (!dVar.d(i12, str)) {
            return;
        }
        int iB2 = dVar.b(i12, str) + i12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f59185i;
            if (i13 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i13);
            if (cVar instanceof O2.e) {
                ((O2.e) cVar).b(dVar, iB2, arrayList, dVar2);
            }
            i13++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        int size = list.size();
        ArrayList arrayList = this.f59185i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void d(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        if (this.f59184h) {
            return;
        }
        Matrix matrix2 = this.f59180d;
        matrix2.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f59188l;
        if (pVar != null) {
            matrix2.preConcat(pVar.e());
            i12 = (int) (((((pVar.f59366j == null ? 100 : r1.f().intValue()) / 100.0f) * i12) / 255.0f) * 255.0f);
        }
        B b12 = this.f59186j;
        boolean z12 = (b12.f59057x && j() && i12 != 255) || (bVar != null && b12.f59058y && j());
        int i13 = z12 ? 255 : i12;
        OffscreenLayer offscreenLayer = this.f59179c;
        if (z12) {
            RectF rectF = this.f59178b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix, true);
            OffscreenLayer.a aVar = this.f59177a;
            aVar.f60090a = i12;
            if (bVar != null) {
                if (Color.alpha(bVar.f60098d) > 0) {
                    aVar.f60091b = bVar;
                } else {
                    aVar.f60091b = null;
                }
                bVar = null;
            } else {
                aVar.f60091b = null;
            }
            canvas = offscreenLayer.e(canvas, rectF, aVar);
        } else if (bVar != null) {
            com.airbnb.lottie.utils.b bVar2 = new com.airbnb.lottie.utils.b(bVar);
            bVar2.b(i13);
            bVar = bVar2;
        }
        ArrayList arrayList = this.f59185i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).d(canvas, matrix2, i13, bVar);
            }
        }
        if (z12) {
            offscreenLayer.c();
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        Matrix matrix2 = this.f59180d;
        matrix2.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f59188l;
        if (pVar != null) {
            matrix2.preConcat(pVar.e());
        }
        RectF rectF2 = this.f59182f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f59185i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(rectF2, matrix2, z12);
                rectF.union(rectF2);
            }
        }
    }

    public final List<n> f() {
        if (this.f59187k == null) {
            this.f59187k = new ArrayList();
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f59185i;
                if (i12 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i12);
                if (cVar instanceof n) {
                    this.f59187k.add((n) cVar);
                }
                i12++;
            }
        }
        return this.f59187k;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59186j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        throw null;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        Matrix matrix = this.f59180d;
        matrix.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f59188l;
        if (pVar != null) {
            matrix.set(pVar.e());
        }
        Path path = this.f59181e;
        path.reset();
        if (this.f59184h) {
            return path;
        }
        ArrayList arrayList = this.f59185i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof n) {
                path.addPath(((n) cVar).getPath(), matrix);
            }
        }
        return path;
    }

    public final boolean j() {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f59185i;
            if (i12 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i12) instanceof e) && (i13 = i13 + 1) >= 2) {
                return true;
            }
            i12++;
        }
    }

    public d(B b12, com.airbnb.lottie.model.layer.b bVar, String str, boolean z12, ArrayList arrayList, @P com.airbnb.lottie.model.animatable.n nVar) {
        this.f59177a = new OffscreenLayer.a();
        this.f59178b = new RectF();
        this.f59179c = new OffscreenLayer();
        this.f59180d = new Matrix();
        this.f59181e = new Path();
        this.f59182f = new RectF();
        this.f59183g = str;
        this.f59186j = b12;
        this.f59184h = z12;
        this.f59185i = arrayList;
        if (nVar != null) {
            com.airbnb.lottie.animation.keyframe.p pVar = new com.airbnb.lottie.animation.keyframe.p(nVar);
            this.f59188l = pVar;
            pVar.a(bVar);
            pVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }
}
