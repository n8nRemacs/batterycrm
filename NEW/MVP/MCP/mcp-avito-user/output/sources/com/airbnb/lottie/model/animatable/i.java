package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes10.dex */
public class i implements o<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public final b f59632a;

    /* renamed from: b, reason: collision with root package name */
    public final b f59633b;

    public i(b bVar, b bVar2) {
        this.f59632a = bVar;
        this.f59633b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final boolean b() {
        return this.f59632a.b() && this.f59633b.b();
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> c() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f59632a.c(), this.f59633b.c());
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final List<com.airbnb.lottie.value.a<PointF>> d() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
