package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableShapeValue.java */
/* loaded from: classes10.dex */
public class h extends p<com.airbnb.lottie.model.content.j, Path> {
    public h(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.airbnb.lottie.animation.keyframe.m c() {
        return new com.airbnb.lottie.animation.keyframe.m(this.f59655a);
    }

    @Override // com.airbnb.lottie.model.animatable.p, com.airbnb.lottie.model.animatable.o
    public final List d() {
        return this.f59655a;
    }
}
