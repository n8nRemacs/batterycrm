package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes10.dex */
public class f implements n, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f59190b;

    /* renamed from: c, reason: collision with root package name */
    public final B f59191c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.k f59192d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.a<?, PointF> f59193e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.b f59194f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f59196h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f59189a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f59195g = new b();

    public f(B b12, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f59190b = bVar2.f59719a;
        this.f59191c = b12;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC = bVar2.f59721c.c();
        this.f59192d = (com.airbnb.lottie.animation.keyframe.k) aVarC;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC2 = bVar2.f59720b.c();
        this.f59193e = aVarC2;
        this.f59194f = bVar2;
        bVar.f(aVarC);
        bVar.f(aVarC2);
        aVarC.a(this);
        aVarC2.a(this);
    }

    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        if (colorFilter == H.f59087f) {
            this.f59192d.k(jVar);
        } else if (colorFilter == H.f59090i) {
            this.f59193e.k(jVar);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i12 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i12);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f59303c == ShapeTrimPath.Type.f59712b) {
                    this.f59195g.f59176a.add(vVar);
                    vVar.a(this);
                }
            }
            i12++;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59196h = false;
        this.f59191c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59190b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        boolean z12 = this.f59196h;
        Path path = this.f59189a;
        if (z12) {
            return path;
        }
        path.reset();
        com.airbnb.lottie.model.content.b bVar = this.f59194f;
        if (bVar.f59723e) {
            this.f59196h = true;
            return path;
        }
        PointF pointFF = this.f59192d.f();
        float f12 = pointFF.x / 2.0f;
        float f13 = pointFF.y / 2.0f;
        float f14 = f12 * 0.55228f;
        float f15 = f13 * 0.55228f;
        path.reset();
        if (bVar.f59722d) {
            float f16 = -f13;
            path.moveTo(0.0f, f16);
            float f17 = 0.0f - f14;
            float f18 = -f12;
            float f19 = 0.0f - f15;
            path.cubicTo(f17, f16, f18, f19, f18, 0.0f);
            float f22 = f15 + 0.0f;
            path.cubicTo(f18, f22, f17, f13, 0.0f, f13);
            float f23 = f14 + 0.0f;
            path.cubicTo(f23, f13, f12, f22, f12, 0.0f);
            path.cubicTo(f12, f19, f23, f16, 0.0f, f16);
        } else {
            float f24 = -f13;
            path.moveTo(0.0f, f24);
            float f25 = f14 + 0.0f;
            float f26 = 0.0f - f15;
            path.cubicTo(f25, f24, f12, f26, f12, 0.0f);
            float f27 = f15 + 0.0f;
            path.cubicTo(f12, f27, f25, f13, 0.0f, f13);
            float f28 = 0.0f - f14;
            float f29 = -f12;
            path.cubicTo(f28, f13, f29, f27, f29, 0.0f);
            path.cubicTo(f29, f26, f28, f24, 0.0f, f24);
        }
        PointF pointFF2 = this.f59193e.f();
        path.offset(pointFF2.x, pointFF2.y);
        path.close();
        this.f59195g.a(path);
        this.f59196h = true;
        return path;
    }
}
