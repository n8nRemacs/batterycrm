package com.airbnb.lottie.model.animatable;

import java.util.List;

/* compiled from: AnimatableIntegerValue.java */
/* loaded from: classes10.dex */
public class d extends p<Integer, Integer> {
    public d(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> c() {
        return new com.airbnb.lottie.animation.keyframe.f(this.f59655a);
    }

    @Override // com.airbnb.lottie.model.animatable.p, com.airbnb.lottie.model.animatable.o
    public final List d() {
        return this.f59655a;
    }
}
