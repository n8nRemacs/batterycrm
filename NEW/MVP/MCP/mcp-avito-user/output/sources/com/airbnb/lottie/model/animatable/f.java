package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatablePointValue.java */
/* loaded from: classes10.dex */
public class f extends p<PointF, PointF> {
    public f(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> c() {
        return new com.airbnb.lottie.animation.keyframe.k(this.f59655a);
    }

    @Override // com.airbnb.lottie.model.animatable.p, com.airbnb.lottie.model.animatable.o
    public final List d() {
        return this.f59655a;
    }
}
