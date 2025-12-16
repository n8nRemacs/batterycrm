package com.airbnb.lottie.model.animatable;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableColorValue.java */
/* loaded from: classes10.dex */
public class a extends p<Integer, Integer> {
    public a(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> c() {
        return new com.airbnb.lottie.animation.keyframe.b(this.f59655a);
    }

    @Override // com.airbnb.lottie.model.animatable.p, com.airbnb.lottie.model.animatable.o
    public final List d() {
        return this.f59655a;
    }
}
