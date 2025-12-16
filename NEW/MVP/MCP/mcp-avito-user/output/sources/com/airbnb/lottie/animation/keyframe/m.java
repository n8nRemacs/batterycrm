package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class m extends a<com.airbnb.lottie.model.content.j, Path> {

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.j f59343i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f59344j;

    /* renamed from: k, reason: collision with root package name */
    public Path f59345k;

    /* renamed from: l, reason: collision with root package name */
    public Path f59346l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f59347m;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.j>> list) {
        super(list);
        this.f59343i = new com.airbnb.lottie.model.content.j();
        this.f59344j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Path g(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.j> aVar, float f12) {
        com.airbnb.lottie.model.content.j jVarH;
        com.airbnb.lottie.model.content.j jVar = aVar.f60134b;
        com.airbnb.lottie.model.content.j jVar2 = aVar.f60135c;
        com.airbnb.lottie.model.content.j jVar3 = jVar2 == null ? jVar : jVar2;
        com.airbnb.lottie.model.content.j jVar4 = this.f59343i;
        if (jVar4.f59759b == null) {
            jVar4.f59759b = new PointF();
        }
        jVar4.f59760c = jVar.f59760c || jVar3.f59760c;
        ArrayList arrayList = jVar.f59758a;
        int size = arrayList.size();
        int size2 = jVar3.f59758a.size();
        ArrayList arrayList2 = jVar3.f59758a;
        if (size != size2) {
            com.airbnb.lottie.utils.e.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = jVar4.f59758a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new O2.a());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = jVar.f59759b;
        PointF pointF2 = jVar3.f59759b;
        jVar4.a(com.airbnb.lottie.utils.j.f(pointF.x, pointF2.x, f12), com.airbnb.lottie.utils.j.f(pointF.y, pointF2.y, f12));
        int size5 = arrayList3.size() - 1;
        while (size5 >= 0) {
            O2.a aVar2 = (O2.a) arrayList.get(size5);
            O2.a aVar3 = (O2.a) arrayList2.get(size5);
            PointF pointF3 = aVar2.f11929a;
            PointF pointF4 = aVar3.f11929a;
            com.airbnb.lottie.model.content.j jVar5 = jVar4;
            ((O2.a) arrayList3.get(size5)).f11929a.set(com.airbnb.lottie.utils.j.f(pointF3.x, pointF4.x, f12), com.airbnb.lottie.utils.j.f(pointF3.y, pointF4.y, f12));
            O2.a aVar4 = (O2.a) arrayList3.get(size5);
            PointF pointF5 = aVar2.f11930b;
            float f13 = pointF5.x;
            PointF pointF6 = aVar3.f11930b;
            aVar4.f11930b.set(com.airbnb.lottie.utils.j.f(f13, pointF6.x, f12), com.airbnb.lottie.utils.j.f(pointF5.y, pointF6.y, f12));
            O2.a aVar5 = (O2.a) arrayList3.get(size5);
            PointF pointF7 = aVar2.f11931c;
            float f14 = pointF7.x;
            PointF pointF8 = aVar3.f11931c;
            aVar5.f11931c.set(com.airbnb.lottie.utils.j.f(f14, pointF8.x, f12), com.airbnb.lottie.utils.j.f(pointF7.y, pointF8.y, f12));
            size5--;
            jVar4 = jVar5;
        }
        com.airbnb.lottie.model.content.j jVar6 = jVar4;
        ArrayList arrayList4 = this.f59347m;
        if (arrayList4 != null) {
            jVarH = jVar6;
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                jVarH = ((t) this.f59347m.get(size6)).h(jVarH);
            }
        } else {
            jVarH = jVar6;
        }
        Path path = this.f59344j;
        com.airbnb.lottie.utils.j.e(jVarH, path);
        if (this.f59311e == null) {
            return path;
        }
        if (this.f59345k == null) {
            this.f59345k = new Path();
            this.f59346l = new Path();
        }
        com.airbnb.lottie.utils.j.e(jVar, this.f59345k);
        if (jVar2 != null) {
            com.airbnb.lottie.utils.j.e(jVar2, this.f59346l);
        }
        com.airbnb.lottie.value.j<A> jVar7 = this.f59311e;
        float fFloatValue = aVar.f60140h.floatValue();
        Path path2 = this.f59345k;
        return (Path) jVar7.b(aVar.f60139g, fFloatValue, path2, jVar2 == null ? path2 : this.f59346l, f12, e(), this.f59310d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final boolean l() {
        ArrayList arrayList = this.f59347m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
