package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes10.dex */
public abstract class p<V, O> implements o<V, O> {

    /* renamed from: a, reason: collision with root package name */
    public final List<com.airbnb.lottie.value.a<V>> f59655a;

    public p(List<com.airbnb.lottie.value.a<V>> list) {
        this.f59655a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public boolean b() {
        List<com.airbnb.lottie.value.a<V>> list = this.f59655a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && list.get(0).c();
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public List<com.airbnb.lottie.value.a<V>> d() {
        return this.f59655a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<com.airbnb.lottie.value.a<V>> list = this.f59655a;
        if (!list.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(list.toArray()));
        }
        return sb2.toString();
    }
}
