package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.model.DocumentData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableTextFrame.java */
/* loaded from: classes10.dex */
public class j extends p<DocumentData, DocumentData> {
    public j(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.airbnb.lottie.animation.keyframe.o c() {
        return new com.airbnb.lottie.animation.keyframe.o(this.f59655a);
    }

    @Override // com.airbnb.lottie.model.animatable.p, com.airbnb.lottie.model.animatable.o
    public final List d() {
        return this.f59655a;
    }
}
