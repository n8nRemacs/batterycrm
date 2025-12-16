package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes10.dex */
public class e implements o<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f59631a;

    public e(ArrayList arrayList) {
        this.f59631a = arrayList;
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final boolean b() {
        ArrayList arrayList = this.f59631a;
        return arrayList.size() == 1 && ((com.airbnb.lottie.value.a) arrayList.get(0)).c();
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> c() {
        ArrayList arrayList = this.f59631a;
        return ((com.airbnb.lottie.value.a) arrayList.get(0)).c() ? new com.airbnb.lottie.animation.keyframe.k(arrayList) : new com.airbnb.lottie.animation.keyframe.j(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final List<com.airbnb.lottie.value.a<PointF>> d() {
        return this.f59631a;
    }
}
