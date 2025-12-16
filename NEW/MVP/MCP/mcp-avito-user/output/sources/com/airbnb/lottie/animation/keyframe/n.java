package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.a;
import j.P;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f59348i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f59349j;

    /* renamed from: k, reason: collision with root package name */
    public final d f59350k;

    /* renamed from: l, reason: collision with root package name */
    public final d f59351l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public com.airbnb.lottie.value.j<Float> f59352m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public com.airbnb.lottie.value.j<Float> f59353n;

    public n(d dVar, d dVar2) {
        super(Collections.emptyList());
        this.f59348i = new PointF();
        this.f59349j = new PointF();
        this.f59350k = dVar;
        this.f59351l = dVar2;
        j(this.f59310d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final PointF f() {
        return m();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* bridge */ /* synthetic */ PointF g(com.airbnb.lottie.value.a<PointF> aVar, float f12) {
        return m();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final void j(float f12) {
        d dVar = this.f59350k;
        dVar.j(f12);
        d dVar2 = this.f59351l;
        dVar2.j(f12);
        this.f59348i.set(dVar.f().floatValue(), dVar2.f().floatValue());
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59307a;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((a.b) arrayList.get(i12)).g();
            i12++;
        }
    }

    public final PointF m() {
        Float fB2;
        d dVar;
        com.airbnb.lottie.value.a<Float> aVarB;
        d dVar2;
        com.airbnb.lottie.value.a<Float> aVarB2;
        Float fB3 = null;
        if (this.f59352m == null || (aVarB2 = (dVar2 = this.f59350k).b()) == null) {
            fB2 = null;
        } else {
            Float f12 = aVarB2.f60140h;
            com.airbnb.lottie.value.j<Float> jVar = this.f59352m;
            float f13 = aVarB2.f60139g;
            fB2 = jVar.b(f13, f12 == null ? f13 : f12.floatValue(), aVarB2.f60134b, aVarB2.f60135c, dVar2.d(), dVar2.e(), dVar2.f59310d);
        }
        if (this.f59353n != null && (aVarB = (dVar = this.f59351l).b()) != null) {
            Float f14 = aVarB.f60140h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f59353n;
            float f15 = aVarB.f60139g;
            fB3 = jVar2.b(f15, f14 == null ? f15 : f14.floatValue(), aVarB.f60134b, aVarB.f60135c, dVar.d(), dVar.e(), dVar.f59310d);
        }
        PointF pointF = this.f59348i;
        PointF pointF2 = this.f59349j;
        if (fB2 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(fB2.floatValue(), 0.0f);
        }
        if (fB3 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, fB3.floatValue());
        }
        return pointF2;
    }
}
